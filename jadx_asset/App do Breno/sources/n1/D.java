package n1;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1445l f10629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E f10630n;

    public D(E e4, AbstractC1445l abstractC1445l) {
        this.f10630n = e4;
        this.f10629m = abstractC1445l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10630n.f10632b) {
            try {
                E e4 = this.f10630n;
                if (e4.f10633c != null) {
                    e4.f10633c.c((Exception) AbstractC0549h.j(this.f10629m.i()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
