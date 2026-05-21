package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class H implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1 f6354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6355b;

    public H(U1 u12, String str) {
        this.f6354a = u12;
        this.f6355b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final U1 a(r rVar) {
        U1 u1A = this.f6354a.a();
        u1A.e(this.f6355b, rVar);
        return u1A;
    }
}
