package k1;

/* JADX INFO: renamed from: k1.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1178c5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Boolean f9385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9386n;

    public RunnableC1178c5(C1238j5 c1238j5, Boolean bool) {
        this.f9385m = bool;
        this.f9386n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9386n.g0(this.f9385m, true);
    }
}
