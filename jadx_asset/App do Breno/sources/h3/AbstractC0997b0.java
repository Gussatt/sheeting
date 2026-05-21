package h3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC1489b;

/* JADX INFO: renamed from: h3.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0997b0 extends AbstractC0999c0 implements S {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7531r = AtomicReferenceFieldUpdater.newUpdater(AbstractC0997b0.class, Object.class, "_queue");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7532s = AtomicReferenceFieldUpdater.newUpdater(AbstractC0997b0.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7533t = AtomicIntegerFieldUpdater.newUpdater(AbstractC0997b0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* JADX INFO: renamed from: h3.b0$a */
    public static final class a extends m3.L {
    }

    private final boolean G() {
        return f7533t.get(this) != 0;
    }

    @Override // h3.F
    public final void R(N2.i iVar, Runnable runnable) {
        k0(runnable);
    }

    @Override // h3.AbstractC0995a0
    public long Y() {
        if (super.Y() == 0) {
            return 0L;
        }
        Object obj = f7531r.get(this);
        if (obj != null) {
            if (!(obj instanceof m3.s)) {
                return obj == AbstractC1003e0.f7538b ? Long.MAX_VALUE : 0L;
            }
            if (!((m3.s) obj).g()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    @Override // h3.AbstractC0995a0
    public long d0() {
        if (e0()) {
            return 0L;
        }
        Runnable runnableJ0 = j0();
        if (runnableJ0 == null) {
            return Y();
        }
        runnableJ0.run();
        return 0L;
    }

    public final void i0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7531r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (AbstractC1489b.a(f7531r, this, null, AbstractC1003e0.f7538b)) {
                    return;
                }
            } else if (obj instanceof m3.s) {
                ((m3.s) obj).d();
                return;
            } else {
                if (obj == AbstractC1003e0.f7538b) {
                    return;
                }
                m3.s sVar = new m3.s(8, true);
                X2.l.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (AbstractC1489b.a(f7531r, this, obj, sVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable j0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7531r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof m3.s) {
                X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                m3.s sVar = (m3.s) obj;
                Object objJ = sVar.j();
                if (objJ != m3.s.f10565h) {
                    return (Runnable) objJ;
                }
                AbstractC1489b.a(f7531r, this, obj, sVar.i());
            } else {
                if (obj == AbstractC1003e0.f7538b) {
                    return null;
                }
                if (AbstractC1489b.a(f7531r, this, obj, null)) {
                    X2.l.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void k0(Runnable runnable) {
        if (l0(runnable)) {
            h0();
        } else {
            N.f7512u.k0(runnable);
        }
    }

    public final boolean l0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7531r;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (G()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC1489b.a(f7531r, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof m3.s) {
                X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                m3.s sVar = (m3.s) obj;
                int iA = sVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    AbstractC1489b.a(f7531r, this, obj, sVar.i());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC1003e0.f7538b) {
                    return false;
                }
                m3.s sVar2 = new m3.s(8, true);
                X2.l.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar2.a((Runnable) obj);
                sVar2.a(runnable);
                if (AbstractC1489b.a(f7531r, this, obj, sVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean m0() {
        if (!c0()) {
            return false;
        }
        Object obj = f7531r.get(this);
        if (obj == null) {
            return true;
        }
        return obj instanceof m3.s ? ((m3.s) obj).g() : obj == AbstractC1003e0.f7538b;
    }

    public final void n0() {
        AbstractC0998c.a();
        System.nanoTime();
    }

    public final void o0() {
        f7531r.set(this, null);
        f7532s.set(this, null);
    }

    public final void p0(boolean z3) {
        f7533t.set(this, z3 ? 1 : 0);
    }

    @Override // h3.AbstractC0995a0
    public void shutdown() {
        L0.f7509a.c();
        p0(true);
        i0();
        while (d0() <= 0) {
        }
        n0();
    }
}
