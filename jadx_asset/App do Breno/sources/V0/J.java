package V0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        int iR = 0;
        boolean zL = false;
        boolean zL2 = false;
        int iR2 = 0;
        int iR3 = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK == 2) {
                zL = W0.b.l(parcel, iP);
            } else if (iK == 3) {
                zL2 = W0.b.l(parcel, iP);
            } else if (iK == 4) {
                iR2 = W0.b.r(parcel, iP);
            } else if (iK != 5) {
                W0.b.v(parcel, iP);
            } else {
                iR3 = W0.b.r(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new C0551j(iR, zL, zL2, iR2, iR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0551j[i4];
    }
}
