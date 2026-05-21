package n1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class C implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10627b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1439f f10628c;

    public C(Executor executor, InterfaceC1439f interfaceC1439f) {
        this.f10626a = executor;
        this.f10628c = interfaceC1439f;
    }

    @Override // n1.J
    public final void d(AbstractC1445l abstractC1445l) {
        synchronized (this.f10627b) {
            try {
                if (this.f10628c == null) {
                    return;
                }
                this.f10626a.execute(new B(this, abstractC1445l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
