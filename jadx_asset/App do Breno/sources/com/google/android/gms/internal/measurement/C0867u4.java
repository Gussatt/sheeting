package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0867u4 extends C0899y4 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f6976p;

    public C0867u4(byte[] bArr, int i4, int i5) {
        super(bArr);
        A4.l(0, i5, bArr.length);
        this.f6976p = i5;
    }

    @Override // com.google.android.gms.internal.measurement.C0899y4, com.google.android.gms.internal.measurement.A4
    public final byte d(int i4) {
        int i5 = this.f6976p;
        if (((i5 - (i4 + 1)) | i4) >= 0) {
            return this.f7018o[i4];
        }
        if (i4 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i4);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i4 + ", " + i5);
    }

    @Override // com.google.android.gms.internal.measurement.C0899y4, com.google.android.gms.internal.measurement.A4
    public final byte f(int i4) {
        return this.f7018o[i4];
    }

    @Override // com.google.android.gms.internal.measurement.C0899y4, com.google.android.gms.internal.measurement.A4
    public final int g() {
        return this.f6976p;
    }

    @Override // com.google.android.gms.internal.measurement.C0899y4
    public final int s() {
        return 0;
    }
}
