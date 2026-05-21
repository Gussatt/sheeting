package m1;

import V0.C0565y;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h extends W0.a {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10334m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0565y f10335n;

    public h(int i4, C0565y c0565y) {
        this.f10334m = i4;
        this.f10335n = c0565y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, this.f10334m);
        W0.c.o(parcel, 2, this.f10335n, i4, false);
        W0.c.b(parcel, iA);
    }
}
