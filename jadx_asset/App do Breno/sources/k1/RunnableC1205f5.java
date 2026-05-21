package k1;

/* JADX INFO: renamed from: k1.f5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1205f5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1229i4 f9431m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f9432n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f9433o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9434p;

    public RunnableC1205f5(C1238j5 c1238j5, C1229i4 c1229i4, long j4, boolean z3) {
        this.f9431m = c1229i4;
        this.f9432n = j4;
        this.f9433o = z3;
        this.f9434p = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1238j5 c1238j5 = this.f9434p;
        C1229i4 c1229i4 = this.f9431m;
        c1238j5.X(c1229i4);
        C1238j5.r(c1238j5, c1229i4, this.f9432n, false, this.f9433o);
    }
}
