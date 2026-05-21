package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class G0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleA = null;
        String strF4 = null;
        boolean zL = false;
        long jS = 0;
        long jS2 = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            switch (W0.b.k(iP)) {
                case 1:
                    jS = W0.b.s(parcel, iP);
                    break;
                case 2:
                    jS2 = W0.b.s(parcel, iP);
                    break;
                case 3:
                    zL = W0.b.l(parcel, iP);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    strF = W0.b.f(parcel, iP);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    strF2 = W0.b.f(parcel, iP);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    strF3 = W0.b.f(parcel, iP);
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    bundleA = W0.b.a(parcel, iP);
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    strF4 = W0.b.f(parcel, iP);
                    break;
                default:
                    W0.b.v(parcel, iP);
                    break;
            }
        }
        W0.b.j(parcel, iW);
        return new F0(jS, jS2, zL, strF, strF2, strF3, bundleA, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new F0[i4];
    }
}
