package V0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: V0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0547f extends W0.a {
    public static final Parcelable.Creator<C0547f> CREATOR = new C0564x();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3689m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3690n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3691o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f3692p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f3693q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f3694r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f3695s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3696t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f3697u;

    public C0547f(int i4, int i5, int i6, long j4, long j5, String str, String str2, int i7, int i8) {
        this.f3689m = i4;
        this.f3690n = i5;
        this.f3691o = i6;
        this.f3692p = j4;
        this.f3693q = j5;
        this.f3694r = str;
        this.f3695s = str2;
        this.f3696t = i7;
        this.f3697u = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f3689m;
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, i5);
        W0.c.j(parcel, 2, this.f3690n);
        W0.c.j(parcel, 3, this.f3691o);
        W0.c.m(parcel, 4, this.f3692p);
        W0.c.m(parcel, 5, this.f3693q);
        W0.c.p(parcel, 6, this.f3694r, false);
        W0.c.p(parcel, 7, this.f3695s, false);
        W0.c.j(parcel, 8, this.f3696t);
        W0.c.j(parcel, 9, this.f3697u);
        W0.c.b(parcel, iA);
    }
}
