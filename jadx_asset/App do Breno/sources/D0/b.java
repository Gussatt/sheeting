package D0;

import D0.g;

/* JADX INFO: loaded from: classes.dex */
public final class b extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a f842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f843b;

    public b(g.a aVar, long j4) {
        if (aVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f842a = aVar;
        this.f843b = j4;
    }

    @Override // D0.g
    public long b() {
        return this.f843b;
    }

    @Override // D0.g
    public g.a c() {
        return this.f842a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f842a.equals(gVar.c()) && this.f843b == gVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f842a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f843b;
        return iHashCode ^ ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        return "BackendResponse{status=" + this.f842a + ", nextRequestWaitMillis=" + this.f843b + "}";
    }
}
