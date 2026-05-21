package com.google.android.gms.common.internal;

import S0.C0504b;
import V0.A;
import V0.AbstractC0548g;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes.dex */
public final class f extends W0.a {
    public static final Parcelable.Creator<f> CREATOR = new A();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6249m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final IBinder f6250n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0504b f6251o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6252p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f6253q;

    public f(int i4, IBinder iBinder, C0504b c0504b, boolean z3, boolean z4) {
        this.f6249m = i4;
        this.f6250n = iBinder;
        this.f6251o = c0504b;
        this.f6252p = z3;
        this.f6253q = z4;
    }

    public final C0504b d() {
        return this.f6251o;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f6251o.equals(fVar.f6251o) && AbstractC0548g.a(f(), fVar.f());
    }

    public final IAccountAccessor f() {
        IBinder iBinder = this.f6250n;
        if (iBinder == null) {
            return null;
        }
        return IAccountAccessor.Stub.asInterface(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, this.f6249m);
        W0.c.i(parcel, 2, this.f6250n, false);
        W0.c.o(parcel, 3, this.f6251o, i4, false);
        W0.c.c(parcel, 4, this.f6252p);
        W0.c.c(parcel, 5, this.f6253q);
        W0.c.b(parcel, iA);
    }
}
