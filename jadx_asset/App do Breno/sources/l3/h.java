package l3;

/* JADX INFO: loaded from: classes.dex */
public final class h extends g {
    public /* synthetic */ h(k3.d dVar, N2.i iVar, int i4, j3.a aVar, int i5, X2.g gVar) {
        this(dVar, (i5 & 2) != 0 ? N2.j.f2823m : iVar, (i5 & 4) != 0 ? -3 : i4, (i5 & 8) != 0 ? j3.a.SUSPEND : aVar);
    }

    @Override // l3.e
    public e g(N2.i iVar, int i4, j3.a aVar) {
        return new h(this.f10278p, iVar, i4, aVar);
    }

    @Override // l3.g
    public Object n(k3.e eVar, N2.e eVar2) {
        Object objB = this.f10278p.b(eVar, eVar2);
        return objB == O2.c.c() ? objB : K2.p.f2516a;
    }

    public h(k3.d dVar, N2.i iVar, int i4, j3.a aVar) {
        super(dVar, iVar, i4, aVar);
    }
}
