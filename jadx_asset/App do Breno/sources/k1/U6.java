package k1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U6 extends W0.a {
    public static final Parcelable.Creator<U6> CREATOR = new V6();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f9258m;

    public U6(List list) {
        this.f9258m = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        List list = this.f9258m;
        int iA = W0.c.a(parcel);
        W0.c.s(parcel, 1, list, false);
        W0.c.b(parcel, iA);
    }
}
