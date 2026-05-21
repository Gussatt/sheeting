package V0;

import S0.C0506d;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class O implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        Bundle bundleA = null;
        C0544c c0544c = null;
        int iR = 0;
        C0506d[] c0506dArr = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                bundleA = W0.b.a(parcel, iP);
            } else if (iK == 2) {
                c0506dArr = (C0506d[]) W0.b.h(parcel, iP, C0506d.CREATOR);
            } else if (iK == 3) {
                iR = W0.b.r(parcel, iP);
            } else if (iK != 4) {
                W0.b.v(parcel, iP);
            } else {
                c0544c = (C0544c) W0.b.e(parcel, iP, C0544c.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new N(bundleA, c0506dArr, iR, c0544c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new N[i4];
    }
}
