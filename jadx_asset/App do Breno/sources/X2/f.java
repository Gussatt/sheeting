package X2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object[] f3982a = new Object[0];

    public static final Object[] a(Collection collection) {
        l.e(collection, "collection");
        int size = collection.size();
        if (size == 0) {
            return f3982a;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return f3982a;
        }
        Object[] objArrCopyOf = new Object[size];
        int i4 = 0;
        while (true) {
            int i5 = i4 + 1;
            objArrCopyOf[i4] = it.next();
            if (i5 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i6 = ((i5 * 3) + 1) >>> 1;
                if (i6 <= i5) {
                    i6 = 2147483645;
                    if (i5 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i5);
                l.d(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i4 = i5;
        }
    }

    public static final Object[] b(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        l.e(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i4 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArrCopyOf = objArr;
                } else {
                    Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    l.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArrCopyOf = (Object[]) objNewInstance;
                }
                while (true) {
                    int i5 = i4 + 1;
                    objArrCopyOf[i4] = it.next();
                    if (i5 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i6 = ((i5 * 3) + 1) >>> 1;
                        if (i6 <= i5) {
                            i6 = 2147483645;
                            if (i5 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf == objArr) {
                            objArr[i5] = null;
                            return objArr;
                        }
                        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i5);
                        l.d(objArrCopyOf2, "copyOf(...)");
                        return objArrCopyOf2;
                    }
                    i4 = i5;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }
}
