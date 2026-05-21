package W1;

import W1.c;
import W1.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.a f3779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3780d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3783g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3784h;

    public static final class b extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f3785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.a f3786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f3787c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f3788d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f3789e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f3790f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f3791g;

        @Override // W1.d.a
        public d a() {
            String str = "";
            if (this.f3786b == null) {
                str = " registrationStatus";
            }
            if (this.f3789e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f3790f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f3785a, this.f3786b, this.f3787c, this.f3788d, this.f3789e.longValue(), this.f3790f.longValue(), this.f3791g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // W1.d.a
        public d.a b(String str) {
            this.f3787c = str;
            return this;
        }

        @Override // W1.d.a
        public d.a c(long j4) {
            this.f3789e = Long.valueOf(j4);
            return this;
        }

        @Override // W1.d.a
        public d.a d(String str) {
            this.f3785a = str;
            return this;
        }

        @Override // W1.d.a
        public d.a e(String str) {
            this.f3791g = str;
            return this;
        }

        @Override // W1.d.a
        public d.a f(String str) {
            this.f3788d = str;
            return this;
        }

        @Override // W1.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f3786b = aVar;
            return this;
        }

        @Override // W1.d.a
        public d.a h(long j4) {
            this.f3790f = Long.valueOf(j4);
            return this;
        }

        public b() {
        }

        public b(d dVar) {
            this.f3785a = dVar.d();
            this.f3786b = dVar.g();
            this.f3787c = dVar.b();
            this.f3788d = dVar.f();
            this.f3789e = Long.valueOf(dVar.c());
            this.f3790f = Long.valueOf(dVar.h());
            this.f3791g = dVar.e();
        }
    }

    @Override // W1.d
    public String b() {
        return this.f3780d;
    }

    @Override // W1.d
    public long c() {
        return this.f3782f;
    }

    @Override // W1.d
    public String d() {
        return this.f3778b;
    }

    @Override // W1.d
    public String e() {
        return this.f3784h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str4 = this.f3778b;
            if (str4 != null ? str4.equals(dVar.d()) : dVar.d() == null) {
                if (this.f3779c.equals(dVar.g()) && ((str = this.f3780d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f3781e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f3782f == dVar.c() && this.f3783g == dVar.h() && ((str3 = this.f3784h) != null ? str3.equals(dVar.e()) : dVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // W1.d
    public String f() {
        return this.f3781e;
    }

    @Override // W1.d
    public c.a g() {
        return this.f3779c;
    }

    @Override // W1.d
    public long h() {
        return this.f3783g;
    }

    public int hashCode() {
        String str = this.f3778b;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f3779c.hashCode()) * 1000003;
        String str2 = this.f3780d;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f3781e;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j4 = this.f3782f;
        int i4 = (iHashCode3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f3783g;
        int i5 = (i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        String str4 = this.f3784h;
        return i5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // W1.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f3778b + ", registrationStatus=" + this.f3779c + ", authToken=" + this.f3780d + ", refreshToken=" + this.f3781e + ", expiresInSecs=" + this.f3782f + ", tokenCreationEpochInSecs=" + this.f3783g + ", fisError=" + this.f3784h + "}";
    }

    public a(String str, c.a aVar, String str2, String str3, long j4, long j5, String str4) {
        this.f3778b = str;
        this.f3779c = aVar;
        this.f3780d = str2;
        this.f3781e = str3;
        this.f3782f = j4;
        this.f3783g = j5;
        this.f3784h = str4;
    }
}
