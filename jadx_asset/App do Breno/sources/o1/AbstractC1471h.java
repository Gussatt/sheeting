package o1;

/* JADX INFO: renamed from: o1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1471h {
    public static String a(int i4, int i5, String str) {
        if (i4 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return j.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String b(int i4, int i5, String str) {
        if (i4 < 0) {
            return j.a("%s (%s) must not be negative", str, Integer.valueOf(i4));
        }
        if (i5 >= 0) {
            return j.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i4), Integer.valueOf(i5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(i5);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String c(int i4, int i5, int i6) {
        return (i4 < 0 || i4 > i6) ? b(i4, i6, "start index") : (i5 < 0 || i5 > i6) ? b(i5, i6, "end index") : j.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i5), Integer.valueOf(i4));
    }

    public static void d(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static int f(int i4, int i5) {
        return g(i4, i5, "index");
    }

    public static int g(int i4, int i5, String str) {
        if (i4 < 0 || i4 >= i5) {
            throw new IndexOutOfBoundsException(a(i4, i5, str));
        }
        return i4;
    }

    public static Object h(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object i(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int j(int i4, int i5) {
        return k(i4, i5, "index");
    }

    public static int k(int i4, int i5, String str) {
        if (i4 < 0 || i4 > i5) {
            throw new IndexOutOfBoundsException(b(i4, i5, str));
        }
        return i4;
    }

    public static void l(int i4, int i5, int i6) {
        if (i4 < 0 || i5 < i4 || i5 > i6) {
            throw new IndexOutOfBoundsException(c(i4, i5, i6));
        }
    }

    public static void m(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    public static void n(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void o(boolean z3, String str, Object obj) {
        if (!z3) {
            throw new IllegalStateException(j.a(str, obj));
        }
    }
}
