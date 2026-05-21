package k1;

/* JADX INFO: renamed from: k1.t6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1318t6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l7 f9867m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Runnable f9868n;

    public RunnableC1318t6(C1334v6 c1334v6, l7 l7Var, Runnable runnable) {
        this.f9867m = l7Var;
        this.f9868n = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l7 l7Var = this.f9867m;
        l7Var.q();
        l7Var.p(this.f9868n);
        l7Var.s0();
    }
}
