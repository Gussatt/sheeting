package V1;

import V1.m;

/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3730c;

    public static final class b extends m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f3732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f3733c;

        @Override // V1.m.a
        public m a() {
            String str = "";
            if (this.f3731a == null) {
                str = " token";
            }
            if (this.f3732b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f3733c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f3731a, this.f3732b.longValue(), this.f3733c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // V1.m.a
        public m.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f3731a = str;
            return this;
        }

        @Override // V1.m.a
        public m.a c(long j4) {
            this.f3733c = Long.valueOf(j4);
            return this;
        }

        @Override // V1.m.a
        public m.a d(long j4) {
            this.f3732b = Long.valueOf(j4);
            return this;
        }
    }

    @Override // V1.m
    public String b() {
        return this.f3728a;
    }

    @Override // V1.m
    public long c() {
        return this.f3730c;
    }

    @Override // V1.m
    public long d() {
        return this.f3729b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f3728a.equals(mVar.b()) && this.f3729b == mVar.d() && this.f3730c == mVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f3728a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f3729b;
        long j5 = this.f3730c;
        return ((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f3728a + ", tokenExpirationTimestamp=" + this.f3729b + ", tokenCreationTimestamp=" + this.f3730c + "}";
    }

    public a(String str, long j4, long j5) {
        this.f3728a = str;
        this.f3729b = j4;
        this.f3730c = j5;
    }
}
