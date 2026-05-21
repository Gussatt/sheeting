package B0;

import B0.w;

/* JADX INFO: loaded from: classes.dex */
public final class m extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w.c f168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w.b f169b;

    public static final class b extends w.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w.c f170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w.b f171b;

        @Override // B0.w.a
        public w a() {
            return new m(this.f170a, this.f171b);
        }

        @Override // B0.w.a
        public w.a b(w.b bVar) {
            this.f171b = bVar;
            return this;
        }

        @Override // B0.w.a
        public w.a c(w.c cVar) {
            this.f170a = cVar;
            return this;
        }
    }

    @Override // B0.w
    public w.b b() {
        return this.f169b;
    }

    @Override // B0.w
    public w.c c() {
        return this.f168a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            w.c cVar = this.f168a;
            if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
                w.b bVar = this.f169b;
                if (bVar != null ? bVar.equals(wVar.b()) : wVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        w.c cVar = this.f168a;
        int iHashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        w.b bVar = this.f169b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f168a + ", mobileSubtype=" + this.f169b + "}";
    }

    public m(w.c cVar, w.b bVar) {
        this.f168a = cVar;
        this.f169b = bVar;
    }
}
