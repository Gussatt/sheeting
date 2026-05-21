package c3;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends d {
    public static int a(int i4, int i5) {
        return i4 < i5 ? i5 : i4;
    }

    public static int b(int i4, int i5) {
        return i4 > i5 ? i5 : i4;
    }

    public static long c(long j4, long j5) {
        return j4 > j5 ? j5 : j4;
    }

    public static long d(long j4, long j5, long j6) {
        if (j5 <= j6) {
            return j4 < j5 ? j5 : j4 > j6 ? j6 : j4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j6 + " is less than minimum " + j5 + '.');
    }

    public static a e(int i4, int i5) {
        return a.f6148p.a(i4, i5, -1);
    }
}
