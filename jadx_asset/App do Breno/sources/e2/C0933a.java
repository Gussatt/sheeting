package e2;

/* JADX INFO: renamed from: e2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0933a implements J2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7185c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile J2.a f7186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f7187b = f7185c;

    public C0933a(J2.a aVar) {
        this.f7186a = aVar;
    }

    public static J2.a a(J2.a aVar) {
        AbstractC0936d.b(aVar);
        return aVar instanceof C0933a ? aVar : new C0933a(aVar);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f7185c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // J2.a
    public Object get() {
        Object obj;
        Object obj2 = this.f7187b;
        Object obj3 = f7185c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f7187b;
                if (obj == obj3) {
                    obj = this.f7186a.get();
                    this.f7187b = b(this.f7187b, obj);
                    this.f7186a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
