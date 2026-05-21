package J1;

import C0.l;
import C1.G;
import C1.U;
import C1.l0;
import android.os.SystemClock;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import n1.C1446m;
import z0.h;
import z0.j;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f2362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f2363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f2365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BlockingQueue f2367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f2368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f2369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final U f2370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f2371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2372k;

    public final class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final G f2373m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final C1446m f2374n;

        @Override // java.lang.Runnable
        public void run() {
            e.this.n(this.f2373m, this.f2374n);
            e.this.f2370i.e();
            double dG = e.this.g();
            g.f().b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dG / 1000.0d)) + " s for report: " + this.f2373m.d());
            e.o(dG);
        }

        public b(G g4, C1446m c1446m) {
            this.f2373m = g4;
            this.f2374n = c1446m;
        }
    }

    public e(h hVar, K1.d dVar, U u4) {
        this(dVar.f2466f, dVar.f2467g, ((long) dVar.f2468h) * 1000, hVar, u4);
    }

    public static /* synthetic */ void a(e eVar, C1446m c1446m, boolean z3, G g4, Exception exc) {
        eVar.getClass();
        if (exc != null) {
            c1446m.d(exc);
            return;
        }
        if (z3) {
            eVar.j();
        }
        c1446m.e(g4);
    }

    public static /* synthetic */ void b(e eVar, CountDownLatch countDownLatch) {
        eVar.getClass();
        try {
            l.a(eVar.f2369h, z0.e.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    public static void o(double d4) {
        try {
            Thread.sleep((long) d4);
        } catch (InterruptedException unused) {
        }
    }

    public final double g() {
        return Math.min(3600000.0d, (60000.0d / this.f2362a) * Math.pow(this.f2363b, h()));
    }

    public final int h() {
        if (this.f2372k == 0) {
            this.f2372k = m();
        }
        int iM = (int) ((m() - this.f2372k) / this.f2364c);
        int iMin = l() ? Math.min(100, this.f2371j + iM) : Math.max(0, this.f2371j - iM);
        if (this.f2371j != iMin) {
            this.f2371j = iMin;
            this.f2372k = m();
        }
        return iMin;
    }

    public C1446m i(G g4, boolean z3) {
        synchronized (this.f2367f) {
            try {
                C1446m c1446m = new C1446m();
                if (!z3) {
                    n(g4, c1446m);
                    return c1446m;
                }
                this.f2370i.d();
                if (!k()) {
                    h();
                    g.f().b("Dropping report due to queue being full: " + g4.d());
                    this.f2370i.c();
                    c1446m.e(g4);
                    return c1446m;
                }
                g.f().b("Enqueueing report: " + g4.d());
                g.f().b("Queue size: " + this.f2367f.size());
                this.f2368g.execute(new b(g4, c1446m));
                g.f().b("Closing task for report: " + g4.d());
                c1446m.e(g4);
                return c1446m;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: J1.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f2360m, countDownLatch);
            }
        }).start();
        l0.c(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean k() {
        return this.f2367f.size() < this.f2366e;
    }

    public final boolean l() {
        return this.f2367f.size() == this.f2366e;
    }

    public final long m() {
        return System.currentTimeMillis();
    }

    public final void n(final G g4, final C1446m c1446m) {
        g.f().b("Sending report through Google DataTransport: " + g4.d());
        final boolean z3 = SystemClock.elapsedRealtime() - this.f2365d < 2000;
        this.f2369h.a(z0.c.g(g4.b()), new j() { // from class: J1.c
            @Override // z0.j
            public final void a(Exception exc) {
                e.a(this.f2356a, c1446m, z3, g4, exc);
            }
        });
    }

    public e(double d4, double d5, long j4, h hVar, U u4) {
        this.f2362a = d4;
        this.f2363b = d5;
        this.f2364c = j4;
        this.f2369h = hVar;
        this.f2370i = u4;
        this.f2365d = SystemClock.elapsedRealtime();
        int i4 = (int) d4;
        this.f2366e = i4;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i4);
        this.f2367f = arrayBlockingQueue;
        this.f2368g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f2371j = 0;
        this.f2372k = 0L;
    }
}
