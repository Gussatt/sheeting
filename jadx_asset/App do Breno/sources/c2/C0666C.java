package c2;

/* JADX INFO: renamed from: c2.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0666C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0679e f5984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f5985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f5986g;

    public C0666C(String str, String str2, int i4, long j4, C0679e c0679e, String str3, String str4) {
        X2.l.e(str, "sessionId");
        X2.l.e(str2, "firstSessionId");
        X2.l.e(c0679e, "dataCollectionStatus");
        X2.l.e(str3, "firebaseInstallationId");
        X2.l.e(str4, "firebaseAuthenticationToken");
        this.f5980a = str;
        this.f5981b = str2;
        this.f5982c = i4;
        this.f5983d = j4;
        this.f5984e = c0679e;
        this.f5985f = str3;
        this.f5986g = str4;
    }

    public final C0679e a() {
        return this.f5984e;
    }

    public final long b() {
        return this.f5983d;
    }

    public final String c() {
        return this.f5986g;
    }

    public final String d() {
        return this.f5985f;
    }

    public final String e() {
        return this.f5981b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0666C)) {
            return false;
        }
        C0666C c0666c = (C0666C) obj;
        return X2.l.a(this.f5980a, c0666c.f5980a) && X2.l.a(this.f5981b, c0666c.f5981b) && this.f5982c == c0666c.f5982c && this.f5983d == c0666c.f5983d && X2.l.a(this.f5984e, c0666c.f5984e) && X2.l.a(this.f5985f, c0666c.f5985f) && X2.l.a(this.f5986g, c0666c.f5986g);
    }

    public final String f() {
        return this.f5980a;
    }

    public final int g() {
        return this.f5982c;
    }

    public int hashCode() {
        return (((((((((((this.f5980a.hashCode() * 31) + this.f5981b.hashCode()) * 31) + Integer.hashCode(this.f5982c)) * 31) + Long.hashCode(this.f5983d)) * 31) + this.f5984e.hashCode()) * 31) + this.f5985f.hashCode()) * 31) + this.f5986g.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f5980a + ", firstSessionId=" + this.f5981b + ", sessionIndex=" + this.f5982c + ", eventTimestampUs=" + this.f5983d + ", dataCollectionStatus=" + this.f5984e + ", firebaseInstallationId=" + this.f5985f + ", firebaseAuthenticationToken=" + this.f5986g + ')';
    }
}
