package h3;

/* JADX INFO: loaded from: classes.dex */
public final class N0 extends m3.B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ThreadLocal f7514q;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public N0(N2.i iVar, N2.e eVar) {
        O0 o02 = O0.f7517m;
        super(iVar.d(o02) == null ? iVar.D(o02) : iVar, eVar);
        this.f7514q = new ThreadLocal();
        if (eVar.b().d(N2.f.f2821a) instanceof F) {
            return;
        }
        Object objC = m3.J.c(iVar, null);
        m3.J.a(iVar, objC);
        W0(iVar, objC);
    }

    @Override // m3.B, h3.AbstractC0994a
    public void R0(Object obj) {
        if (this.threadLocalIsSet) {
            K2.i iVar = (K2.i) this.f7514q.get();
            if (iVar != null) {
                m3.J.a((N2.i) iVar.a(), iVar.b());
            }
            this.f7514q.remove();
        }
        Object objA = D.a(obj, this.f10512p);
        N2.e eVar = this.f10512p;
        N2.i iVarB = eVar.b();
        Object objC = m3.J.c(iVarB, null);
        N0 n0G = objC != m3.J.f10520a ? E.g(eVar, iVarB, objC) : null;
        try {
            this.f10512p.p(objA);
            K2.p pVar = K2.p.f2516a;
            if (n0G == null || n0G.V0()) {
                m3.J.a(iVarB, objC);
            }
        } catch (Throwable th) {
            if (n0G == null || n0G.V0()) {
                m3.J.a(iVarB, objC);
            }
            throw th;
        }
    }

    public final boolean V0() {
        boolean z3 = this.threadLocalIsSet && this.f7514q.get() == null;
        this.f7514q.remove();
        return !z3;
    }

    public final void W0(N2.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f7514q.set(K2.m.a(iVar, obj));
    }
}
