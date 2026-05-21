package h3;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0997b0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final N f7512u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f7513v;

    static {
        Long l4;
        N n4 = new N();
        f7512u = n4;
        AbstractC0995a0.a0(n4, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f7513v = timeUnit.toNanos(l4.longValue());
    }

    @Override // h3.AbstractC0999c0
    public Thread g0() {
        Thread thread = _thread;
        return thread == null ? r0() : thread;
    }

    @Override // h3.AbstractC0997b0
    public void k0(Runnable runnable) {
        if (s0()) {
            v0();
        }
        super.k0(runnable);
    }

    public final synchronized void q0() {
        if (t0()) {
            debugStatus = 3;
            o0();
            X2.l.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread r0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM0;
        L0.f7509a.d(this);
        AbstractC0998c.a();
        try {
            if (!u0()) {
                if (zM0) {
                    return;
                } else {
                    return;
                }
            }
            long j4 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long jD0 = d0();
                if (jD0 == Long.MAX_VALUE) {
                    AbstractC0998c.a();
                    long jNanoTime = System.nanoTime();
                    if (j4 == Long.MAX_VALUE) {
                        j4 = f7513v + jNanoTime;
                    }
                    long j5 = j4 - jNanoTime;
                    if (j5 <= 0) {
                        _thread = null;
                        q0();
                        AbstractC0998c.a();
                        if (m0()) {
                            return;
                        }
                        g0();
                        return;
                    }
                    jD0 = c3.e.c(jD0, j5);
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (jD0 > 0) {
                    if (t0()) {
                        _thread = null;
                        q0();
                        AbstractC0998c.a();
                        if (m0()) {
                            return;
                        }
                        g0();
                        return;
                    }
                    AbstractC0998c.a();
                    LockSupport.parkNanos(this, jD0);
                }
            }
        } finally {
            _thread = null;
            q0();
            AbstractC0998c.a();
            if (!m0()) {
                g0();
            }
        }
    }

    public final boolean s0() {
        return debugStatus == 4;
    }

    @Override // h3.AbstractC0997b0, h3.AbstractC0995a0
    public void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    public final boolean t0() {
        int i4 = debugStatus;
        return i4 == 2 || i4 == 3;
    }

    public final synchronized boolean u0() {
        if (t0()) {
            return false;
        }
        debugStatus = 1;
        X2.l.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void v0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }
}
