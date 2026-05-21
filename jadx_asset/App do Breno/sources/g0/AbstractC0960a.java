package g0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: g0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0960a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f7293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f7294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f7295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f7296d;

    public static void a(String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.a(j(str), i4);
        } else {
            b(j(str), i4);
        }
    }

    public static void b(String str, int i4) {
        try {
            if (f7295c == null) {
                f7295c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f7295c.invoke(null, Long.valueOf(f7293a), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            g("asyncTraceBegin", e4);
        }
    }

    public static void c(String str) {
        b.a(j(str));
    }

    public static void d(String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            c.b(j(str), i4);
        } else {
            e(j(str), i4);
        }
    }

    public static void e(String str, int i4) {
        try {
            if (f7296d == null) {
                f7296d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f7296d.invoke(null, Long.valueOf(f7293a), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            g("asyncTraceEnd", e4);
        }
    }

    public static void f() {
        b.b();
    }

    public static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? c.c() : i();
    }

    public static boolean i() {
        try {
            if (f7294b == null) {
                f7293a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f7294b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f7294b.invoke(null, Long.valueOf(f7293a))).booleanValue();
        } catch (Exception e4) {
            g("isTagEnabled", e4);
            return false;
        }
    }

    public static String j(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
