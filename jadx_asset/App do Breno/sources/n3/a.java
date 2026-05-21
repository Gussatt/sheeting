package n3;

import K2.j;
import K2.k;
import K2.p;
import N2.e;
import W2.l;
import m3.AbstractC1426k;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final void a(e eVar, Throwable th) throws Throwable {
        j.a aVar = j.f2509n;
        eVar.p(j.b(k.a(th)));
        throw th;
    }

    public static final void b(e eVar, e eVar2) throws Throwable {
        try {
            e eVarB = O2.b.b(eVar);
            j.a aVar = j.f2509n;
            AbstractC1426k.c(eVarB, j.b(p.f2516a), null, 2, null);
        } catch (Throwable th) {
            a(eVar2, th);
        }
    }

    public static final void c(W2.p pVar, Object obj, e eVar, l lVar) throws Throwable {
        try {
            e eVarB = O2.b.b(O2.b.a(pVar, obj, eVar));
            j.a aVar = j.f2509n;
            AbstractC1426k.b(eVarB, j.b(p.f2516a), lVar);
        } catch (Throwable th) {
            a(eVar, th);
        }
    }

    public static /* synthetic */ void d(W2.p pVar, Object obj, e eVar, l lVar, int i4, Object obj2) throws Throwable {
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        c(pVar, obj, eVar, lVar);
    }
}
