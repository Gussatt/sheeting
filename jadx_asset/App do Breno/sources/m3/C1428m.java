package m3;

import h3.S;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: m3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1428m extends h3.F implements S {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10547t = AtomicIntegerFieldUpdater.newUpdater(C1428m.class, "runningWorkers");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final h3.F f10548o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f10549p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ S f10550q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f10551r;
    private volatile int runningWorkers;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f10552s;

    /* JADX INFO: renamed from: m3.m$a */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Runnable f10553m;

        public a(Runnable runnable) {
            this.f10553m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i4 = 0;
            while (true) {
                try {
                    this.f10553m.run();
                } catch (Throwable th) {
                    h3.H.a(N2.j.f2823m, th);
                }
                Runnable runnableW = C1428m.this.W();
                if (runnableW == null) {
                    return;
                }
                this.f10553m = runnableW;
                i4++;
                if (i4 >= 16 && C1428m.this.f10548o.S(C1428m.this)) {
                    C1428m.this.f10548o.R(C1428m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1428m(h3.F f4, int i4) {
        this.f10548o = f4;
        this.f10549p = i4;
        S s4 = f4 instanceof S ? (S) f4 : null;
        this.f10550q = s4 == null ? h3.O.a() : s4;
        this.f10551r = new r(false);
        this.f10552s = new Object();
    }

    @Override // h3.F
    public void R(N2.i iVar, Runnable runnable) {
        Runnable runnableW;
        this.f10551r.a(runnable);
        if (f10547t.get(this) >= this.f10549p || !X() || (runnableW = W()) == null) {
            return;
        }
        this.f10548o.R(this, new a(runnableW));
    }

    public final Runnable W() {
        while (true) {
            Runnable runnable = (Runnable) this.f10551r.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f10552s) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10547t;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f10551r.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean X() {
        synchronized (this.f10552s) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10547t;
            if (atomicIntegerFieldUpdater.get(this) >= this.f10549p) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
