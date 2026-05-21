package m1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        ArrayList arrayListG = null;
        String strF = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                arrayListG = W0.b.g(parcel, iP);
            } else if (iK != 2) {
                W0.b.v(parcel, iP);
            } else {
                strF = W0.b.f(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new f(arrayListG, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new f[i4];
    }
}
