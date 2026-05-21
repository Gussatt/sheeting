package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0873v2 {
    public static double a(double d4) {
        if (Double.isNaN(d4)) {
            return 0.0d;
        }
        if (Double.isInfinite(d4) || d4 == 0.0d || d4 == 0.0d) {
            return d4;
        }
        return ((double) (d4 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d4));
    }

    public static int b(double d4) {
        if (Double.isNaN(d4) || Double.isInfinite(d4) || d4 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d4 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d4))) % 4.294967296E9d);
    }

    public static int c(U1 u12) {
        int iB = b(u12.d("runtime.counter").f().doubleValue() + 1.0d);
        if (iB > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        u12.g("runtime.counter", new C0774j(Double.valueOf(iB)));
        return iB;
    }

    public static long d(double d4) {
        return ((long) b(d4)) & 4294967295L;
    }

    public static O e(String str) {
        O oD = null;
        if (str != null && !str.isEmpty()) {
            oD = O.d(Integer.parseInt(str));
        }
        if (oD != null) {
            return oD;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object f(r rVar) {
        if (r.f6933c.equals(rVar)) {
            return null;
        }
        if (r.f6932b.equals(rVar)) {
            return "";
        }
        if (rVar instanceof C0815o) {
            return g((C0815o) rVar);
        }
        if (!(rVar instanceof C0738f)) {
            return !rVar.f().isNaN() ? rVar.f() : rVar.g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C0738f) rVar).iterator();
        while (it.hasNext()) {
            Object objF = f((r) it.next());
            if (objF != null) {
                arrayList.add(objF);
            }
        }
        return arrayList;
    }

    public static Map g(C0815o c0815o) {
        HashMap map = new HashMap();
        for (String str : c0815o.a()) {
            Object objF = f(c0815o.o(str));
            if (objF != null) {
                map.put(str, objF);
            }
        }
        return map;
    }

    public static void h(String str, int i4, List list) {
        if (list.size() != i4) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i4), Integer.valueOf(list.size())));
        }
    }

    public static void i(String str, int i4, List list) {
        if (list.size() < i4) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i4), Integer.valueOf(list.size())));
        }
    }

    public static void j(String str, int i4, List list) {
        if (list.size() > i4) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i4), Integer.valueOf(list.size())));
        }
    }

    public static boolean k(r rVar) {
        if (rVar == null) {
            return false;
        }
        Double dF = rVar.f();
        return !dF.isNaN() && dF.doubleValue() >= 0.0d && dF.equals(Double.valueOf(Math.floor(dF.doubleValue())));
    }

    public static boolean l(r rVar, r rVar2) {
        if (!rVar.getClass().equals(rVar2.getClass())) {
            return false;
        }
        if ((rVar instanceof C0878w) || (rVar instanceof C0823p)) {
            return true;
        }
        if (!(rVar instanceof C0774j)) {
            return rVar instanceof C0870v ? rVar.g().equals(rVar2.g()) : rVar instanceof C0747g ? rVar.i().equals(rVar2.i()) : rVar == rVar2;
        }
        if (Double.isNaN(rVar.f().doubleValue()) || Double.isNaN(rVar2.f().doubleValue())) {
            return false;
        }
        return rVar.f().equals(rVar2.f());
    }
}
