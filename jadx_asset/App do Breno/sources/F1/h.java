package F1;

import F1.F;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h extends F.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f1289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F.e.a f1291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final F.e.f f1292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final F.e.AbstractC0032e f1293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F.e.c f1294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f1295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f1296l;

    public static final class b extends F.e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1297a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1298b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1299c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f1300d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f1301e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1302f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public F.e.a f1303g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public F.e.f f1304h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public F.e.AbstractC0032e f1305i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public F.e.c f1306j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List f1307k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f1308l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public byte f1309m;

        @Override // F1.F.e.b
        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.f1309m == 7 && (str = this.f1297a) != null && (str2 = this.f1298b) != null && (aVar = this.f1303g) != null) {
                return new h(str, str2, this.f1299c, this.f1300d, this.f1301e, this.f1302f, aVar, this.f1304h, this.f1305i, this.f1306j, this.f1307k, this.f1308l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1297a == null) {
                sb.append(" generator");
            }
            if (this.f1298b == null) {
                sb.append(" identifier");
            }
            if ((this.f1309m & 1) == 0) {
                sb.append(" startedAt");
            }
            if ((this.f1309m & 2) == 0) {
                sb.append(" crashed");
            }
            if (this.f1303g == null) {
                sb.append(" app");
            }
            if ((this.f1309m & 4) == 0) {
                sb.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.b
        public F.e.b b(F.e.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null app");
            }
            this.f1303g = aVar;
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b c(String str) {
            this.f1299c = str;
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b d(boolean z3) {
            this.f1302f = z3;
            this.f1309m = (byte) (this.f1309m | 2);
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b e(F.e.c cVar) {
            this.f1306j = cVar;
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b f(Long l4) {
            this.f1301e = l4;
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b g(List list) {
            this.f1307k = list;
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null generator");
            }
            this.f1297a = str;
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b i(int i4) {
            this.f1308l = i4;
            this.f1309m = (byte) (this.f1309m | 4);
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b j(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f1298b = str;
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b l(F.e.AbstractC0032e abstractC0032e) {
            this.f1305i = abstractC0032e;
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b m(long j4) {
            this.f1300d = j4;
            this.f1309m = (byte) (this.f1309m | 1);
            return this;
        }

        @Override // F1.F.e.b
        public F.e.b n(F.e.f fVar) {
            this.f1304h = fVar;
            return this;
        }

        public b() {
        }

        public b(F.e eVar) {
            this.f1297a = eVar.g();
            this.f1298b = eVar.i();
            this.f1299c = eVar.c();
            this.f1300d = eVar.l();
            this.f1301e = eVar.e();
            this.f1302f = eVar.n();
            this.f1303g = eVar.b();
            this.f1304h = eVar.m();
            this.f1305i = eVar.k();
            this.f1306j = eVar.d();
            this.f1307k = eVar.f();
            this.f1308l = eVar.h();
            this.f1309m = (byte) 7;
        }
    }

    @Override // F1.F.e
    public F.e.a b() {
        return this.f1291g;
    }

    @Override // F1.F.e
    public String c() {
        return this.f1287c;
    }

    @Override // F1.F.e
    public F.e.c d() {
        return this.f1294j;
    }

    @Override // F1.F.e
    public Long e() {
        return this.f1289e;
    }

    public boolean equals(Object obj) {
        String str;
        Long l4;
        F.e.f fVar;
        F.e.AbstractC0032e abstractC0032e;
        F.e.c cVar;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e) {
            F.e eVar = (F.e) obj;
            if (this.f1285a.equals(eVar.g()) && this.f1286b.equals(eVar.i()) && ((str = this.f1287c) != null ? str.equals(eVar.c()) : eVar.c() == null) && this.f1288d == eVar.l() && ((l4 = this.f1289e) != null ? l4.equals(eVar.e()) : eVar.e() == null) && this.f1290f == eVar.n() && this.f1291g.equals(eVar.b()) && ((fVar = this.f1292h) != null ? fVar.equals(eVar.m()) : eVar.m() == null) && ((abstractC0032e = this.f1293i) != null ? abstractC0032e.equals(eVar.k()) : eVar.k() == null) && ((cVar = this.f1294j) != null ? cVar.equals(eVar.d()) : eVar.d() == null) && ((list = this.f1295k) != null ? list.equals(eVar.f()) : eVar.f() == null) && this.f1296l == eVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.F.e
    public List f() {
        return this.f1295k;
    }

    @Override // F1.F.e
    public String g() {
        return this.f1285a;
    }

    @Override // F1.F.e
    public int h() {
        return this.f1296l;
    }

    public int hashCode() {
        int iHashCode = (((this.f1285a.hashCode() ^ 1000003) * 1000003) ^ this.f1286b.hashCode()) * 1000003;
        String str = this.f1287c;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        long j4 = this.f1288d;
        int i4 = (((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        Long l4 = this.f1289e;
        int iHashCode3 = (((((i4 ^ (l4 == null ? 0 : l4.hashCode())) * 1000003) ^ (this.f1290f ? 1231 : 1237)) * 1000003) ^ this.f1291g.hashCode()) * 1000003;
        F.e.f fVar = this.f1292h;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        F.e.AbstractC0032e abstractC0032e = this.f1293i;
        int iHashCode5 = (iHashCode4 ^ (abstractC0032e == null ? 0 : abstractC0032e.hashCode())) * 1000003;
        F.e.c cVar = this.f1294j;
        int iHashCode6 = (iHashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list = this.f1295k;
        return ((iHashCode6 ^ (list != null ? list.hashCode() : 0)) * 1000003) ^ this.f1296l;
    }

    @Override // F1.F.e
    public String i() {
        return this.f1286b;
    }

    @Override // F1.F.e
    public F.e.AbstractC0032e k() {
        return this.f1293i;
    }

    @Override // F1.F.e
    public long l() {
        return this.f1288d;
    }

    @Override // F1.F.e
    public F.e.f m() {
        return this.f1292h;
    }

    @Override // F1.F.e
    public boolean n() {
        return this.f1290f;
    }

    @Override // F1.F.e
    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f1285a + ", identifier=" + this.f1286b + ", appQualitySessionId=" + this.f1287c + ", startedAt=" + this.f1288d + ", endedAt=" + this.f1289e + ", crashed=" + this.f1290f + ", app=" + this.f1291g + ", user=" + this.f1292h + ", os=" + this.f1293i + ", device=" + this.f1294j + ", events=" + this.f1295k + ", generatorType=" + this.f1296l + "}";
    }

    public h(String str, String str2, String str3, long j4, Long l4, boolean z3, F.e.a aVar, F.e.f fVar, F.e.AbstractC0032e abstractC0032e, F.e.c cVar, List list, int i4) {
        this.f1285a = str;
        this.f1286b = str2;
        this.f1287c = str3;
        this.f1288d = j4;
        this.f1289e = l4;
        this.f1290f = z3;
        this.f1291g = aVar;
        this.f1292h = fVar;
        this.f1293i = abstractC0032e;
        this.f1294j = cVar;
        this.f1295k = list;
        this.f1296l = i4;
    }
}
