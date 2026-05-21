package S0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        PendingIntent pendingIntent = null;
        int iR = 0;
        int iR2 = 0;
        String strF = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            int iK = W0.b.k(iP);
            if (iK == 1) {
                iR = W0.b.r(parcel, iP);
            } else if (iK == 2) {
                iR2 = W0.b.r(parcel, iP);
            } else if (iK == 3) {
                pendingIntent = (PendingIntent) W0.b.e(parcel, iP, PendingIntent.CREATOR);
            } else if (iK != 4) {
                W0.b.v(parcel, iP);
            } else {
                strF = W0.b.f(parcel, iP);
            }
        }
        W0.b.j(parcel, iW);
        return new C0504b(iR, iR2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new C0504b[i4];
    }
}
