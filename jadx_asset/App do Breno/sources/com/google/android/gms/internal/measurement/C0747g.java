package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0747g implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f6724m;

    public C0747g(Boolean bool) {
        this.f6724m = bool == null ? false : bool.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C0747g(Boolean.valueOf(this.f6724m));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0747g) && this.f6724m == ((C0747g) obj).f6724m;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return Double.valueOf(true != this.f6724m ? 0.0d : 1.0d);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return Boolean.toString(this.f6724m);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f6724m).hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean i() {
        return Boolean.valueOf(this.f6724m);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l(String str, U1 u12, List list) {
        if ("toString".equals(str)) {
            return new C0870v(Boolean.toString(this.f6724m));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", Boolean.toString(this.f6724m), str));
    }

    public final String toString() {
        return String.valueOf(this.f6724m);
    }
}
