package k1;

/* JADX INFO: renamed from: k1.a7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1162a7 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m7 f9360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l7 f9361n;

    public RunnableC1162a7(l7 l7Var, m7 m7Var) {
        this.f9360m = m7Var;
        this.f9361n = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l7 l7Var = this.f9361n;
        l7.m(l7Var, this.f9360m);
        l7Var.l0();
    }
}
