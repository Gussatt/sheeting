package k1;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes.dex */
public final class T5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1333v5 f9241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9242n;

    public T5(C1263m6 c1263m6, C1333v5 c1333v5) {
        this.f9241m = c1333v5;
        this.f9242n = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6 c1263m6 = this.f9242n;
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("Failed to send current screen to service");
            return;
        }
        try {
            C1333v5 c1333v5 = this.f9241m;
            if (c1333v5 == null) {
                interfaceC1306s2.j1(0L, null, null, c1263m6.f9366a.d().getPackageName());
            } else {
                interfaceC1306s2.j1(c1333v5.f9887c, c1333v5.f9885a, c1333v5.f9886b, c1263m6.f9366a.d().getPackageName());
            }
            c1263m6.T();
        } catch (RemoteException e4) {
            this.f9242n.f9366a.c().r().b("Failed to send current screen to the service", e4);
        }
    }
}
