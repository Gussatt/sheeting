package q0;

import X2.z;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import m0.C1391a;
import v0.C1585a;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f11031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0.d f11032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1391a f11033c;

    public static final class a extends X2.m implements W2.a {
        public a() {
            super(0);
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean e() throws NoSuchMethodException, ClassNotFoundException {
            Class clsF = e.this.f();
            boolean z3 = false;
            Method method = clsF.getMethod("getBounds", new Class[0]);
            Method method2 = clsF.getMethod("getType", new Class[0]);
            Method method3 = clsF.getMethod("getState", new Class[0]);
            C1585a c1585a = C1585a.f11542a;
            X2.l.d(method, "getBoundsMethod");
            if (c1585a.b(method, z.b(Rect.class)) && c1585a.d(method)) {
                X2.l.d(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (c1585a.b(method2, z.b(cls)) && c1585a.d(method2)) {
                    X2.l.d(method3, "getStateMethod");
                    if (c1585a.b(method3, z.b(cls)) && c1585a.d(method3)) {
                        z3 = true;
                    }
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    public static final class b extends X2.m implements W2.a {
        public b() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean e() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            /*
                r4 = this;
                q0.e r0 = q0.e.this
                n0.d r0 = q0.e.a(r0)
                java.lang.Class r0 = r0.b()
                if (r0 != 0) goto Lf
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                return r0
            Lf:
                q0.e r1 = q0.e.this
                java.lang.Class r1 = q0.e.d(r1)
                java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
                java.lang.Class[] r2 = new java.lang.Class[]{r2, r0}
                java.lang.String r3 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r2 = r1.getMethod(r3, r2)
                java.lang.String r3 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r0 = new java.lang.Class[]{r0}
                java.lang.reflect.Method r0 = r1.getMethod(r3, r0)
                v0.a r1 = v0.C1585a.f11542a
                java.lang.String r3 = "addListenerMethod"
                X2.l.d(r2, r3)
                boolean r2 = r1.d(r2)
                if (r2 == 0) goto L45
                java.lang.String r2 = "removeListenerMethod"
                X2.l.d(r0, r2)
                boolean r0 = r1.d(r0)
                if (r0 == 0) goto L45
                r0 = 1
                goto L46
            L45:
                r0 = 0
            L46:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.e.b.e():java.lang.Boolean");
        }
    }

    public static final class c extends X2.m implements W2.a {
        public c() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0038  */
        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean e() throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException {
            /*
                r4 = this;
                q0.e r0 = q0.e.this
                java.lang.Class r0 = q0.e.d(r0)
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                java.lang.Class<androidx.window.extensions.core.util.function.Consumer> r2 = androidx.window.extensions.core.util.function.Consumer.class
                java.lang.Class[] r1 = new java.lang.Class[]{r1, r2}
                java.lang.String r3 = "addWindowLayoutInfoListener"
                java.lang.reflect.Method r1 = r0.getMethod(r3, r1)
                java.lang.String r3 = "removeWindowLayoutInfoListener"
                java.lang.Class[] r2 = new java.lang.Class[]{r2}
                java.lang.reflect.Method r0 = r0.getMethod(r3, r2)
                v0.a r2 = v0.C1585a.f11542a
                java.lang.String r3 = "addListenerMethod"
                X2.l.d(r1, r3)
                boolean r1 = r2.d(r1)
                if (r1 == 0) goto L38
                java.lang.String r1 = "removeListenerMethod"
                X2.l.d(r0, r1)
                boolean r0 = r2.d(r0)
                if (r0 == 0) goto L38
                r0 = 1
                goto L39
            L38:
                r0 = 0
            L39:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: q0.e.c.e():java.lang.Boolean");
        }
    }

    public static final class d extends X2.m implements W2.a {
        public d() {
            super(0);
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean e() throws NoSuchMethodException, ClassNotFoundException {
            boolean z3 = false;
            Method method = e.this.f11033c.c().getMethod("getWindowLayoutComponent", new Class[0]);
            Class clsH = e.this.h();
            C1585a c1585a = C1585a.f11542a;
            X2.l.d(method, "getWindowLayoutComponentMethod");
            if (c1585a.d(method) && c1585a.c(method, clsH)) {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
    }

    public e(ClassLoader classLoader, n0.d dVar) {
        X2.l.e(classLoader, "loader");
        X2.l.e(dVar, "consumerAdapter");
        this.f11031a = classLoader;
        this.f11032b = dVar;
        this.f11033c = new C1391a(classLoader);
    }

    public final boolean e() {
        if (!n()) {
            return false;
        }
        int iA = n0.e.f10592a.a();
        if (iA == 1) {
            return i();
        }
        if (2 > iA || iA > Integer.MAX_VALUE) {
            return false;
        }
        return j();
    }

    public final Class f() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f11031a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        X2.l.d(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return clsLoadClass;
    }

    public final WindowLayoutComponent g() {
        if (!e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final Class h() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f11031a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        X2.l.d(clsLoadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return clsLoadClass;
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean k() {
        return C1585a.e("FoldingFeature class is not valid", new a());
    }

    public final boolean l() {
        return C1585a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b());
    }

    public final boolean m() {
        return C1585a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c());
    }

    public final boolean n() {
        return this.f11033c.f() && o() && k();
    }

    public final boolean o() {
        return C1585a.e("WindowExtensions#getWindowLayoutComponent is not valid", new d());
    }
}
