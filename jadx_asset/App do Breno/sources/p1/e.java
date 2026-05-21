package p1;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static StringBuilder a(int i4) {
        d.b(i4, "size");
        return new StringBuilder((int) Math.min(((long) i4) * 8, 1073741824L));
    }
}
