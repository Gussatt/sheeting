package m1;

import S0.C0504b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        C0504b c0504b = null;
        int iR = 0;
        com.google.android.gms.common.internal.f fVar = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK == 2) {
                c0504b = (C0504b) W0.b.e(parcel, iP, C0504b.CREATOR);
            } else if (iK != 3) {
                W0.b.v(parcel, iP);
            } else {
                fVar = (com.google.android.gms.common.internal.f) W0.b.e(parcel, iP, com.google.android.gms.common.internal.f.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new j(iR, c0504b, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new j[i4];
    }
}
