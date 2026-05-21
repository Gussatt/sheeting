package P0;

import O.h;
import W0.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = b.w(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListI = null;
        String strF7 = null;
        String strF8 = null;
        long jS = 0;
        int iR = 0;
        while (parcel.dataPosition() < iW) {
            int iP = b.p(parcel);
            switch (b.k(iP)) {
                case 1:
                    iR = b.r(parcel, iP);
                    break;
                case 2:
                    strF = b.f(parcel, iP);
                    break;
                case 3:
                    strF2 = b.f(parcel, iP);
                    break;
                case h.LONG_FIELD_NUMBER /* 4 */:
                    strF3 = b.f(parcel, iP);
                    break;
                case h.STRING_FIELD_NUMBER /* 5 */:
                    strF4 = b.f(parcel, iP);
                    break;
                case h.STRING_SET_FIELD_NUMBER /* 6 */:
                    uri = (Uri) b.e(parcel, iP, Uri.CREATOR);
                    break;
                case h.DOUBLE_FIELD_NUMBER /* 7 */:
                    strF5 = b.f(parcel, iP);
                    break;
                case h.BYTES_FIELD_NUMBER /* 8 */:
                    jS = b.s(parcel, iP);
                    break;
                case 9:
                    strF6 = b.f(parcel, iP);
                    break;
                case 10:
                    arrayListI = b.i(parcel, iP, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = b.f(parcel, iP);
                    break;
                case 12:
                    strF8 = b.f(parcel, iP);
                    break;
                default:
                    b.v(parcel, iP);
                    break;
            }
        }
        b.j(parcel, iW);
        return new GoogleSignInAccount(iR, strF, strF2, strF3, strF4, uri, strF5, jS, strF6, arrayListI, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new GoogleSignInAccount[i4];
    }
}
