package P2;

import X2.l;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f2896a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2897b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f2898c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f2899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f2900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f2901c;

        public a(Method method, Method method2, Method method3) {
            this.f2899a = method;
            this.f2900b = method2;
            this.f2901c = method3;
        }
    }

    public final a a(P2.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f2898c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f2897b;
            f2898c = aVar3;
            return aVar3;
        }
    }

    public final String b(P2.a aVar) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        l.e(aVar, "continuation");
        a aVarA = f2898c;
        if (aVarA == null) {
            aVarA = a(aVar);
        }
        if (aVarA != f2897b && (method = aVarA.f2899a) != null && (objInvoke = method.invoke(aVar.getClass(), new Object[0])) != null && (method2 = aVarA.f2900b) != null && (objInvoke2 = method2.invoke(objInvoke, new Object[0])) != null) {
            Method method3 = aVarA.f2901c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, new Object[0]) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
