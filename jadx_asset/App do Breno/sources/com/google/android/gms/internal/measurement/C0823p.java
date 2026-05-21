package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0823p implements r {
    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return r.f6933c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof C0823p;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        return "null";
    }

    public final int hashCode() {
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean i() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l(String str, U1 u12, List list) {
        throw new IllegalStateException(String.format("null has no function %s", str));
    }
}
