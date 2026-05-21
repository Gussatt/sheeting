package Y0;

import V0.AbstractC0549h;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class d extends W0.a {
    public static final Parcelable.Creator<d> CREATOR = new h();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f4004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f4005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Long f4006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f4007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f4008q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f4009r;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f4010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f4011b;

        public a(long j4, long j5) {
            AbstractC0549h.m(j5);
            this.f4010a = j4;
            this.f4011b = j5;
        }
    }

    public d(int i4, int i5, Long l4, Long l5, int i6) {
        this.f4004m = i4;
        this.f4005n = i5;
        this.f4006o = l4;
        this.f4007p = l5;
        this.f4008q = i6;
        this.f4009r = (l4 == null || l5 == null || l5.longValue() == 0) ? null : new a(l4.longValue(), l5.longValue());
    }

    public int d() {
        return this.f4008q;
    }

    public int f() {
        return this.f4005n;
    }

    public int g() {
        return this.f4004m;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, g());
        W0.c.j(parcel, 2, f());
        W0.c.n(parcel, 3, this.f4006o, false);
        W0.c.n(parcel, 4, this.f4007p, false);
        W0.c.j(parcel, 5, d());
        W0.c.b(parcel, iA);
    }
}
