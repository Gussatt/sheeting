package k1;

/* JADX INFO: renamed from: k1.z6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1366z6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f10030m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f10031n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ A6 f10032o;

    public RunnableC1366z6(A6 a6, long j4, long j5) {
        this.f10032o = a6;
        this.f10030m = j4;
        this.f10031n = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f10032o.f8890b.f9366a.e().A(new Runnable() { // from class: k1.y6
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC1366z6 runnableC1366z6 = this.f9985m;
                E6 e6 = runnableC1366z6.f10032o.f8890b;
                long j4 = runnableC1366z6.f10030m;
                long j5 = runnableC1366z6.f10031n;
                e6.h();
                C1363z3 c1363z3 = e6.f9366a;
                c1363z3.c().q().a("Application going to the background");
                c1363z3.H().f9329u.a(true);
                e6.s(true);
                if (!c1363z3.B().R()) {
                    C6 c6 = e6.f8960f;
                    c6.d(false, false, j5);
                    c6.b(j5);
                }
                c1363z3.c().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(j4));
                C1363z3 c1363z32 = e6.f9366a;
                C1238j5 c1238j5K = c1363z32.K();
                c1238j5K.h();
                C1363z3 c1363z33 = c1238j5K.f9366a;
                c1238j5K.i();
                C1263m6 c1263m6O = c1363z33.O();
                c1263m6O.h();
                c1263m6O.i();
                if (!c1263m6O.Q() || c1263m6O.f9366a.Q().y0() >= 242600) {
                    c1363z33.O().l0();
                }
                if (c1363z3.B().P(null, AbstractC1291q2.f9709T0)) {
                    long jC = c1363z3.Q().c0(c1363z3.d().getPackageName(), c1363z3.B().K()) ? 1000L : c1363z3.B().C(c1363z3.d().getPackageName(), AbstractC1291q2.f9678E);
                    c1363z3.c().v().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jC));
                    c1363z32.M().q(jC);
                }
            }
        });
    }
}
