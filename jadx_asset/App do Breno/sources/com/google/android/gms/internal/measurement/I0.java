package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class I0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        String strF = null;
        int iR = 0;
        Intent intent = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK == 2) {
                strF = W0.b.f(parcel, iP);
            } else if (iK != 3) {
                W0.b.v(parcel, iP);
            } else {
                intent = (Intent) W0.b.e(parcel, iP, Intent.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new H0(iR, strF, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new H0[i4];
    }
}
