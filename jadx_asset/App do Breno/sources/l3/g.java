package l3;

import N2.f;
import h3.E;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k3.d f10278p;

    public static final class a extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f10279q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f10280r;

        public a(N2.e eVar) {
            super(2, eVar);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            a aVar = g.this.new a(eVar);
            aVar.f10280r = obj;
            return aVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f10279q;
            if (i4 == 0) {
                K2.k.b(obj);
                k3.e eVar = (k3.e) this.f10280r;
                g gVar = g.this;
                this.f10279q = 1;
                if (gVar.n(eVar, this) == objC) {
                    return objC;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
            }
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(k3.e eVar, N2.e eVar2) {
            return ((a) m(eVar, eVar2)).q(K2.p.f2516a);
        }
    }

    public g(k3.d dVar, N2.i iVar, int i4, j3.a aVar) {
        super(iVar, i4, aVar);
        this.f10278p = dVar;
    }

    public static /* synthetic */ Object k(g gVar, k3.e eVar, N2.e eVar2) {
        if (gVar.f10269n == -3) {
            N2.i iVarB = eVar2.b();
            N2.i iVarD = E.d(iVarB, gVar.f10268m);
            if (X2.l.a(iVarD, iVarB)) {
                Object objN = gVar.n(eVar, eVar2);
                return objN == O2.c.c() ? objN : K2.p.f2516a;
            }
            f.b bVar = N2.f.f2821a;
            if (X2.l.a(iVarD.d(bVar), iVarB.d(bVar))) {
                Object objM = gVar.m(eVar, iVarD, eVar2);
                return objM == O2.c.c() ? objM : K2.p.f2516a;
            }
        }
        Object objB = super.b(eVar, eVar2);
        return objB == O2.c.c() ? objB : K2.p.f2516a;
    }

    public static /* synthetic */ Object l(g gVar, j3.r rVar, N2.e eVar) {
        Object objN = gVar.n(new q(rVar), eVar);
        return objN == O2.c.c() ? objN : K2.p.f2516a;
    }

    @Override // l3.e, k3.d
    public Object b(k3.e eVar, N2.e eVar2) {
        return k(this, eVar, eVar2);
    }

    @Override // l3.e
    public Object f(j3.r rVar, N2.e eVar) {
        return l(this, rVar, eVar);
    }

    public final Object m(k3.e eVar, N2.i iVar, N2.e eVar2) {
        Object objC = f.c(iVar, f.d(eVar, eVar2.b()), null, new a(null), eVar2, 4, null);
        return objC == O2.c.c() ? objC : K2.p.f2516a;
    }

    public abstract Object n(k3.e eVar, N2.e eVar2);

    @Override // l3.e
    public String toString() {
        return this.f10278p + " -> " + super.toString();
    }
}
