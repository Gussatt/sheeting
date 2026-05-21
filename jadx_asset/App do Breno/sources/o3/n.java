package o3;

import X2.y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC1489b;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10849b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10850c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10851d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10852e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f10853a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar, boolean z3) {
        if (z3) {
            return b(hVar);
        }
        h hVar2 = (h) f10849b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f10837n.b() == 1) {
            f10852e.incrementAndGet(this);
        }
        int i4 = f10850c.get(this) & 127;
        while (this.f10853a.get(i4) != null) {
            Thread.yield();
        }
        this.f10853a.lazySet(i4, hVar);
        f10850c.incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar == null || hVar.f10837n.b() != 1) {
            return;
        }
        f10852e.decrementAndGet(this);
    }

    public final int d() {
        return f10850c.get(this) - f10851d.get(this);
    }

    public final int e() {
        return f10849b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f10849b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h g() {
        h hVar = (h) f10849b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final h i() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10851d;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 - f10850c.get(this) == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 + 1) && (hVar = (h) this.f10853a.getAndSet(i5, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    public final boolean j(d dVar) {
        h hVarI = i();
        if (hVarI == null) {
            return false;
        }
        dVar.a(hVarI);
        return true;
    }

    public final h k(boolean z3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f10849b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.f10837n.b() == 1) == z3) {
                }
            }
            int i4 = f10851d.get(this);
            int i5 = f10850c.get(this);
            while (i4 != i5) {
                if (z3 && f10852e.get(this) == 0) {
                    return null;
                }
                i5--;
                h hVarM = m(i5, z3);
                if (hVarM != null) {
                    return hVarM;
                }
            }
            return null;
        } while (!AbstractC1489b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    public final h l(int i4) {
        int i5 = f10851d.get(this);
        int i6 = f10850c.get(this);
        boolean z3 = i4 == 1;
        while (i5 != i6) {
            if (z3 && f10852e.get(this) == 0) {
                return null;
            }
            int i7 = i5 + 1;
            h hVarM = m(i5, z3);
            if (hVarM != null) {
                return hVarM;
            }
            i5 = i7;
        }
        return null;
    }

    public final h m(int i4, boolean z3) {
        int i5 = i4 & 127;
        h hVar = (h) this.f10853a.get(i5);
        if (hVar != null) {
            if ((hVar.f10837n.b() == 1) == z3 && j3.i.a(this.f10853a, i5, hVar, null)) {
                if (z3) {
                    f10852e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    public final long n(int i4, y yVar) {
        h hVarI = i4 == 3 ? i() : l(i4);
        if (hVarI == null) {
            return o(i4, yVar);
        }
        yVar.f3992m = hVarI;
        return -1L;
    }

    public final long o(int i4, y yVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f10849b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f10837n.b() != 1 ? 2 : 1) & i4) == 0) {
                return -2L;
            }
            long jA = l.f10845f.a() - hVar.f10836m;
            long j4 = l.f10841b;
            if (jA < j4) {
                return j4 - jA;
            }
        } while (!AbstractC1489b.a(atomicReferenceFieldUpdater, this, hVar, null));
        yVar.f3992m = hVar;
        return -1L;
    }
}
