package Y0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        Long lT = null;
        Long lT2 = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK == 2) {
                iR2 = W0.b.r(parcel, iP);
            } else if (iK == 3) {
                lT = W0.b.t(parcel, iP);
            } else if (iK == 4) {
                lT2 = W0.b.t(parcel, iP);
            } else if (iK != 5) {
                W0.b.v(parcel, iP);
            } else {
                iR3 = W0.b.r(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new d(iR, iR2, lT, lT2, iR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new d[i4];
    }
}
