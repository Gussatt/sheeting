package O0;

import S0.C0513k;
import S0.C0514l;
import S0.ServiceConnectionC0503a;
import V0.AbstractC0549h;
import a1.C0575b;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads_identifier.zze;
import e1.InterfaceC0929d;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceConnectionC0503a f2847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0929d f2848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2850d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f2851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f2852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f2853g;

    /* JADX INFO: renamed from: O0.a$a, reason: collision with other inner class name */
    public static final class C0064a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2855b;

        public C0064a(String str, boolean z3) {
            this.f2854a = str;
            this.f2855b = z3;
        }

        public String a() {
            return this.f2854a;
        }

        public boolean b() {
            return this.f2855b;
        }

        public String toString() {
            String str = this.f2854a;
            boolean z3 = this.f2855b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z3);
            return sb.toString();
        }
    }

    public a(Context context, long j4, boolean z3, boolean z4) {
        Context applicationContext;
        AbstractC0549h.j(context);
        if (z3 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f2852f = context;
        this.f2849c = false;
        this.f2853g = j4;
    }

    public static C0064a a(Context context) {
        a aVar = new a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            aVar.d(false);
            C0064a c0064aF = aVar.f(-1);
            aVar.e(c0064aF, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0064aF;
        } finally {
        }
    }

    public final void c() {
        AbstractC0549h.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f2852f == null || this.f2847a == null) {
                    return;
                }
                try {
                    if (this.f2849c) {
                        C0575b.b().c(this.f2852f, this.f2847a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f2849c = false;
                this.f2848b = null;
                this.f2847a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(boolean z3) {
        AbstractC0549h.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f2849c) {
                    c();
                }
                Context context = this.f2852f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iH = C0513k.f().h(context, 12451000);
                    if (iH != 0 && iH != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC0503a serviceConnectionC0503a = new ServiceConnectionC0503a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!C0575b.b().a(context, intent, serviceConnectionC0503a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f2847a = serviceConnectionC0503a;
                        try {
                            this.f2848b = zze.zza(serviceConnectionC0503a.a(10000L, TimeUnit.MILLISECONDS));
                            this.f2849c = true;
                            if (z3) {
                                g();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C0514l(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e(C0064a c0064a, boolean z3, float f4, long j4, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0064a != null) {
            map.put("limit_ad_tracking", true != c0064a.b() ? "0" : "1");
            String strA = c0064a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j4));
        new b(this, map).start();
        return true;
    }

    public final C0064a f(int i4) {
        C0064a c0064a;
        AbstractC0549h.i("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f2849c) {
                    synchronized (this.f2850d) {
                        c cVar = this.f2851e;
                        if (cVar == null || !cVar.f2860p) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        d(false);
                        if (!this.f2849c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e4) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e4);
                    }
                }
                AbstractC0549h.j(this.f2847a);
                AbstractC0549h.j(this.f2848b);
                try {
                    c0064a = new C0064a(this.f2848b.c(), this.f2848b.h0(true));
                } catch (RemoteException e5) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e5);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
        return c0064a;
    }

    public final void finalize() throws Throwable {
        c();
        super.finalize();
    }

    public final void g() {
        synchronized (this.f2850d) {
            c cVar = this.f2851e;
            if (cVar != null) {
                cVar.f2859o.countDown();
                try {
                    this.f2851e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j4 = this.f2853g;
            if (j4 > 0) {
                this.f2851e = new c(this, j4);
            }
        }
    }

    public static void b(boolean z3) {
    }
}
