package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import o1.AbstractC1471h;

/* JADX INFO: loaded from: classes.dex */
public final class R3 implements O3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static R3 f6561d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentObserver f6563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6564c;

    public R3() {
        this.f6564c = false;
        this.f6562a = null;
        this.f6563b = null;
    }

    public static R3 b(Context context) {
        R3 r32;
        synchronized (R3.class) {
            try {
                if (f6561d == null) {
                    f6561d = t.b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new R3(context) : new R3();
                }
                R3 r33 = f6561d;
                if (r33 != null && r33.f6563b != null && !r33.f6564c) {
                    try {
                        context.getContentResolver().registerContentObserver(A3.f6288a, true, f6561d.f6563b);
                        ((R3) AbstractC1471h.h(f6561d)).f6564c = true;
                    } catch (SecurityException e4) {
                        Log.e("GservicesLoader", "Unable to register Gservices content observer", e4);
                    }
                }
                r32 = (R3) AbstractC1471h.h(f6561d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return r32;
    }

    public static synchronized void e() {
        Context context;
        try {
            R3 r32 = f6561d;
            if (r32 != null && (context = r32.f6562a) != null && r32.f6563b != null && r32.f6564c) {
                context.getContentResolver().unregisterContentObserver(f6561d.f6563b);
            }
            f6561d = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.measurement.O3
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f6562a;
        if (context != null && !G3.a(context)) {
            try {
                return (String) M3.a(new N3() { // from class: com.google.android.gms.internal.measurement.P3
                    @Override // com.google.android.gms.internal.measurement.N3
                    public final Object a() {
                        return AbstractC0906z3.a(((Context) AbstractC1471h.h(this.f6498a.f6562a)).getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e4) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(str), e4);
            }
        }
        return null;
    }

    public R3(Context context) {
        this.f6564c = false;
        this.f6562a = context;
        this.f6563b = new Q3(this, null);
    }
}
