package t3;

/* JADX INFO: renamed from: t3.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1553i implements Q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q f11432m;

    public AbstractC1553i(Q q4) {
        X2.l.e(q4, "delegate");
        this.f11432m = q4;
    }

    @Override // t3.Q, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.f11432m.close();
    }

    @Override // t3.Q
    public long o(C1546b c1546b, long j4) {
        X2.l.e(c1546b, "sink");
        return this.f11432m.o(c1546b, j4);
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f11432m + ')';
    }
}
