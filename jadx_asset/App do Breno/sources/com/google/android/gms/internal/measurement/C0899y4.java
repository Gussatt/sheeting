package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0899y4 extends AbstractC0891x4 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final byte[] f7018o;

    public C0899y4(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f7018o = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public byte d(int i4) {
        return this.f7018o[i4];
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A4) || g() != ((A4) obj).g()) {
            return false;
        }
        if (g() == 0) {
            return true;
        }
        if (!(obj instanceof C0899y4)) {
            return obj.equals(this);
        }
        C0899y4 c0899y4 = (C0899y4) obj;
        int iO = o();
        int iO2 = c0899y4.o();
        if (iO != 0 && iO2 != 0 && iO != iO2) {
            return false;
        }
        int iG = g();
        if (iG > c0899y4.g()) {
            throw new IllegalArgumentException("Length too large: " + iG + g());
        }
        if (iG > c0899y4.g()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iG + ", " + c0899y4.g());
        }
        byte[] bArr = this.f7018o;
        byte[] bArr2 = c0899y4.f7018o;
        c0899y4.s();
        int i4 = 0;
        int i5 = 0;
        while (i4 < iG) {
            if (bArr[i4] != bArr2[i5]) {
                return false;
            }
            i4++;
            i5++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public byte f(int i4) {
        return this.f7018o[i4];
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public int g() {
        return this.f7018o.length;
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final int h(int i4, int i5, int i6) {
        return AbstractC0717c5.b(i4, this.f7018o, 0, i6);
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final A4 i(int i4, int i5) {
        int iL = A4.l(0, i5, g());
        return iL == 0 ? A4.f6292n : new C0867u4(this.f7018o, 0, iL);
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final void k(AbstractC0843r4 abstractC0843r4) {
        ((E4) abstractC0843r4).A(this.f7018o, 0, g());
    }

    public int s() {
        return 0;
    }
}
