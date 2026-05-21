package S0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class H implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        boolean zL = false;
        int iR = 0;
        String strF = null;
        int iR2 = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                zL = W0.b.l(parcel, iP);
            } else if (iK == 2) {
                strF = W0.b.f(parcel, iP);
            } else if (iK == 3) {
                iR2 = W0.b.r(parcel, iP);
            } else if (iK != 4) {
                W0.b.v(parcel, iP);
            } else {
                iR = W0.b.r(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new G(zL, strF, iR2, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new G[i4];
    }
}
