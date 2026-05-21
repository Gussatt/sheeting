package n1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class I implements InterfaceC1441h, InterfaceC1440g, InterfaceC1438e, J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1444k f10642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f10643c;

    public I(Executor executor, InterfaceC1444k interfaceC1444k, O o4) {
        this.f10641a = executor;
        this.f10642b = interfaceC1444k;
        this.f10643c = o4;
    }

    @Override // n1.InterfaceC1438e
    public final void a() {
        this.f10643c.r();
    }

    @Override // n1.InterfaceC1441h
    public final void b(Object obj) {
        this.f10643c.q(obj);
    }

    @Override // n1.InterfaceC1440g
    public final void c(Exception exc) {
        this.f10643c.p(exc);
    }

    @Override // n1.J
    public final void d(AbstractC1445l abstractC1445l) {
        this.f10641a.execute(new H(this, abstractC1445l));
    }
}
