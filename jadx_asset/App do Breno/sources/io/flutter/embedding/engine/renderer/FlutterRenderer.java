package io.flutter.embedding.engine.renderer;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import l2.AbstractC1388b;

/* JADX INFO: loaded from: classes.dex */
public class FlutterRenderer implements TextureRegistry {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f7800i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f7801j = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FlutterJNI f7802a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f7804c;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f7809h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicLong f7803b = new AtomicLong(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7805d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f7806e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f7807f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f7808g = new ArrayList();

    public final class ImageReaderSurfaceProducer implements TextureRegistry.SurfaceProducer, TextureRegistry.ImageConsumer, TextureRegistry.b {
        private static final boolean CLEANUP_ON_MEMORY_PRESSURE = true;
        private static final int MAX_DEQUEUED_IMAGES = 2;
        private static final int MAX_IMAGES = 7;
        private static final String TAG = "ImageReaderSurfaceProducer";
        private static final boolean VERBOSE_LOGS = false;
        private static final boolean trimOnMemoryPressure = true;
        TextureRegistry.SurfaceProducer.a callback;
        private final long id;
        private boolean released;
        private boolean ignoringFence = VERBOSE_LOGS;
        private int requestedWidth = 1;
        private int requestedHeight = 1;
        private boolean createNewReader = true;
        boolean notifiedDestroy = VERBOSE_LOGS;
        private long lastDequeueTime = 0;
        private long lastQueueTime = 0;
        private long lastScheduleTime = 0;
        private int numTrims = 0;
        private final Object lock = new Object();
        private final ArrayDeque<b> imageReaderQueue = new ArrayDeque<>();
        private final HashMap<ImageReader, b> perImageReaders = new HashMap<>();
        private ArrayList<a> lastDequeuedImage = new ArrayList<>();
        private b lastReaderDequeuedFrom = null;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Image f7810a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f7811b;

            public a(Image image, long j4) {
                this.f7810a = image;
                this.f7811b = j4;
            }
        }

        public class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ImageReader f7813a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final ArrayDeque f7814b = new ArrayDeque();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f7815c = ImageReaderSurfaceProducer.VERBOSE_LOGS;

            public b(ImageReader imageReader) {
                this.f7813a = imageReader;
                imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: io.flutter.embedding.engine.renderer.j
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        FlutterRenderer.ImageReaderSurfaceProducer.b.a(this.f7858a, imageReader2);
                    }
                }, new Handler(Looper.getMainLooper()));
            }

            public static /* synthetic */ void a(b bVar, ImageReader imageReader) {
                Image imageAcquireLatestImage;
                bVar.getClass();
                try {
                    imageAcquireLatestImage = imageReader.acquireLatestImage();
                } catch (IllegalStateException e4) {
                    AbstractC1388b.b(ImageReaderSurfaceProducer.TAG, "onImageAvailable acquireLatestImage failed: " + e4);
                    imageAcquireLatestImage = null;
                }
                if (imageAcquireLatestImage == null) {
                    return;
                }
                if (ImageReaderSurfaceProducer.this.released || bVar.f7815c) {
                    imageAcquireLatestImage.close();
                } else {
                    ImageReaderSurfaceProducer.this.onImage(imageReader, imageAcquireLatestImage);
                }
            }

            public boolean c() {
                if (!this.f7814b.isEmpty() || ImageReaderSurfaceProducer.this.lastReaderDequeuedFrom == this) {
                    return ImageReaderSurfaceProducer.VERBOSE_LOGS;
                }
                return true;
            }

            public void d() {
                this.f7815c = true;
                this.f7813a.close();
                this.f7814b.clear();
            }

            public a e() {
                if (this.f7814b.isEmpty()) {
                    return null;
                }
                return (a) this.f7814b.removeFirst();
            }

            public boolean f() {
                return this.f7814b.isEmpty();
            }

            public a g(Image image) {
                if (this.f7815c) {
                    return null;
                }
                a aVar = ImageReaderSurfaceProducer.this.new a(image, System.nanoTime());
                this.f7814b.add(aVar);
                while (this.f7814b.size() > 2) {
                    ((a) this.f7814b.removeFirst()).f7810a.close();
                }
                return aVar;
            }
        }

        public ImageReaderSurfaceProducer(long j4) {
            this.id = j4;
        }

        public static /* synthetic */ void a(ImageReaderSurfaceProducer imageReaderSurfaceProducer) {
            if (imageReaderSurfaceProducer.released) {
                return;
            }
            FlutterRenderer.this.w();
        }

        private void cleanup() {
            synchronized (this.lock) {
                try {
                    for (b bVar : this.perImageReaders.values()) {
                        if (this.lastReaderDequeuedFrom == bVar) {
                            this.lastReaderDequeuedFrom = null;
                        }
                        bVar.d();
                    }
                    this.perImageReaders.clear();
                    if (this.lastDequeuedImage.size() > 0) {
                        Iterator<a> it = this.lastDequeuedImage.iterator();
                        while (it.hasNext()) {
                            it.next().f7810a.close();
                        }
                        this.lastDequeuedImage.clear();
                    }
                    b bVar2 = this.lastReaderDequeuedFrom;
                    if (bVar2 != null) {
                        bVar2.d();
                        this.lastReaderDequeuedFrom = null;
                    }
                    this.imageReaderQueue.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private ImageReader createImageReader29() {
            return ImageReader.newInstance(this.requestedWidth, this.requestedHeight, 34, 7, 256L);
        }

        private ImageReader createImageReader33() {
            h.a();
            ImageReader.Builder builderA = io.flutter.embedding.engine.renderer.g.a(this.requestedWidth, this.requestedHeight);
            builderA.setMaxImages(7);
            builderA.setImageFormat(34);
            builderA.setUsage(256L);
            return builderA.build();
        }

        private b getActiveReader() {
            synchronized (this.lock) {
                try {
                    if (!this.createNewReader) {
                        b bVarPeekLast = this.imageReaderQueue.peekLast();
                        if (bVarPeekLast.f7813a.getSurface().isValid()) {
                            return bVarPeekLast;
                        }
                    }
                    this.createNewReader = VERBOSE_LOGS;
                    return getOrCreatePerImageReader(createImageReader());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private b getOrCreatePerImageReader(ImageReader imageReader) {
            b bVar = this.perImageReaders.get(imageReader);
            if (bVar != null) {
                return bVar;
            }
            b bVarCreatePerImageReader = createPerImageReader(imageReader);
            this.perImageReaders.put(imageReader, bVarCreatePerImageReader);
            this.imageReaderQueue.add(bVarCreatePerImageReader);
            return bVarCreatePerImageReader;
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                AbstractC1388b.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void releaseInternal() {
            cleanup();
            this.released = true;
            FlutterRenderer.this.u(this);
            FlutterRenderer.this.f7808g.remove(this);
        }

        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public Image acquireLatestImage() {
            a aVarDequeueImage = dequeueImage();
            if (aVarDequeueImage == null) {
                return null;
            }
            maybeWaitOnFence(aVarDequeueImage.f7810a);
            return aVarDequeueImage.f7810a;
        }

        public ImageReader createImageReader() {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 33) {
                return createImageReader33();
            }
            if (i4 >= 29) {
                return createImageReader29();
            }
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }

        public b createPerImageReader(ImageReader imageReader) {
            return new b(imageReader);
        }

        public double deltaMillis(long j4) {
            return j4 / 1000000.0d;
        }

        public a dequeueImage() {
            a aVar;
            boolean z3;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    aVar = null;
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        z3 = VERBOSE_LOGS;
                        if (!zHasNext) {
                            break;
                        }
                        b next = it.next();
                        a aVarE = next.e();
                        if (aVarE == null) {
                            aVar = aVarE;
                        } else {
                            while (this.lastDequeuedImage.size() > 2) {
                                this.lastDequeuedImage.remove(0).f7810a.close();
                            }
                            this.lastDequeuedImage.add(aVarE);
                            this.lastReaderDequeuedFrom = next;
                            aVar = aVarE;
                        }
                    }
                    pruneImageReaderQueue();
                    Iterator<b> it2 = this.imageReaderQueue.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!it2.next().f()) {
                            z3 = true;
                            break;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z3) {
                FlutterRenderer.this.f7806e.post(new Runnable() { // from class: io.flutter.embedding.engine.renderer.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        FlutterRenderer.ImageReaderSurfaceProducer.a(this.f7857m);
                    }
                });
            }
            return aVar;
        }

        public void disableFenceForTest() {
            this.ignoringFence = true;
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    return;
                }
                releaseInternal();
                FlutterRenderer.this.f7806e.post(new f(this.id, FlutterRenderer.this.f7802a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getForcedNewSurface() {
            this.createNewReader = true;
            return getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getHeight() {
            return this.requestedHeight;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public Surface getSurface() {
            return getActiveReader().f7813a.getSurface();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public int getWidth() {
            return this.requestedWidth;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public boolean handlesCropAndRotation() {
            return VERBOSE_LOGS;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public long id() {
            return this.id;
        }

        public int numImageReaders() {
            int size;
            synchronized (this.lock) {
                size = this.imageReaderQueue.size();
            }
            return size;
        }

        public int numImages() {
            int size;
            synchronized (this.lock) {
                try {
                    Iterator<b> it = this.imageReaderQueue.iterator();
                    size = 0;
                    while (it.hasNext()) {
                        size += it.next().f7814b.size();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return size;
        }

        public int numTrims() {
            int i4;
            synchronized (this.lock) {
                i4 = this.numTrims;
            }
            return i4;
        }

        public void onImage(ImageReader imageReader, Image image) {
            a aVarG;
            synchronized (this.lock) {
                aVarG = getOrCreatePerImageReader(imageReader).g(image);
            }
            if (aVarG == null) {
                return;
            }
            FlutterRenderer.this.w();
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i4) {
            if (i4 < 40) {
                return;
            }
            synchronized (this.lock) {
                this.numTrims++;
            }
            cleanup();
            this.createNewReader = true;
        }

        public int pendingDequeuedImages() {
            return this.lastDequeuedImage.size();
        }

        public void pruneImageReaderQueue() {
            b bVarPeekFirst;
            while (this.imageReaderQueue.size() > 1 && (bVarPeekFirst = this.imageReaderQueue.peekFirst()) != null && bVarPeekFirst.c()) {
                this.imageReaderQueue.removeFirst();
                this.perImageReaders.remove(bVarPeekFirst.f7813a);
                bVarPeekFirst.d();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void release() {
            if (this.released) {
                return;
            }
            releaseInternal();
            FlutterRenderer.this.E(this.id);
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void scheduleFrame() {
            FlutterRenderer.this.w();
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceProducer
        public void setSize(int i4, int i5) {
            int iMax = Math.max(1, i4);
            int iMax2 = Math.max(1, i5);
            if (this.requestedWidth == iMax && this.requestedHeight == iMax2) {
                return;
            }
            this.createNewReader = true;
            this.requestedHeight = iMax2;
            this.requestedWidth = iMax;
        }
    }

    public final class ImageTextureRegistryEntry implements TextureRegistry.ImageTextureEntry, TextureRegistry.ImageConsumer {
        private static final String TAG = "ImageTextureRegistryEntry";
        private final long id;
        private boolean ignoringFence = false;
        private Image image;
        private boolean released;

        public ImageTextureRegistryEntry(long j4) {
            this.id = j4;
        }

        private void maybeWaitOnFence(Image image) {
            if (image == null || this.ignoringFence) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                waitOnFence(image);
            } else {
                this.ignoringFence = true;
                AbstractC1388b.a(TAG, "ImageTextureEntry can't wait on the fence on Android < 33");
            }
        }

        private void waitOnFence(Image image) {
            try {
                image.getFence().awaitForever();
            } catch (IOException unused) {
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageConsumer
        public Image acquireLatestImage() {
            Image image;
            synchronized (this) {
                image = this.image;
                this.image = null;
            }
            maybeWaitOnFence(image);
            return image;
        }

        public void finalize() throws Throwable {
            try {
                if (this.released) {
                    super.finalize();
                    return;
                }
                Image image = this.image;
                if (image != null) {
                    image.close();
                    this.image = null;
                }
                this.released = true;
                FlutterRenderer.this.f7806e.post(new f(this.id, FlutterRenderer.this.f7802a));
                super.finalize();
            } catch (Throwable th) {
                super.finalize();
                throw th;
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public long id() {
            return this.id;
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void pushImage(Image image) {
            Image image2;
            if (this.released) {
                return;
            }
            synchronized (this) {
                image2 = this.image;
                this.image = image;
            }
            if (image2 != null) {
                AbstractC1388b.b(TAG, "Dropping PlatformView Frame");
                image2.close();
            }
            if (image != null) {
                FlutterRenderer.this.w();
            }
        }

        @Override // io.flutter.view.TextureRegistry.ImageTextureEntry
        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            Image image = this.image;
            if (image != null) {
                image.close();
                this.image = null;
            }
            FlutterRenderer.this.E(this.id);
        }
    }

    public class a implements m {
        public a() {
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void c() {
            FlutterRenderer.this.f7805d = false;
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void f() {
            FlutterRenderer.this.f7805d = true;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f7818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f7819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f7820c;

        public b(Rect rect, d dVar, c cVar) {
            this.f7818a = rect;
            this.f7819b = dVar;
            this.f7820c = cVar;
        }
    }

    public enum c {
        UNKNOWN(0),
        POSTURE_FLAT(1),
        POSTURE_HALF_OPENED(2);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f7825m;

        c(int i4) {
            this.f7825m = i4;
        }
    }

    public enum d {
        UNKNOWN(0),
        FOLD(1),
        HINGE(2),
        CUTOUT(3);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f7831m;

        d(int i4) {
            this.f7831m = i4;
        }
    }

    public final class e implements TextureRegistry.SurfaceTextureEntry, TextureRegistry.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SurfaceTextureWrapper f7833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public TextureRegistry.b f7835d;

        public e(long j4, SurfaceTexture surfaceTexture) {
            this.f7832a = j4;
            this.f7833b = new SurfaceTextureWrapper(surfaceTexture, new Runnable() { // from class: io.flutter.embedding.engine.renderer.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7859m.getClass();
                }
            });
            surfaceTexture().setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: io.flutter.embedding.engine.renderer.l
                @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                    FlutterRenderer.e.a(this.f7860a, surfaceTexture2);
                }
            }, new Handler());
        }

        public static /* synthetic */ void a(e eVar, SurfaceTexture surfaceTexture) {
            if (eVar.f7834c || !FlutterRenderer.this.f7802a.isAttached()) {
                return;
            }
            eVar.f7833b.markDirty();
            FlutterRenderer.this.w();
        }

        public final void c() {
            FlutterRenderer.this.u(this);
        }

        public SurfaceTextureWrapper d() {
            return this.f7833b;
        }

        public void finalize() throws Throwable {
            try {
                if (this.f7834c) {
                    return;
                }
                FlutterRenderer.this.f7806e.post(new f(this.f7832a, FlutterRenderer.this.f7802a));
            } finally {
                super.finalize();
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public long id() {
            return this.f7832a;
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i4) {
            TextureRegistry.b bVar = this.f7835d;
            if (bVar != null) {
                bVar.onTrimMemory(i4);
            }
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void release() {
            if (this.f7834c) {
                return;
            }
            AbstractC1388b.f("FlutterRenderer", "Releasing a SurfaceTexture (" + this.f7832a + ").");
            this.f7833b.release();
            FlutterRenderer.this.E(this.f7832a);
            c();
            this.f7834c = true;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnFrameConsumedListener(TextureRegistry.a aVar) {
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public void setOnTrimMemoryListener(TextureRegistry.b bVar) {
            this.f7835d = bVar;
        }

        @Override // io.flutter.view.TextureRegistry.SurfaceTextureEntry
        public SurfaceTexture surfaceTexture() {
            return this.f7833b.surfaceTexture();
        }
    }

    public static final class f implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f7837m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final FlutterJNI f7838n;

        public f(long j4, FlutterJNI flutterJNI) {
            this.f7837m = j4;
            this.f7838n = flutterJNI;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f7838n.isAttached()) {
                AbstractC1388b.f("FlutterRenderer", "Releasing a Texture (" + this.f7837m + ").");
                this.f7838n.unregisterTexture(this.f7837m);
            }
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f7839a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f7840b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7841c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7842d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7843e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7844f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7845g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7846h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7847i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f7848j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f7849k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f7850l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f7851m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7852n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7853o = 0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7854p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final List f7855q = new ArrayList();

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final List f7856r = new ArrayList();

        public void c(List list) {
            this.f7856r.clear();
            this.f7856r.addAll(list);
        }

        public void d(List list) {
            this.f7855q.clear();
            this.f7855q.addAll(list);
        }

        public boolean e() {
            return this.f7840b > 0 && this.f7841c > 0 && this.f7839a > 0.0f;
        }
    }

    public FlutterRenderer(FlutterJNI flutterJNI) {
        a aVar = new a();
        this.f7809h = aVar;
        this.f7802a = flutterJNI;
        flutterJNI.addIsDisplayingFlutterUiListener(aVar);
    }

    public void A() {
        if (this.f7804c != null) {
            this.f7802a.onSurfaceDestroyed();
            if (this.f7805d) {
                this.f7809h.c();
            }
            this.f7805d = false;
            this.f7804c = null;
        }
    }

    public void B(int i4, int i5) {
        this.f7802a.onSurfaceChanged(i4, i5);
    }

    public void C(Surface surface) {
        this.f7804c = surface;
        this.f7802a.onSurfaceWindowChanged(surface);
    }

    public final void D(int[] iArr, int i4, Rect rect) {
        iArr[i4] = rect.left;
        iArr[i4 + 1] = rect.top;
        iArr[i4 + 2] = rect.right;
        iArr[i4 + 3] = rect.bottom;
    }

    public final void E(long j4) {
        this.f7802a.unregisterTexture(j4);
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.ImageTextureEntry a() {
        ImageTextureRegistryEntry imageTextureRegistryEntry = new ImageTextureRegistryEntry(this.f7803b.getAndIncrement());
        AbstractC1388b.f("FlutterRenderer", "New ImageTextureEntry ID: " + imageTextureRegistryEntry.id());
        p(imageTextureRegistryEntry.id(), imageTextureRegistryEntry, false);
        return imageTextureRegistryEntry;
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceTextureEntry b() {
        AbstractC1388b.f("FlutterRenderer", "Creating a SurfaceTexture.");
        return r(new SurfaceTexture(0));
    }

    @Override // io.flutter.view.TextureRegistry
    public TextureRegistry.SurfaceProducer c(TextureRegistry.c cVar) {
        if (f7800i || Build.VERSION.SDK_INT < 29) {
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntryB = b();
            o oVar = new o(surfaceTextureEntryB.id(), this.f7806e, this.f7802a, surfaceTextureEntryB);
            AbstractC1388b.f("FlutterRenderer", "New SurfaceTextureSurfaceProducer ID: " + surfaceTextureEntryB.id());
            return oVar;
        }
        long andIncrement = this.f7803b.getAndIncrement();
        ImageReaderSurfaceProducer imageReaderSurfaceProducer = new ImageReaderSurfaceProducer(andIncrement);
        boolean z3 = cVar == TextureRegistry.c.resetInBackground;
        p(andIncrement, imageReaderSurfaceProducer, z3);
        if (z3) {
            j(imageReaderSurfaceProducer);
        }
        this.f7808g.add(imageReaderSurfaceProducer);
        AbstractC1388b.f("FlutterRenderer", "New ImageReaderSurfaceProducer ID: " + andIncrement);
        return imageReaderSurfaceProducer;
    }

    public void i(m mVar) {
        this.f7802a.addIsDisplayingFlutterUiListener(mVar);
        if (this.f7805d) {
            mVar.f();
        }
    }

    public void j(TextureRegistry.b bVar) {
        k();
        this.f7807f.add(new WeakReference(bVar));
    }

    public final void k() {
        Iterator it = this.f7807f.iterator();
        while (it.hasNext()) {
            if (((TextureRegistry.b) ((WeakReference) it.next()).get()) == null) {
                it.remove();
            }
        }
    }

    public void l(ByteBuffer byteBuffer, int i4) {
        this.f7802a.dispatchPointerDataPacket(byteBuffer, i4);
    }

    public boolean m() {
        return this.f7805d;
    }

    public boolean n() {
        return this.f7802a.getIsSoftwareRenderingEnabled();
    }

    public void o(int i4) {
        Iterator it = this.f7807f.iterator();
        while (it.hasNext()) {
            TextureRegistry.b bVar = (TextureRegistry.b) ((WeakReference) it.next()).get();
            if (bVar != null) {
                bVar.onTrimMemory(i4);
            } else {
                it.remove();
            }
        }
    }

    public final void p(long j4, TextureRegistry.ImageConsumer imageConsumer, boolean z3) {
        this.f7802a.registerImageTexture(j4, imageConsumer, z3);
    }

    public final TextureRegistry.SurfaceTextureEntry q(long j4, SurfaceTexture surfaceTexture) {
        surfaceTexture.detachFromGLContext();
        e eVar = new e(j4, surfaceTexture);
        AbstractC1388b.f("FlutterRenderer", "New SurfaceTexture ID: " + eVar.id());
        s(eVar.id(), eVar.d());
        j(eVar);
        return eVar;
    }

    public TextureRegistry.SurfaceTextureEntry r(SurfaceTexture surfaceTexture) {
        return q(this.f7803b.getAndIncrement(), surfaceTexture);
    }

    public final void s(long j4, SurfaceTextureWrapper surfaceTextureWrapper) {
        this.f7802a.registerTexture(j4, surfaceTextureWrapper);
    }

    public void t(m mVar) {
        this.f7802a.removeIsDisplayingFlutterUiListener(mVar);
    }

    public void u(TextureRegistry.b bVar) {
        for (WeakReference weakReference : this.f7807f) {
            if (weakReference.get() == bVar) {
                this.f7807f.remove(weakReference);
                return;
            }
        }
    }

    public void v() {
        AbstractC1388b.f("FlutterRenderer", "restoreSurfaceProducers called; notifying SurfaceProducers");
        Iterator it = this.f7808g.iterator();
        while (it.hasNext()) {
            ((ImageReaderSurfaceProducer) it.next()).getClass();
        }
    }

    public void w() {
        this.f7802a.scheduleFrame();
    }

    public void x(boolean z3) {
        this.f7802a.setSemanticsEnabled(z3);
    }

    public void y(g gVar) {
        if (gVar.e()) {
            AbstractC1388b.f("FlutterRenderer", "Setting viewport metrics\nSize: " + gVar.f7840b + " x " + gVar.f7841c + "\nPadding - L: " + gVar.f7845g + ", T: " + gVar.f7842d + ", R: " + gVar.f7843e + ", B: " + gVar.f7844f + "\nInsets - L: " + gVar.f7849k + ", T: " + gVar.f7846h + ", R: " + gVar.f7847i + ", B: " + gVar.f7848j + "\nSystem Gesture Insets - L: " + gVar.f7853o + ", T: " + gVar.f7850l + ", R: " + gVar.f7851m + ", B: " + gVar.f7851m + "\nDisplay Features: " + gVar.f7855q.size() + "\nDisplay Cutouts: " + gVar.f7856r.size());
            int size = gVar.f7855q.size() + gVar.f7856r.size();
            int[] iArr = new int[size * 4];
            int[] iArr2 = new int[size];
            int[] iArr3 = new int[size];
            for (int i4 = 0; i4 < gVar.f7855q.size(); i4++) {
                b bVar = (b) gVar.f7855q.get(i4);
                D(iArr, i4 * 4, bVar.f7818a);
                iArr2[i4] = bVar.f7819b.f7831m;
                iArr3[i4] = bVar.f7820c.f7825m;
            }
            int size2 = gVar.f7855q.size() * 4;
            for (int i5 = 0; i5 < gVar.f7856r.size(); i5++) {
                b bVar2 = (b) gVar.f7856r.get(i5);
                D(iArr, (i5 * 4) + size2, bVar2.f7818a);
                iArr2[gVar.f7855q.size() + i5] = bVar2.f7819b.f7831m;
                iArr3[gVar.f7855q.size() + i5] = bVar2.f7820c.f7825m;
            }
            this.f7802a.setViewportMetrics(gVar.f7839a, gVar.f7840b, gVar.f7841c, gVar.f7842d, gVar.f7843e, gVar.f7844f, gVar.f7845g, gVar.f7846h, gVar.f7847i, gVar.f7848j, gVar.f7849k, gVar.f7850l, gVar.f7851m, gVar.f7852n, gVar.f7853o, gVar.f7854p, iArr, iArr2, iArr3);
        }
    }

    public void z(Surface surface, boolean z3) {
        if (!z3) {
            A();
        }
        this.f7804c = surface;
        if (z3) {
            this.f7802a.onSurfaceWindowChanged(surface);
        } else {
            this.f7802a.onSurfaceCreated(surface);
        }
    }
}
