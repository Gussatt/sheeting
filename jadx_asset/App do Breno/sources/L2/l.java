package L2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static final Object[] a(Object[] objArr, boolean z3) {
        X2.l.e(objArr, "<this>");
        if (z3 && X2.l.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        X2.l.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List b(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        X2.l.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static final Object[] c(int i4, Object[] objArr) {
        X2.l.e(objArr, "array");
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
