package E1;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f931f;

    public b(String str, String str2, String str3, String str4, long j4) {
        if (str == null) {
            throw new NullPointerException("Null rolloutId");
        }
        this.f927b = str;
        if (str2 == null) {
            throw new NullPointerException("Null parameterKey");
        }
        this.f928c = str2;
        if (str3 == null) {
            throw new NullPointerException("Null parameterValue");
        }
        this.f929d = str3;
        if (str4 == null) {
            throw new NullPointerException("Null variantId");
        }
        this.f930e = str4;
        this.f931f = j4;
    }

    @Override // E1.j
    public String c() {
        return this.f928c;
    }

    @Override // E1.j
    public String d() {
        return this.f929d;
    }

    @Override // E1.j
    public String e() {
        return this.f927b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f927b.equals(jVar.e()) && this.f928c.equals(jVar.c()) && this.f929d.equals(jVar.d()) && this.f930e.equals(jVar.g()) && this.f931f == jVar.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // E1.j
    public long f() {
        return this.f931f;
    }

    @Override // E1.j
    public String g() {
        return this.f930e;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f927b.hashCode() ^ 1000003) * 1000003) ^ this.f928c.hashCode()) * 1000003) ^ this.f929d.hashCode()) * 1000003) ^ this.f930e.hashCode()) * 1000003;
        long j4 = this.f931f;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "RolloutAssignment{rolloutId=" + this.f927b + ", parameterKey=" + this.f928c + ", parameterValue=" + this.f929d + ", variantId=" + this.f930e + ", templateVersion=" + this.f931f + "}";
    }
}
