package F0;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f1020b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f1021a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f1022a = null;

        public b a() {
            return new b(this.f1022a);
        }

        public a b(e eVar) {
            this.f1022a = eVar;
            return this;
        }
    }

    public b(e eVar) {
        this.f1021a = eVar;
    }

    public static a b() {
        return new a();
    }

    public e a() {
        return this.f1021a;
    }
}
