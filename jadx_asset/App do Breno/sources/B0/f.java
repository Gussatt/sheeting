package B0;

import B0.p;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p.b f124b;

    public static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f125a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p.b f126b;

        @Override // B0.p.a
        public p a() {
            return new f(this.f125a, this.f126b);
        }

        @Override // B0.p.a
        public p.a b(s sVar) {
            this.f125a = sVar;
            return this;
        }

        @Override // B0.p.a
        public p.a c(p.b bVar) {
            this.f126b = bVar;
            return this;
        }
    }

    @Override // B0.p
    public s b() {
        return this.f123a;
    }

    @Override // B0.p
    public p.b c() {
        return this.f124b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            s sVar = this.f123a;
            if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
                p.b bVar = this.f124b;
                if (bVar != null ? bVar.equals(pVar.c()) : pVar.c() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        s sVar = this.f123a;
        int iHashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        p.b bVar = this.f124b;
        return iHashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f123a + ", productIdOrigin=" + this.f124b + "}";
    }

    public f(s sVar, p.b bVar) {
        this.f123a = sVar;
        this.f124b = bVar;
    }
}
