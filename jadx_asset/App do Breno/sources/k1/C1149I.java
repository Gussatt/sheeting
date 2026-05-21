package k1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k1.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1149I implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            if (W0.b.k(iP) != 2) {
                W0.b.v(parcel, iP);
            } else {
                bundleA = W0.b.a(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new C1148H(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1148H[i4];
    }
}
