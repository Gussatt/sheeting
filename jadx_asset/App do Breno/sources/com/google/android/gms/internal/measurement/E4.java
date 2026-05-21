package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class E4 extends H4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6323d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6325f;

    public E4(byte[] bArr, int i4, int i5) {
        super(null);
        int length = bArr.length;
        if (((length - i5) | i5) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i5)));
        }
        this.f6323d = bArr;
        this.f6325f = 0;
        this.f6324e = i5;
    }

    public final void A(byte[] bArr, int i4, int i5) {
        try {
            System.arraycopy(bArr, 0, this.f6323d, this.f6325f, i5);
            this.f6325f += i5;
        } catch (IndexOutOfBoundsException e4) {
            throw new F4(this.f6325f, this.f6324e, i5, e4);
        }
    }

    public final void B(String str) throws F4 {
        int i4 = this.f6325f;
        try {
            int iZ = H4.z(str.length() * 3);
            int iZ2 = H4.z(str.length());
            if (iZ2 != iZ) {
                t(U5.c(str));
                byte[] bArr = this.f6323d;
                int i5 = this.f6325f;
                this.f6325f = U5.b(str, bArr, i5, this.f6324e - i5);
                return;
            }
            int i6 = i4 + iZ2;
            this.f6325f = i6;
            int iB = U5.b(str, this.f6323d, i6, this.f6324e - i6);
            this.f6325f = i4;
            t((iB - i4) - iZ2);
            this.f6325f = iB;
        } catch (T5 e4) {
            this.f6325f = i4;
            c(str, e4);
        } catch (IndexOutOfBoundsException e5) {
            throw new F4(e5);
        }
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final int e() {
        return this.f6324e - this.f6325f;
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void f(byte b4) throws F4 {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i4 = this.f6325f;
        try {
            int i5 = i4 + 1;
            try {
                this.f6323d[i4] = b4;
                this.f6325f = i5;
            } catch (IndexOutOfBoundsException e4) {
                indexOutOfBoundsException = e4;
                i4 = i5;
                throw new F4(i4, this.f6324e, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e5) {
            indexOutOfBoundsException = e5;
        }
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void g(int i4, boolean z3) throws F4 {
        t(i4 << 3);
        f(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void h(int i4, A4 a4) throws F4 {
        t((i4 << 3) | 2);
        t(a4.g());
        a4.k(this);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void i(int i4, int i5) throws F4 {
        t((i4 << 3) | 5);
        j(i5);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void j(int i4) throws F4 {
        int i5 = this.f6325f;
        try {
            byte[] bArr = this.f6323d;
            bArr[i5] = (byte) i4;
            bArr[i5 + 1] = (byte) (i4 >> 8);
            bArr[i5 + 2] = (byte) (i4 >> 16);
            bArr[i5 + 3] = (byte) (i4 >> 24);
            this.f6325f = i5 + 4;
        } catch (IndexOutOfBoundsException e4) {
            throw new F4(i5, this.f6324e, 4, e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void k(int i4, long j4) throws F4 {
        t((i4 << 3) | 1);
        l(j4);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void l(long j4) throws F4 {
        int i4 = this.f6325f;
        try {
            byte[] bArr = this.f6323d;
            bArr[i4] = (byte) j4;
            bArr[i4 + 1] = (byte) (j4 >> 8);
            bArr[i4 + 2] = (byte) (j4 >> 16);
            bArr[i4 + 3] = (byte) (j4 >> 24);
            bArr[i4 + 4] = (byte) (j4 >> 32);
            bArr[i4 + 5] = (byte) (j4 >> 40);
            bArr[i4 + 6] = (byte) (j4 >> 48);
            bArr[i4 + 7] = (byte) (j4 >> 56);
            this.f6325f = i4 + 8;
        } catch (IndexOutOfBoundsException e4) {
            throw new F4(i4, this.f6324e, 8, e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void m(int i4, int i5) throws F4 {
        t(i4 << 3);
        n(i5);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void n(int i4) throws F4 {
        if (i4 >= 0) {
            t(i4);
        } else {
            v(i4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void o(byte[] bArr, int i4, int i5) {
        A(bArr, 0, i5);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void p(int i4, InterfaceC0860t5 interfaceC0860t5, E5 e5) throws F4 {
        t((i4 << 3) | 2);
        t(((AbstractC0804m4) interfaceC0860t5).d(e5));
        e5.c(interfaceC0860t5, this.f6364a);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void q(int i4, String str) throws F4 {
        t((i4 << 3) | 2);
        B(str);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void r(int i4, int i5) throws F4 {
        t((i4 << 3) | i5);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void s(int i4, int i5) throws F4 {
        t(i4 << 3);
        t(i5);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void t(int i4) throws F4 {
        int i5;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i6 = this.f6325f;
        while ((i4 & (-128)) != 0) {
            try {
                i5 = i6 + 1;
                try {
                    this.f6323d[i6] = (byte) (i4 | 128);
                    i4 >>>= 7;
                    i6 = i5;
                } catch (IndexOutOfBoundsException e4) {
                    indexOutOfBoundsException = e4;
                    i6 = i5;
                    throw new F4(i6, this.f6324e, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e5) {
                indexOutOfBoundsException = e5;
                throw new F4(i6, this.f6324e, 1, indexOutOfBoundsException);
            }
        }
        i5 = i6 + 1;
        this.f6323d[i6] = (byte) i4;
        this.f6325f = i5;
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void u(int i4, long j4) throws F4 {
        t(i4 << 3);
        v(j4);
    }

    @Override // com.google.android.gms.internal.measurement.H4
    public final void v(long j4) throws F4 {
        int i4;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i5 = this.f6325f;
        if (!H4.f6363c || this.f6324e - i5 < 10) {
            int i6 = i5;
            while ((j4 & (-128)) != 0) {
                try {
                    int i7 = i6 + 1;
                    try {
                        this.f6323d[i6] = (byte) (((int) j4) | 128);
                        j4 >>>= 7;
                        i6 = i7;
                    } catch (IndexOutOfBoundsException e4) {
                        indexOutOfBoundsException = e4;
                        i6 = i7;
                        throw new F4(i6, this.f6324e, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e5) {
                    indexOutOfBoundsException = e5;
                }
            }
            i4 = i6 + 1;
            try {
                this.f6323d[i6] = (byte) j4;
            } catch (IndexOutOfBoundsException e6) {
                indexOutOfBoundsException = e6;
                i6 = i4;
                throw new F4(i6, this.f6324e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j4 & (-128)) != 0) {
                R5.s(this.f6323d, i5, (byte) (((int) j4) | 128));
                j4 >>>= 7;
                i5++;
            }
            i4 = i5 + 1;
            R5.s(this.f6323d, i5, (byte) j4);
        }
        this.f6325f = i4;
    }
}
