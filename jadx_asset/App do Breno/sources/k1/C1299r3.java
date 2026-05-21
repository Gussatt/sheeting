package k1;

import V0.AbstractC0549h;
import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: renamed from: k1.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1299r3 extends Thread {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f9811m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final BlockingQueue f9812n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9813o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1307s3 f9814p;

    public C1299r3(C1307s3 c1307s3, String str, BlockingQueue blockingQueue) {
        this.f9814p = c1307s3;
        AbstractC0549h.j(str);
        AbstractC0549h.j(blockingQueue);
        this.f9811m = new Object();
        this.f9812n = blockingQueue;
        setName(str);
    }

    public final void a() {
        Object obj = this.f9811m;
        synchronized (obj) {
            obj.notifyAll();
        }
    }

    public final void b() {
        C1307s3 c1307s3 = this.f9814p;
        synchronized (c1307s3.f9830i) {
            try {
                if (!this.f9813o) {
                    c1307s3.f9831j.release();
                    c1307s3.f9830i.notifyAll();
                    if (this == c1307s3.f9824c) {
                        c1307s3.f9824c = null;
                    } else if (this == c1307s3.f9825d) {
                        c1307s3.f9825d = null;
                    } else {
                        c1307s3.f9366a.c().r().a("Current scheduler thread is neither worker nor network");
                    }
                    this.f9813o = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(InterruptedException interruptedException) {
        this.f9814p.f9366a.c().w().b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z3 = false;
        while (!z3) {
            try {
                this.f9814p.f9831j.acquire();
                z3 = true;
            } catch (InterruptedException e4) {
                c(e4);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.f9812n;
                C1292q3 c1292q3 = (C1292q3) blockingQueue.poll();
                if (c1292q3 != null) {
                    Process.setThreadPriority(true != c1292q3.f9794n ? 10 : threadPriority);
                    c1292q3.run();
                } else {
                    Object obj = this.f9811m;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            C1307s3.C(this.f9814p);
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e5) {
                                c(e5);
                            }
                        }
                    }
                    synchronized (this.f9814p.f9830i) {
                        if (this.f9812n.peek() == null) {
                            b();
                            b();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            b();
            throw th;
        }
    }
}
