package k1;

/* JADX INFO: renamed from: k1.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1142B implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f8892m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f8893n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ E0 f8894o;

    public RunnableC1142B(E0 e02, String str, long j4) {
        this.f8892m = str;
        this.f8893n = j4;
        this.f8894o = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E0.j(this.f8894o, this.f8892m, this.f8893n);
    }
}
