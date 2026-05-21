package n1;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1433A f10682m;

    public z(C1433A c1433a) {
        this.f10682m = c1433a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f10682m.f10622b) {
            try {
                C1433A c1433a = this.f10682m;
                if (c1433a.f10623c != null) {
                    c1433a.f10623c.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
