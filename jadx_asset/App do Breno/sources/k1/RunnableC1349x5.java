package k1;

/* JADX INFO: renamed from: k1.x5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1349x5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1333v5 f9941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1333v5 f9942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f9943o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f9944p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C5 f9945q;

    public RunnableC1349x5(C5 c5, C1333v5 c1333v5, C1333v5 c1333v52, long j4, boolean z3) {
        this.f9941m = c1333v5;
        this.f9942n = c1333v52;
        this.f9943o = j4;
        this.f9944p = z3;
        this.f9945q = c5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9945q.p(this.f9941m, this.f9942n, this.f9943o, this.f9944p, null);
    }
}
