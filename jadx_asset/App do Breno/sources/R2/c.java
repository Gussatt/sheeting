package R2;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final int a(int i4, int i5, int i6) {
        return c(c(i4, i6) - c(i5, i6), i6);
    }

    public static final int b(int i4, int i5, int i6) {
        if (i6 > 0) {
            if (i4 < i5) {
                return i5 - a(i5, i4, i6);
            }
        } else {
            if (i6 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i4 > i5) {
                return i5 + a(i4, i5, -i6);
            }
        }
        return i5;
    }

    public static final int c(int i4, int i5) {
        int i6 = i4 % i5;
        return i6 >= 0 ? i6 : i6 + i5;
    }
}
