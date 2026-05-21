package F1;

import F1.G;

/* JADX INFO: loaded from: classes.dex */
public final class C extends G.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1060d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1061e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z1.f f1062f;

    public C(String str, String str2, String str3, String str4, int i4, z1.f fVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f1057a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f1058b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f1059c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f1060d = str4;
        this.f1061e = i4;
        if (fVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f1062f = fVar;
    }

    @Override // F1.G.a
    public String a() {
        return this.f1057a;
    }

    @Override // F1.G.a
    public int c() {
        return this.f1061e;
    }

    @Override // F1.G.a
    public z1.f d() {
        return this.f1062f;
    }

    @Override // F1.G.a
    public String e() {
        return this.f1060d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.a) {
            G.a aVar = (G.a) obj;
            if (this.f1057a.equals(aVar.a()) && this.f1058b.equals(aVar.f()) && this.f1059c.equals(aVar.g()) && this.f1060d.equals(aVar.e()) && this.f1061e == aVar.c() && this.f1062f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.G.a
    public String f() {
        return this.f1058b;
    }

    @Override // F1.G.a
    public String g() {
        return this.f1059c;
    }

    public int hashCode() {
        return ((((((((((this.f1057a.hashCode() ^ 1000003) * 1000003) ^ this.f1058b.hashCode()) * 1000003) ^ this.f1059c.hashCode()) * 1000003) ^ this.f1060d.hashCode()) * 1000003) ^ this.f1061e) * 1000003) ^ this.f1062f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f1057a + ", versionCode=" + this.f1058b + ", versionName=" + this.f1059c + ", installUuid=" + this.f1060d + ", deliveryMechanism=" + this.f1061e + ", developmentPlatformProvider=" + this.f1062f + "}";
    }
}
