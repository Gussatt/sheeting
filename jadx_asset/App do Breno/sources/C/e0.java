package C;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p.C1481g;

/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f371a;

    public static class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Window f372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0237u f373b;

        public a(Window window, C0237u c0237u) {
            this.f372a = window;
            this.f373b = c0237u;
        }

        public void c(int i4) {
            View decorView = this.f372a.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        public void d(int i4) {
            this.f372a.addFlags(i4);
        }

        public void e(int i4) {
            View decorView = this.f372a.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        public void f(int i4) {
            this.f372a.clearFlags(i4);
        }
    }

    public static class b extends a {
        public b(Window window, C0237u c0237u) {
            super(window, c0237u);
        }

        @Override // C.e0.e
        public void b(boolean z3) {
            if (!z3) {
                e(8192);
                return;
            }
            f(67108864);
            d(Integer.MIN_VALUE);
            c(8192);
        }
    }

    public static class c extends b {
        public c(Window window, C0237u c0237u) {
            super(window, c0237u);
        }

        @Override // C.e0.e
        public void a(boolean z3) {
            if (!z3) {
                e(16);
                return;
            }
            f(134217728);
            d(Integer.MIN_VALUE);
            c(16);
        }
    }

    public e0(Window window, View view) {
        C0237u c0237u = new C0237u(view);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f371a = new d(window, this, c0237u);
        } else if (i4 >= 26) {
            this.f371a = new c(window, c0237u);
        } else {
            this.f371a = new b(window, c0237u);
        }
    }

    public void a(boolean z3) {
        this.f371a.a(z3);
    }

    public void b(boolean z3) {
        this.f371a.b(z3);
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C0237u f376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C1481g f377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Window f378e;

        public d(Window window, e0 e0Var, C0237u c0237u) {
            this(window.getInsetsController(), e0Var, c0237u);
            this.f378e = window;
        }

        @Override // C.e0.e
        public void a(boolean z3) {
            if (z3) {
                if (this.f378e != null) {
                    c(16);
                }
                this.f375b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f378e != null) {
                    d(16);
                }
                this.f375b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // C.e0.e
        public void b(boolean z3) {
            if (z3) {
                if (this.f378e != null) {
                    c(8192);
                }
                this.f375b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f378e != null) {
                    d(8192);
                }
                this.f375b.setSystemBarsAppearance(0, 8);
            }
        }

        public void c(int i4) {
            View decorView = this.f378e.getDecorView();
            decorView.setSystemUiVisibility(i4 | decorView.getSystemUiVisibility());
        }

        public void d(int i4) {
            View decorView = this.f378e.getDecorView();
            decorView.setSystemUiVisibility((~i4) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, e0 e0Var, C0237u c0237u) {
            this.f377d = new C1481g();
            this.f375b = windowInsetsController;
            this.f374a = e0Var;
            this.f376c = c0237u;
        }
    }

    public static class e {
        public abstract void b(boolean z3);

        public void a(boolean z3) {
        }
    }
}
