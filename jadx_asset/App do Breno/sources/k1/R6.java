package k1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class R6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        byte[] bArrB = null;
        String strF = null;
        Bundle bundleA = null;
        String strF2 = null;
        long jS = 0;
        long jS2 = 0;
        int iR = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            switch (W0.b.k(iP)) {
                case 1:
                    jS = W0.b.s(parcel, iP);
                    break;
                case 2:
                    bArrB = W0.b.b(parcel, iP);
                    break;
                case 3:
                    strF = W0.b.f(parcel, iP);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    bundleA = W0.b.a(parcel, iP);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    iR = W0.b.r(parcel, iP);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    jS2 = W0.b.s(parcel, iP);
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    strF2 = W0.b.f(parcel, iP);
                    break;
                default:
                    W0.b.v(parcel, iP);
                    break;
            }
        }
        W0.b.j(parcel, iW);
        return new Q6(jS, bArrB, strF, bundleA, iR, jS2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new Q6[i4];
    }
}
