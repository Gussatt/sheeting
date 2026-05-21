package C1;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f572b;

    public N(String str, String str2) {
        this.f571a = str;
        this.f572b = str2;
    }

    public final String a() {
        return this.f572b;
    }

    public final String b() {
        return this.f571a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n4 = (N) obj;
        return X2.l.a(this.f571a, n4.f571a) && X2.l.a(this.f572b, n4.f572b);
    }

    public int hashCode() {
        String str = this.f571a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f572b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f571a + ", authToken=" + this.f572b + ')';
    }
}
