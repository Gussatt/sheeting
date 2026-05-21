package m0;

import X2.l;
import X2.m;
import java.lang.reflect.Method;
import v0.C1585a;

/* JADX INFO: renamed from: m0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1391a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f10321a;

    /* JADX INFO: renamed from: m0.a$a, reason: collision with other inner class name */
    public static final class C0140a extends m implements W2.a {
        public C0140a() {
            super(0);
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class e() throws ClassNotFoundException {
            Class<?> clsLoadClass = C1391a.this.f10321a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            l.d(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return clsLoadClass;
        }
    }

    /* JADX INFO: renamed from: m0.a$b */
    public static final class b extends m implements W2.a {
        public b() {
            super(0);
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean e() throws NoSuchMethodException, ClassNotFoundException {
            boolean z3 = false;
            Method declaredMethod = C1391a.this.d().getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class clsC = C1391a.this.c();
            C1585a c1585a = C1585a.f11542a;
            l.d(declaredMethod, "getWindowExtensionsMethod");
            if (c1585a.c(declaredMethod, clsC) && c1585a.d(declaredMethod)) {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
    }

    public C1391a(ClassLoader classLoader) {
        l.e(classLoader, "loader");
        this.f10321a = classLoader;
    }

    public final Class c() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f10321a.loadClass("androidx.window.extensions.WindowExtensions");
        l.d(clsLoadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return clsLoadClass;
    }

    public final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f10321a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        l.d(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return clsLoadClass;
    }

    public final boolean e() {
        return C1585a.f11542a.a(new C0140a());
    }

    public final boolean f() {
        return e() && C1585a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b());
    }
}
