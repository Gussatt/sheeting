package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4789a;

    public static class a {
        public static void h(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) throws C0599v {
            if (m(b5) || (((b4 << 28) + (b5 + 112)) >> 30) != 0 || m(b6) || m(b7)) {
                throw C0599v.d();
            }
            int iR = ((b4 & 7) << 18) | (r(b5) << 12) | (r(b6) << 6) | r(b7);
            cArr[i4] = l(iR);
            cArr[i4 + 1] = q(iR);
        }

        public static void i(byte b4, char[] cArr, int i4) {
            cArr[i4] = (char) b4;
        }

        public static void j(byte b4, byte b5, byte b6, char[] cArr, int i4) throws C0599v {
            if (m(b5) || ((b4 == -32 && b5 < -96) || ((b4 == -19 && b5 >= -96) || m(b6)))) {
                throw C0599v.d();
            }
            cArr[i4] = (char) (((b4 & 15) << 12) | (r(b5) << 6) | r(b6));
        }

        public static void k(byte b4, byte b5, char[] cArr, int i4) throws C0599v {
            if (b4 < -62 || m(b5)) {
                throw C0599v.d();
            }
            cArr[i4] = (char) (((b4 & 31) << 6) | r(b5));
        }

        public static char l(int i4) {
            return (char) ((i4 >>> 10) + 55232);
        }

        public static boolean m(byte b4) {
            return b4 > -65;
        }

        public static boolean n(byte b4) {
            return b4 >= 0;
        }

        public static boolean o(byte b4) {
            return b4 < -16;
        }

        public static boolean p(byte b4) {
            return b4 < -32;
        }

        public static char q(int i4) {
            return (char) ((i4 & 1023) + 56320);
        }

        public static int r(byte b4) {
            return b4 & 63;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i4, int i5);

        public abstract int b(String str, byte[] bArr, int i4, int i5);
    }

    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.j0.b
        public String a(byte[] bArr, int i4, int i5) throws C0599v {
            if ((i4 | i5 | ((bArr.length - i4) - i5)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i4), Integer.valueOf(i5)));
            }
            int i6 = i4 + i5;
            char[] cArr = new char[i5];
            int i7 = 0;
            while (i4 < i6) {
                byte b4 = bArr[i4];
                if (!a.n(b4)) {
                    break;
                }
                i4++;
                a.i(b4, cArr, i7);
                i7++;
            }
            int i8 = i7;
            while (i4 < i6) {
                int i9 = i4 + 1;
                byte b5 = bArr[i4];
                if (a.n(b5)) {
                    int i10 = i8 + 1;
                    a.i(b5, cArr, i8);
                    int i11 = i9;
                    while (i11 < i6) {
                        byte b6 = bArr[i11];
                        if (!a.n(b6)) {
                            break;
                        }
                        i11++;
                        a.i(b6, cArr, i10);
                        i10++;
                    }
                    i8 = i10;
                    i4 = i11;
                } else if (a.p(b5)) {
                    if (i9 >= i6) {
                        throw C0599v.d();
                    }
                    i4 += 2;
                    a.k(b5, bArr[i9], cArr, i8);
                    i8++;
                } else if (a.o(b5)) {
                    if (i9 >= i6 - 1) {
                        throw C0599v.d();
                    }
                    int i12 = i4 + 2;
                    i4 += 3;
                    a.j(b5, bArr[i9], bArr[i12], cArr, i8);
                    i8++;
                } else {
                    if (i9 >= i6 - 2) {
                        throw C0599v.d();
                    }
                    byte b7 = bArr[i9];
                    int i13 = i4 + 3;
                    byte b8 = bArr[i4 + 2];
                    i4 += 4;
                    a.h(b5, b7, b8, bArr[i13], cArr, i8);
                    i8 += 2;
                }
            }
            return new String(cArr, 0, i8);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public int b(String str, byte[] bArr, int i4, int i5) {
            int i6;
            int i7;
            char cCharAt;
            int length = str.length();
            int i8 = i5 + i4;
            int i9 = 0;
            while (i9 < length && (i7 = i9 + i4) < i8 && (cCharAt = str.charAt(i9)) < 128) {
                bArr[i7] = (byte) cCharAt;
                i9++;
            }
            if (i9 == length) {
                return i4 + length;
            }
            int i10 = i4 + i9;
            while (i9 < length) {
                char cCharAt2 = str.charAt(i9);
                if (cCharAt2 < 128 && i10 < i8) {
                    bArr[i10] = (byte) cCharAt2;
                    i10++;
                } else if (cCharAt2 < 2048 && i10 <= i8 - 2) {
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) ((cCharAt2 >>> 6) | 960);
                    i10 += 2;
                    bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i10 > i8 - 3) {
                        if (i10 > i8 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i6 = i9 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i6)))) {
                                throw new d(i9, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i10);
                        }
                        int i12 = i9 + 1;
                        if (i12 != str.length()) {
                            char cCharAt3 = str.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i10] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i10 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i13 = i10 + 3;
                                bArr[i10 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i10 += 4;
                                bArr[i13] = (byte) ((codePoint & 63) | 128);
                                i9 = i12;
                            } else {
                                i9 = i12;
                            }
                        }
                        throw new d(i9 - 1, length);
                    }
                    bArr[i10] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i14 = i10 + 2;
                    bArr[i10 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i10 += 3;
                    bArr[i14] = (byte) ((cCharAt2 & '?') | 128);
                }
                i9++;
            }
            return i10;
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i4, int i5) {
            super("Unpaired surrogate at index " + i4 + " of " + i5);
        }
    }

    public static final class e extends b {
        public static boolean c() {
            return i0.B() && i0.C();
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public String a(byte[] bArr, int i4, int i5) throws C0599v {
            Charset charset = AbstractC0598u.f4923b;
            String str = new String(bArr, i4, i5, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i4, i5 + i4))) {
                throw C0599v.d();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.j0.b
        public int b(String str, byte[] bArr, int i4, int i5) {
            long j4;
            long j5;
            long j6;
            int i6;
            char cCharAt;
            long j7 = i4;
            long j8 = ((long) i5) + j7;
            int length = str.length();
            if (length > i5 || bArr.length - i5 < i4) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i4 + i5));
            }
            int i7 = 0;
            while (true) {
                j4 = 1;
                if (i7 >= length || (cCharAt = str.charAt(i7)) >= 128) {
                    break;
                }
                i0.H(bArr, j7, (byte) cCharAt);
                i7++;
                j7 = 1 + j7;
            }
            if (i7 == length) {
                return (int) j7;
            }
            while (i7 < length) {
                char cCharAt2 = str.charAt(i7);
                if (cCharAt2 < 128 && j7 < j8) {
                    i0.H(bArr, j7, (byte) cCharAt2);
                    j6 = j8;
                    j5 = j4;
                    j7 += j4;
                } else if (cCharAt2 >= 2048 || j7 > j8 - 2) {
                    j5 = j4;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j7 > j8 - 3) {
                        j6 = j8;
                        if (j7 > j6 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i6 = i7 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i6)))) {
                                throw new d(i7, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j7);
                        }
                        int i8 = i7 + 1;
                        if (i8 != length) {
                            char cCharAt3 = str.charAt(i8);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                i0.H(bArr, j7, (byte) ((codePoint >>> 18) | 240));
                                i0.H(bArr, j7 + j5, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j9 = j7 + 3;
                                i0.H(bArr, j7 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j7 += 4;
                                i0.H(bArr, j9, (byte) ((codePoint & 63) | 128));
                                i7 = i8;
                            } else {
                                i7 = i8;
                            }
                        }
                        throw new d(i7 - 1, length);
                    }
                    i0.H(bArr, j7, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j10 = j7 + 2;
                    j6 = j8;
                    i0.H(bArr, j7 + j5, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j7 += 3;
                    i0.H(bArr, j10, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j5 = j4;
                    long j11 = j7 + j5;
                    i0.H(bArr, j7, (byte) ((cCharAt2 >>> 6) | 960));
                    j7 += 2;
                    i0.H(bArr, j11, (byte) ((cCharAt2 & '?') | 128));
                    j6 = j8;
                }
                i7++;
                j4 = j5;
                j8 = j6;
            }
            return (int) j7;
        }
    }

    static {
        f4789a = (!e.c() || AbstractC0582d.c()) ? new c() : new e();
    }

    public static String a(byte[] bArr, int i4, int i5) {
        return f4789a.a(bArr, i4, i5);
    }

    public static int b(String str, byte[] bArr, int i4, int i5) {
        return f4789a.b(str, bArr, i4, i5);
    }

    public static int c(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int iD = length;
        while (true) {
            if (i4 < length) {
                char cCharAt = str.charAt(i4);
                if (cCharAt >= 2048) {
                    iD += d(str, i4);
                    break;
                }
                iD += (127 - cCharAt) >>> 31;
                i4++;
            } else {
                break;
            }
        }
        if (iD >= length) {
            return iD;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iD) + 4294967296L));
    }

    public static int d(String str, int i4) {
        int length = str.length();
        int i5 = 0;
        while (i4 < length) {
            char cCharAt = str.charAt(i4);
            if (cCharAt < 2048) {
                i5 += (127 - cCharAt) >>> 31;
            } else {
                i5 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i4) < 65536) {
                        throw new d(i4, length);
                    }
                    i4++;
                }
            }
            i4++;
        }
        return i5;
    }
}
