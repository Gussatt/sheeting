package K0;

/* JADX INFO: loaded from: classes.dex */
public final class N implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f2397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f2398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f2399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.a f2400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J2.a f2401e;

    public N(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5) {
        this.f2397a = aVar;
        this.f2398b = aVar2;
        this.f2399c = aVar3;
        this.f2400d = aVar4;
        this.f2401e = aVar5;
    }

    public static N a(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5) {
        return new N(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static M c(M0.a aVar, M0.a aVar2, Object obj, Object obj2, J2.a aVar3) {
        return new M(aVar, aVar2, (AbstractC0457e) obj, (W) obj2, aVar3);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public M get() {
        return c((M0.a) this.f2397a.get(), (M0.a) this.f2398b.get(), this.f2399c.get(), this.f2400d.get(), this.f2401e);
    }
}
