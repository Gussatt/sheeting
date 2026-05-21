package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Y5 implements X5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6630a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        f6630a = c0725d4A.f("measurement.service.ad_impression.convert_value_to_double", true);
        c0725d4A.f("measurement.service.separate_public_internal_event_blacklisting", true);
        c0725d4A.f("measurement.service.ad_impression", true);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final boolean a() {
        return ((Boolean) f6630a.b()).booleanValue();
    }
}
