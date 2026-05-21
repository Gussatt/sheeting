package l3;

import m3.J;

/* JADX INFO: loaded from: classes.dex */
public final class s implements k3.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N2.i f10301m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f10302n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final W2.p f10303o;

    public static final class a extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f10304q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f10305r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ k3.e f10306s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k3.e eVar, N2.e eVar2) {
            super(2, eVar2);
            this.f10306s = eVar;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            a aVar = new a(this.f10306s, eVar);
            aVar.f10305r = obj;
            return aVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f10304q;
            if (i4 == 0) {
                K2.k.b(obj);
                Object obj2 = this.f10305r;
                k3.e eVar = this.f10306s;
                this.f10304q = 1;
                if (eVar.a(obj2, this) == objC) {
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
        public final Object j(Object obj, N2.e eVar) {
            return ((a) m(obj, eVar)).q(K2.p.f2516a);
        }
    }

    public s(k3.e eVar, N2.i iVar) {
        this.f10301m = iVar;
        this.f10302n = J.b(iVar);
        this.f10303o = new a(eVar, null);
    }

    @Override // k3.e
    public Object a(Object obj, N2.e eVar) {
        Object objB = f.b(this.f10301m, obj, this.f10302n, this.f10303o, eVar);
        return objB == O2.c.c() ? objB : K2.p.f2516a;
    }
}
