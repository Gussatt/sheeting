package m2;

import android.os.Build;
import android.view.SurfaceHolder;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import l2.AbstractC1388b;

/* JADX INFO: loaded from: classes.dex */
public class P implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1415s f10442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlutterRenderer f10443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SurfaceHolder.Callback f10444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.m f10445d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f10447f;

    public interface c {
        void a();

        void b();

        void c(FlutterRenderer flutterRenderer);
    }

    public class e implements c {
        public e() {
        }

        @Override // m2.P.c
        public void a() {
            if (P.this.f10443b != null) {
                P.this.f10443b.i(P.this.f10445d);
            }
        }

        @Override // m2.P.c
        public void b() {
            P.this.f10442a.setAlpha(0.0f);
            if (P.this.f10443b != null) {
                P.this.f10443b.t(P.this.f10445d);
            }
            P.this.f10443b = null;
        }

        @Override // m2.P.c
        public void c(FlutterRenderer flutterRenderer) {
            if (P.this.f10443b != null) {
                P.this.f10443b.t(P.this.f10445d);
            }
            P.this.f10443b = flutterRenderer;
        }
    }

    public P(SurfaceHolder.Callback callback, C1415s c1415s, FlutterRenderer flutterRenderer) {
        boolean z3 = Build.VERSION.SDK_INT < 26;
        this.f10446e = z3;
        this.f10447f = z3 ? new e() : new d();
        this.f10444c = callback;
        this.f10443b = flutterRenderer;
        this.f10442a = c1415s;
        AbstractC1388b.f("SurfaceHolderCallbackCompat", "SurfaceHolderCallbackCompat()");
        if (z3) {
            c1415s.setAlpha(0.0f);
        }
    }

    public void d(FlutterRenderer flutterRenderer) {
        this.f10447f.c(flutterRenderer);
    }

    public void e() {
        this.f10447f.b();
    }

    public void f() {
        this.f10447f.a();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i4, int i5, int i6) {
        SurfaceHolder.Callback callback = this.f10444c;
        if (callback != null) {
            callback.surfaceChanged(surfaceHolder, i4, i5, i6);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f10444c;
        if (callback != null) {
            callback.surfaceCreated(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        SurfaceHolder.Callback callback = this.f10444c;
        if (callback != null) {
            callback.surfaceDestroyed(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        AbstractC1388b.f("SurfaceHolderCallbackCompat", "SurfaceHolder.Callback2.surfaceRedrawNeeded()");
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        AbstractC1388b.f("SurfaceHolderCallbackCompat", "SurfaceHolder.Callback2.surfaceRedrawNeededAsync()");
        FlutterRenderer flutterRenderer = this.f10443b;
        if (flutterRenderer == null) {
            return;
        }
        flutterRenderer.i(new b(runnable));
    }

    public class a implements io.flutter.embedding.engine.renderer.m {
        public a() {
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void f() {
            AbstractC1388b.f("SurfaceHolderCallbackCompat", "onFlutterUiDisplayed()");
            P.this.f10442a.setAlpha(1.0f);
            if (P.this.f10443b != null) {
                P.this.f10443b.t(this);
            }
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void c() {
        }
    }

    public class b implements io.flutter.embedding.engine.renderer.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f10449a;

        public b(Runnable runnable) {
            this.f10449a = runnable;
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void f() {
            this.f10449a.run();
            if (P.this.f10443b != null) {
                P.this.f10443b.t(this);
            }
        }

        @Override // io.flutter.embedding.engine.renderer.m
        public void c() {
        }
    }

    public class d implements c {
        public d() {
        }

        @Override // m2.P.c
        public void b() {
            P.this.f10443b = null;
        }

        @Override // m2.P.c
        public void c(FlutterRenderer flutterRenderer) {
            P.this.f10443b = flutterRenderer;
        }

        @Override // m2.P.c
        public void a() {
        }
    }
}
