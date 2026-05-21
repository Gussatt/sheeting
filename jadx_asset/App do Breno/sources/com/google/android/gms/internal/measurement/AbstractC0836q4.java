package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0836q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f6929a = 100;

    public static int a(byte[] bArr, int i4, C0828p4 c0828p4) throws C0735e5 {
        int iH = h(bArr, i4, c0828p4);
        int i5 = c0828p4.f6914a;
        if (i5 < 0) {
            throw new C0735e5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i5 > bArr.length - iH) {
            throw new C0735e5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i5 == 0) {
            c0828p4.f6916c = A4.f6292n;
            return iH;
        }
        c0828p4.f6916c = A4.p(bArr, iH, i5);
        return iH + i5;
    }

    public static int b(byte[] bArr, int i4) {
        int i5 = bArr[i4] & 255;
        int i6 = bArr[i4 + 1] & 255;
        int i7 = bArr[i4 + 2] & 255;
        return ((bArr[i4 + 3] & 255) << 24) | (i6 << 8) | i5 | (i7 << 16);
    }

    public static int c(E5 e5, byte[] bArr, int i4, int i5, int i6, C0828p4 c0828p4) throws C0735e5 {
        Object objE = e5.e();
        int iL = l(objE, e5, bArr, i4, i5, i6, c0828p4);
        e5.a(objE);
        c0828p4.f6916c = objE;
        return iL;
    }

    public static int d(E5 e5, byte[] bArr, int i4, int i5, C0828p4 c0828p4) throws C0735e5 {
        Object objE = e5.e();
        int iM = m(objE, e5, bArr, i4, i5, c0828p4);
        e5.a(objE);
        c0828p4.f6916c = objE;
        return iM;
    }

    public static int e(E5 e5, int i4, byte[] bArr, int i5, int i6, InterfaceC0708b5 interfaceC0708b5, C0828p4 c0828p4) throws C0735e5 {
        int iD = d(e5, bArr, i5, i6, c0828p4);
        interfaceC0708b5.add(c0828p4.f6916c);
        while (iD < i6) {
            int iH = h(bArr, iD, c0828p4);
            if (i4 != c0828p4.f6914a) {
                break;
            }
            iD = d(e5, bArr, iH, i6, c0828p4);
            interfaceC0708b5.add(c0828p4.f6916c);
        }
        return iD;
    }

    public static int f(byte[] bArr, int i4, InterfaceC0708b5 interfaceC0708b5, C0828p4 c0828p4) throws C0735e5 {
        W4 w4 = (W4) interfaceC0708b5;
        int iH = h(bArr, i4, c0828p4);
        int i5 = c0828p4.f6914a + iH;
        while (iH < i5) {
            iH = h(bArr, iH, c0828p4);
            w4.h(c0828p4.f6914a);
        }
        if (iH == i5) {
            return iH;
        }
        throw new C0735e5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int g(int i4, byte[] bArr, int i5, int i6, L5 l5, C0828p4 c0828p4) throws C0735e5 {
        if ((i4 >>> 3) == 0) {
            throw new C0735e5("Protocol message contained an invalid tag (zero).");
        }
        int i7 = i4 & 7;
        if (i7 == 0) {
            int iK = k(bArr, i5, c0828p4);
            l5.j(i4, Long.valueOf(c0828p4.f6915b));
            return iK;
        }
        if (i7 == 1) {
            l5.j(i4, Long.valueOf(n(bArr, i5)));
            return i5 + 8;
        }
        if (i7 == 2) {
            int iH = h(bArr, i5, c0828p4);
            int i8 = c0828p4.f6914a;
            if (i8 < 0) {
                throw new C0735e5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i8 > bArr.length - iH) {
                throw new C0735e5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i8 == 0) {
                l5.j(i4, A4.f6292n);
            } else {
                l5.j(i4, A4.p(bArr, iH, i8));
            }
            return iH + i8;
        }
        if (i7 != 3) {
            if (i7 != 5) {
                throw new C0735e5("Protocol message contained an invalid tag (zero).");
            }
            l5.j(i4, Integer.valueOf(b(bArr, i5)));
            return i5 + 4;
        }
        int i9 = (i4 & (-8)) | 4;
        L5 l5F = L5.f();
        int i10 = c0828p4.f6918e + 1;
        c0828p4.f6918e = i10;
        o(i10);
        int i11 = 0;
        while (true) {
            if (i5 >= i6) {
                break;
            }
            int iH2 = h(bArr, i5, c0828p4);
            int i12 = c0828p4.f6914a;
            if (i12 == i9) {
                i11 = i12;
                i5 = iH2;
                break;
            }
            i5 = g(i12, bArr, iH2, i6, l5F, c0828p4);
            i11 = i12;
        }
        c0828p4.f6918e--;
        if (i5 > i6 || i11 != i9) {
            throw new C0735e5("Failed to parse the message.");
        }
        l5.j(i4, l5F);
        return i5;
    }

    public static int h(byte[] bArr, int i4, C0828p4 c0828p4) {
        int i5 = i4 + 1;
        byte b4 = bArr[i4];
        if (b4 < 0) {
            return i(b4, bArr, i5, c0828p4);
        }
        c0828p4.f6914a = b4;
        return i5;
    }

    public static int i(int i4, byte[] bArr, int i5, C0828p4 c0828p4) {
        byte b4 = bArr[i5];
        int i6 = i5 + 1;
        int i7 = i4 & 127;
        if (b4 >= 0) {
            c0828p4.f6914a = i7 | (b4 << 7);
            return i6;
        }
        int i8 = i7 | ((b4 & 127) << 7);
        int i9 = i5 + 2;
        byte b5 = bArr[i6];
        if (b5 >= 0) {
            c0828p4.f6914a = i8 | (b5 << 14);
            return i9;
        }
        int i10 = i8 | ((b5 & 127) << 14);
        int i11 = i5 + 3;
        byte b6 = bArr[i9];
        if (b6 >= 0) {
            c0828p4.f6914a = i10 | (b6 << 21);
            return i11;
        }
        int i12 = i10 | ((b6 & 127) << 21);
        int i13 = i5 + 4;
        byte b7 = bArr[i11];
        if (b7 >= 0) {
            c0828p4.f6914a = i12 | (b7 << 28);
            return i13;
        }
        int i14 = i12 | ((b7 & 127) << 28);
        while (true) {
            int i15 = i13 + 1;
            if (bArr[i13] >= 0) {
                c0828p4.f6914a = i14;
                return i15;
            }
            i13 = i15;
        }
    }

    public static int j(int i4, byte[] bArr, int i5, int i6, InterfaceC0708b5 interfaceC0708b5, C0828p4 c0828p4) {
        W4 w4 = (W4) interfaceC0708b5;
        int iH = h(bArr, i5, c0828p4);
        w4.h(c0828p4.f6914a);
        while (iH < i6) {
            int iH2 = h(bArr, iH, c0828p4);
            if (i4 != c0828p4.f6914a) {
                break;
            }
            iH = h(bArr, iH2, c0828p4);
            w4.h(c0828p4.f6914a);
        }
        return iH;
    }

    public static int k(byte[] bArr, int i4, C0828p4 c0828p4) {
        long j4 = bArr[i4];
        int i5 = i4 + 1;
        if (j4 >= 0) {
            c0828p4.f6915b = j4;
            return i5;
        }
        int i6 = i4 + 2;
        byte b4 = bArr[i5];
        long j5 = (j4 & 127) | (((long) (b4 & 127)) << 7);
        int i7 = 7;
        while (b4 < 0) {
            int i8 = i6 + 1;
            byte b5 = bArr[i6];
            i7 += 7;
            j5 |= ((long) (b5 & 127)) << i7;
            b4 = b5;
            i6 = i8;
        }
        c0828p4.f6915b = j5;
        return i6;
    }

    public static int l(Object obj, E5 e5, byte[] bArr, int i4, int i5, int i6, C0828p4 c0828p4) throws C0735e5 {
        int i7 = c0828p4.f6918e + 1;
        c0828p4.f6918e = i7;
        o(i7);
        int iY = ((C0884w5) e5).y(obj, bArr, i4, i5, i6, c0828p4);
        c0828p4.f6918e--;
        c0828p4.f6916c = obj;
        return iY;
    }

    public static int m(Object obj, E5 e5, byte[] bArr, int i4, int i5, C0828p4 c0828p4) throws C0735e5 {
        int i6 = i4 + 1;
        int i7 = bArr[i4];
        if (i7 < 0) {
            i6 = i(i7, bArr, i6, c0828p4);
            i7 = c0828p4.f6914a;
        }
        int i8 = i6;
        if (i7 < 0 || i7 > i5 - i8) {
            throw new C0735e5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i9 = c0828p4.f6918e + 1;
        c0828p4.f6918e = i9;
        o(i9);
        int i10 = i8 + i7;
        e5.f(obj, bArr, i8, i10, c0828p4);
        c0828p4.f6918e--;
        c0828p4.f6916c = obj;
        return i10;
    }

    public static long n(byte[] bArr, int i4) {
        return (((long) bArr[i4]) & 255) | ((((long) bArr[i4 + 1]) & 255) << 8) | ((((long) bArr[i4 + 2]) & 255) << 16) | ((((long) bArr[i4 + 3]) & 255) << 24) | ((((long) bArr[i4 + 4]) & 255) << 32) | ((((long) bArr[i4 + 5]) & 255) << 40) | ((((long) bArr[i4 + 6]) & 255) << 48) | ((((long) bArr[i4 + 7]) & 255) << 56);
    }

    public static void o(int i4) throws C0735e5 {
        if (i4 >= f6929a) {
            throw new C0735e5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
