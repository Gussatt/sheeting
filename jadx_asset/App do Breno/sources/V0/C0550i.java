package V0;

/* JADX INFO: renamed from: V0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0550i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0550i f3700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0551j f3701c = new C0551j(0, false, false, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0551j f3702a;

    public static synchronized C0550i b() {
        try {
            if (f3700b == null) {
                f3700b = new C0550i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3700b;
    }

    public C0551j a() {
        return this.f3702a;
    }

    public final synchronized void c(C0551j c0551j) {
        if (c0551j == null) {
            this.f3702a = f3701c;
            return;
        }
        C0551j c0551j2 = this.f3702a;
        if (c0551j2 == null || c0551j2.i() < c0551j.i()) {
            this.f3702a = c0551j;
        }
    }
}
