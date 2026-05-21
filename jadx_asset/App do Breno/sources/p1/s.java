package p1;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static Object[] a(Object[] objArr, int i4, int i5, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i4, i5, objArr2.getClass());
    }

    public static Object[] b(Object[] objArr, int i4) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
    }
}
