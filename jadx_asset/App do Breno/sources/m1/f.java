package m1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f extends W0.a {
    public static final Parcelable.Creator<f> CREATOR = new g();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f10332m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f10333n;

    public f(List list, String str) {
        this.f10332m = list;
        this.f10333n = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        List list = this.f10332m;
        int iA = W0.c.a(parcel);
        W0.c.q(parcel, 1, list, false);
        W0.c.p(parcel, 2, this.f10333n, false);
        W0.c.b(parcel, iA);
    }
}
