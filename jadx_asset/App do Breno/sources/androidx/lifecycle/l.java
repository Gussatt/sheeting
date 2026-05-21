package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f4991a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f4992b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f4993c = new HashMap();

    public static final String c(String str) {
        X2.l.e(str, "className");
        return f3.p.r(str, ".", "_", false, 4, null) + "_LifecycleAdapter";
    }

    public static final InterfaceC0611h f(Object obj) {
        X2.l.e(obj, "object");
        if (obj instanceof InterfaceC0611h) {
            return (InterfaceC0611h) obj;
        }
        Class<?> cls = obj.getClass();
        l lVar = f4991a;
        if (lVar.d(cls) != 2) {
            return new t(obj);
        }
        Object obj2 = f4993c.get(cls);
        X2.l.b(obj2);
        List list = (List) obj2;
        if (list.size() == 1) {
            lVar.a((Constructor) list.get(0), obj);
            return new A(null);
        }
        int size = list.size();
        InterfaceC0607d[] interfaceC0607dArr = new InterfaceC0607d[size];
        for (int i4 = 0; i4 < size; i4++) {
            f4991a.a((Constructor) list.get(i4), obj);
            interfaceC0607dArr[i4] = null;
        }
        return new C0605b(interfaceC0607dArr);
    }

    public final InterfaceC0607d a(Constructor constructor, Object obj) {
        try {
            Object objNewInstance = constructor.newInstance(obj);
            X2.l.d(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            i.d.a(objNewInstance);
            return null;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException(e4);
        } catch (InstantiationException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final Constructor b(Class cls) {
        try {
            Package r02 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r02 != null ? r02.getName() : "";
            X2.l.d(name, "fullPackage");
            if (name.length() != 0) {
                X2.l.d(canonicalName, "name");
                canonicalName = canonicalName.substring(name.length() + 1);
                X2.l.d(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            X2.l.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            String strC = c(canonicalName);
            if (name.length() != 0) {
                strC = name + '.' + strC;
            }
            Class<?> cls2 = Class.forName(strC);
            X2.l.c(cls2, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            Constructor<?> declaredConstructor = cls2.getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException(e4);
        }
    }

    public final int d(Class cls) {
        Map map = f4992b;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        map.put(cls, Integer.valueOf(iG));
        return iG;
    }

    public final boolean e(Class cls) {
        return cls != null && i.class.isAssignableFrom(cls);
    }

    public final int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f4993c.put(cls, L2.l.b(constructorB));
            return 2;
        }
        if (C0604a.f4960c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (e(superclass)) {
            X2.l.d(superclass, "superclass");
            if (d(superclass) == 1) {
                return 1;
            }
            Object obj = f4993c.get(superclass);
            X2.l.b(obj);
            arrayList = new ArrayList((Collection) obj);
        } else {
            arrayList = null;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        X2.l.d(interfaces, "klass.interfaces");
        for (Class<?> cls2 : interfaces) {
            if (e(cls2)) {
                X2.l.d(cls2, "intrface");
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                Object obj2 = f4993c.get(cls2);
                X2.l.b(obj2);
                arrayList.addAll((Collection) obj2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f4993c.put(cls, arrayList);
        return 2;
    }
}
