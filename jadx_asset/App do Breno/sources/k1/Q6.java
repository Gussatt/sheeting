package k1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Q6 extends W0.a {
    public static final Parcelable.Creator<Q6> CREATOR = new R6();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f9209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f9210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Bundle f9211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f9212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f9213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f9214s;

    public Q6(long j4, byte[] bArr, String str, Bundle bundle, int i4, long j5, String str2) {
        this.f9208m = j4;
        this.f9209n = bArr;
        this.f9210o = str;
        this.f9211p = bundle;
        this.f9212q = i4;
        this.f9213r = j5;
        this.f9214s = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        long j4 = this.f9208m;
        int iA = W0.c.a(parcel);
        W0.c.m(parcel, 1, j4);
        W0.c.f(parcel, 2, this.f9209n, false);
        W0.c.p(parcel, 3, this.f9210o, false);
        W0.c.e(parcel, 4, this.f9211p, false);
        W0.c.j(parcel, 5, this.f9212q);
        W0.c.m(parcel, 6, this.f9213r);
        W0.c.p(parcel, 7, this.f9214s, false);
        W0.c.b(parcel, iA);
    }
}
