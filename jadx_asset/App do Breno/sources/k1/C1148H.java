package k1;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: renamed from: k1.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1148H extends W0.a implements Iterable {
    public static final Parcelable.Creator<C1148H> CREATOR = new C1149I();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Bundle f9054m;

    public C1148H(Bundle bundle) {
        this.f9054m = bundle;
    }

    public final int d() {
        return this.f9054m.size();
    }

    public final Bundle g() {
        return new Bundle(this.f9054m);
    }

    public final Double h(String str) {
        return Double.valueOf(this.f9054m.getDouble("value"));
    }

    public final Long i(String str) {
        return Long.valueOf(this.f9054m.getLong(str));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1147G(this);
    }

    public final Object k(String str) {
        return this.f9054m.get(str);
    }

    public final String l(String str) {
        return this.f9054m.getString(str);
    }

    public final String toString() {
        return this.f9054m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.e(parcel, 2, g(), false);
        W0.c.b(parcel, iA);
    }
}
