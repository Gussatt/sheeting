package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0582d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f4704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f4705b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f4706c;

    static {
        f4706c = (f4704a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f4705b;
    }

    public static boolean c() {
        if (f4704a) {
            return true;
        }
        return (f4705b == null || f4706c) ? false : true;
    }
}
