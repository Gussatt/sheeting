package S0;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class E extends W0.a {
    public static final Parcelable.Creator<E> CREATOR = new F();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f3400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f3402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f3403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f3404r;

    public E(String str, boolean z3, boolean z4, IBinder iBinder, boolean z5, boolean z6) {
        this.f3399m = str;
        this.f3400n = z3;
        this.f3401o = z4;
        this.f3402p = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.f3403q = z5;
        this.f3404r = z6;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.google.android.gms.dynamic.IObjectWrapper] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        String str = this.f3399m;
        int iA = W0.c.a(parcel);
        W0.c.p(parcel, 1, str, false);
        W0.c.c(parcel, 2, this.f3400n);
        W0.c.c(parcel, 3, this.f3401o);
        W0.c.i(parcel, 4, ObjectWrapper.wrap(this.f3402p), false);
        W0.c.c(parcel, 5, this.f3403q);
        W0.c.c(parcel, 6, this.f3404r);
        W0.c.b(parcel, iA);
    }
}
