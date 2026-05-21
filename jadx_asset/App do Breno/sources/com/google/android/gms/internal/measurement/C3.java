package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class C3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static B3 f6305a;

    public static synchronized B3 a() {
        try {
            if (f6305a == null) {
                b(new F3());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6305a;
    }

    public static synchronized void b(B3 b32) {
        if (f6305a != null) {
            throw new IllegalStateException("init() already called");
        }
        f6305a = b32;
    }
}
