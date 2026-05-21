package h3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import m3.AbstractC1426k;

/* JADX INFO: loaded from: classes.dex */
public final class T extends m3.B {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7519q = AtomicIntegerFieldUpdater.newUpdater(T.class, "_decision");
    private volatile int _decision;

    public T(N2.i iVar, N2.e eVar) {
        super(iVar, eVar);
    }

    private final boolean W0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7519q;
        do {
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f7519q.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean X0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7519q;
        do {
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f7519q.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // m3.B, h3.x0
    public void R(Object obj) {
        R0(obj);
    }

    @Override // m3.B, h3.AbstractC0994a
    public void R0(Object obj) {
        if (W0()) {
            return;
        }
        AbstractC1426k.c(O2.b.b(this.f10512p), D.a(obj, this.f10512p), null, 2, null);
    }

    public final Object V0() {
        if (X0()) {
            return O2.c.c();
        }
        Object objH = y0.h(n0());
        if (objH instanceof C1035z) {
            throw ((C1035z) objH).f7590a;
        }
        return objH;
    }
}
