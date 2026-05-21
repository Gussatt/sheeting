package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class k extends F.e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1330i;

    public static final class b extends F.e.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f1334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f1335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f1338h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f1339i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte f1340j;

        @Override // F1.F.e.c.a
        public F.e.c a() {
            String str;
            String str2;
            String str3;
            if (this.f1340j == 63 && (str = this.f1332b) != null && (str2 = this.f1338h) != null && (str3 = this.f1339i) != null) {
                return new k(this.f1331a, str, this.f1333c, this.f1334d, this.f1335e, this.f1336f, this.f1337g, str2, str3);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f1340j & 1) == 0) {
                sb.append(" arch");
            }
            if (this.f1332b == null) {
                sb.append(" model");
            }
            if ((this.f1340j & 2) == 0) {
                sb.append(" cores");
            }
            if ((this.f1340j & 4) == 0) {
                sb.append(" ram");
            }
            if ((this.f1340j & 8) == 0) {
                sb.append(" diskSpace");
            }
            if ((this.f1340j & 16) == 0) {
                sb.append(" simulator");
            }
            if ((this.f1340j & 32) == 0) {
                sb.append(" state");
            }
            if (this.f1338h == null) {
                sb.append(" manufacturer");
            }
            if (this.f1339i == null) {
                sb.append(" modelClass");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.c.a
        public F.e.c.a b(int i4) {
            this.f1331a = i4;
            this.f1340j = (byte) (this.f1340j | 1);
            return this;
        }

        @Override // F1.F.e.c.a
        public F.e.c.a c(int i4) {
            this.f1333c = i4;
            this.f1340j = (byte) (this.f1340j | 2);
            return this;
        }

        @Override // F1.F.e.c.a
        public F.e.c.a d(long j4) {
            this.f1335e = j4;
            this.f1340j = (byte) (this.f1340j | 8);
            return this;
        }

        @Override // F1.F.e.c.a
        public F.e.c.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null manufacturer");
            }
            this.f1338h = str;
            return this;
        }

        @Override // F1.F.e.c.a
        public F.e.c.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null model");
            }
            this.f1332b = str;
            return this;
        }

        @Override // F1.F.e.c.a
        public F.e.c.a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null modelClass");
            }
            this.f1339i = str;
            return this;
        }

        @Override // F1.F.e.c.a
        public F.e.c.a h(long j4) {
            this.f1334d = j4;
            this.f1340j = (byte) (this.f1340j | 4);
            return this;
        }

        @Override // F1.F.e.c.a
        public F.e.c.a i(boolean z3) {
            this.f1336f = z3;
            this.f1340j = (byte) (this.f1340j | 16);
            return this;
        }

        @Override // F1.F.e.c.a
        public F.e.c.a j(int i4) {
            this.f1337g = i4;
            this.f1340j = (byte) (this.f1340j | 32);
            return this;
        }
    }

    @Override // F1.F.e.c
    public int b() {
        return this.f1322a;
    }

    @Override // F1.F.e.c
    public int c() {
        return this.f1324c;
    }

    @Override // F1.F.e.c
    public long d() {
        return this.f1326e;
    }

    @Override // F1.F.e.c
    public String e() {
        return this.f1329h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.c) {
            F.e.c cVar = (F.e.c) obj;
            if (this.f1322a == cVar.b() && this.f1323b.equals(cVar.f()) && this.f1324c == cVar.c() && this.f1325d == cVar.h() && this.f1326e == cVar.d() && this.f1327f == cVar.j() && this.f1328g == cVar.i() && this.f1329h.equals(cVar.e()) && this.f1330i.equals(cVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.F.e.c
    public String f() {
        return this.f1323b;
    }

    @Override // F1.F.e.c
    public String g() {
        return this.f1330i;
    }

    @Override // F1.F.e.c
    public long h() {
        return this.f1325d;
    }

    public int hashCode() {
        int iHashCode = (((((this.f1322a ^ 1000003) * 1000003) ^ this.f1323b.hashCode()) * 1000003) ^ this.f1324c) * 1000003;
        long j4 = this.f1325d;
        int i4 = (iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f1326e;
        return ((((((((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ (this.f1327f ? 1231 : 1237)) * 1000003) ^ this.f1328g) * 1000003) ^ this.f1329h.hashCode()) * 1000003) ^ this.f1330i.hashCode();
    }

    @Override // F1.F.e.c
    public int i() {
        return this.f1328g;
    }

    @Override // F1.F.e.c
    public boolean j() {
        return this.f1327f;
    }

    public String toString() {
        return "Device{arch=" + this.f1322a + ", model=" + this.f1323b + ", cores=" + this.f1324c + ", ram=" + this.f1325d + ", diskSpace=" + this.f1326e + ", simulator=" + this.f1327f + ", state=" + this.f1328g + ", manufacturer=" + this.f1329h + ", modelClass=" + this.f1330i + "}";
    }

    public k(int i4, String str, int i5, long j4, long j5, boolean z3, int i6, String str2, String str3) {
        this.f1322a = i4;
        this.f1323b = str;
        this.f1324c = i5;
        this.f1325d = j4;
        this.f1326e = j5;
        this.f1327f = z3;
        this.f1328g = i6;
        this.f1329h = str2;
        this.f1330i = str3;
    }
}
