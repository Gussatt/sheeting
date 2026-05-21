package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class z extends F.e.AbstractC0032e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1466d;

    public static final class b extends F.e.AbstractC0032e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f1471e;

        @Override // F1.F.e.AbstractC0032e.a
        public F.e.AbstractC0032e a() {
            String str;
            String str2;
            if (this.f1471e == 3 && (str = this.f1468b) != null && (str2 = this.f1469c) != null) {
                return new z(this.f1467a, str, str2, this.f1470d);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f1471e & 1) == 0) {
                sb.append(" platform");
            }
            if (this.f1468b == null) {
                sb.append(" version");
            }
            if (this.f1469c == null) {
                sb.append(" buildVersion");
            }
            if ((this.f1471e & 2) == 0) {
                sb.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.AbstractC0032e.a
        public F.e.AbstractC0032e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f1469c = str;
            return this;
        }

        @Override // F1.F.e.AbstractC0032e.a
        public F.e.AbstractC0032e.a c(boolean z3) {
            this.f1470d = z3;
            this.f1471e = (byte) (this.f1471e | 2);
            return this;
        }

        @Override // F1.F.e.AbstractC0032e.a
        public F.e.AbstractC0032e.a d(int i4) {
            this.f1467a = i4;
            this.f1471e = (byte) (this.f1471e | 1);
            return this;
        }

        @Override // F1.F.e.AbstractC0032e.a
        public F.e.AbstractC0032e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f1468b = str;
            return this;
        }
    }

    @Override // F1.F.e.AbstractC0032e
    public String b() {
        return this.f1465c;
    }

    @Override // F1.F.e.AbstractC0032e
    public int c() {
        return this.f1463a;
    }

    @Override // F1.F.e.AbstractC0032e
    public String d() {
        return this.f1464b;
    }

    @Override // F1.F.e.AbstractC0032e
    public boolean e() {
        return this.f1466d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.AbstractC0032e) {
            F.e.AbstractC0032e abstractC0032e = (F.e.AbstractC0032e) obj;
            if (this.f1463a == abstractC0032e.c() && this.f1464b.equals(abstractC0032e.d()) && this.f1465c.equals(abstractC0032e.b()) && this.f1466d == abstractC0032e.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f1463a ^ 1000003) * 1000003) ^ this.f1464b.hashCode()) * 1000003) ^ this.f1465c.hashCode()) * 1000003) ^ (this.f1466d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f1463a + ", version=" + this.f1464b + ", buildVersion=" + this.f1465c + ", jailbroken=" + this.f1466d + "}";
    }

    public z(int i4, String str, String str2, boolean z3) {
        this.f1463a = i4;
        this.f1464b = str;
        this.f1465c = str2;
        this.f1466d = z3;
    }
}
