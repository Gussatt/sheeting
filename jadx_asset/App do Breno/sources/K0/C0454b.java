package K0;

/* JADX INFO: renamed from: K0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0454b extends AbstractC0463k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0.p f2428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0.i f2429c;

    public C0454b(long j4, C0.p pVar, C0.i iVar) {
        this.f2427a = j4;
        if (pVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f2428b = pVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f2429c = iVar;
    }

    @Override // K0.AbstractC0463k
    public C0.i b() {
        return this.f2429c;
    }

    @Override // K0.AbstractC0463k
    public long c() {
        return this.f2427a;
    }

    @Override // K0.AbstractC0463k
    public C0.p d() {
        return this.f2428b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0463k) {
            AbstractC0463k abstractC0463k = (AbstractC0463k) obj;
            if (this.f2427a == abstractC0463k.c() && this.f2428b.equals(abstractC0463k.d()) && this.f2429c.equals(abstractC0463k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j4 = this.f2427a;
        return ((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f2428b.hashCode()) * 1000003) ^ this.f2429c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f2427a + ", transportContext=" + this.f2428b + ", event=" + this.f2429c + "}";
    }
}
