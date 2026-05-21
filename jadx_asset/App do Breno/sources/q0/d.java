package q0;

import android.graphics.Rect;
import q0.c;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11023d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.b f11024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f11025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.b f11026c;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final void a(n0.b bVar) {
            X2.l.e(bVar, "bounds");
            if (bVar.d() == 0 && bVar.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bVar.b() != 0 && bVar.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f11027b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f11028c = new b("FOLD");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f11029d = new b("HINGE");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11030a;

        public static final class a {
            public /* synthetic */ a(X2.g gVar) {
                this();
            }

            public final b a() {
                return b.f11028c;
            }

            public final b b() {
                return b.f11029d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f11030a = str;
        }

        public String toString() {
            return this.f11030a;
        }
    }

    public d(n0.b bVar, b bVar2, c.b bVar3) {
        X2.l.e(bVar, "featureBounds");
        X2.l.e(bVar2, "type");
        X2.l.e(bVar3, "state");
        this.f11024a = bVar;
        this.f11025b = bVar2;
        this.f11026c = bVar3;
        f11023d.a(bVar);
    }

    @Override // q0.InterfaceC1491a
    public Rect a() {
        return this.f11024a.f();
    }

    @Override // q0.c
    public c.b b() {
        return this.f11026c;
    }

    @Override // q0.c
    public c.a c() {
        return (this.f11024a.d() == 0 || this.f11024a.a() == 0) ? c.a.f11016c : c.a.f11017d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!X2.l.a(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        X2.l.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) obj;
        return X2.l.a(this.f11024a, dVar.f11024a) && X2.l.a(this.f11025b, dVar.f11025b) && X2.l.a(b(), dVar.b());
    }

    public int hashCode() {
        return (((this.f11024a.hashCode() * 31) + this.f11025b.hashCode()) * 31) + b().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.f11024a + ", type=" + this.f11025b + ", state=" + b() + " }";
    }
}
