package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class H6 implements G6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6365a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.d("measurement.id.upload_controller_wait_initialization", 0L);
        f6365a = c0725d4A.f("measurement.upload_controller.wait_initialization", false);
    }

    @Override // com.google.android.gms.internal.measurement.G6
    public final boolean a() {
        return ((Boolean) f6365a.b()).booleanValue();
    }
}
