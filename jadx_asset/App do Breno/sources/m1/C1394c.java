package m1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: m1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1394c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        Intent intent = null;
        int iR = 0;
        int iR2 = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK == 2) {
                iR2 = W0.b.r(parcel, iP);
            } else if (iK != 3) {
                W0.b.v(parcel, iP);
            } else {
                intent = (Intent) W0.b.e(parcel, iP, Intent.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new C1393b(iR, iR2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1393b[i4];
    }
}
