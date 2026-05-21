package k3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends l3.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final W2.p f10057p;

    public c(W2.p pVar, N2.i iVar, int i4, j3.a aVar) {
        super(iVar, i4, aVar);
        this.f10057p = pVar;
    }

    public static /* synthetic */ Object k(c cVar, j3.r rVar, N2.e eVar) {
        Object objJ = cVar.f10057p.j(rVar, eVar);
        return objJ == O2.c.c() ? objJ : K2.p.f2516a;
    }

    @Override // l3.e
    public Object f(j3.r rVar, N2.e eVar) {
        return k(this, rVar, eVar);
    }

    @Override // l3.e
    public String toString() {
        return "block[" + this.f10057p + "] -> " + super.toString();
    }
}
