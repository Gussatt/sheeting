package m1;

import V0.C0565y;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        C0565y c0565y = null;
        int iR = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK != 2) {
                W0.b.v(parcel, iP);
            } else {
                c0565y = (C0565y) W0.b.e(parcel, iP, C0565y.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new h(iR, c0565y);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new h[i4];
    }
}
