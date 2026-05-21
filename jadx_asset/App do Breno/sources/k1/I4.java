package k1;

/* JADX INFO: loaded from: classes.dex */
public final class I4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f9079m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9080n;

    public I4(C1238j5 c1238j5, boolean z3) {
        this.f9079m = z3;
        this.f9080n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1238j5 c1238j5 = this.f9080n;
        C1363z3 c1363z3 = c1238j5.f9366a;
        boolean zO = c1363z3.o();
        boolean zN = c1363z3.n();
        boolean z3 = this.f9079m;
        c1363z3.k(z3);
        if (zN == z3) {
            c1363z3.c().v().b("Default data collection state already set to", Boolean.valueOf(z3));
        }
        if (c1363z3.o() == zO || c1363z3.o() != c1363z3.n()) {
            c1363z3.c().x().c("Default data collection is different than actual status", Boolean.valueOf(z3), Boolean.valueOf(zO));
        }
        c1238j5.h0();
    }
}
