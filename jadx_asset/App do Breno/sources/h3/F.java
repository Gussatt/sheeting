package h3;

import N2.f;
import N2.i;
import m3.AbstractC1429n;
import m3.C1425j;
import m3.C1428m;

/* JADX INFO: loaded from: classes.dex */
public abstract class F extends N2.a implements N2.f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f7498n = new a(null);

    public static final class a extends N2.b {

        /* JADX INFO: renamed from: h3.F$a$a, reason: collision with other inner class name */
        public static final class C0125a extends X2.m implements W2.l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0125a f7499n = new C0125a();

            public C0125a() {
                super(1);
            }

            @Override // W2.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final F k(i.b bVar) {
                if (bVar instanceof F) {
                    return (F) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
            super(N2.f.f2821a, C0125a.f7499n);
        }
    }

    public F() {
        super(N2.f.f2821a);
    }

    @Override // N2.a, N2.i
    public N2.i F(i.c cVar) {
        return f.a.b(this, cVar);
    }

    @Override // N2.f
    public final void H(N2.e eVar) {
        X2.l.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C1425j) eVar).q();
    }

    public abstract void R(N2.i iVar, Runnable runnable);

    public boolean S(N2.i iVar) {
        return true;
    }

    public F T(int i4) {
        AbstractC1429n.a(i4);
        return new C1428m(this, i4);
    }

    @Override // N2.a, N2.i.b, N2.i
    public i.b d(i.c cVar) {
        return f.a.a(this, cVar);
    }

    @Override // N2.f
    public final N2.e r(N2.e eVar) {
        return new C1425j(this, eVar);
    }

    public String toString() {
        return M.a(this) + '@' + M.b(this);
    }
}
