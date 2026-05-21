package l3;

import X2.C;
import m3.J;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Object b(N2.i iVar, Object obj, Object obj2, W2.p pVar, N2.e eVar) {
        Object objC = J.c(iVar, obj2);
        try {
            Object objJ = ((W2.p) C.b(pVar, 2)).j(obj, new r(eVar, iVar));
            J.a(iVar, objC);
            if (objJ == O2.c.c()) {
                P2.h.c(eVar);
            }
            return objJ;
        } catch (Throwable th) {
            J.a(iVar, objC);
            throw th;
        }
    }

    public static /* synthetic */ Object c(N2.i iVar, Object obj, Object obj2, W2.p pVar, N2.e eVar, int i4, Object obj3) {
        if ((i4 & 4) != 0) {
            obj2 = J.b(iVar);
        }
        return b(iVar, obj, obj2, pVar, eVar);
    }

    public static final k3.e d(k3.e eVar, N2.i iVar) {
        return eVar instanceof q ? eVar : new s(eVar, iVar);
    }
}
