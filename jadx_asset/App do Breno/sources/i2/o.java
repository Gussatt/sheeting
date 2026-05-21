package i2;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f7700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f7701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f7702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public m f7703f;

    public o(String str, int i4) {
        this.f7698a = str;
        this.f7699b = i4;
    }

    public boolean b() {
        m mVar = this.f7703f;
        return mVar != null && mVar.b();
    }

    public Integer c() {
        m mVar = this.f7703f;
        if (mVar != null) {
            return mVar.a();
        }
        return null;
    }

    public void d(final m mVar) {
        this.f7701d.post(new Runnable() { // from class: i2.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f7696m.g(mVar);
            }
        });
    }

    public synchronized void e() {
        HandlerThread handlerThread = this.f7700c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f7700c = null;
            this.f7701d = null;
        }
    }

    public synchronized void f(Runnable runnable) {
        HandlerThread handlerThread = new HandlerThread(this.f7698a, this.f7699b);
        this.f7700c = handlerThread;
        handlerThread.start();
        this.f7701d = new Handler(this.f7700c.getLooper());
        this.f7702e = runnable;
    }

    public void g(m mVar) {
        mVar.f7695b.run();
        this.f7703f = mVar;
        this.f7702e.run();
    }
}
