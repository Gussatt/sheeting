package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class u extends F.e.d.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f1433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1438f;

    public static final class b extends F.e.d.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Double f1439a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1442d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f1443e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f1444f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte f1445g;

        @Override // F1.F.e.d.c.a
        public F.e.d.c a() {
            if (this.f1445g == 31) {
                return new u(this.f1439a, this.f1440b, this.f1441c, this.f1442d, this.f1443e, this.f1444f);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f1445g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.f1445g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.f1445g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.f1445g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.f1445g & 16) == 0) {
                sb.append(" diskUsed");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.c.a
        public F.e.d.c.a b(Double d4) {
            this.f1439a = d4;
            return this;
        }

        @Override // F1.F.e.d.c.a
        public F.e.d.c.a c(int i4) {
            this.f1440b = i4;
            this.f1445g = (byte) (this.f1445g | 1);
            return this;
        }

        @Override // F1.F.e.d.c.a
        public F.e.d.c.a d(long j4) {
            this.f1444f = j4;
            this.f1445g = (byte) (this.f1445g | 16);
            return this;
        }

        @Override // F1.F.e.d.c.a
        public F.e.d.c.a e(int i4) {
            this.f1442d = i4;
            this.f1445g = (byte) (this.f1445g | 4);
            return this;
        }

        @Override // F1.F.e.d.c.a
        public F.e.d.c.a f(boolean z3) {
            this.f1441c = z3;
            this.f1445g = (byte) (this.f1445g | 2);
            return this;
        }

        @Override // F1.F.e.d.c.a
        public F.e.d.c.a g(long j4) {
            this.f1443e = j4;
            this.f1445g = (byte) (this.f1445g | 8);
            return this;
        }
    }

    @Override // F1.F.e.d.c
    public Double b() {
        return this.f1433a;
    }

    @Override // F1.F.e.d.c
    public int c() {
        return this.f1434b;
    }

    @Override // F1.F.e.d.c
    public long d() {
        return this.f1438f;
    }

    @Override // F1.F.e.d.c
    public int e() {
        return this.f1436d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.c) {
            F.e.d.c cVar = (F.e.d.c) obj;
            Double d4 = this.f1433a;
            if (d4 != null ? d4.equals(cVar.b()) : cVar.b() == null) {
                if (this.f1434b == cVar.c() && this.f1435c == cVar.g() && this.f1436d == cVar.e() && this.f1437e == cVar.f() && this.f1438f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // F1.F.e.d.c
    public long f() {
        return this.f1437e;
    }

    @Override // F1.F.e.d.c
    public boolean g() {
        return this.f1435c;
    }

    public int hashCode() {
        Double d4 = this.f1433a;
        int iHashCode = ((((((((d4 == null ? 0 : d4.hashCode()) ^ 1000003) * 1000003) ^ this.f1434b) * 1000003) ^ (this.f1435c ? 1231 : 1237)) * 1000003) ^ this.f1436d) * 1000003;
        long j4 = this.f1437e;
        long j5 = this.f1438f;
        return ((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f1433a + ", batteryVelocity=" + this.f1434b + ", proximityOn=" + this.f1435c + ", orientation=" + this.f1436d + ", ramUsed=" + this.f1437e + ", diskUsed=" + this.f1438f + "}";
    }

    public u(Double d4, int i4, boolean z3, int i5, long j4, long j5) {
        this.f1433a = d4;
        this.f1434b = i4;
        this.f1435c = z3;
        this.f1436d = i5;
        this.f1437e = j4;
        this.f1438f = j5;
    }
}
