package C1;

import C1.P;

/* JADX INFO: renamed from: C1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0246d extends P.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f597c;

    public C0246d(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f595a = str;
        this.f596b = str2;
        this.f597c = str3;
    }

    @Override // C1.P.a
    public String c() {
        return this.f595a;
    }

    @Override // C1.P.a
    public String d() {
        return this.f597c;
    }

    @Override // C1.P.a
    public String e() {
        return this.f596b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof P.a) {
            P.a aVar = (P.a) obj;
            if (this.f595a.equals(aVar.c()) && ((str = this.f596b) != null ? str.equals(aVar.e()) : aVar.e() == null) && ((str2 = this.f597c) != null ? str2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f595a.hashCode() ^ 1000003) * 1000003;
        String str = this.f596b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f597c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f595a + ", firebaseInstallationId=" + this.f596b + ", firebaseAuthenticationToken=" + this.f597c + "}";
    }
}
