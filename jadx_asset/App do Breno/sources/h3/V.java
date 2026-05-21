package h3;

import K2.j;
import m3.C1425j;

/* JADX INFO: loaded from: classes.dex */
public abstract class V {
    public static final void a(U u4, int i4) {
        N2.e eVarD = u4.d();
        boolean z3 = i4 == 4;
        if (z3 || !(eVarD instanceof C1425j) || b(i4) != b(u4.f7520o)) {
            d(u4, eVarD, z3);
            return;
        }
        F f4 = ((C1425j) eVarD).f10541p;
        N2.i iVarB = eVarD.b();
        if (f4.S(iVarB)) {
            f4.R(iVarB, u4);
        } else {
            e(u4);
        }
    }

    public static final boolean b(int i4) {
        return i4 == 1 || i4 == 2;
    }

    public static final boolean c(int i4) {
        return i4 == 2;
    }

    public static final void d(U u4, N2.e eVar, boolean z3) {
        Object objF;
        Object objJ = u4.j();
        Throwable thE = u4.e(objJ);
        if (thE != null) {
            j.a aVar = K2.j.f2509n;
            objF = K2.k.a(thE);
        } else {
            j.a aVar2 = K2.j.f2509n;
            objF = u4.f(objJ);
        }
        Object objB = K2.j.b(objF);
        if (!z3) {
            eVar.p(objB);
            return;
        }
        X2.l.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C1425j c1425j = (C1425j) eVar;
        N2.e eVar2 = c1425j.f10542q;
        Object obj = c1425j.f10544s;
        N2.i iVarB = eVar2.b();
        Object objC = m3.J.c(iVarB, obj);
        N0 n0G = objC != m3.J.f10520a ? E.g(eVar2, iVarB, objC) : null;
        try {
            c1425j.f10542q.p(objB);
            K2.p pVar = K2.p.f2516a;
            if (n0G == null || n0G.V0()) {
                m3.J.a(iVarB, objC);
            }
        } catch (Throwable th) {
            if (n0G == null || n0G.V0()) {
                m3.J.a(iVarB, objC);
            }
            throw th;
        }
    }

    public static final void e(U u4) {
        AbstractC0995a0 abstractC0995a0B = L0.f7509a.b();
        if (abstractC0995a0B.b0()) {
            abstractC0995a0B.X(u4);
            return;
        }
        abstractC0995a0B.Z(true);
        try {
            d(u4, u4.d(), true);
            do {
            } while (abstractC0995a0B.e0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
