package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import o1.AbstractC1471h;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0792l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f6876a = new C0784k0();

    public static SharedPreferences a(Context context, String str, int i4, AbstractC0739f0 abstractC0739f0) {
        Z.a();
        SharedPreferencesC0775j0 sharedPreferencesC0775j0 = str.equals("") ? new SharedPreferencesC0775j0() : null;
        if (sharedPreferencesC0775j0 != null) {
            return sharedPreferencesC0775j0;
        }
        ThreadLocal threadLocal = f6876a;
        AbstractC1471h.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
            threadLocal.set(Boolean.TRUE);
            return sharedPreferences;
        } catch (Throwable th) {
            f6876a.set(Boolean.TRUE);
            throw th;
        }
    }
}
