package X2;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static Map a(Object obj) {
        if (obj instanceof Y2.a) {
            h(obj, "kotlin.collections.MutableMap");
        }
        return c(obj);
    }

    public static Object b(Object obj, int i4) {
        if (obj != null && !e(obj, i4)) {
            h(obj, "kotlin.jvm.functions.Function" + i4);
        }
        return obj;
    }

    public static Map c(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e4) {
            throw g(e4);
        }
    }

    public static int d(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).f();
        }
        if (obj instanceof W2.a) {
            return 0;
        }
        if (obj instanceof W2.l) {
            return 1;
        }
        if (obj instanceof W2.p) {
            return 2;
        }
        if (obj instanceof W2.q) {
            return 3;
        }
        return obj instanceof W2.r ? 4 : -1;
    }

    public static boolean e(Object obj, int i4) {
        return (obj instanceof K2.b) && d(obj) == i4;
    }

    public static Throwable f(Throwable th) {
        return l.j(th, C.class.getName());
    }

    public static ClassCastException g(ClassCastException classCastException) {
        throw ((ClassCastException) f(classCastException));
    }

    public static void h(Object obj, String str) {
        i((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void i(String str) {
        throw g(new ClassCastException(str));
    }
}
