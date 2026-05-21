package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class l extends F.e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F.e.d.a f1343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.e.d.c f1344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F.e.d.AbstractC0030d f1345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F.e.d.f f1346f;

    public static final class b extends F.e.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1348b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public F.e.d.a f1349c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public F.e.d.c f1350d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public F.e.d.AbstractC0030d f1351e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public F.e.d.f f1352f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f1353g;

        @Override // F1.F.e.d.b
        public F.e.d a() {
            String str;
            F.e.d.a aVar;
            F.e.d.c cVar;
            if (this.f1353g == 1 && (str = this.f1348b) != null && (aVar = this.f1349c) != null && (cVar = this.f1350d) != null) {
                return new l(this.f1347a, str, aVar, cVar, this.f1351e, this.f1352f);
            }
            StringBuilder sb = new StringBuilder();
            if ((1 & this.f1353g) == 0) {
                sb.append(" timestamp");
            }
            if (this.f1348b == null) {
                sb.append(" type");
            }
            if (this.f1349c == null) {
                sb.append(" app");
            }
            if (this.f1350d == null) {
                sb.append(" device");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.b
        public F.e.d.b b(F.e.d.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f1349c = aVar;
            return this;
        }

        @Override // F1.F.e.d.b
        public F.e.d.b c(F.e.d.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null device");
            }
            this.f1350d = cVar;
            return this;
        }

        @Override // F1.F.e.d.b
        public F.e.d.b d(F.e.d.AbstractC0030d abstractC0030d) {
            this.f1351e = abstractC0030d;
            return this;
        }

        @Override // F1.F.e.d.b
        public F.e.d.b e(F.e.d.f fVar) {
            this.f1352f = fVar;
            return this;
        }

        @Override // F1.F.e.d.b
        public F.e.d.b f(long j4) {
            this.f1347a = j4;
            this.f1353g = (byte) (this.f1353g | 1);
            return this;
        }

        @Override // F1.F.e.d.b
        public F.e.d.b g(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f1348b = str;
            return this;
        }

        public b() {
        }

        public b(F.e.d dVar) {
            this.f1347a = dVar.f();
            this.f1348b = dVar.g();
            this.f1349c = dVar.b();
            this.f1350d = dVar.c();
            this.f1351e = dVar.d();
            this.f1352f = dVar.e();
            this.f1353g = (byte) 1;
        }
    }

    @Override // F1.F.e.d
    public F.e.d.a b() {
        return this.f1343c;
    }

    @Override // F1.F.e.d
    public F.e.d.c c() {
        return this.f1344d;
    }

    @Override // F1.F.e.d
    public F.e.d.AbstractC0030d d() {
        return this.f1345e;
    }

    @Override // F1.F.e.d
    public F.e.d.f e() {
        return this.f1346f;
    }

    public boolean equals(Object obj) {
        F.e.d.AbstractC0030d abstractC0030d;
        F.e.d.f fVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d) {
            F.e.d dVar = (F.e.d) obj;
            if (this.f1341a == dVar.f() && this.f1342b.equals(dVar.g()) && this.f1343c.equals(dVar.b()) && this.f1344d.equals(dVar.c()) && ((abstractC0030d = this.f1345e) != null ? abstractC0030d.equals(dVar.d()) : dVar.d() == null) && ((fVar = this.f1346f) != null ? fVar.equals(dVar.e()) : dVar.e() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.F.e.d
    public long f() {
        return this.f1341a;
    }

    @Override // F1.F.e.d
    public String g() {
        return this.f1342b;
    }

    @Override // F1.F.e.d
    public F.e.d.b h() {
        return new b(this);
    }

    public int hashCode() {
        long j4 = this.f1341a;
        int iHashCode = (((((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f1342b.hashCode()) * 1000003) ^ this.f1343c.hashCode()) * 1000003) ^ this.f1344d.hashCode()) * 1000003;
        F.e.d.AbstractC0030d abstractC0030d = this.f1345e;
        int iHashCode2 = (iHashCode ^ (abstractC0030d == null ? 0 : abstractC0030d.hashCode())) * 1000003;
        F.e.d.f fVar = this.f1346f;
        return iHashCode2 ^ (fVar != null ? fVar.hashCode() : 0);
    }

    public String toString() {
        return "Event{timestamp=" + this.f1341a + ", type=" + this.f1342b + ", app=" + this.f1343c + ", device=" + this.f1344d + ", log=" + this.f1345e + ", rollouts=" + this.f1346f + "}";
    }

    public l(long j4, String str, F.e.d.a aVar, F.e.d.c cVar, F.e.d.AbstractC0030d abstractC0030d, F.e.d.f fVar) {
        this.f1341a = j4;
        this.f1342b = str;
        this.f1343c = aVar;
        this.f1344d = cVar;
        this.f1345e = abstractC0030d;
        this.f1346f = fVar;
    }
}
