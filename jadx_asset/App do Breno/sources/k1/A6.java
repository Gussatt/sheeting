package k1;

/* JADX INFO: loaded from: classes.dex */
public final class A6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableC1366z6 f8889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E6 f8890b;

    public A6(E6 e6) {
        this.f8890b = e6;
    }

    public final void a(long j4) {
        E6 e6 = this.f8890b;
        this.f8889a = new RunnableC1366z6(this, e6.f9366a.f().a(), j4);
        e6.f8957c.postDelayed(this.f8889a, 2000L);
    }

    public final void b() {
        E6 e6 = this.f8890b;
        e6.h();
        RunnableC1366z6 runnableC1366z6 = this.f8889a;
        if (runnableC1366z6 != null) {
            e6.f8957c.removeCallbacks(runnableC1366z6);
        }
        C1363z3 c1363z3 = e6.f9366a;
        c1363z3.H().f9329u.a(false);
        e6.s(false);
        if (c1363z3.B().P(null, AbstractC1291q2.f9724a1)) {
            C1363z3 c1363z32 = e6.f9366a;
            if (c1363z32.K().d0()) {
                c1363z3.c().v().a("Retrying trigger URI registration in foreground");
                c1363z32.K().I();
            }
        }
    }
}
