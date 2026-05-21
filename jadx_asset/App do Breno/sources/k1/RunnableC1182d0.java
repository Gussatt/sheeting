package k1;

/* JADX INFO: renamed from: k1.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1182d0 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f9397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ E0 f9398n;

    public RunnableC1182d0(E0 e02, long j4) {
        this.f9397m = j4;
        this.f9398n = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9398n.q(this.f9397m);
    }
}
