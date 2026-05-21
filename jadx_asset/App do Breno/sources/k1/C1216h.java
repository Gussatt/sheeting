package k1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1216h extends W0.a {
    public static final Parcelable.Creator<C1216h> CREATOR = new C1224i();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9450m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f9451n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f9452o;

    public C1216h(long j4, int i4, long j5) {
        this.f9450m = j4;
        this.f9451n = i4;
        this.f9452o = j5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        long j4 = this.f9450m;
        int iA = W0.c.a(parcel);
        W0.c.m(parcel, 1, j4);
        W0.c.j(parcel, 2, this.f9451n);
        W0.c.m(parcel, 3, this.f9452o);
        W0.c.b(parcel, iA);
    }
}
