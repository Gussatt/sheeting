package V0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: V0.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0557p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        ArrayList arrayListI = null;
        int iR = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK != 2) {
                W0.b.v(parcel, iP);
            } else {
                arrayListI = W0.b.i(parcel, iP, C0547f.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new C0553l(iR, arrayListI);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0553l[i4];
    }
}
