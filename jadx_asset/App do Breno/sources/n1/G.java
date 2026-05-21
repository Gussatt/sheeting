package n1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class G implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10637b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1441h f10638c;

    public G(Executor executor, InterfaceC1441h interfaceC1441h) {
        this.f10636a = executor;
        this.f10638c = interfaceC1441h;
    }

    @Override // n1.J
    public final void d(AbstractC1445l abstractC1445l) {
        if (abstractC1445l.m()) {
            synchronized (this.f10637b) {
                try {
                    if (this.f10638c == null) {
                        return;
                    }
                    this.f10636a.execute(new F(this, abstractC1445l));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
