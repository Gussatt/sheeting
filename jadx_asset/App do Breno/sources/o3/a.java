package o3;

import K2.p;
import X2.y;
import h3.AbstractC0998c;
import h3.M;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import m3.A;
import m3.F;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor, Closeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0148a f10799t = new C0148a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10800u = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10801v = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10802w = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final F f10803x = new F("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10804m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10805n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f10806o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f10807p;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o3.d f10808q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o3.d f10809r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final A f10810s;

    /* JADX INFO: renamed from: o3.a$a, reason: collision with other inner class name */
    public static final class C0148a {
        public /* synthetic */ C0148a(X2.g gVar) {
            this();
        }

        public C0148a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10811a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10811a = iArr;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i4, int i5, long j4, String str) {
        this.f10804m = i4;
        this.f10805n = i5;
        this.f10806o = j4;
        this.f10807p = str;
        if (i4 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i4 + " should be at least 1").toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should be greater than or equals to core pool size " + i4).toString());
        }
        if (i5 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i5 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f10808q = new o3.d();
        this.f10809r = new o3.d();
        this.f10810s = new A((i4 + 1) * 2);
        this.controlState = ((long) i4) << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ boolean F(a aVar, long j4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j4 = f10801v.get(aVar);
        }
        return aVar.D(j4);
    }

    public static /* synthetic */ void j(a aVar, Runnable runnable, i iVar, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            iVar = l.f10846g;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        aVar.g(runnable, iVar, z3);
    }

    public final h C(c cVar, h hVar, boolean z3) {
        if (cVar == null || cVar.f10815o == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f10837n.b() == 0 && cVar.f10815o == d.BLOCKING) {
            return hVar;
        }
        cVar.f10819s = true;
        return cVar.f10813m.a(hVar, z3);
    }

    public final boolean D(long j4) {
        if (c3.e.a(((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21)), 0) < this.f10804m) {
            int iD = d();
            if (iD == 1 && this.f10804m > 1) {
                d();
            }
            if (iD > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean G() {
        c cVarL;
        do {
            cVarL = l();
            if (cVarL == null) {
                return false;
            }
        } while (!c.j().compareAndSet(cVarL, -1, 0));
        LockSupport.unpark(cVarL);
        return true;
    }

    public final boolean c(h hVar) {
        return hVar.f10837n.b() == 1 ? this.f10809r.a(hVar) : this.f10808q.a(hVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        w(10000L);
    }

    public final int d() {
        synchronized (this.f10810s) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f10801v;
                long j4 = atomicLongFieldUpdater.get(this);
                int i4 = (int) (j4 & 2097151);
                int iA = c3.e.a(i4 - ((int) ((j4 & 4398044413952L) >> 21)), 0);
                if (iA >= this.f10804m) {
                    return 0;
                }
                if (i4 >= this.f10805n) {
                    return 0;
                }
                int i5 = ((int) (f10801v.get(this) & 2097151)) + 1;
                if (i5 <= 0 || this.f10810s.b(i5) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i5);
                this.f10810s.c(i5, cVar);
                if (i5 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i6 = iA + 1;
                cVar.start();
                return i6;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final h e(Runnable runnable, i iVar) {
        long jA = l.f10845f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, jA, iVar);
        }
        h hVar = (h) runnable;
        hVar.f10836m = jA;
        hVar.f10837n = iVar;
        return hVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        j(this, runnable, null, false, 6, null);
    }

    public final c f() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !X2.l.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    public final void g(Runnable runnable, i iVar, boolean z3) {
        AbstractC0998c.a();
        h hVarE = e(runnable, iVar);
        boolean z4 = false;
        boolean z5 = hVarE.f10837n.b() == 1;
        long jAddAndGet = z5 ? f10801v.addAndGet(this, 2097152L) : 0L;
        c cVarF = f();
        h hVarC = C(cVarF, hVarE, z3);
        if (hVarC != null && !c(hVarC)) {
            throw new RejectedExecutionException(this.f10807p + " was terminated");
        }
        if (z3 && cVarF != null) {
            z4 = true;
        }
        if (z5) {
            x(jAddAndGet, z4);
        } else {
            if (z4) {
                return;
            }
            z();
        }
    }

    public final boolean isTerminated() {
        return f10802w.get(this) != 0;
    }

    public final int k(c cVar) {
        Object objI = cVar.i();
        while (objI != f10803x) {
            if (objI == null) {
                return 0;
            }
            c cVar2 = (c) objI;
            int iH = cVar2.h();
            if (iH != 0) {
                return iH;
            }
            objI = cVar2.i();
        }
        return -1;
    }

    public final c l() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10800u;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f10810s.b((int) (2097151 & j4));
            if (cVar == null) {
                return null;
            }
            long j5 = (2097152 + j4) & (-2097152);
            int iK = k(cVar);
            if (iK >= 0 && f10800u.compareAndSet(this, j4, ((long) iK) | j5)) {
                cVar.r(f10803x);
                return cVar;
            }
        }
    }

    public final boolean q(c cVar) {
        long j4;
        int iH;
        if (cVar.i() != f10803x) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10800u;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            iH = cVar.h();
            cVar.r(this.f10810s.b((int) (2097151 & j4)));
        } while (!f10800u.compareAndSet(this, j4, ((2097152 + j4) & (-2097152)) | ((long) iH)));
        return true;
    }

    public final void r(c cVar, int i4, int i5) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10800u;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            int iK = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (iK == i4) {
                iK = i5 == 0 ? k(cVar) : i5;
            }
            if (iK >= 0) {
                if (f10800u.compareAndSet(this, j4, j5 | ((long) iK))) {
                    return;
                }
            }
        }
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f10810s.a();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 1; i9 < iA; i9++) {
            c cVar = (c) this.f10810s.b(i9);
            if (cVar != null) {
                int iE = cVar.f10813m.e();
                int i10 = b.f10811a[cVar.f10815o.ordinal()];
                if (i10 == 1) {
                    i6++;
                } else if (i10 == 2) {
                    i5++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(iE);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i10 == 3) {
                    i4++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iE);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i10 == 4) {
                    i7++;
                    if (iE > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(iE);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i10 == 5) {
                    i8++;
                }
            }
        }
        long j4 = f10801v.get(this);
        return this.f10807p + '@' + M.b(this) + "[Pool Size {core = " + this.f10804m + ", max = " + this.f10805n + "}, Worker States {CPU = " + i4 + ", blocking = " + i5 + ", parked = " + i6 + ", dormant = " + i7 + ", terminated = " + i8 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f10808q.c() + ", global blocking queue size = " + this.f10809r.c() + ", Control State {created workers= " + ((int) (2097151 & j4)) + ", blocking tasks = " + ((int) ((4398044413952L & j4) >> 21)) + ", CPUs acquired = " + (this.f10804m - ((int) ((9223367638808264704L & j4) >> 42))) + "}]";
    }

    public final void u(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
            } finally {
                AbstractC0998c.a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(long r8) throws java.lang.InterruptedException {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o3.a.f10802w
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r7, r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            o3.a$c r0 = r7.f()
            m3.A r1 = r7.f10810s
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = a()     // Catch: java.lang.Throwable -> L87
            long r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L87
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            long r3 = r3 & r5
            int r3 = (int) r3
            monitor-exit(r1)
            if (r2 > r3) goto L49
            r1 = r2
        L23:
            m3.A r4 = r7.f10810s
            java.lang.Object r4 = r4.b(r1)
            X2.l.b(r4)
            o3.a$c r4 = (o3.a.c) r4
            if (r4 == r0) goto L44
        L30:
            boolean r5 = r4.isAlive()
            if (r5 == 0) goto L3d
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r4.join(r8)
            goto L30
        L3d:
            o3.n r4 = r4.f10813m
            o3.d r5 = r7.f10809r
            r4.f(r5)
        L44:
            if (r1 == r3) goto L49
            int r1 = r1 + 1
            goto L23
        L49:
            o3.d r8 = r7.f10809r
            r8.b()
            o3.d r8 = r7.f10808q
            r8.b()
        L53:
            if (r0 == 0) goto L5b
            o3.h r8 = r0.g(r2)
            if (r8 != 0) goto L83
        L5b:
            o3.d r8 = r7.f10808q
            java.lang.Object r8 = r8.d()
            o3.h r8 = (o3.h) r8
            if (r8 != 0) goto L83
            o3.d r8 = r7.f10809r
            java.lang.Object r8 = r8.d()
            o3.h r8 = (o3.h) r8
            if (r8 != 0) goto L83
            if (r0 == 0) goto L76
            o3.a$d r8 = o3.a.d.TERMINATED
            r0.u(r8)
        L76:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = o3.a.f10800u
            r0 = 0
            r8.set(r7, r0)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = o3.a.f10801v
            r8.set(r7, r0)
            return
        L83:
            r7.u(r8)
            goto L53
        L87:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.a.w(long):void");
    }

    public final void x(long j4, boolean z3) {
        if (z3 || G() || D(j4)) {
            return;
        }
        G();
    }

    public final void z() {
        if (G() || F(this, 0L, 1, null)) {
            return;
        }
        G();
    }

    public final class c extends Thread {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f10812u = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        private volatile int indexInArray;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final n f10813m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final y f10814n;
        private volatile Object nextParkedWorker;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public d f10815o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public long f10816p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public long f10817q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f10818r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f10819s;
        private volatile int workerCtl;

        public c() {
            setDaemon(true);
            this.f10813m = new n();
            this.f10814n = new y();
            this.f10815o = d.DORMANT;
            this.nextParkedWorker = a.f10803x;
            this.f10818r = a3.c.f4053m.b();
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f10812u;
        }

        public final void b(int i4) {
            if (i4 == 0) {
                return;
            }
            a.f10801v.addAndGet(a.this, -2097152L);
            if (this.f10815o != d.TERMINATED) {
                this.f10815o = d.DORMANT;
            }
        }

        public final void c(int i4) {
            if (i4 != 0 && u(d.BLOCKING)) {
                a.this.z();
            }
        }

        public final void d(h hVar) {
            int iB = hVar.f10837n.b();
            k(iB);
            c(iB);
            a.this.u(hVar);
            b(iB);
        }

        public final h e(boolean z3) {
            h hVarO;
            h hVarO2;
            if (z3) {
                boolean z4 = m(a.this.f10804m * 2) == 0;
                if (z4 && (hVarO2 = o()) != null) {
                    return hVarO2;
                }
                h hVarG = this.f10813m.g();
                if (hVarG != null) {
                    return hVarG;
                }
                if (!z4 && (hVarO = o()) != null) {
                    return hVarO;
                }
            } else {
                h hVarO3 = o();
                if (hVarO3 != null) {
                    return hVarO3;
                }
            }
            return v(3);
        }

        public final h f() {
            h hVarH = this.f10813m.h();
            if (hVarH != null) {
                return hVarH;
            }
            h hVar = (h) a.this.f10809r.d();
            return hVar == null ? v(1) : hVar;
        }

        public final h g(boolean z3) {
            return s() ? e(z3) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final void k(int i4) {
            this.f10816p = 0L;
            if (this.f10815o == d.PARKING) {
                this.f10815o = d.BLOCKING;
            }
        }

        public final boolean l() {
            return this.nextParkedWorker != a.f10803x;
        }

        public final int m(int i4) {
            int i5 = this.f10818r;
            int i6 = i5 ^ (i5 << 13);
            int i7 = i6 ^ (i6 >> 17);
            int i8 = i7 ^ (i7 << 5);
            this.f10818r = i8;
            int i9 = i4 - 1;
            return (i9 & i4) == 0 ? i8 & i9 : (i8 & Integer.MAX_VALUE) % i4;
        }

        public final void n() {
            if (this.f10816p == 0) {
                this.f10816p = System.nanoTime() + a.this.f10806o;
            }
            LockSupport.parkNanos(a.this.f10806o);
            if (System.nanoTime() - this.f10816p >= 0) {
                this.f10816p = 0L;
                w();
            }
        }

        public final h o() {
            if (m(2) == 0) {
                h hVar = (h) a.this.f10808q.d();
                return hVar != null ? hVar : (h) a.this.f10809r.d();
            }
            h hVar2 = (h) a.this.f10809r.d();
            return hVar2 != null ? hVar2 : (h) a.this.f10808q.d();
        }

        public final void p() {
            loop0: while (true) {
                boolean z3 = false;
                while (!a.this.isTerminated() && this.f10815o != d.TERMINATED) {
                    h hVarG = g(this.f10819s);
                    if (hVarG != null) {
                        this.f10817q = 0L;
                        d(hVarG);
                    } else {
                        this.f10819s = false;
                        if (this.f10817q == 0) {
                            t();
                        } else if (z3) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f10817q);
                            this.f10817q = 0L;
                        } else {
                            z3 = true;
                        }
                    }
                }
                break loop0;
            }
            u(d.TERMINATED);
        }

        public final void q(int i4) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f10807p);
            sb.append("-worker-");
            sb.append(i4 == 0 ? "TERMINATED" : String.valueOf(i4));
            setName(sb.toString());
            this.indexInArray = i4;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean s() {
            long j4;
            if (this.f10815o == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f10801v;
            do {
                j4 = atomicLongFieldUpdater.get(aVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    return false;
                }
            } while (!a.f10801v.compareAndSet(aVar, j4, j4 - 4398046511104L));
            this.f10815o = d.CPU_ACQUIRED;
            return true;
        }

        public final void t() {
            if (!l()) {
                a.this.q(this);
                return;
            }
            f10812u.set(this, -1);
            while (l() && f10812u.get(this) == -1 && !a.this.isTerminated() && this.f10815o != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f10815o;
            boolean z3 = dVar2 == d.CPU_ACQUIRED;
            if (z3) {
                a.f10801v.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f10815o = dVar;
            }
            return z3;
        }

        public final h v(int i4) {
            int i5 = (int) (a.f10801v.get(a.this) & 2097151);
            if (i5 < 2) {
                return null;
            }
            int iM = m(i5);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i6 = 0; i6 < i5; i6++) {
                iM++;
                if (iM > i5) {
                    iM = 1;
                }
                c cVar = (c) aVar.f10810s.b(iM);
                if (cVar != null && cVar != this) {
                    long jN = cVar.f10813m.n(i4, this.f10814n);
                    if (jN == -1) {
                        y yVar = this.f10814n;
                        h hVar = (h) yVar.f3992m;
                        yVar.f3992m = null;
                        return hVar;
                    }
                    if (jN > 0) {
                        jMin = Math.min(jMin, jN);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f10817q = jMin;
            return null;
        }

        public final void w() {
            a aVar = a.this;
            synchronized (aVar.f10810s) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.f10801v.get(aVar) & 2097151)) <= aVar.f10804m) {
                        return;
                    }
                    if (f10812u.compareAndSet(this, -1, 1)) {
                        int i4 = this.indexInArray;
                        q(0);
                        aVar.r(this, i4, 0);
                        int andDecrement = (int) (a.f10801v.getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i4) {
                            Object objB = aVar.f10810s.b(andDecrement);
                            X2.l.b(objB);
                            c cVar = (c) objB;
                            aVar.f10810s.c(i4, cVar);
                            cVar.q(i4);
                            aVar.r(cVar, andDecrement, i4);
                        }
                        aVar.f10810s.c(andDecrement, null);
                        p pVar = p.f2516a;
                        this.f10815o = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(a aVar, int i4) {
            this();
            q(i4);
        }
    }
}
