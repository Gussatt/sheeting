package l3;

/* JADX INFO: loaded from: classes.dex */
public final class r implements N2.e, P2.e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N2.e f10299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N2.i f10300n;

    public r(N2.e eVar, N2.i iVar) {
        this.f10299m = eVar;
        this.f10300n = iVar;
    }

    @Override // N2.e
    public N2.i b() {
        return this.f10300n;
    }

    @Override // P2.e
    public P2.e i() {
        N2.e eVar = this.f10299m;
        if (eVar instanceof P2.e) {
            return (P2.e) eVar;
        }
        return null;
    }

    @Override // N2.e
    public void p(Object obj) {
        this.f10299m.p(obj);
    }
}
