package O0;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WeakReference f2857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f2858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CountDownLatch f2859o = new CountDownLatch(1);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2860p = false;

    public c(a aVar, long j4) {
        this.f2857m = new WeakReference(aVar);
        this.f2858n = j4;
        start();
    }

    public final void a() {
        a aVar = (a) this.f2857m.get();
        if (aVar != null) {
            aVar.c();
            this.f2860p = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f2859o.await(this.f2858n, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
