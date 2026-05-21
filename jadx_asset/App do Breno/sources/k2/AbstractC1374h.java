package k2;

import i2.C1049E;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: k2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1374h {
    public static Map a(InterfaceC1371e interfaceC1371e) {
        C1049E c1049eD = interfaceC1371e.d();
        if (c1049eD == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put("sql", c1049eD.c());
        map.put("arguments", c1049eD.b());
        return map;
    }
}
