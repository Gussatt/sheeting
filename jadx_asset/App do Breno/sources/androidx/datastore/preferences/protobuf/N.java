package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f4660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f4661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC0592n f4663d;

    public N(f0 f0Var, AbstractC0592n abstractC0592n, J j4) {
        this.f4661b = f0Var;
        this.f4662c = abstractC0592n.e(j4);
        this.f4663d = abstractC0592n;
        this.f4660a = j4;
    }

    private int j(f0 f0Var, Object obj) {
        return f0Var.i(f0Var.g(obj));
    }

    private void k(f0 f0Var, AbstractC0592n abstractC0592n, Object obj, X x3, C0591m c0591m) throws Throwable {
        f0 f0Var2;
        Object objF = f0Var.f(obj);
        C0595q c0595qD = abstractC0592n.d(obj);
        while (x3.r() != Integer.MAX_VALUE) {
            try {
                f0Var2 = f0Var;
                AbstractC0592n abstractC0592n2 = abstractC0592n;
                X x4 = x3;
                C0591m c0591m2 = c0591m;
                try {
                    if (!m(x4, c0591m2, abstractC0592n2, c0595qD, f0Var2, objF)) {
                        f0Var2.o(obj, objF);
                        return;
                    }
                    x3 = x4;
                    c0591m = c0591m2;
                    abstractC0592n = abstractC0592n2;
                    f0Var = f0Var2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    f0Var2.o(obj, objF);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                f0Var2 = f0Var;
            }
        }
        f0Var.o(obj, objF);
    }

    public static N l(f0 f0Var, AbstractC0592n abstractC0592n, J j4) {
        return new N(f0Var, abstractC0592n, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void a(Object obj, Object obj2) {
        a0.F(this.f4661b, obj, obj2);
        if (this.f4662c) {
            a0.D(this.f4663d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void b(Object obj, X x3, C0591m c0591m) throws Throwable {
        k(this.f4661b, this.f4663d, obj, x3, c0591m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void c(Object obj, l0 l0Var) {
        Iterator itN = this.f4663d.c(obj).n();
        if (itN.hasNext()) {
            i.d.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        n(this.f4661b, obj, l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void d(Object obj) {
        this.f4661b.j(obj);
        this.f4663d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public final boolean e(Object obj) {
        return this.f4663d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean f(Object obj, Object obj2) {
        if (!this.f4661b.g(obj).equals(this.f4661b.g(obj2))) {
            return false;
        }
        if (this.f4662c) {
            return this.f4663d.c(obj).equals(this.f4663d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int g(Object obj) {
        int iJ = j(this.f4661b, obj);
        return this.f4662c ? iJ + this.f4663d.c(obj).f() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public Object h() {
        J j4 = this.f4660a;
        return j4 instanceof AbstractC0597t ? ((AbstractC0597t) j4).I() : j4.g().d();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int i(Object obj) {
        int iHashCode = this.f4661b.g(obj).hashCode();
        return this.f4662c ? (iHashCode * 53) + this.f4663d.c(obj).hashCode() : iHashCode;
    }

    public final boolean m(X x3, C0591m c0591m, AbstractC0592n abstractC0592n, C0595q c0595q, f0 f0Var, Object obj) throws C0599v {
        int iE = x3.e();
        int iY = 0;
        if (iE != k0.f4790a) {
            if (k0.b(iE) != 2) {
                return x3.B();
            }
            Object objB = abstractC0592n.b(c0591m, this.f4660a, k0.a(iE));
            if (objB == null) {
                return f0Var.m(obj, x3, 0);
            }
            abstractC0592n.h(x3, objB, c0591m, c0595q);
            return true;
        }
        Object objB2 = null;
        AbstractC0584f abstractC0584fW = null;
        while (x3.r() != Integer.MAX_VALUE) {
            int iE2 = x3.e();
            if (iE2 == k0.f4792c) {
                iY = x3.y();
                objB2 = abstractC0592n.b(c0591m, this.f4660a, iY);
            } else if (iE2 == k0.f4793d) {
                if (objB2 != null) {
                    abstractC0592n.h(x3, objB2, c0591m, c0595q);
                } else {
                    abstractC0584fW = x3.w();
                }
            } else if (!x3.B()) {
                break;
            }
        }
        if (x3.e() != k0.f4791b) {
            throw C0599v.b();
        }
        if (abstractC0584fW != null) {
            if (objB2 != null) {
                abstractC0592n.i(abstractC0584fW, objB2, c0591m, c0595q);
            } else {
                f0Var.d(obj, iY, abstractC0584fW);
            }
        }
        return true;
    }

    public final void n(f0 f0Var, Object obj, l0 l0Var) {
        f0Var.s(f0Var.g(obj), l0Var);
    }
}
