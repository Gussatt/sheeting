package com.google.android.gms.internal.measurement;

import android.net.Uri;
import o1.InterfaceC1466c;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0725d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f6677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6681e;

    public C0725d4(String str, Uri uri, String str2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, InterfaceC1466c interfaceC1466c) {
        this.f6677a = uri;
        this.f6678b = "";
        this.f6679c = "";
        this.f6680d = z3;
        this.f6681e = z5;
    }

    public final C0725d4 a() {
        return new C0725d4(null, this.f6677a, this.f6678b, this.f6679c, this.f6680d, false, true, false, null);
    }

    public final C0725d4 b() {
        String str = this.f6678b;
        if (str.isEmpty()) {
            return new C0725d4(null, this.f6677a, str, this.f6679c, true, false, this.f6681e, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final AbstractC0752g4 c(String str, double d4) {
        Double dValueOf = Double.valueOf(-3.0d);
        Object obj = AbstractC0752g4.f6729g;
        return new C0707b4(this, "measurement.test.double_flag", dValueOf, true);
    }

    public final AbstractC0752g4 d(String str, long j4) {
        Long lValueOf = Long.valueOf(j4);
        Object obj = AbstractC0752g4.f6729g;
        return new Z3(this, str, lValueOf, true);
    }

    public final AbstractC0752g4 e(String str, String str2) {
        Object obj = AbstractC0752g4.f6729g;
        return new C0716c4(this, str, str2, true);
    }

    public final AbstractC0752g4 f(String str, boolean z3) {
        Boolean boolValueOf = Boolean.valueOf(z3);
        Object obj = AbstractC0752g4.f6729g;
        return new C0698a4(this, str, boolValueOf, true);
    }

    public C0725d4(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }
}
