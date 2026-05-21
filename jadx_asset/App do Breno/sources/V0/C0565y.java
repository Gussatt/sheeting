package V0;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: renamed from: V0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0565y extends W0.a {
    public static final Parcelable.Creator<C0565y> CREATOR = new C0566z();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3724m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Account f3725n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3726o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GoogleSignInAccount f3727p;

    public C0565y(int i4, Account account, int i5, GoogleSignInAccount googleSignInAccount) {
        this.f3724m = i4;
        this.f3725n = account;
        this.f3726o = i5;
        this.f3727p = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f3724m;
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, i5);
        W0.c.o(parcel, 2, this.f3725n, i4, false);
        W0.c.j(parcel, 3, this.f3726o);
        W0.c.o(parcel, 4, this.f3727p, i4, false);
        W0.c.b(parcel, iA);
    }

    public C0565y(Account account, int i4, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i4, googleSignInAccount);
    }
}
