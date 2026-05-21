package V0;

import S0.C0506d;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Parcelable.Creator {
    public static void a(com.google.android.gms.common.internal.b bVar, Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, bVar.f6230m);
        W0.c.j(parcel, 2, bVar.f6231n);
        W0.c.j(parcel, 3, bVar.f6232o);
        W0.c.p(parcel, 4, bVar.f6233p, false);
        W0.c.i(parcel, 5, bVar.f6234q, false);
        W0.c.r(parcel, 6, bVar.f6235r, i4, false);
        W0.c.e(parcel, 7, bVar.f6236s, false);
        W0.c.o(parcel, 8, bVar.f6237t, i4, false);
        W0.c.r(parcel, 10, bVar.f6238u, i4, false);
        W0.c.r(parcel, 11, bVar.f6239v, i4, false);
        W0.c.c(parcel, 12, bVar.f6240w);
        W0.c.j(parcel, 13, bVar.f6241x);
        W0.c.c(parcel, 14, bVar.f6242y);
        W0.c.p(parcel, 15, bVar.d(), false);
        W0.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        Scope[] scopeArr = com.google.android.gms.common.internal.b.f6228A;
        Bundle bundle = new Bundle();
        C0506d[] c0506dArr = com.google.android.gms.common.internal.b.f6229B;
        C0506d[] c0506dArr2 = c0506dArr;
        String strF = null;
        IBinder iBinderQ = null;
        Account account = null;
        String strF2 = null;
        int iR = 0;
        int iR2 = 0;
        int iR3 = 0;
        boolean zL = false;
        int iR4 = 0;
        boolean zL2 = false;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            switch (W0.b.k(iP)) {
                case 1:
                    iR = W0.b.r(parcel, iP);
                    break;
                case 2:
                    iR2 = W0.b.r(parcel, iP);
                    break;
                case 3:
                    iR3 = W0.b.r(parcel, iP);
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    strF = W0.b.f(parcel, iP);
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    iBinderQ = W0.b.q(parcel, iP);
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    scopeArr = (Scope[]) W0.b.h(parcel, iP, Scope.CREATOR);
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    bundle = W0.b.a(parcel, iP);
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    account = (Account) W0.b.e(parcel, iP, Account.CREATOR);
                    break;
                case 9:
                default:
                    W0.b.v(parcel, iP);
                    break;
                case 10:
                    c0506dArr = (C0506d[]) W0.b.h(parcel, iP, C0506d.CREATOR);
                    break;
                case 11:
                    c0506dArr2 = (C0506d[]) W0.b.h(parcel, iP, C0506d.CREATOR);
                    break;
                case 12:
                    zL = W0.b.l(parcel, iP);
                    break;
                case 13:
                    iR4 = W0.b.r(parcel, iP);
                    break;
                case 14:
                    zL2 = W0.b.l(parcel, iP);
                    break;
                case 15:
                    strF2 = W0.b.f(parcel, iP);
                    break;
            }
        }
        W0.b.j(parcel, iW);
        return new com.google.android.gms.common.internal.b(iR, iR2, iR3, strF, iBinderQ, scopeArr, bundle, account, c0506dArr, c0506dArr2, zL, iR4, zL2, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new com.google.android.gms.common.internal.b[i4];
    }
}
