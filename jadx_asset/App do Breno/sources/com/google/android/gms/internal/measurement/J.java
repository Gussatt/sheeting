package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class J implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1 f6370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6371b;

    public J(U1 u12, String str) {
        this.f6370a = u12;
        this.f6371b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final U1 a(r rVar) {
        U1 u12 = this.f6370a;
        u12.e(this.f6371b, rVar);
        return u12;
    }
}
