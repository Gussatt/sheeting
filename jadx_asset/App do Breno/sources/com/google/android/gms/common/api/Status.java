package com.google.android.gms.common.api;

import S0.C0504b;
import T0.c;
import T0.k;
import V0.AbstractC0548g;
import W0.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends a implements ReflectedParcelable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6184m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6185n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PendingIntent f6186o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0504b f6187p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Status f6176q = new Status(-1);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Status f6177r = new Status(0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Status f6178s = new Status(14);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Status f6179t = new Status(8);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Status f6180u = new Status(15);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Status f6181v = new Status(16);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Status f6183x = new Status(17);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Status f6182w = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new k();

    public Status(int i4, String str, PendingIntent pendingIntent, C0504b c0504b) {
        this.f6184m = i4;
        this.f6185n = str;
        this.f6186o = pendingIntent;
        this.f6187p = c0504b;
    }

    public C0504b d() {
        return this.f6187p;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f6184m == status.f6184m && AbstractC0548g.a(this.f6185n, status.f6185n) && AbstractC0548g.a(this.f6186o, status.f6186o) && AbstractC0548g.a(this.f6187p, status.f6187p);
    }

    public int f() {
        return this.f6184m;
    }

    public String g() {
        return this.f6185n;
    }

    public boolean h() {
        return this.f6186o != null;
    }

    public int hashCode() {
        return AbstractC0548g.b(Integer.valueOf(this.f6184m), this.f6185n, this.f6186o, this.f6187p);
    }

    public final String i() {
        String str = this.f6185n;
        return str != null ? str : c.a(this.f6184m);
    }

    public String toString() {
        AbstractC0548g.a aVarC = AbstractC0548g.c(this);
        aVarC.a("statusCode", i());
        aVarC.a("resolution", this.f6186o);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, f());
        W0.c.p(parcel, 2, g(), false);
        W0.c.o(parcel, 3, this.f6186o, i4, false);
        W0.c.o(parcel, 4, d(), i4, false);
        W0.c.b(parcel, iA);
    }

    public Status(int i4) {
        this(i4, (String) null);
    }

    public Status(C0504b c0504b, String str) {
        this(c0504b, str, 17);
    }

    public Status(int i4, String str) {
        this(i4, str, (PendingIntent) null);
    }

    public Status(C0504b c0504b, String str, int i4) {
        this(i4, str, c0504b.g(), c0504b);
    }

    public Status(int i4, String str, PendingIntent pendingIntent) {
        this(i4, str, pendingIntent, null);
    }
}
