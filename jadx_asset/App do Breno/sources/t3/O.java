package t3;

/* JADX INFO: loaded from: classes.dex */
public final class O extends C1549e {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final transient byte[][] f11383r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int[] f11384s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(byte[][] bArr, int[] iArr) {
        super(C1549e.f11406q.h());
        X2.l.e(bArr, "segments");
        X2.l.e(iArr, "directory");
        this.f11383r = bArr;
        this.f11384s = iArr;
    }

    @Override // t3.C1549e
    public C1549e A(int i4, int i5) {
        int iD = AbstractC1545a.d(this, i5);
        if (i4 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i4 + " < 0").toString());
        }
        if (iD > y()) {
            throw new IllegalArgumentException(("endIndex=" + iD + " > length(" + y() + ')').toString());
        }
        int i6 = iD - i4;
        if (i6 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iD + " < beginIndex=" + i4).toString());
        }
        if (i4 == 0 && iD == y()) {
            return this;
        }
        if (i4 == iD) {
            return C1549e.f11406q;
        }
        int iB = u3.d.b(this, i4);
        int iB2 = u3.d.b(this, iD - 1);
        byte[][] bArr = (byte[][]) L2.i.i(F(), iB, iB2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iB <= iB2) {
            int i7 = iB;
            int i8 = 0;
            while (true) {
                iArr[i8] = Math.min(E()[i7] - i4, i6);
                int i9 = i8 + 1;
                iArr[i8 + bArr.length] = E()[F().length + i7];
                if (i7 == iB2) {
                    break;
                }
                i7++;
                i8 = i9;
            }
        }
        int i10 = iB != 0 ? E()[iB - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i4 - i10);
        return new O(bArr, iArr);
    }

    @Override // t3.C1549e
    public void D(C1546b c1546b, int i4, int i5) {
        X2.l.e(c1546b, "buffer");
        int i6 = i4 + i5;
        int iB = u3.d.b(this, i4);
        while (i4 < i6) {
            int i7 = iB == 0 ? 0 : E()[iB - 1];
            int i8 = E()[iB] - i7;
            int i9 = E()[F().length + iB];
            int iMin = Math.min(i6, i8 + i7) - i4;
            int i10 = i9 + (i4 - i7);
            M m4 = new M(F()[iB], i10, i10 + iMin, true, false);
            M m5 = c1546b.f11395m;
            if (m5 == null) {
                m4.f11377g = m4;
                m4.f11376f = m4;
                c1546b.f11395m = m4;
            } else {
                X2.l.b(m5);
                M m6 = m5.f11377g;
                X2.l.b(m6);
                m6.c(m4);
            }
            i4 += iMin;
            iB++;
        }
        c1546b.M(c1546b.O() + ((long) i5));
    }

    public final int[] E() {
        return this.f11384s;
    }

    public final byte[][] F() {
        return this.f11383r;
    }

    public byte[] G() {
        byte[] bArr = new byte[y()];
        int length = F().length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = E()[length + i4];
            int i8 = E()[i4];
            int i9 = i8 - i5;
            L2.i.d(F()[i4], bArr, i6, i7, i7 + i9);
            i6 += i9;
            i4++;
            i5 = i8;
        }
        return bArr;
    }

    public final C1549e H() {
        return new C1549e(G());
    }

    @Override // t3.C1549e
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1549e) {
            C1549e c1549e = (C1549e) obj;
            if (c1549e.y() == y() && u(0, c1549e, 0, y())) {
                return true;
            }
        }
        return false;
    }

    @Override // t3.C1549e
    public int hashCode() {
        int i4 = i();
        if (i4 != 0) {
            return i4;
        }
        int length = F().length;
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        while (i5 < length) {
            int i8 = E()[length + i5];
            int i9 = E()[i5];
            byte[] bArr = F()[i5];
            int i10 = (i9 - i7) + i8;
            while (i8 < i10) {
                i6 = (i6 * 31) + bArr[i8];
                i8++;
            }
            i5++;
            i7 = i9;
        }
        w(i6);
        return i6;
    }

    @Override // t3.C1549e
    public int j() {
        return E()[F().length - 1];
    }

    @Override // t3.C1549e
    public String l() {
        return H().l();
    }

    @Override // t3.C1549e
    public int n(byte[] bArr, int i4) {
        X2.l.e(bArr, "other");
        return H().n(bArr, i4);
    }

    @Override // t3.C1549e
    public byte[] p() {
        return G();
    }

    @Override // t3.C1549e
    public byte q(int i4) {
        AbstractC1545a.b(E()[F().length - 1], i4, 1L);
        int iB = u3.d.b(this, i4);
        return F()[iB][(i4 - (iB == 0 ? 0 : E()[iB - 1])) + E()[F().length + iB]];
    }

    @Override // t3.C1549e
    public int s(byte[] bArr, int i4) {
        X2.l.e(bArr, "other");
        return H().s(bArr, i4);
    }

    @Override // t3.C1549e
    public String toString() {
        return H().toString();
    }

    @Override // t3.C1549e
    public boolean u(int i4, C1549e c1549e, int i5, int i6) {
        X2.l.e(c1549e, "other");
        if (i4 < 0 || i4 > y() - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int iB = u3.d.b(this, i4);
        while (i4 < i7) {
            int i8 = iB == 0 ? 0 : E()[iB - 1];
            int i9 = E()[iB] - i8;
            int i10 = E()[F().length + iB];
            int iMin = Math.min(i7, i9 + i8) - i4;
            if (!c1549e.v(i5, F()[iB], i10 + (i4 - i8), iMin)) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iB++;
        }
        return true;
    }

    @Override // t3.C1549e
    public boolean v(int i4, byte[] bArr, int i5, int i6) {
        X2.l.e(bArr, "other");
        if (i4 < 0 || i4 > y() - i6 || i5 < 0 || i5 > bArr.length - i6) {
            return false;
        }
        int i7 = i6 + i4;
        int iB = u3.d.b(this, i4);
        while (i4 < i7) {
            int i8 = iB == 0 ? 0 : E()[iB - 1];
            int i9 = E()[iB] - i8;
            int i10 = E()[F().length + iB];
            int iMin = Math.min(i7, i9 + i8) - i4;
            if (!AbstractC1545a.a(F()[iB], i10 + (i4 - i8), bArr, i5, iMin)) {
                return false;
            }
            i5 += iMin;
            i4 += iMin;
            iB++;
        }
        return true;
    }
}
