package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0869u6 implements InterfaceC0861t6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0752g4 f6978b;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.f("measurement.collection.event_safelist", true);
        f6977a = c0725d4A.f("measurement.service.store_null_safelist", true);
        f6978b = c0725d4A.f("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0861t6
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0861t6
    public final boolean b() {
        return ((Boolean) f6977a.b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0861t6
    public final boolean c() {
        return ((Boolean) f6978b.b()).booleanValue();
    }
}
