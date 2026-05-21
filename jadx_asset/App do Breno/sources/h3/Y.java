package h3;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC1012j {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final X f7525m;

    public Y(X x3) {
        this.f7525m = x3;
    }

    @Override // h3.AbstractC1014k
    public void a(Throwable th) {
        this.f7525m.a();
    }

    @Override // W2.l
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        a((Throwable) obj);
        return K2.p.f2516a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f7525m + ']';
    }
}
