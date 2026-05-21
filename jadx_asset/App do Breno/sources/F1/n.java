package F1;

import F1.F;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n extends F.e.d.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f1369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.e.d.a.b.c f1370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F.a f1371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.e.d.a.b.AbstractC0023d f1372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f1373e;

    public static final class b extends F.e.d.a.b.AbstractC0021b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f1374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public F.e.d.a.b.c f1375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public F.a f1376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public F.e.d.a.b.AbstractC0023d f1377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public List f1378e;

        @Override // F1.F.e.d.a.b.AbstractC0021b
        public F.e.d.a.b a() {
            List list;
            F.e.d.a.b.AbstractC0023d abstractC0023d = this.f1377d;
            if (abstractC0023d != null && (list = this.f1378e) != null) {
                return new n(this.f1374a, this.f1375b, this.f1376c, abstractC0023d, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1377d == null) {
                sb.append(" signal");
            }
            if (this.f1378e == null) {
                sb.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.a.b.AbstractC0021b
        public F.e.d.a.b.AbstractC0021b b(F.a aVar) {
            this.f1376c = aVar;
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0021b
        public F.e.d.a.b.AbstractC0021b c(List list) {
            if (list == null) {
                throw new NullPointerException("Null binaries");
            }
            this.f1378e = list;
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0021b
        public F.e.d.a.b.AbstractC0021b d(F.e.d.a.b.c cVar) {
            this.f1375b = cVar;
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0021b
        public F.e.d.a.b.AbstractC0021b e(F.e.d.a.b.AbstractC0023d abstractC0023d) {
            if (abstractC0023d == null) {
                throw new NullPointerException("Null signal");
            }
            this.f1377d = abstractC0023d;
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0021b
        public F.e.d.a.b.AbstractC0021b f(List list) {
            this.f1374a = list;
            return this;
        }
    }

    @Override // F1.F.e.d.a.b
    public F.a b() {
        return this.f1371c;
    }

    @Override // F1.F.e.d.a.b
    public List c() {
        return this.f1373e;
    }

    @Override // F1.F.e.d.a.b
    public F.e.d.a.b.c d() {
        return this.f1370b;
    }

    @Override // F1.F.e.d.a.b
    public F.e.d.a.b.AbstractC0023d e() {
        return this.f1372d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b) {
            F.e.d.a.b bVar = (F.e.d.a.b) obj;
            List list = this.f1369a;
            if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
                F.e.d.a.b.c cVar = this.f1370b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    F.a aVar = this.f1371c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f1372d.equals(bVar.e()) && this.f1373e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // F1.F.e.d.a.b
    public List f() {
        return this.f1369a;
    }

    public int hashCode() {
        List list = this.f1369a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.f1370b;
        int iHashCode2 = (iHashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        F.a aVar = this.f1371c;
        return ((((iHashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f1372d.hashCode()) * 1000003) ^ this.f1373e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f1369a + ", exception=" + this.f1370b + ", appExitInfo=" + this.f1371c + ", signal=" + this.f1372d + ", binaries=" + this.f1373e + "}";
    }

    public n(List list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.AbstractC0023d abstractC0023d, List list2) {
        this.f1369a = list;
        this.f1370b = cVar;
        this.f1371c = aVar;
        this.f1372d = abstractC0023d;
        this.f1373e = list2;
    }
}
