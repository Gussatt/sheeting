package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class m7 implements l7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6888a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.f("measurement.collection.enable_session_stitching_token.client.dev", true);
        f6888a = c0725d4A.f("measurement.session_stitching_token_enabled", false);
        c0725d4A.f("measurement.link_sst_to_sid", true);
    }

    @Override // com.google.android.gms.internal.measurement.l7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.l7
    public final boolean b() {
        return ((Boolean) f6888a.b()).booleanValue();
    }
}
