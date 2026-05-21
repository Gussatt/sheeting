package U0;

/* JADX INFO: renamed from: U0.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0537v implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0540y f3600n;

    public RunnableC0537v(C0540y c0540y, int i4) {
        this.f3600n = c0540y;
        this.f3599m = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f3600n.j(this.f3599m);
    }
}
