package q0;

/* JADX INFO: loaded from: classes.dex */
public interface c extends InterfaceC1491a {

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0158a f11015b = new C0158a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f11016c = new a("NONE");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f11017d = new a("FULL");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11018a;

        /* JADX INFO: renamed from: q0.c$a$a, reason: collision with other inner class name */
        public static final class C0158a {
            public /* synthetic */ C0158a(X2.g gVar) {
                this();
            }

            public C0158a() {
            }
        }

        public a(String str) {
            this.f11018a = str;
        }

        public String toString() {
            return this.f11018a;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f11019b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f11020c = new b("FLAT");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f11021d = new b("HALF_OPENED");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11022a;

        public static final class a {
            public /* synthetic */ a(X2.g gVar) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.f11022a = str;
        }

        public String toString() {
            return this.f11022a;
        }
    }

    b b();

    a c();
}
