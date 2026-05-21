package k1;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC0855t0;

/* JADX INFO: loaded from: classes.dex */
public final class E6 extends AbstractC1219h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f8957c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final D6 f8959e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C6 f8960f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final A6 f8961g;

    public E6(C1363z3 c1363z3) {
        super(c1363z3);
        this.f8958d = true;
        this.f8959e = new D6(this);
        this.f8960f = new C6(this);
        this.f8961g = new A6(this);
    }

    public static /* bridge */ /* synthetic */ void q(E6 e6, long j4) {
        e6.h();
        e6.u();
        C1363z3 c1363z3 = e6.f9366a;
        c1363z3.c().v().b("Activity paused, time", Long.valueOf(j4));
        e6.f8961g.a(j4);
        if (c1363z3.B().R()) {
            e6.f8960f.b(j4);
        }
    }

    public static /* bridge */ /* synthetic */ void r(E6 e6, long j4) {
        e6.h();
        e6.u();
        C1363z3 c1363z3 = e6.f9366a;
        c1363z3.c().v().b("Activity resumed, time", Long.valueOf(j4));
        if (c1363z3.B().P(null, AbstractC1291q2.f9727b1)) {
            if (c1363z3.B().R() || e6.f8958d) {
                e6.f8960f.c(j4);
            }
        } else if (c1363z3.B().R() || c1363z3.H().f9329u.b()) {
            e6.f8960f.c(j4);
        }
        e6.f8961g.b();
        D6 d6 = e6.f8959e;
        E6 e62 = d6.f8940a;
        e62.h();
        if (e62.f9366a.o()) {
            d6.b(e62.f9366a.f().a(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        h();
        if (this.f8957c == null) {
            this.f8957c = new HandlerC0855t0(Looper.getMainLooper());
        }
    }

    @Override // k1.AbstractC1219h2
    public final boolean n() {
        return false;
    }

    public final void s(boolean z3) {
        h();
        this.f8958d = z3;
    }

    public final boolean t() {
        h();
        return this.f8958d;
    }
}
