package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class G implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1 f6347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6348b;

    public G(U1 u12, String str) {
        this.f6347a = u12;
        this.f6348b = str;
    }

    @Override // com.google.android.gms.internal.measurement.I
    public final U1 a(r rVar) {
        U1 u1A = this.f6347a.a();
        u1A.f(this.f6348b, rVar);
        return u1A;
    }
}
