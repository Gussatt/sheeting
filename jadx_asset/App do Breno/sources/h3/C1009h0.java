package h3;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import m3.AbstractC1418c;

/* JADX INFO: renamed from: h3.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1009h0 extends AbstractC1007g0 implements S {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Executor f7542p;

    public C1009h0(Executor executor) {
        this.f7542p = executor;
        AbstractC1418c.a(V());
    }

    @Override // h3.F
    public void R(N2.i iVar, Runnable runnable) {
        try {
            Executor executorV = V();
            AbstractC0998c.a();
            executorV.execute(runnable);
        } catch (RejectedExecutionException e4) {
            AbstractC0998c.a();
            U(iVar, e4);
            W.b().R(iVar, runnable);
        }
    }

    public final void U(N2.i iVar, RejectedExecutionException rejectedExecutionException) {
        u0.c(iVar, AbstractC1005f0.a("The task was rejected", rejectedExecutionException));
    }

    public Executor V() {
        return this.f7542p;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorV = V();
        ExecutorService executorService = executorV instanceof ExecutorService ? (ExecutorService) executorV : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1009h0) && ((C1009h0) obj).V() == V();
    }

    public int hashCode() {
        return System.identityHashCode(V());
    }

    @Override // h3.F
    public String toString() {
        return V().toString();
    }
}
