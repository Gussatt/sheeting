package k1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k1.K, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1151K implements Parcelable.Creator {
    public static void a(C1150J c1150j, Parcel parcel, int i4) {
        String str = c1150j.f9088m;
        int iA = W0.c.a(parcel);
        W0.c.p(parcel, 2, str, false);
        W0.c.o(parcel, 3, c1150j.f9089n, i4, false);
        W0.c.p(parcel, 4, c1150j.f9090o, false);
        W0.c.m(parcel, 5, c1150j.f9091p);
        W0.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        long jS = 0;
        String strF = null;
        C1148H c1148h = null;
        String strF2 = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 2) {
                strF = W0.b.f(parcel, iP);
            } else if (iK == 3) {
                c1148h = (C1148H) W0.b.e(parcel, iP, C1148H.CREATOR);
            } else if (iK == 4) {
                strF2 = W0.b.f(parcel, iP);
            } else if (iK != 5) {
                W0.b.v(parcel, iP);
            } else {
                jS = W0.b.s(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new C1150J(strF, c1148h, strF2, jS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C1150J[i4];
    }
}
