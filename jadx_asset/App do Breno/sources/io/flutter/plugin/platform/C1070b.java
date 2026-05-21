package io.flutter.plugin.platform;

import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.view.TextureRegistry;
import l2.AbstractC1388b;

/* JADX INFO: renamed from: io.flutter.plugin.platform.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1070b implements InterfaceC1083o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextureRegistry.ImageTextureEntry f7989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageReader f7990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7991c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7992d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f7993e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ImageReader.OnImageAvailableListener f7994f = new a();

    /* JADX INFO: renamed from: io.flutter.plugin.platform.b$a */
    public class a implements ImageReader.OnImageAvailableListener {
        public a() {
        }

        @Override // android.media.ImageReader.OnImageAvailableListener
        public void onImageAvailable(ImageReader imageReader) {
            Image imageAcquireLatestImage;
            try {
                imageAcquireLatestImage = imageReader.acquireLatestImage();
            } catch (IllegalStateException e4) {
                AbstractC1388b.b("ImageReaderPlatformViewRenderTarget", "onImageAvailable acquireLatestImage failed: " + e4);
                imageAcquireLatestImage = null;
            }
            if (imageAcquireLatestImage == null) {
                return;
            }
            C1070b.this.f7989a.pushImage(imageAcquireLatestImage);
        }
    }

    public C1070b(TextureRegistry.ImageTextureEntry imageTextureEntry) {
        if (Build.VERSION.SDK_INT < 29) {
            throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
        }
        this.f7989a = imageTextureEntry;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public long a() {
        return this.f7989a.id();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public void b(int i4, int i5) {
        if (this.f7990b != null && this.f7991c == i4 && this.f7992d == i5) {
            return;
        }
        d();
        this.f7991c = i4;
        this.f7992d = i5;
        this.f7990b = e();
    }

    public final void d() {
        if (this.f7990b != null) {
            this.f7989a.pushImage(null);
            this.f7990b.close();
            this.f7990b = null;
        }
    }

    public ImageReader e() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            return g();
        }
        if (i4 >= 29) {
            return f();
        }
        throw new UnsupportedOperationException("ImageReaderPlatformViewRenderTarget requires API version 29+");
    }

    public ImageReader f() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance(this.f7991c, this.f7992d, 34, 4, 256L);
        imageReaderNewInstance.setOnImageAvailableListener(this.f7994f, this.f7993e);
        return imageReaderNewInstance;
    }

    public ImageReader g() {
        io.flutter.embedding.engine.renderer.h.a();
        ImageReader.Builder builderA = io.flutter.embedding.engine.renderer.g.a(this.f7991c, this.f7992d);
        builderA.setMaxImages(4);
        builderA.setImageFormat(34);
        builderA.setUsage(256L);
        ImageReader imageReaderBuild = builderA.build();
        imageReaderBuild.setOnImageAvailableListener(this.f7994f, this.f7993e);
        return imageReaderBuild;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public int getHeight() {
        return this.f7992d;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public Surface getSurface() {
        return this.f7990b.getSurface();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public int getWidth() {
        return this.f7991c;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public void release() {
        d();
        this.f7989a = null;
    }
}
