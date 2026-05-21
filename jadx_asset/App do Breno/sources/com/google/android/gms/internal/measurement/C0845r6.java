package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0845r6 implements InterfaceC0838q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0752g4 f6943b;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        f6942a = c0725d4A.f("measurement.set_default_event_parameters_propagate_clear.client.dev", false);
        f6943b = c0725d4A.f("measurement.set_default_event_parameters_propagate_clear.service", false);
        c0725d4A.d("measurement.id.set_default_event_parameters_propagate_clear.experiment_id", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0838q6
    public final boolean a() {
        return ((Boolean) f6942a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0838q6
    public final boolean b() {
        return ((Boolean) f6943b.b()).booleanValue();
    }
}
