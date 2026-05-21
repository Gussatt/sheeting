package V0;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: renamed from: V0.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0566z implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        Account account = null;
        int iR = 0;
        int iR2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK == 2) {
                account = (Account) W0.b.e(parcel, iP, Account.CREATOR);
            } else if (iK == 3) {
                iR2 = W0.b.r(parcel, iP);
            } else if (iK != 4) {
                W0.b.v(parcel, iP);
            } else {
                googleSignInAccount = (GoogleSignInAccount) W0.b.e(parcel, iP, GoogleSignInAccount.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new C0565y(iR, account, iR2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0565y[i4];
    }
}
