package t3;

/* JADX INFO: loaded from: classes.dex */
public final class M {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f11370h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f11371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11374d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11375e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public M f11376f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public M f11377g;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public M() {
        this.f11371a = new byte[8192];
        this.f11375e = true;
        this.f11374d = false;
    }

    public final void a() {
        int i4;
        M m4 = this.f11377g;
        if (m4 == this) {
            throw new IllegalStateException("cannot compact");
        }
        X2.l.b(m4);
        if (m4.f11375e) {
            int i5 = this.f11373c - this.f11372b;
            M m5 = this.f11377g;
            X2.l.b(m5);
            int i6 = 8192 - m5.f11373c;
            M m6 = this.f11377g;
            X2.l.b(m6);
            if (m6.f11374d) {
                i4 = 0;
            } else {
                M m7 = this.f11377g;
                X2.l.b(m7);
                i4 = m7.f11372b;
            }
            if (i5 > i6 + i4) {
                return;
            }
            M m8 = this.f11377g;
            X2.l.b(m8);
            f(m8, i5);
            b();
            N.b(this);
        }
    }

    public final M b() {
        M m4 = this.f11376f;
        if (m4 == this) {
            m4 = null;
        }
        M m5 = this.f11377g;
        X2.l.b(m5);
        m5.f11376f = this.f11376f;
        M m6 = this.f11376f;
        X2.l.b(m6);
        m6.f11377g = this.f11377g;
        this.f11376f = null;
        this.f11377g = null;
        return m4;
    }

    public final M c(M m4) {
        X2.l.e(m4, "segment");
        m4.f11377g = this;
        m4.f11376f = this.f11376f;
        M m5 = this.f11376f;
        X2.l.b(m5);
        m5.f11377g = m4;
        this.f11376f = m4;
        return m4;
    }

    public final M d() {
        this.f11374d = true;
        return new M(this.f11371a, this.f11372b, this.f11373c, true, false);
    }

    public final M e(int i4) {
        M mC;
        if (i4 <= 0 || i4 > this.f11373c - this.f11372b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i4 >= 1024) {
            mC = d();
        } else {
            mC = N.c();
            byte[] bArr = this.f11371a;
            byte[] bArr2 = mC.f11371a;
            int i5 = this.f11372b;
            L2.i.f(bArr, bArr2, 0, i5, i5 + i4, 2, null);
        }
        mC.f11373c = mC.f11372b + i4;
        this.f11372b += i4;
        M m4 = this.f11377g;
        X2.l.b(m4);
        m4.c(mC);
        return mC;
    }

    public final void f(M m4, int i4) {
        X2.l.e(m4, "sink");
        if (!m4.f11375e) {
            throw new IllegalStateException("only owner can write");
        }
        int i5 = m4.f11373c;
        if (i5 + i4 > 8192) {
            if (m4.f11374d) {
                throw new IllegalArgumentException();
            }
            int i6 = m4.f11372b;
            if ((i5 + i4) - i6 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = m4.f11371a;
            L2.i.f(bArr, bArr, 0, i6, i5, 2, null);
            m4.f11373c -= m4.f11372b;
            m4.f11372b = 0;
        }
        byte[] bArr2 = this.f11371a;
        byte[] bArr3 = m4.f11371a;
        int i7 = m4.f11373c;
        int i8 = this.f11372b;
        L2.i.d(bArr2, bArr3, i7, i8, i8 + i4);
        m4.f11373c += i4;
        this.f11372b += i4;
    }

    public M(byte[] bArr, int i4, int i5, boolean z3, boolean z4) {
        X2.l.e(bArr, "data");
        this.f11371a = bArr;
        this.f11372b = i4;
        this.f11373c = i5;
        this.f11374d = z3;
        this.f11375e = z4;
    }
}
