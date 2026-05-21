package w1;

import java.util.Set;

/* JADX INFO: renamed from: w1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1605d {
    default Object a(Class cls) {
        return f(E.b(cls));
    }

    default Set b(Class cls) {
        return i(E.b(cls));
    }

    U1.a c(E e4);

    U1.b d(E e4);

    default U1.b e(Class cls) {
        return g(E.b(cls));
    }

    default Object f(E e4) {
        U1.b bVarG = g(e4);
        if (bVarG == null) {
            return null;
        }
        return bVarG.get();
    }

    U1.b g(E e4);

    default U1.a h(Class cls) {
        return c(E.b(cls));
    }

    default Set i(E e4) {
        return (Set) d(e4).get();
    }
}
