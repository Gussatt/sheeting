package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class D6 implements C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6321a;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        c0725d4A.d("measurement.id.prune_ees_config", 0L);
        f6321a = c0725d4A.f("measurement.fix_high_memory.prune_ees_config", false);
    }

    @Override // com.google.android.gms.internal.measurement.C6
    public final boolean a() {
        return ((Boolean) f6321a.b()).booleanValue();
    }
}
