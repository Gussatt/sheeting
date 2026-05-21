package V0;

import S0.C0506d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class N extends W0.a {
    public static final Parcelable.Creator<N> CREATOR = new O();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Bundle f3631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0506d[] f3632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C0544c f3634p;

    public N(Bundle bundle, C0506d[] c0506dArr, int i4, C0544c c0544c) {
        this.f3631m = bundle;
        this.f3632n = c0506dArr;
        this.f3633o = i4;
        this.f3634p = c0544c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.e(parcel, 1, this.f3631m, false);
        W0.c.r(parcel, 2, this.f3632n, i4, false);
        W0.c.j(parcel, 3, this.f3633o);
        W0.c.o(parcel, 4, this.f3634p, i4, false);
        W0.c.b(parcel, iA);
    }
}
