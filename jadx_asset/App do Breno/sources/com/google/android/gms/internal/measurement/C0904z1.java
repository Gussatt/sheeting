package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import j1.C1109a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k1.AbstractC1276o3;
import k1.AbstractC1325u5;
import k1.InterfaceC1277o4;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0904z1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile C0904z1 f7024j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1.d f7026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f7027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1109a f7028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile InterfaceC0871v0 f7033i;

    public C0904z1(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !t(str2, str3)) {
            this.f7025a = "FA";
        } else {
            this.f7025a = str;
        }
        this.f7026b = b1.g.d();
        AbstractC0847s0.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0740f1(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f7027c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f7028d = new C1109a(this);
        this.f7029e = new ArrayList();
        try {
            if (AbstractC1325u5.b(context, "google_app_id", AbstractC1276o3.a(context)) != null && !p()) {
                this.f7032h = null;
                this.f7031g = true;
                Log.w(this.f7025a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                return;
            }
        } catch (IllegalStateException unused) {
        }
        if (t(str2, str3)) {
            this.f7032h = str2;
        } else {
            this.f7032h = "fa";
            if (str2 == null || str3 == null) {
                if ((str3 == null) ^ (str2 == null)) {
                    Log.w(this.f7025a, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f7025a, "Deferring to Google Analytics for Firebase for event data collection. https://firebase.google.com/docs/analytics");
            }
        }
        s(new S0(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f7025a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C0896y1(this));
        }
    }

    public static C0904z1 z(Context context, String str, String str2, String str3, Bundle bundle) {
        AbstractC0549h.j(context);
        if (f7024j == null) {
            synchronized (C0904z1.class) {
                try {
                    if (f7024j == null) {
                        f7024j = new C0904z1(context, str, str2, str3, bundle);
                    }
                } finally {
                }
            }
        }
        return f7024j;
    }

    public final Long A() {
        zzcs zzcsVar = new zzcs();
        s(new C0776j1(this, zzcsVar));
        return zzcsVar.u(120000L);
    }

    public final String C() {
        zzcs zzcsVar = new zzcs();
        s(new C0767i1(this, zzcsVar));
        return zzcsVar.o1(120000L);
    }

    public final String D() {
        zzcs zzcsVar = new zzcs();
        s(new C0695a1(this, zzcsVar));
        return zzcsVar.o1(50L);
    }

    public final String E() {
        zzcs zzcsVar = new zzcs();
        s(new C0722d1(this, zzcsVar));
        return zzcsVar.o1(500L);
    }

    public final String F() {
        zzcs zzcsVar = new zzcs();
        s(new C0713c1(this, zzcsVar));
        return zzcsVar.o1(500L);
    }

    public final String G() {
        zzcs zzcsVar = new zzcs();
        s(new Z0(this, zzcsVar));
        return zzcsVar.o1(500L);
    }

    public final List H(String str, String str2) {
        zzcs zzcsVar = new zzcs();
        s(new M0(this, str, str2, zzcsVar));
        List list = (List) zzcs.zzf(zzcsVar.r(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final Map I(String str, String str2, boolean z3) {
        zzcs zzcsVar = new zzcs();
        s(new C0731e1(this, str, str2, z3, zzcsVar));
        Bundle bundleR = zzcsVar.r(5000L);
        if (bundleR == null || bundleR.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleR.size());
        for (String str3 : bundleR.keySet()) {
            Object obj = bundleR.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void M(String str) {
        s(new U0(this, str));
    }

    public final void N(String str, String str2, Bundle bundle) {
        s(new L0(this, str, str2, bundle));
    }

    public final void O(String str) {
        s(new V0(this, str));
    }

    public final void P(String str, Bundle bundle) {
        r(null, str, bundle, false, true, null);
    }

    public final void Q(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void a(int i4, String str, Object obj, Object obj2, Object obj3) {
        s(new C0749g1(this, false, 5, str, obj, null, null));
    }

    public final void b(InterfaceC1277o4 interfaceC1277o4) {
        AbstractC0549h.j(interfaceC1277o4);
        List list = this.f7029e;
        synchronized (list) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                try {
                    if (interfaceC1277o4.equals(((Pair) list.get(i4)).first)) {
                        Log.w(this.f7025a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            BinderC0825p1 binderC0825p1 = new BinderC0825p1(interfaceC1277o4);
            list.add(new Pair(interfaceC1277o4, binderC0825p1));
            if (this.f7033i != null) {
                try {
                    this.f7033i.registerOnMeasurementEventListener(binderC0825p1);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f7025a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            s(new C0801m1(this, binderC0825p1));
        }
    }

    public final void c() {
        s(new R0(this));
    }

    public final void d(Runnable runnable) {
        s(new X0(this, runnable));
    }

    public final void e(Bundle bundle) {
        s(new K0(this, bundle));
    }

    public final void f(Bundle bundle) {
        s(new Q0(this, bundle));
    }

    public final void g(H0 h02, String str, String str2) {
        s(new O0(this, h02, str, str2));
    }

    public final void h(boolean z3) {
        s(new C0785k1(this, z3));
    }

    public final void i(Bundle bundle) {
        s(new C0793l1(this, bundle));
    }

    public final void j(Boolean bool) {
        s(new P0(this, bool));
    }

    public final void k(long j4) {
        s(new T0(this, j4));
    }

    public final void l(String str) {
        s(new N0(this, str));
    }

    public final void m(String str, String str2, Object obj, boolean z3) {
        s(new J0(this, str, str2, obj, z3));
    }

    public final boolean p() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C0904z1.class.getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final void q(Exception exc, boolean z3, boolean z4) {
        C0904z1 c0904z1;
        Exception exc2;
        this.f7031g |= z3;
        if (z3) {
            Log.w(this.f7025a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z4) {
            c0904z1 = this;
            exc2 = exc;
            c0904z1.a(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            c0904z1 = this;
            exc2 = exc;
        }
        Log.w(c0904z1.f7025a, "Error with data collection. Data lost.", exc2);
    }

    public final void r(String str, String str2, Bundle bundle, boolean z3, boolean z4, Long l4) {
        s(new C0809n1(this, l4, str, str2, bundle, z3, z4));
    }

    public final void s(AbstractRunnableC0817o1 abstractRunnableC0817o1) {
        this.f7027c.execute(abstractRunnableC0817o1);
    }

    public final boolean t(String str, String str2) {
        return (str2 == null || str == null || p()) ? false : true;
    }

    public final int u(String str) {
        zzcs zzcsVar = new zzcs();
        s(new C0758h1(this, str, zzcsVar));
        Integer num = (Integer) zzcs.zzf(zzcsVar.r(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final long v() {
        zzcs zzcsVar = new zzcs();
        s(new C0704b1(this, zzcsVar));
        Long lU = zzcsVar.u(500L);
        if (lU != null) {
            return lU.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f7026b.a()).nextLong();
        int i4 = this.f7030f + 1;
        this.f7030f = i4;
        return jNextLong + ((long) i4);
    }

    public final C1109a w() {
        return this.f7028d;
    }

    public final InterfaceC0871v0 y(Context context, boolean z3) {
        try {
            return zzcu.asInterface(DynamiteModule.d(context, DynamiteModule.f6269e, ModuleDescriptor.MODULE_ID).c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e4) {
            q(e4, true, false);
            return null;
        }
    }
}
