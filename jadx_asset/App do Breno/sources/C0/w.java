package C0;

/* JADX INFO: loaded from: classes.dex */
public final class w implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.a f506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J2.a f507e;

    public w(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5) {
        this.f503a = aVar;
        this.f504b = aVar2;
        this.f505c = aVar3;
        this.f506d = aVar4;
        this.f507e = aVar5;
    }

    public static w a(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5) {
        return new w(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static u c(M0.a aVar, M0.a aVar2, I0.e eVar, J0.r rVar, J0.v vVar) {
        return new u(aVar, aVar2, eVar, rVar, vVar);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c((M0.a) this.f503a.get(), (M0.a) this.f504b.get(), (I0.e) this.f505c.get(), (J0.r) this.f506d.get(), (J0.v) this.f507e.get());
    }
}
