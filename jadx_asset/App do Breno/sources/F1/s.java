package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class s extends F.e.d.a.b.AbstractC0025e.AbstractC0027b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1417e;

    public static final class b extends F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1420c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f1421d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f1423f;

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a
        public F.e.d.a.b.AbstractC0025e.AbstractC0027b a() {
            String str;
            if (this.f1423f == 7 && (str = this.f1419b) != null) {
                return new s(this.f1418a, str, this.f1420c, this.f1421d, this.f1422e);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f1423f & 1) == 0) {
                sb.append(" pc");
            }
            if (this.f1419b == null) {
                sb.append(" symbol");
            }
            if ((this.f1423f & 2) == 0) {
                sb.append(" offset");
            }
            if ((this.f1423f & 4) == 0) {
                sb.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a
        public F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a b(String str) {
            this.f1420c = str;
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a
        public F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a c(int i4) {
            this.f1422e = i4;
            this.f1423f = (byte) (this.f1423f | 4);
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a
        public F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a d(long j4) {
            this.f1421d = j4;
            this.f1423f = (byte) (this.f1423f | 2);
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a
        public F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a e(long j4) {
            this.f1418a = j4;
            this.f1423f = (byte) (this.f1423f | 1);
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a
        public F.e.d.a.b.AbstractC0025e.AbstractC0027b.AbstractC0028a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            this.f1419b = str;
            return this;
        }
    }

    @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b
    public String b() {
        return this.f1415c;
    }

    @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b
    public int c() {
        return this.f1417e;
    }

    @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b
    public long d() {
        return this.f1416d;
    }

    @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b
    public long e() {
        return this.f1413a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0025e.AbstractC0027b) {
            F.e.d.a.b.AbstractC0025e.AbstractC0027b abstractC0027b = (F.e.d.a.b.AbstractC0025e.AbstractC0027b) obj;
            if (this.f1413a == abstractC0027b.e() && this.f1414b.equals(abstractC0027b.f()) && ((str = this.f1415c) != null ? str.equals(abstractC0027b.b()) : abstractC0027b.b() == null) && this.f1416d == abstractC0027b.d() && this.f1417e == abstractC0027b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0027b
    public String f() {
        return this.f1414b;
    }

    public int hashCode() {
        long j4 = this.f1413a;
        int iHashCode = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f1414b.hashCode()) * 1000003;
        String str = this.f1415c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j5 = this.f1416d;
        return ((iHashCode2 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f1417e;
    }

    public String toString() {
        return "Frame{pc=" + this.f1413a + ", symbol=" + this.f1414b + ", file=" + this.f1415c + ", offset=" + this.f1416d + ", importance=" + this.f1417e + "}";
    }

    public s(long j4, String str, String str2, long j5, int i4) {
        this.f1413a = j4;
        this.f1414b = str;
        this.f1415c = str2;
        this.f1416d = j5;
        this.f1417e = i4;
    }
}
