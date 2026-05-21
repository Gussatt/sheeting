package n3;

import K2.j;
import K2.k;
import N2.e;
import N2.i;
import O2.c;
import P2.h;
import W2.p;
import X2.C;
import h3.C1035z;
import h3.y0;
import m3.B;
import m3.J;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final void a(p pVar, Object obj, e eVar) {
        e eVarA = h.a(eVar);
        try {
            i iVarB = eVar.b();
            Object objC = J.c(iVarB, null);
            try {
                Object objJ = ((p) C.b(pVar, 2)).j(obj, eVarA);
                if (objJ != c.c()) {
                    eVarA.p(j.b(objJ));
                }
            } finally {
                J.a(iVarB, objC);
            }
        } catch (Throwable th) {
            j.a aVar = j.f2509n;
            eVarA.p(j.b(k.a(th)));
        }
    }

    public static final Object b(B b4, Object obj, p pVar) {
        Object c1035z;
        try {
            c1035z = ((p) C.b(pVar, 2)).j(obj, b4);
        } catch (Throwable th) {
            c1035z = new C1035z(th, false, 2, null);
        }
        if (c1035z == c.c()) {
            return c.c();
        }
        Object objU0 = b4.u0(c1035z);
        if (objU0 == y0.f7583b) {
            return c.c();
        }
        if (objU0 instanceof C1035z) {
            throw ((C1035z) objU0).f7590a;
        }
        return y0.h(objU0);
    }
}
