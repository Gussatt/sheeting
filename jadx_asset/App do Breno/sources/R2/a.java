package R2;

import L2.j;
import X2.l;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: R2.a$a, reason: collision with other inner class name */
    public static final class C0070a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0070a f3360a = new C0070a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f3361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f3362c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            l.b(methods);
            int length = methods.length;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                method = null;
                if (i5 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i5];
                if (l.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    l.d(parameterTypes, "getParameterTypes(...)");
                    if (l.a(j.v(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i5++;
            }
            f3361b = method2;
            int length2 = methods.length;
            while (true) {
                if (i4 >= length2) {
                    break;
                }
                Method method3 = methods[i4];
                if (l.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i4++;
            }
            f3362c = method;
        }
    }

    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        l.e(th, "cause");
        l.e(th2, "exception");
        Method method = C0070a.f3361b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public a3.c b() {
        return new a3.b();
    }
}
