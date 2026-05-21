package k1;

import V0.AbstractC0549h;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class Q5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9206m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9207n;

    public Q5(C1263m6 c1263m6, x7 x7Var, boolean z3) {
        this.f9206m = x7Var;
        this.f9207n = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6 c1263m6 = this.f9207n;
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            x7 x7Var = this.f9206m;
            AbstractC0549h.j(x7Var);
            C1363z3 c1363z3 = c1263m6.f9366a;
            C1264n c1264nB = c1363z3.B();
            C1275o2 c1275o2 = AbstractC1291q2.f9760m1;
            if (c1264nB.P(null, c1275o2)) {
                c1263m6.C(interfaceC1306s2, null, x7Var);
            }
            interfaceC1306s2.T(x7Var);
            c1263m6.f9366a.E().t();
            c1363z3.B().P(null, c1275o2);
            c1263m6.C(interfaceC1306s2, null, x7Var);
            c1263m6.T();
        } catch (RemoteException e4) {
            this.f9207n.f9366a.c().r().b("Failed to send app launch to the service", e4);
        }
    }
}
