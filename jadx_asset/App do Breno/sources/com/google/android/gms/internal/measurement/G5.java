package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class G5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final K5 f6351a;

    static {
        B5 b5 = B5.f6298c;
        f6351a = new M5();
    }

    public static void A(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.x(i4, list, z3);
    }

    public static void B(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.A(i4, list, z3);
    }

    public static void C(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.k(i4, list, z3);
    }

    public static void D(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.m(i4, list, z3);
    }

    public static void E(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.y(i4, list, z3);
    }

    public static void a(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.a(i4, list, z3);
    }

    public static void b(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.t(i4, list, z3);
    }

    public static void c(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.v(i4, list, z3);
    }

    public static void d(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.g(i4, list, z3);
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof W4)) {
            int iA = 0;
            while (i4 < size) {
                iA += H4.a(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iA;
        }
        W4 w4 = (W4) list;
        int iA2 = 0;
        while (i4 < size) {
            iA2 += H4.a(w4.f(i4));
            i4++;
        }
        return iA2;
    }

    public static int g(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (H4.z(i4 << 3) + 4);
    }

    public static int h(List list) {
        return list.size() * 4;
    }

    public static int i(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (H4.z(i4 << 3) + 8);
    }

    public static int j(List list) {
        return list.size() * 8;
    }

    public static int k(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof W4)) {
            int iA = 0;
            while (i4 < size) {
                iA += H4.a(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iA;
        }
        W4 w4 = (W4) list;
        int iA2 = 0;
        while (i4 < size) {
            iA2 += H4.a(w4.f(i4));
            i4++;
        }
        return iA2;
    }

    public static int l(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0771i5)) {
            int iA = 0;
            while (i4 < size) {
                iA += H4.a(((Long) list.get(i4)).longValue());
                i4++;
            }
            return iA;
        }
        C0771i5 c0771i5 = (C0771i5) list;
        int iA2 = 0;
        while (i4 < size) {
            iA2 += H4.a(c0771i5.a(i4));
            i4++;
        }
        return iA2;
    }

    public static int m(int i4, Object obj, E5 e5) {
        return H4.z(i4 << 3) + H4.x((InterfaceC0860t5) obj, e5);
    }

    public static int n(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof W4)) {
            int iZ = 0;
            while (i4 < size) {
                int iIntValue = ((Integer) list.get(i4)).intValue();
                iZ += H4.z((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i4++;
            }
            return iZ;
        }
        W4 w4 = (W4) list;
        int iZ2 = 0;
        while (i4 < size) {
            int iF = w4.f(i4);
            iZ2 += H4.z((iF >> 31) ^ (iF + iF));
            i4++;
        }
        return iZ2;
    }

    public static int o(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0771i5)) {
            int iA = 0;
            while (i4 < size) {
                long jLongValue = ((Long) list.get(i4)).longValue();
                iA += H4.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i4++;
            }
            return iA;
        }
        C0771i5 c0771i5 = (C0771i5) list;
        int iA2 = 0;
        while (i4 < size) {
            long jA = c0771i5.a(i4);
            iA2 += H4.a((jA >> 63) ^ (jA + jA));
            i4++;
        }
        return iA2;
    }

    public static int p(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof W4)) {
            int iZ = 0;
            while (i4 < size) {
                iZ += H4.z(((Integer) list.get(i4)).intValue());
                i4++;
            }
            return iZ;
        }
        W4 w4 = (W4) list;
        int iZ2 = 0;
        while (i4 < size) {
            iZ2 += H4.z(w4.f(i4));
            i4++;
        }
        return iZ2;
    }

    public static int q(List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0771i5)) {
            int iA = 0;
            while (i4 < size) {
                iA += H4.a(((Long) list.get(i4)).longValue());
                i4++;
            }
            return iA;
        }
        C0771i5 c0771i5 = (C0771i5) list;
        int iA2 = 0;
        while (i4 < size) {
            iA2 += H4.a(c0771i5.a(i4));
            i4++;
        }
        return iA2;
    }

    public static K5 r() {
        return f6351a;
    }

    public static Object s(Object obj, int i4, int i5, Object obj2, K5 k5) {
        Object obj3 = obj2;
        if (obj2 == null) {
            V4 v4 = (V4) obj;
            L5 l5 = v4.zzc;
            obj3 = l5;
            if (l5 == L5.c()) {
                L5 l5F = L5.f();
                v4.zzc = l5F;
                obj3 = l5F;
            }
        }
        ((L5) obj3).j(i4 << 3, Long.valueOf(i5));
        return obj3;
    }

    public static void t(M4 m4, Object obj, Object obj2) {
        i.d.a(obj2);
        throw null;
    }

    public static void u(K5 k5, Object obj, Object obj2) {
        V4 v4 = (V4) obj;
        L5 l5E = v4.zzc;
        L5 l5 = ((V4) obj2).zzc;
        if (!L5.c().equals(l5)) {
            if (L5.c().equals(l5E)) {
                l5E = L5.e(l5E, l5);
            } else {
                l5E.d(l5);
            }
        }
        v4.zzc = l5E;
    }

    public static void v(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.s(i4, list, z3);
    }

    public static void w(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.u(i4, list, z3);
    }

    public static void x(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.G(i4, list, z3);
    }

    public static void y(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.w(i4, list, z3);
    }

    public static void z(int i4, List list, V5 v5, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        v5.h(i4, list, z3);
    }
}
