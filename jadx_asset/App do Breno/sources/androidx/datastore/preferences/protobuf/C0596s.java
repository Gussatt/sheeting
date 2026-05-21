package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0596s implements I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0596s f4910a = new C0596s();

    public static C0596s c() {
        return f4910a;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public H a(Class cls) {
        if (!AbstractC0597t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (H) AbstractC0597t.u(cls.asSubclass(AbstractC0597t.class)).j();
        } catch (Exception e4) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e4);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public boolean b(Class cls) {
        return AbstractC0597t.class.isAssignableFrom(cls);
    }
}
