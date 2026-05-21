package X1;

import X1.f;

/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.b f3943c;

    /* JADX INFO: renamed from: X1.b$b, reason: collision with other inner class name */
    public static final class C0082b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f3945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f.b f3946c;

        @Override // X1.f.a
        public f a() {
            String str = "";
            if (this.f3945b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f3944a, this.f3945b.longValue(), this.f3946c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // X1.f.a
        public f.a b(f.b bVar) {
            this.f3946c = bVar;
            return this;
        }

        @Override // X1.f.a
        public f.a c(String str) {
            this.f3944a = str;
            return this;
        }

        @Override // X1.f.a
        public f.a d(long j4) {
            this.f3945b = Long.valueOf(j4);
            return this;
        }
    }

    @Override // X1.f
    public f.b b() {
        return this.f3943c;
    }

    @Override // X1.f
    public String c() {
        return this.f3941a;
    }

    @Override // X1.f
    public long d() {
        return this.f3942b;
    }

    public boolean equals(Object obj) {
        f.b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f3941a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f3942b == fVar.d() && ((bVar = this.f3943c) != null ? bVar.equals(fVar.b()) : fVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f3941a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j4 = this.f3942b;
        int i4 = (((iHashCode ^ 1000003) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        f.b bVar = this.f3943c;
        return i4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f3941a + ", tokenExpirationTimestamp=" + this.f3942b + ", responseCode=" + this.f3943c + "}";
    }

    public b(String str, long j4, f.b bVar) {
        this.f3941a = str;
        this.f3942b = j4;
        this.f3943c = bVar;
    }
}
