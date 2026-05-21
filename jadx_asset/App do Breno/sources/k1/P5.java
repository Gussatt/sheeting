package k1;

import V0.AbstractC0549h;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC0887x0;

/* JADX INFO: loaded from: classes.dex */
public final class P5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9196m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9197n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9198o;

    public P5(C1263m6 c1263m6, x7 x7Var, InterfaceC0887x0 interfaceC0887x0) {
        this.f9196m = x7Var;
        this.f9197n = interfaceC0887x0;
        this.f9198o = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0887x0 interfaceC0887x0;
        w7 w7VarQ;
        C1263m6 c1263m6;
        C1363z3 c1363z3;
        String strD = null;
        try {
            try {
                c1263m6 = this.f9198o;
                c1363z3 = c1263m6.f9366a;
            } catch (RemoteException e4) {
                this.f9198o.f9366a.c().r().b("Failed to get app instance id", e4);
            }
            if (c1363z3.H().t().r(EnumC1221h4.ANALYTICS_STORAGE)) {
                InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
                if (interfaceC1306s2 != null) {
                    x7 x7Var = this.f9196m;
                    AbstractC0549h.j(x7Var);
                    strD = interfaceC1306s2.D(x7Var);
                    if (strD != null) {
                        c1263m6.f9366a.K().Q(strD);
                        c1363z3.H().f9317i.b(strD);
                    }
                    c1263m6.T();
                    C1263m6 c1263m62 = this.f9198o;
                    interfaceC0887x0 = this.f9197n;
                    w7VarQ = c1263m62.f9366a.Q();
                    w7VarQ.N(interfaceC0887x0, strD);
                }
                c1363z3.c().r().a("Failed to get app instance id");
            } else {
                c1363z3.c().x().a("Analytics storage consent denied; will not get app instance id");
                c1263m6.f9366a.K().Q(null);
                c1363z3.H().f9317i.b(null);
            }
            w7VarQ = c1363z3.Q();
            interfaceC0887x0 = this.f9197n;
            w7VarQ.N(interfaceC0887x0, strD);
        } catch (Throwable th) {
            C1263m6 c1263m63 = this.f9198o;
            c1263m63.f9366a.Q().N(this.f9197n, null);
            throw th;
        }
    }
}
