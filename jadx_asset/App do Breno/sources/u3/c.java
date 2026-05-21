package u3;

import L2.r;
import L2.u;
import X2.l;
import java.io.EOFException;
import java.util.ArrayList;
import t3.C1546b;
import t3.C1549e;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1549e f11479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1549e f11480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1549e f11481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1549e f11482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1549e f11483e;

    static {
        C1549e.a aVar = C1549e.f11405p;
        f11479a = aVar.a("/");
        f11480b = aVar.a("\\");
        f11481c = aVar.a("/\\");
        f11482d = aVar.a(".");
        f11483e = aVar.a("..");
    }

    public static final J j(J j4, J j5, boolean z3) {
        l.e(j4, "<this>");
        l.e(j5, "child");
        if (j5.i() || j5.s() != null) {
            return j5;
        }
        C1549e c1549eM = m(j4);
        if (c1549eM == null && (c1549eM = m(j5)) == null) {
            c1549eM = s(J.f11360o);
        }
        C1546b c1546b = new C1546b();
        c1546b.U(j4.f());
        if (c1546b.O() > 0) {
            c1546b.U(c1549eM);
        }
        c1546b.U(j5.f());
        return q(c1546b, z3);
    }

    public static final J k(String str, boolean z3) {
        l.e(str, "<this>");
        return q(new C1546b().Y(str), z3);
    }

    public static final int l(J j4) {
        int iT = C1549e.t(j4.f(), f11479a, 0, 2, null);
        return iT != -1 ? iT : C1549e.t(j4.f(), f11480b, 0, 2, null);
    }

    public static final C1549e m(J j4) {
        C1549e c1549eF = j4.f();
        C1549e c1549e = f11479a;
        if (C1549e.o(c1549eF, c1549e, 0, 2, null) != -1) {
            return c1549e;
        }
        C1549e c1549eF2 = j4.f();
        C1549e c1549e2 = f11480b;
        if (C1549e.o(c1549eF2, c1549e2, 0, 2, null) != -1) {
            return c1549e2;
        }
        return null;
    }

    public static final boolean n(J j4) {
        return j4.f().f(f11483e) && (j4.f().y() == 2 || j4.f().u(j4.f().y() + (-3), f11479a, 0, 1) || j4.f().u(j4.f().y() + (-3), f11480b, 0, 1));
    }

    public static final int o(J j4) {
        if (j4.f().y() == 0) {
            return -1;
        }
        if (j4.f().g(0) == 47) {
            return 1;
        }
        if (j4.f().g(0) == 92) {
            if (j4.f().y() <= 2 || j4.f().g(1) != 92) {
                return 1;
            }
            int iM = j4.f().m(f11480b, 2);
            return iM == -1 ? j4.f().y() : iM;
        }
        if (j4.f().y() > 2 && j4.f().g(1) == 58 && j4.f().g(2) == 92) {
            char cG = (char) j4.f().g(0);
            if ('a' <= cG && cG < '{') {
                return 3;
            }
            if ('A' <= cG && cG < '[') {
                return 3;
            }
        }
        return -1;
    }

    public static final boolean p(C1546b c1546b, C1549e c1549e) {
        if (!l.a(c1549e, f11480b) || c1546b.O() < 2 || c1546b.l(1L) != 58) {
            return false;
        }
        char cL = (char) c1546b.l(0L);
        if ('a' > cL || cL >= '{') {
            return 'A' <= cL && cL < '[';
        }
        return true;
    }

    public static final J q(C1546b c1546b, boolean z3) throws EOFException {
        C1549e c1549e;
        C1549e c1549eC;
        l.e(c1546b, "<this>");
        C1546b c1546b2 = new C1546b();
        C1549e c1549eR = null;
        int i4 = 0;
        while (true) {
            if (!c1546b.u(0L, f11479a)) {
                c1549e = f11480b;
                if (!c1546b.u(0L, c1549e)) {
                    break;
                }
            }
            byte b4 = c1546b.readByte();
            if (c1549eR == null) {
                c1549eR = r(b4);
            }
            i4++;
        }
        boolean z4 = i4 >= 2 && l.a(c1549eR, c1549e);
        if (z4) {
            l.b(c1549eR);
            c1546b2.U(c1549eR);
            c1546b2.U(c1549eR);
        } else if (i4 > 0) {
            l.b(c1549eR);
            c1546b2.U(c1549eR);
        } else {
            long jQ = c1546b.q(f11481c);
            if (c1549eR == null) {
                c1549eR = jQ == -1 ? s(J.f11360o) : r(c1546b.l(jQ));
            }
            if (p(c1546b, c1549eR)) {
                if (jQ == 2) {
                    c1546b2.m(c1546b, 3L);
                } else {
                    c1546b2.m(c1546b, 2L);
                }
            }
        }
        boolean z5 = c1546b2.O() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c1546b.t()) {
            long jQ2 = c1546b.q(f11481c);
            if (jQ2 == -1) {
                c1549eC = c1546b.z();
            } else {
                c1549eC = c1546b.C(jQ2);
                c1546b.readByte();
            }
            C1549e c1549e2 = f11483e;
            if (l.a(c1549eC, c1549e2)) {
                if (!z5 || !arrayList.isEmpty()) {
                    if (!z3 || (!z5 && (arrayList.isEmpty() || l.a(u.A(arrayList), c1549e2)))) {
                        arrayList.add(c1549eC);
                    } else if (!z4 || arrayList.size() != 1) {
                        r.q(arrayList);
                    }
                }
            } else if (!l.a(c1549eC, f11482d) && !l.a(c1549eC, C1549e.f11406q)) {
                arrayList.add(c1549eC);
            }
        }
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                c1546b2.U(c1549eR);
            }
            c1546b2.U((C1549e) arrayList.get(i5));
        }
        if (c1546b2.O() == 0) {
            c1546b2.U(f11482d);
        }
        return new J(c1546b2.z());
    }

    public static final C1549e r(byte b4) {
        if (b4 == 47) {
            return f11479a;
        }
        if (b4 == 92) {
            return f11480b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b4));
    }

    public static final C1549e s(String str) {
        if (l.a(str, "/")) {
            return f11479a;
        }
        if (l.a(str, "\\")) {
            return f11480b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
