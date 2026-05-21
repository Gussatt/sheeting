package L2;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final Object[] a(Object[] objArr, int i4) {
        X2.l.e(objArr, "reference");
        Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i4);
        X2.l.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
        return (Object[]) objNewInstance;
    }

    public static final void b(int i4, int i5) {
        if (i4 <= i5) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i4 + ") is greater than size (" + i5 + ").");
    }
}
