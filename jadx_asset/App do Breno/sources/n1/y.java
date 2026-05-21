package n1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class y implements InterfaceC1441h, InterfaceC1440g, InterfaceC1438e, J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1436c f10680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f10681c;

    public y(Executor executor, InterfaceC1436c interfaceC1436c, O o4) {
        this.f10679a = executor;
        this.f10680b = interfaceC1436c;
        this.f10681c = o4;
    }

    @Override // n1.InterfaceC1438e
    public final void a() {
        this.f10681c.r();
    }

    @Override // n1.InterfaceC1441h
    public final void b(Object obj) {
        this.f10681c.q(obj);
    }

    @Override // n1.InterfaceC1440g
    public final void c(Exception exc) {
        this.f10681c.p(exc);
    }

    @Override // n1.J
    public final void d(AbstractC1445l abstractC1445l) {
        this.f10679a.execute(new x(this, abstractC1445l));
    }
}
