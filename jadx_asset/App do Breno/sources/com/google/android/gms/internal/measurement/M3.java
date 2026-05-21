package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class M3 {
    public static Object a(N3 n32) {
        try {
            return n32.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return n32.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
