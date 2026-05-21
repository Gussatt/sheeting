package S0;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        boolean zL = false;
        boolean zL2 = false;
        boolean zL3 = false;
        boolean zL4 = false;
        String strF = null;
        IBinder iBinderQ = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            switch (W0.b.k(iP)) {
                case 1:
                    strF = W0.b.f(parcel, iP);
                    break;
                case 2:
                    zL = W0.b.l(parcel, iP);
                    break;
                case 3:
                    zL2 = W0.b.l(parcel, iP);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    iBinderQ = W0.b.q(parcel, iP);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    zL3 = W0.b.l(parcel, iP);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    zL4 = W0.b.l(parcel, iP);
                    break;
                default:
                    W0.b.v(parcel, iP);
                    break;
            }
        }
        W0.b.j(parcel, iW);
        return new E(strF, zL, zL2, iBinderQ, zL3, zL4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new E[i4];
    }
}
