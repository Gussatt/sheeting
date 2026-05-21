package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0782j7 implements InterfaceC0773i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6861a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        f6861a = c0725d4A.f("measurement.backfill_session_ids.service", false);
        c0725d4A.d("measurement.id.backfill_session_ids.service", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0773i7
    public final boolean a() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0773i7
    public final boolean b() {
        return ((Boolean) f6861a.b()).booleanValue();
    }
}
