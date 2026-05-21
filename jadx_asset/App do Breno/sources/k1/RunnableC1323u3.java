package k1;

/* JADX INFO: renamed from: k1.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1323u3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1293q4 f9873m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1363z3 f9874n;

    public RunnableC1323u3(C1363z3 c1363z3, C1293q4 c1293q4) {
        this.f9873m = c1293q4;
        this.f9874n = c1363z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1363z3 c1363z3 = this.f9874n;
        C1293q4 c1293q4 = this.f9873m;
        C1363z3.h(c1363z3, c1293q4);
        c1363z3.m(c1293q4.f9803g);
    }
}
