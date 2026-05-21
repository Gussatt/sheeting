package com.google.android.gms.common.internal;

import S0.C0506d;
import V0.Q;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: loaded from: classes.dex */
public class b extends W0.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6230m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6231n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6232o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f6233p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IBinder f6234q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Scope[] f6235r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Bundle f6236s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Account f6237t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C0506d[] f6238u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0506d[] f6239v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f6240w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f6241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f6242y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final String f6243z;
    public static final Parcelable.Creator<b> CREATOR = new Q();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final Scope[] f6228A = new Scope[0];

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final C0506d[] f6229B = new C0506d[0];

    public b(int i4, int i5, int i6, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C0506d[] c0506dArr, C0506d[] c0506dArr2, boolean z3, int i7, boolean z4, String str2) {
        scopeArr = scopeArr == null ? f6228A : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        c0506dArr = c0506dArr == null ? f6229B : c0506dArr;
        c0506dArr2 = c0506dArr2 == null ? f6229B : c0506dArr2;
        this.f6230m = i4;
        this.f6231n = i5;
        this.f6232o = i6;
        if ("com.google.android.gms".equals(str)) {
            this.f6233p = "com.google.android.gms";
        } else {
            this.f6233p = str;
        }
        if (i4 < 2) {
            this.f6237t = iBinder != null ? AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(iBinder)) : null;
        } else {
            this.f6234q = iBinder;
            this.f6237t = account;
        }
        this.f6235r = scopeArr;
        this.f6236s = bundle;
        this.f6238u = c0506dArr;
        this.f6239v = c0506dArr2;
        this.f6240w = z3;
        this.f6241x = i7;
        this.f6242y = z4;
        this.f6243z = str2;
    }

    public String d() {
        return this.f6243z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Q.a(this, parcel, i4);
    }
}
