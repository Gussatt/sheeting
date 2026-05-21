package h3;

import m3.C1425j;

/* JADX INFO: renamed from: h3.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1022o {
    public static final void a(InterfaceC1016l interfaceC1016l, X x3) {
        interfaceC1016l.J(new Y(x3));
    }

    public static final C1018m b(N2.e eVar) {
        if (!(eVar instanceof C1425j)) {
            return new C1018m(eVar, 1);
        }
        C1018m c1018mL = ((C1425j) eVar).l();
        if (c1018mL != null) {
            if (!c1018mL.M()) {
                c1018mL = null;
            }
            if (c1018mL != null) {
                return c1018mL;
            }
        }
        return new C1018m(eVar, 2);
    }
}
