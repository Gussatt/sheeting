package H2;

import H2.Q3;

/* JADX INFO: loaded from: classes.dex */
public final class Q3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f1846f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f1849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f1851e;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final K2.p c(W2.l lVar, K2.j jVar) {
            lVar.k(new Q3(jVar.i()));
            return K2.p.f2516a;
        }

        public final W2.l b(final W2.l lVar) {
            X2.l.e(lVar, "result");
            return new W2.l() { // from class: H2.P3
                @Override // W2.l
                public final Object k(Object obj) {
                    return Q3.a.c(lVar, (K2.j) obj);
                }
            };
        }

        public final void d(Object obj, Object obj2) {
            X2.l.e(obj2, "callback");
            ((W2.l) X2.C.b(obj2, 1)).k(K2.j.a(K2.j.b(obj)));
        }

        public a() {
        }
    }

    public Q3(Object obj) {
        this.f1847a = obj;
        this.f1848b = K2.j.f(obj) ? null : obj;
        this.f1849c = K2.j.d(obj);
        this.f1850d = K2.j.g(obj);
        this.f1851e = K2.j.f(obj);
    }

    public static final W2.l a(W2.l lVar) {
        return f1846f.b(lVar);
    }

    public static final void e(Object obj, Object obj2) {
        f1846f.d(obj, obj2);
    }

    public final Throwable b() {
        return this.f1849c;
    }

    public final Object c() {
        return this.f1848b;
    }

    public final boolean d() {
        return this.f1851e;
    }
}
