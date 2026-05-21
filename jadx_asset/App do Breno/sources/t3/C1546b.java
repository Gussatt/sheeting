package t3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: t3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1546b implements InterfaceC1548d, InterfaceC1547c, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public M f11395m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11396n;

    /* JADX INFO: renamed from: t3.b$a */
    public static final class a implements Closeable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public C1546b f11397m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public M f11398n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public byte[] f11400p;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public long f11399o = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f11401q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f11402r = -1;

        public final void a(M m4) {
            this.f11398n = m4;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f11397m == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.f11397m = null;
            a(null);
            this.f11399o = -1L;
            this.f11400p = null;
            this.f11401q = -1;
            this.f11402r = -1;
        }
    }

    /* JADX INFO: renamed from: t3.b$c */
    public static final class c extends OutputStream {
        public c() {
        }

        public String toString() {
            return C1546b.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i4) {
            C1546b.this.X(i4);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) {
            X2.l.e(bArr, "data");
            C1546b.this.V(bArr, i4, i5);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }
    }

    @Override // t3.InterfaceC1548d
    public short A() {
        return AbstractC1545a.g(H());
    }

    public C1549e C(long j4) throws EOFException {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (O() < j4) {
            throw new EOFException();
        }
        if (j4 < 4096) {
            return new C1549e(x(j4));
        }
        C1549e c1549eS = S((int) j4);
        skip(j4);
        return c1549eS;
    }

    public void D(byte[] bArr) throws EOFException {
        X2.l.e(bArr, "sink");
        int i4 = 0;
        while (i4 < bArr.length) {
            int i5 = read(bArr, i4, bArr.length - i4);
            if (i5 == -1) {
                throw new EOFException();
            }
            i4 += i5;
        }
    }

    @Override // t3.InterfaceC1548d
    public long E() {
        return AbstractC1545a.f(G());
    }

    public int F() throws EOFException {
        if (O() < 4) {
            throw new EOFException();
        }
        M m4 = this.f11395m;
        X2.l.b(m4);
        int i4 = m4.f11372b;
        int i5 = m4.f11373c;
        if (i5 - i4 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = m4.f11371a;
        int i6 = i4 + 3;
        int i7 = ((bArr[i4 + 1] & 255) << 16) | ((bArr[i4] & 255) << 24) | ((bArr[i4 + 2] & 255) << 8);
        int i8 = i4 + 4;
        int i9 = (bArr[i6] & 255) | i7;
        M(O() - 4);
        if (i8 != i5) {
            m4.f11372b = i8;
            return i9;
        }
        this.f11395m = m4.b();
        N.b(m4);
        return i9;
    }

    public long G() throws EOFException {
        if (O() < 8) {
            throw new EOFException();
        }
        M m4 = this.f11395m;
        X2.l.b(m4);
        int i4 = m4.f11372b;
        int i5 = m4.f11373c;
        if (i5 - i4 < 8) {
            return ((((long) F()) & 4294967295L) << 32) | (4294967295L & ((long) F()));
        }
        byte[] bArr = m4.f11371a;
        int i6 = i4 + 7;
        long j4 = ((((long) bArr[i4]) & 255) << 56) | ((((long) bArr[i4 + 1]) & 255) << 48) | ((((long) bArr[i4 + 2]) & 255) << 40) | ((((long) bArr[i4 + 3]) & 255) << 32) | ((((long) bArr[i4 + 4]) & 255) << 24) | ((((long) bArr[i4 + 5]) & 255) << 16) | ((((long) bArr[i4 + 6]) & 255) << 8);
        int i7 = i4 + 8;
        long j5 = j4 | (((long) bArr[i6]) & 255);
        M(O() - 8);
        if (i7 != i5) {
            m4.f11372b = i7;
            return j5;
        }
        this.f11395m = m4.b();
        N.b(m4);
        return j5;
    }

    public short H() throws EOFException {
        if (O() < 2) {
            throw new EOFException();
        }
        M m4 = this.f11395m;
        X2.l.b(m4);
        int i4 = m4.f11372b;
        int i5 = m4.f11373c;
        if (i5 - i4 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = m4.f11371a;
        int i6 = i4 + 1;
        int i7 = (bArr[i4] & 255) << 8;
        int i8 = i4 + 2;
        int i9 = (bArr[i6] & 255) | i7;
        M(O() - 2);
        if (i8 == i5) {
            this.f11395m = m4.b();
            N.b(m4);
        } else {
            m4.f11372b = i8;
        }
        return (short) i9;
    }

    public String I(long j4, Charset charset) throws EOFException {
        X2.l.e(charset, "charset");
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (this.f11396n < j4) {
            throw new EOFException();
        }
        if (j4 == 0) {
            return "";
        }
        M m4 = this.f11395m;
        X2.l.b(m4);
        int i4 = m4.f11372b;
        if (((long) i4) + j4 > m4.f11373c) {
            return new String(x(j4), charset);
        }
        int i5 = (int) j4;
        String str = new String(m4.f11371a, i4, i5, charset);
        int i6 = m4.f11372b + i5;
        m4.f11372b = i6;
        this.f11396n -= j4;
        if (i6 == m4.f11373c) {
            this.f11395m = m4.b();
            N.b(m4);
        }
        return str;
    }

    @Override // t3.InterfaceC1548d
    public void K(long j4) throws EOFException {
        if (this.f11396n < j4) {
            throw new EOFException();
        }
    }

    public final void M(long j4) {
        this.f11396n = j4;
    }

    @Override // t3.InterfaceC1547c
    public OutputStream N() {
        return new c();
    }

    public final long O() {
        return this.f11396n;
    }

    @Override // t3.InterfaceC1548d
    public InputStream P() {
        return new C0176b();
    }

    public final C1549e R() {
        if (O() <= 2147483647L) {
            return S((int) O());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + O()).toString());
    }

    public final C1549e S(int i4) {
        if (i4 == 0) {
            return C1549e.f11406q;
        }
        AbstractC1545a.b(O(), 0L, i4);
        M m4 = this.f11395m;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i6 < i4) {
            X2.l.b(m4);
            int i8 = m4.f11373c;
            int i9 = m4.f11372b;
            if (i8 == i9) {
                throw new AssertionError("s.limit == s.pos");
            }
            i6 += i8 - i9;
            i7++;
            m4 = m4.f11376f;
        }
        byte[][] bArr = new byte[i7][];
        int[] iArr = new int[i7 * 2];
        M m5 = this.f11395m;
        int i10 = 0;
        while (i5 < i4) {
            X2.l.b(m5);
            bArr[i10] = m5.f11371a;
            i5 += m5.f11373c - m5.f11372b;
            iArr[i10] = Math.min(i5, i4);
            iArr[i10 + i7] = m5.f11372b;
            m5.f11374d = true;
            i10++;
            m5 = m5.f11376f;
        }
        return new O(bArr, iArr);
    }

    public final M T(int i4) {
        if (i4 < 1 || i4 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        M m4 = this.f11395m;
        if (m4 != null) {
            X2.l.b(m4);
            M m5 = m4.f11377g;
            X2.l.b(m5);
            return (m5.f11373c + i4 > 8192 || !m5.f11375e) ? m5.c(N.c()) : m5;
        }
        M mC = N.c();
        this.f11395m = mC;
        mC.f11377g = mC;
        mC.f11376f = mC;
        return mC;
    }

    public C1546b U(C1549e c1549e) {
        X2.l.e(c1549e, "byteString");
        c1549e.D(this, 0, c1549e.y());
        return this;
    }

    public C1546b V(byte[] bArr, int i4, int i5) {
        X2.l.e(bArr, "source");
        long j4 = i5;
        AbstractC1545a.b(bArr.length, i4, j4);
        int i6 = i5 + i4;
        while (i4 < i6) {
            M mT = T(1);
            int iMin = Math.min(i6 - i4, 8192 - mT.f11373c);
            int i7 = i4 + iMin;
            L2.i.d(bArr, mT.f11371a, mT.f11373c, i4, i7);
            mT.f11373c += iMin;
            i4 = i7;
        }
        M(O() + j4);
        return this;
    }

    public long W(Q q4) {
        X2.l.e(q4, "source");
        long j4 = 0;
        while (true) {
            long jO = q4.o(this, 8192L);
            if (jO == -1) {
                return j4;
            }
            j4 += jO;
        }
    }

    public C1546b X(int i4) {
        M mT = T(1);
        byte[] bArr = mT.f11371a;
        int i5 = mT.f11373c;
        mT.f11373c = i5 + 1;
        bArr[i5] = (byte) i4;
        M(O() + 1);
        return this;
    }

    public C1546b Y(String str) {
        X2.l.e(str, "string");
        return Z(str, 0, str.length());
    }

    public C1546b Z(String str, int i4, int i5) {
        char cCharAt;
        X2.l.e(str, "string");
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i4).toString());
        }
        if (i5 < i4) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i5 + " < " + i4).toString());
        }
        if (i5 > str.length()) {
            throw new IllegalArgumentException(("endIndex > string.length: " + i5 + " > " + str.length()).toString());
        }
        while (i4 < i5) {
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 128) {
                M mT = T(1);
                byte[] bArr = mT.f11371a;
                int i6 = mT.f11373c - i4;
                int iMin = Math.min(i5, 8192 - i6);
                int i7 = i4 + 1;
                bArr[i4 + i6] = (byte) cCharAt2;
                while (true) {
                    i4 = i7;
                    if (i4 >= iMin || (cCharAt = str.charAt(i4)) >= 128) {
                        break;
                    }
                    i7 = i4 + 1;
                    bArr[i4 + i6] = (byte) cCharAt;
                }
                int i8 = mT.f11373c;
                int i9 = (i6 + i4) - i8;
                mT.f11373c = i8 + i9;
                M(O() + ((long) i9));
            } else {
                if (cCharAt2 < 2048) {
                    M mT2 = T(2);
                    byte[] bArr2 = mT2.f11371a;
                    int i10 = mT2.f11373c;
                    bArr2[i10] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i10 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    mT2.f11373c = i10 + 2;
                    M(O() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    M mT3 = T(3);
                    byte[] bArr3 = mT3.f11371a;
                    int i11 = mT3.f11373c;
                    bArr3[i11] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i11 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i11 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    mT3.f11373c = i11 + 3;
                    M(O() + 3);
                } else {
                    int i12 = i4 + 1;
                    char cCharAt3 = i12 < i5 ? str.charAt(i12) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        X(63);
                        i4 = i12;
                    } else {
                        int i13 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        M mT4 = T(4);
                        byte[] bArr4 = mT4.f11371a;
                        int i14 = mT4.f11373c;
                        bArr4[i14] = (byte) ((i13 >> 18) | 240);
                        bArr4[i14 + 1] = (byte) (((i13 >> 12) & 63) | 128);
                        bArr4[i14 + 2] = (byte) (((i13 >> 6) & 63) | 128);
                        bArr4[i14 + 3] = (byte) ((i13 & 63) | 128);
                        mT4.f11373c = i14 + 4;
                        M(O() + 4);
                        i4 += 2;
                    }
                }
                i4++;
            }
        }
        return this;
    }

    public final void a() throws EOFException {
        skip(O());
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C1546b clone() {
        return k();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1546b)) {
            return false;
        }
        C1546b c1546b = (C1546b) obj;
        if (O() != c1546b.O()) {
            return false;
        }
        if (O() == 0) {
            return true;
        }
        M m4 = this.f11395m;
        X2.l.b(m4);
        M m5 = c1546b.f11395m;
        X2.l.b(m5);
        int i4 = m4.f11372b;
        int i5 = m5.f11372b;
        long j4 = 0;
        while (j4 < O()) {
            long jMin = Math.min(m4.f11373c - i4, m5.f11373c - i5);
            long j5 = 0;
            while (j5 < jMin) {
                int i6 = i4 + 1;
                int i7 = i5 + 1;
                if (m4.f11371a[i4] != m5.f11371a[i5]) {
                    return false;
                }
                j5++;
                i4 = i6;
                i5 = i7;
            }
            if (i4 == m4.f11373c) {
                m4 = m4.f11376f;
                X2.l.b(m4);
                i4 = m4.f11372b;
            }
            if (i5 == m5.f11373c) {
                m5 = m5.f11376f;
                X2.l.b(m5);
                i5 = m5.f11372b;
            }
            j4 += jMin;
        }
        return true;
    }

    public final long g() {
        long jO = O();
        if (jO == 0) {
            return 0L;
        }
        M m4 = this.f11395m;
        X2.l.b(m4);
        M m5 = m4.f11377g;
        X2.l.b(m5);
        int i4 = m5.f11373c;
        return (i4 >= 8192 || !m5.f11375e) ? jO : jO - ((long) (i4 - m5.f11372b));
    }

    @Override // t3.InterfaceC1548d
    public String h(long j4) {
        return I(j4, f3.c.f7276b);
    }

    public int hashCode() {
        M m4 = this.f11395m;
        if (m4 == null) {
            return 0;
        }
        int i4 = 1;
        do {
            int i5 = m4.f11373c;
            for (int i6 = m4.f11372b; i6 < i5; i6++) {
                i4 = (i4 * 31) + m4.f11371a[i6];
            }
            m4 = m4.f11376f;
            X2.l.b(m4);
        } while (m4 != this.f11395m);
        return i4;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public final C1546b k() {
        C1546b c1546b = new C1546b();
        if (O() == 0) {
            return c1546b;
        }
        M m4 = this.f11395m;
        X2.l.b(m4);
        M mD = m4.d();
        c1546b.f11395m = mD;
        mD.f11377g = mD;
        mD.f11376f = mD;
        for (M m5 = m4.f11376f; m5 != m4; m5 = m5.f11376f) {
            M m6 = mD.f11377g;
            X2.l.b(m6);
            X2.l.b(m5);
            m6.c(m5.d());
        }
        c1546b.M(O());
        return c1546b;
    }

    public final byte l(long j4) {
        AbstractC1545a.b(O(), j4, 1L);
        M m4 = this.f11395m;
        if (m4 == null) {
            X2.l.b(null);
            throw null;
        }
        if (O() - j4 < j4) {
            long jO = O();
            while (jO > j4) {
                m4 = m4.f11377g;
                X2.l.b(m4);
                jO -= (long) (m4.f11373c - m4.f11372b);
            }
            X2.l.b(m4);
            return m4.f11371a[(int) ((((long) m4.f11372b) + j4) - jO)];
        }
        long j5 = 0;
        while (true) {
            long j6 = ((long) (m4.f11373c - m4.f11372b)) + j5;
            if (j6 > j4) {
                X2.l.b(m4);
                return m4.f11371a[(int) ((((long) m4.f11372b) + j4) - j5)];
            }
            m4 = m4.f11376f;
            X2.l.b(m4);
            j5 = j6;
        }
    }

    @Override // t3.P
    public void m(C1546b c1546b, long j4) {
        M m4;
        X2.l.e(c1546b, "source");
        if (c1546b == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC1545a.b(c1546b.O(), 0L, j4);
        while (j4 > 0) {
            M m5 = c1546b.f11395m;
            X2.l.b(m5);
            int i4 = m5.f11373c;
            X2.l.b(c1546b.f11395m);
            if (j4 < i4 - r1.f11372b) {
                M m6 = this.f11395m;
                if (m6 != null) {
                    X2.l.b(m6);
                    m4 = m6.f11377g;
                } else {
                    m4 = null;
                }
                if (m4 != null && m4.f11375e) {
                    if ((((long) m4.f11373c) + j4) - ((long) (m4.f11374d ? 0 : m4.f11372b)) <= 8192) {
                        M m7 = c1546b.f11395m;
                        X2.l.b(m7);
                        m7.f(m4, (int) j4);
                        c1546b.M(c1546b.O() - j4);
                        M(O() + j4);
                        return;
                    }
                }
                M m8 = c1546b.f11395m;
                X2.l.b(m8);
                c1546b.f11395m = m8.e((int) j4);
            }
            M m9 = c1546b.f11395m;
            X2.l.b(m9);
            long j5 = m9.f11373c - m9.f11372b;
            c1546b.f11395m = m9.b();
            M m10 = this.f11395m;
            if (m10 == null) {
                this.f11395m = m9;
                m9.f11377g = m9;
                m9.f11376f = m9;
            } else {
                X2.l.b(m10);
                M m11 = m10.f11377g;
                X2.l.b(m11);
                m11.c(m9).a();
            }
            c1546b.M(c1546b.O() - j5);
            M(O() + j5);
            j4 -= j5;
        }
    }

    @Override // t3.Q
    public long o(C1546b c1546b, long j4) {
        X2.l.e(c1546b, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (O() == 0) {
            return -1L;
        }
        if (j4 > O()) {
            j4 = O();
        }
        c1546b.m(this, j4);
        return j4;
    }

    @Override // t3.InterfaceC1548d
    public int p() {
        return AbstractC1545a.e(F());
    }

    public long q(C1549e c1549e) {
        X2.l.e(c1549e, "targetBytes");
        return r(c1549e, 0L);
    }

    public long r(C1549e c1549e, long j4) {
        int i4;
        int i5;
        X2.l.e(c1549e, "targetBytes");
        long jO = 0;
        if (j4 < 0) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j4).toString());
        }
        M m4 = this.f11395m;
        if (m4 == null) {
            return -1L;
        }
        if (O() - j4 < j4) {
            jO = O();
            while (jO > j4) {
                m4 = m4.f11377g;
                X2.l.b(m4);
                jO -= (long) (m4.f11373c - m4.f11372b);
            }
            if (c1549e.y() == 2) {
                byte bG = c1549e.g(0);
                byte bG2 = c1549e.g(1);
                while (jO < O()) {
                    byte[] bArr = m4.f11371a;
                    i4 = (int) ((((long) m4.f11372b) + j4) - jO);
                    int i6 = m4.f11373c;
                    while (i4 < i6) {
                        byte b4 = bArr[i4];
                        if (b4 == bG || b4 == bG2) {
                            i5 = m4.f11372b;
                        } else {
                            i4++;
                        }
                    }
                    jO += (long) (m4.f11373c - m4.f11372b);
                    m4 = m4.f11376f;
                    X2.l.b(m4);
                    j4 = jO;
                }
            } else {
                byte[] bArrP = c1549e.p();
                while (jO < O()) {
                    byte[] bArr2 = m4.f11371a;
                    i4 = (int) ((((long) m4.f11372b) + j4) - jO);
                    int i7 = m4.f11373c;
                    while (i4 < i7) {
                        byte b5 = bArr2[i4];
                        for (byte b6 : bArrP) {
                            if (b5 == b6) {
                                i5 = m4.f11372b;
                            }
                        }
                        i4++;
                    }
                    jO += (long) (m4.f11373c - m4.f11372b);
                    m4 = m4.f11376f;
                    X2.l.b(m4);
                    j4 = jO;
                }
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (m4.f11373c - m4.f11372b)) + jO;
            if (j5 > j4) {
                break;
            }
            m4 = m4.f11376f;
            X2.l.b(m4);
            jO = j5;
        }
        if (c1549e.y() == 2) {
            byte bG3 = c1549e.g(0);
            byte bG4 = c1549e.g(1);
            while (jO < O()) {
                byte[] bArr3 = m4.f11371a;
                i4 = (int) ((((long) m4.f11372b) + j4) - jO);
                int i8 = m4.f11373c;
                while (i4 < i8) {
                    byte b7 = bArr3[i4];
                    if (b7 == bG3 || b7 == bG4) {
                        i5 = m4.f11372b;
                    } else {
                        i4++;
                    }
                }
                jO += (long) (m4.f11373c - m4.f11372b);
                m4 = m4.f11376f;
                X2.l.b(m4);
                j4 = jO;
            }
        } else {
            byte[] bArrP2 = c1549e.p();
            while (jO < O()) {
                byte[] bArr4 = m4.f11371a;
                i4 = (int) ((((long) m4.f11372b) + j4) - jO);
                int i9 = m4.f11373c;
                while (i4 < i9) {
                    byte b8 = bArr4[i4];
                    for (byte b9 : bArrP2) {
                        if (b8 == b9) {
                            i5 = m4.f11372b;
                        }
                    }
                    i4++;
                }
                jO += (long) (m4.f11373c - m4.f11372b);
                m4 = m4.f11376f;
                X2.l.b(m4);
                j4 = jO;
            }
        }
        return -1L;
        return ((long) (i4 - i5)) + jO;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        X2.l.e(byteBuffer, "sink");
        M m4 = this.f11395m;
        if (m4 == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), m4.f11373c - m4.f11372b);
        byteBuffer.put(m4.f11371a, m4.f11372b, iMin);
        int i4 = m4.f11372b + iMin;
        m4.f11372b = i4;
        this.f11396n -= (long) iMin;
        if (i4 == m4.f11373c) {
            this.f11395m = m4.b();
            N.b(m4);
        }
        return iMin;
    }

    @Override // t3.InterfaceC1548d
    public byte readByte() throws EOFException {
        if (O() == 0) {
            throw new EOFException();
        }
        M m4 = this.f11395m;
        X2.l.b(m4);
        int i4 = m4.f11372b;
        int i5 = m4.f11373c;
        int i6 = i4 + 1;
        byte b4 = m4.f11371a[i4];
        M(O() - 1);
        if (i6 != i5) {
            m4.f11372b = i6;
            return b4;
        }
        this.f11395m = m4.b();
        N.b(m4);
        return b4;
    }

    @Override // t3.InterfaceC1548d
    public void skip(long j4) throws EOFException {
        while (j4 > 0) {
            M m4 = this.f11395m;
            if (m4 == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j4, m4.f11373c - m4.f11372b);
            long j5 = iMin;
            M(O() - j5);
            j4 -= j5;
            int i4 = m4.f11372b + iMin;
            m4.f11372b = i4;
            if (i4 == m4.f11373c) {
                this.f11395m = m4.b();
                N.b(m4);
            }
        }
    }

    @Override // t3.InterfaceC1548d
    public boolean t() {
        return this.f11396n == 0;
    }

    public String toString() {
        return R().toString();
    }

    public boolean u(long j4, C1549e c1549e) {
        X2.l.e(c1549e, "bytes");
        return w(j4, c1549e, 0, c1549e.y());
    }

    public boolean w(long j4, C1549e c1549e, int i4, int i5) {
        X2.l.e(c1549e, "bytes");
        if (j4 < 0 || i4 < 0 || i5 < 0 || O() - j4 < i5 || c1549e.y() - i4 < i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (l(((long) i6) + j4) != c1549e.g(i4 + i6)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        X2.l.e(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i4 = iRemaining;
        while (i4 > 0) {
            M mT = T(1);
            int iMin = Math.min(i4, 8192 - mT.f11373c);
            byteBuffer.get(mT.f11371a, mT.f11373c, iMin);
            i4 -= iMin;
            mT.f11373c += iMin;
        }
        this.f11396n += (long) iRemaining;
        return iRemaining;
    }

    public byte[] x(long j4) throws EOFException {
        if (j4 < 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("byteCount: " + j4).toString());
        }
        if (O() < j4) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j4];
        D(bArr);
        return bArr;
    }

    public C1549e z() {
        return C(O());
    }

    /* JADX INFO: renamed from: t3.b$b, reason: collision with other inner class name */
    public static final class C0176b extends InputStream {
        public C0176b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(C1546b.this.O(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream
        public int read() {
            if (C1546b.this.O() > 0) {
                return C1546b.this.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return C1546b.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) {
            X2.l.e(bArr, "sink");
            return C1546b.this.read(bArr, i4, i5);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public int read(byte[] bArr, int i4, int i5) {
        X2.l.e(bArr, "sink");
        AbstractC1545a.b(bArr.length, i4, i5);
        M m4 = this.f11395m;
        if (m4 == null) {
            return -1;
        }
        int iMin = Math.min(i5, m4.f11373c - m4.f11372b);
        byte[] bArr2 = m4.f11371a;
        int i6 = m4.f11372b;
        L2.i.d(bArr2, bArr, i4, i6, i6 + iMin);
        m4.f11372b += iMin;
        M(O() - ((long) iMin));
        if (m4.f11372b == m4.f11373c) {
            this.f11395m = m4.b();
            N.b(m4);
        }
        return iMin;
    }

    @Override // t3.Q, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // t3.P, java.io.Flushable
    public void flush() {
    }

    @Override // t3.InterfaceC1548d
    public C1546b s() {
        return this;
    }
}
