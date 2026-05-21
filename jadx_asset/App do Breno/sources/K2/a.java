package K2;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        X2.l.e(th, "<this>");
        X2.l.e(th2, "exception");
        if (th != th2) {
            R2.b.f3363a.a(th, th2);
        }
    }
}
