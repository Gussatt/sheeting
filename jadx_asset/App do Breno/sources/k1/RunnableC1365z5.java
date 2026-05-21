package k1;

/* JADX INFO: renamed from: k1.z5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1365z5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f10028m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C5 f10029n;

    public RunnableC1365z5(C5 c5, long j4) {
        this.f10028m = j4;
        this.f10029n = c5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5 c5 = this.f10029n;
        c5.f9366a.A().n(this.f10028m);
        c5.f8919e = null;
    }
}
