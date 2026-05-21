package V0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: V0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0544c extends W0.a {
    public static final Parcelable.Creator<C0544c> CREATOR = new P();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0551j f3677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f3678n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3679o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f3680p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3681q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f3682r;

    public C0544c(C0551j c0551j, boolean z3, boolean z4, int[] iArr, int i4, int[] iArr2) {
        this.f3677m = c0551j;
        this.f3678n = z3;
        this.f3679o = z4;
        this.f3680p = iArr;
        this.f3681q = i4;
        this.f3682r = iArr2;
    }

    public int d() {
        return this.f3681q;
    }

    public int[] f() {
        return this.f3680p;
    }

    public int[] g() {
        return this.f3682r;
    }

    public boolean h() {
        return this.f3678n;
    }

    public boolean i() {
        return this.f3679o;
    }

    public final C0551j k() {
        return this.f3677m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.o(parcel, 1, this.f3677m, i4, false);
        W0.c.c(parcel, 2, h());
        W0.c.c(parcel, 3, i());
        W0.c.k(parcel, 4, f(), false);
        W0.c.j(parcel, 5, d());
        W0.c.k(parcel, 6, g(), false);
        W0.c.b(parcel, iA);
    }
}
