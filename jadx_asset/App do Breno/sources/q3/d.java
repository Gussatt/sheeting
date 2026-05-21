package q3;

import W2.l;
import W2.p;
import X2.j;
import X2.m;
import h3.InterfaceC1016l;
import h3.P0;
import j3.i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m3.AbstractC1419d;
import m3.C;
import m3.D;
import q.AbstractC1489b;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11105c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f11106d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11107e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f11108f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11109g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f11111b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public /* synthetic */ class a extends j implements p {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f11112v = new a();

        public a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // W2.p
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) {
            return o(((Number) obj).longValue(), (f) obj2);
        }

        public final f o(long j4, f fVar) {
            return e.h(j4, fVar);
        }
    }

    public static final class b extends m implements l {
        public b() {
            super(1);
        }

        public final void a(Throwable th) {
            d.this.j();
        }

        @Override // W2.l
        public /* bridge */ /* synthetic */ Object k(Object obj) {
            a((Throwable) obj);
            return K2.p.f2516a;
        }
    }

    public /* synthetic */ class c extends j implements p {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final c f11114v = new c();

        public c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // W2.p
        public /* bridge */ /* synthetic */ Object j(Object obj, Object obj2) {
            return o(((Number) obj).longValue(), (f) obj2);
        }

        public final f o(long j4, f fVar) {
            return e.h(j4, fVar);
        }
    }

    public d(int i4, int i5) {
        this.f11110a = i4;
        if (i4 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i4).toString());
        }
        if (i5 < 0 || i5 > i4) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i4).toString());
        }
        f fVar = new f(0L, null, 2);
        this.head = fVar;
        this.tail = fVar;
        this._availablePermits = i4 - i5;
        this.f11111b = new b();
    }

    public final void e(InterfaceC1016l interfaceC1016l) {
        while (h() <= 0) {
            X2.l.c(interfaceC1016l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (f((P0) interfaceC1016l)) {
                return;
            }
        }
        interfaceC1016l.v(K2.p.f2516a, this.f11111b);
    }

    public final boolean f(P0 p02) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11107e;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f11108f.getAndIncrement(this);
        a aVar = a.f11112v;
        long j4 = andIncrement / ((long) e.f11120f);
        loop0: while (true) {
            objC = AbstractC1419d.c(fVar, j4, aVar);
            if (!D.c(objC)) {
                C cB = D.b(objC);
                while (true) {
                    C c4 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c4.f10514o >= cB.f10514o) {
                        break loop0;
                    }
                    if (!cB.q()) {
                        break;
                    }
                    if (AbstractC1489b.a(atomicReferenceFieldUpdater, this, c4, cB)) {
                        if (c4.m()) {
                            c4.k();
                        }
                    } else if (cB.m()) {
                        cB.k();
                    }
                }
            } else {
                break;
            }
        }
        f fVar2 = (f) D.b(objC);
        int i4 = (int) (andIncrement % ((long) e.f11120f));
        if (i.a(fVar2.r(), i4, null, p02)) {
            p02.c(fVar2, i4);
            return true;
        }
        if (!i.a(fVar2.r(), i4, e.f11116b, e.f11117c)) {
            return false;
        }
        if (p02 instanceof InterfaceC1016l) {
            X2.l.c(p02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC1016l) p02).v(K2.p.f2516a, this.f11111b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + p02).toString());
    }

    public final void g() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i4;
        int i5;
        do {
            atomicIntegerFieldUpdater = f11109g;
            i4 = atomicIntegerFieldUpdater.get(this);
            i5 = this.f11110a;
            if (i4 <= i5) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, i5));
    }

    public final int h() {
        int andDecrement;
        do {
            andDecrement = f11109g.getAndDecrement(this);
        } while (andDecrement > this.f11110a);
        return andDecrement;
    }

    public int i() {
        return Math.max(f11109g.get(this), 0);
    }

    public void j() {
        do {
            int andIncrement = f11109g.getAndIncrement(this);
            if (andIncrement >= this.f11110a) {
                g();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f11110a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!m());
    }

    public boolean k() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11109g;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 > this.f11110a) {
                g();
            } else {
                if (i4 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean l(Object obj) {
        if (!(obj instanceof InterfaceC1016l)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC1016l interfaceC1016l = (InterfaceC1016l) obj;
        Object objH = interfaceC1016l.h(K2.p.f2516a, null, this.f11111b);
        if (objH == null) {
            return false;
        }
        interfaceC1016l.K(objH);
        return true;
    }

    public final boolean m() {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11105c;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f11106d.getAndIncrement(this);
        long j4 = andIncrement / ((long) e.f11120f);
        c cVar = c.f11114v;
        loop0: while (true) {
            objC = AbstractC1419d.c(fVar, j4, cVar);
            if (D.c(objC)) {
                break;
            }
            C cB = D.b(objC);
            while (true) {
                C c4 = (C) atomicReferenceFieldUpdater.get(this);
                if (c4.f10514o >= cB.f10514o) {
                    break loop0;
                }
                if (!cB.q()) {
                    break;
                }
                if (AbstractC1489b.a(atomicReferenceFieldUpdater, this, c4, cB)) {
                    if (c4.m()) {
                        c4.k();
                    }
                } else if (cB.m()) {
                    cB.k();
                }
            }
        }
        f fVar2 = (f) D.b(objC);
        fVar2.b();
        if (fVar2.f10514o > j4) {
            return false;
        }
        int i4 = (int) (andIncrement % ((long) e.f11120f));
        Object andSet = fVar2.r().getAndSet(i4, e.f11116b);
        if (andSet != null) {
            if (andSet == e.f11119e) {
                return false;
            }
            return l(andSet);
        }
        int i5 = e.f11115a;
        for (int i6 = 0; i6 < i5; i6++) {
            if (fVar2.r().get(i4) == e.f11117c) {
                return true;
            }
        }
        return !i.a(fVar2.r(), i4, e.f11116b, e.f11118d);
    }
}
