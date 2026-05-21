package d1;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: d1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0917e extends PathClassLoader {
    public C0917e(String str, ClassLoader classLoader) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z3) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z3);
    }
}
