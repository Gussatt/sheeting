package k1;

import V0.AbstractC0549h;
import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class O5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9186m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x7 f9187n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9188o;

    public O5(C1263m6 c1263m6, AtomicReference atomicReference, x7 x7Var) {
        this.f9186m = atomicReference;
        this.f9187n = x7Var;
        this.f9188o = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1263m6 c1263m6;
        C1363z3 c1363z3;
        AtomicReference atomicReference2 = this.f9186m;
        synchronized (atomicReference2) {
            try {
                try {
                    c1263m6 = this.f9188o;
                    c1363z3 = c1263m6.f9366a;
                } catch (RemoteException e4) {
                    this.f9188o.f9366a.c().r().b("Failed to get app instance id", e4);
                    atomicReference = this.f9186m;
                }
                if (c1363z3.H().t().r(EnumC1221h4.ANALYTICS_STORAGE)) {
                    InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
                    if (interfaceC1306s2 != null) {
                        x7 x7Var = this.f9187n;
                        AbstractC0549h.j(x7Var);
                        atomicReference2.set(interfaceC1306s2.D(x7Var));
                        String str = (String) atomicReference2.get();
                        if (str != null) {
                            c1263m6.f9366a.K().Q(str);
                            c1363z3.H().f9317i.b(str);
                        }
                        c1263m6.T();
                        atomicReference = this.f9186m;
                        atomicReference.notify();
                        return;
                    }
                    c1363z3.c().r().a("Failed to get app instance id");
                    atomicReference2.notify();
                } else {
                    c1363z3.c().x().a("Analytics storage consent denied; will not get app instance id");
                    c1263m6.f9366a.K().Q(null);
                    c1363z3.H().f9317i.b(null);
                    atomicReference2.set(null);
                    atomicReference2.notify();
                }
            } catch (Throwable th) {
                this.f9186m.notify();
                throw th;
            }
        }
    }
}
