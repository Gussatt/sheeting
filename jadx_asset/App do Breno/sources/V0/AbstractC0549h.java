package V0;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: renamed from: V0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0549h {
    public static void a(boolean z3) {
        if (!z3) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(Handler handler) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != handler.getLooper()) {
            String name = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null current looper";
            throw new IllegalStateException("Must be called on " + handler.getLooper().getThread().getName() + " thread, but got " + name + ".");
        }
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        return str;
    }

    public static String e(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    public static void f() {
        g("Must not be called on GoogleApiHandler thread.");
    }

    public static void g(String str) {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            throw new IllegalStateException(str);
        }
    }

    public static void h() {
        i("Must not be called on the main application thread");
    }

    public static void i(String str) {
        if (b1.u.a()) {
            throw new IllegalStateException(str);
        }
    }

    public static Object j(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("null reference");
    }

    public static Object k(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static int l(int i4) {
        if (i4 != 0) {
            return i4;
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public static long m(long j4) {
        if (j4 != 0) {
            return j4;
        }
        throw new IllegalArgumentException("Given Long is zero");
    }

    public static void n(boolean z3) {
        if (!z3) {
            throw new IllegalStateException();
        }
    }

    public static void o(boolean z3, Object obj) {
        if (!z3) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
