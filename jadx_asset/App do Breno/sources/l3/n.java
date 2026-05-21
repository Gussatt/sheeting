package l3;

import N2.i;
import h3.u0;

/* JADX INFO: loaded from: classes.dex */
public final class n extends P2.d implements k3.e, P2.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k3.e f10289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final N2.i f10290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public N2.i f10292s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public N2.e f10293t;

    public static final class a extends X2.m implements W2.p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f10294n = new a();

        public a() {
            super(2);
        }

        public final Integer a(int i4, i.b bVar) {
            return Integer.valueOf(i4 + 1);
        }

        @Override // W2.p
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (i.b) obj2);
        }
    }

    public n(k3.e eVar, N2.i iVar) {
        super(l.f10284m, N2.j.f2823m);
        this.f10289p = eVar;
        this.f10290q = iVar;
        this.f10291r = ((Number) iVar.O(0, a.f10294n)).intValue();
    }

    @Override // k3.e
    public Object a(Object obj, N2.e eVar) {
        try {
            Object objW = w(eVar, obj);
            if (objW == O2.c.c()) {
                P2.h.c(eVar);
            }
            return objW == O2.c.c() ? objW : K2.p.f2516a;
        } catch (Throwable th) {
            this.f10292s = new i(th, eVar.b());
            throw th;
        }
    }

    @Override // P2.d, N2.e
    public N2.i b() {
        N2.i iVar = this.f10292s;
        return iVar == null ? N2.j.f2823m : iVar;
    }

    @Override // P2.a, P2.e
    public P2.e i() {
        N2.e eVar = this.f10293t;
        if (eVar instanceof P2.e) {
            return (P2.e) eVar;
        }
        return null;
    }

    @Override // P2.a
    public StackTraceElement o() {
        return null;
    }

    @Override // P2.a
    public Object q(Object obj) {
        Throwable thD = K2.j.d(obj);
        if (thD != null) {
            this.f10292s = new i(thD, b());
        }
        N2.e eVar = this.f10293t;
        if (eVar != null) {
            eVar.p(obj);
        }
        return O2.c.c();
    }

    @Override // P2.d, P2.a
    public void r() {
        super.r();
    }

    public final void u(N2.i iVar, N2.i iVar2, Object obj) {
        if (iVar2 instanceof i) {
            x((i) iVar2, obj);
        }
        p.a(this, iVar);
    }

    public final Object w(N2.e eVar, Object obj) {
        N2.i iVarB = eVar.b();
        u0.d(iVarB);
        N2.i iVar = this.f10292s;
        if (iVar != iVarB) {
            u(iVarB, iVar, obj);
            this.f10292s = iVarB;
        }
        this.f10293t = eVar;
        W2.q qVar = o.f10295a;
        k3.e eVar2 = this.f10289p;
        X2.l.c(eVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        X2.l.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objG = qVar.g(eVar2, obj, this);
        if (!X2.l.a(objG, O2.c.c())) {
            this.f10293t = null;
        }
        return objG;
    }

    public final void x(i iVar, Object obj) {
        throw new IllegalStateException(f3.i.i("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + iVar.f10282m + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
