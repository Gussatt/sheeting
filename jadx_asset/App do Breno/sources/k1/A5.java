package k1;

/* JADX INFO: loaded from: classes.dex */
public final class A5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1333v5 f8886m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f8887n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C5 f8888o;

    public A5(C5 c5, C1333v5 c1333v5, long j4) {
        this.f8886m = c1333v5;
        this.f8887n = j4;
        this.f8888o = c5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5 c5 = this.f8888o;
        c5.q(this.f8886m, false, this.f8887n);
        c5.f8919e = null;
        c5.f9366a.O().F(null);
    }
}
