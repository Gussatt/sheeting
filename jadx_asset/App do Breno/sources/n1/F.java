package n1;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1445l f10634m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ G f10635n;

    public F(G g4, AbstractC1445l abstractC1445l) {
        this.f10635n = g4;
        this.f10634m = abstractC1445l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10635n.f10637b) {
            try {
                G g4 = this.f10635n;
                if (g4.f10638c != null) {
                    g4.f10638c.b(this.f10634m.j());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
