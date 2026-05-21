package k1;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t7 implements Parcelable.Creator {
    public static void a(s7 s7Var, Parcel parcel, int i4) {
        int i5 = s7Var.f9844m;
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, i5);
        W0.c.p(parcel, 2, s7Var.f9845n, false);
        W0.c.m(parcel, 3, s7Var.f9846o);
        W0.c.n(parcel, 4, s7Var.f9847p, false);
        W0.c.h(parcel, 5, null, false);
        W0.c.p(parcel, 6, s7Var.f9848q, false);
        W0.c.p(parcel, 7, s7Var.f9849r, false);
        W0.c.g(parcel, 8, s7Var.f9850s, false);
        W0.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        String strF = null;
        Long lT = null;
        Float fO = null;
        String strF2 = null;
        String strF3 = null;
        Double dN = null;
        long jS = 0;
        int iR = 0;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            switch (W0.b.k(iP)) {
                case 1:
                    iR = W0.b.r(parcel, iP);
                    break;
                case 2:
                    strF = W0.b.f(parcel, iP);
                    break;
                case 3:
                    jS = W0.b.s(parcel, iP);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    lT = W0.b.t(parcel, iP);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    fO = W0.b.o(parcel, iP);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    strF2 = W0.b.f(parcel, iP);
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    strF3 = W0.b.f(parcel, iP);
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    dN = W0.b.n(parcel, iP);
                    break;
                default:
                    W0.b.v(parcel, iP);
                    break;
            }
        }
        W0.b.j(parcel, iW);
        return new s7(iR, strF, jS, lT, fO, strF2, strF3, dN);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new s7[i4];
    }
}
