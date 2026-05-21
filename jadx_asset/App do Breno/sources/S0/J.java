package S0;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        boolean zL = false;
        String strF = null;
        IBinder iBinderQ = null;
        boolean zL2 = false;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                strF = W0.b.f(parcel, iP);
            } else if (iK == 2) {
                iBinderQ = W0.b.q(parcel, iP);
            } else if (iK == 3) {
                zL = W0.b.l(parcel, iP);
            } else if (iK != 4) {
                W0.b.v(parcel, iP);
            } else {
                zL2 = W0.b.l(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new I(strF, iBinderQ, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new I[i4];
    }
}
