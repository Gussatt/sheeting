package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0822o6 implements InterfaceC0814n6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0752g4 f6911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC0752g4 f6912c;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.f("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        c0725d4A.f("measurement.set_default_event_parameters_with_backfill.service", true);
        c0725d4A.d("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        f6910a = c0725d4A.f("measurement.set_default_event_parameters.fix_app_update_logging", true);
        f6911b = c0725d4A.f("measurement.set_default_event_parameters.fix_deferred_analytics_collection", true);
        f6912c = c0725d4A.f("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        c0725d4A.f("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0814n6
    public final boolean a() {
        return ((Boolean) f6910a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0814n6
    public final boolean b() {
        return ((Boolean) f6911b.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0814n6
    public final boolean c() {
        return ((Boolean) f6912c.b()).booleanValue();
    }
}
