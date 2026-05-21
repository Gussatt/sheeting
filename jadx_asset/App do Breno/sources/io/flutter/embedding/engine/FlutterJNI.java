package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import android.view.SurfaceControl;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.a;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.SurfaceTextureWrapper;
import io.flutter.embedding.engine.renderer.m;
import io.flutter.plugin.platform.C1090w;
import io.flutter.plugin.platform.P;
import io.flutter.view.FlutterCallbackInformation;
import io.flutter.view.TextureRegistry;
import io.flutter.view.h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import l2.AbstractC1388b;
import o2.f;
import p2.InterfaceC1487a;
import v2.y;
import w2.C1621n;
import x0.AbstractC1628c;
import x2.C1643d;

/* JADX INFO: loaded from: classes.dex */
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static b asyncWaitForVsyncDelegate = null;
    private static float displayDensity = -1.0f;
    private static float displayHeight = -1.0f;
    private static float displayWidth = -1.0f;
    private static boolean initCalled = false;
    private static boolean loadLibraryCalled = false;
    private static boolean prefetchDefaultFontManagerCalled = false;
    private static float refreshRateFPS = 60.0f;
    private static String vmServiceUri;
    private a accessibilityDelegate;
    private InterfaceC1487a deferredComponentManager;
    private C1643d localizationPlugin;
    private Long nativeShellHolderId;
    private f platformMessageHandler;
    private C1090w platformViewsController;
    private P platformViewsController2;
    private ReentrantReadWriteLock shellHolderLock = new ReentrantReadWriteLock();
    private final Set<a.b> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<m> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();

    public interface a {
        void b(String str);

        void c(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr);

        void d(ByteBuffer byteBuffer, String[] strArr);
    }

    public interface b {
        void a(long j4);
    }

    public static class c {
        public FlutterJNI a() {
            return new FlutterJNI();
        }
    }

    private static void asyncWaitForVsync(long j4) {
        b bVar = asyncWaitForVsyncDelegate;
        if (bVar == null) {
            throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
        }
        bVar.a(j4);
    }

    public static /* synthetic */ void b(long j4, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        imageDecoder.setAllocator(1);
        Size size = imageInfo.getSize();
        nativeImageHeaderCallback(j4, size.getWidth(), size.getHeight());
    }

    public static Bitmap decodeImage(ByteBuffer byteBuffer, final long j4) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                return ImageDecoder.decodeBitmap(ImageDecoder.createSource(byteBuffer), new ImageDecoder.OnHeaderDecodedListener() { // from class: n2.j
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        FlutterJNI.b(j4, imageDecoder, imageInfo, source);
                    }
                });
            } catch (IOException e4) {
                AbstractC1388b.c(TAG, "Failed to decode image", e4);
            }
        }
        return null;
    }

    private void ensureAttachedToNative() {
        if (this.nativeShellHolderId == null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
        }
    }

    private void ensureNotAttachedToNative() {
        if (this.nativeShellHolderId != null) {
            throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
        }
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        throw new RuntimeException("Methods marked with @UiThread must be executed on the main thread. Current thread: " + Thread.currentThread().getName());
    }

    public static String getVMServiceUri() {
        return vmServiceUri;
    }

    private void handlePlatformMessageResponse(int i4, ByteBuffer byteBuffer) {
        f fVar = this.platformMessageHandler;
        if (fVar != null) {
            fVar.f(i4, byteBuffer);
        }
    }

    private native long nativeAttach(FlutterJNI flutterJNI);

    private native void nativeCleanupMessageData(long j4);

    private native void nativeDeferredComponentInstallFailure(int i4, String str, boolean z3);

    private native void nativeDestroy(long j4);

    private native void nativeDispatchEmptyPlatformMessage(long j4, String str, int i4);

    private native void nativeDispatchPlatformMessage(long j4, String str, ByteBuffer byteBuffer, int i4, int i5);

    private native void nativeDispatchPointerDataPacket(long j4, ByteBuffer byteBuffer, int i4);

    private native void nativeDispatchSemanticsAction(long j4, int i4, int i5, ByteBuffer byteBuffer, int i6);

    private native boolean nativeFlutterTextUtilsIsEmoji(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifier(int i4);

    private native boolean nativeFlutterTextUtilsIsEmojiModifierBase(int i4);

    private native boolean nativeFlutterTextUtilsIsRegionalIndicator(int i4);

    private native boolean nativeFlutterTextUtilsIsVariationSelector(int i4);

    private native Bitmap nativeGetBitmap(long j4);

    private native boolean nativeGetIsSoftwareRenderingEnabled();

    public static native void nativeImageHeaderCallback(long j4, int i4, int i5);

    private static native void nativeInit(Context context, String[] strArr, String str, String str2, String str3, long j4, int i4);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long j4, int i4);

    private native void nativeInvokePlatformMessageResponseCallback(long j4, int i4, ByteBuffer byteBuffer, int i5);

    private native boolean nativeIsSurfaceControlEnabled(long j4);

    private native void nativeLoadDartDeferredLibrary(long j4, int i4, String[] strArr);

    @Deprecated
    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long j4);

    private native void nativeMarkTextureFrameAvailable(long j4, long j5);

    private native void nativeNotifyLowMemoryWarning(long j4);

    private native void nativeOnVsync(long j4, long j5, long j6);

    private static native void nativePrefetchDefaultFontManager();

    private native void nativeRegisterImageTexture(long j4, long j5, WeakReference<TextureRegistry.ImageConsumer> weakReference, boolean z3);

    private native void nativeRegisterTexture(long j4, long j5, WeakReference<SurfaceTextureWrapper> weakReference);

    private native void nativeRunBundleAndSnapshotFromLibrary(long j4, String str, String str2, String str3, AssetManager assetManager, List<String> list, long j5);

    private native void nativeScheduleFrame(long j4);

    private native void nativeSetAccessibilityFeatures(long j4, int i4);

    private native void nativeSetSemanticsEnabled(long j4, boolean z3);

    private native void nativeSetViewportMetrics(long j4, float f4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3);

    private native FlutterJNI nativeSpawn(long j4, String str, String str2, String str3, List<String> list, long j5);

    private native void nativeSurfaceChanged(long j4, int i4, int i5);

    private native void nativeSurfaceCreated(long j4, Surface surface);

    private native void nativeSurfaceDestroyed(long j4);

    private native void nativeSurfaceWindowChanged(long j4, Surface surface);

    private native void nativeUnregisterTexture(long j4, long j5);

    private native void nativeUpdateDisplayMetrics(long j4);

    private native void nativeUpdateJavaAssetManager(long j4, AssetManager assetManager, String str);

    private native void nativeUpdateRefreshRate(float f4);

    private void onPreEngineRestart() {
        Iterator<a.b> it = this.engineLifecycleListeners.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    private void setApplicationLocale(String str) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] strArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.d(byteBuffer, strArr);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        ensureRunningOnMainThread();
        a aVar = this.accessibilityDelegate;
        if (aVar != null) {
            aVar.c(byteBuffer, strArr, byteBufferArr);
        }
    }

    public boolean IsSurfaceControlEnabled() {
        return nativeIsSurfaceControlEnabled(this.nativeShellHolderId.longValue());
    }

    public void addEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.add(bVar);
    }

    public void addIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add(mVar);
    }

    public void applyTransactions() {
        P p4 = this.platformViewsController2;
        if (p4 == null) {
            throw new RuntimeException("");
        }
        p4.e();
    }

    public void attachToNative() {
        ensureRunningOnMainThread();
        ensureNotAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            this.nativeShellHolderId = Long.valueOf(performNativeAttach(this));
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void cleanupMessageData(long j4) {
        nativeCleanupMessageData(j4);
    }

    public String[] computePlatformResolvedLocale(String[] strArr) {
        if (this.localizationPlugin == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < strArr.length; i4 += 3) {
            String str = strArr[i4];
            String str2 = strArr[i4 + 1];
            String str3 = strArr[i4 + 2];
            Locale.Builder builder = new Locale.Builder();
            if (!str.isEmpty()) {
                builder.setLanguage(str);
            }
            if (!str2.isEmpty()) {
                builder.setRegion(str2);
            }
            if (!str3.isEmpty()) {
                builder.setScript(str3);
            }
            arrayList.add(builder.build());
        }
        Locale localeC = this.localizationPlugin.c(arrayList);
        return localeC == null ? new String[0] : new String[]{localeC.getLanguage(), localeC.getCountry(), localeC.getScript()};
    }

    public FlutterOverlaySurface createOverlaySurface() {
        ensureRunningOnMainThread();
        C1090w c1090w = this.platformViewsController;
        if (c1090w != null) {
            return c1090w.K();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public FlutterOverlaySurface createOverlaySurface2() {
        P p4 = this.platformViewsController2;
        if (p4 != null) {
            return p4.o();
        }
        throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
    }

    public SurfaceControl.Transaction createTransaction() {
        P p4 = this.platformViewsController2;
        if (p4 != null) {
            return p4.p();
        }
        throw new RuntimeException("");
    }

    public void deferredComponentInstallFailure(int i4, String str, boolean z3) {
        ensureRunningOnMainThread();
        nativeDeferredComponentInstallFailure(i4, str, z3);
    }

    public void destroyOverlaySurface2() {
        ensureRunningOnMainThread();
        P p4 = this.platformViewsController2;
        if (p4 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        p4.q();
    }

    public void destroyOverlaySurfaces() {
        ensureRunningOnMainThread();
        C1090w c1090w = this.platformViewsController;
        if (c1090w == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        c1090w.N();
    }

    public void detachFromNativeAndReleaseResources() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        this.shellHolderLock.writeLock().lock();
        try {
            nativeDestroy(this.nativeShellHolderId.longValue());
            this.nativeShellHolderId = null;
        } finally {
            this.shellHolderLock.writeLock().unlock();
        }
    }

    public void dispatchEmptyPlatformMessage(String str, int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchEmptyPlatformMessage(this.nativeShellHolderId.longValue(), str, i4);
            return;
        }
        AbstractC1388b.g(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i4);
    }

    public void dispatchPlatformMessage(String str, ByteBuffer byteBuffer, int i4, int i5) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            nativeDispatchPlatformMessage(this.nativeShellHolderId.longValue(), str, byteBuffer, i4, i5);
            return;
        }
        AbstractC1388b.g(TAG, "Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: " + str + ". Response ID: " + i5);
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int i4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchPointerDataPacket(this.nativeShellHolderId.longValue(), byteBuffer, i4);
    }

    public void dispatchSemanticsAction(int i4, h.g gVar) {
        dispatchSemanticsAction(i4, gVar, null);
    }

    public void endFrame2() {
        P p4 = this.platformViewsController2;
        if (p4 == null) {
            throw new RuntimeException("");
        }
        p4.B();
    }

    public Bitmap getBitmap() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        return nativeGetBitmap(this.nativeShellHolderId.longValue());
    }

    public boolean getIsSoftwareRenderingEnabled() {
        return nativeGetIsSoftwareRenderingEnabled();
    }

    public float getScaledFontSize(float f4, int i4) {
        DisplayMetrics displayMetricsB = y.b(i4);
        if (displayMetricsB != null) {
            return TypedValue.applyDimension(2, f4, displayMetricsB) / displayMetricsB.density;
        }
        AbstractC1388b.b(TAG, "getScaledFontSize called with configurationId " + String.valueOf(i4) + ", which can't be found.");
        return -1.0f;
    }

    public void handlePlatformMessage(String str, ByteBuffer byteBuffer, int i4, long j4) {
        f fVar = this.platformMessageHandler;
        if (fVar != null) {
            fVar.g(str, byteBuffer, i4, j4);
        } else {
            nativeCleanupMessageData(j4);
        }
    }

    public void hideOverlaySurface2() {
        P p4 = this.platformViewsController2;
        if (p4 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        p4.v();
    }

    public void init(Context context, String[] strArr, String str, String str2, String str3, long j4, int i4) {
        if (initCalled) {
            AbstractC1388b.g(TAG, "FlutterJNI.init called more than once");
        }
        nativeInit(context, strArr, str, str2, str3, j4, i4);
        initCalled = true;
    }

    public void invokePlatformMessageEmptyResponseCallback(int i4) {
        this.shellHolderLock.readLock().lock();
        try {
            if (isAttached()) {
                nativeInvokePlatformMessageEmptyResponseCallback(this.nativeShellHolderId.longValue(), i4);
            } else {
                AbstractC1388b.g(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
            }
            this.shellHolderLock.readLock().unlock();
        } catch (Throwable th) {
            this.shellHolderLock.readLock().unlock();
            throw th;
        }
    }

    public void invokePlatformMessageResponseCallback(int i4, ByteBuffer byteBuffer, int i5) throws Throwable {
        FlutterJNI flutterJNI;
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("Expected a direct ByteBuffer.");
        }
        this.shellHolderLock.readLock().lock();
        try {
            try {
                if (isAttached()) {
                    flutterJNI = this;
                    flutterJNI.nativeInvokePlatformMessageResponseCallback(this.nativeShellHolderId.longValue(), i4, byteBuffer, i5);
                } else {
                    flutterJNI = this;
                    AbstractC1388b.g(TAG, "Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: " + i4);
                }
                flutterJNI.shellHolderLock.readLock().unlock();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                flutterJNI.shellHolderLock.readLock().unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            flutterJNI = this;
        }
    }

    public boolean isAttached() {
        return this.nativeShellHolderId != null;
    }

    public boolean isCodePointEmoji(int i4) {
        return nativeFlutterTextUtilsIsEmoji(i4);
    }

    public boolean isCodePointEmojiModifier(int i4) {
        return nativeFlutterTextUtilsIsEmojiModifier(i4);
    }

    public boolean isCodePointEmojiModifierBase(int i4) {
        return nativeFlutterTextUtilsIsEmojiModifierBase(i4);
    }

    public boolean isCodePointRegionalIndicator(int i4) {
        return nativeFlutterTextUtilsIsRegionalIndicator(i4);
    }

    public boolean isCodePointVariantSelector(int i4) {
        return nativeFlutterTextUtilsIsVariationSelector(i4);
    }

    public void loadDartDeferredLibrary(int i4, String[] strArr) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeLoadDartDeferredLibrary(this.nativeShellHolderId.longValue(), i4, strArr);
    }

    public void loadLibrary(Context context) {
        if (loadLibraryCalled) {
            AbstractC1388b.g(TAG, "FlutterJNI.loadLibrary called more than once");
        }
        AbstractC1628c.a(new AbstractC1628c.d() { // from class: n2.i
            @Override // x0.AbstractC1628c.d
            public final void a(String str) {
                AbstractC1388b.a(FlutterJNI.TAG, str);
            }
        }).e(context, "flutter");
        loadLibraryCalled = true;
    }

    public void markTextureFrameAvailable(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeMarkTextureFrameAvailable(this.nativeShellHolderId.longValue(), j4);
    }

    public void notifyLowMemoryWarning() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeNotifyLowMemoryWarning(this.nativeShellHolderId.longValue());
    }

    public void onBeginFrame() {
        ensureRunningOnMainThread();
        C1090w c1090w = this.platformViewsController;
        if (c1090w == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to begin the frame");
        }
        c1090w.d0();
    }

    public void onDisplayOverlaySurface(int i4, int i5, int i6, int i7, int i8) {
        ensureRunningOnMainThread();
        C1090w c1090w = this.platformViewsController;
        if (c1090w == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position an overlay surface");
        }
        c1090w.f0(i4, i5, i6, i7, i8);
    }

    public void onDisplayPlatformView(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        C1090w c1090w = this.platformViewsController;
        if (c1090w == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        c1090w.g0(i4, i5, i6, i7, i8, i9, i10, flutterMutatorsStack);
    }

    public void onDisplayPlatformView2(int i4, int i5, int i6, int i7, int i8, int i9, int i10, FlutterMutatorsStack flutterMutatorsStack) {
        ensureRunningOnMainThread();
        P p4 = this.platformViewsController2;
        if (p4 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to position a platform view");
        }
        p4.A(i4, i5, i6, i7, i8, i9, i10, flutterMutatorsStack);
    }

    public void onEndFrame() {
        ensureRunningOnMainThread();
        C1090w c1090w = this.platformViewsController;
        if (c1090w == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to end the frame");
        }
        c1090w.h0();
    }

    public void onFirstFrame() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public void onRenderingStopped() {
        ensureRunningOnMainThread();
        Iterator<m> it = this.flutterUiDisplayListeners.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public void onSurfaceChanged(int i4, int i5) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceChanged(this.nativeShellHolderId.longValue(), i4, i5);
    }

    public void onSurfaceCreated(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceCreated(this.nativeShellHolderId.longValue(), surface);
    }

    public void onSurfaceDestroyed() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        onRenderingStopped();
        nativeSurfaceDestroyed(this.nativeShellHolderId.longValue());
    }

    public void onSurfaceWindowChanged(Surface surface) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSurfaceWindowChanged(this.nativeShellHolderId.longValue(), surface);
    }

    public void onVsync(long j4, long j5, long j6) {
        nativeOnVsync(j4, j5, j6);
    }

    public long performNativeAttach(FlutterJNI flutterJNI) {
        return nativeAttach(flutterJNI);
    }

    public void prefetchDefaultFontManager() {
        if (prefetchDefaultFontManagerCalled) {
            AbstractC1388b.g(TAG, "FlutterJNI.prefetchDefaultFontManager called more than once");
        }
        nativePrefetchDefaultFontManager();
        prefetchDefaultFontManagerCalled = true;
    }

    public void registerImageTexture(long j4, TextureRegistry.ImageConsumer imageConsumer, boolean z3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterImageTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference<>(imageConsumer), z3);
    }

    public void registerTexture(long j4, SurfaceTextureWrapper surfaceTextureWrapper) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRegisterTexture(this.nativeShellHolderId.longValue(), j4, new WeakReference<>(surfaceTextureWrapper));
    }

    public void removeEngineLifecycleListener(a.b bVar) {
        ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove(bVar);
    }

    public void removeIsDisplayingFlutterUiListener(m mVar) {
        ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove(mVar);
    }

    public void requestDartDeferredLibrary(int i4) {
        AbstractC1388b.b(TAG, "No DeferredComponentManager found. Android setup must be completed before using split AOT deferred components.");
    }

    public void runBundleAndSnapshotFromLibrary(String str, String str2, String str3, AssetManager assetManager, List<String> list, long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeRunBundleAndSnapshotFromLibrary(this.nativeShellHolderId.longValue(), str, str2, str3, assetManager, list, j4);
    }

    public void scheduleFrame() {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeScheduleFrame(this.nativeShellHolderId.longValue());
    }

    public void setAccessibilityDelegate(a aVar) {
        ensureRunningOnMainThread();
        this.accessibilityDelegate = aVar;
    }

    public void setAccessibilityFeatures(int i4) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setAccessibilityFeaturesInNative(i4);
        }
    }

    public void setAccessibilityFeaturesInNative(int i4) {
        nativeSetAccessibilityFeatures(this.nativeShellHolderId.longValue(), i4);
    }

    public void setAsyncWaitForVsyncDelegate(b bVar) {
        asyncWaitForVsyncDelegate = bVar;
    }

    public void setDeferredComponentManager(InterfaceC1487a interfaceC1487a) {
        ensureRunningOnMainThread();
        if (interfaceC1487a != null) {
            interfaceC1487a.a(this);
        }
    }

    public void setLocalizationPlugin(C1643d c1643d) {
        ensureRunningOnMainThread();
        this.localizationPlugin = c1643d;
    }

    public void setPlatformMessageHandler(f fVar) {
        ensureRunningOnMainThread();
        this.platformMessageHandler = fVar;
    }

    public void setPlatformViewsController(C1090w c1090w) {
        ensureRunningOnMainThread();
        this.platformViewsController = c1090w;
    }

    public void setPlatformViewsController2(P p4) {
        ensureRunningOnMainThread();
        this.platformViewsController2 = p4;
    }

    public void setRefreshRateFPS(float f4) {
        refreshRateFPS = f4;
        updateRefreshRate();
    }

    public void setSemanticsEnabled(boolean z3) {
        ensureRunningOnMainThread();
        if (isAttached()) {
            setSemanticsEnabledInNative(z3);
        }
    }

    public void setSemanticsEnabledInNative(boolean z3) {
        nativeSetSemanticsEnabled(this.nativeShellHolderId.longValue(), z3);
    }

    public void setViewportMetrics(float f4, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeSetViewportMetrics(this.nativeShellHolderId.longValue(), f4, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, iArr, iArr2, iArr3);
    }

    public void showOverlaySurface2() {
        P p4 = this.platformViewsController2;
        if (p4 == null) {
            throw new RuntimeException("platformViewsController must be set before attempting to destroy an overlay surface");
        }
        p4.J();
    }

    public FlutterJNI spawn(String str, String str2, String str3, List<String> list, long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        FlutterJNI flutterJNINativeSpawn = nativeSpawn(this.nativeShellHolderId.longValue(), str, str2, str3, list, j4);
        Long l4 = flutterJNINativeSpawn.nativeShellHolderId;
        I2.c.a((l4 == null || l4.longValue() == 0) ? false : true, "Failed to spawn new JNI connected shell from existing shell.");
        return flutterJNINativeSpawn;
    }

    public void swapTransactions() {
        P p4 = this.platformViewsController2;
        if (p4 == null) {
            throw new RuntimeException("");
        }
        p4.K();
    }

    public void unregisterTexture(long j4) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUnregisterTexture(this.nativeShellHolderId.longValue(), j4);
    }

    public void updateDisplayMetrics(int i4, float f4, float f5, float f6) {
        displayWidth = f4;
        displayHeight = f5;
        displayDensity = f6;
        if (loadLibraryCalled) {
            nativeUpdateDisplayMetrics(this.nativeShellHolderId.longValue());
        }
    }

    public void updateJavaAssetManager(AssetManager assetManager, String str) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeUpdateJavaAssetManager(this.nativeShellHolderId.longValue(), assetManager, str);
    }

    public void updateRefreshRate() {
        if (loadLibraryCalled) {
            nativeUpdateRefreshRate(refreshRateFPS);
        }
    }

    public void dispatchSemanticsAction(int i4, h.g gVar, Object obj) {
        ByteBuffer byteBufferA;
        int iPosition;
        ensureAttachedToNative();
        if (obj != null) {
            byteBufferA = C1621n.f11891a.a(obj);
            iPosition = byteBufferA.position();
        } else {
            byteBufferA = null;
            iPosition = 0;
        }
        dispatchSemanticsAction(i4, gVar.f8170m, byteBufferA, iPosition);
    }

    public void dispatchSemanticsAction(int i4, int i5, ByteBuffer byteBuffer, int i6) {
        ensureRunningOnMainThread();
        ensureAttachedToNative();
        nativeDispatchSemanticsAction(this.nativeShellHolderId.longValue(), i4, i5, byteBuffer, i6);
    }
}
