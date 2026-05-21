package V0;

import S0.C0504b;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class T implements ServiceConnection, X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3641a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3642b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f3644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S f3645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f3646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ W f3647g;

    public T(W w4, S s4) {
        this.f3647g = w4;
        this.f3645e = s4;
    }

    public static /* bridge */ /* synthetic */ C0504b d(T t4, String str, Executor executor) {
        try {
            Intent intentB = t4.f3645e.b(t4.f3647g.f3650h);
            t4.f3642b = 3;
            StrictMode.VmPolicy vmPolicyA = b1.t.a();
            try {
                W w4 = t4.f3647g;
                boolean zD = w4.f3653k.d(w4.f3650h, str, intentB, t4, 4225, executor);
                t4.f3643c = zD;
                if (zD) {
                    t4.f3647g.f3651i.sendMessageDelayed(t4.f3647g.f3651i.obtainMessage(1, t4.f3645e), t4.f3647g.f3655m);
                    C0504b c0504b = C0504b.f3421q;
                    StrictMode.setVmPolicy(vmPolicyA);
                    return c0504b;
                }
                t4.f3642b = 2;
                try {
                    W w5 = t4.f3647g;
                    w5.f3653k.c(w5.f3650h, t4);
                } catch (IllegalArgumentException unused) {
                }
                C0504b c0504b2 = new C0504b(16);
                StrictMode.setVmPolicy(vmPolicyA);
                return c0504b2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicyA);
                throw th;
            }
        } catch (I e4) {
            return e4.f3626m;
        }
    }

    public final int a() {
        return this.f3642b;
    }

    public final ComponentName b() {
        return this.f3646f;
    }

    public final IBinder c() {
        return this.f3644d;
    }

    public final void e(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f3641a.put(serviceConnection, serviceConnection2);
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f3641a.remove(serviceConnection);
    }

    public final void g(String str) {
        this.f3647g.f3651i.removeMessages(1, this.f3645e);
        W w4 = this.f3647g;
        w4.f3653k.c(w4.f3650h, this);
        this.f3643c = false;
        this.f3642b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f3641a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f3641a.isEmpty();
    }

    public final boolean j() {
        return this.f3643c;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f3647g.f3649g) {
            try {
                this.f3647g.f3651i.removeMessages(1, this.f3645e);
                this.f3644d = iBinder;
                this.f3646f = componentName;
                Iterator it = this.f3641a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f3642b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f3647g.f3649g) {
            try {
                this.f3647g.f3651i.removeMessages(1, this.f3645e);
                this.f3644d = null;
                this.f3646f = componentName;
                Iterator it = this.f3641a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f3642b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
