package k1;

/* JADX INFO: loaded from: classes.dex */
public final class O4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f9183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f9184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9185q;

    public O4(C1238j5 c1238j5, String str, String str2, Object obj, long j4) {
        this.f9181m = str;
        this.f9182n = str2;
        this.f9183o = obj;
        this.f9184p = j4;
        this.f9185q = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9185q.b0(this.f9181m, this.f9182n, this.f9183o, this.f9184p);
    }
}
