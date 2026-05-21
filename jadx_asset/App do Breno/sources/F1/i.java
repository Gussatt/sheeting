package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class i extends F.e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1315f;

    public static final class b extends F.e.a.AbstractC0017a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f1320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f1321f;

        @Override // F1.F.e.a.AbstractC0017a
        public F.e.a a() {
            String str;
            String str2 = this.f1316a;
            if (str2 != null && (str = this.f1317b) != null) {
                return new i(str2, str, this.f1318c, null, this.f1319d, this.f1320e, this.f1321f);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1316a == null) {
                sb.append(" identifier");
            }
            if (this.f1317b == null) {
                sb.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.a.AbstractC0017a
        public F.e.a.AbstractC0017a b(String str) {
            this.f1320e = str;
            return this;
        }

        @Override // F1.F.e.a.AbstractC0017a
        public F.e.a.AbstractC0017a c(String str) {
            this.f1321f = str;
            return this;
        }

        @Override // F1.F.e.a.AbstractC0017a
        public F.e.a.AbstractC0017a d(String str) {
            this.f1318c = str;
            return this;
        }

        @Override // F1.F.e.a.AbstractC0017a
        public F.e.a.AbstractC0017a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f1316a = str;
            return this;
        }

        @Override // F1.F.e.a.AbstractC0017a
        public F.e.a.AbstractC0017a f(String str) {
            this.f1319d = str;
            return this;
        }

        @Override // F1.F.e.a.AbstractC0017a
        public F.e.a.AbstractC0017a g(String str) {
            if (str == null) {
                throw new NullPointerException("Null version");
            }
            this.f1317b = str;
            return this;
        }
    }

    @Override // F1.F.e.a
    public String b() {
        return this.f1314e;
    }

    @Override // F1.F.e.a
    public String c() {
        return this.f1315f;
    }

    @Override // F1.F.e.a
    public String d() {
        return this.f1312c;
    }

    @Override // F1.F.e.a
    public String e() {
        return this.f1310a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.a) {
            F.e.a aVar = (F.e.a) obj;
            if (this.f1310a.equals(aVar.e()) && this.f1311b.equals(aVar.h()) && ((str = this.f1312c) != null ? str.equals(aVar.d()) : aVar.d() == null)) {
                aVar.g();
                String str2 = this.f1313d;
                if (str2 != null ? str2.equals(aVar.f()) : aVar.f() == null) {
                    String str3 = this.f1314e;
                    if (str3 != null ? str3.equals(aVar.b()) : aVar.b() == null) {
                        String str4 = this.f1315f;
                        if (str4 != null ? str4.equals(aVar.c()) : aVar.c() == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // F1.F.e.a
    public String f() {
        return this.f1313d;
    }

    @Override // F1.F.e.a
    public F.e.a.b g() {
        return null;
    }

    @Override // F1.F.e.a
    public String h() {
        return this.f1311b;
    }

    public int hashCode() {
        int iHashCode = (((this.f1310a.hashCode() ^ 1000003) * 1000003) ^ this.f1311b.hashCode()) * 1000003;
        String str = this.f1312c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f1313d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1314e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f1315f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f1310a + ", version=" + this.f1311b + ", displayVersion=" + this.f1312c + ", organization=" + ((Object) null) + ", installationUuid=" + this.f1313d + ", developmentPlatform=" + this.f1314e + ", developmentPlatformVersion=" + this.f1315f + "}";
    }

    public i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.f1310a = str;
        this.f1311b = str2;
        this.f1312c = str3;
        this.f1313d = str4;
        this.f1314e = str5;
        this.f1315f = str6;
    }
}
