package w1;

/* JADX INFO: loaded from: classes.dex */
public class w implements U1.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f11850c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f11851a = f11850c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile U1.b f11852b;

    public w(U1.b bVar) {
        this.f11852b = bVar;
    }

    @Override // U1.b
    public Object get() {
        Object obj;
        Object obj2 = this.f11851a;
        Object obj3 = f11850c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f11851a;
                if (obj == obj3) {
                    obj = this.f11852b.get();
                    this.f11851a = obj;
                    this.f11852b = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }
}
