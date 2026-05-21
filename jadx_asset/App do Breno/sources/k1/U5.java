package k1;

import V0.AbstractC0549h;
import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class U5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9253m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f9254n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1148H f9255o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Bundle f9256p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9257q;

    public U5(C1263m6 c1263m6, boolean z3, x7 x7Var, boolean z4, C1148H c1148h, Bundle bundle) {
        this.f9253m = x7Var;
        this.f9254n = z4;
        this.f9255o = c1148h;
        this.f9256p = bundle;
        this.f9257q = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6 c1263m6 = this.f9257q;
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("Failed to send default event parameters to service");
            return;
        }
        if (c1263m6.f9366a.B().P(null, AbstractC1291q2.f9760m1)) {
            x7 x7Var = this.f9253m;
            AbstractC0549h.j(x7Var);
            this.f9257q.C(interfaceC1306s2, this.f9254n ? null : this.f9255o, x7Var);
            return;
        }
        try {
            x7 x7Var2 = this.f9253m;
            AbstractC0549h.j(x7Var2);
            interfaceC1306s2.l0(this.f9256p, x7Var2);
            c1263m6.T();
        } catch (RemoteException e4) {
            this.f9257q.f9366a.c().r().b("Failed to send default event parameters to service", e4);
        }
    }
}
