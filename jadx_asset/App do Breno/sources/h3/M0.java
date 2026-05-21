package h3;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends F {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M0 f7511o = new M0();

    @Override // h3.F
    public void R(N2.i iVar, Runnable runnable) {
        i.d.a(iVar.d(Q0.f7518n));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // h3.F
    public boolean S(N2.i iVar) {
        return false;
    }

    @Override // h3.F
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
