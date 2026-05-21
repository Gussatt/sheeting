package S0;

import V0.AbstractC0548g;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: S0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0506d extends W0.a {
    public static final Parcelable.Creator<C0506d> CREATOR = new s();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3429m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3430n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f3431o;

    public C0506d(String str, int i4, long j4) {
        this.f3429m = str;
        this.f3430n = i4;
        this.f3431o = j4;
    }

    public String d() {
        return this.f3429m;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0506d) {
            C0506d c0506d = (C0506d) obj;
            if (((d() != null && d().equals(c0506d.d())) || (d() == null && c0506d.d() == null)) && f() == c0506d.f()) {
                return true;
            }
        }
        return false;
    }

    public long f() {
        long j4 = this.f3431o;
        return j4 == -1 ? this.f3430n : j4;
    }

    public final int hashCode() {
        return AbstractC0548g.b(d(), Long.valueOf(f()));
    }

    public final String toString() {
        AbstractC0548g.a aVarC = AbstractC0548g.c(this);
        aVarC.a("name", d());
        aVarC.a("version", Long.valueOf(f()));
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.p(parcel, 1, d(), false);
        W0.c.j(parcel, 2, this.f3430n);
        W0.c.m(parcel, 3, f());
        W0.c.b(parcel, iA);
    }

    public C0506d(String str, long j4) {
        this.f3429m = str;
        this.f3431o = j4;
        this.f3430n = -1;
    }
}
