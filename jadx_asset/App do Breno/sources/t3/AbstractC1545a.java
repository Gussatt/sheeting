package t3;

import t3.C1546b;

/* JADX INFO: renamed from: t3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1545a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1546b.a f11393a = new C1546b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f11394b = -1234567890;

    public static final boolean a(byte[] bArr, int i4, byte[] bArr2, int i5, int i6) {
        X2.l.e(bArr, "a");
        X2.l.e(bArr2, "b");
        for (int i7 = 0; i7 < i6; i7++) {
            if (bArr[i7 + i4] != bArr2[i7 + i5]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException("size=" + j4 + " offset=" + j5 + " byteCount=" + j6);
        }
    }

    public static final int c() {
        return f11394b;
    }

    public static final int d(C1549e c1549e, int i4) {
        X2.l.e(c1549e, "<this>");
        return i4 == f11394b ? c1549e.y() : i4;
    }

    public static final int e(int i4) {
        return ((i4 & 255) << 24) | (((-16777216) & i4) >>> 24) | ((16711680 & i4) >>> 8) | ((65280 & i4) << 8);
    }

    public static final long f(long j4) {
        return ((j4 & 255) << 56) | (((-72057594037927936L) & j4) >>> 56) | ((71776119061217280L & j4) >>> 40) | ((280375465082880L & j4) >>> 24) | ((1095216660480L & j4) >>> 8) | ((4278190080L & j4) << 8) | ((16711680 & j4) << 24) | ((65280 & j4) << 40);
    }

    public static final short g(short s4) {
        return (short) (((s4 & 255) << 8) | ((65280 & s4) >>> 8));
    }
}
