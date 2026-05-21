package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzcs extends zzcx {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicReference f7038l = new AtomicReference();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f7039m;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0003, code lost:
    
        r2 = r2.get("r");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object zzf(android.os.Bundle r2, java.lang.Class r3) {
        /*
            r0 = 0
            if (r2 == 0) goto L2d
            java.lang.String r1 = "r"
            java.lang.Object r2 = r2.get(r1)
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r3.cast(r2)     // Catch: java.lang.ClassCastException -> L10
            return r2
        L10:
            r0 = move-exception
            java.lang.String r3 = r3.getCanonicalName()
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r2}
            java.lang.String r3 = "Unexpected object type. Expected, Received: %s, %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.String r3 = "AM"
            android.util.Log.w(r3, r2, r0)
            throw r0
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzcs.zzf(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0887x0
    public final void k(Bundle bundle) {
        AtomicReference atomicReference = this.f7038l;
        synchronized (atomicReference) {
            try {
                try {
                    atomicReference.set(bundle);
                    this.f7039m = true;
                } finally {
                    this.f7038l.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String o1(long j4) {
        return (String) zzf(r(j4), String.class);
    }

    public final Bundle r(long j4) {
        Bundle bundle;
        AtomicReference atomicReference = this.f7038l;
        synchronized (atomicReference) {
            if (!this.f7039m) {
                try {
                    atomicReference.wait(j4);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = (Bundle) this.f7038l.get();
        }
        return bundle;
    }

    public final Long u(long j4) {
        return (Long) zzf(r(j4), Long.class);
    }
}
