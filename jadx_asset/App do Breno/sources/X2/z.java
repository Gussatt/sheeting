package X2;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final A f3993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d3.b[] f3994b;

    static {
        A a4 = null;
        try {
            a4 = (A) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (a4 == null) {
            a4 = new A();
        }
        f3993a = a4;
        f3994b = new d3.b[0];
    }

    public static d3.e a(i iVar) {
        return f3993a.a(iVar);
    }

    public static d3.b b(Class cls) {
        return f3993a.b(cls);
    }

    public static d3.d c(Class cls) {
        return f3993a.c(cls, "");
    }

    public static d3.f d(o oVar) {
        return f3993a.d(oVar);
    }

    public static d3.g e(q qVar) {
        return f3993a.e(qVar);
    }

    public static d3.h f(s sVar) {
        return f3993a.f(sVar);
    }

    public static String g(h hVar) {
        return f3993a.g(hVar);
    }

    public static String h(m mVar) {
        return f3993a.h(mVar);
    }
}
