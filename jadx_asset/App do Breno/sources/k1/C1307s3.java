package k1;

import V0.AbstractC0549h;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k1.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1307s3 extends AbstractC1177c4 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicLong f9823l = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1299r3 f9824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1299r3 f9825d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PriorityBlockingQueue f9826e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f9827f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f9828g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f9829h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f9830i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Semaphore f9831j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public volatile boolean f9832k;

    public C1307s3(C1363z3 c1363z3) {
        super(c1363z3);
        this.f9830i = new Object();
        this.f9831j = new Semaphore(2);
        this.f9826e = new PriorityBlockingQueue();
        this.f9827f = new LinkedBlockingQueue();
        this.f9828g = new C1284p3(this, "Thread death: Uncaught exception on worker thread");
        this.f9829h = new C1284p3(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* bridge */ /* synthetic */ boolean C(C1307s3 c1307s3) {
        boolean z3 = c1307s3.f9832k;
        return false;
    }

    public final void A(Runnable runnable) {
        k();
        AbstractC0549h.j(runnable);
        F(new C1292q3(this, runnable, false, "Task exception on worker thread"));
    }

    public final void B(Runnable runnable) {
        k();
        AbstractC0549h.j(runnable);
        F(new C1292q3(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean D() {
        return Thread.currentThread() == this.f9825d;
    }

    public final boolean E() {
        return Thread.currentThread() == this.f9824c;
    }

    public final void F(C1292q3 c1292q3) {
        synchronized (this.f9830i) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.f9826e;
                priorityBlockingQueue.add(c1292q3);
                C1299r3 c1299r3 = this.f9824c;
                if (c1299r3 == null) {
                    C1299r3 c1299r32 = new C1299r3(this, "Measurement Worker", priorityBlockingQueue);
                    this.f9824c = c1299r32;
                    c1299r32.setUncaughtExceptionHandler(this.f9828g);
                    this.f9824c.start();
                } else {
                    c1299r3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k1.AbstractC1168b4
    public final void g() {
        if (Thread.currentThread() != this.f9825d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // k1.AbstractC1168b4
    public final void h() {
        if (Thread.currentThread() != this.f9824c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // k1.AbstractC1177c4
    public final boolean j() {
        return false;
    }

    public final Object r(AtomicReference atomicReference, long j4, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f9366a.e().A(runnable);
            try {
                atomicReference.wait(j4);
            } catch (InterruptedException unused) {
                this.f9366a.c().w().a("Interrupted waiting for " + str);
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            this.f9366a.c().w().a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final Future s(Callable callable) {
        k();
        AbstractC0549h.j(callable);
        C1292q3 c1292q3 = new C1292q3(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() != this.f9824c) {
            F(c1292q3);
            return c1292q3;
        }
        if (!this.f9826e.isEmpty()) {
            this.f9366a.c().w().a("Callable skipped the worker queue.");
        }
        c1292q3.run();
        return c1292q3;
    }

    public final Future t(Callable callable) {
        k();
        AbstractC0549h.j(callable);
        C1292q3 c1292q3 = new C1292q3(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f9824c) {
            c1292q3.run();
            return c1292q3;
        }
        F(c1292q3);
        return c1292q3;
    }

    public final void y() {
        if (Thread.currentThread() == this.f9824c) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final void z(Runnable runnable) {
        k();
        AbstractC0549h.j(runnable);
        C1292q3 c1292q3 = new C1292q3(this, runnable, false, "Task exception on network thread");
        synchronized (this.f9830i) {
            try {
                BlockingQueue blockingQueue = this.f9827f;
                blockingQueue.add(c1292q3);
                C1299r3 c1299r3 = this.f9825d;
                if (c1299r3 == null) {
                    C1299r3 c1299r32 = new C1299r3(this, "Measurement Network", blockingQueue);
                    this.f9825d = c1299r32;
                    c1299r32.setUncaughtExceptionHandler(this.f9829h);
                    this.f9825d.start();
                } else {
                    c1299r3.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
