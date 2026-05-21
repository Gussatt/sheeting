package n1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class x implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1445l f10677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y f10678n;

    public x(y yVar, AbstractC1445l abstractC1445l) {
        this.f10678n = yVar;
        this.f10677m = abstractC1445l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC1445l abstractC1445l = (AbstractC1445l) this.f10678n.f10680b.a(this.f10677m);
            if (abstractC1445l == null) {
                this.f10678n.c(new NullPointerException("Continuation returned null"));
                return;
            }
            y yVar = this.f10678n;
            Executor executor = AbstractC1447n.f10660b;
            abstractC1445l.f(executor, yVar);
            abstractC1445l.d(executor, this.f10678n);
            abstractC1445l.a(executor, this.f10678n);
        } catch (C1443j e4) {
            if (e4.getCause() instanceof Exception) {
                this.f10678n.f10681c.p((Exception) e4.getCause());
            } else {
                this.f10678n.f10681c.p(e4);
            }
        } catch (Exception e5) {
            this.f10678n.f10681c.p(e5);
        }
    }
}
