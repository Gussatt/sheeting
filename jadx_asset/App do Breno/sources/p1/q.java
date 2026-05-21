package p1;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static Object a(Object obj, int i4) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i4);
        throw new NullPointerException(sb.toString());
    }

    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    public static Object[] c(Object[] objArr, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            a(objArr[i5], i5);
        }
        return objArr;
    }

    public static Object[] d(Object[] objArr, int i4) {
        return s.b(objArr, i4);
    }
}
