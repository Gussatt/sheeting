package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class v7 implements u7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6985a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        f6985a = c0725d4A.f("measurement.tcf.consent_fix", false);
        c0725d4A.f("measurement.tcf.client", true);
        c0725d4A.d("measurement.id.tcf", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.u7
    public final boolean a() {
        return ((Boolean) f6985a.b()).booleanValue();
    }
}
