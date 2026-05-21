package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class w extends F.e.d.AbstractC0031e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.e.d.AbstractC0031e.b f1448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1451d;

    public static final class b extends F.e.d.AbstractC0031e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public F.e.d.AbstractC0031e.b f1452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f1455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f1456e;

        @Override // F1.F.e.d.AbstractC0031e.a
        public F.e.d.AbstractC0031e a() {
            F.e.d.AbstractC0031e.b bVar;
            String str;
            String str2;
            if (this.f1456e == 1 && (bVar = this.f1452a) != null && (str = this.f1453b) != null && (str2 = this.f1454c) != null) {
                return new w(bVar, str, str2, this.f1455d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1452a == null) {
                sb.append(" rolloutVariant");
            }
            if (this.f1453b == null) {
                sb.append(" parameterKey");
            }
            if (this.f1454c == null) {
                sb.append(" parameterValue");
            }
            if ((1 & this.f1456e) == 0) {
                sb.append(" templateVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.AbstractC0031e.a
        public F.e.d.AbstractC0031e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterKey");
            }
            this.f1453b = str;
            return this;
        }

        @Override // F1.F.e.d.AbstractC0031e.a
        public F.e.d.AbstractC0031e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null parameterValue");
            }
            this.f1454c = str;
            return this;
        }

        @Override // F1.F.e.d.AbstractC0031e.a
        public F.e.d.AbstractC0031e.a d(F.e.d.AbstractC0031e.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null rolloutVariant");
            }
            this.f1452a = bVar;
            return this;
        }

        @Override // F1.F.e.d.AbstractC0031e.a
        public F.e.d.AbstractC0031e.a e(long j4) {
            this.f1455d = j4;
            this.f1456e = (byte) (this.f1456e | 1);
            return this;
        }
    }

    @Override // F1.F.e.d.AbstractC0031e
    public String b() {
        return this.f1449b;
    }

    @Override // F1.F.e.d.AbstractC0031e
    public String c() {
        return this.f1450c;
    }

    @Override // F1.F.e.d.AbstractC0031e
    public F.e.d.AbstractC0031e.b d() {
        return this.f1448a;
    }

    @Override // F1.F.e.d.AbstractC0031e
    public long e() {
        return this.f1451d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0031e) {
            F.e.d.AbstractC0031e abstractC0031e = (F.e.d.AbstractC0031e) obj;
            if (this.f1448a.equals(abstractC0031e.d()) && this.f1449b.equals(abstractC0031e.b()) && this.f1450c.equals(abstractC0031e.c()) && this.f1451d == abstractC0031e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.f1448a.hashCode() ^ 1000003) * 1000003) ^ this.f1449b.hashCode()) * 1000003) ^ this.f1450c.hashCode()) * 1000003;
        long j4 = this.f1451d;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutVariant=" + this.f1448a + ", parameterKey=" + this.f1449b + ", parameterValue=" + this.f1450c + ", templateVersion=" + this.f1451d + "}";
    }

    public w(F.e.d.AbstractC0031e.b bVar, String str, String str2, long j4) {
        this.f1448a = bVar;
        this.f1449b = str;
        this.f1450c = str2;
        this.f1451d = j4;
    }
}
