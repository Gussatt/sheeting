package n1;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: n1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1433A implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10622b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1438e f10623c;

    public C1433A(Executor executor, InterfaceC1438e interfaceC1438e) {
        this.f10621a = executor;
        this.f10623c = interfaceC1438e;
    }

    @Override // n1.J
    public final void d(AbstractC1445l abstractC1445l) {
        if (abstractC1445l.k()) {
            synchronized (this.f10622b) {
                try {
                    if (this.f10623c == null) {
                        return;
                    }
                    this.f10621a.execute(new z(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
