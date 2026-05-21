package E0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements J2.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f915c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile J2.a f916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f917b = f915c;

    public a(J2.a aVar) {
        this.f916a = aVar;
    }

    public static J2.a a(J2.a aVar) {
        d.b(aVar);
        return aVar instanceof a ? aVar : new a(aVar);
    }

    public static Object b(Object obj, Object obj2) {
        if (obj == f915c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // J2.a
    public Object get() {
        Object obj;
        Object obj2 = this.f917b;
        Object obj3 = f915c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f917b;
                if (obj == obj3) {
                    obj = this.f916a.get();
                    this.f917b = b(this.f917b, obj);
                    this.f916a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
