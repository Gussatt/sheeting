package t3;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: renamed from: t3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1549e implements Serializable, Comparable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f11405p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C1549e f11406q = new C1549e(new byte[0]);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f11407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient int f11408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient String f11409o;

    /* JADX INFO: renamed from: t3.e$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final C1549e a(String str) {
            X2.l.e(str, "<this>");
            C1549e c1549e = new C1549e(U.a(str));
            c1549e.x(str);
            return c1549e;
        }

        public a() {
        }
    }

    public C1549e(byte[] bArr) {
        X2.l.e(bArr, "data");
        this.f11407m = bArr;
    }

    public static /* synthetic */ C1549e B(C1549e c1549e, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = AbstractC1545a.c();
        }
        return c1549e.A(i4, i5);
    }

    public static /* synthetic */ int o(C1549e c1549e, C1549e c1549e2, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        return c1549e.m(c1549e2, i4);
    }

    public static /* synthetic */ int t(C1549e c1549e, C1549e c1549e2, int i4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i5 & 2) != 0) {
            i4 = AbstractC1545a.c();
        }
        return c1549e.r(c1549e2, i4);
    }

    public C1549e A(int i4, int i5) {
        int iD = AbstractC1545a.d(this, i5);
        if (i4 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iD <= h().length) {
            if (iD - i4 >= 0) {
                return (i4 == 0 && iD == h().length) ? this : new C1549e(L2.i.h(h(), i4, iD));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + h().length + ')').toString());
    }

    public String C() {
        String strK = k();
        if (strK != null) {
            return strK;
        }
        String strC = U.c(p());
        x(strC);
        return strC;
    }

    public void D(C1546b c1546b, int i4, int i5) {
        X2.l.e(c1546b, "buffer");
        u3.a.c(this, c1546b, i4, i5);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1549e c1549e) {
        X2.l.e(c1549e, "other");
        int iY = y();
        int iY2 = c1549e.y();
        int iMin = Math.min(iY, iY2);
        for (int i4 = 0; i4 < iMin; i4++) {
            int iG = g(i4) & 255;
            int iG2 = c1549e.g(i4) & 255;
            if (iG != iG2) {
                return iG < iG2 ? -1 : 1;
            }
        }
        if (iY == iY2) {
            return 0;
        }
        return iY < iY2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1549e) {
            C1549e c1549e = (C1549e) obj;
            if (c1549e.y() == h().length && c1549e.v(0, h(), 0, h().length)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(C1549e c1549e) {
        X2.l.e(c1549e, "suffix");
        return u(y() - c1549e.y(), c1549e, 0, c1549e.y());
    }

    public final byte g(int i4) {
        return q(i4);
    }

    public final byte[] h() {
        return this.f11407m;
    }

    public int hashCode() {
        int i4 = i();
        if (i4 != 0) {
            return i4;
        }
        int iHashCode = Arrays.hashCode(h());
        w(iHashCode);
        return iHashCode;
    }

    public final int i() {
        return this.f11408n;
    }

    public int j() {
        return h().length;
    }

    public final String k() {
        return this.f11409o;
    }

    public String l() {
        char[] cArr = new char[h().length * 2];
        int i4 = 0;
        for (byte b4 : h()) {
            int i5 = i4 + 1;
            cArr[i4] = u3.a.d()[(b4 >> 4) & 15];
            i4 += 2;
            cArr[i5] = u3.a.d()[b4 & 15];
        }
        return f3.p.l(cArr);
    }

    public final int m(C1549e c1549e, int i4) {
        X2.l.e(c1549e, "other");
        return n(c1549e.p(), i4);
    }

    public int n(byte[] bArr, int i4) {
        X2.l.e(bArr, "other");
        int length = h().length - bArr.length;
        int iMax = Math.max(i4, 0);
        if (iMax > length) {
            return -1;
        }
        while (!AbstractC1545a.a(h(), iMax, bArr, 0, bArr.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    public byte[] p() {
        return h();
    }

    public byte q(int i4) {
        return h()[i4];
    }

    public final int r(C1549e c1549e, int i4) {
        X2.l.e(c1549e, "other");
        return s(c1549e.p(), i4);
    }

    public int s(byte[] bArr, int i4) {
        X2.l.e(bArr, "other");
        for (int iMin = Math.min(AbstractC1545a.d(this, i4), h().length - bArr.length); -1 < iMin; iMin--) {
            if (AbstractC1545a.a(h(), iMin, bArr, 0, bArr.length)) {
                return iMin;
            }
        }
        return -1;
    }

    public String toString() {
        if (h().length == 0) {
            return "[size=0]";
        }
        int iB = u3.a.b(h(), 64);
        if (iB != -1) {
            String strC = C();
            String strSubstring = strC.substring(0, iB);
            X2.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strR = f3.p.r(f3.p.r(f3.p.r(strSubstring, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
            if (iB >= strC.length()) {
                return "[text=" + strR + ']';
            }
            return "[size=" + h().length + " text=" + strR + "…]";
        }
        if (h().length <= 64) {
            return "[hex=" + l() + ']';
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[size=");
        sb.append(h().length);
        sb.append(" hex=");
        int iD = AbstractC1545a.d(this, 64);
        if (iD <= h().length) {
            if (iD < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb.append((iD == h().length ? this : new C1549e(L2.i.h(h(), 0, iD))).l());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + h().length + ')').toString());
    }

    public boolean u(int i4, C1549e c1549e, int i5, int i6) {
        X2.l.e(c1549e, "other");
        return c1549e.v(i5, h(), i4, i6);
    }

    public boolean v(int i4, byte[] bArr, int i5, int i6) {
        X2.l.e(bArr, "other");
        return i4 >= 0 && i4 <= h().length - i6 && i5 >= 0 && i5 <= bArr.length - i6 && AbstractC1545a.a(h(), i4, bArr, i5, i6);
    }

    public final void w(int i4) {
        this.f11408n = i4;
    }

    public final void x(String str) {
        this.f11409o = str;
    }

    public final int y() {
        return j();
    }

    public final boolean z(C1549e c1549e) {
        X2.l.e(c1549e, "prefix");
        return u(0, c1549e, 0, c1549e.y());
    }
}
