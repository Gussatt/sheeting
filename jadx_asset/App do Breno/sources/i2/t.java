package i2;

import android.os.Handler;
import android.os.HandlerThread;

/* JADX INFO: loaded from: classes.dex */
public class t implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f7717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f7718d;

    public t(String str, int i4) {
        this.f7715a = str;
        this.f7716b = i4;
    }

    @Override // i2.p
    public void a() {
        HandlerThread handlerThread = new HandlerThread(this.f7715a, this.f7716b);
        this.f7717c = handlerThread;
        handlerThread.start();
        this.f7718d = new Handler(this.f7717c.getLooper());
    }

    @Override // i2.p
    public void c() {
        HandlerThread handlerThread = this.f7717c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f7717c = null;
            this.f7718d = null;
        }
    }

    @Override // i2.p
    public void d(m mVar) {
        this.f7718d.post(mVar.f7695b);
    }
}
