package Y0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iW = W0.b.w(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iW) {
            int iP = W0.b.p(parcel);
            if (W0.b.k(iP) != 1) {
                W0.b.v(parcel, iP);
            } else {
                pendingIntent = (PendingIntent) W0.b.e(parcel, iP, PendingIntent.CREATOR);
            }
        }
        W0.b.j(parcel, iW);
        return new b(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        return new b[i4];
    }
}
