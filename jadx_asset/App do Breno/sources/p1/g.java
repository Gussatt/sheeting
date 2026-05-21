package p1;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static int a(int i4) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i4) * (-862048943)), 15)) * 461845907);
    }

    public static int b(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }
}
