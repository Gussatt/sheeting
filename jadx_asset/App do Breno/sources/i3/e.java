package i3;

import K2.j;
import K2.k;
import X2.l;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7746a;
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            j.a aVar = j.f2509n;
            objB = j.b(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            j.a aVar2 = j.f2509n;
            objB = j.b(k.a(th));
        }
        f7746a = (d) (j.f(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z3) throws IllegalAccessException, InvocationTargetException {
        if (!z3) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            l.c(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
