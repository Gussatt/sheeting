package B;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static int a(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    public static Object b(Object obj) {
        obj.getClass();
        return obj;
    }
}
