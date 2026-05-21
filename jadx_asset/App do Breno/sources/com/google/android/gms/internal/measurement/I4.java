package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I4 implements V5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H4 f6367a;

    public I4(H4 h4) {
        Charset charset = AbstractC0717c5.f6667a;
        this.f6367a = h4;
        h4.f6364a = this;
    }

    public static I4 K(H4 h4) {
        I4 i4 = h4.f6364a;
        return i4 != null ? i4 : new I4(h4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void A(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof W4)) {
            if (!z3) {
                while (i5 < list.size()) {
                    this.f6367a.m(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            H4 h4 = this.f6367a;
            h4.r(i4, 2);
            int iA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iA += H4.a(((Integer) list.get(i6)).intValue());
            }
            h4.t(iA);
            while (i5 < list.size()) {
                h4.n(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        W4 w4 = (W4) list;
        if (!z3) {
            while (i5 < w4.size()) {
                this.f6367a.m(i4, w4.f(i5));
                i5++;
            }
            return;
        }
        H4 h42 = this.f6367a;
        h42.r(i4, 2);
        int iA2 = 0;
        for (int i7 = 0; i7 < w4.size(); i7++) {
            iA2 += H4.a(w4.f(i7));
        }
        h42.t(iA2);
        while (i5 < w4.size()) {
            h42.n(w4.f(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void B(int i4, long j4) {
        this.f6367a.k(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void C(int i4, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f6367a.q(i4, (String) list.get(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void D(int i4, long j4) {
        this.f6367a.k(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void E(int i4, int i5) {
        this.f6367a.m(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void F(int i4, long j4) {
        this.f6367a.u(i4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void G(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof W4)) {
            if (!z3) {
                while (i5 < list.size()) {
                    this.f6367a.m(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            H4 h4 = this.f6367a;
            h4.r(i4, 2);
            int iA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iA += H4.a(((Integer) list.get(i6)).intValue());
            }
            h4.t(iA);
            while (i5 < list.size()) {
                h4.n(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        W4 w4 = (W4) list;
        if (!z3) {
            while (i5 < w4.size()) {
                this.f6367a.m(i4, w4.f(i5));
                i5++;
            }
            return;
        }
        H4 h42 = this.f6367a;
        h42.r(i4, 2);
        int iA2 = 0;
        for (int i7 = 0; i7 < w4.size(); i7++) {
            iA2 += H4.a(w4.f(i7));
        }
        h42.t(iA2);
        while (i5 < w4.size()) {
            h42.n(w4.f(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void H(int i4) {
        this.f6367a.r(i4, 4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void I(int i4) {
        this.f6367a.r(i4, 3);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void J(int i4, int i5) {
        this.f6367a.m(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void a(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof W4)) {
            if (!z3) {
                while (i5 < list.size()) {
                    H4 h4 = this.f6367a;
                    int iIntValue = ((Integer) list.get(i5)).intValue();
                    h4.s(i4, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i5++;
                }
                return;
            }
            H4 h42 = this.f6367a;
            h42.r(i4, 2);
            int iZ = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                int iIntValue2 = ((Integer) list.get(i6)).intValue();
                iZ += H4.z((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            h42.t(iZ);
            while (i5 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i5)).intValue();
                h42.t((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i5++;
            }
            return;
        }
        W4 w4 = (W4) list;
        if (!z3) {
            while (i5 < w4.size()) {
                H4 h43 = this.f6367a;
                int iF = w4.f(i5);
                h43.s(i4, (iF >> 31) ^ (iF + iF));
                i5++;
            }
            return;
        }
        H4 h44 = this.f6367a;
        h44.r(i4, 2);
        int iZ2 = 0;
        for (int i7 = 0; i7 < w4.size(); i7++) {
            int iF2 = w4.f(i7);
            iZ2 += H4.z((iF2 >> 31) ^ (iF2 + iF2));
        }
        h44.t(iZ2);
        while (i5 < w4.size()) {
            int iF3 = w4.f(i5);
            h44.t((iF3 >> 31) ^ (iF3 + iF3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void b(int i4, Object obj, E5 e5) {
        H4 h4 = this.f6367a;
        h4.r(i4, 3);
        e5.c((InterfaceC0860t5) obj, h4.f6364a);
        h4.r(i4, 4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void c(int i4, double d4) {
        this.f6367a.k(i4, Double.doubleToRawLongBits(d4));
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void d(int i4, List list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            this.f6367a.h(i4, (A4) list.get(i5));
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void e(int i4, long j4) {
        this.f6367a.u(i4, (j4 >> 63) ^ (j4 + j4));
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void f(int i4, Object obj, E5 e5) {
        this.f6367a.p(i4, (InterfaceC0860t5) obj, e5);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void g(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof C0771i5)) {
            if (!z3) {
                while (i5 < list.size()) {
                    this.f6367a.u(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            H4 h4 = this.f6367a;
            h4.r(i4, 2);
            int iA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iA += H4.a(((Long) list.get(i6)).longValue());
            }
            h4.t(iA);
            while (i5 < list.size()) {
                h4.v(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        C0771i5 c0771i5 = (C0771i5) list;
        if (!z3) {
            while (i5 < c0771i5.size()) {
                this.f6367a.u(i4, c0771i5.a(i5));
                i5++;
            }
            return;
        }
        H4 h42 = this.f6367a;
        h42.r(i4, 2);
        int iA2 = 0;
        for (int i7 = 0; i7 < c0771i5.size(); i7++) {
            iA2 += H4.a(c0771i5.a(i7));
        }
        h42.t(iA2);
        while (i5 < c0771i5.size()) {
            h42.v(c0771i5.a(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void h(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof C0771i5)) {
            if (!z3) {
                while (i5 < list.size()) {
                    this.f6367a.k(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            H4 h4 = this.f6367a;
            h4.r(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            h4.t(i6);
            while (i5 < list.size()) {
                h4.l(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        C0771i5 c0771i5 = (C0771i5) list;
        if (!z3) {
            while (i5 < c0771i5.size()) {
                this.f6367a.k(i4, c0771i5.a(i5));
                i5++;
            }
            return;
        }
        H4 h42 = this.f6367a;
        h42.r(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0771i5.size(); i9++) {
            c0771i5.a(i9);
            i8 += 8;
        }
        h42.t(i8);
        while (i5 < c0771i5.size()) {
            h42.l(c0771i5.a(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void i(int i4, String str) {
        this.f6367a.q(i4, str);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void j(int i4, float f4) {
        this.f6367a.i(i4, Float.floatToRawIntBits(f4));
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void k(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof C0771i5)) {
            if (!z3) {
                while (i5 < list.size()) {
                    this.f6367a.u(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            H4 h4 = this.f6367a;
            h4.r(i4, 2);
            int iA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iA += H4.a(((Long) list.get(i6)).longValue());
            }
            h4.t(iA);
            while (i5 < list.size()) {
                h4.v(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        C0771i5 c0771i5 = (C0771i5) list;
        if (!z3) {
            while (i5 < c0771i5.size()) {
                this.f6367a.u(i4, c0771i5.a(i5));
                i5++;
            }
            return;
        }
        H4 h42 = this.f6367a;
        h42.r(i4, 2);
        int iA2 = 0;
        for (int i7 = 0; i7 < c0771i5.size(); i7++) {
            iA2 += H4.a(c0771i5.a(i7));
        }
        h42.t(iA2);
        while (i5 < c0771i5.size()) {
            h42.v(c0771i5.a(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void l(int i4, int i5) {
        this.f6367a.s(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void m(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof W4)) {
            if (!z3) {
                while (i5 < list.size()) {
                    this.f6367a.i(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            H4 h4 = this.f6367a;
            h4.r(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            h4.t(i6);
            while (i5 < list.size()) {
                h4.j(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        W4 w4 = (W4) list;
        if (!z3) {
            while (i5 < w4.size()) {
                this.f6367a.i(i4, w4.f(i5));
                i5++;
            }
            return;
        }
        H4 h42 = this.f6367a;
        h42.r(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < w4.size(); i9++) {
            w4.f(i9);
            i8 += 4;
        }
        h42.t(i8);
        while (i5 < w4.size()) {
            h42.j(w4.f(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void n(int i4, int i5) {
        this.f6367a.i(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void o(int i4, boolean z3) {
        this.f6367a.g(i4, z3);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void p(int i4, A4 a4) {
        this.f6367a.h(i4, a4);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void q(int i4, int i5) {
        this.f6367a.i(i4, i5);
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void r(int i4, long j4) {
        this.f6367a.u(i4, j4);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.measurement.V5
    public final void s(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f6367a.g(i4, ((Boolean) list.get(i5)).booleanValue());
                i5++;
            }
            return;
        }
        H4 h4 = this.f6367a;
        h4.r(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Boolean) list.get(i7)).getClass();
            i6++;
        }
        h4.t(i6);
        while (i5 < list.size()) {
            h4.f(((Boolean) list.get(i5)).booleanValue() ? (byte) 1 : (byte) 0);
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void t(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof C0771i5)) {
            if (!z3) {
                while (i5 < list.size()) {
                    H4 h4 = this.f6367a;
                    long jLongValue = ((Long) list.get(i5)).longValue();
                    h4.u(i4, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i5++;
                }
                return;
            }
            H4 h42 = this.f6367a;
            h42.r(i4, 2);
            int iA = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                long jLongValue2 = ((Long) list.get(i6)).longValue();
                iA += H4.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            h42.t(iA);
            while (i5 < list.size()) {
                long jLongValue3 = ((Long) list.get(i5)).longValue();
                h42.v((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i5++;
            }
            return;
        }
        C0771i5 c0771i5 = (C0771i5) list;
        if (!z3) {
            while (i5 < c0771i5.size()) {
                H4 h43 = this.f6367a;
                long jA = c0771i5.a(i5);
                h43.u(i4, (jA >> 63) ^ (jA + jA));
                i5++;
            }
            return;
        }
        H4 h44 = this.f6367a;
        h44.r(i4, 2);
        int iA2 = 0;
        for (int i7 = 0; i7 < c0771i5.size(); i7++) {
            long jA2 = c0771i5.a(i7);
            iA2 += H4.a((jA2 >> 63) ^ (jA2 + jA2));
        }
        h44.t(iA2);
        while (i5 < c0771i5.size()) {
            long jA3 = c0771i5.a(i5);
            h44.v((jA3 >> 63) ^ (jA3 + jA3));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void u(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f6367a.k(i4, Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
                i5++;
            }
            return;
        }
        H4 h4 = this.f6367a;
        h4.r(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Double) list.get(i7)).getClass();
            i6 += 8;
        }
        h4.t(i6);
        while (i5 < list.size()) {
            h4.l(Double.doubleToRawLongBits(((Double) list.get(i5)).doubleValue()));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void v(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof W4)) {
            if (!z3) {
                while (i5 < list.size()) {
                    this.f6367a.s(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            H4 h4 = this.f6367a;
            h4.r(i4, 2);
            int iZ = 0;
            for (int i6 = 0; i6 < list.size(); i6++) {
                iZ += H4.z(((Integer) list.get(i6)).intValue());
            }
            h4.t(iZ);
            while (i5 < list.size()) {
                h4.t(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        W4 w4 = (W4) list;
        if (!z3) {
            while (i5 < w4.size()) {
                this.f6367a.s(i4, w4.f(i5));
                i5++;
            }
            return;
        }
        H4 h42 = this.f6367a;
        h42.r(i4, 2);
        int iZ2 = 0;
        for (int i7 = 0; i7 < w4.size(); i7++) {
            iZ2 += H4.z(w4.f(i7));
        }
        h42.t(iZ2);
        while (i5 < w4.size()) {
            h42.t(w4.f(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void w(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof W4)) {
            if (!z3) {
                while (i5 < list.size()) {
                    this.f6367a.i(i4, ((Integer) list.get(i5)).intValue());
                    i5++;
                }
                return;
            }
            H4 h4 = this.f6367a;
            h4.r(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Integer) list.get(i7)).getClass();
                i6 += 4;
            }
            h4.t(i6);
            while (i5 < list.size()) {
                h4.j(((Integer) list.get(i5)).intValue());
                i5++;
            }
            return;
        }
        W4 w4 = (W4) list;
        if (!z3) {
            while (i5 < w4.size()) {
                this.f6367a.i(i4, w4.f(i5));
                i5++;
            }
            return;
        }
        H4 h42 = this.f6367a;
        h42.r(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < w4.size(); i9++) {
            w4.f(i9);
            i8 += 4;
        }
        h42.t(i8);
        while (i5 < w4.size()) {
            h42.j(w4.f(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void x(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!z3) {
            while (i5 < list.size()) {
                this.f6367a.i(i4, Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
                i5++;
            }
            return;
        }
        H4 h4 = this.f6367a;
        h4.r(i4, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < list.size(); i7++) {
            ((Float) list.get(i7)).getClass();
            i6 += 4;
        }
        h4.t(i6);
        while (i5 < list.size()) {
            h4.j(Float.floatToRawIntBits(((Float) list.get(i5)).floatValue()));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void y(int i4, List list, boolean z3) {
        int i5 = 0;
        if (!(list instanceof C0771i5)) {
            if (!z3) {
                while (i5 < list.size()) {
                    this.f6367a.k(i4, ((Long) list.get(i5)).longValue());
                    i5++;
                }
                return;
            }
            H4 h4 = this.f6367a;
            h4.r(i4, 2);
            int i6 = 0;
            for (int i7 = 0; i7 < list.size(); i7++) {
                ((Long) list.get(i7)).getClass();
                i6 += 8;
            }
            h4.t(i6);
            while (i5 < list.size()) {
                h4.l(((Long) list.get(i5)).longValue());
                i5++;
            }
            return;
        }
        C0771i5 c0771i5 = (C0771i5) list;
        if (!z3) {
            while (i5 < c0771i5.size()) {
                this.f6367a.k(i4, c0771i5.a(i5));
                i5++;
            }
            return;
        }
        H4 h42 = this.f6367a;
        h42.r(i4, 2);
        int i8 = 0;
        for (int i9 = 0; i9 < c0771i5.size(); i9++) {
            c0771i5.a(i9);
            i8 += 8;
        }
        h42.t(i8);
        while (i5 < c0771i5.size()) {
            h42.l(c0771i5.a(i5));
            i5++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.V5
    public final void z(int i4, int i5) {
        this.f6367a.s(i4, (i5 >> 31) ^ (i5 + i5));
    }
}
