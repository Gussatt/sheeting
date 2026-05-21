package k1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class y7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        boolean zL = false;
        int iR = 0;
        boolean zL2 = false;
        boolean zL3 = false;
        int iR2 = 0;
        int iR3 = 0;
        long jS = 0;
        long jS2 = 0;
        long jS3 = 0;
        long jS4 = 0;
        long jS5 = 0;
        long jS6 = 0;
        long jS7 = 0;
        String strF = "";
        String strF2 = strF;
        String strF3 = strF2;
        String strF4 = strF3;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        String strF11 = null;
        Boolean boolM = null;
        ArrayList arrayListG = null;
        String strF12 = null;
        String strF13 = null;
        String strF14 = null;
        int iR4 = 100;
        boolean zL4 = true;
        boolean zL5 = true;
        long jS8 = -2147483648L;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            switch (W0.b.k(iP)) {
                case 2:
                    strF5 = W0.b.f(parcel, iP);
                    break;
                case 3:
                    strF6 = W0.b.f(parcel, iP);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    strF7 = W0.b.f(parcel, iP);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    strF8 = W0.b.f(parcel, iP);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    jS = W0.b.s(parcel, iP);
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    jS2 = W0.b.s(parcel, iP);
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    strF9 = W0.b.f(parcel, iP);
                    break;
                case 9:
                    zL4 = W0.b.l(parcel, iP);
                    break;
                case 10:
                    zL = W0.b.l(parcel, iP);
                    break;
                case 11:
                    jS8 = W0.b.s(parcel, iP);
                    break;
                case 12:
                    strF10 = W0.b.f(parcel, iP);
                    break;
                case 13:
                case 17:
                case 20:
                case 33:
                default:
                    W0.b.v(parcel, iP);
                    break;
                case 14:
                    jS3 = W0.b.s(parcel, iP);
                    break;
                case 15:
                    iR = W0.b.r(parcel, iP);
                    break;
                case 16:
                    zL5 = W0.b.l(parcel, iP);
                    break;
                case 18:
                    zL2 = W0.b.l(parcel, iP);
                    break;
                case 19:
                    strF11 = W0.b.f(parcel, iP);
                    break;
                case 21:
                    boolM = W0.b.m(parcel, iP);
                    break;
                case 22:
                    jS4 = W0.b.s(parcel, iP);
                    break;
                case 23:
                    arrayListG = W0.b.g(parcel, iP);
                    break;
                case 24:
                    strF12 = W0.b.f(parcel, iP);
                    break;
                case 25:
                    strF = W0.b.f(parcel, iP);
                    break;
                case 26:
                    strF2 = W0.b.f(parcel, iP);
                    break;
                case 27:
                    strF13 = W0.b.f(parcel, iP);
                    break;
                case 28:
                    zL3 = W0.b.l(parcel, iP);
                    break;
                case 29:
                    jS5 = W0.b.s(parcel, iP);
                    break;
                case 30:
                    iR4 = W0.b.r(parcel, iP);
                    break;
                case 31:
                    strF3 = W0.b.f(parcel, iP);
                    break;
                case 32:
                    iR2 = W0.b.r(parcel, iP);
                    break;
                case 34:
                    jS6 = W0.b.s(parcel, iP);
                    break;
                case 35:
                    strF14 = W0.b.f(parcel, iP);
                    break;
                case 36:
                    strF4 = W0.b.f(parcel, iP);
                    break;
                case 37:
                    jS7 = W0.b.s(parcel, iP);
                    break;
                case 38:
                    iR3 = W0.b.r(parcel, iP);
                    break;
            }
        }
        W0.b.j(parcel, iW);
        return new x7(strF5, strF6, strF7, strF8, jS, jS2, strF9, zL4, zL, jS8, strF10, jS3, iR, zL5, zL2, strF11, boolM, jS4, arrayListG, strF12, strF, strF2, strF13, zL3, jS5, iR4, strF3, iR2, jS6, strF14, strF4, jS7, iR3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new x7[i4];
    }
}
