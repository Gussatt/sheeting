package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static r a(String str, C0738f c0738f, U1 u12, List list) {
        byte b4;
        double dA;
        String strG;
        double d4;
        double dT;
        C0738f c0738f2;
        C0738f c0738f3;
        switch (str.hashCode()) {
            case -1776922004:
                b4 = str.equals("toString") ? (byte) 18 : (byte) -1;
                break;
            case -1354795244:
                b4 = str.equals("concat") ? (byte) 0 : (byte) -1;
                break;
            case -1274492040:
                b4 = str.equals("filter") ? (byte) 2 : (byte) -1;
                break;
            case -934873754:
                b4 = str.equals("reduce") ? (byte) 10 : (byte) -1;
                break;
            case -895859076:
                b4 = str.equals("splice") ? (byte) 17 : (byte) -1;
                break;
            case -678635926:
                b4 = str.equals("forEach") ? (byte) 3 : (byte) -1;
                break;
            case -467511597:
                b4 = str.equals("lastIndexOf") ? (byte) 6 : (byte) -1;
                break;
            case -277637751:
                b4 = str.equals("unshift") ? (byte) 19 : (byte) -1;
                break;
            case 107868:
                b4 = str.equals("map") ? (byte) 7 : (byte) -1;
                break;
            case 111185:
                b4 = str.equals("pop") ? (byte) 8 : (byte) -1;
                break;
            case 3267882:
                b4 = str.equals("join") ? (byte) 5 : (byte) -1;
                break;
            case 3452698:
                b4 = str.equals("push") ? (byte) 9 : (byte) -1;
                break;
            case 3536116:
                b4 = str.equals("some") ? (byte) 15 : (byte) -1;
                break;
            case 3536286:
                b4 = str.equals("sort") ? (byte) 16 : (byte) -1;
                break;
            case 96891675:
                b4 = str.equals("every") ? (byte) 1 : (byte) -1;
                break;
            case 109407362:
                b4 = str.equals("shift") ? (byte) 13 : (byte) -1;
                break;
            case 109526418:
                b4 = str.equals("slice") ? (byte) 14 : (byte) -1;
                break;
            case 965561430:
                b4 = str.equals("reduceRight") ? (byte) 11 : (byte) -1;
                break;
            case 1099846370:
                b4 = str.equals("reverse") ? (byte) 12 : (byte) -1;
                break;
            case 1943291465:
                b4 = str.equals("indexOf") ? (byte) 4 : (byte) -1;
                break;
            default:
                b4 = -1;
                break;
        }
        AbstractC0783k abstractC0783k = null;
        switch (b4) {
            case 0:
                C0738f c0738f4 = (C0738f) c0738f.d();
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        r rVarB = u12.b((r) it.next());
                        if (rVarB instanceof C0756h) {
                            throw new IllegalStateException("Failed evaluation of arguments");
                        }
                        int iT = c0738f4.t();
                        if (rVarB instanceof C0738f) {
                            C0738f c0738f5 = (C0738f) rVarB;
                            Iterator itW = c0738f5.w();
                            while (itW.hasNext()) {
                                Integer num = (Integer) itW.next();
                                c0738f4.B(num.intValue() + iT, c0738f5.u(num.intValue()));
                            }
                        } else {
                            c0738f4.B(iT, rVarB);
                        }
                    }
                }
                return c0738f4;
            case 1:
                AbstractC0873v2.h("every", 1, list);
                r rVarB2 = u12.b((r) list.get(0));
                if (!(rVarB2 instanceof C0831q)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c0738f.t() != 0 && b(c0738f, u12, (C0831q) rVarB2, Boolean.FALSE, Boolean.TRUE).t() != c0738f.t()) {
                    return r.f6938h;
                }
                return r.f6937g;
            case 2:
                AbstractC0873v2.h("filter", 1, list);
                r rVarB3 = u12.b((r) list.get(0));
                if (!(rVarB3 instanceof C0831q)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c0738f.s() == 0) {
                    return new C0738f();
                }
                C0738f c0738f6 = (C0738f) c0738f.d();
                C0738f c0738fB = b(c0738f, u12, (C0831q) rVarB3, null, Boolean.TRUE);
                C0738f c0738f7 = new C0738f();
                Iterator itW2 = c0738fB.w();
                while (itW2.hasNext()) {
                    c0738f7.B(c0738f7.t(), c0738f6.u(((Integer) itW2.next()).intValue()));
                }
                return c0738f7;
            case 3:
                AbstractC0873v2.h("forEach", 1, list);
                r rVarB4 = u12.b((r) list.get(0));
                if (!(rVarB4 instanceof C0831q)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c0738f.s() == 0) {
                    return r.f6932b;
                }
                b(c0738f, u12, (C0831q) rVarB4, null, null);
                return r.f6932b;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                AbstractC0873v2.j("indexOf", 2, list);
                r rVarB5 = r.f6932b;
                if (!list.isEmpty()) {
                    rVarB5 = u12.b((r) list.get(0));
                }
                if (list.size() > 1) {
                    dA = AbstractC0873v2.a(u12.b((r) list.get(1)).f().doubleValue());
                    if (dA >= c0738f.t()) {
                        return new C0774j(Double.valueOf(-1.0d));
                    }
                    if (dA < 0.0d) {
                        dA += (double) c0738f.t();
                    }
                } else {
                    dA = 0.0d;
                }
                Iterator itW3 = c0738f.w();
                while (itW3.hasNext()) {
                    int iIntValue = ((Integer) itW3.next()).intValue();
                    double d5 = iIntValue;
                    if (d5 >= dA && AbstractC0873v2.l(c0738f.u(iIntValue), rVarB5)) {
                        return new C0774j(Double.valueOf(d5));
                    }
                }
                return new C0774j(Double.valueOf(-1.0d));
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                AbstractC0873v2.j("join", 1, list);
                if (c0738f.t() == 0) {
                    return r.f6939i;
                }
                if (list.isEmpty()) {
                    strG = ",";
                } else {
                    r rVarB6 = u12.b((r) list.get(0));
                    strG = ((rVarB6 instanceof C0823p) || (rVarB6 instanceof C0878w)) ? "" : rVarB6.g();
                }
                return new C0870v(c0738f.v(strG));
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                AbstractC0873v2.j("lastIndexOf", 2, list);
                r rVarB7 = r.f6932b;
                if (!list.isEmpty()) {
                    rVarB7 = u12.b((r) list.get(0));
                }
                int iT2 = c0738f.t() - 1;
                if (list.size() > 1) {
                    r rVarB8 = u12.b((r) list.get(1));
                    dT = Double.isNaN(rVarB8.f().doubleValue()) ? c0738f.t() - 1 : AbstractC0873v2.a(rVarB8.f().doubleValue());
                    d4 = 0.0d;
                    if (dT < 0.0d) {
                        dT += (double) c0738f.t();
                    }
                } else {
                    d4 = 0.0d;
                    dT = iT2;
                }
                if (dT < d4) {
                    return new C0774j(Double.valueOf(-1.0d));
                }
                for (int iMin = (int) Math.min(c0738f.t(), dT); iMin >= 0; iMin--) {
                    if (c0738f.C(iMin) && AbstractC0873v2.l(c0738f.u(iMin), rVarB7)) {
                        return new C0774j(Double.valueOf(iMin));
                    }
                }
                return new C0774j(Double.valueOf(-1.0d));
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                AbstractC0873v2.h("map", 1, list);
                r rVarB9 = u12.b((r) list.get(0));
                if (rVarB9 instanceof C0831q) {
                    return c0738f.t() == 0 ? new C0738f() : b(c0738f, u12, (C0831q) rVarB9, null, null);
                }
                throw new IllegalArgumentException("Callback should be a method");
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                AbstractC0873v2.h("pop", 0, list);
                int iT3 = c0738f.t();
                if (iT3 == 0) {
                    return r.f6932b;
                }
                int i4 = iT3 - 1;
                r rVarU = c0738f.u(i4);
                c0738f.A(i4);
                return rVarU;
            case 9:
                if (!list.isEmpty()) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        c0738f.B(c0738f.t(), u12.b((r) it2.next()));
                    }
                }
                return new C0774j(Double.valueOf(c0738f.t()));
            case 10:
                return c(c0738f, u12, list, true);
            case 11:
                return c(c0738f, u12, list, false);
            case 12:
                c0738f2 = c0738f;
                AbstractC0873v2.h("reverse", 0, list);
                int iT4 = c0738f2.t();
                if (iT4 != 0) {
                    for (int i5 = 0; i5 < iT4 / 2; i5++) {
                        if (c0738f2.C(i5)) {
                            r rVarU2 = c0738f2.u(i5);
                            c0738f2.B(i5, null);
                            int i6 = (iT4 - 1) - i5;
                            if (c0738f2.C(i6)) {
                                c0738f2.B(i5, c0738f2.u(i6));
                            }
                            c0738f2.B(i6, rVarU2);
                        }
                    }
                }
                return c0738f2;
            case 13:
                AbstractC0873v2.h("shift", 0, list);
                if (c0738f.t() == 0) {
                    return r.f6932b;
                }
                r rVarU3 = c0738f.u(0);
                c0738f.A(0);
                return rVarU3;
            case 14:
                AbstractC0873v2.j("slice", 2, list);
                if (list.isEmpty()) {
                    return c0738f.d();
                }
                double dT2 = c0738f.t();
                double dA2 = AbstractC0873v2.a(u12.b((r) list.get(0)).f().doubleValue());
                double dMax = dA2 < 0.0d ? Math.max(dA2 + dT2, 0.0d) : Math.min(dA2, dT2);
                if (list.size() == 2) {
                    double dA3 = AbstractC0873v2.a(u12.b((r) list.get(1)).f().doubleValue());
                    dT2 = dA3 < 0.0d ? Math.max(dT2 + dA3, 0.0d) : Math.min(dT2, dA3);
                }
                C0738f c0738f8 = new C0738f();
                for (int i7 = (int) dMax; i7 < dT2; i7++) {
                    c0738f8.B(c0738f8.t(), c0738f.u(i7));
                }
                return c0738f8;
            case 15:
                AbstractC0873v2.h("some", 1, list);
                r rVarB10 = u12.b((r) list.get(0));
                if (!(rVarB10 instanceof AbstractC0783k)) {
                    throw new IllegalArgumentException("Callback should be a method");
                }
                if (c0738f.t() == 0) {
                    return r.f6938h;
                }
                AbstractC0783k abstractC0783k2 = (AbstractC0783k) rVarB10;
                Iterator itW4 = c0738f.w();
                while (itW4.hasNext()) {
                    int iIntValue2 = ((Integer) itW4.next()).intValue();
                    if (c0738f.C(iIntValue2) && abstractC0783k2.a(u12, Arrays.asList(c0738f.u(iIntValue2), new C0774j(Double.valueOf(iIntValue2)), c0738f)).i().booleanValue()) {
                        return r.f6937g;
                    }
                }
                return r.f6938h;
            case 16:
                c0738f2 = c0738f;
                AbstractC0873v2.j("sort", 1, list);
                if (c0738f2.t() >= 2) {
                    List listX = c0738f2.x();
                    if (!list.isEmpty()) {
                        r rVarB11 = u12.b((r) list.get(0));
                        if (!(rVarB11 instanceof AbstractC0783k)) {
                            throw new IllegalArgumentException("Comparator should be a method");
                        }
                        abstractC0783k = (AbstractC0783k) rVarB11;
                    }
                    Collections.sort(listX, new D(abstractC0783k, u12));
                    c0738f2.y();
                    Iterator it3 = listX.iterator();
                    int i8 = 0;
                    while (it3.hasNext()) {
                        c0738f2.B(i8, (r) it3.next());
                        i8++;
                    }
                }
                return c0738f2;
            case 17:
                if (list.isEmpty()) {
                    return new C0738f();
                }
                int iA = (int) AbstractC0873v2.a(u12.b((r) list.get(0)).f().doubleValue());
                if (iA < 0) {
                    iA = Math.max(0, iA + c0738f.t());
                } else if (iA > c0738f.t()) {
                    iA = c0738f.t();
                }
                int iT5 = c0738f.t();
                C0738f c0738f9 = new C0738f();
                if (list.size() > 1) {
                    int iMax = Math.max(0, (int) AbstractC0873v2.a(u12.b((r) list.get(1)).f().doubleValue()));
                    if (iMax > 0) {
                        for (int i9 = iA; i9 < Math.min(iT5, iA + iMax); i9++) {
                            c0738f9.B(c0738f9.t(), c0738f.u(iA));
                            c0738f.A(iA);
                        }
                    }
                    if (list.size() > 2) {
                        for (int i10 = 2; i10 < list.size(); i10++) {
                            r rVarB12 = u12.b((r) list.get(i10));
                            if (rVarB12 instanceof C0756h) {
                                throw new IllegalArgumentException("Failed to parse elements to add");
                            }
                            c0738f.z((iA + i10) - 2, rVarB12);
                        }
                    }
                } else {
                    while (iA < iT5) {
                        c0738f9.B(c0738f9.t(), c0738f.u(iA));
                        c0738f.B(iA, null);
                        iA++;
                    }
                }
                return c0738f9;
            case 18:
                AbstractC0873v2.h("toString", 0, list);
                return new C0870v(c0738f.v(","));
            case 19:
                if (list.isEmpty()) {
                    c0738f3 = c0738f;
                } else {
                    C0738f c0738f10 = new C0738f();
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        r rVarB13 = u12.b((r) it4.next());
                        if (rVarB13 instanceof C0756h) {
                            throw new IllegalStateException("Argument evaluation failed");
                        }
                        c0738f10.B(c0738f10.t(), rVarB13);
                    }
                    int iT6 = c0738f10.t();
                    Iterator itW5 = c0738f.w();
                    while (itW5.hasNext()) {
                        Integer num2 = (Integer) itW5.next();
                        c0738f10.B(num2.intValue() + iT6, c0738f.u(num2.intValue()));
                    }
                    c0738f3 = c0738f;
                    c0738f3.y();
                    Iterator itW6 = c0738f10.w();
                    while (itW6.hasNext()) {
                        Integer num3 = (Integer) itW6.next();
                        c0738f3.B(num3.intValue(), c0738f10.u(num3.intValue()));
                    }
                }
                return new C0774j(Double.valueOf(c0738f3.t()));
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public static C0738f b(C0738f c0738f, U1 u12, AbstractC0783k abstractC0783k, Boolean bool, Boolean bool2) {
        C0738f c0738f2 = new C0738f();
        Iterator itW = c0738f.w();
        while (itW.hasNext()) {
            int iIntValue = ((Integer) itW.next()).intValue();
            if (c0738f.C(iIntValue)) {
                r rVarA = abstractC0783k.a(u12, Arrays.asList(c0738f.u(iIntValue), new C0774j(Double.valueOf(iIntValue)), c0738f));
                if (rVarA.i().equals(bool)) {
                    break;
                }
                if (bool2 == null || rVarA.i().equals(bool2)) {
                    c0738f2.B(iIntValue, rVarA);
                }
            }
        }
        return c0738f2;
    }

    public static r c(C0738f c0738f, U1 u12, List list, boolean z3) {
        r rVarA;
        AbstractC0873v2.i("reduce", 1, list);
        AbstractC0873v2.j("reduce", 2, list);
        r rVarB = u12.b((r) list.get(0));
        if (!(rVarB instanceof AbstractC0783k)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (list.size() == 2) {
            rVarA = u12.b((r) list.get(1));
            if (rVarA instanceof C0756h) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (c0738f.t() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            rVarA = null;
        }
        AbstractC0783k abstractC0783k = (AbstractC0783k) rVarB;
        int iT = c0738f.t();
        int i4 = z3 ? 0 : iT - 1;
        int i5 = z3 ? iT - 1 : 0;
        int i6 = true == z3 ? 1 : -1;
        if (rVarA == null) {
            rVarA = c0738f.u(i4);
            i4 += i6;
        }
        while ((i5 - i4) * i6 >= 0) {
            if (c0738f.C(i4)) {
                rVarA = abstractC0783k.a(u12, Arrays.asList(rVarA, c0738f.u(i4), new C0774j(Double.valueOf(i4)), c0738f));
                if (rVarA instanceof C0756h) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i4 += i6;
            } else {
                i4 += i6;
            }
        }
        return rVarA;
    }
}
