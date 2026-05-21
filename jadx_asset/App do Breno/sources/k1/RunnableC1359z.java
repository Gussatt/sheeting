package k1;

/* JADX INFO: renamed from: k1.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1359z implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1186d4 f9986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1141A f9987n;

    public RunnableC1359z(AbstractC1141A abstractC1141A, InterfaceC1186d4 interfaceC1186d4) {
        this.f9986m = interfaceC1186d4;
        this.f9987n = abstractC1141A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC1186d4 interfaceC1186d4 = this.f9986m;
        interfaceC1186d4.b();
        if (C1208g.a()) {
            interfaceC1186d4.e().A(this);
            return;
        }
        AbstractC1141A abstractC1141A = this.f9987n;
        boolean zE = abstractC1141A.e();
        abstractC1141A.f8876c = 0L;
        if (zE) {
            abstractC1141A.c();
        }
    }
}
