package k1;

/* JADX INFO: renamed from: k1.e6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1197e6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1306s2 f9413m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1255l6 f9414n;

    public RunnableC1197e6(ServiceConnectionC1255l6 serviceConnectionC1255l6, InterfaceC1306s2 interfaceC1306s2) {
        this.f9413m = interfaceC1306s2;
        this.f9414n = serviceConnectionC1255l6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC1255l6 serviceConnectionC1255l6 = this.f9414n;
        synchronized (serviceConnectionC1255l6) {
            try {
                serviceConnectionC1255l6.f9535a = false;
                C1263m6 c1263m6 = serviceConnectionC1255l6.f9537c;
                if (!c1263m6.N()) {
                    c1263m6.f9366a.c().v().a("Connected to service");
                    c1263m6.J(this.f9413m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
