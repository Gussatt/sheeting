package L2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class C extends B {
    public static Map d() {
        x xVar = x.f2762m;
        X2.l.c(xVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return xVar;
    }

    public static Map e(K2.i... iVarArr) {
        X2.l.e(iVarArr, "pairs");
        return iVarArr.length > 0 ? m(iVarArr, new LinkedHashMap(B.a(iVarArr.length))) : d();
    }

    public static Map f(K2.i... iVarArr) {
        X2.l.e(iVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(B.a(iVarArr.length));
        i(linkedHashMap, iVarArr);
        return linkedHashMap;
    }

    public static final Map g(Map map) {
        X2.l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : B.c(map) : d();
    }

    public static final void h(Map map, Iterable iterable) {
        X2.l.e(map, "<this>");
        X2.l.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            K2.i iVar = (K2.i) it.next();
            map.put(iVar.a(), iVar.b());
        }
    }

    public static final void i(Map map, K2.i[] iVarArr) {
        X2.l.e(map, "<this>");
        X2.l.e(iVarArr, "pairs");
        for (K2.i iVar : iVarArr) {
            map.put(iVar.a(), iVar.b());
        }
    }

    public static Map j(Iterable iterable) {
        X2.l.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return g(k(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return k(iterable, new LinkedHashMap(B.a(collection.size())));
        }
        return B.b((K2.i) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map k(Iterable iterable, Map map) {
        X2.l.e(iterable, "<this>");
        X2.l.e(map, "destination");
        h(map, iterable);
        return map;
    }

    public static Map l(Map map) {
        X2.l.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? n(map) : B.c(map) : d();
    }

    public static final Map m(K2.i[] iVarArr, Map map) {
        X2.l.e(iVarArr, "<this>");
        X2.l.e(map, "destination");
        i(map, iVarArr);
        return map;
    }

    public static Map n(Map map) {
        X2.l.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
