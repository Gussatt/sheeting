package k1;

/* JADX INFO: renamed from: k1.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1196e5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1229i4 f9409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f9410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f9411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9412p;

    public RunnableC1196e5(C1238j5 c1238j5, C1229i4 c1229i4, long j4, boolean z3) {
        this.f9409m = c1229i4;
        this.f9410n = j4;
        this.f9411o = z3;
        this.f9412p = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1238j5 c1238j5 = this.f9412p;
        C1229i4 c1229i4 = this.f9409m;
        c1238j5.X(c1229i4);
        C1238j5.r(c1238j5, c1229i4, this.f9410n, true, this.f9411o);
    }
}
