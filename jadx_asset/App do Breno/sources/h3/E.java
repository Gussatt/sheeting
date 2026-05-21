package h3;

import N2.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    public static final class a extends X2.m implements W2.p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f7494n = new a();

        public a() {
            super(2);
        }

        @Override // W2.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N2.i j(N2.i iVar, i.b bVar) {
            return iVar.D(bVar);
        }
    }

    public static final class b extends X2.m implements W2.p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ X2.y f7495n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f7496o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(X2.y yVar, boolean z3) {
            super(2);
            this.f7495n = yVar;
            this.f7496o = z3;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N2.i j(N2.i iVar, i.b bVar) {
            return iVar.D(bVar);
        }
    }

    public static final class c extends X2.m implements W2.p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final c f7497n = new c();

        public c() {
            super(2);
        }

        public final Boolean a(boolean z3, i.b bVar) {
            return Boolean.valueOf(z3);
        }

        @Override // W2.p
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (i.b) obj2);
        }
    }

    public static final N2.i a(N2.i iVar, N2.i iVar2, boolean z3) {
        boolean zC = c(iVar);
        boolean zC2 = c(iVar2);
        if (!zC && !zC2) {
            return iVar.D(iVar2);
        }
        X2.y yVar = new X2.y();
        yVar.f3992m = iVar2;
        N2.j jVar = N2.j.f2823m;
        N2.i iVar3 = (N2.i) iVar.O(jVar, new b(yVar, z3));
        if (zC2) {
            yVar.f3992m = ((N2.i) yVar.f3992m).O(jVar, a.f7494n);
        }
        return iVar3.D((N2.i) yVar.f3992m);
    }

    public static final String b(N2.i iVar) {
        return null;
    }

    public static final boolean c(N2.i iVar) {
        return ((Boolean) iVar.O(Boolean.FALSE, c.f7497n)).booleanValue();
    }

    public static final N2.i d(N2.i iVar, N2.i iVar2) {
        return !c(iVar2) ? iVar.D(iVar2) : a(iVar, iVar2, false);
    }

    public static final N2.i e(I i4, N2.i iVar) {
        N2.i iVarA = a(i4.o(), iVar, true);
        return (iVarA == W.a() || iVarA.d(N2.f.f2821a) != null) ? iVarA : iVarA.D(W.a());
    }

    public static final N0 f(P2.e eVar) {
        while (!(eVar instanceof T) && (eVar = eVar.i()) != null) {
            if (eVar instanceof N0) {
                return (N0) eVar;
            }
        }
        return null;
    }

    public static final N0 g(N2.e eVar, N2.i iVar, Object obj) {
        if (!(eVar instanceof P2.e) || iVar.d(O0.f7517m) == null) {
            return null;
        }
        N0 n0F = f((P2.e) eVar);
        if (n0F != null) {
            n0F.W0(iVar, obj);
        }
        return n0F;
    }
}
