package V0;

import S0.C0504b;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class A implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        int iR = 0;
        boolean zL = false;
        boolean zL2 = false;
        IBinder iBinderQ = null;
        C0504b c0504b = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK == 2) {
                iBinderQ = W0.b.q(parcel, iP);
            } else if (iK == 3) {
                c0504b = (C0504b) W0.b.e(parcel, iP, C0504b.CREATOR);
            } else if (iK == 4) {
                zL = W0.b.l(parcel, iP);
            } else if (iK != 5) {
                W0.b.v(parcel, iP);
            } else {
                zL2 = W0.b.l(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new com.google.android.gms.common.internal.f(iR, iBinderQ, c0504b, zL, zL2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new com.google.android.gms.common.internal.f[i4];
    }
}
