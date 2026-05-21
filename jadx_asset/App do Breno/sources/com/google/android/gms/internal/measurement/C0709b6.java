package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0709b6 implements InterfaceC0700a6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0752g4 f6657b;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        f6656a = c0725d4A.f("measurement.admob_plus_removal.client.dev", false);
        f6657b = c0725d4A.f("measurement.admob_plus_removal.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0700a6
    public final boolean a() {
        return ((Boolean) f6656a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0700a6
    public final boolean b() {
        return ((Boolean) f6657b.b()).booleanValue();
    }
}
