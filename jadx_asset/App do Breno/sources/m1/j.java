package m1;

import S0.C0504b;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j extends W0.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f10336m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0504b f10337n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.google.android.gms.common.internal.f f10338o;

    public j(int i4, C0504b c0504b, com.google.android.gms.common.internal.f fVar) {
        this.f10336m = i4;
        this.f10337n = c0504b;
        this.f10338o = fVar;
    }

    public final C0504b d() {
        return this.f10337n;
    }

    public final com.google.android.gms.common.internal.f f() {
        return this.f10338o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, this.f10336m);
        W0.c.o(parcel, 2, this.f10337n, i4, false);
        W0.c.o(parcel, 3, this.f10338o, i4, false);
        W0.c.b(parcel, iA);
    }
}
