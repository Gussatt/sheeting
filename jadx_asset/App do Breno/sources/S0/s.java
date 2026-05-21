package S0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        long jS = -1;
        int iR = 0;
        String strF = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                strF = W0.b.f(parcel, iP);
            } else if (iK == 2) {
                iR = W0.b.r(parcel, iP);
            } else if (iK != 3) {
                W0.b.v(parcel, iP);
            } else {
                jS = W0.b.s(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new C0506d(strF, iR, jS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0506d[i4];
    }
}
