package N;

import L.n;
import L.w;
import L.x;
import W2.p;
import X2.l;
import X2.m;
import java.util.LinkedHashSet;
import java.util.Set;
import t3.AbstractC1552h;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public final class d implements w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f2777f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f2778g = new LinkedHashSet();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f2779h = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1552h f2780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N.c f2781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f2782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final W2.a f2783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K2.f f2784e;

    public static final class a extends m implements p {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f2785n = new a();

        public a() {
            super(2);
        }

        @Override // W2.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n j(J j4, AbstractC1552h abstractC1552h) {
            l.e(j4, "path");
            l.e(abstractC1552h, "<anonymous parameter 1>");
            return f.a(j4);
        }
    }

    public static final class b {
        public /* synthetic */ b(X2.g gVar) {
            this();
        }

        public final Set a() {
            return d.f2778g;
        }

        public final h b() {
            return d.f2779h;
        }

        public b() {
        }
    }

    public static final class c extends m implements W2.a {
        public c() {
            super(0);
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J e() {
            J j4 = (J) d.this.f2783d.e();
            boolean zI = j4.i();
            d dVar = d.this;
            if (zI) {
                return j4.l();
            }
            throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + dVar.f2783d + ", instead got " + j4).toString());
        }
    }

    /* JADX INFO: renamed from: N.d$d, reason: collision with other inner class name */
    public static final class C0062d extends m implements W2.a {
        public C0062d() {
            super(0);
        }

        public final void a() {
            b bVar = d.f2777f;
            h hVarB = bVar.b();
            d dVar = d.this;
            synchronized (hVarB) {
                bVar.a().remove(dVar.f().toString());
                K2.p pVar = K2.p.f2516a;
            }
        }

        @Override // W2.a
        public /* bridge */ /* synthetic */ Object e() {
            a();
            return K2.p.f2516a;
        }
    }

    public d(AbstractC1552h abstractC1552h, N.c cVar, p pVar, W2.a aVar) {
        l.e(abstractC1552h, "fileSystem");
        l.e(cVar, "serializer");
        l.e(pVar, "coordinatorProducer");
        l.e(aVar, "producePath");
        this.f2780a = abstractC1552h;
        this.f2781b = cVar;
        this.f2782c = pVar;
        this.f2783d = aVar;
        this.f2784e = K2.g.a(new c());
    }

    @Override // L.w
    public x a() {
        String string = f().toString();
        synchronized (f2779h) {
            Set set = f2778g;
            if (set.contains(string)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + string + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(string);
        }
        return new e(this.f2780a, f(), this.f2781b, (n) this.f2782c.j(f(), this.f2780a), new C0062d());
    }

    public final J f() {
        return (J) this.f2784e.getValue();
    }

    public /* synthetic */ d(AbstractC1552h abstractC1552h, N.c cVar, p pVar, W2.a aVar, int i4, X2.g gVar) {
        this(abstractC1552h, cVar, (i4 & 4) != 0 ? a.f2785n : pVar, aVar);
    }
}
