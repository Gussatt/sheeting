package io.flutter.plugin.platform;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes.dex */
public class a0 implements InterfaceC1083o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextureRegistry.SurfaceTextureEntry f7981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SurfaceTexture f7982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f7983c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7984d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7985e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7986f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextureRegistry.b f7987g;

    public class a implements TextureRegistry.b {
        public a() {
        }

        @Override // io.flutter.view.TextureRegistry.b
        public void onTrimMemory(int i4) {
            if (i4 != 80 || Build.VERSION.SDK_INT < 29) {
                return;
            }
            a0.this.f7986f = true;
        }
    }

    public a0(TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        a aVar = new a();
        this.f7987g = aVar;
        this.f7981a = surfaceTextureEntry;
        this.f7982b = surfaceTextureEntry.surfaceTexture();
        surfaceTextureEntry.setOnTrimMemoryListener(aVar);
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public long a() {
        return this.f7981a.id();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public void b(int i4, int i5) {
        this.f7984d = i4;
        this.f7985e = i5;
        SurfaceTexture surfaceTexture = this.f7982b;
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i4, i5);
        }
    }

    public Surface d() {
        return new Surface(this.f7982b);
    }

    public final void e() {
        Surface surface = this.f7983c;
        if (surface == null || this.f7986f) {
            if (surface != null) {
                surface.release();
                this.f7983c = null;
            }
            this.f7983c = d();
            this.f7986f = false;
        }
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public int getHeight() {
        return this.f7985e;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public Surface getSurface() {
        e();
        SurfaceTexture surfaceTexture = this.f7982b;
        if (surfaceTexture == null || surfaceTexture.isReleased()) {
            return null;
        }
        return this.f7983c;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public int getWidth() {
        return this.f7984d;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public void release() {
        this.f7982b = null;
        Surface surface = this.f7983c;
        if (surface != null) {
            surface.release();
            this.f7983c = null;
        }
    }
}
