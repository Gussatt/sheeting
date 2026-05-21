package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class T6 implements S6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6589a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.f("measurement.sdk.collection.enable_extend_user_property_size", true);
        f6589a = c0725d4A.f("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c0725d4A.d("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.S6
    public final boolean a() {
        return ((Boolean) f6589a.b()).booleanValue();
    }
}
