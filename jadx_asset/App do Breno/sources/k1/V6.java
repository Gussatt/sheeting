package k1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class V6 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        ArrayList arrayListI = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            if (W0.b.k(iP) != 1) {
                W0.b.v(parcel, iP);
            } else {
                arrayListI = W0.b.i(parcel, iP, Q6.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new U6(arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new U6[i4];
    }
}
