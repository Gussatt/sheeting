package k1;

/* JADX INFO: renamed from: k1.g6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1215g6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1306s2 f9447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1255l6 f9448n;

    public RunnableC1215g6(ServiceConnectionC1255l6 serviceConnectionC1255l6, InterfaceC1306s2 interfaceC1306s2) {
        this.f9447m = interfaceC1306s2;
        this.f9448n = serviceConnectionC1255l6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC1255l6 serviceConnectionC1255l6 = this.f9448n;
        synchronized (serviceConnectionC1255l6) {
            try {
                serviceConnectionC1255l6.f9535a = false;
                C1263m6 c1263m6 = serviceConnectionC1255l6.f9537c;
                if (!c1263m6.N()) {
                    c1263m6.f9366a.c().q().a("Connected to remote service");
                    c1263m6.J(this.f9447m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        C1263m6 c1263m62 = this.f9448n.f9537c;
        if (!c1263m62.f9366a.B().P(null, AbstractC1291q2.f9769p1) || c1263m62.f9588g == null) {
            return;
        }
        c1263m62.f9588g.shutdownNow();
        c1263m62.f9588g = null;
    }
}
