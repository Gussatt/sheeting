package k1;

import V0.AbstractC0549h;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k1.J, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1150J extends W0.a {
    public static final Parcelable.Creator<C1150J> CREATOR = new C1151K();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f9088m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1148H f9089n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f9090o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f9091p;

    public C1150J(C1150J c1150j, long j4) {
        AbstractC0549h.j(c1150j);
        this.f9088m = c1150j.f9088m;
        this.f9089n = c1150j.f9089n;
        this.f9090o = c1150j.f9090o;
        this.f9091p = j4;
    }

    public final String toString() {
        return "origin=" + this.f9090o + ",name=" + this.f9088m + ",params=" + String.valueOf(this.f9089n);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        C1151K.a(this, parcel, i4);
    }

    public C1150J(String str, C1148H c1148h, String str2, long j4) {
        this.f9088m = str;
        this.f9089n = c1148h;
        this.f9090o = str2;
        this.f9091p = j4;
    }
}
