package k1;

import V0.AbstractC0549h;

/* JADX INFO: renamed from: k1.a6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1161a6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1232j f9358o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9359p;

    public RunnableC1161a6(C1263m6 c1263m6, boolean z3, x7 x7Var, boolean z4, C1232j c1232j, C1232j c1232j2) {
        this.f9356m = x7Var;
        this.f9357n = z4;
        this.f9358o = c1232j;
        this.f9359p = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6 c1263m6 = this.f9359p;
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        x7 x7Var = this.f9356m;
        AbstractC0549h.j(x7Var);
        c1263m6.C(interfaceC1306s2, this.f9357n ? null : this.f9358o, x7Var);
        c1263m6.T();
    }
}
