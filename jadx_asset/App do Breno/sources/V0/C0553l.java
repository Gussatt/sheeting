package V0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: V0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0553l extends W0.a {
    public static final Parcelable.Creator<C0553l> CREATOR = new C0557p();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3710m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f3711n;

    public C0553l(int i4, List list) {
        this.f3710m = i4;
        this.f3711n = list;
    }

    public final int d() {
        return this.f3710m;
    }

    public final List f() {
        return this.f3711n;
    }

    public final void g(C0547f c0547f) {
        if (this.f3711n == null) {
            this.f3711n = new ArrayList();
        }
        this.f3711n.add(c0547f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, this.f3710m);
        W0.c.s(parcel, 2, this.f3711n, false);
        W0.c.b(parcel, iA);
    }
}
