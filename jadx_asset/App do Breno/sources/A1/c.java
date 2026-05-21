package A1;

import android.os.Bundle;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import z1.g;

/* JADX INFO: loaded from: classes.dex */
public class c implements b, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f31a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeUnit f33c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownLatch f35e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36f = false;

    public c(e eVar, int i4, TimeUnit timeUnit) {
        this.f31a = eVar;
        this.f32b = i4;
        this.f33c = timeUnit;
    }

    @Override // A1.a
    public void a(String str, Bundle bundle) {
        synchronized (this.f34d) {
            try {
                g.f().i("Logging event " + str + " to Firebase Analytics with params " + bundle);
                this.f35e = new CountDownLatch(1);
                this.f36f = false;
                this.f31a.a(str, bundle);
                g.f().i("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f35e.await(this.f32b, this.f33c)) {
                        this.f36f = true;
                        g.f().i("App exception callback received from Analytics listener.");
                    } else {
                        g.f().k("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    g.f().d("Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f35e = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A1.b
    public void b(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f35e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
