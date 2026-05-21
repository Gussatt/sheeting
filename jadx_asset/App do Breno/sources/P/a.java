package P;

import L2.u;
import X2.l;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final Set a(Set set) {
        l.e(set, "set");
        Set setUnmodifiableSet = Collections.unmodifiableSet(u.I(set));
        l.d(setUnmodifiableSet, "unmodifiableSet(set.toSet())");
        return setUnmodifiableSet;
    }

    public static final Map b(Map map) {
        l.e(map, "map");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        l.d(mapUnmodifiableMap, "unmodifiableMap(map)");
        return mapUnmodifiableMap;
    }
}
