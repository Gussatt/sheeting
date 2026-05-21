package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Q6 implements P6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6559a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.f("measurement.gmscore_feature_tracking", true);
        f6559a = c0725d4A.f("measurement.gmscore_client_telemetry", false);
    }

    @Override // com.google.android.gms.internal.measurement.P6
    public final boolean a() {
        return ((Boolean) f6559a.b()).booleanValue();
    }
}
