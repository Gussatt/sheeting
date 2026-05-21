package V0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: V0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0551j extends W0.a {
    public static final Parcelable.Creator<C0551j> CREATOR = new J();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f3704n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3705o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3706p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3707q;

    public C0551j(int i4, boolean z3, boolean z4, int i5, int i6) {
        this.f3703m = i4;
        this.f3704n = z3;
        this.f3705o = z4;
        this.f3706p = i5;
        this.f3707q = i6;
    }

    public int d() {
        return this.f3706p;
    }

    public int f() {
        return this.f3707q;
    }

    public boolean g() {
        return this.f3704n;
    }

    public boolean h() {
        return this.f3705o;
    }

    public int i() {
        return this.f3703m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, i());
        W0.c.c(parcel, 2, g());
        W0.c.c(parcel, 3, h());
        W0.c.j(parcel, 4, d());
        W0.c.j(parcel, 5, f());
        W0.c.b(parcel, iA);
    }
}
