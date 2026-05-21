package m3;

import h3.E0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends AbstractC1420e implements E0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10513p = AtomicIntegerFieldUpdater.newUpdater(C.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f10514o;

    public C(long j4, C c4, int i4) {
        super(c4);
        this.f10514o = j4;
        this.cleanedAndPointers = i4 << 16;
    }

    @Override // m3.AbstractC1420e
    public boolean h() {
        return f10513p.get(this) == n() && !i();
    }

    public final boolean m() {
        return f10513p.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i4, Throwable th, N2.i iVar);

    public final void p() {
        if (f10513p.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10513p;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, 65536 + i4));
        return true;
    }
}
