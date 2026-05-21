package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0746f7 implements InterfaceC0737e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6723a = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a().f("measurement.experiment.enable_phenotype_experiment_reporting", true);

    @Override // com.google.android.gms.internal.measurement.InterfaceC0737e7
    public final boolean a() {
        return ((Boolean) f6723a.b()).booleanValue();
    }
}
