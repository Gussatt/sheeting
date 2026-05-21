package E0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f918b = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f919a;

    public c(Object obj) {
        this.f919a = obj;
    }

    public static b a(Object obj) {
        return new c(d.c(obj, "instance cannot be null"));
    }

    @Override // J2.a
    public Object get() {
        return this.f919a;
    }
}
