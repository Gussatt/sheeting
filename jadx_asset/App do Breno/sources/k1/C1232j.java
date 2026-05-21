package k1;

import V0.AbstractC0549h;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: k1.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1232j extends W0.a {
    public static final Parcelable.Creator<C1232j> CREATOR = new C1240k();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f9481m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f9482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public s7 f9483o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f9484p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f9485q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f9486r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C1150J f9487s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f9488t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1150J f9489u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f9490v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C1150J f9491w;

    public C1232j(C1232j c1232j) {
        AbstractC0549h.j(c1232j);
        this.f9481m = c1232j.f9481m;
        this.f9482n = c1232j.f9482n;
        this.f9483o = c1232j.f9483o;
        this.f9484p = c1232j.f9484p;
        this.f9485q = c1232j.f9485q;
        this.f9486r = c1232j.f9486r;
        this.f9487s = c1232j.f9487s;
        this.f9488t = c1232j.f9488t;
        this.f9489u = c1232j.f9489u;
        this.f9490v = c1232j.f9490v;
        this.f9491w = c1232j.f9491w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.p(parcel, 2, this.f9481m, false);
        W0.c.p(parcel, 3, this.f9482n, false);
        W0.c.o(parcel, 4, this.f9483o, i4, false);
        W0.c.m(parcel, 5, this.f9484p);
        W0.c.c(parcel, 6, this.f9485q);
        W0.c.p(parcel, 7, this.f9486r, false);
        W0.c.o(parcel, 8, this.f9487s, i4, false);
        W0.c.m(parcel, 9, this.f9488t);
        W0.c.o(parcel, 10, this.f9489u, i4, false);
        W0.c.m(parcel, 11, this.f9490v);
        W0.c.o(parcel, 12, this.f9491w, i4, false);
        W0.c.b(parcel, iA);
    }

    public C1232j(String str, String str2, s7 s7Var, long j4, boolean z3, String str3, C1150J c1150j, long j5, C1150J c1150j2, long j6, C1150J c1150j3) {
        this.f9481m = str;
        this.f9482n = str2;
        this.f9483o = s7Var;
        this.f9484p = j4;
        this.f9485q = z3;
        this.f9486r = str3;
        this.f9487s = c1150j;
        this.f9488t = j5;
        this.f9489u = c1150j2;
        this.f9490v = j6;
        this.f9491w = c1150j3;
    }
}
