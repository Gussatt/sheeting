package m2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import l2.AbstractC1388b;

/* JADX INFO: loaded from: classes.dex */
public class t extends TextureView implements io.flutter.embedding.engine.renderer.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FlutterRenderer f10508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f10509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextureView.SurfaceTextureListener f10510f;

    public t(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i4, int i5) {
        if (this.f10508d == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        AbstractC1388b.f("FlutterTextureView", "Notifying FlutterRenderer that Android surface size has changed to " + i4 + " x " + i5);
        this.f10508d.B(i4, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.f10508d == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f10509e;
        if (surface != null) {
            surface.release();
            this.f10509e = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f10509e = surface2;
        this.f10508d.z(surface2, this.f10507c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        FlutterRenderer flutterRenderer = this.f10508d;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.A();
        Surface surface = this.f10509e;
        if (surface != null) {
            surface.release();
            this.f10509e = null;
        }
    }

    private void o() {
        setSurfaceTextureListener(this.f10510f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return (this.f10508d == null || this.f10507c) ? false : true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void a() {
        if (this.f10508d == null) {
            AbstractC1388b.g("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            AbstractC1388b.f("FlutterTextureView", "Disconnecting FlutterRenderer from Android surface.");
            n();
        }
        this.f10508d = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void b() {
        if (this.f10508d == null) {
            AbstractC1388b.g("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (p()) {
            AbstractC1388b.f("FlutterTextureView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            m();
        }
        this.f10507c = false;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void c(FlutterRenderer flutterRenderer) {
        AbstractC1388b.f("FlutterTextureView", "Attaching to FlutterRenderer.");
        if (this.f10508d != null) {
            AbstractC1388b.f("FlutterTextureView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f10508d.A();
        }
        this.f10508d = flutterRenderer;
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void d() {
        if (this.f10508d == null) {
            AbstractC1388b.g("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f10507c = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public FlutterRenderer getAttachedRenderer() {
        return this.f10508d;
    }

    public boolean p() {
        return this.f10506b;
    }

    public void setRenderSurface(Surface surface) {
        this.f10509e = surface;
    }

    public t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10506b = false;
        this.f10507c = false;
        this.f10510f = new a();
        o();
    }

    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i4, int i5) {
            AbstractC1388b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureAvailable()");
            t.this.f10506b = true;
            if (t.this.q()) {
                t.this.m();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            AbstractC1388b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureDestroyed()");
            t.this.f10506b = false;
            if (t.this.q()) {
                t.this.n();
            }
            if (t.this.f10509e == null) {
                return true;
            }
            t.this.f10509e.release();
            t.this.f10509e = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i4, int i5) {
            AbstractC1388b.f("FlutterTextureView", "SurfaceTextureListener.onSurfaceTextureSizeChanged()");
            if (t.this.q()) {
                t.this.l(i4, i5);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }
}
