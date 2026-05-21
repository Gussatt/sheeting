package t3;

import java.io.IOException;
import t3.J;

/* JADX INFO: renamed from: t3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1552h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11428a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC1552h f11429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final J f11430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1552h f11431d;

    /* JADX INFO: renamed from: t3.h$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    static {
        AbstractC1552h c1557m;
        try {
            Class.forName("java.nio.file.Files");
            c1557m = new E();
        } catch (ClassNotFoundException unused) {
            c1557m = new C1557m();
        }
        f11429b = c1557m;
        J.a aVar = J.f11359n;
        String property = System.getProperty("java.io.tmpdir");
        X2.l.d(property, "getProperty(\"java.io.tmpdir\")");
        f11430c = J.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = u3.g.class.getClassLoader();
        X2.l.d(classLoader, "ResourceFileSystem::class.java.classLoader");
        f11431d = new u3.g(classLoader, false);
    }

    public abstract void a(J j4, J j5);

    public final void b(J j4, boolean z3) throws IOException {
        X2.l.e(j4, "dir");
        u3.b.a(this, j4, z3);
    }

    public final void c(J j4) {
        X2.l.e(j4, "dir");
        d(j4, false);
    }

    public abstract void d(J j4, boolean z3);

    public final void e(J j4) {
        X2.l.e(j4, "path");
        f(j4, false);
    }

    public abstract void f(J j4, boolean z3);

    public final boolean g(J j4) {
        X2.l.e(j4, "path");
        return u3.b.b(this, j4);
    }

    public abstract C1551g h(J j4);

    public abstract AbstractC1550f i(J j4);

    public final AbstractC1550f j(J j4) {
        X2.l.e(j4, "file");
        return k(j4, false, false);
    }

    public abstract AbstractC1550f k(J j4, boolean z3, boolean z4);

    public abstract Q l(J j4);
}
