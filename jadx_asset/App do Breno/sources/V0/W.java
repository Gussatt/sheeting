package V0;

import S0.C0504b;
import a1.C0575b;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import g1.HandlerC0965e;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC0545d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f3649g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f3650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile Handler f3651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final U f3652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0575b f3653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f3654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f3655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile Executor f3656n;

    public W(Context context, Looper looper, Executor executor) {
        U u4 = new U(this, null);
        this.f3652j = u4;
        this.f3650h = context.getApplicationContext();
        this.f3651i = new HandlerC0965e(looper, u4);
        this.f3653k = C0575b.b();
        this.f3654l = 5000L;
        this.f3655m = 300000L;
        this.f3656n = executor;
    }

    @Override // V0.AbstractC0545d
    public final C0504b c(S s4, ServiceConnection serviceConnection, String str, Executor executor) {
        C0504b c0504bD;
        AbstractC0549h.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3649g) {
            try {
                T t4 = (T) this.f3649g.get(s4);
                if (executor == null) {
                    executor = this.f3656n;
                }
                if (t4 == null) {
                    t4 = new T(this, s4);
                    t4.e(serviceConnection, serviceConnection, str);
                    c0504bD = T.d(t4, str, executor);
                    this.f3649g.put(s4, t4);
                } else {
                    this.f3651i.removeMessages(0, s4);
                    if (t4.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + s4.toString());
                    }
                    t4.e(serviceConnection, serviceConnection, str);
                    int iA = t4.a();
                    if (iA == 1) {
                        serviceConnection.onServiceConnected(t4.b(), t4.c());
                    } else if (iA == 2) {
                        c0504bD = T.d(t4, str, executor);
                    }
                    c0504bD = null;
                }
                if (t4.j()) {
                    return C0504b.f3421q;
                }
                if (c0504bD == null) {
                    c0504bD = new C0504b(-1);
                }
                return c0504bD;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V0.AbstractC0545d
    public final void d(S s4, ServiceConnection serviceConnection, String str) {
        AbstractC0549h.k(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f3649g) {
            try {
                T t4 = (T) this.f3649g.get(s4);
                if (t4 == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + s4.toString());
                }
                if (!t4.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + s4.toString());
                }
                t4.f(serviceConnection, str);
                if (t4.i()) {
                    this.f3651i.sendMessageDelayed(this.f3651i.obtainMessage(0, s4), this.f3654l);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
