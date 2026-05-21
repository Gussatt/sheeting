package C0;

/* JADX INFO: loaded from: classes.dex */
public final class a implements P1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final P1.a f411a = new a();

    /* JADX INFO: renamed from: C0.a$a, reason: collision with other inner class name */
    public static final class C0005a implements O1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0005a f412a = new C0005a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final O1.d f413b = O1.d.a("window").b(R1.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O1.d f414c = O1.d.a("logSourceMetrics").b(R1.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final O1.d f415d = O1.d.a("globalMetrics").b(R1.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final O1.d f416e = O1.d.a("appNamespace").b(R1.a.b().c(4).a()).a();

        @Override // O1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F0.a aVar, O1.f fVar) {
            fVar.a(f413b, aVar.d());
            fVar.a(f414c, aVar.c());
            fVar.a(f415d, aVar.b());
            fVar.a(f416e, aVar.a());
        }
    }

    public static final class b implements O1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f417a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final O1.d f418b = O1.d.a("storageMetrics").b(R1.a.b().c(1).a()).a();

        @Override // O1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F0.b bVar, O1.f fVar) {
            fVar.a(f418b, bVar.a());
        }
    }

    public static final class c implements O1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f419a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final O1.d f420b = O1.d.a("eventsDroppedCount").b(R1.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O1.d f421c = O1.d.a("reason").b(R1.a.b().c(3).a()).a();

        @Override // O1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F0.c cVar, O1.f fVar) {
            fVar.f(f420b, cVar.a());
            fVar.a(f421c, cVar.b());
        }
    }

    public static final class d implements O1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f422a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final O1.d f423b = O1.d.a("logSource").b(R1.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O1.d f424c = O1.d.a("logEventDropped").b(R1.a.b().c(2).a()).a();

        @Override // O1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F0.d dVar, O1.f fVar) {
            fVar.a(f423b, dVar.b());
            fVar.a(f424c, dVar.a());
        }
    }

    public static final class e implements O1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f425a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final O1.d f426b = O1.d.d("clientMetrics");

        @Override // O1.b
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            i.d.a(obj);
            b(null, (O1.f) obj2);
        }

        public void b(m mVar, O1.f fVar) {
            throw null;
        }
    }

    public static final class f implements O1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f427a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final O1.d f428b = O1.d.a("currentCacheSizeBytes").b(R1.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O1.d f429c = O1.d.a("maxCacheSizeBytes").b(R1.a.b().c(2).a()).a();

        @Override // O1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F0.e eVar, O1.f fVar) {
            fVar.f(f428b, eVar.a());
            fVar.f(f429c, eVar.b());
        }
    }

    public static final class g implements O1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f430a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final O1.d f431b = O1.d.a("startMs").b(R1.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final O1.d f432c = O1.d.a("endMs").b(R1.a.b().c(2).a()).a();

        @Override // O1.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(F0.f fVar, O1.f fVar2) {
            fVar2.f(f431b, fVar.b());
            fVar2.f(f432c, fVar.a());
        }
    }

    @Override // P1.a
    public void a(P1.b bVar) {
        bVar.a(m.class, e.f425a);
        bVar.a(F0.a.class, C0005a.f412a);
        bVar.a(F0.f.class, g.f430a);
        bVar.a(F0.d.class, d.f422a);
        bVar.a(F0.c.class, c.f419a);
        bVar.a(F0.b.class, b.f417a);
        bVar.a(F0.e.class, f.f427a);
    }
}
