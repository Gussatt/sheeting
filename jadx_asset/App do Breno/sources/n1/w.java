package n1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1436c f10675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f10676c;

    public w(Executor executor, InterfaceC1436c interfaceC1436c, O o4) {
        this.f10674a = executor;
        this.f10675b = interfaceC1436c;
        this.f10676c = o4;
    }

    @Override // n1.J
    public final void d(AbstractC1445l abstractC1445l) {
        this.f10674a.execute(new v(this, abstractC1445l));
    }
}
