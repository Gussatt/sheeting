package C;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import v.C1583b;

/* JADX INFO: loaded from: classes.dex */
public class F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F f324b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f325a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Field f326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Field f327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Field f328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f329d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f326a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f327b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f328c = declaredField3;
                declaredField3.setAccessible(true);
                f329d = true;
            } catch (ReflectiveOperationException e4) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e4.getMessage(), e4);
            }
        }

        public static F a(View view) {
            if (f329d && view.isAttachedToWindow()) {
                try {
                    Object obj = f326a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f327b.get(obj);
                        Rect rect2 = (Rect) f328c.get(obj);
                        if (rect != null && rect2 != null) {
                            F fA = new b().b(C1583b.c(rect)).c(C1583b.c(rect2)).a();
                            fA.l(fA);
                            fA.d(view.getRootView());
                            return fA;
                        }
                    }
                } catch (IllegalAccessException e4) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e4.getMessage(), e4);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f330a;

        public b() {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30) {
                this.f330a = new e();
            } else if (i4 >= 29) {
                this.f330a = new d();
            } else {
                this.f330a = new c();
            }
        }

        public F a() {
            return this.f330a.b();
        }

        public b b(C1583b c1583b) {
            this.f330a.d(c1583b);
            return this;
        }

        public b c(C1583b c1583b) {
            this.f330a.f(c1583b);
            return this;
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Field f331e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static boolean f332f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Constructor f333g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f334h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WindowInsets f335c = h();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C1583b f336d;

        private static WindowInsets h() {
            if (!f332f) {
                try {
                    f331e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e4);
                }
                f332f = true;
            }
            Field field = f331e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e5);
                }
            }
            if (!f334h) {
                try {
                    f333g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e6);
                }
                f334h = true;
            }
            Constructor constructor = f333g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e7) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e7);
                }
            }
            return null;
        }

        @Override // C.F.f
        public F b() {
            a();
            F fO = F.o(this.f335c);
            fO.j(this.f339b);
            fO.m(this.f336d);
            return fO;
        }

        @Override // C.F.f
        public void d(C1583b c1583b) {
            this.f336d = c1583b;
        }

        @Override // C.F.f
        public void f(C1583b c1583b) {
            WindowInsets windowInsets = this.f335c;
            if (windowInsets != null) {
                this.f335c = windowInsets.replaceSystemWindowInsets(c1583b.f11517a, c1583b.f11518b, c1583b.f11519c, c1583b.f11520d);
            }
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f337c = M.a();

        @Override // C.F.f
        public F b() {
            a();
            F fO = F.o(this.f337c.build());
            fO.j(this.f339b);
            return fO;
        }

        @Override // C.F.f
        public void c(C1583b c1583b) {
            this.f337c.setMandatorySystemGestureInsets(c1583b.e());
        }

        @Override // C.F.f
        public void d(C1583b c1583b) {
            this.f337c.setStableInsets(c1583b.e());
        }

        @Override // C.F.f
        public void e(C1583b c1583b) {
            this.f337c.setSystemGestureInsets(c1583b.e());
        }

        @Override // C.F.f
        public void f(C1583b c1583b) {
            this.f337c.setSystemWindowInsets(c1583b.e());
        }

        @Override // C.F.f
        public void g(C1583b c1583b) {
            this.f337c.setTappableElementInsets(c1583b.e());
        }
    }

    public static class e extends d {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final F f338a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1583b[] f339b;

        public f() {
            this(new F((F) null));
        }

        public final void a() {
            C1583b[] c1583bArr = this.f339b;
            if (c1583bArr != null) {
                C1583b c1583bF = c1583bArr[m.d(1)];
                C1583b c1583bF2 = this.f339b[m.d(2)];
                if (c1583bF2 == null) {
                    c1583bF2 = this.f338a.f(2);
                }
                if (c1583bF == null) {
                    c1583bF = this.f338a.f(1);
                }
                f(C1583b.a(c1583bF, c1583bF2));
                C1583b c1583b = this.f339b[m.d(16)];
                if (c1583b != null) {
                    e(c1583b);
                }
                C1583b c1583b2 = this.f339b[m.d(32)];
                if (c1583b2 != null) {
                    c(c1583b2);
                }
                C1583b c1583b3 = this.f339b[m.d(64)];
                if (c1583b3 != null) {
                    g(c1583b3);
                }
            }
        }

        public abstract F b();

        public abstract void d(C1583b c1583b);

        public abstract void f(C1583b c1583b);

        public f(F f4) {
            this.f338a = f4;
        }

        public void c(C1583b c1583b) {
        }

        public void e(C1583b c1583b) {
        }

        public void g(C1583b c1583b) {
        }
    }

    public static class i extends h {
        public i(F f4, WindowInsets windowInsets) {
            super(f4, windowInsets);
        }

        @Override // C.F.l
        public F a() {
            return F.o(this.f345c.consumeDisplayCutout());
        }

        @Override // C.F.g, C.F.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f345c, iVar.f345c) && Objects.equals(this.f349g, iVar.f349g);
        }

        @Override // C.F.l
        public C0225h f() {
            return C0225h.e(this.f345c.getDisplayCutout());
        }

        @Override // C.F.l
        public int hashCode() {
            return this.f345c.hashCode();
        }

        public i(F f4, i iVar) {
            super(f4, iVar);
        }
    }

    public static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final F f354q = F.o(WindowInsets.CONSUMED);

        public k(F f4, WindowInsets windowInsets) {
            super(f4, windowInsets);
        }

        @Override // C.F.g, C.F.l
        public C1583b g(int i4) {
            return C1583b.d(this.f345c.getInsets(n.a(i4)));
        }

        @Override // C.F.g, C.F.l
        public boolean o(int i4) {
            return this.f345c.isVisible(n.a(i4));
        }

        public k(F f4, k kVar) {
            super(f4, kVar);
        }

        @Override // C.F.g, C.F.l
        public final void d(View view) {
        }
    }

    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i4) {
            if (i4 == 1) {
                return 0;
            }
            if (i4 == 2) {
                return 1;
            }
            if (i4 == 4) {
                return 2;
            }
            if (i4 == 8) {
                return 3;
            }
            if (i4 == 16) {
                return 4;
            }
            if (i4 == 32) {
                return 5;
            }
            if (i4 == 64) {
                return 6;
            }
            if (i4 == 128) {
                return 7;
            }
            if (i4 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i4);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 16;
        }

        public static int i() {
            return 64;
        }
    }

    public static final class n {
        public static int a(int i4) {
            int iStatusBars;
            int i5 = 0;
            for (int i6 = 1; i6 <= 256; i6 <<= 1) {
                if ((i4 & i6) != 0) {
                    if (i6 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i6 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i6 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i6 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i6 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i6 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i6 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i6 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i5 |= iStatusBars;
                }
            }
            return i5;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f324b = k.f354q;
        } else {
            f324b = l.f355b;
        }
    }

    public F(WindowInsets windowInsets) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            this.f325a = new k(this, windowInsets);
            return;
        }
        if (i4 >= 29) {
            this.f325a = new j(this, windowInsets);
        } else if (i4 >= 28) {
            this.f325a = new i(this, windowInsets);
        } else {
            this.f325a = new h(this, windowInsets);
        }
    }

    public static F o(WindowInsets windowInsets) {
        return p(windowInsets, null);
    }

    public static F p(WindowInsets windowInsets, View view) {
        F f4 = new F((WindowInsets) B.f.b(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            f4.l(AbstractC0241y.o(view));
            f4.d(view.getRootView());
        }
        return f4;
    }

    public F a() {
        return this.f325a.a();
    }

    public F b() {
        return this.f325a.b();
    }

    public F c() {
        return this.f325a.c();
    }

    public void d(View view) {
        this.f325a.d(view);
    }

    public C0225h e() {
        return this.f325a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof F) {
            return B.c.a(this.f325a, ((F) obj).f325a);
        }
        return false;
    }

    public C1583b f(int i4) {
        return this.f325a.g(i4);
    }

    public C1583b g() {
        return this.f325a.i();
    }

    public boolean h() {
        return this.f325a.m();
    }

    public int hashCode() {
        l lVar = this.f325a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public boolean i(int i4) {
        return this.f325a.o(i4);
    }

    public void j(C1583b[] c1583bArr) {
        this.f325a.p(c1583bArr);
    }

    public void k(C1583b c1583b) {
        this.f325a.q(c1583b);
    }

    public void l(F f4) {
        this.f325a.r(f4);
    }

    public void m(C1583b c1583b) {
        this.f325a.s(c1583b);
    }

    public WindowInsets n() {
        l lVar = this.f325a;
        if (lVar instanceof g) {
            return ((g) lVar).f345c;
        }
        return null;
    }

    public static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public C1583b f350m;

        public h(F f4, WindowInsets windowInsets) {
            super(f4, windowInsets);
            this.f350m = null;
        }

        @Override // C.F.l
        public F b() {
            return F.o(this.f345c.consumeStableInsets());
        }

        @Override // C.F.l
        public F c() {
            return F.o(this.f345c.consumeSystemWindowInsets());
        }

        @Override // C.F.l
        public final C1583b i() {
            if (this.f350m == null) {
                this.f350m = C1583b.b(this.f345c.getStableInsetLeft(), this.f345c.getStableInsetTop(), this.f345c.getStableInsetRight(), this.f345c.getStableInsetBottom());
            }
            return this.f350m;
        }

        @Override // C.F.l
        public boolean m() {
            return this.f345c.isConsumed();
        }

        @Override // C.F.l
        public void s(C1583b c1583b) {
            this.f350m = c1583b;
        }

        public h(F f4, h hVar) {
            super(f4, hVar);
            this.f350m = null;
            this.f350m = hVar.f350m;
        }
    }

    public static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f340h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Method f341i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static Class f342j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static Field f343k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static Field f344l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets f345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C1583b[] f346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C1583b f347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public F f348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C1583b f349g;

        public g(F f4, WindowInsets windowInsets) {
            super(f4);
            this.f347e = null;
            this.f345c = windowInsets;
        }

        private C1583b t(int i4, boolean z3) {
            C1583b c1583bA = C1583b.f11516e;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0) {
                    c1583bA = C1583b.a(c1583bA, u(i5, z3));
                }
            }
            return c1583bA;
        }

        private C1583b v() {
            F f4 = this.f348f;
            return f4 != null ? f4.g() : C1583b.f11516e;
        }

        private C1583b w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f340h) {
                y();
            }
            Method method = f341i;
            if (method != null && f342j != null && f343k != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f343k.get(f344l.get(objInvoke));
                    if (rect != null) {
                        return C1583b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e4) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
                }
            }
            return null;
        }

        private static void y() {
            try {
                f341i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f342j = cls;
                f343k = cls.getDeclaredField("mVisibleInsets");
                f344l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f343k.setAccessible(true);
                f344l.setAccessible(true);
            } catch (ReflectiveOperationException e4) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e4.getMessage(), e4);
            }
            f340h = true;
        }

        @Override // C.F.l
        public void d(View view) {
            C1583b c1583bW = w(view);
            if (c1583bW == null) {
                c1583bW = C1583b.f11516e;
            }
            q(c1583bW);
        }

        @Override // C.F.l
        public void e(F f4) {
            f4.l(this.f348f);
            f4.k(this.f349g);
        }

        @Override // C.F.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f349g, ((g) obj).f349g);
            }
            return false;
        }

        @Override // C.F.l
        public C1583b g(int i4) {
            return t(i4, false);
        }

        @Override // C.F.l
        public final C1583b k() {
            if (this.f347e == null) {
                this.f347e = C1583b.b(this.f345c.getSystemWindowInsetLeft(), this.f345c.getSystemWindowInsetTop(), this.f345c.getSystemWindowInsetRight(), this.f345c.getSystemWindowInsetBottom());
            }
            return this.f347e;
        }

        @Override // C.F.l
        public boolean n() {
            return this.f345c.isRound();
        }

        @Override // C.F.l
        public boolean o(int i4) {
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i4 & i5) != 0 && !x(i5)) {
                    return false;
                }
            }
            return true;
        }

        @Override // C.F.l
        public void p(C1583b[] c1583bArr) {
            this.f346d = c1583bArr;
        }

        @Override // C.F.l
        public void q(C1583b c1583b) {
            this.f349g = c1583b;
        }

        @Override // C.F.l
        public void r(F f4) {
            this.f348f = f4;
        }

        public C1583b u(int i4, boolean z3) {
            C1583b c1583bG;
            int i5;
            if (i4 == 1) {
                return z3 ? C1583b.b(0, Math.max(v().f11518b, k().f11518b), 0, 0) : C1583b.b(0, k().f11518b, 0, 0);
            }
            if (i4 == 2) {
                if (z3) {
                    C1583b c1583bV = v();
                    C1583b c1583bI = i();
                    return C1583b.b(Math.max(c1583bV.f11517a, c1583bI.f11517a), 0, Math.max(c1583bV.f11519c, c1583bI.f11519c), Math.max(c1583bV.f11520d, c1583bI.f11520d));
                }
                C1583b c1583bK = k();
                F f4 = this.f348f;
                c1583bG = f4 != null ? f4.g() : null;
                int iMin = c1583bK.f11520d;
                if (c1583bG != null) {
                    iMin = Math.min(iMin, c1583bG.f11520d);
                }
                return C1583b.b(c1583bK.f11517a, 0, c1583bK.f11519c, iMin);
            }
            if (i4 != 8) {
                if (i4 == 16) {
                    return j();
                }
                if (i4 == 32) {
                    return h();
                }
                if (i4 == 64) {
                    return l();
                }
                if (i4 != 128) {
                    return C1583b.f11516e;
                }
                F f5 = this.f348f;
                C0225h c0225hE = f5 != null ? f5.e() : f();
                return c0225hE != null ? C1583b.b(c0225hE.b(), c0225hE.d(), c0225hE.c(), c0225hE.a()) : C1583b.f11516e;
            }
            C1583b[] c1583bArr = this.f346d;
            c1583bG = c1583bArr != null ? c1583bArr[m.d(8)] : null;
            if (c1583bG != null) {
                return c1583bG;
            }
            C1583b c1583bK2 = k();
            C1583b c1583bV2 = v();
            int i6 = c1583bK2.f11520d;
            if (i6 > c1583bV2.f11520d) {
                return C1583b.b(0, 0, 0, i6);
            }
            C1583b c1583b = this.f349g;
            return (c1583b == null || c1583b.equals(C1583b.f11516e) || (i5 = this.f349g.f11520d) <= c1583bV2.f11520d) ? C1583b.f11516e : C1583b.b(0, 0, 0, i5);
        }

        public boolean x(int i4) {
            if (i4 != 1 && i4 != 2) {
                if (i4 == 4) {
                    return false;
                }
                if (i4 != 8 && i4 != 128) {
                    return true;
                }
            }
            return !u(i4, false).equals(C1583b.f11516e);
        }

        public g(F f4, g gVar) {
            this(f4, new WindowInsets(gVar.f345c));
        }
    }

    public static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public C1583b f351n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public C1583b f352o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public C1583b f353p;

        public j(F f4, WindowInsets windowInsets) {
            super(f4, windowInsets);
            this.f351n = null;
            this.f352o = null;
            this.f353p = null;
        }

        @Override // C.F.l
        public C1583b h() {
            if (this.f352o == null) {
                this.f352o = C1583b.d(this.f345c.getMandatorySystemGestureInsets());
            }
            return this.f352o;
        }

        @Override // C.F.l
        public C1583b j() {
            if (this.f351n == null) {
                this.f351n = C1583b.d(this.f345c.getSystemGestureInsets());
            }
            return this.f351n;
        }

        @Override // C.F.l
        public C1583b l() {
            if (this.f353p == null) {
                this.f353p = C1583b.d(this.f345c.getTappableElementInsets());
            }
            return this.f353p;
        }

        public j(F f4, j jVar) {
            super(f4, jVar);
            this.f351n = null;
            this.f352o = null;
            this.f353p = null;
        }

        @Override // C.F.h, C.F.l
        public void s(C1583b c1583b) {
        }
    }

    public F(F f4) {
        if (f4 != null) {
            l lVar = f4.f325a;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 30 && (lVar instanceof k)) {
                this.f325a = new k(this, (k) lVar);
            } else if (i4 >= 29 && (lVar instanceof j)) {
                this.f325a = new j(this, (j) lVar);
            } else if (i4 >= 28 && (lVar instanceof i)) {
                this.f325a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f325a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f325a = new g(this, (g) lVar);
            } else {
                this.f325a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f325a = new l(this);
    }

    public static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final F f355b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final F f356a;

        public l(F f4) {
            this.f356a = f4;
        }

        public F a() {
            return this.f356a;
        }

        public F b() {
            return this.f356a;
        }

        public F c() {
            return this.f356a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return n() == lVar.n() && m() == lVar.m() && B.c.a(k(), lVar.k()) && B.c.a(i(), lVar.i()) && B.c.a(f(), lVar.f());
        }

        public C0225h f() {
            return null;
        }

        public C1583b g(int i4) {
            return C1583b.f11516e;
        }

        public C1583b h() {
            return k();
        }

        public int hashCode() {
            return B.c.b(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), f());
        }

        public C1583b i() {
            return C1583b.f11516e;
        }

        public C1583b j() {
            return k();
        }

        public C1583b k() {
            return C1583b.f11516e;
        }

        public C1583b l() {
            return k();
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public boolean o(int i4) {
            return true;
        }

        public void d(View view) {
        }

        public void e(F f4) {
        }

        public void p(C1583b[] c1583bArr) {
        }

        public void q(C1583b c1583b) {
        }

        public void r(F f4) {
        }

        public void s(C1583b c1583b) {
        }
    }
}
