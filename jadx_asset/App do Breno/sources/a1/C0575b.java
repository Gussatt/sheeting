package a1;

import V0.AbstractC0549h;
import V0.X;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import b1.k;
import c1.C0663e;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: a1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0575b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f4041b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C0575b f4042c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f4043a = new ConcurrentHashMap();

    public static C0575b b() {
        if (f4042c == null) {
            synchronized (f4041b) {
                try {
                    if (f4042c == null) {
                        f4042c = new C0575b();
                    }
                } finally {
                }
            }
        }
        C0575b c0575b = f4042c;
        AbstractC0549h.j(c0575b);
        return c0575b;
    }

    public static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof X);
    }

    public static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i4, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!k.f() || executor == null) ? context.bindService(intent, serviceConnection, i4) : context.bindService(intent, i4, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i4) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i4, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f4043a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f4043a.get(serviceConnection));
        } finally {
            this.f4043a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i4, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }

    public final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i4, boolean z3, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C0663e.a(context).b(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i4, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f4043a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zH = h(context, intent, serviceConnection, i4, executor);
            if (zH) {
                return zH;
            }
            return false;
        } finally {
            this.f4043a.remove(serviceConnection, serviceConnection);
        }
    }
}
