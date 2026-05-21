package h3;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: h3.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0995a0 extends F {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7528o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f7529p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public L2.f f7530q;

    public static /* synthetic */ void V(AbstractC0995a0 abstractC0995a0, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        abstractC0995a0.U(z3);
    }

    public static /* synthetic */ void a0(AbstractC0995a0 abstractC0995a0, boolean z3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i4 & 1) != 0) {
            z3 = false;
        }
        abstractC0995a0.Z(z3);
    }

    public final void U(boolean z3) {
        long jW = this.f7528o - W(z3);
        this.f7528o = jW;
        if (jW <= 0 && this.f7529p) {
            shutdown();
        }
    }

    public final long W(boolean z3) {
        return z3 ? 4294967296L : 1L;
    }

    public final void X(U u4) {
        L2.f fVar = this.f7530q;
        if (fVar == null) {
            fVar = new L2.f();
            this.f7530q = fVar;
        }
        fVar.addLast(u4);
    }

    public long Y() {
        L2.f fVar = this.f7530q;
        return (fVar == null || fVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void Z(boolean z3) {
        this.f7528o += W(z3);
        if (z3) {
            return;
        }
        this.f7529p = true;
    }

    public final boolean b0() {
        return this.f7528o >= W(true);
    }

    public final boolean c0() {
        L2.f fVar = this.f7530q;
        if (fVar != null) {
            return fVar.isEmpty();
        }
        return true;
    }

    public abstract long d0();

    public final boolean e0() throws IllegalAccessException, InvocationTargetException {
        U u4;
        L2.f fVar = this.f7530q;
        if (fVar == null || (u4 = (U) fVar.u()) == null) {
            return false;
        }
        u4.run();
        return true;
    }

    public boolean f0() {
        return false;
    }

    public abstract void shutdown();
}
