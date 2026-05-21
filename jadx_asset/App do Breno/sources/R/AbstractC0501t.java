package R;

import p.C1481g;

/* JADX INFO: renamed from: R.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0501t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1481g f3307a = new C1481g();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return AbstractComponentCallbacksC0497o.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C1481g c1481g = f3307a;
        C1481g c1481g2 = (C1481g) c1481g.get(classLoader);
        if (c1481g2 == null) {
            c1481g2 = new C1481g();
            c1481g.put(classLoader, c1481g2);
        }
        Class cls = (Class) c1481g2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c1481g2.put(str, cls2);
        return cls2;
    }

    public abstract AbstractComponentCallbacksC0497o a(ClassLoader classLoader, String str);
}
