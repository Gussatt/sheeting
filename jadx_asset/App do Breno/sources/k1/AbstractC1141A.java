package k1;

import V0.AbstractC0549h;
import android.os.Handler;
import com.google.android.gms.internal.measurement.HandlerC0855t0;

/* JADX INFO: renamed from: k1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1141A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile Handler f8873d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1186d4 f8874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f8875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f8876c;

    public AbstractC1141A(InterfaceC1186d4 interfaceC1186d4) {
        AbstractC0549h.j(interfaceC1186d4);
        this.f8874a = interfaceC1186d4;
        this.f8875b = new RunnableC1359z(this, interfaceC1186d4);
    }

    public final void b() {
        this.f8876c = 0L;
        f().removeCallbacks(this.f8875b);
    }

    public abstract void c();

    public final void d(long j4) {
        b();
        if (j4 >= 0) {
            InterfaceC1186d4 interfaceC1186d4 = this.f8874a;
            this.f8876c = interfaceC1186d4.f().a();
            if (f().postDelayed(this.f8875b, j4)) {
                return;
            }
            interfaceC1186d4.c().r().b("Failed to schedule delayed post. time", Long.valueOf(j4));
        }
    }

    public final boolean e() {
        return this.f8876c != 0;
    }

    public final Handler f() {
        Handler handler;
        if (f8873d != null) {
            return f8873d;
        }
        synchronized (AbstractC1141A.class) {
            try {
                if (f8873d == null) {
                    f8873d = new HandlerC0855t0(this.f8874a.d().getMainLooper());
                }
                handler = f8873d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }
}
