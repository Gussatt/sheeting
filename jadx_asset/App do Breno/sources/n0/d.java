package n0;

import K2.p;
import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f10586a;

    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d3.b f10587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final W2.l f10588b;

        public a(d3.b bVar, W2.l lVar) {
            X2.l.e(bVar, "clazz");
            X2.l.e(lVar, "consumer");
            this.f10587a = bVar;
            this.f10588b = lVar;
        }

        public final void a(Object obj) {
            X2.l.e(obj, "parameter");
            this.f10588b.k(obj);
        }

        public final boolean b(Method method, Object[] objArr) {
            return X2.l.a(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        public final boolean c(Method method, Object[] objArr) {
            return X2.l.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean d(Method method, Object[] objArr) {
            return X2.l.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        public final boolean e(Method method, Object[] objArr) {
            return X2.l.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            X2.l.e(obj, "obj");
            X2.l.e(method, "method");
            if (b(method, objArr)) {
                a(d3.c.a(this.f10587a, objArr != null ? objArr[0] : null));
                return p.f2516a;
            }
            if (c(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (d(method, objArr)) {
                return Integer.valueOf(this.f10588b.hashCode());
            }
            if (e(method, objArr)) {
                return this.f10588b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    public interface b {
        void a();
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f10589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f10590b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f10591c;

        public c(Method method, Object obj, Object obj2) {
            this.f10589a = method;
            this.f10590b = obj;
            this.f10591c = obj2;
        }

        @Override // n0.d.b
        public void a() throws IllegalAccessException, InvocationTargetException {
            this.f10589a.invoke(this.f10590b, this.f10591c);
        }
    }

    public d(ClassLoader classLoader) {
        X2.l.e(classLoader, "loader");
        this.f10586a = classLoader;
    }

    public final Object a(d3.b bVar, W2.l lVar) {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f10586a, new Class[]{d()}, new a(bVar, lVar));
        X2.l.d(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return objNewProxyInstance;
    }

    public final Class b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final b c(Object obj, d3.b bVar, String str, String str2, Activity activity, W2.l lVar) throws IllegalAccessException, InvocationTargetException {
        X2.l.e(obj, "obj");
        X2.l.e(bVar, "clazz");
        X2.l.e(str, "addMethodName");
        X2.l.e(str2, "removeMethodName");
        X2.l.e(activity, "activity");
        X2.l.e(lVar, "consumer");
        Object objA = a(bVar, lVar);
        obj.getClass().getMethod(str, Activity.class, d()).invoke(obj, activity, objA);
        return new c(obj.getClass().getMethod(str2, d()), obj, objA);
    }

    public final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f10586a.loadClass("java.util.function.Consumer");
        X2.l.d(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }
}
