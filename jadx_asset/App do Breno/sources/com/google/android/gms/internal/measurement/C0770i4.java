package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o1.AbstractC1471h;
import p.C1475a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0770i4 implements O3 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Map f6756g = new C1475a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f6758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f6759c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Map f6761e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6760d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6762f = new ArrayList();

    public C0770i4(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f6757a = sharedPreferences;
        this.f6758b = runnable;
    }

    public static C0770i4 b(Context context, String str, Runnable runnable) {
        final C0770i4 c0770i4;
        SharedPreferences sharedPreferencesA;
        if (G3.c() && !str.startsWith("direct_boot:") && !G3.b(context)) {
            return null;
        }
        synchronized (C0770i4.class) {
            Map map = f6756g;
            c0770i4 = (C0770i4) map.get(str);
            if (c0770i4 == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (G3.c()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = AbstractC0792l0.a(context, str.substring(12), 0, AbstractC0748g0.f6725a);
                    } else {
                        sharedPreferencesA = AbstractC0792l0.a(context, str, 0, AbstractC0748g0.f6725a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c0770i4 = new C0770i4(sharedPreferencesA, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.h4
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            C0770i4.c(this.f6750a, sharedPreferences, str2);
                        }
                    };
                    c0770i4.f6759c = onSharedPreferenceChangeListener;
                    c0770i4.f6757a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, c0770i4);
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th;
                }
            }
        }
        return c0770i4;
    }

    public static /* synthetic */ void c(C0770i4 c0770i4, SharedPreferences sharedPreferences, String str) {
        synchronized (c0770i4.f6760d) {
            c0770i4.f6761e = null;
            AbstractC0752g4.c();
        }
        synchronized (c0770i4) {
            try {
                Iterator it = c0770i4.f6762f.iterator();
                if (it.hasNext()) {
                    i.d.a(it.next());
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void d() {
        try {
            Map map = f6756g;
            for (C0770i4 c0770i4 : map.values()) {
                c0770i4.f6757a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) AbstractC1471h.h(c0770i4.f6759c));
            }
            map.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.O3
    public final Object a(String str) {
        Map<String, ?> map = this.f6761e;
        if (map == null) {
            synchronized (this.f6760d) {
                try {
                    map = this.f6761e;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f6757a.getAll();
                            this.f6761e = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
