package N0;

import android.util.SparseArray;
import java.util.HashMap;
import z0.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray f2814a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap f2815b;

    static {
        HashMap map = new HashMap();
        f2815b = map;
        map.put(e.DEFAULT, 0);
        f2815b.put(e.VERY_LOW, 1);
        f2815b.put(e.HIGHEST, 2);
        for (e eVar : f2815b.keySet()) {
            f2814a.append(((Integer) f2815b.get(eVar)).intValue(), eVar);
        }
    }

    public static int a(e eVar) {
        Integer num = (Integer) f2815b.get(eVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + eVar);
    }

    public static e b(int i4) {
        e eVar = (e) f2814a.get(i4);
        if (eVar != null) {
            return eVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i4);
    }
}
