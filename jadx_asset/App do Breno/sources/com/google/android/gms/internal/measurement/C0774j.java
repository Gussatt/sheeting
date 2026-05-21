package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0774j implements r {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Double f6839m;

    public C0774j(Double d4) {
        if (d4 == null) {
            this.f6839m = Double.valueOf(Double.NaN);
        } else {
            this.f6839m = d4;
        }
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r d() {
        return new C0774j(this.f6839m);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0774j) {
            return this.f6839m.equals(((C0774j) obj).f6839m);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Double f() {
        return this.f6839m;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final String g() {
        Double d4 = this.f6839m;
        if (Double.isNaN(d4.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d4.doubleValue())) {
            return d4.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(d4.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : AbstractC0765i.a(bigDecimalValueOf);
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i4 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i4 >= 0 || i4 <= -7) && (i4 < 0 || i4 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final int hashCode() {
        return this.f6839m.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Boolean i() {
        Double d4 = this.f6839m;
        boolean z3 = false;
        if (!Double.isNaN(d4.doubleValue()) && d4.doubleValue() != 0.0d) {
            z3 = true;
        }
        return Boolean.valueOf(z3);
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final Iterator k() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.r
    public final r l(String str, U1 u12, List list) {
        if ("toString".equals(str)) {
            return new C0870v(g());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", g(), str));
    }

    public final String toString() {
        return g();
    }
}
