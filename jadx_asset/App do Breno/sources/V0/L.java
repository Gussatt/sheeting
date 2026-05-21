package V0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class L implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        int iR = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            if (W0.b.k(iP) != 1) {
                W0.b.v(parcel, iP);
            } else {
                iR = W0.b.r(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new K(iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new K[i4];
    }
}
