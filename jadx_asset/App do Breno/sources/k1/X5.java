package k1;

import V0.AbstractC0549h;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class X5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9297n;

    public X5(C1263m6 c1263m6, x7 x7Var) {
        this.f9296m = x7Var;
        this.f9297n = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6 c1263m6 = this.f9297n;
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            x7 x7Var = this.f9296m;
            AbstractC0549h.j(x7Var);
            interfaceC1306s2.f1(x7Var);
            c1263m6.T();
        } catch (RemoteException e4) {
            this.f9297n.f9366a.c().r().b("Failed to send measurementEnabled to the service", e4);
        }
    }
}
