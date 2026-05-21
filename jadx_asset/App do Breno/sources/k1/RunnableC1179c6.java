package k1;

import V0.AbstractC0549h;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import java.util.ArrayList;

/* JADX INFO: renamed from: k1.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1179c6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x7 f9389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9391q;

    public RunnableC1179c6(C1263m6 c1263m6, String str, String str2, x7 x7Var, InterfaceC0887x0 interfaceC0887x0) {
        this.f9387m = str;
        this.f9388n = str2;
        this.f9389o = x7Var;
        this.f9390p = interfaceC0887x0;
        this.f9391q = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0887x0 interfaceC0887x0;
        w7 w7VarQ;
        C1263m6 c1263m6;
        InterfaceC1306s2 interfaceC1306s2;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                c1263m6 = this.f9391q;
                interfaceC1306s2 = c1263m6.f9585d;
            } catch (RemoteException e4) {
                this.f9391q.f9366a.c().r().d("Failed to get conditional properties; remote exception", this.f9387m, this.f9388n, e4);
            }
            if (interfaceC1306s2 == null) {
                C1363z3 c1363z3 = c1263m6.f9366a;
                c1363z3.c().r().c("Failed to get conditional properties; not connected to service", this.f9387m, this.f9388n);
                w7VarQ = c1363z3.Q();
                interfaceC0887x0 = this.f9390p;
                w7VarQ.I(interfaceC0887x0, arrayList);
            }
            x7 x7Var = this.f9389o;
            AbstractC0549h.j(x7Var);
            arrayList = w7.y(interfaceC1306s2.h1(this.f9387m, this.f9388n, x7Var));
            c1263m6.T();
            C1263m6 c1263m62 = this.f9391q;
            interfaceC0887x0 = this.f9390p;
            w7VarQ = c1263m62.f9366a.Q();
            w7VarQ.I(interfaceC0887x0, arrayList);
        } catch (Throwable th) {
            C1263m6 c1263m63 = this.f9391q;
            c1263m63.f9366a.Q().I(this.f9390p, arrayList);
            throw th;
        }
    }
}
