package com.google.android.gms.internal.measurement;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class L5 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final L5 f6402f = new L5(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6406d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6407e;

    public L5(int i4, int[] iArr, Object[] objArr, boolean z3) {
        this.f6403a = i4;
        this.f6404b = iArr;
        this.f6405c = objArr;
        this.f6407e = z3;
    }

    public static L5 c() {
        return f6402f;
    }

    public static L5 e(L5 l5, L5 l52) {
        int i4 = l5.f6403a + l52.f6403a;
        int[] iArrCopyOf = Arrays.copyOf(l5.f6404b, i4);
        System.arraycopy(l52.f6404b, 0, iArrCopyOf, l5.f6403a, l52.f6403a);
        Object[] objArrCopyOf = Arrays.copyOf(l5.f6405c, i4);
        System.arraycopy(l52.f6405c, 0, objArrCopyOf, l5.f6403a, l52.f6403a);
        return new L5(i4, iArrCopyOf, objArrCopyOf, true);
    }

    public static L5 f() {
        return new L5(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iZ;
        int iA;
        int iZ2;
        int i4 = this.f6406d;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.f6403a; i6++) {
            int i7 = this.f6404b[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.f6405c[i6]).getClass();
                    iZ2 = H4.z(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int i10 = i8 << 3;
                    A4 a4 = (A4) this.f6405c[i6];
                    int iZ3 = H4.z(i10);
                    int iG = a4.g();
                    iZ2 = iZ3 + H4.z(iG) + iG;
                } else if (i9 == 3) {
                    int iZ4 = H4.z(i8 << 3);
                    iZ = iZ4 + iZ4;
                    iA = ((L5) this.f6405c[i6]).a();
                } else {
                    if (i9 != 5) {
                        throw new IllegalStateException(new C0726d5("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f6405c[i6]).getClass();
                    iZ2 = H4.z(i8 << 3) + 4;
                }
                i5 += iZ2;
            } else {
                int i11 = i8 << 3;
                long jLongValue = ((Long) this.f6405c[i6]).longValue();
                iZ = H4.z(i11);
                iA = H4.a(jLongValue);
            }
            iZ2 = iZ + iA;
            i5 += iZ2;
        }
        this.f6406d = i5;
        return i5;
    }

    public final int b() {
        int i4 = this.f6406d;
        if (i4 != -1) {
            return i4;
        }
        int iZ = 0;
        for (int i5 = 0; i5 < this.f6403a; i5++) {
            int i6 = this.f6404b[i5] >>> 3;
            A4 a4 = (A4) this.f6405c[i5];
            int iZ2 = H4.z(8);
            int iZ3 = H4.z(16) + H4.z(i6);
            int iZ4 = H4.z(24);
            int iG = a4.g();
            iZ += iZ2 + iZ2 + iZ3 + iZ4 + H4.z(iG) + iG;
        }
        this.f6406d = iZ;
        return iZ;
    }

    public final L5 d(L5 l5) {
        if (l5.equals(f6402f)) {
            return this;
        }
        g();
        int i4 = this.f6403a + l5.f6403a;
        l(i4);
        System.arraycopy(l5.f6404b, 0, this.f6404b, this.f6403a, l5.f6403a);
        System.arraycopy(l5.f6405c, 0, this.f6405c, this.f6403a, l5.f6403a);
        this.f6403a = i4;
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof L5)) {
            return false;
        }
        L5 l5 = (L5) obj;
        int i4 = this.f6403a;
        if (i4 == l5.f6403a) {
            int[] iArr = this.f6404b;
            int[] iArr2 = l5.f6404b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    Object[] objArr = this.f6405c;
                    Object[] objArr2 = l5.f6405c;
                    int i6 = this.f6403a;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (objArr[i7].equals(objArr2[i7])) {
                        }
                    }
                    return true;
                }
                if (iArr[i5] != iArr2[i5]) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    public final void g() {
        if (!this.f6407e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void h() {
        if (this.f6407e) {
            this.f6407e = false;
        }
    }

    public final int hashCode() {
        int i4 = this.f6403a;
        int i5 = i4 + 527;
        int[] iArr = this.f6404b;
        int iHashCode = 17;
        int i6 = 17;
        for (int i7 = 0; i7 < i4; i7++) {
            i6 = (i6 * 31) + iArr[i7];
        }
        int i8 = ((i5 * 31) + i6) * 31;
        Object[] objArr = this.f6405c;
        int i9 = this.f6403a;
        for (int i10 = 0; i10 < i9; i10++) {
            iHashCode = (iHashCode * 31) + objArr[i10].hashCode();
        }
        return i8 + iHashCode;
    }

    public final void i(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < this.f6403a; i5++) {
            AbstractC0876v5.b(sb, i4, String.valueOf(this.f6404b[i5] >>> 3), this.f6405c[i5]);
        }
    }

    public final void j(int i4, Object obj) {
        g();
        l(this.f6403a + 1);
        int[] iArr = this.f6404b;
        int i5 = this.f6403a;
        iArr[i5] = i4;
        this.f6405c[i5] = obj;
        this.f6403a = i5 + 1;
    }

    public final void k(V5 v5) {
        if (this.f6403a != 0) {
            for (int i4 = 0; i4 < this.f6403a; i4++) {
                int i5 = this.f6404b[i4];
                Object obj = this.f6405c[i4];
                int i6 = i5 & 7;
                int i7 = i5 >>> 3;
                if (i6 == 0) {
                    v5.r(i7, ((Long) obj).longValue());
                } else if (i6 == 1) {
                    v5.B(i7, ((Long) obj).longValue());
                } else if (i6 == 2) {
                    v5.p(i7, (A4) obj);
                } else if (i6 == 3) {
                    v5.I(i7);
                    ((L5) obj).k(v5);
                    v5.H(i7);
                } else {
                    if (i6 != 5) {
                        throw new RuntimeException(new C0726d5("Protocol message tag had invalid wire type."));
                    }
                    v5.n(i7, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void l(int i4) {
        int[] iArr = this.f6404b;
        if (i4 > iArr.length) {
            int i5 = this.f6403a;
            int i6 = i5 + (i5 / 2);
            if (i6 >= i4) {
                i4 = i6;
            }
            if (i4 < 8) {
                i4 = 8;
            }
            this.f6404b = Arrays.copyOf(iArr, i4);
            this.f6405c = Arrays.copyOf(this.f6405c, i4);
        }
    }
}
