package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0893x6 implements InterfaceC0885w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f7013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0752g4 f7014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC0752g4 f7015c;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.f("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f7013a = c0725d4A.f("measurement.audience.refresh_event_count_filters_timestamp", false);
        f7014b = c0725d4A.f("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f7015c = c0725d4A.f("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0885w6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0885w6
    public final boolean b() {
        return ((Boolean) f7013a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0885w6
    public final boolean c() {
        return ((Boolean) f7014b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0885w6
    public final boolean d() {
        return ((Boolean) f7015c.b()).booleanValue();
    }
}
