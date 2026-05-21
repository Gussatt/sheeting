package h3;

import K2.j;
import m3.C1425j;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(N2.e eVar) {
        Object objB;
        if (eVar instanceof C1425j) {
            return eVar.toString();
        }
        try {
            j.a aVar = K2.j.f2509n;
            objB = K2.j.b(eVar + '@' + b(eVar));
        } catch (Throwable th) {
            j.a aVar2 = K2.j.f2509n;
            objB = K2.j.b(K2.k.a(th));
        }
        if (K2.j.d(objB) != null) {
            objB = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) objB;
    }
}
