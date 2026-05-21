package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f4719a = 100;

    public abstract void a(Object obj, int i4, int i5);

    public abstract void b(Object obj, int i4, long j4);

    public abstract void c(Object obj, int i4, Object obj2);

    public abstract void d(Object obj, int i4, AbstractC0584f abstractC0584f);

    public abstract void e(Object obj, int i4, long j4);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, X x3, int i4) {
        while (x3.r() != Integer.MAX_VALUE && m(obj, x3, i4)) {
        }
    }

    public final boolean m(Object obj, X x3, int i4) throws C0599v {
        int iE = x3.e();
        int iA = k0.a(iE);
        int iB = k0.b(iE);
        if (iB == 0) {
            e(obj, iA, x3.I());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, x3.h());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, x3.w());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw C0599v.e();
            }
            a(obj, iA, x3.p());
            return true;
        }
        Object objN = n();
        int iC = k0.c(iA, 4);
        int i5 = i4 + 1;
        if (i5 >= f4719a) {
            throw C0599v.i();
        }
        l(objN, x3, i5);
        if (iC != x3.e()) {
            throw C0599v.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(X x3);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, l0 l0Var);

    public abstract void t(Object obj, l0 l0Var);
}
