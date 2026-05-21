package V0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class K extends W0.a {
    public static final Parcelable.Creator<K> CREATOR = new L();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3627m;

    public K(int i4) {
        this.f3627m = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f3627m;
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, i5);
        W0.c.b(parcel, iA);
    }
}
