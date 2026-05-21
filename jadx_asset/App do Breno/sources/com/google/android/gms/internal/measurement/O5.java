package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class O5 extends Q5 {
    public O5(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final double a(Object obj, long j4) {
        return Double.longBitsToDouble(this.f6558a.getLong(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final float b(Object obj, long j4) {
        return Float.intBitsToFloat(this.f6558a.getInt(obj, j4));
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final void c(Object obj, long j4, boolean z3) {
        if (R5.f6573h) {
            R5.d(obj, j4, z3 ? (byte) 1 : (byte) 0);
        } else {
            R5.e(obj, j4, z3 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final void d(Object obj, long j4, byte b4) {
        if (R5.f6573h) {
            R5.d(obj, j4, b4);
        } else {
            R5.e(obj, j4, b4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final void e(Object obj, long j4, double d4) {
        this.f6558a.putLong(obj, j4, Double.doubleToLongBits(d4));
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final void f(Object obj, long j4, float f4) {
        this.f6558a.putInt(obj, j4, Float.floatToIntBits(f4));
    }

    @Override // com.google.android.gms.internal.measurement.Q5
    public final boolean g(Object obj, long j4) {
        return R5.f6573h ? R5.y(obj, j4) : R5.z(obj, j4);
    }
}
