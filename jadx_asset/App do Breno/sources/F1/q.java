package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class q extends F.e.d.a.b.AbstractC0023d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f1401c;

    public static final class b extends F.e.d.a.b.AbstractC0023d.AbstractC0024a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f1404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f1405d;

        @Override // F1.F.e.d.a.b.AbstractC0023d.AbstractC0024a
        public F.e.d.a.b.AbstractC0023d a() {
            String str;
            String str2;
            if (this.f1405d == 1 && (str = this.f1402a) != null && (str2 = this.f1403b) != null) {
                return new q(str, str2, this.f1404c);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1402a == null) {
                sb.append(" name");
            }
            if (this.f1403b == null) {
                sb.append(" code");
            }
            if ((1 & this.f1405d) == 0) {
                sb.append(" address");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.a.b.AbstractC0023d.AbstractC0024a
        public F.e.d.a.b.AbstractC0023d.AbstractC0024a b(long j4) {
            this.f1404c = j4;
            this.f1405d = (byte) (this.f1405d | 1);
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0023d.AbstractC0024a
        public F.e.d.a.b.AbstractC0023d.AbstractC0024a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null code");
            }
            this.f1403b = str;
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0023d.AbstractC0024a
        public F.e.d.a.b.AbstractC0023d.AbstractC0024a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f1402a = str;
            return this;
        }
    }

    @Override // F1.F.e.d.a.b.AbstractC0023d
    public long b() {
        return this.f1401c;
    }

    @Override // F1.F.e.d.a.b.AbstractC0023d
    public String c() {
        return this.f1400b;
    }

    @Override // F1.F.e.d.a.b.AbstractC0023d
    public String d() {
        return this.f1399a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0023d) {
            F.e.d.a.b.AbstractC0023d abstractC0023d = (F.e.d.a.b.AbstractC0023d) obj;
            if (this.f1399a.equals(abstractC0023d.d()) && this.f1400b.equals(abstractC0023d.c()) && this.f1401c == abstractC0023d.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f1399a.hashCode() ^ 1000003) * 1000003) ^ this.f1400b.hashCode()) * 1000003;
        long j4 = this.f1401c;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f1399a + ", code=" + this.f1400b + ", address=" + this.f1401c + "}";
    }

    public q(String str, String str2, long j4) {
        this.f1399a = str;
        this.f1400b = str2;
        this.f1401c = j4;
    }
}
