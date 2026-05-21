package c2;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6142d;

    public x(String str, String str2, int i4, long j4) {
        X2.l.e(str, "sessionId");
        X2.l.e(str2, "firstSessionId");
        this.f6139a = str;
        this.f6140b = str2;
        this.f6141c = i4;
        this.f6142d = j4;
    }

    public final String a() {
        return this.f6140b;
    }

    public final String b() {
        return this.f6139a;
    }

    public final int c() {
        return this.f6141c;
    }

    public final long d() {
        return this.f6142d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return X2.l.a(this.f6139a, xVar.f6139a) && X2.l.a(this.f6140b, xVar.f6140b) && this.f6141c == xVar.f6141c && this.f6142d == xVar.f6142d;
    }

    public int hashCode() {
        return (((((this.f6139a.hashCode() * 31) + this.f6140b.hashCode()) * 31) + Integer.hashCode(this.f6141c)) * 31) + Long.hashCode(this.f6142d);
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f6139a + ", firstSessionId=" + this.f6140b + ", sessionIndex=" + this.f6141c + ", sessionStartTimestampUs=" + this.f6142d + ')';
    }
}
