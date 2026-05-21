package k1;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class L5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9132n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s7 f9133o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9134p;

    public L5(C1263m6 c1263m6, x7 x7Var, boolean z3, s7 s7Var) {
        this.f9131m = x7Var;
        this.f9132n = z3;
        this.f9133o = s7Var;
        this.f9134p = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6 c1263m6 = this.f9134p;
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("Discarding data. Failed to set user property");
            return;
        }
        x7 x7Var = this.f9131m;
        AbstractC0549h.j(x7Var);
        c1263m6.C(interfaceC1306s2, this.f9132n ? null : this.f9133o, x7Var);
        c1263m6.T();
    }
}
