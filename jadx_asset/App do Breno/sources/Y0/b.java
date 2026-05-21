package Y0;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class b extends W0.a {
    public static final Parcelable.Creator<b> CREATOR = new f();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final PendingIntent f4001m;

    public b(PendingIntent pendingIntent) {
        this.f4001m = pendingIntent;
    }

    public PendingIntent d() {
        return this.f4001m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.o(parcel, 1, d(), i4, false);
        W0.c.b(parcel, iA);
    }
}
