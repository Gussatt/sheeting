package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0598u;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public final class M implements Y {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int[] f4641r = new int[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Unsafe f4642s = i0.A();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f4643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f4644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f4647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4649g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final T f4650h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f4651i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f4652j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f4653k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4654l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final O f4655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final InterfaceC0602y f4656n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f0 f4657o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC0592n f4658p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final E f4659q;

    public M(int[] iArr, Object[] objArr, int i4, int i5, J j4, T t4, boolean z3, int[] iArr2, int i6, int i7, O o4, InterfaceC0602y interfaceC0602y, f0 f0Var, AbstractC0592n abstractC0592n, E e4) {
        this.f4643a = iArr;
        this.f4644b = objArr;
        this.f4645c = i4;
        this.f4646d = i5;
        this.f4649g = j4 instanceof AbstractC0597t;
        this.f4650h = t4;
        this.f4648f = abstractC0592n != null && abstractC0592n.e(j4);
        this.f4651i = z3;
        this.f4652j = iArr2;
        this.f4653k = i6;
        this.f4654l = i7;
        this.f4655m = o4;
        this.f4656n = interfaceC0602y;
        this.f4657o = f0Var;
        this.f4658p = abstractC0592n;
        this.f4647e = j4;
        this.f4659q = e4;
    }

    public static boolean B(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0597t) {
            return ((AbstractC0597t) obj).C();
        }
        return true;
    }

    public static boolean E(int i4) {
        return (i4 & 268435456) != 0;
    }

    public static long F(Object obj, long j4) {
        return i0.x(obj, j4);
    }

    public static M N(Class cls, H h4, O o4, InterfaceC0602y interfaceC0602y, f0 f0Var, AbstractC0592n abstractC0592n, E e4) {
        if (h4 instanceof W) {
            return P((W) h4, o4, interfaceC0602y, f0Var, abstractC0592n, e4);
        }
        i.d.a(h4);
        return O(null, o4, interfaceC0602y, f0Var, abstractC0592n, e4);
    }

    public static M O(c0 c0Var, O o4, InterfaceC0602y interfaceC0602y, f0 f0Var, AbstractC0592n abstractC0592n, E e4) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.datastore.preferences.protobuf.M P(androidx.datastore.preferences.protobuf.W r33, androidx.datastore.preferences.protobuf.O r34, androidx.datastore.preferences.protobuf.InterfaceC0602y r35, androidx.datastore.preferences.protobuf.f0 r36, androidx.datastore.preferences.protobuf.AbstractC0592n r37, androidx.datastore.preferences.protobuf.E r38) {
        /*
            Method dump skipped, instruction units count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.P(androidx.datastore.preferences.protobuf.W, androidx.datastore.preferences.protobuf.O, androidx.datastore.preferences.protobuf.y, androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.E):androidx.datastore.preferences.protobuf.M");
    }

    public static long R(int i4) {
        return i4 & 1048575;
    }

    public static boolean S(Object obj, long j4) {
        return ((Boolean) i0.z(obj, j4)).booleanValue();
    }

    public static double T(Object obj, long j4) {
        return ((Double) i0.z(obj, j4)).doubleValue();
    }

    public static float U(Object obj, long j4) {
        return ((Float) i0.z(obj, j4)).floatValue();
    }

    public static int V(Object obj, long j4) {
        return ((Integer) i0.z(obj, j4)).intValue();
    }

    public static long W(Object obj, long j4) {
        return ((Long) i0.z(obj, j4)).longValue();
    }

    public static Field d0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static int j0(int i4) {
        return (i4 & 267386880) >>> 20;
    }

    public static boolean k(Object obj, long j4) {
        return i0.p(obj, j4);
    }

    public static void l(Object obj) {
        if (B(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static double m(Object obj, long j4) {
        return i0.u(obj, j4);
    }

    public static float p(Object obj, long j4) {
        return i0.v(obj, j4);
    }

    public static int u(Object obj, long j4) {
        return i0.w(obj, j4);
    }

    public static boolean v(int i4) {
        return (i4 & 536870912) != 0;
    }

    public static boolean y(Object obj, int i4, Y y3) {
        return y3.e(i0.z(obj, R(i4)));
    }

    public final boolean A(Object obj, int i4, int i5) {
        Map mapG = this.f4659q.g(i0.z(obj, R(i4)));
        if (mapG.isEmpty()) {
            return true;
        }
        if (this.f4659q.f(r(i5)).f4634c.d() != k0.c.MESSAGE) {
            return true;
        }
        Y yC = null;
        for (Object obj2 : mapG.values()) {
            if (yC == null) {
                yC = U.a().c(obj2.getClass());
            }
            if (!yC.e(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean C(Object obj, Object obj2, int i4) {
        long jY = Y(i4) & 1048575;
        return i0.w(obj, jY) == i0.w(obj2, jY);
    }

    public final boolean D(Object obj, int i4, int i5) {
        return i0.w(obj, (long) (Y(i5) & 1048575)) == i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:333:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a8, code lost:
    
        r0 = r10.f4653k;
        r4 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
    
        if (r0 >= r10.f4654l) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
    
        r4 = r10.o(r2, r10.f4652j[r0], r4, r5, r20);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        if (r4 == null) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c2, code lost:
    
        r5.o(r2, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06d8 A[Catch: all -> 0x06f9, TRY_LEAVE, TryCatch #13 {all -> 0x06f9, blocks: (B:230:0x06d2, B:232:0x06d8, B:243:0x06fd, B:244:0x0702), top: B:281:0x06d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0733 A[LOOP:4: B:257:0x072f->B:259:0x0733, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0746  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(androidx.datastore.preferences.protobuf.f0 r18, androidx.datastore.preferences.protobuf.AbstractC0592n r19, java.lang.Object r20, androidx.datastore.preferences.protobuf.X r21, androidx.datastore.preferences.protobuf.C0591m r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.G(androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.n, java.lang.Object, androidx.datastore.preferences.protobuf.X, androidx.datastore.preferences.protobuf.m):void");
    }

    public final void H(Object obj, int i4, Object obj2, C0591m c0591m, X x3) {
        long jR = R(k0(i4));
        Object objZ = i0.z(obj, jR);
        if (objZ == null) {
            objZ = this.f4659q.b(obj2);
            i0.O(obj, jR, objZ);
        } else if (this.f4659q.d(objZ)) {
            Object objB = this.f4659q.b(obj2);
            this.f4659q.a(objB, objZ);
            i0.O(obj, jR, objB);
            objZ = objB;
        }
        x3.a(this.f4659q.h(objZ), this.f4659q.f(obj2), c0591m);
    }

    public final void I(Object obj, Object obj2, int i4) {
        if (w(obj2, i4)) {
            long jR = R(k0(i4));
            Unsafe unsafe = f4642s;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i4) + " is present but null: " + obj2);
            }
            Y yS = s(i4);
            if (!w(obj, i4)) {
                if (B(object)) {
                    Object objH = yS.h();
                    yS.a(objH, object);
                    unsafe.putObject(obj, jR, objH);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                e0(obj, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!B(object2)) {
                Object objH2 = yS.h();
                yS.a(objH2, object2);
                unsafe.putObject(obj, jR, objH2);
                object2 = objH2;
            }
            yS.a(object2, object);
        }
    }

    public final void J(Object obj, Object obj2, int i4) {
        int iQ = Q(i4);
        if (D(obj2, iQ, i4)) {
            long jR = R(k0(i4));
            Unsafe unsafe = f4642s;
            Object object = unsafe.getObject(obj2, jR);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + Q(i4) + " is present but null: " + obj2);
            }
            Y yS = s(i4);
            if (!D(obj, iQ, i4)) {
                if (B(object)) {
                    Object objH = yS.h();
                    yS.a(objH, object);
                    unsafe.putObject(obj, jR, objH);
                } else {
                    unsafe.putObject(obj, jR, object);
                }
                f0(obj, iQ, i4);
                return;
            }
            Object object2 = unsafe.getObject(obj, jR);
            if (!B(object2)) {
                Object objH2 = yS.h();
                yS.a(objH2, object2);
                unsafe.putObject(obj, jR, objH2);
                object2 = objH2;
            }
            yS.a(object2, object);
        }
    }

    public final void K(Object obj, Object obj2, int i4) {
        int iK0 = k0(i4);
        long jR = R(iK0);
        int iQ = Q(i4);
        switch (j0(iK0)) {
            case 0:
                if (w(obj2, i4)) {
                    i0.K(obj, jR, i0.u(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 1:
                if (w(obj2, i4)) {
                    i0.L(obj, jR, i0.v(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 2:
                if (w(obj2, i4)) {
                    i0.N(obj, jR, i0.x(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 3:
                if (w(obj2, i4)) {
                    i0.N(obj, jR, i0.x(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                if (w(obj2, i4)) {
                    i0.M(obj, jR, i0.w(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                if (w(obj2, i4)) {
                    i0.N(obj, jR, i0.x(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                if (w(obj2, i4)) {
                    i0.M(obj, jR, i0.w(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                if (w(obj2, i4)) {
                    i0.E(obj, jR, i0.p(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                if (w(obj2, i4)) {
                    i0.O(obj, jR, i0.z(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 9:
                I(obj, obj2, i4);
                break;
            case 10:
                if (w(obj2, i4)) {
                    i0.O(obj, jR, i0.z(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 11:
                if (w(obj2, i4)) {
                    i0.M(obj, jR, i0.w(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 12:
                if (w(obj2, i4)) {
                    i0.M(obj, jR, i0.w(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 13:
                if (w(obj2, i4)) {
                    i0.M(obj, jR, i0.w(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 14:
                if (w(obj2, i4)) {
                    i0.N(obj, jR, i0.x(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 15:
                if (w(obj2, i4)) {
                    i0.M(obj, jR, i0.w(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 16:
                if (w(obj2, i4)) {
                    i0.N(obj, jR, i0.x(obj2, jR));
                    e0(obj, i4);
                }
                break;
            case 17:
                I(obj, obj2, i4);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f4656n.c(obj, obj2, jR);
                break;
            case 50:
                a0.E(this.f4659q, obj, obj2, jR);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (D(obj2, iQ, i4)) {
                    i0.O(obj, jR, i0.z(obj2, jR));
                    f0(obj, iQ, i4);
                }
                break;
            case 60:
                J(obj, obj2, i4);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (D(obj2, iQ, i4)) {
                    i0.O(obj, jR, i0.z(obj2, jR));
                    f0(obj, iQ, i4);
                }
                break;
            case 68:
                J(obj, obj2, i4);
                break;
        }
    }

    public final Object L(Object obj, int i4) {
        Y yS = s(i4);
        long jR = R(k0(i4));
        if (!w(obj, i4)) {
            return yS.h();
        }
        Object object = f4642s.getObject(obj, jR);
        if (B(object)) {
            return object;
        }
        Object objH = yS.h();
        if (object != null) {
            yS.a(objH, object);
        }
        return objH;
    }

    public final Object M(Object obj, int i4, int i5) {
        Y yS = s(i5);
        if (!D(obj, i4, i5)) {
            return yS.h();
        }
        Object object = f4642s.getObject(obj, R(k0(i5)));
        if (B(object)) {
            return object;
        }
        Object objH = yS.h();
        if (object != null) {
            yS.a(objH, object);
        }
        return objH;
    }

    public final int Q(int i4) {
        return this.f4643a[i4];
    }

    public final int X(int i4) {
        if (i4 < this.f4645c || i4 > this.f4646d) {
            return -1;
        }
        return g0(i4, 0);
    }

    public final int Y(int i4) {
        return this.f4643a[i4 + 2];
    }

    public final void Z(Object obj, long j4, X x3, Y y3, C0591m c0591m) {
        x3.A(this.f4656n.b(obj, j4), y3, c0591m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void a(Object obj, Object obj2) {
        l(obj);
        obj2.getClass();
        for (int i4 = 0; i4 < this.f4643a.length; i4 += 3) {
            K(obj, obj2, i4);
        }
        a0.F(this.f4657o, obj, obj2);
        if (this.f4648f) {
            a0.D(this.f4658p, obj, obj2);
        }
    }

    public final void a0(Object obj, int i4, X x3, Y y3, C0591m c0591m) {
        x3.F(this.f4656n.b(obj, R(i4)), y3, c0591m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void b(Object obj, X x3, C0591m c0591m) throws Throwable {
        c0591m.getClass();
        l(obj);
        G(this.f4657o, this.f4658p, obj, x3, c0591m);
    }

    public final void b0(Object obj, int i4, X x3) {
        if (v(i4)) {
            i0.O(obj, R(i4), x3.J());
        } else if (this.f4649g) {
            i0.O(obj, R(i4), x3.o());
        } else {
            i0.O(obj, R(i4), x3.w());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void c(Object obj, l0 l0Var) {
        if (l0Var.x() == l0.a.DESCENDING) {
            m0(obj, l0Var);
        } else {
            l0(obj, l0Var);
        }
    }

    public final void c0(Object obj, int i4, X x3) {
        if (v(i4)) {
            x3.v(this.f4656n.b(obj, R(i4)));
        } else {
            x3.s(this.f4656n.b(obj, R(i4)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // androidx.datastore.preferences.protobuf.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.d(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // androidx.datastore.preferences.protobuf.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(java.lang.Object r15) {
        /*
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.f4653k
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.f4652j
            r9 = r5[r2]
            int r5 = r14.Q(r9)
            int r13 = r14.k0(r9)
            int[] r7 = r14.f4643a
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.M.f4642s
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            boolean r3 = E(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.x(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = j0(r13)
            r3 = 9
            if (r15 == r3) goto L83
            r3 = 17
            if (r15 == r3) goto L83
            r3 = 27
            if (r15 == r3) goto L7c
            r3 = 60
            if (r15 == r3) goto L6b
            r3 = 68
            if (r15 == r3) goto L6b
            r3 = 49
            if (r15 == r3) goto L7c
            r3 = 50
            if (r15 == r3) goto L64
            goto L94
        L64:
            boolean r15 = r14.A(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.D(r8, r5, r9)
            if (r15 == 0) goto L94
            androidx.datastore.preferences.protobuf.Y r15 = r14.s(r9)
            boolean r15 = y(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.z(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.x(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            androidx.datastore.preferences.protobuf.Y r15 = r14.s(r9)
            boolean r15 = y(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L94:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9b:
            r7 = r14
            r8 = r15
            boolean r15 = r7.f4648f
            if (r15 == 0) goto Lae
            androidx.datastore.preferences.protobuf.n r15 = r7.f4658p
            androidx.datastore.preferences.protobuf.q r15 = r15.c(r8)
            boolean r15 = r15.k()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.e(java.lang.Object):boolean");
    }

    public final void e0(Object obj, int i4) {
        int iY = Y(i4);
        long j4 = 1048575 & iY;
        if (j4 == 1048575) {
            return;
        }
        i0.M(obj, j4, (1 << (iY >>> 20)) | i0.w(obj, j4));
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean f(Object obj, Object obj2) {
        int length = this.f4643a.length;
        for (int i4 = 0; i4 < length; i4 += 3) {
            if (!n(obj, obj2, i4)) {
                return false;
            }
        }
        if (!this.f4657o.g(obj).equals(this.f4657o.g(obj2))) {
            return false;
        }
        if (this.f4648f) {
            return this.f4658p.c(obj).equals(this.f4658p.c(obj2));
        }
        return true;
    }

    public final void f0(Object obj, int i4, int i5) {
        i0.M(obj, Y(i5) & 1048575, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.Y
    public int g(Object obj) {
        int i4;
        int iH;
        int iP;
        int iW;
        int i5;
        int iO;
        int iQ;
        M m4 = this;
        Object obj2 = obj;
        Unsafe unsafe = f4642s;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1048575;
        while (i7 < m4.f4643a.length) {
            int iK0 = m4.k0(i7);
            int iJ0 = j0(iK0);
            int iQ2 = m4.Q(i7);
            int i11 = m4.f4643a[i7 + 2];
            int i12 = i11 & i6;
            if (iJ0 <= 17) {
                if (i12 != i10) {
                    i8 = i12 == i6 ? 0 : unsafe.getInt(obj2, i12);
                    i10 = i12;
                }
                i4 = 1 << (i11 >>> 20);
            } else {
                i4 = 0;
            }
            int i13 = i9;
            long jR = R(iK0);
            if (iJ0 < r.f4869a0.d() || iJ0 > r.f4882n0.d()) {
                i12 = 0;
            }
            switch (iJ0) {
                case 0:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iH = AbstractC0587i.h(iQ2, 0.0d);
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 1:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iP = AbstractC0587i.p(iQ2, 0.0f);
                        i9 = i13 + iP;
                        m4 = this;
                        obj2 = obj;
                    }
                    m4 = this;
                    obj2 = obj;
                    i9 = i13;
                    break;
                case 2:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iW = AbstractC0587i.w(iQ2, unsafe.getLong(obj2, jR));
                        i9 = i13 + iW;
                        m4 = this;
                    }
                    m4 = this;
                    i9 = i13;
                    break;
                case 3:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iW = AbstractC0587i.R(iQ2, unsafe.getLong(obj2, jR));
                        i9 = i13 + iW;
                        m4 = this;
                    }
                    m4 = this;
                    i9 = i13;
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iW = AbstractC0587i.u(iQ2, unsafe.getInt(obj2, jR));
                        i9 = i13 + iW;
                        m4 = this;
                    }
                    m4 = this;
                    i9 = i13;
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iP = AbstractC0587i.n(iQ2, 0L);
                        i9 = i13 + iP;
                        m4 = this;
                        obj2 = obj;
                    }
                    m4 = this;
                    obj2 = obj;
                    i9 = i13;
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iP = AbstractC0587i.l(iQ2, 0);
                        i9 = i13 + iP;
                        m4 = this;
                        obj2 = obj;
                    }
                    m4 = this;
                    obj2 = obj;
                    i9 = i13;
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iP = AbstractC0587i.c(iQ2, true);
                        i9 = i13 + iP;
                        m4 = this;
                        obj2 = obj;
                    }
                    m4 = this;
                    obj2 = obj;
                    i9 = i13;
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        Object object = unsafe.getObject(obj2, jR);
                        iW = object instanceof AbstractC0584f ? AbstractC0587i.f(iQ2, (AbstractC0584f) object) : AbstractC0587i.M(iQ2, (String) object);
                        i9 = i13 + iW;
                        m4 = this;
                    }
                    m4 = this;
                    i9 = i13;
                    break;
                case 9:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iH = a0.o(iQ2, unsafe.getObject(obj2, jR), m4.s(i7));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 10:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iW = AbstractC0587i.f(iQ2, (AbstractC0584f) unsafe.getObject(obj2, jR));
                        i9 = i13 + iW;
                        m4 = this;
                    }
                    m4 = this;
                    i9 = i13;
                    break;
                case 11:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iW = AbstractC0587i.P(iQ2, unsafe.getInt(obj2, jR));
                        i9 = i13 + iW;
                        m4 = this;
                    }
                    m4 = this;
                    i9 = i13;
                    break;
                case 12:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iW = AbstractC0587i.j(iQ2, unsafe.getInt(obj2, jR));
                        i9 = i13 + iW;
                        m4 = this;
                    }
                    m4 = this;
                    i9 = i13;
                    break;
                case 13:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iP = AbstractC0587i.E(iQ2, 0);
                        i9 = i13 + iP;
                        m4 = this;
                        obj2 = obj;
                    }
                    m4 = this;
                    obj2 = obj;
                    i9 = i13;
                    break;
                case 14:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iP = AbstractC0587i.G(iQ2, 0L);
                        i9 = i13 + iP;
                        m4 = this;
                        obj2 = obj;
                    }
                    m4 = this;
                    obj2 = obj;
                    i9 = i13;
                    break;
                case 15:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iW = AbstractC0587i.I(iQ2, unsafe.getInt(obj2, jR));
                        i9 = i13 + iW;
                        m4 = this;
                    }
                    m4 = this;
                    i9 = i13;
                    break;
                case 16:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iW = AbstractC0587i.K(iQ2, unsafe.getLong(obj2, jR));
                        i9 = i13 + iW;
                        m4 = this;
                    }
                    m4 = this;
                    i9 = i13;
                    break;
                case 17:
                    if (m4.x(obj2, i7, i10, i8, i4)) {
                        iH = AbstractC0587i.r(iQ2, (J) unsafe.getObject(obj2, jR), m4.s(i7));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 18:
                    iH = a0.h(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 19:
                    iH = a0.f(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 20:
                    iH = a0.m(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 21:
                    iH = a0.x(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 22:
                    iH = a0.k(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 23:
                    iH = a0.h(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 24:
                    iH = a0.f(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 25:
                    iH = a0.a(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 26:
                    iH = a0.u(iQ2, (List) unsafe.getObject(obj2, jR));
                    i9 = i13 + iH;
                    break;
                case 27:
                    iH = a0.p(iQ2, (List) unsafe.getObject(obj2, jR), m4.s(i7));
                    i9 = i13 + iH;
                    break;
                case 28:
                    iH = a0.c(iQ2, (List) unsafe.getObject(obj2, jR));
                    i9 = i13 + iH;
                    break;
                case 29:
                    iH = a0.v(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 30:
                    iH = a0.d(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 31:
                    iH = a0.f(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 32:
                    iH = a0.h(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 33:
                    iH = a0.q(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 34:
                    iH = a0.s(iQ2, (List) unsafe.getObject(obj2, jR), false);
                    i9 = i13 + iH;
                    break;
                case 35:
                    i5 = a0.i((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 36:
                    i5 = a0.g((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 37:
                    i5 = a0.n((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 38:
                    i5 = a0.y((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 39:
                    i5 = a0.l((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 40:
                    i5 = a0.i((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 41:
                    i5 = a0.g((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 42:
                    i5 = a0.b((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 43:
                    i5 = a0.w((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 44:
                    i5 = a0.e((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 45:
                    i5 = a0.g((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 46:
                    i5 = a0.i((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 47:
                    i5 = a0.r((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 48:
                    i5 = a0.t((List) unsafe.getObject(obj2, jR));
                    if (i5 > 0) {
                        if (m4.f4651i) {
                            unsafe.putInt(obj2, i12, i5);
                        }
                        iO = AbstractC0587i.O(iQ2);
                        iQ = AbstractC0587i.Q(i5);
                        i9 = i13 + iO + iQ + i5;
                    }
                    i9 = i13;
                    break;
                case 49:
                    iH = a0.j(iQ2, (List) unsafe.getObject(obj2, jR), m4.s(i7));
                    i9 = i13 + iH;
                    break;
                case 50:
                    iH = m4.f4659q.c(iQ2, unsafe.getObject(obj2, jR), m4.r(i7));
                    i9 = i13 + iH;
                    break;
                case 51:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.h(iQ2, 0.0d);
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 52:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.p(iQ2, 0.0f);
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 53:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.w(iQ2, W(obj2, jR));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 54:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.R(iQ2, W(obj2, jR));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 55:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.u(iQ2, V(obj2, jR));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 56:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.n(iQ2, 0L);
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 57:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.l(iQ2, 0);
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 58:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.c(iQ2, true);
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 59:
                    if (m4.D(obj2, iQ2, i7)) {
                        Object object2 = unsafe.getObject(obj2, jR);
                        iH = object2 instanceof AbstractC0584f ? AbstractC0587i.f(iQ2, (AbstractC0584f) object2) : AbstractC0587i.M(iQ2, (String) object2);
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 60:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = a0.o(iQ2, unsafe.getObject(obj2, jR), m4.s(i7));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 61:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.f(iQ2, (AbstractC0584f) unsafe.getObject(obj2, jR));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 62:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.P(iQ2, V(obj2, jR));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 63:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.j(iQ2, V(obj2, jR));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 64:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.E(iQ2, 0);
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 65:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.G(iQ2, 0L);
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 66:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.I(iQ2, V(obj2, jR));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 67:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.K(iQ2, W(obj2, jR));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                case 68:
                    if (m4.D(obj2, iQ2, i7)) {
                        iH = AbstractC0587i.r(iQ2, (J) unsafe.getObject(obj2, jR), m4.s(i7));
                        i9 = i13 + iH;
                    }
                    i9 = i13;
                    break;
                default:
                    i9 = i13;
                    break;
            }
            i7 += 3;
            i6 = 1048575;
        }
        int iT = i9 + m4.t(m4.f4657o, obj2);
        return m4.f4648f ? iT + m4.f4658p.c(obj2).h() : iT;
    }

    public final int g0(int i4, int i5) {
        int length = (this.f4643a.length / 3) - 1;
        while (i5 <= length) {
            int i6 = (length + i5) >>> 1;
            int i7 = i6 * 3;
            int iQ = Q(i7);
            if (i4 == iQ) {
                return i7;
            }
            if (i4 < iQ) {
                length = i6 - 1;
            } else {
                i5 = i6 + 1;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public Object h() {
        return this.f4655m.a(this.f4647e);
    }

    public final void h0(Object obj, int i4, Object obj2) {
        f4642s.putObject(obj, R(k0(i4)), obj2);
        e0(obj, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int i(Object obj) {
        int i4;
        int iF;
        int length = this.f4643a.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6 += 3) {
            int iK0 = k0(i6);
            int iQ = Q(i6);
            long jR = R(iK0);
            int iHashCode = 37;
            switch (j0(iK0)) {
                case 0:
                    i4 = i5 * 53;
                    iF = AbstractC0598u.f(Double.doubleToLongBits(i0.u(obj, jR)));
                    i5 = i4 + iF;
                    break;
                case 1:
                    i4 = i5 * 53;
                    iF = Float.floatToIntBits(i0.v(obj, jR));
                    i5 = i4 + iF;
                    break;
                case 2:
                    i4 = i5 * 53;
                    iF = AbstractC0598u.f(i0.x(obj, jR));
                    i5 = i4 + iF;
                    break;
                case 3:
                    i4 = i5 * 53;
                    iF = AbstractC0598u.f(i0.x(obj, jR));
                    i5 = i4 + iF;
                    break;
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    i4 = i5 * 53;
                    iF = i0.w(obj, jR);
                    i5 = i4 + iF;
                    break;
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    i4 = i5 * 53;
                    iF = AbstractC0598u.f(i0.x(obj, jR));
                    i5 = i4 + iF;
                    break;
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    i4 = i5 * 53;
                    iF = i0.w(obj, jR);
                    i5 = i4 + iF;
                    break;
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    i4 = i5 * 53;
                    iF = AbstractC0598u.c(i0.p(obj, jR));
                    i5 = i4 + iF;
                    break;
                case O.h.BYTES_FIELD_NUMBER /* 8 */:
                    i4 = i5 * 53;
                    iF = ((String) i0.z(obj, jR)).hashCode();
                    i5 = i4 + iF;
                    break;
                case 9:
                    Object objZ = i0.z(obj, jR);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
                    break;
                case 10:
                    i4 = i5 * 53;
                    iF = i0.z(obj, jR).hashCode();
                    i5 = i4 + iF;
                    break;
                case 11:
                    i4 = i5 * 53;
                    iF = i0.w(obj, jR);
                    i5 = i4 + iF;
                    break;
                case 12:
                    i4 = i5 * 53;
                    iF = i0.w(obj, jR);
                    i5 = i4 + iF;
                    break;
                case 13:
                    i4 = i5 * 53;
                    iF = i0.w(obj, jR);
                    i5 = i4 + iF;
                    break;
                case 14:
                    i4 = i5 * 53;
                    iF = AbstractC0598u.f(i0.x(obj, jR));
                    i5 = i4 + iF;
                    break;
                case 15:
                    i4 = i5 * 53;
                    iF = i0.w(obj, jR);
                    i5 = i4 + iF;
                    break;
                case 16:
                    i4 = i5 * 53;
                    iF = AbstractC0598u.f(i0.x(obj, jR));
                    i5 = i4 + iF;
                    break;
                case 17:
                    Object objZ2 = i0.z(obj, jR);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
                    }
                    i5 = (i5 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i4 = i5 * 53;
                    iF = i0.z(obj, jR).hashCode();
                    i5 = i4 + iF;
                    break;
                case 50:
                    i4 = i5 * 53;
                    iF = i0.z(obj, jR).hashCode();
                    i5 = i4 + iF;
                    break;
                case 51:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = AbstractC0598u.f(Double.doubleToLongBits(T(obj, jR)));
                        i5 = i4 + iF;
                    }
                    break;
                case 52:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = Float.floatToIntBits(U(obj, jR));
                        i5 = i4 + iF;
                    }
                    break;
                case 53:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = AbstractC0598u.f(W(obj, jR));
                        i5 = i4 + iF;
                    }
                    break;
                case 54:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = AbstractC0598u.f(W(obj, jR));
                        i5 = i4 + iF;
                    }
                    break;
                case 55:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = V(obj, jR);
                        i5 = i4 + iF;
                    }
                    break;
                case 56:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = AbstractC0598u.f(W(obj, jR));
                        i5 = i4 + iF;
                    }
                    break;
                case 57:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = V(obj, jR);
                        i5 = i4 + iF;
                    }
                    break;
                case 58:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = AbstractC0598u.c(S(obj, jR));
                        i5 = i4 + iF;
                    }
                    break;
                case 59:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = ((String) i0.z(obj, jR)).hashCode();
                        i5 = i4 + iF;
                    }
                    break;
                case 60:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = i0.z(obj, jR).hashCode();
                        i5 = i4 + iF;
                    }
                    break;
                case 61:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = i0.z(obj, jR).hashCode();
                        i5 = i4 + iF;
                    }
                    break;
                case 62:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = V(obj, jR);
                        i5 = i4 + iF;
                    }
                    break;
                case 63:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = V(obj, jR);
                        i5 = i4 + iF;
                    }
                    break;
                case 64:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = V(obj, jR);
                        i5 = i4 + iF;
                    }
                    break;
                case 65:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = AbstractC0598u.f(W(obj, jR));
                        i5 = i4 + iF;
                    }
                    break;
                case 66:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = V(obj, jR);
                        i5 = i4 + iF;
                    }
                    break;
                case 67:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = AbstractC0598u.f(W(obj, jR));
                        i5 = i4 + iF;
                    }
                    break;
                case 68:
                    if (D(obj, iQ, i6)) {
                        i4 = i5 * 53;
                        iF = i0.z(obj, jR).hashCode();
                        i5 = i4 + iF;
                    }
                    break;
            }
        }
        int iHashCode2 = (i5 * 53) + this.f4657o.g(obj).hashCode();
        return this.f4648f ? (iHashCode2 * 53) + this.f4658p.c(obj).hashCode() : iHashCode2;
    }

    public final void i0(Object obj, int i4, int i5, Object obj2) {
        f4642s.putObject(obj, R(k0(i5)), obj2);
        f0(obj, i4, i5);
    }

    public final boolean j(Object obj, Object obj2, int i4) {
        return w(obj, i4) == w(obj2, i4);
    }

    public final int k0(int i4) {
        return this.f4643a[i4 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l0(java.lang.Object r19, androidx.datastore.preferences.protobuf.l0 r20) {
        /*
            Method dump skipped, instruction units count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.l0(java.lang.Object, androidx.datastore.preferences.protobuf.l0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m0(java.lang.Object r11, androidx.datastore.preferences.protobuf.l0 r12) {
        /*
            Method dump skipped, instruction units count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.m0(java.lang.Object, androidx.datastore.preferences.protobuf.l0):void");
    }

    public final boolean n(Object obj, Object obj2, int i4) {
        int iK0 = k0(i4);
        long jR = R(iK0);
        switch (j0(iK0)) {
            case 0:
                if (!j(obj, obj2, i4) || Double.doubleToLongBits(i0.u(obj, jR)) != Double.doubleToLongBits(i0.u(obj2, jR))) {
                }
                break;
            case 1:
                if (!j(obj, obj2, i4) || Float.floatToIntBits(i0.v(obj, jR)) != Float.floatToIntBits(i0.v(obj2, jR))) {
                }
                break;
            case 2:
                if (!j(obj, obj2, i4) || i0.x(obj, jR) != i0.x(obj2, jR)) {
                }
                break;
            case 3:
                if (!j(obj, obj2, i4) || i0.x(obj, jR) != i0.x(obj2, jR)) {
                }
                break;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                if (!j(obj, obj2, i4) || i0.w(obj, jR) != i0.w(obj2, jR)) {
                }
                break;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                if (!j(obj, obj2, i4) || i0.x(obj, jR) != i0.x(obj2, jR)) {
                }
                break;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                if (!j(obj, obj2, i4) || i0.w(obj, jR) != i0.w(obj2, jR)) {
                }
                break;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                if (!j(obj, obj2, i4) || i0.p(obj, jR) != i0.p(obj2, jR)) {
                }
                break;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                if (!j(obj, obj2, i4) || !a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                }
                break;
            case 9:
                if (!j(obj, obj2, i4) || !a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                }
                break;
            case 10:
                if (!j(obj, obj2, i4) || !a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                }
                break;
            case 11:
                if (!j(obj, obj2, i4) || i0.w(obj, jR) != i0.w(obj2, jR)) {
                }
                break;
            case 12:
                if (!j(obj, obj2, i4) || i0.w(obj, jR) != i0.w(obj2, jR)) {
                }
                break;
            case 13:
                if (!j(obj, obj2, i4) || i0.w(obj, jR) != i0.w(obj2, jR)) {
                }
                break;
            case 14:
                if (!j(obj, obj2, i4) || i0.x(obj, jR) != i0.x(obj2, jR)) {
                }
                break;
            case 15:
                if (!j(obj, obj2, i4) || i0.w(obj, jR) != i0.w(obj2, jR)) {
                }
                break;
            case 16:
                if (!j(obj, obj2, i4) || i0.x(obj, jR) != i0.x(obj2, jR)) {
                }
                break;
            case 17:
                if (!j(obj, obj2, i4) || !a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!C(obj, obj2, i4) || !a0.H(i0.z(obj, jR), i0.z(obj2, jR))) {
                }
                break;
        }
        return true;
    }

    public final void n0(l0 l0Var, int i4, Object obj, int i5) {
        if (obj != null) {
            l0Var.L(i4, this.f4659q.f(r(i5)), this.f4659q.g(obj));
        }
    }

    public final Object o(Object obj, int i4, Object obj2, f0 f0Var, Object obj3) {
        Q(i4);
        if (i0.z(obj, R(k0(i4))) == null) {
            return obj2;
        }
        q(i4);
        return obj2;
    }

    public final void o0(int i4, Object obj, l0 l0Var) {
        if (obj instanceof String) {
            l0Var.E(i4, (String) obj);
        } else {
            l0Var.l(i4, (AbstractC0584f) obj);
        }
    }

    public final void p0(f0 f0Var, Object obj, l0 l0Var) {
        f0Var.t(f0Var.g(obj), l0Var);
    }

    public final AbstractC0598u.a q(int i4) {
        i.d.a(this.f4644b[((i4 / 3) * 2) + 1]);
        return null;
    }

    public final Object r(int i4) {
        return this.f4644b[(i4 / 3) * 2];
    }

    public final Y s(int i4) {
        int i5 = (i4 / 3) * 2;
        Y y3 = (Y) this.f4644b[i5];
        if (y3 != null) {
            return y3;
        }
        Y yC = U.a().c((Class) this.f4644b[i5 + 1]);
        this.f4644b[i5] = yC;
        return yC;
    }

    public final int t(f0 f0Var, Object obj) {
        return f0Var.h(f0Var.g(obj));
    }

    public final boolean w(Object obj, int i4) {
        int iY = Y(i4);
        long j4 = 1048575 & iY;
        if (j4 != 1048575) {
            return (i0.w(obj, j4) & (1 << (iY >>> 20))) != 0;
        }
        int iK0 = k0(i4);
        long jR = R(iK0);
        switch (j0(iK0)) {
            case 0:
                return Double.doubleToRawLongBits(i0.u(obj, jR)) != 0;
            case 1:
                return Float.floatToRawIntBits(i0.v(obj, jR)) != 0;
            case 2:
                return i0.x(obj, jR) != 0;
            case 3:
                return i0.x(obj, jR) != 0;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return i0.w(obj, jR) != 0;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return i0.x(obj, jR) != 0;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return i0.w(obj, jR) != 0;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return i0.p(obj, jR);
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                Object objZ = i0.z(obj, jR);
                if (objZ instanceof String) {
                    return !((String) objZ).isEmpty();
                }
                if (objZ instanceof AbstractC0584f) {
                    return !AbstractC0584f.f4709n.equals(objZ);
                }
                throw new IllegalArgumentException();
            case 9:
                return i0.z(obj, jR) != null;
            case 10:
                return !AbstractC0584f.f4709n.equals(i0.z(obj, jR));
            case 11:
                return i0.w(obj, jR) != 0;
            case 12:
                return i0.w(obj, jR) != 0;
            case 13:
                return i0.w(obj, jR) != 0;
            case 14:
                return i0.x(obj, jR) != 0;
            case 15:
                return i0.w(obj, jR) != 0;
            case 16:
                return i0.x(obj, jR) != 0;
            case 17:
                return i0.z(obj, jR) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean x(Object obj, int i4, int i5, int i6, int i7) {
        return i5 == 1048575 ? w(obj, i4) : (i6 & i7) != 0;
    }

    public final boolean z(Object obj, int i4, int i5) {
        List list = (List) i0.z(obj, R(i4));
        if (list.isEmpty()) {
            return true;
        }
        Y yS = s(i5);
        for (int i6 = 0; i6 < list.size(); i6++) {
            if (!yS.e(list.get(i6))) {
                return false;
            }
        }
        return true;
    }
}
