package k1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k1.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1240k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        String strF = null;
        String strF2 = null;
        s7 s7Var = null;
        String strF3 = null;
        C1150J c1150j = null;
        C1150J c1150j2 = null;
        C1150J c1150j3 = null;
        long jS = 0;
        long jS2 = 0;
        long jS3 = 0;
        boolean zL = false;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            switch (W0.b.k(iP)) {
                case 2:
                    strF = W0.b.f(parcel, iP);
                    break;
                case 3:
                    strF2 = W0.b.f(parcel, iP);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    s7Var = (s7) W0.b.e(parcel, iP, s7.CREATOR);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    jS = W0.b.s(parcel, iP);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    zL = W0.b.l(parcel, iP);
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    strF3 = W0.b.f(parcel, iP);
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    c1150j = (C1150J) W0.b.e(parcel, iP, C1150J.CREATOR);
                    break;
                case 9:
                    jS2 = W0.b.s(parcel, iP);
                    break;
                case 10:
                    c1150j2 = (C1150J) W0.b.e(parcel, iP, C1150J.CREATOR);
                    break;
                case 11:
                    jS3 = W0.b.s(parcel, iP);
                    break;
                case 12:
                    c1150j3 = (C1150J) W0.b.e(parcel, iP, C1150J.CREATOR);
                    break;
                default:
                    W0.b.v(parcel, iP);
                    break;
            }
        }
        W0.b.j(parcel, iW);
        return new C1232j(strF, strF2, s7Var, jS, zL, strF3, c1150j, jS2, c1150j2, jS3, c1150j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1232j[i4];
    }
}
