package k1;

import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC0887x0;

/* JADX INFO: loaded from: classes.dex */
public final class V5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1150J f9272m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9273n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9274o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9275p;

    public V5(C1263m6 c1263m6, C1150J c1150j, String str, InterfaceC0887x0 interfaceC0887x0) {
        this.f9272m = c1150j;
        this.f9273n = str;
        this.f9274o = interfaceC0887x0;
        this.f9275p = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0887x0 interfaceC0887x0;
        w7 w7VarQ;
        C1263m6 c1263m6;
        InterfaceC1306s2 interfaceC1306s2;
        byte[] bArrT0 = null;
        try {
            try {
                c1263m6 = this.f9275p;
                interfaceC1306s2 = c1263m6.f9585d;
            } catch (RemoteException e4) {
                this.f9275p.f9366a.c().r().b("Failed to send event to the service to bundle", e4);
            }
            if (interfaceC1306s2 == null) {
                C1363z3 c1363z3 = c1263m6.f9366a;
                c1363z3.c().r().a("Discarding data. Failed to send event to service to bundle");
                w7VarQ = c1363z3.Q();
                interfaceC0887x0 = this.f9274o;
                w7VarQ.K(interfaceC0887x0, bArrT0);
            }
            bArrT0 = interfaceC1306s2.t0(this.f9272m, this.f9273n);
            c1263m6.T();
            C1263m6 c1263m62 = this.f9275p;
            interfaceC0887x0 = this.f9274o;
            w7VarQ = c1263m62.f9366a.Q();
            w7VarQ.K(interfaceC0887x0, bArrT0);
        } catch (Throwable th) {
            C1263m6 c1263m63 = this.f9275p;
            c1263m63.f9366a.Q().K(this.f9274o, null);
            throw th;
        }
    }
}
