package V0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        C0551j c0551j = null;
        int[] iArrC = null;
        int[] iArrC2 = null;
        boolean zL = false;
        boolean zL2 = false;
        int iR = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            switch (W0.b.k(iP)) {
                case 1:
                    c0551j = (C0551j) W0.b.e(parcel, iP, C0551j.CREATOR);
                    break;
                case 2:
                    zL = W0.b.l(parcel, iP);
                    break;
                case 3:
                    zL2 = W0.b.l(parcel, iP);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    iArrC = W0.b.c(parcel, iP);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    iR = W0.b.r(parcel, iP);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    iArrC2 = W0.b.c(parcel, iP);
                    break;
                default:
                    W0.b.v(parcel, iP);
                    break;
            }
        }
        W0.b.j(parcel, iW);
        return new C0544c(c0551j, zL, zL2, iArrC, iR, iArrC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0544c[i4];
    }
}
