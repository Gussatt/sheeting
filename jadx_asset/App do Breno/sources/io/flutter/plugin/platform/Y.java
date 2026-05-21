package io.flutter.plugin.platform;

import android.view.Surface;
import io.flutter.view.TextureRegistry;

/* JADX INFO: loaded from: classes.dex */
public class Y implements InterfaceC1083o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextureRegistry.SurfaceProducer f7979a;

    public Y(TextureRegistry.SurfaceProducer surfaceProducer) {
        this.f7979a = surfaceProducer;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public long a() {
        return this.f7979a.id();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public void b(int i4, int i5) {
        this.f7979a.setSize(i4, i5);
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public int getHeight() {
        return this.f7979a.getHeight();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public Surface getSurface() {
        return this.f7979a.getSurface();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public int getWidth() {
        return this.f7979a.getWidth();
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public void release() {
        this.f7979a.release();
        this.f7979a = null;
    }

    @Override // io.flutter.plugin.platform.InterfaceC1083o
    public void scheduleFrame() {
        this.f7979a.scheduleFrame();
    }
}
