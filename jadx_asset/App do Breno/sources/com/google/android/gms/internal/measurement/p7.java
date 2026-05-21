package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class p7 implements o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6922a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.f("measurement.client.sessions.background_sessions_enabled", true);
        f6922a = c0725d4A.f("measurement.client.sessions.enable_fix_background_engagement", false);
        c0725d4A.f("measurement.client.sessions.immediate_start_enabled_foreground", true);
        c0725d4A.f("measurement.client.sessions.enable_pause_engagement_in_background", true);
        c0725d4A.f("measurement.client.sessions.session_id_enabled", true);
        c0725d4A.d("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.o7
    public final boolean a() {
        return ((Boolean) f6922a.b()).booleanValue();
    }
}
