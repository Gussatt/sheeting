package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Z6 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0752g4 f6638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC0752g4 f6639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC0752g4 f6640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC0752g4 f6641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC0752g4 f6642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AbstractC0752g4 f6643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AbstractC0752g4 f6644h;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.f("measurement.rb.attribution.ad_campaign_info", true);
        c0725d4A.f("measurement.rb.attribution.service.bundle_on_backgrounded", true);
        f6637a = c0725d4A.f("measurement.rb.attribution.client2", true);
        c0725d4A.f("measurement.rb.attribution.dma_fix", true);
        f6638b = c0725d4A.f("measurement.rb.attribution.followup1.service", false);
        c0725d4A.f("measurement.rb.attribution.client.get_trigger_uris_async", true);
        f6639c = c0725d4A.f("measurement.rb.attribution.service.trigger_uris_high_priority", true);
        c0725d4A.f("measurement.rb.attribution.index_out_of_bounds_fix", true);
        f6640d = c0725d4A.f("measurement.rb.attribution.service.enable_max_trigger_uris_queried_at_once", true);
        f6641e = c0725d4A.f("measurement.rb.attribution.retry_disposition", false);
        f6642f = c0725d4A.f("measurement.rb.attribution.service", true);
        f6643g = c0725d4A.f("measurement.rb.attribution.enable_trigger_redaction", true);
        f6644h = c0725d4A.f("measurement.rb.attribution.uuid_generation", true);
        c0725d4A.d("measurement.id.rb.attribution.retry_disposition", 0L);
        c0725d4A.f("measurement.rb.attribution.improved_retry", true);
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean b() {
        return ((Boolean) f6637a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean c() {
        return ((Boolean) f6638b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean d() {
        return ((Boolean) f6639c.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean e() {
        return ((Boolean) f6640d.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean f() {
        return ((Boolean) f6643g.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean g() {
        return ((Boolean) f6644h.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean h() {
        return ((Boolean) f6641e.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.Y6
    public final boolean i() {
        return ((Boolean) f6642f.b()).booleanValue();
    }
}
