package k1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1224i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        long jS = 0;
        long jS2 = 0;
        int iR = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                jS = W0.b.s(parcel, iP);
            } else if (iK == 2) {
                iR = W0.b.r(parcel, iP);
            } else if (iK != 3) {
                W0.b.v(parcel, iP);
            } else {
                jS2 = W0.b.s(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new C1216h(jS, iR, jS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1216h[i4];
    }
}
