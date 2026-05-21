package n1;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class P implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O f10655m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Callable f10656n;

    public P(O o4, Callable callable) {
        this.f10655m = o4;
        this.f10656n = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f10655m.q(this.f10656n.call());
        } catch (Exception e4) {
            this.f10655m.p(e4);
        } catch (Throwable th) {
            this.f10655m.p(new RuntimeException(th));
        }
    }
}
