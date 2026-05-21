package P;

import P2.k;
import W2.p;
import X2.l;

/* JADX INFO: loaded from: classes.dex */
public final class d implements L.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L.h f2880a;

    public static final class a extends k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2881q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f2882r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ p f2883s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, N2.e eVar) {
            super(2, eVar);
            this.f2883s = pVar;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            a aVar = new a(this.f2883s, eVar);
            aVar.f2882r = obj;
            return aVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f2881q;
            if (i4 == 0) {
                K2.k.b(obj);
                f fVar = (f) this.f2882r;
                p pVar = this.f2883s;
                this.f2881q = 1;
                obj = pVar.j(fVar, this);
                if (obj == objC) {
                    return objC;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
            }
            f fVar2 = (f) obj;
            l.c(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).g();
            return fVar2;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(f fVar, N2.e eVar) {
            return ((a) m(fVar, eVar)).q(K2.p.f2516a);
        }
    }

    public d(L.h hVar) {
        l.e(hVar, "delegate");
        this.f2880a = hVar;
    }

    @Override // L.h
    public Object a(p pVar, N2.e eVar) {
        return this.f2880a.a(new a(pVar, null), eVar);
    }

    @Override // L.h
    public k3.d getData() {
        return this.f2880a.getData();
    }
}
