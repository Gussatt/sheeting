package r1;

/* JADX INFO: renamed from: r1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1504a extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11190c;

    public C1504a(long j4, long j5, long j6) {
        this.f11188a = j4;
        this.f11189b = j5;
        this.f11190c = j6;
    }

    @Override // r1.o
    public long b() {
        return this.f11189b;
    }

    @Override // r1.o
    public long c() {
        return this.f11188a;
    }

    @Override // r1.o
    public long d() {
        return this.f11190c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f11188a == oVar.c() && this.f11189b == oVar.b() && this.f11190c == oVar.d()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j4 = this.f11188a;
        long j5 = this.f11189b;
        int i4 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f11190c;
        return i4 ^ ((int) ((j6 >>> 32) ^ j6));
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f11188a + ", elapsedRealtime=" + this.f11189b + ", uptimeMillis=" + this.f11190c + "}";
    }
}
