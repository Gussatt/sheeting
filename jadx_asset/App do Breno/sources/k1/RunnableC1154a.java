package k1;

/* JADX INFO: renamed from: k1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1154a implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f9346n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E0 f9347o;

    public RunnableC1154a(E0 e02, String str, long j4) {
        this.f9345m = str;
        this.f9346n = j4;
        this.f9347o = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E0.i(this.f9347o, this.f9345m, this.f9346n);
    }
}
