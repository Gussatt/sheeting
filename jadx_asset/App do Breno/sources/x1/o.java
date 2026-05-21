package x1;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import x1.p;

/* JADX INFO: loaded from: classes.dex */
public class o implements ScheduledExecutorService {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ExecutorService f11975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ScheduledExecutorService f11976n;

    public o(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f11975m = executorService;
        this.f11976n = scheduledExecutorService;
    }

    public static /* synthetic */ void e(Callable callable, p.b bVar) {
        try {
            bVar.set(callable.call());
        } catch (Exception e4) {
            bVar.a(e4);
        }
    }

    public static /* synthetic */ void f(Runnable runnable, p.b bVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e4) {
            bVar.a(e4);
            throw e4;
        }
    }

    public static /* synthetic */ void k(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
        } catch (Exception e4) {
            bVar.a(e4);
        }
    }

    public static /* synthetic */ void q(Runnable runnable, p.b bVar) {
        try {
            runnable.run();
            bVar.set(null);
        } catch (Exception e4) {
            bVar.a(e4);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j4, TimeUnit timeUnit) {
        return this.f11975m.awaitTermination(j4, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f11975m.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f11975m.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f11975m.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f11975m.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f11975m.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j4, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: x1.c
            @Override // x1.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f11937a;
                return oVar.f11976n.schedule(new Runnable() { // from class: x1.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f11975m.execute(new Runnable() { // from class: x1.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.q(runnable, bVar);
                            }
                        });
                    }
                }, j4, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j4, final long j5, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: x1.f
            @Override // x1.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f11945a;
                return oVar.f11976n.scheduleAtFixedRate(new Runnable() { // from class: x1.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f11975m.execute(new Runnable() { // from class: x1.d
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                o.f(runnable, bVar);
                            }
                        });
                    }
                }, j4, j5, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j4, final long j5, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: x1.g
            @Override // x1.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f11950a;
                return oVar.f11976n.scheduleWithFixedDelay(new Runnable() { // from class: x1.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        oVar.f11975m.execute(new Runnable() { // from class: x1.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.k(runnable, bVar);
                            }
                        });
                    }
                }, j4, j5, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f11975m.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f11975m.invokeAll(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j4, TimeUnit timeUnit) {
        return this.f11975m.invokeAny(collection, j4, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j4, final TimeUnit timeUnit) {
        return new p(new p.c() { // from class: x1.h
            @Override // x1.p.c
            public final ScheduledFuture a(p.b bVar) {
                o oVar = this.f11955a;
                return oVar.f11976n.schedule(new Callable() { // from class: x1.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return oVar.f11975m.submit(new Runnable() { // from class: x1.n
                            @Override // java.lang.Runnable
                            public final void run() {
                                o.e(callable, bVar);
                            }
                        });
                    }
                }, j4, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f11975m.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f11975m.submit(runnable);
    }
}
