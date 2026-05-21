package S0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class G extends W0.a {
    public static final Parcelable.Creator<G> CREATOR = new H();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f3405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3406n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f3407o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3408p;

    public G(boolean z3, String str, int i4, int i5) {
        this.f3405m = z3;
        this.f3406n = str;
        this.f3407o = N.a(i4) - 1;
        this.f3408p = t.a(i5) - 1;
    }

    public final String d() {
        return this.f3406n;
    }

    public final boolean f() {
        return this.f3405m;
    }

    public final int g() {
        return t.a(this.f3408p);
    }

    public final int h() {
        return N.a(this.f3407o);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.c(parcel, 1, this.f3405m);
        W0.c.p(parcel, 2, this.f3406n, false);
        W0.c.j(parcel, 3, this.f3407o);
        W0.c.j(parcel, 4, this.f3408p);
        W0.c.b(parcel, iA);
    }
}
