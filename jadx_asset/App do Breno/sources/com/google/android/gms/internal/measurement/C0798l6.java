package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0798l6 implements InterfaceC0790k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6881a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.f("measurement.client.3p_consent_state_v1", true);
        c0725d4A.f("measurement.service.consent_state_v1_W36", true);
        f6881a = c0725d4A.d("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0790k6
    public final long a() {
        return ((Long) f6881a.b()).longValue();
    }
}
