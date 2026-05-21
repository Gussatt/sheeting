package X1;

import X1.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f3934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d.b f3935e;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f3939d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d.b f3940e;

        @Override // X1.d.a
        public d a() {
            return new a(this.f3936a, this.f3937b, this.f3938c, this.f3939d, this.f3940e);
        }

        @Override // X1.d.a
        public d.a b(f fVar) {
            this.f3939d = fVar;
            return this;
        }

        @Override // X1.d.a
        public d.a c(String str) {
            this.f3937b = str;
            return this;
        }

        @Override // X1.d.a
        public d.a d(String str) {
            this.f3938c = str;
            return this;
        }

        @Override // X1.d.a
        public d.a e(d.b bVar) {
            this.f3940e = bVar;
            return this;
        }

        @Override // X1.d.a
        public d.a f(String str) {
            this.f3936a = str;
            return this;
        }
    }

    @Override // X1.d
    public f b() {
        return this.f3934d;
    }

    @Override // X1.d
    public String c() {
        return this.f3932b;
    }

    @Override // X1.d
    public String d() {
        return this.f3933c;
    }

    @Override // X1.d
    public d.b e() {
        return this.f3935e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f3931a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f3932b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f3933c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f3934d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f3935e;
                            if (bVar != null ? bVar.equals(dVar.e()) : dVar.e() == null) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // X1.d
    public String f() {
        return this.f3931a;
    }

    public int hashCode() {
        String str = this.f3931a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f3932b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3933c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f3934d;
        int iHashCode4 = (iHashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f3935e;
        return iHashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f3931a + ", fid=" + this.f3932b + ", refreshToken=" + this.f3933c + ", authToken=" + this.f3934d + ", responseCode=" + this.f3935e + "}";
    }

    public a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f3931a = str;
        this.f3932b = str2;
        this.f3933c = str3;
        this.f3934d = fVar;
        this.f3935e = bVar;
    }
}
