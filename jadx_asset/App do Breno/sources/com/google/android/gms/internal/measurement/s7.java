package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class s7 implements r7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0752g4 f6956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC0752g4 f6957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC0752g4 f6958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC0752g4 f6959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC0752g4 f6960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC0752g4 f6961g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC0752g4 f6962h;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        f6955a = c0725d4A.f("measurement.sgtm.client.scion_upload_action", true);
        f6956b = c0725d4A.f("measurement.sgtm.client.upload_on_backgrounded.dev", false);
        f6957c = c0725d4A.f("measurement.sgtm.google_signal.enable", true);
        c0725d4A.f("measurement.sgtm.no_proxy.client", true);
        f6958d = c0725d4A.f("measurement.sgtm.no_proxy.client2", false);
        f6959e = c0725d4A.f("measurement.sgtm.no_proxy.service", false);
        c0725d4A.f("measurement.sgtm.preview_mode_enabled", true);
        c0725d4A.f("measurement.sgtm.rollout_percentage_fix", true);
        c0725d4A.f("measurement.sgtm.service", true);
        f6960f = c0725d4A.f("measurement.sgtm.service.batching_on_backgrounded", false);
        f6961g = c0725d4A.f("measurement.sgtm.upload_queue", true);
        f6962h = c0725d4A.f("measurement.sgtm.upload_on_uninstall", true);
        c0725d4A.d("measurement.id.sgtm", 0L);
        c0725d4A.d("measurement.id.sgtm_noproxy", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final boolean a() {
        return ((Boolean) f6955a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final boolean b() {
        return ((Boolean) f6956b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final boolean c() {
        return ((Boolean) f6957c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final boolean d() {
        return ((Boolean) f6958d.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final boolean e() {
        return ((Boolean) f6959e.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final boolean f() {
        return ((Boolean) f6962h.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final boolean h() {
        return ((Boolean) f6960f.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.r7
    public final boolean i() {
        return ((Boolean) f6961g.b()).booleanValue();
    }
}
