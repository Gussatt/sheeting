package I0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f2253a;

    public g(J2.a aVar) {
        this.f2253a = aVar;
    }

    public static J0.f a(M0.a aVar) {
        return (J0.f) E0.d.d(f.a(aVar));
    }

    public static g b(J2.a aVar) {
        return new g(aVar);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public J0.f get() {
        return a((M0.a) this.f2253a.get());
    }
}
