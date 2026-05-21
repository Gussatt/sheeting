package T0;

import S0.C0504b;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        String strF = null;
        C0504b c0504b = null;
        int iR = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK == 2) {
                strF = W0.b.f(parcel, iP);
            } else if (iK == 3) {
                pendingIntent = (PendingIntent) W0.b.e(parcel, iP, PendingIntent.CREATOR);
            } else if (iK != 4) {
                W0.b.v(parcel, iP);
            } else {
                c0504b = (C0504b) W0.b.e(parcel, iP, C0504b.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new Status(iR, strF, pendingIntent, c0504b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new Status[i4];
    }
}
