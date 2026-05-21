package h3;

import N2.f;

/* JADX INFO: renamed from: h3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1010i {
    public static final P a(I i4, N2.i iVar, K k4, W2.p pVar) {
        N2.i iVarE = E.e(i4, iVar);
        Q z0Var = k4.g() ? new z0(iVarE, pVar) : new Q(iVarE, true);
        z0Var.U0(k4, z0Var, pVar);
        return z0Var;
    }

    public static /* synthetic */ P b(I i4, N2.i iVar, K k4, W2.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            iVar = N2.j.f2823m;
        }
        if ((i5 & 2) != 0) {
            k4 = K.DEFAULT;
        }
        return AbstractC1006g.a(i4, iVar, k4, pVar);
    }

    public static final InterfaceC1027q0 c(I i4, N2.i iVar, K k4, W2.p pVar) {
        N2.i iVarE = E.e(i4, iVar);
        H0 a02 = k4.g() ? new A0(iVarE, pVar) : new H0(iVarE, true);
        a02.U0(k4, a02, pVar);
        return a02;
    }

    public static /* synthetic */ InterfaceC1027q0 d(I i4, N2.i iVar, K k4, W2.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            iVar = N2.j.f2823m;
        }
        if ((i5 & 2) != 0) {
            k4 = K.DEFAULT;
        }
        return AbstractC1006g.c(i4, iVar, k4, pVar);
    }

    public static final Object e(N2.i iVar, W2.p pVar, N2.e eVar) throws Throwable {
        Object objV0;
        N2.i iVarB = eVar.b();
        N2.i iVarD = E.d(iVarB, iVar);
        u0.d(iVarD);
        if (iVarD == iVarB) {
            m3.B b4 = new m3.B(iVarD, eVar);
            objV0 = n3.b.b(b4, b4, pVar);
        } else {
            f.b bVar = N2.f.f2821a;
            if (X2.l.a(iVarD.d(bVar), iVarB.d(bVar))) {
                N0 n02 = new N0(iVarD, eVar);
                N2.i iVarB2 = n02.b();
                Object objC = m3.J.c(iVarB2, null);
                try {
                    Object objB = n3.b.b(n02, n02, pVar);
                    m3.J.a(iVarB2, objC);
                    objV0 = objB;
                } catch (Throwable th) {
                    m3.J.a(iVarB2, objC);
                    throw th;
                }
            } else {
                T t4 = new T(iVarD, eVar);
                n3.a.d(pVar, t4, t4, null, 4, null);
                objV0 = t4.V0();
            }
        }
        if (objV0 == O2.c.c()) {
            P2.h.c(eVar);
        }
        return objV0;
    }
}
