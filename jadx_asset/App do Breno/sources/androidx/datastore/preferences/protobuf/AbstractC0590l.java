package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0590l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f4826a = c();

    public static C0591m a() {
        C0591m c0591mB = b("getEmptyRegistry");
        return c0591mB != null ? c0591mB : C0591m.f4831c;
    }

    public static final C0591m b(String str) {
        Class cls = f4826a;
        if (cls == null) {
            return null;
        }
        try {
            return (C0591m) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
