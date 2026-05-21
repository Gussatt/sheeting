package k1;

import S0.C0504b;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: k1.k6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1247k6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0504b f9528m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1255l6 f9529n;

    public RunnableC1247k6(ServiceConnectionC1255l6 serviceConnectionC1255l6, C0504b c0504b) {
        this.f9528m = c0504b;
        this.f9529n = serviceConnectionC1255l6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6 c1263m6 = this.f9529n.f9537c;
        c1263m6.f9585d = null;
        if (!c1263m6.f9366a.B().P(null, AbstractC1291q2.f9769p1) || this.f9528m.d() != 7777) {
            c1263m6.S();
            return;
        }
        if (c1263m6.f9588g == null) {
            c1263m6.f9588g = Executors.newScheduledThreadPool(1);
        }
        c1263m6.f9588g.schedule(new Runnable() { // from class: k1.j6
            @Override // java.lang.Runnable
            public final void run() {
                final C1263m6 c1263m62 = this.f9519m.f9529n.f9537c;
                c1263m62.f9366a.e().A(new Runnable() { // from class: k1.i6
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1263m62.p();
                    }
                });
            }
        }, ((Long) AbstractC1291q2.f9720Z.a(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
