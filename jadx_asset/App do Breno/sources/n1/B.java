package n1;

/* JADX INFO: loaded from: classes.dex */
public final class B implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1445l f10624m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C f10625n;

    public B(C c4, AbstractC1445l abstractC1445l) {
        this.f10625n = c4;
        this.f10624m = abstractC1445l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10625n.f10627b) {
            try {
                C c4 = this.f10625n;
                if (c4.f10628c != null) {
                    c4.f10628c.a(this.f10624m);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
