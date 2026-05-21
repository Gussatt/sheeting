package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class F0 extends W0.a {
    public static final Parcelable.Creator<F0> CREATOR = new G0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f6329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f6330n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f6331o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f6332p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f6333q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f6334r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f6335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f6336t;

    public F0(long j4, long j5, boolean z3, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f6329m = j4;
        this.f6330n = j5;
        this.f6331o = z3;
        this.f6332p = str;
        this.f6333q = str2;
        this.f6334r = str3;
        this.f6335s = bundle;
        this.f6336t = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        long j4 = this.f6329m;
        int iA = W0.c.a(parcel);
        W0.c.m(parcel, 1, j4);
        W0.c.m(parcel, 2, this.f6330n);
        W0.c.c(parcel, 3, this.f6331o);
        W0.c.p(parcel, 4, this.f6332p, false);
        W0.c.p(parcel, 5, this.f6333q, false);
        W0.c.p(parcel, 6, this.f6334r, false);
        W0.c.e(parcel, 7, this.f6335s, false);
        W0.c.p(parcel, 8, this.f6336t, false);
        W0.c.b(parcel, iA);
    }
}
