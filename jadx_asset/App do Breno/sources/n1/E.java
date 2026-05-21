package n1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class E implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10632b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1440g f10633c;

    public E(Executor executor, InterfaceC1440g interfaceC1440g) {
        this.f10631a = executor;
        this.f10633c = interfaceC1440g;
    }

    @Override // n1.J
    public final void d(AbstractC1445l abstractC1445l) {
        if (abstractC1445l.m() || abstractC1445l.k()) {
            return;
        }
        synchronized (this.f10632b) {
            try {
                if (this.f10633c == null) {
                    return;
                }
                this.f10631a.execute(new D(this, abstractC1445l));
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
