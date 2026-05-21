package L2;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class B extends A {
    public static int a(int i4) {
        if (i4 < 0) {
            return i4;
        }
        if (i4 < 3) {
            return i4 + 1;
        }
        if (i4 < 1073741824) {
            return (int) ((i4 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map b(K2.i iVar) {
        X2.l.e(iVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(iVar.c(), iVar.d());
        X2.l.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final Map c(Map map) {
        X2.l.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        X2.l.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
