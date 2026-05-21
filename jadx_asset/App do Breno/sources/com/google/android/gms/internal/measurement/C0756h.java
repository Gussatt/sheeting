package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0756h implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r f6740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6741n;

    public C0756h(String str) {
        this.f6740m = r.f6932b;
        this.f6741n = str;
    }

    public final r a() {
        return this.f6740m;
    }

    public final String b() {
        return this.f6741n;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C0756h(this.f6741n, this.f6740m.d());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0756h)) {
            return false;
        }
        C0756h c0756h = (C0756h) obj;
        return this.f6741n.equals(c0756h.f6741n) && this.f6740m.equals(c0756h.f6740m);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        throw new IllegalStateException("Control is not a String");
    }

    public final int hashCode() {
        return (this.f6741n.hashCode() * 31) + this.f6740m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean i() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l(String str, U1 u12, List list) {
        throw new IllegalStateException("Control does not have functions");
    }

    public C0756h(String str, r rVar) {
        this.f6740m = rVar;
        this.f6741n = str;
    }
}
