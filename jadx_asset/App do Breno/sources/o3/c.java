package o3;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f10829u = new c();

    public c() {
        super(l.f10842c, l.f10843d, l.f10844e, l.f10840a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // h3.F
    public String toString() {
        return "Dispatchers.Default";
    }
}
