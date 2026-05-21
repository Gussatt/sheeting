package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0847s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0824p0 f6946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile InterfaceC0824p0 f6947b;

    static {
        C0832q0 c0832q0 = new C0832q0(null);
        f6946a = c0832q0;
        f6947b = c0832q0;
    }

    public static InterfaceC0824p0 a() {
        return f6947b;
    }
}
