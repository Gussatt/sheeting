package h3;

/* JADX INFO: renamed from: h3.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1021n0 extends AbstractC1012j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final W2.l f7552m;

    public C1021n0(W2.l lVar) {
        this.f7552m = lVar;
    }

    @Override // h3.AbstractC1014k
    public void a(Throwable th) {
        this.f7552m.k(th);
    }

    @Override // W2.l
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        a((Throwable) obj);
        return K2.p.f2516a;
    }

    public String toString() {
        return "InvokeOnCancel[" + M.a(this.f7552m) + '@' + M.b(this) + ']';
    }
}
