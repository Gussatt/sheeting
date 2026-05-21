package k1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k1.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1288q extends W0.a {
    public static final Parcelable.Creator<C1288q> CREATOR = new r();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f9669m;

    public C1288q(Bundle bundle) {
        this.f9669m = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Bundle bundle = this.f9669m;
        int iA = W0.c.a(parcel);
        W0.c.e(parcel, 1, bundle, false);
        W0.c.b(parcel, iA);
    }
}
