package com.google.android.gms.common.api;

import T0.j;
import V0.AbstractC0549h;
import W0.a;
import W0.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new j();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6175n;

    public Scope(int i4, String str) {
        AbstractC0549h.e(str, "scopeUri must not be null or empty");
        this.f6174m = i4;
        this.f6175n = str;
    }

    public String d() {
        return this.f6175n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f6175n.equals(((Scope) obj).f6175n);
        }
        return false;
    }

    public int hashCode() {
        return this.f6175n.hashCode();
    }

    public String toString() {
        return this.f6175n;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f6174m;
        int iA = c.a(parcel);
        c.j(parcel, 1, i5);
        c.p(parcel, 2, d(), false);
        c.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
