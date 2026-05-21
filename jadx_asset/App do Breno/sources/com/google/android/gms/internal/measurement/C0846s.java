package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0846s implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f6944m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f6945n;

    public C0846s(String str, List list) {
        this.f6944m = str;
        ArrayList arrayList = new ArrayList();
        this.f6945n = arrayList;
        arrayList.addAll(list);
    }

    public final String a() {
        return this.f6944m;
    }

    public final ArrayList b() {
        return this.f6945n;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0846s)) {
            return false;
        }
        C0846s c0846s = (C0846s) obj;
        String str = this.f6944m;
        if (str == null ? c0846s.f6944m == null : str.equals(c0846s.f6944m)) {
            return this.f6945n.equals(c0846s.f6945n);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final int hashCode() {
        String str = this.f6944m;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f6945n.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean i() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l(String str, U1 u12, List list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
}
