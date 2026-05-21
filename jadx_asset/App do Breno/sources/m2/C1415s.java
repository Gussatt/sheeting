package m2;

import android.content.Context;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import l2.AbstractC1388b;

/* JADX INFO: renamed from: m2.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1415s extends SurfaceView implements io.flutter.embedding.engine.renderer.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlutterRenderer f10502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final P f10503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SurfaceHolder.Callback f10504g;

    /* JADX INFO: renamed from: m2.s$a */
    public class a implements SurfaceHolder.Callback {
        public a() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
            AbstractC1388b.f("FlutterSurfaceView", "SurfaceHolder.Callback.surfaceChanged()");
            if (C1415s.this.o()) {
                C1415s.this.j(i5, i6);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            AbstractC1388b.f("FlutterSurfaceView", "SurfaceHolder.Callback.startRenderingToSurface()");
            C1415s.this.f10500c = true;
            if (C1415s.this.o()) {
                C1415s.this.k();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            AbstractC1388b.f("FlutterSurfaceView", "SurfaceHolder.Callback.stopRenderingToSurface()");
            C1415s.this.f10500c = false;
            if (C1415s.this.o()) {
                C1415s.this.l();
            }
        }
    }

    public C1415s(Context context, boolean z3) {
        this(context, null, z3);
    }

    private void m() {
        if (this.f10499b) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        getHolder().addCallback(this.f10503f);
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void a() {
        AbstractC1388b.f("FlutterSurfaceView", "Detaching from FlutterRenderer.");
        if (this.f10502e == null) {
            AbstractC1388b.g("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            AbstractC1388b.f("FlutterSurfaceView", "Disconnecting FlutterRenderer from Android surface.");
            l();
        }
        this.f10503f.e();
        this.f10502e = null;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void b() {
        if (this.f10502e == null) {
            AbstractC1388b.g("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        this.f10503f.f();
        if (n()) {
            AbstractC1388b.f("FlutterSurfaceView", "Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            k();
        }
        this.f10501d = false;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void c(FlutterRenderer flutterRenderer) {
        AbstractC1388b.f("FlutterSurfaceView", "Attaching to FlutterRenderer.");
        if (this.f10502e != null) {
            AbstractC1388b.f("FlutterSurfaceView", "Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.f10502e.A();
        }
        this.f10502e = flutterRenderer;
        this.f10503f.d(flutterRenderer);
        b();
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public void d() {
        if (this.f10502e == null) {
            AbstractC1388b.g("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f10501d = true;
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i4 = iArr[0];
        region.op(i4, iArr[1], (getRight() + i4) - getLeft(), (iArr[1] + getBottom()) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.n
    public FlutterRenderer getAttachedRenderer() {
        return this.f10502e;
    }

    public final void j(int i4, int i5) {
        if (this.f10502e == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        AbstractC1388b.f("FlutterSurfaceView", "Notifying FlutterRenderer that Android surface size has changed to " + i4 + " x " + i5);
        this.f10502e.B(i4, i5);
    }

    public final void k() {
        if (this.f10502e == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        this.f10502e.z(getHolder().getSurface(), this.f10501d);
    }

    public final void l() {
        FlutterRenderer flutterRenderer = this.f10502e;
        if (flutterRenderer == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        flutterRenderer.A();
    }

    public boolean n() {
        return this.f10500c;
    }

    public final boolean o() {
        return (this.f10502e == null || this.f10501d) ? false : true;
    }

    public C1415s(Context context, AttributeSet attributeSet, boolean z3) {
        super(context, attributeSet);
        this.f10500c = false;
        this.f10501d = false;
        a aVar = new a();
        this.f10504g = aVar;
        this.f10499b = z3;
        this.f10503f = new P(aVar, this, this.f10502e);
        m();
    }
}
