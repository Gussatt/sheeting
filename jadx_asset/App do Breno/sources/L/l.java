package L;

/* JADX INFO: loaded from: classes.dex */
public final class l extends v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f2694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Throwable th) {
        super(Integer.MAX_VALUE, null);
        X2.l.e(th, "finalException");
        this.f2694b = th;
    }

    public final Throwable b() {
        return this.f2694b;
    }
}
