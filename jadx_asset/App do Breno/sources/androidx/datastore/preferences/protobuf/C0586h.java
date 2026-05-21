package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C0599v;
import androidx.datastore.preferences.protobuf.k0;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0586h implements X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0585g f4749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4752d = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4753a;

        static {
            int[] iArr = new int[k0.b.values().length];
            f4753a = iArr;
            try {
                iArr[k0.b.f4808v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4753a[k0.b.f4812z.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4753a[k0.b.f4801o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4753a[k0.b.f4795B.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4753a[k0.b.f4807u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4753a[k0.b.f4806t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4753a[k0.b.f4802p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4753a[k0.b.f4805s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4753a[k0.b.f4803q.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4753a[k0.b.f4811y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4753a[k0.b.f4796C.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4753a[k0.b.f4797D.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4753a[k0.b.f4798E.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4753a[k0.b.f4799F.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4753a[k0.b.f4809w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4753a[k0.b.f4794A.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4753a[k0.b.f4804r.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C0586h(AbstractC0585g abstractC0585g) {
        AbstractC0585g abstractC0585g2 = (AbstractC0585g) AbstractC0598u.b(abstractC0585g, "input");
        this.f4749a = abstractC0585g2;
        abstractC0585g2.f4724d = this;
    }

    public static C0586h O(AbstractC0585g abstractC0585g) {
        C0586h c0586h = abstractC0585g.f4724d;
        return c0586h != null ? c0586h : new C0586h(abstractC0585g);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void A(List list, Y y3, C0591m c0591m) throws C0599v.a {
        int iC;
        if (k0.b(this.f4750b) != 3) {
            throw C0599v.e();
        }
        int i4 = this.f4750b;
        do {
            list.add(S(y3, c0591m));
            if (this.f4749a.f() || this.f4752d != 0) {
                return;
            } else {
                iC = this.f4749a.C();
            }
        } while (iC == i4);
        this.f4752d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean B() {
        int i4;
        if (this.f4749a.f() || (i4 = this.f4750b) == this.f4751c) {
            return false;
        }
        return this.f4749a.F(i4);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int C() throws C0599v.a {
        X(5);
        return this.f4749a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void D(List list) throws C0599v.a {
        int iC;
        if (k0.b(this.f4750b) != 2) {
            throw C0599v.e();
        }
        do {
            list.add(w());
            if (this.f4749a.f()) {
                return;
            } else {
                iC = this.f4749a.C();
            }
        } while (iC == this.f4750b);
        this.f4752d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void E(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 1) {
            do {
                list.add(Double.valueOf(this.f4749a.p()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iD = this.f4749a.D();
        Z(iD);
        int iE = this.f4749a.e() + iD;
        do {
            list.add(Double.valueOf(this.f4749a.p()));
        } while (this.f4749a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void F(List list, Y y3, C0591m c0591m) throws C0599v.a {
        int iC;
        if (k0.b(this.f4750b) != 2) {
            throw C0599v.e();
        }
        int i4 = this.f4750b;
        do {
            list.add(T(y3, c0591m));
            if (this.f4749a.f() || this.f4752d != 0) {
                return;
            } else {
                iC = this.f4749a.C();
            }
        } while (iC == i4);
        this.f4752d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void G(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f4749a.v()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iE = this.f4749a.e() + this.f4749a.D();
        do {
            list.add(Long.valueOf(this.f4749a.v()));
        } while (this.f4749a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void H(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f4749a.x()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iD = this.f4749a.D();
        Z(iD);
        int iE = this.f4749a.e() + iD;
        do {
            list.add(Long.valueOf(this.f4749a.x()));
        } while (this.f4749a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long I() throws C0599v.a {
        X(0);
        return this.f4749a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String J() throws C0599v.a {
        X(2);
        return this.f4749a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void K(Object obj, Y y3, C0591m c0591m) throws C0599v {
        X(2);
        Q(obj, y3, c0591m);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void L(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 1) {
            do {
                list.add(Long.valueOf(this.f4749a.s()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iD = this.f4749a.D();
        Z(iD);
        int iE = this.f4749a.e() + iD;
        do {
            list.add(Long.valueOf(this.f4749a.s()));
        } while (this.f4749a.e() < iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void M(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f4749a.u()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iE = this.f4749a.e() + this.f4749a.D();
        do {
            list.add(Integer.valueOf(this.f4749a.u()));
        } while (this.f4749a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void N(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f4749a.q()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iE = this.f4749a.e() + this.f4749a.D();
        do {
            list.add(Integer.valueOf(this.f4749a.q()));
        } while (this.f4749a.e() < iE);
        W(iE);
    }

    public final void P(Object obj, Y y3, C0591m c0591m) {
        int i4 = this.f4751c;
        this.f4751c = k0.c(k0.a(this.f4750b), 4);
        try {
            y3.b(obj, this, c0591m);
            if (this.f4750b == this.f4751c) {
            } else {
                throw C0599v.h();
            }
        } finally {
            this.f4751c = i4;
        }
    }

    public final void Q(Object obj, Y y3, C0591m c0591m) throws C0599v {
        int iD = this.f4749a.D();
        AbstractC0585g abstractC0585g = this.f4749a;
        if (abstractC0585g.f4721a >= abstractC0585g.f4722b) {
            throw C0599v.i();
        }
        int iM = abstractC0585g.m(iD);
        this.f4749a.f4721a++;
        y3.b(obj, this, c0591m);
        this.f4749a.a(0);
        r5.f4721a--;
        this.f4749a.l(iM);
    }

    public final Object R(k0.b bVar, Class cls, C0591m c0591m) {
        switch (a.f4753a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(q());
            case 2:
                return w();
            case 3:
                return Double.valueOf(readDouble());
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return Integer.valueOf(c());
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return Integer.valueOf(p());
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return Long.valueOf(h());
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return Float.valueOf(readFloat());
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return Integer.valueOf(z());
            case 9:
                return Long.valueOf(I());
            case 10:
                return U(cls, c0591m);
            case 11:
                return Integer.valueOf(C());
            case 12:
                return Long.valueOf(t());
            case 13:
                return Integer.valueOf(j());
            case 14:
                return Long.valueOf(l());
            case 15:
                return J();
            case 16:
                return Integer.valueOf(y());
            case 17:
                return Long.valueOf(f());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final Object S(Y y3, C0591m c0591m) {
        Object objH = y3.h();
        P(objH, y3, c0591m);
        y3.d(objH);
        return objH;
    }

    public final Object T(Y y3, C0591m c0591m) throws C0599v {
        Object objH = y3.h();
        Q(objH, y3, c0591m);
        y3.d(objH);
        return objH;
    }

    public Object U(Class cls, C0591m c0591m) throws C0599v.a {
        X(2);
        return T(U.a().c(cls), c0591m);
    }

    public void V(List list, boolean z3) throws C0599v.a {
        int iC;
        if (k0.b(this.f4750b) != 2) {
            throw C0599v.e();
        }
        do {
            list.add(z3 ? J() : o());
            if (this.f4749a.f()) {
                return;
            } else {
                iC = this.f4749a.C();
            }
        } while (iC == this.f4750b);
        this.f4752d = iC;
    }

    public final void W(int i4) throws C0599v {
        if (this.f4749a.e() != i4) {
            throw C0599v.m();
        }
    }

    public final void X(int i4) throws C0599v.a {
        if (k0.b(this.f4750b) != i4) {
            throw C0599v.e();
        }
    }

    public final void Y(int i4) throws C0599v {
        if ((i4 & 3) != 0) {
            throw C0599v.h();
        }
    }

    public final void Z(int i4) throws C0599v {
        if ((i4 & 7) != 0) {
            throw C0599v.h();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r7.f4749a.l(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.Map r8, androidx.datastore.preferences.protobuf.C.a r9, androidx.datastore.preferences.protobuf.C0591m r10) throws androidx.datastore.preferences.protobuf.C0599v.a {
        /*
            r7 = this;
            r0 = 2
            r7.X(r0)
            androidx.datastore.preferences.protobuf.g r1 = r7.f4749a
            int r1 = r1.D()
            androidx.datastore.preferences.protobuf.g r2 = r7.f4749a
            int r1 = r2.m(r1)
            java.lang.Object r2 = r9.f4633b
            java.lang.Object r3 = r9.f4635d
        L14:
            int r4 = r7.r()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.g r5 = r7.f4749a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.f()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.B()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.v r4 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.k0$b r4 = r9.f4634c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
            java.lang.Object r5 = r9.f4635d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
            java.lang.Object r3 = r7.R(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.k0$b r4 = r9.f4632a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.R(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0599v.a -> L51
            goto L14
        L51:
            boolean r4 = r7.B()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.v r8 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.g r8 = r7.f4749a
            r8.l(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.g r9 = r7.f4749a
            r9.l(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0586h.a(java.util.Map, androidx.datastore.preferences.protobuf.C$a, androidx.datastore.preferences.protobuf.m):void");
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void b(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f4749a.y()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iE = this.f4749a.e() + this.f4749a.D();
        do {
            list.add(Integer.valueOf(this.f4749a.y()));
        } while (this.f4749a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int c() throws C0599v.a {
        X(0);
        return this.f4749a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void d(Object obj, Y y3, C0591m c0591m) throws C0599v.a {
        X(3);
        P(obj, y3, c0591m);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int e() {
        return this.f4750b;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long f() throws C0599v.a {
        X(0);
        return this.f4749a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void g(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 2) {
            int iD = this.f4749a.D();
            Y(iD);
            int iE = this.f4749a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f4749a.r()));
            } while (this.f4749a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C0599v.e();
        }
        do {
            list.add(Integer.valueOf(this.f4749a.r()));
            if (this.f4749a.f()) {
                return;
            } else {
                iC = this.f4749a.C();
            }
        } while (iC == this.f4750b);
        this.f4752d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long h() throws C0599v.a {
        X(1);
        return this.f4749a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void i(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 2) {
            int iD = this.f4749a.D();
            Y(iD);
            int iE = this.f4749a.e() + iD;
            do {
                list.add(Integer.valueOf(this.f4749a.w()));
            } while (this.f4749a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C0599v.e();
        }
        do {
            list.add(Integer.valueOf(this.f4749a.w()));
            if (this.f4749a.f()) {
                return;
            } else {
                iC = this.f4749a.C();
            }
        } while (iC == this.f4750b);
        this.f4752d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int j() throws C0599v.a {
        X(0);
        return this.f4749a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void k(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f4749a.z()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iE = this.f4749a.e() + this.f4749a.D();
        do {
            list.add(Long.valueOf(this.f4749a.z()));
        } while (this.f4749a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long l() throws C0599v.a {
        X(0);
        return this.f4749a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void m(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 0) {
            do {
                list.add(Integer.valueOf(this.f4749a.D()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iE = this.f4749a.e() + this.f4749a.D();
        do {
            list.add(Integer.valueOf(this.f4749a.D()));
        } while (this.f4749a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void n(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 0) {
            do {
                list.add(Boolean.valueOf(this.f4749a.n()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iE = this.f4749a.e() + this.f4749a.D();
        do {
            list.add(Boolean.valueOf(this.f4749a.n()));
        } while (this.f4749a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String o() throws C0599v.a {
        X(2);
        return this.f4749a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int p() throws C0599v.a {
        X(5);
        return this.f4749a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean q() throws C0599v.a {
        X(0);
        return this.f4749a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int r() {
        int i4 = this.f4752d;
        if (i4 != 0) {
            this.f4750b = i4;
            this.f4752d = 0;
        } else {
            this.f4750b = this.f4749a.C();
        }
        int i5 = this.f4750b;
        if (i5 == 0 || i5 == this.f4751c) {
            return Integer.MAX_VALUE;
        }
        return k0.a(i5);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public double readDouble() throws C0599v.a {
        X(1);
        return this.f4749a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public float readFloat() throws C0599v.a {
        X(5);
        return this.f4749a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void s(List list) throws C0599v.a {
        V(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long t() throws C0599v.a {
        X(1);
        return this.f4749a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void u(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 0) {
            do {
                list.add(Long.valueOf(this.f4749a.E()));
                if (this.f4749a.f()) {
                    return;
                } else {
                    iC = this.f4749a.C();
                }
            } while (iC == this.f4750b);
            this.f4752d = iC;
            return;
        }
        if (iB != 2) {
            throw C0599v.e();
        }
        int iE = this.f4749a.e() + this.f4749a.D();
        do {
            list.add(Long.valueOf(this.f4749a.E()));
        } while (this.f4749a.e() < iE);
        W(iE);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void v(List list) throws C0599v.a {
        V(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public AbstractC0584f w() throws C0599v.a {
        X(2);
        return this.f4749a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void x(List list) throws C0599v {
        int iC;
        int iB = k0.b(this.f4750b);
        if (iB == 2) {
            int iD = this.f4749a.D();
            Y(iD);
            int iE = this.f4749a.e() + iD;
            do {
                list.add(Float.valueOf(this.f4749a.t()));
            } while (this.f4749a.e() < iE);
            return;
        }
        if (iB != 5) {
            throw C0599v.e();
        }
        do {
            list.add(Float.valueOf(this.f4749a.t()));
            if (this.f4749a.f()) {
                return;
            } else {
                iC = this.f4749a.C();
            }
        } while (iC == this.f4750b);
        this.f4752d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int y() throws C0599v.a {
        X(0);
        return this.f4749a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int z() throws C0599v.a {
        X(0);
        return this.f4749a.u();
    }
}
