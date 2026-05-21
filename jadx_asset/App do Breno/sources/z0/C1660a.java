package z0;

/* JADX INFO: renamed from: z0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1660a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f12081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f12082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f12083c;

    public C1660a(Integer num, Object obj, e eVar, f fVar, d dVar) {
        this.f12081a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f12082b = obj;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f12083c = eVar;
    }

    @Override // z0.c
    public Integer a() {
        return this.f12081a;
    }

    @Override // z0.c
    public d b() {
        return null;
    }

    @Override // z0.c
    public Object c() {
        return this.f12082b;
    }

    @Override // z0.c
    public e d() {
        return this.f12083c;
    }

    @Override // z0.c
    public f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f12081a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f12082b.equals(cVar.c()) && this.f12083c.equals(cVar.d())) {
                    cVar.e();
                    cVar.b();
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f12081a;
        return ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f12082b.hashCode()) * 1000003) ^ this.f12083c.hashCode()) * (-721379959);
    }

    public String toString() {
        return "Event{code=" + this.f12081a + ", payload=" + this.f12082b + ", priority=" + this.f12083c + ", productData=" + ((Object) null) + ", eventContext=" + ((Object) null) + "}";
    }
}
