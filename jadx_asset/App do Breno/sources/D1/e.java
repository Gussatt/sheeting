package D1;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.InterfaceC1436c;

/* JADX INFO: loaded from: classes.dex */
public class e implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ExecutorService f872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f873n = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC1445l f874o = AbstractC1448o.e(null);

    public e(ExecutorService executorService) {
        this.f872m = executorService;
    }

    public static /* synthetic */ AbstractC1445l a(Runnable runnable, AbstractC1445l abstractC1445l) {
        runnable.run();
        return AbstractC1448o.e(null);
    }

    public static /* synthetic */ AbstractC1445l b(Callable callable, AbstractC1445l abstractC1445l) {
        return (AbstractC1445l) callable.call();
    }

    public ExecutorService c() {
        return this.f872m;
    }

    public AbstractC1445l d(final Runnable runnable) {
        AbstractC1445l abstractC1445lH;
        synchronized (this.f873n) {
            abstractC1445lH = this.f874o.h(this.f872m, new InterfaceC1436c() { // from class: D1.d
                @Override // n1.InterfaceC1436c
                public final Object a(AbstractC1445l abstractC1445l) {
                    return e.a(runnable, abstractC1445l);
                }
            });
            this.f874o = abstractC1445lH;
        }
        return abstractC1445lH;
    }

    public AbstractC1445l e(final Callable callable) {
        AbstractC1445l abstractC1445lH;
        synchronized (this.f873n) {
            abstractC1445lH = this.f874o.h(this.f872m, new InterfaceC1436c() { // from class: D1.c
                @Override // n1.InterfaceC1436c
                public final Object a(AbstractC1445l abstractC1445l) {
                    return e.b(callable, abstractC1445l);
                }
            });
            this.f874o = abstractC1445lH;
        }
        return abstractC1445lH;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f872m.execute(runnable);
    }
}
