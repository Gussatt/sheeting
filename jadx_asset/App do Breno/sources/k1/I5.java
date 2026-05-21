package k1;

import V0.AbstractC0549h;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9081m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9082n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ x7 f9083o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f9084p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9085q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9086r;

    public I5(C1263m6 c1263m6, String str, String str2, x7 x7Var, boolean z3, InterfaceC0887x0 interfaceC0887x0) {
        this.f9081m = str;
        this.f9082n = str2;
        this.f9083o = x7Var;
        this.f9084p = z3;
        this.f9085q = interfaceC0887x0;
        this.f9086r = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundle;
        RemoteException e4;
        Bundle bundle2 = new Bundle();
        try {
            C1263m6 c1263m6 = this.f9086r;
            InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
            if (interfaceC1306s2 == null) {
                C1363z3 c1363z3 = c1263m6.f9366a;
                c1363z3.c().r().c("Failed to get user properties; not connected to service", this.f9081m, this.f9082n);
                c1363z3.Q().J(this.f9085q, bundle2);
                return;
            }
            x7 x7Var = this.f9083o;
            AbstractC0549h.j(x7Var);
            List<s7> listF = interfaceC1306s2.F(this.f9081m, this.f9082n, this.f9084p, x7Var);
            String[] strArr = w7.f9902i;
            bundle = new Bundle();
            if (listF != null) {
                for (s7 s7Var : listF) {
                    String str = s7Var.f9848q;
                    if (str != null) {
                        bundle.putString(s7Var.f9845n, str);
                    } else {
                        Long l4 = s7Var.f9847p;
                        if (l4 != null) {
                            bundle.putLong(s7Var.f9845n, l4.longValue());
                        } else {
                            Double d4 = s7Var.f9850s;
                            if (d4 != null) {
                                bundle.putDouble(s7Var.f9845n, d4.doubleValue());
                            }
                        }
                    }
                }
            }
            try {
                try {
                    c1263m6.T();
                    C1363z3 c1363z32 = c1263m6.f9366a;
                    c1363z32.Q().J(this.f9085q, bundle);
                } catch (RemoteException e5) {
                    e4 = e5;
                    this.f9086r.f9366a.c().r().c("Failed to get user properties; remote exception", this.f9081m, e4);
                    C1263m6 c1263m62 = this.f9086r;
                    c1263m62.f9366a.Q().J(this.f9085q, bundle);
                }
            } catch (Throwable th) {
                th = th;
                bundle2 = bundle;
                C1263m6 c1263m63 = this.f9086r;
                c1263m63.f9366a.Q().J(this.f9085q, bundle2);
                throw th;
            }
        } catch (RemoteException e6) {
            bundle = bundle2;
            e4 = e6;
        } catch (Throwable th2) {
            th = th2;
            C1263m6 c1263m632 = this.f9086r;
            c1263m632.f9366a.Q().J(this.f9085q, bundle2);
            throw th;
        }
    }
}
