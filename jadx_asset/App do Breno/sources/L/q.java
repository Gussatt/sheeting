package L;

/* JADX INFO: loaded from: classes.dex */
public final class q extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f2699b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Throwable th, int i4) {
        super(i4, null);
        X2.l.e(th, "readException");
        this.f2699b = th;
    }

    public final Throwable b() {
        return this.f2699b;
    }
}
