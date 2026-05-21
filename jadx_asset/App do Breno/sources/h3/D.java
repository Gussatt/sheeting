package h3;

import K2.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class D {
    public static final Object a(Object obj, N2.e eVar) {
        if (!(obj instanceof C1035z)) {
            return K2.j.b(obj);
        }
        j.a aVar = K2.j.f2509n;
        return K2.j.b(K2.k.a(((C1035z) obj).f7590a));
    }

    public static final Object b(Object obj, W2.l lVar) {
        Throwable thD = K2.j.d(obj);
        return thD == null ? lVar != null ? new A(obj, lVar) : obj : new C1035z(thD, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC1016l interfaceC1016l) {
        Throwable thD = K2.j.d(obj);
        return thD == null ? obj : new C1035z(thD, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, W2.l lVar, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
