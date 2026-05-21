package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.k0;
import androidx.datastore.preferences.protobuf.l0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0588j implements l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0587i f4787a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.j$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4788a;

        static {
            int[] iArr = new int[k0.b.values().length];
            f4788a = iArr;
            try {
                iArr[k0.b.f4808v.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4788a[k0.b.f4807u.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4788a[k0.b.f4805s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4788a[k0.b.f4796C.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4788a[k0.b.f4798E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4788a[k0.b.f4794A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4788a[k0.b.f4806t.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4788a[k0.b.f4803q.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4788a[k0.b.f4797D.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4788a[k0.b.f4799F.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4788a[k0.b.f4804r.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4788a[k0.b.f4809w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C0588j(AbstractC0587i abstractC0587i) {
        AbstractC0587i abstractC0587i2 = (AbstractC0587i) AbstractC0598u.b(abstractC0587i, "output");
        this.f4787a = abstractC0587i2;
        abstractC0587i2.f4756a = this;
    }

    public static C0588j P(AbstractC0587i abstractC0587i) {
        C0588j c0588j = abstractC0587i.f4756a;
        return c0588j != null ? c0588j : new C0588j(abstractC0587i);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void A(int i4, float f4) {
        this.f4787a.o0(i4, f4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void B(int i4, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f4787a.K0(i4, (String) list.get(i5));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void C(int i4, List list, Y y3) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            O(i4, list.get(i5), y3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void D(int i4) {
        this.f4787a.M0(i4, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void E(int i4, String str) {
        this.f4787a.K0(i4, str);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void F(int i4, List list, boolean z3) {
        f0(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void G(int i4, long j4) {
        this.f4787a.P0(i4, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void H(int i4, int i5) {
        this.f4787a.i0(i4, i5);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void I(int i4, List list, boolean z3) {
        c0(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void J(int i4, List list, boolean z3) {
        X(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void K(int i4, List list, boolean z3) {
        W(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void L(int i4, C.a aVar, Map map) {
        if (this.f4787a.X()) {
            U(i4, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f4787a.M0(i4, 2);
            this.f4787a.O0(C.b(aVar, entry.getKey(), entry.getValue()));
            C.e(this.f4787a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void M(int i4, int i5) {
        this.f4787a.G0(i4, i5);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void N(int i4, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f4787a.e0(i4, (AbstractC0584f) list.get(i5));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void O(int i4, Object obj, Y y3) {
        this.f4787a.r0(i4, (J) obj, y3);
    }

    public final void Q(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.a0(i4, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iD = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iD += AbstractC0587i.d(((Boolean) list.get(i6)).booleanValue());
        }
        this.f4787a.O0(iD);
        while (i5 < list.size()) {
            this.f4787a.b0(((Boolean) list.get(i5)).booleanValue());
            i5++;
        }
    }

    public final void R(int i4, boolean z3, Object obj, C.a aVar) {
        this.f4787a.M0(i4, 2);
        this.f4787a.O0(C.b(aVar, Boolean.valueOf(z3), obj));
        C.e(this.f4787a, aVar, Boolean.valueOf(z3), obj);
    }

    public final void S(int i4, C.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            iArr[i5] = ((Integer) it.next()).intValue();
            i5++;
        }
        Arrays.sort(iArr);
        for (int i6 = 0; i6 < size; i6++) {
            int i7 = iArr[i6];
            Object obj = map.get(Integer.valueOf(i7));
            this.f4787a.M0(i4, 2);
            this.f4787a.O0(C.b(aVar, Integer.valueOf(i7), obj));
            C.e(this.f4787a, aVar, Integer.valueOf(i7), obj);
        }
    }

    public final void T(int i4, C.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            jArr[i5] = ((Long) it.next()).longValue();
            i5++;
        }
        Arrays.sort(jArr);
        for (int i6 = 0; i6 < size; i6++) {
            long j4 = jArr[i6];
            Object obj = map.get(Long.valueOf(j4));
            this.f4787a.M0(i4, 2);
            this.f4787a.O0(C.b(aVar, Long.valueOf(j4), obj));
            C.e(this.f4787a, aVar, Long.valueOf(j4), obj);
        }
    }

    public final void U(int i4, C.a aVar, Map map) {
        switch (a.f4788a[aVar.f4632a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    R(i4, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    R(i4, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case O.h.LONG_FIELD_NUMBER /* 4 */:
            case O.h.STRING_FIELD_NUMBER /* 5 */:
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                S(i4, aVar, map);
                return;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
            case 9:
            case 10:
            case 11:
                T(i4, aVar, map);
                return;
            case 12:
                V(i4, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f4632a);
        }
    }

    public final void V(int i4, C.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i5 = 0;
        while (it.hasNext()) {
            strArr[i5] = (String) it.next();
            i5++;
        }
        Arrays.sort(strArr);
        for (int i6 = 0; i6 < size; i6++) {
            String str = strArr[i6];
            Object obj = map.get(str);
            this.f4787a.M0(i4, 2);
            this.f4787a.O0(C.b(aVar, str, obj));
            C.e(this.f4787a, aVar, str, obj);
        }
    }

    public final void W(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.g0(i4, ((Double) list.get(i5)).doubleValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            i6 += AbstractC0587i.i(((Double) list.get(i7)).doubleValue());
        }
        this.f4787a.O0(i6);
        while (i5 < list.size()) {
            this.f4787a.h0(((Double) list.get(i5)).doubleValue());
            i5++;
        }
    }

    public final void X(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.i0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iK = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iK += AbstractC0587i.k(((Integer) list.get(i6)).intValue());
        }
        this.f4787a.O0(iK);
        while (i5 < list.size()) {
            this.f4787a.j0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void Y(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.k0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iM = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iM += AbstractC0587i.m(((Integer) list.get(i6)).intValue());
        }
        this.f4787a.O0(iM);
        while (i5 < list.size()) {
            this.f4787a.l0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    public final void Z(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.m0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iO = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iO += AbstractC0587i.o(((Long) list.get(i6)).longValue());
        }
        this.f4787a.O0(iO);
        while (i5 < list.size()) {
            this.f4787a.n0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void a(int i4, List list, boolean z3) {
        b0(i4, list, z3);
    }

    public final void a0(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.o0(i4, ((Float) list.get(i5)).floatValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iQ = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iQ += AbstractC0587i.q(((Float) list.get(i6)).floatValue());
        }
        this.f4787a.O0(iQ);
        while (i5 < list.size()) {
            this.f4787a.p0(((Float) list.get(i5)).floatValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void b(int i4, List list, boolean z3) {
        a0(i4, list, z3);
    }

    public final void b0(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.u0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iV = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iV += AbstractC0587i.v(((Integer) list.get(i6)).intValue());
        }
        this.f4787a.O0(iV);
        while (i5 < list.size()) {
            this.f4787a.v0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void c(int i4, long j4) {
        this.f4787a.w0(i4, j4);
    }

    public final void c0(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.w0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iX = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iX += AbstractC0587i.x(((Long) list.get(i6)).longValue());
        }
        this.f4787a.O0(iX);
        while (i5 < list.size()) {
            this.f4787a.x0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void d(int i4, boolean z3) {
        this.f4787a.a0(i4, z3);
    }

    public final void d0(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.C0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iF = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iF += AbstractC0587i.F(((Integer) list.get(i6)).intValue());
        }
        this.f4787a.O0(iF);
        while (i5 < list.size()) {
            this.f4787a.D0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void e(int i4, int i5) {
        this.f4787a.N0(i4, i5);
    }

    public final void e0(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.E0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iH = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iH += AbstractC0587i.H(((Long) list.get(i6)).longValue());
        }
        this.f4787a.O0(iH);
        while (i5 < list.size()) {
            this.f4787a.F0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void f(int i4, Object obj) {
        if (obj instanceof AbstractC0584f) {
            this.f4787a.B0(i4, (AbstractC0584f) obj);
        } else {
            this.f4787a.A0(i4, (J) obj);
        }
    }

    public void f0(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.G0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iJ = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iJ += AbstractC0587i.J(((Integer) list.get(i6)).intValue());
        }
        this.f4787a.O0(iJ);
        while (i5 < list.size()) {
            this.f4787a.H0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void g(int i4, int i5) {
        this.f4787a.C0(i4, i5);
    }

    public final void g0(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.I0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iL = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iL += AbstractC0587i.L(((Long) list.get(i6)).longValue());
        }
        this.f4787a.O0(iL);
        while (i5 < list.size()) {
            this.f4787a.J0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void h(int i4) {
        this.f4787a.M0(i4, 3);
    }

    public void h0(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.N0(i4, ((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iQ = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iQ += AbstractC0587i.Q(((Integer) list.get(i6)).intValue());
        }
        this.f4787a.O0(iQ);
        while (i5 < list.size()) {
            this.f4787a.O0(((Integer) list.get(i5)).intValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void i(int i4, int i5) {
        this.f4787a.u0(i4, i5);
    }

    public final void i0(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f4787a.P0(i4, ((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        this.f4787a.M0(i4, 2);
        int iS = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            iS += AbstractC0587i.S(((Long) list.get(i6)).longValue());
        }
        this.f4787a.O0(iS);
        while (i5 < list.size()) {
            this.f4787a.Q0(((Long) list.get(i5)).longValue());
            i5++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void j(int i4, List list, boolean z3) {
        Z(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void k(int i4, List list, boolean z3) {
        d0(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void l(int i4, AbstractC0584f abstractC0584f) {
        this.f4787a.e0(i4, abstractC0584f);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void m(int i4, int i5) {
        this.f4787a.k0(i4, i5);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void n(int i4, double d4) {
        this.f4787a.g0(i4, d4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void o(int i4, long j4) {
        this.f4787a.E0(i4, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void p(int i4, List list, boolean z3) {
        e0(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void q(int i4, List list, boolean z3) {
        Y(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void r(int i4, List list, boolean z3) {
        i0(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void s(int i4, Object obj, Y y3) {
        this.f4787a.y0(i4, (J) obj, y3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void t(int i4, List list, boolean z3) {
        Q(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void u(int i4, List list, boolean z3) {
        h0(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void v(int i4, List list, boolean z3) {
        g0(i4, list, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void w(int i4, long j4) {
        this.f4787a.m0(i4, j4);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public l0.a x() {
        return l0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void y(int i4, List list, Y y3) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            s(i4, list.get(i5), y3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void z(int i4, long j4) {
        this.f4787a.I0(i4, j4);
    }
}
