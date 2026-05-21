package B2;

import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Z f289a = new Z();

    public final boolean a(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length == objArr2.length) {
                Iterable iterableN = L2.j.n(objArr);
                if (!(iterableN instanceof Collection) || !((Collection) iterableN).isEmpty()) {
                    Iterator it = iterableN.iterator();
                    while (it.hasNext()) {
                        int iC = ((L2.z) it).c();
                        if (!f289a.a(objArr[iC], objArr2[iC])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() == list2.size()) {
                Iterable iterableG = L2.m.g((Collection) obj);
                if (!(iterableG instanceof Collection) || !((Collection) iterableG).isEmpty()) {
                    Iterator it2 = iterableG.iterator();
                    while (it2.hasNext()) {
                        int iC2 = ((L2.z) it2).c();
                        if (!f289a.a(list.get(iC2), list2.get(iC2))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return X2.l.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!map2.containsKey(entry.getKey()) || !f289a.a(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final List b(Throwable th) {
        X2.l.e(th, "exception");
        if (th instanceof C0217z) {
            C0217z c0217z = (C0217z) th;
            return L2.m.i(c0217z.a(), c0217z.getMessage(), c0217z.b());
        }
        return L2.m.i(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public final List c(Object obj) {
        return L2.l.b(obj);
    }
}
