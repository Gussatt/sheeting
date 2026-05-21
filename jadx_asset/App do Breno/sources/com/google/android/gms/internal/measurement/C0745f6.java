package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0745f6 implements InterfaceC0727d6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6722a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        f6722a = c0725d4A.f("measurement.chimera.parameter.service", false);
        c0725d4A.d("measurement.id.chimera_parameter_service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0727d6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0727d6
    public final boolean b() {
        return ((Boolean) f6722a.b()).booleanValue();
    }
}
