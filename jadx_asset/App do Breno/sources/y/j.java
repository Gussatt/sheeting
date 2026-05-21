package y;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f11992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f11993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f11994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f11995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f11996e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f11992a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f11993b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f11994c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f11995d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f11996e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e4) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e4);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
