package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class o extends F.e.d.a.b.AbstractC0019a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1382d;

    public static final class b extends F.e.d.a.b.AbstractC0019a.AbstractC0020a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f1387e;

        @Override // F1.F.e.d.a.b.AbstractC0019a.AbstractC0020a
        public F.e.d.a.b.AbstractC0019a a() {
            String str;
            if (this.f1387e == 3 && (str = this.f1385c) != null) {
                return new o(this.f1383a, this.f1384b, str, this.f1386d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f1387e & 1) == 0) {
                sb.append(" baseAddress");
            }
            if ((this.f1387e & 2) == 0) {
                sb.append(" size");
            }
            if (this.f1385c == null) {
                sb.append(" name");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.a.b.AbstractC0019a.AbstractC0020a
        public F.e.d.a.b.AbstractC0019a.AbstractC0020a b(long j4) {
            this.f1383a = j4;
            this.f1387e = (byte) (this.f1387e | 1);
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0019a.AbstractC0020a
        public F.e.d.a.b.AbstractC0019a.AbstractC0020a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f1385c = str;
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0019a.AbstractC0020a
        public F.e.d.a.b.AbstractC0019a.AbstractC0020a d(long j4) {
            this.f1384b = j4;
            this.f1387e = (byte) (this.f1387e | 2);
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0019a.AbstractC0020a
        public F.e.d.a.b.AbstractC0019a.AbstractC0020a e(String str) {
            this.f1386d = str;
            return this;
        }
    }

    @Override // F1.F.e.d.a.b.AbstractC0019a
    public long b() {
        return this.f1379a;
    }

    @Override // F1.F.e.d.a.b.AbstractC0019a
    public String c() {
        return this.f1381c;
    }

    @Override // F1.F.e.d.a.b.AbstractC0019a
    public long d() {
        return this.f1380b;
    }

    @Override // F1.F.e.d.a.b.AbstractC0019a
    public String e() {
        return this.f1382d;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0019a) {
            F.e.d.a.b.AbstractC0019a abstractC0019a = (F.e.d.a.b.AbstractC0019a) obj;
            if (this.f1379a == abstractC0019a.b() && this.f1380b == abstractC0019a.d() && this.f1381c.equals(abstractC0019a.c()) && ((str = this.f1382d) != null ? str.equals(abstractC0019a.e()) : abstractC0019a.e() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j4 = this.f1379a;
        long j5 = this.f1380b;
        int iHashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f1381c.hashCode()) * 1000003;
        String str = this.f1382d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f1379a + ", size=" + this.f1380b + ", name=" + this.f1381c + ", uuid=" + this.f1382d + "}";
    }

    public o(long j4, long j5, String str, String str2) {
        this.f1379a = j4;
        this.f1380b = j5;
        this.f1381c = str;
        this.f1382d = str2;
    }
}
