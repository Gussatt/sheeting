package V0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: V0.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0564x implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        int iR = -1;
        int iR2 = 0;
        int iR3 = 0;
        int iR4 = 0;
        int iR5 = 0;
        String strF = null;
        String strF2 = null;
        long jS = 0;
        long jS2 = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            switch (W0.b.k(iP)) {
                case 1:
                    iR2 = W0.b.r(parcel, iP);
                    break;
                case 2:
                    iR3 = W0.b.r(parcel, iP);
                    break;
                case 3:
                    iR4 = W0.b.r(parcel, iP);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    jS = W0.b.s(parcel, iP);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    jS2 = W0.b.s(parcel, iP);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    strF = W0.b.f(parcel, iP);
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    strF2 = W0.b.f(parcel, iP);
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    iR5 = W0.b.r(parcel, iP);
                    break;
                case 9:
                    iR = W0.b.r(parcel, iP);
                    break;
                default:
                    W0.b.v(parcel, iP);
                    break;
            }
        }
        W0.b.j(parcel, iW);
        return new C0547f(iR2, iR3, iR4, jS, jS2, strF, strF2, iR5, iR);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0547f[i4];
    }
}
