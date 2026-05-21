package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final U f4670c = new U();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f4671d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f4673b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z f4672a = new B();

    public static U a() {
        return f4670c;
    }

    public Y b(Class cls, Y y3) {
        AbstractC0598u.b(cls, "messageType");
        AbstractC0598u.b(y3, "schema");
        return (Y) this.f4673b.putIfAbsent(cls, y3);
    }

    public Y c(Class cls) {
        Y yB;
        AbstractC0598u.b(cls, "messageType");
        Y yA = (Y) this.f4673b.get(cls);
        return (yA != null || (yB = b(cls, (yA = this.f4672a.a(cls)))) == null) ? yA : yB;
    }

    public Y d(Object obj) {
        return c(obj.getClass());
    }
}
