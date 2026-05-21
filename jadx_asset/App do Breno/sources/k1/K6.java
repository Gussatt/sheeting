package k1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class K6 extends W0.a {
    public static final Parcelable.Creator<K6> CREATOR = new L6();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f9121m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f9122n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f9123o;

    public K6(String str, long j4, int i4) {
        this.f9121m = str;
        this.f9122n = j4;
        this.f9123o = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        String str = this.f9121m;
        int iA = W0.c.a(parcel);
        W0.c.p(parcel, 1, str, false);
        W0.c.m(parcel, 2, this.f9122n);
        W0.c.j(parcel, 3, this.f9123o);
        W0.c.b(parcel, iA);
    }
}
