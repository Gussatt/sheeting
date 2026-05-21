package L2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends q {
    public static boolean o(Collection collection, Iterable iterable) {
        X2.l.e(collection, "<this>");
        X2.l.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z3 = true;
            }
        }
        return z3;
    }

    public static final boolean p(Iterable iterable, W2.l lVar, boolean z3) {
        Iterator it = iterable.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.k(it.next())).booleanValue() == z3) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    public static Object q(List list) {
        X2.l.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(m.h(list));
    }

    public static boolean r(Iterable iterable, W2.l lVar) {
        X2.l.e(iterable, "<this>");
        X2.l.e(lVar, "predicate");
        return p(iterable, lVar, false);
    }
}
