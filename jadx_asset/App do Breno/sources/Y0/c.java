package Y0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class c extends W0.a {
    public static final Parcelable.Creator<c> CREATOR = new g();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f4003n;

    public c(int i4, boolean z3) {
        this.f4002m = i4;
        this.f4003n = z3;
    }

    public int d() {
        return this.f4002m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, d());
        W0.c.c(parcel, 2, this.f4003n);
        W0.c.b(parcel, iA);
    }
}
