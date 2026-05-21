package k1;

/* JADX INFO: renamed from: k1.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1342w6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f9900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E6 f9901n;

    public RunnableC1342w6(E6 e6, long j4) {
        this.f9900m = j4;
        this.f9901n = e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E6.r(this.f9901n, this.f9900m);
    }
}
