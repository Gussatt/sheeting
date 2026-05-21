package io.flutter.embedding.engine.renderer;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes.dex */
public final class o implements TextureRegistry.SurfaceProducer, TextureRegistry.GLTextureConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f7865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextureRegistry.SurfaceTextureEntry f7866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f7867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final FlutterJNI f7868h;

    public o(long j4, Handler handler, FlutterJNI flutterJNI, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        this.f7861a = j4;
        this.f7867g = handler;
        this.f7868h = flutterJNI;
        this.f7866f = surfaceTextureEntry;
    }

    public Surface a(SurfaceTexture surfaceTexture) {
        return new Surface(surfaceTexture);
    }

    public void finalize() throws Throwable {
        try {
            if (this.f7864d) {
                return;
            }
            release();
            this.f7867g.post(new FlutterRenderer.f(this.f7861a, this.f7868h));
        } finally {
            super.finalize();
        }
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public Surface getForcedNewSurface() {
        this.f7865e = null;
        return getSurface();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getHeight() {
        return this.f7863c;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public Surface getSurface() {
        Surface surface = this.f7865e;
        if (surface == null || !surface.isValid()) {
            this.f7865e = a(this.f7866f.surfaceTexture());
        }
        return this.f7865e;
    }

    @Override // io.flutter.view.TextureRegistry.GLTextureConsumer
    public SurfaceTexture getSurfaceTexture() {
        return this.f7866f.surfaceTexture();
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public int getWidth() {
        return this.f7862b;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public boolean handlesCropAndRotation() {
        return true;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public long id() {
        return this.f7861a;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void release() {
        this.f7866f.release();
        this.f7865e.release();
        this.f7865e = null;
        this.f7864d = true;
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void scheduleFrame() {
        this.f7868h.markTextureFrameAvailable(this.f7861a);
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setCallback(TextureRegistry.SurfaceProducer.a aVar) {
    }

    @Override // io.flutter.view.TextureRegistry.SurfaceProducer
    public void setSize(int i4, int i5) {
        this.f7862b = i4;
        this.f7863c = i5;
        getSurfaceTexture().setDefaultBufferSize(i4, i5);
    }
}
