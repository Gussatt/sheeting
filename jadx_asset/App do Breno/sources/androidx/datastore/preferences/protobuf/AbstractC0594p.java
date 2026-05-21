package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0594p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0592n f4835a = new C0593o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0592n f4836b = c();

    public static AbstractC0592n a() {
        AbstractC0592n abstractC0592n = f4836b;
        if (abstractC0592n != null) {
            return abstractC0592n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC0592n b() {
        return f4835a;
    }

    public static AbstractC0592n c() {
        if (U.f4671d) {
            return null;
        }
        try {
            return (AbstractC0592n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
