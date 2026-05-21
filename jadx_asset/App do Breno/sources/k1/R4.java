package k1;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class R4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f9219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9220n;

    public R4(C1238j5 c1238j5, long j4) {
        this.f9219m = j4;
        this.f9220n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1238j5 c1238j5 = this.f9220n;
        c1238j5.h();
        c1238j5.i();
        C1363z3 c1363z3 = c1238j5.f9366a;
        c1363z3.c().q().a("Resetting analytics data (FE)");
        C1363z3 c1363z32 = c1238j5.f9366a;
        E6 e6P = c1363z32.P();
        e6P.h();
        e6P.f8960f.a();
        c1363z32.D().x();
        boolean z3 = !c1238j5.f9366a.o();
        Z2 z2H = c1363z3.H();
        z2H.f9315g.b(this.f9219m);
        C1363z3 c1363z33 = z2H.f9366a;
        if (!TextUtils.isEmpty(c1363z33.H().f9332x.a())) {
            z2H.f9332x.b(null);
        }
        z2H.f9326r.b(0L);
        z2H.f9327s.b(0L);
        if (!c1363z33.B().i()) {
            z2H.y(z3);
        }
        z2H.f9333y.b(null);
        z2H.f9334z.b(0L);
        z2H.f9310A.b(null);
        c1363z32.O().B();
        c1363z32.P().f8959e.a();
        c1238j5.f9514s = z3;
        c1363z32.O().s(new AtomicReference());
    }
}
