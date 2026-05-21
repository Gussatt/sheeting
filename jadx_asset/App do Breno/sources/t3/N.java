package t3;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f11378a = new N();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11379b = 65536;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final M f11380c = new M(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f11381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReference[] f11382e;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f11381d = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i4 = 0; i4 < iHighestOneBit; i4++) {
            atomicReferenceArr[i4] = new AtomicReference();
        }
        f11382e = atomicReferenceArr;
    }

    public static final void b(M m4) {
        X2.l.e(m4, "segment");
        if (m4.f11376f != null || m4.f11377g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (m4.f11374d) {
            return;
        }
        AtomicReference atomicReferenceA = f11378a.a();
        M m5 = f11380c;
        M m6 = (M) atomicReferenceA.getAndSet(m5);
        if (m6 == m5) {
            return;
        }
        int i4 = m6 != null ? m6.f11373c : 0;
        if (i4 >= f11379b) {
            atomicReferenceA.set(m6);
            return;
        }
        m4.f11376f = m6;
        m4.f11372b = 0;
        m4.f11373c = i4 + 8192;
        atomicReferenceA.set(m4);
    }

    public static final M c() {
        AtomicReference atomicReferenceA = f11378a.a();
        M m4 = f11380c;
        M m5 = (M) atomicReferenceA.getAndSet(m4);
        if (m5 == m4) {
            return new M();
        }
        if (m5 == null) {
            atomicReferenceA.set(null);
            return new M();
        }
        atomicReferenceA.set(m5.f11376f);
        m5.f11376f = null;
        m5.f11373c = 0;
        return m5;
    }

    public final AtomicReference a() {
        return f11382e[(int) (Thread.currentThread().getId() & (((long) f11381d) - 1))];
    }
}
