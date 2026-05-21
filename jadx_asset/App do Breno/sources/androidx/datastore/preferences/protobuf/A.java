package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0602y f4623a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0602y f4624b = new C0603z();

    public static InterfaceC0602y a() {
        return f4623a;
    }

    public static InterfaceC0602y b() {
        return f4624b;
    }

    public static InterfaceC0602y c() {
        if (U.f4671d) {
            return null;
        }
        try {
            return (InterfaceC0602y) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
