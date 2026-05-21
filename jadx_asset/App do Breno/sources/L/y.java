package L;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    public static final class a extends P2.k implements W2.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2733q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f2734r;

        public a(N2.e eVar) {
            super(3, eVar);
        }

        @Override // W2.q
        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) {
            return u((r) obj, ((Boolean) obj2).booleanValue(), (N2.e) obj3);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f2733q;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
                return obj;
            }
            K2.k.b(obj);
            r rVar = (r) this.f2734r;
            this.f2733q = 1;
            Object objC2 = rVar.c(this);
            return objC2 == objC ? objC : objC2;
        }

        public final Object u(r rVar, boolean z3, N2.e eVar) {
            a aVar = new a(eVar);
            aVar.f2734r = rVar;
            return aVar.q(K2.p.f2516a);
        }
    }

    public static final Object a(x xVar, N2.e eVar) {
        return xVar.d(new a(null), eVar);
    }
}
