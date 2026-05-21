package k1;

/* JADX INFO: renamed from: k1.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1350x6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f9946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E6 f9947n;

    public RunnableC1350x6(E6 e6, long j4) {
        this.f9946m = j4;
        this.f9947n = e6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E6.q(this.f9947n, this.f9946m);
    }
}
