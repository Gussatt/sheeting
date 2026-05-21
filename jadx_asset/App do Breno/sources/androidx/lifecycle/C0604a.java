package androidx.lifecycle;

import androidx.lifecycle.AbstractC0609f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0604a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C0604a f4960c = new C0604a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f4961a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f4962b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    public static class C0095a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f4963a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f4964b;

        public C0095a(Map map) {
            this.f4964b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC0609f.a aVar = (AbstractC0609f.a) entry.getValue();
                List arrayList = (List) this.f4963a.get(aVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f4963a.put(aVar, arrayList);
                }
                arrayList.add((b) entry.getKey());
            }
        }

        public static void b(List list, j jVar, AbstractC0609f.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(jVar, aVar, obj);
                }
            }
        }

        public void a(j jVar, AbstractC0609f.a aVar, Object obj) {
            b((List) this.f4963a.get(aVar), jVar, aVar, obj);
            b((List) this.f4963a.get(AbstractC0609f.a.ON_ANY), jVar, aVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f4965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f4966b;

        public b(int i4, Method method) {
            this.f4965a = i4;
            this.f4966b = method;
            method.setAccessible(true);
        }

        public void a(j jVar, AbstractC0609f.a aVar, Object obj) {
            try {
                int i4 = this.f4965a;
                if (i4 == 0) {
                    this.f4966b.invoke(obj, new Object[0]);
                } else if (i4 == 1) {
                    this.f4966b.invoke(obj, jVar);
                } else {
                    if (i4 != 2) {
                        return;
                    }
                    this.f4966b.invoke(obj, jVar, aVar);
                }
            } catch (IllegalAccessException e4) {
                throw new RuntimeException(e4);
            } catch (InvocationTargetException e5) {
                throw new RuntimeException("Failed to call observer method", e5.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4965a == bVar.f4965a && this.f4966b.getName().equals(bVar.f4966b.getName());
        }

        public int hashCode() {
            return (this.f4965a * 31) + this.f4966b.getName().hashCode();
        }
    }

    public final C0095a a(Class cls, Method[] methodArr) {
        int i4;
        C0095a c0095aC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0095aC = c(superclass)) != null) {
            map.putAll(c0095aC.f4964b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f4964b.entrySet()) {
                e(map, (b) entry.getKey(), (AbstractC0609f.a) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z3 = false;
        for (Method method : methodArr) {
            q qVar = (q) method.getAnnotation(q.class);
            if (qVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i4 = 0;
                } else {
                    if (!j.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i4 = 1;
                }
                AbstractC0609f.a aVarValue = qVar.value();
                if (parameterTypes.length > 1) {
                    if (!AbstractC0609f.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (aVarValue != AbstractC0609f.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i4 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i4, method), aVarValue, cls);
                z3 = true;
            }
        }
        C0095a c0095a = new C0095a(map);
        this.f4961a.put(cls, c0095a);
        this.f4962b.put(cls, Boolean.valueOf(z3));
        return c0095a;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e4) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e4);
        }
    }

    public C0095a c(Class cls) {
        C0095a c0095a = (C0095a) this.f4961a.get(cls);
        return c0095a != null ? c0095a : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f4962b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((q) method.getAnnotation(q.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f4962b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, b bVar, AbstractC0609f.a aVar, Class cls) {
        AbstractC0609f.a aVar2 = (AbstractC0609f.a) map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f4966b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + aVar2 + ", new value " + aVar);
    }
}
