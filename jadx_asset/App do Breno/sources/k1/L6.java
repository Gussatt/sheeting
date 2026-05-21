package k1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class L6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        int iR = 0;
        long jS = 0;
        String strF = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                strF = W0.b.f(parcel, iP);
            } else if (iK == 2) {
                jS = W0.b.s(parcel, iP);
            } else if (iK != 3) {
                W0.b.v(parcel, iP);
            } else {
                iR = W0.b.r(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new K6(strF, jS, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new K6[i4];
    }
}
