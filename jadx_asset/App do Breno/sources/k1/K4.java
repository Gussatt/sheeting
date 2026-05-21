package k1;

/* JADX INFO: loaded from: classes.dex */
public final class K4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f9117m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9118n;

    public K4(C1238j5 c1238j5, long j4) {
        this.f9117m = j4;
        this.f9118n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1363z3 c1363z3 = this.f9118n.f9366a;
        V2 v22 = c1363z3.H().f9321m;
        long j4 = this.f9117m;
        v22.b(j4);
        c1363z3.c().q().b("Session timeout duration set", Long.valueOf(j4));
    }
}
