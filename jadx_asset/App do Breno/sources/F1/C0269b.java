package F1;

import F1.F;

/* JADX INFO: renamed from: F1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0269b extends F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1230i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f1231j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final F.e f1232k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final F.d f1233l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final F.a f1234m;

    /* JADX INFO: renamed from: F1.b$b, reason: collision with other inner class name */
    public static final class C0034b extends F.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f1238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f1239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f1240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f1241g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f1242h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f1243i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public F.e f1244j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public F.d f1245k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public F.a f1246l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public byte f1247m;

        @Override // F1.F.b
        public F a() {
            if (this.f1247m == 1 && this.f1235a != null && this.f1236b != null && this.f1238d != null && this.f1242h != null && this.f1243i != null) {
                return new C0269b(this.f1235a, this.f1236b, this.f1237c, this.f1238d, this.f1239e, this.f1240f, this.f1241g, this.f1242h, this.f1243i, this.f1244j, this.f1245k, this.f1246l);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1235a == null) {
                sb.append(" sdkVersion");
            }
            if (this.f1236b == null) {
                sb.append(" gmpAppId");
            }
            if ((1 & this.f1247m) == 0) {
                sb.append(" platform");
            }
            if (this.f1238d == null) {
                sb.append(" installationUuid");
            }
            if (this.f1242h == null) {
                sb.append(" buildVersion");
            }
            if (this.f1243i == null) {
                sb.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.b
        public F.b b(F.a aVar) {
            this.f1246l = aVar;
            return this;
        }

        @Override // F1.F.b
        public F.b c(String str) {
            this.f1241g = str;
            return this;
        }

        @Override // F1.F.b
        public F.b d(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildVersion");
            }
            this.f1242h = str;
            return this;
        }

        @Override // F1.F.b
        public F.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null displayVersion");
            }
            this.f1243i = str;
            return this;
        }

        @Override // F1.F.b
        public F.b f(String str) {
            this.f1240f = str;
            return this;
        }

        @Override // F1.F.b
        public F.b g(String str) {
            this.f1239e = str;
            return this;
        }

        @Override // F1.F.b
        public F.b h(String str) {
            if (str == null) {
                throw new NullPointerException("Null gmpAppId");
            }
            this.f1236b = str;
            return this;
        }

        @Override // F1.F.b
        public F.b i(String str) {
            if (str == null) {
                throw new NullPointerException("Null installationUuid");
            }
            this.f1238d = str;
            return this;
        }

        @Override // F1.F.b
        public F.b j(F.d dVar) {
            this.f1245k = dVar;
            return this;
        }

        @Override // F1.F.b
        public F.b k(int i4) {
            this.f1237c = i4;
            this.f1247m = (byte) (this.f1247m | 1);
            return this;
        }

        @Override // F1.F.b
        public F.b l(String str) {
            if (str == null) {
                throw new NullPointerException("Null sdkVersion");
            }
            this.f1235a = str;
            return this;
        }

        @Override // F1.F.b
        public F.b m(F.e eVar) {
            this.f1244j = eVar;
            return this;
        }

        public C0034b() {
        }

        public C0034b(F f4) {
            this.f1235a = f4.m();
            this.f1236b = f4.i();
            this.f1237c = f4.l();
            this.f1238d = f4.j();
            this.f1239e = f4.h();
            this.f1240f = f4.g();
            this.f1241g = f4.d();
            this.f1242h = f4.e();
            this.f1243i = f4.f();
            this.f1244j = f4.n();
            this.f1245k = f4.k();
            this.f1246l = f4.c();
            this.f1247m = (byte) 1;
        }
    }

    @Override // F1.F
    public F.a c() {
        return this.f1234m;
    }

    @Override // F1.F
    public String d() {
        return this.f1229h;
    }

    @Override // F1.F
    public String e() {
        return this.f1230i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        F.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F) {
            F f4 = (F) obj;
            if (this.f1223b.equals(f4.m()) && this.f1224c.equals(f4.i()) && this.f1225d == f4.l() && this.f1226e.equals(f4.j()) && ((str = this.f1227f) != null ? str.equals(f4.h()) : f4.h() == null) && ((str2 = this.f1228g) != null ? str2.equals(f4.g()) : f4.g() == null) && ((str3 = this.f1229h) != null ? str3.equals(f4.d()) : f4.d() == null) && this.f1230i.equals(f4.e()) && this.f1231j.equals(f4.f()) && ((eVar = this.f1232k) != null ? eVar.equals(f4.n()) : f4.n() == null) && ((dVar = this.f1233l) != null ? dVar.equals(f4.k()) : f4.k() == null) && ((aVar = this.f1234m) != null ? aVar.equals(f4.c()) : f4.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.F
    public String f() {
        return this.f1231j;
    }

    @Override // F1.F
    public String g() {
        return this.f1228g;
    }

    @Override // F1.F
    public String h() {
        return this.f1227f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f1223b.hashCode() ^ 1000003) * 1000003) ^ this.f1224c.hashCode()) * 1000003) ^ this.f1225d) * 1000003) ^ this.f1226e.hashCode()) * 1000003;
        String str = this.f1227f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f1228g;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1229h;
        int iHashCode4 = (((((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f1230i.hashCode()) * 1000003) ^ this.f1231j.hashCode()) * 1000003;
        F.e eVar = this.f1232k;
        int iHashCode5 = (iHashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.d dVar = this.f1233l;
        int iHashCode6 = (iHashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.a aVar = this.f1234m;
        return iHashCode6 ^ (aVar != null ? aVar.hashCode() : 0);
    }

    @Override // F1.F
    public String i() {
        return this.f1224c;
    }

    @Override // F1.F
    public String j() {
        return this.f1226e;
    }

    @Override // F1.F
    public F.d k() {
        return this.f1233l;
    }

    @Override // F1.F
    public int l() {
        return this.f1225d;
    }

    @Override // F1.F
    public String m() {
        return this.f1223b;
    }

    @Override // F1.F
    public F.e n() {
        return this.f1232k;
    }

    @Override // F1.F
    public F.b o() {
        return new C0034b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f1223b + ", gmpAppId=" + this.f1224c + ", platform=" + this.f1225d + ", installationUuid=" + this.f1226e + ", firebaseInstallationId=" + this.f1227f + ", firebaseAuthenticationToken=" + this.f1228g + ", appQualitySessionId=" + this.f1229h + ", buildVersion=" + this.f1230i + ", displayVersion=" + this.f1231j + ", session=" + this.f1232k + ", ndkPayload=" + this.f1233l + ", appExitInfo=" + this.f1234m + "}";
    }

    public C0269b(String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.f1223b = str;
        this.f1224c = str2;
        this.f1225d = i4;
        this.f1226e = str3;
        this.f1227f = str4;
        this.f1228g = str5;
        this.f1229h = str6;
        this.f1230i = str7;
        this.f1231j = str8;
        this.f1232k = eVar;
        this.f1233l = dVar;
        this.f1234m = aVar;
    }
}
