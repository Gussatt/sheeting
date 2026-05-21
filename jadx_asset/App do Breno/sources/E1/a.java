package E1;

/* JADX INFO: loaded from: classes.dex */
public final class a implements P1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P1.a f920a = new a();

    /* JADX INFO: renamed from: E1.a$a, reason: collision with other inner class name */
    public static final class C0013a implements O1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0013a f921a = new C0013a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final O1.d f922b = O1.d.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O1.d f923c = O1.d.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final O1.d f924d = O1.d.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final O1.d f925e = O1.d.d("variantId");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final O1.d f926f = O1.d.d("templateVersion");

        @Override // O1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(j jVar, O1.f fVar) {
            fVar.a(f922b, jVar.e());
            fVar.a(f923c, jVar.c());
            fVar.a(f924d, jVar.d());
            fVar.a(f925e, jVar.g());
            fVar.f(f926f, jVar.f());
        }
    }

    @Override // P1.a
    public void a(P1.b bVar) {
        C0013a c0013a = C0013a.f921a;
        bVar.a(j.class, c0013a);
        bVar.a(b.class, c0013a);
    }
}
