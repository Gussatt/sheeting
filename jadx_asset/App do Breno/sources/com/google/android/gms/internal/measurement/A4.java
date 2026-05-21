package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class A4 implements Iterable, Serializable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final A4 f6292n = new C0899y4(AbstractC0717c5.f6668b);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f6293m = 0;

    static {
        int i4 = AbstractC0820o4.f6909a;
    }

    public static int l(int i4, int i5, int i6) {
        int i7 = i5 - i4;
        if ((i4 | i5 | i7 | (i6 - i5)) >= 0) {
            return i7;
        }
        if (i4 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i4 + " < 0");
        }
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i4 + ", " + i5);
        }
        throw new IndexOutOfBoundsException("End index: " + i5 + " >= " + i6);
    }

    public static A4 p(byte[] bArr, int i4, int i5) {
        l(i4, i4 + i5, bArr.length);
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, i4, bArr2, 0, i5);
        return new C0899y4(bArr2);
    }

    public abstract byte d(int i4);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i4);

    public abstract int g();

    public abstract int h(int i4, int i5, int i6);

    public final int hashCode() {
        int iH = this.f6293m;
        if (iH == 0) {
            int iG = g();
            iH = h(iG, 0, iG);
            if (iH == 0) {
                iH = 1;
            }
            this.f6293m = iH;
        }
        return iH;
    }

    public abstract A4 i(int i4, int i5);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C0851s4(this);
    }

    public abstract void k(AbstractC0843r4 abstractC0843r4);

    public final int o() {
        return this.f6293m;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(g()), g() <= 50 ? I5.a(this) : I5.a(i(0, 47)).concat("..."));
    }
}
