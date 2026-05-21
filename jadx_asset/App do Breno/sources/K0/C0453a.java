package K0;

import K0.AbstractC0457e;

/* JADX INFO: renamed from: K0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0453a extends AbstractC0457e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f2420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2421f;

    /* JADX INFO: renamed from: K0.a$b */
    public static final class b extends AbstractC0457e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f2422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f2423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f2424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f2425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Integer f2426e;

        @Override // K0.AbstractC0457e.a
        public AbstractC0457e a() {
            String str = "";
            if (this.f2422a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f2423b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f2424c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f2425d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f2426e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C0453a(this.f2422a.longValue(), this.f2423b.intValue(), this.f2424c.intValue(), this.f2425d.longValue(), this.f2426e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // K0.AbstractC0457e.a
        public AbstractC0457e.a b(int i4) {
            this.f2424c = Integer.valueOf(i4);
            return this;
        }

        @Override // K0.AbstractC0457e.a
        public AbstractC0457e.a c(long j4) {
            this.f2425d = Long.valueOf(j4);
            return this;
        }

        @Override // K0.AbstractC0457e.a
        public AbstractC0457e.a d(int i4) {
            this.f2423b = Integer.valueOf(i4);
            return this;
        }

        @Override // K0.AbstractC0457e.a
        public AbstractC0457e.a e(int i4) {
            this.f2426e = Integer.valueOf(i4);
            return this;
        }

        @Override // K0.AbstractC0457e.a
        public AbstractC0457e.a f(long j4) {
            this.f2422a = Long.valueOf(j4);
            return this;
        }
    }

    @Override // K0.AbstractC0457e
    public int b() {
        return this.f2419d;
    }

    @Override // K0.AbstractC0457e
    public long c() {
        return this.f2420e;
    }

    @Override // K0.AbstractC0457e
    public int d() {
        return this.f2418c;
    }

    @Override // K0.AbstractC0457e
    public int e() {
        return this.f2421f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0457e) {
            AbstractC0457e abstractC0457e = (AbstractC0457e) obj;
            if (this.f2417b == abstractC0457e.f() && this.f2418c == abstractC0457e.d() && this.f2419d == abstractC0457e.b() && this.f2420e == abstractC0457e.c() && this.f2421f == abstractC0457e.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // K0.AbstractC0457e
    public long f() {
        return this.f2417b;
    }

    public int hashCode() {
        long j4 = this.f2417b;
        int i4 = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f2418c) * 1000003) ^ this.f2419d) * 1000003;
        long j5 = this.f2420e;
        return ((i4 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f2421f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f2417b + ", loadBatchSize=" + this.f2418c + ", criticalSectionEnterTimeoutMs=" + this.f2419d + ", eventCleanUpAge=" + this.f2420e + ", maxBlobByteSizePerRow=" + this.f2421f + "}";
    }

    public C0453a(long j4, int i4, int i5, long j5, int i6) {
        this.f2417b = j4;
        this.f2418c = i4;
        this.f2419d = i5;
        this.f2420e = j5;
        this.f2421f = i6;
    }
}
