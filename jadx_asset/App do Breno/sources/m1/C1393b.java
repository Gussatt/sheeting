package m1;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: m1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1393b extends W0.a {
    public static final Parcelable.Creator<C1393b> CREATOR = new C1394c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10329m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10330n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Intent f10331o;

    public C1393b(int i4, int i5, Intent intent) {
        this.f10329m = i4;
        this.f10330n = i5;
        this.f10331o = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f10329m;
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, i5);
        W0.c.j(parcel, 2, this.f10330n);
        W0.c.o(parcel, 3, this.f10331o, i4, false);
        W0.c.b(parcel, iA);
    }
}
