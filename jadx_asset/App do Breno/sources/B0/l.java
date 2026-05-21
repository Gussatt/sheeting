package B0;

/* JADX INFO: loaded from: classes.dex */
public final class l extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f167a;

    public l(long j4) {
        this.f167a = j4;
    }

    @Override // B0.v
    public long c() {
        return this.f167a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof v) && this.f167a == ((v) obj).c();
    }

    public int hashCode() {
        long j4 = this.f167a;
        return ((int) (j4 ^ (j4 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f167a + "}";
    }
}
