package n1;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC1445l f10639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I f10640n;

    public H(I i4, AbstractC1445l abstractC1445l) {
        this.f10640n = i4;
        this.f10639m = abstractC1445l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC1445l abstractC1445lA = this.f10640n.f10642b.a(this.f10639m.j());
            if (abstractC1445lA == null) {
                this.f10640n.c(new NullPointerException("Continuation returned null"));
                return;
            }
            I i4 = this.f10640n;
            Executor executor = AbstractC1447n.f10660b;
            abstractC1445lA.f(executor, i4);
            abstractC1445lA.d(executor, this.f10640n);
            abstractC1445lA.a(executor, this.f10640n);
        } catch (CancellationException unused) {
            this.f10640n.a();
        } catch (C1443j e4) {
            if (e4.getCause() instanceof Exception) {
                this.f10640n.c((Exception) e4.getCause());
            } else {
                this.f10640n.c(e4);
            }
        } catch (Exception e5) {
            this.f10640n.c(e5);
        }
    }
}
