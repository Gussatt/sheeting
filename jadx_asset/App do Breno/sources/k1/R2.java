package k1;

/* JADX INFO: loaded from: classes.dex */
public final class R2 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f9215m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S2 f9216n;

    public R2(S2 s22, boolean z3) {
        this.f9215m = z3;
        this.f9216n = s22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9216n.f9223a.C(this.f9215m);
    }
}
