package k1;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class Z5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9340m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9341n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1150J f9342o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9343p;

    public Z5(C1263m6 c1263m6, boolean z3, x7 x7Var, boolean z4, C1150J c1150j, String str) {
        this.f9340m = x7Var;
        this.f9341n = z4;
        this.f9342o = c1150j;
        this.f9343p = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6 c1263m6 = this.f9343p;
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("Discarding data. Failed to send event to service");
            return;
        }
        x7 x7Var = this.f9340m;
        AbstractC0549h.j(x7Var);
        c1263m6.C(interfaceC1306s2, this.f9341n ? null : this.f9342o, x7Var);
        c1263m6.T();
    }
}
