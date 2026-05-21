package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0598u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f4681a = A();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f4682b = B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f0 f4683c = new h0();

    public static Class A() {
        if (U.f4671d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static f0 B() {
        try {
            Class clsC = C();
            if (clsC == null) {
                return null;
            }
            return (f0) clsC.getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        if (U.f4671d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC0592n abstractC0592n, Object obj, Object obj2) {
        C0595q c0595qC = abstractC0592n.c(obj2);
        if (c0595qC.j()) {
            return;
        }
        abstractC0592n.d(obj).p(c0595qC);
    }

    public static void E(E e4, Object obj, Object obj2, long j4) {
        i0.O(obj, j4, e4.a(i0.z(obj, j4), i0.z(obj2, j4)));
    }

    public static void F(f0 f0Var, Object obj, Object obj2) {
        f0Var.p(obj, f0Var.k(f0Var.g(obj), f0Var.g(obj2)));
    }

    public static void G(Class cls) {
        Class cls2;
        if (!AbstractC0597t.class.isAssignableFrom(cls) && !U.f4671d && (cls2 = f4681a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean H(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object I(Object obj, int i4, int i5, Object obj2, f0 f0Var) {
        if (obj2 == null) {
            obj2 = f0Var.f(obj);
        }
        f0Var.e(obj2, i4, i5);
        return obj2;
    }

    public static f0 J() {
        return f4682b;
    }

    public static f0 K() {
        return f4683c;
    }

    public static void L(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.t(i4, list, z3);
    }

    public static void M(int i4, List list, l0 l0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.N(i4, list);
    }

    public static void N(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.K(i4, list, z3);
    }

    public static void O(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.J(i4, list, z3);
    }

    public static void P(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.q(i4, list, z3);
    }

    public static void Q(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.j(i4, list, z3);
    }

    public static void R(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.b(i4, list, z3);
    }

    public static void S(int i4, List list, l0 l0Var, Y y3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.C(i4, list, y3);
    }

    public static void T(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.a(i4, list, z3);
    }

    public static void U(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.I(i4, list, z3);
    }

    public static void V(int i4, List list, l0 l0Var, Y y3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.y(i4, list, y3);
    }

    public static void W(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.k(i4, list, z3);
    }

    public static void X(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.p(i4, list, z3);
    }

    public static void Y(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.F(i4, list, z3);
    }

    public static void Z(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.v(i4, list, z3);
    }

    public static int a(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(size) : size * AbstractC0587i.c(i4, true);
    }

    public static void a0(int i4, List list, l0 l0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.B(i4, list);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.u(i4, list, z3);
    }

    public static int c(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = size * AbstractC0587i.O(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            iO += AbstractC0587i.g((AbstractC0584f) list.get(i5));
        }
        return iO;
    }

    public static void c0(int i4, List list, l0 l0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l0Var.r(i4, list, z3);
    }

    public static int d(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(iE) : iE + (size * AbstractC0587i.O(i4));
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iK = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iK += AbstractC0587i.k(((Integer) list.get(i4)).intValue());
        }
        return iK;
    }

    public static int f(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(size * 4) : size * AbstractC0587i.l(i4, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(size * 8) : size * AbstractC0587i.n(i4, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i4, List list, Y y3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = 0;
        for (int i5 = 0; i5 < size; i5++) {
            iR += AbstractC0587i.r(i4, (J) list.get(i5), y3);
        }
        return iR;
    }

    public static int k(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(iL) : iL + (size * AbstractC0587i.O(i4));
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iV += AbstractC0587i.v(((Integer) list.get(i4)).intValue());
        }
        return iV;
    }

    public static int m(int i4, List list, boolean z3) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(iN) : iN + (list.size() * AbstractC0587i.O(i4));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iX += AbstractC0587i.x(((Long) list.get(i4)).longValue());
        }
        return iX;
    }

    public static int o(int i4, Object obj, Y y3) {
        return AbstractC0587i.z(i4, (J) obj, y3);
    }

    public static int p(int i4, List list, Y y3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC0587i.O(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            iO += AbstractC0587i.B((J) list.get(i5), y3);
        }
        return iO;
    }

    public static int q(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(iR) : iR + (size * AbstractC0587i.O(i4));
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iJ = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iJ += AbstractC0587i.J(((Integer) list.get(i4)).intValue());
        }
        return iJ;
    }

    public static int s(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(iT) : iT + (size * AbstractC0587i.O(i4));
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iL += AbstractC0587i.L(((Long) list.get(i4)).longValue());
        }
        return iL;
    }

    public static int u(int i4, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iO = AbstractC0587i.O(i4) * size;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = list.get(i5);
            iO += obj instanceof AbstractC0584f ? AbstractC0587i.g((AbstractC0584f) obj) : AbstractC0587i.N((String) obj);
        }
        return iO;
    }

    public static int v(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(iW) : iW + (size * AbstractC0587i.O(i4));
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iQ = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iQ += AbstractC0587i.Q(((Integer) list.get(i4)).intValue());
        }
        return iQ;
    }

    public static int x(int i4, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z3 ? AbstractC0587i.O(i4) + AbstractC0587i.y(iY) : iY + (size * AbstractC0587i.O(i4));
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i4 = 0; i4 < size; i4++) {
            iS += AbstractC0587i.S(((Long) list.get(i4)).longValue());
        }
        return iS;
    }

    public static Object z(Object obj, int i4, List list, AbstractC0598u.a aVar, Object obj2, f0 f0Var) {
        if (aVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!aVar.a(iIntValue)) {
                    obj2 = I(obj, i4, iIntValue, obj2, f0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Integer num = (Integer) list.get(i6);
            int iIntValue2 = num.intValue();
            if (aVar.a(iIntValue2)) {
                if (i6 != i5) {
                    list.set(i5, num);
                }
                i5++;
            } else {
                obj2 = I(obj, i4, iIntValue2, obj2, f0Var);
            }
        }
        if (i5 != size) {
            list.subList(i5, size).clear();
        }
        return obj2;
    }
}
