package Y0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class a extends W0.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3999m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4000n;

    public a(boolean z3, int i4) {
        this.f3999m = z3;
        this.f4000n = i4;
    }

    public boolean d() {
        return this.f3999m;
    }

    public int f() {
        return this.f4000n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.c(parcel, 1, d());
        W0.c.j(parcel, 2, f());
        W0.c.b(parcel, iA);
    }
}
