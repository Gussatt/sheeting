package P;

import P2.k;
import W2.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    public static final class a extends k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2887q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f2888r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ p f2889s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, N2.e eVar) {
            super(2, eVar);
            this.f2889s = pVar;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            a aVar = new a(this.f2889s, eVar);
            aVar.f2888r = obj;
            return aVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f2887q;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c cVar = (c) this.f2888r;
                K2.k.b(obj);
                return cVar;
            }
            K2.k.b(obj);
            c cVarC = ((f) this.f2888r).c();
            p pVar = this.f2889s;
            this.f2888r = cVarC;
            this.f2887q = 1;
            return pVar.j(cVarC, this) == objC ? objC : cVarC;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(f fVar, N2.e eVar) {
            return ((a) m(fVar, eVar)).q(K2.p.f2516a);
        }
    }

    public static final Object a(L.h hVar, p pVar, N2.e eVar) {
        return hVar.a(new a(pVar, null), eVar);
    }
}
