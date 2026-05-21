package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends W0.a {
    public static final Parcelable.Creator<H0> CREATOR = new I0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6356m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6357n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Intent f6358o;

    public H0(int i4, String str, Intent intent) {
        this.f6356m = i4;
        this.f6357n = str;
        this.f6358o = intent;
    }

    public static H0 d(Activity activity) {
        return new H0(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return this.f6356m == h02.f6356m && Objects.equals(this.f6357n, h02.f6357n) && Objects.equals(this.f6358o, h02.f6358o);
    }

    public final int hashCode() {
        return this.f6356m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f6356m;
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, i5);
        W0.c.p(parcel, 2, this.f6357n, false);
        W0.c.o(parcel, 3, this.f6358o, i4, false);
        W0.c.b(parcel, iA);
    }
}
