package m3;

/* JADX INFO: renamed from: m3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1424i extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final transient N2.i f10539m;

    public C1424i(N2.i iVar) {
        this.f10539m = iVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return this.f10539m.toString();
    }
}
