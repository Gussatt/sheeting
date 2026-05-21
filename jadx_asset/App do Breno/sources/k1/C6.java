package k1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class C6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f8927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f8928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC1141A f8929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E6 f8930d;

    public C6(E6 e6) {
        this.f8930d = e6;
        this.f8929c = new B6(this, e6.f9366a);
        long jB = e6.f9366a.f().b();
        this.f8927a = jB;
        this.f8928b = jB;
    }

    public final void a() {
        this.f8929c.b();
        C1363z3 c1363z3 = this.f8930d.f9366a;
        long jB = c1363z3.B().P(null, AbstractC1291q2.f9730c1) ? c1363z3.f().b() : 0L;
        this.f8927a = jB;
        this.f8928b = jB;
    }

    public final void b(long j4) {
        this.f8929c.b();
    }

    public final void c(long j4) {
        this.f8930d.h();
        this.f8929c.b();
        this.f8927a = j4;
        this.f8928b = j4;
    }

    public final boolean d(boolean z3, boolean z4, long j4) {
        E6 e6 = this.f8930d;
        e6.h();
        e6.i();
        if (e6.f9366a.o()) {
            C1363z3 c1363z3 = e6.f9366a;
            c1363z3.H().f9326r.b(c1363z3.f().a());
        }
        long j5 = j4 - this.f8927a;
        if (!z3 && j5 < 1000) {
            e6.f9366a.c().v().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j5));
            return false;
        }
        if (!z4) {
            j5 = j4 - this.f8928b;
            this.f8928b = j4;
        }
        C1363z3 c1363z32 = e6.f9366a;
        c1363z32.c().v().b("Recording user engagement, ms", Long.valueOf(j5));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j5);
        boolean z5 = !c1363z32.B().R();
        C1363z3 c1363z33 = e6.f9366a;
        w7.B(c1363z33.N().t(z5), bundle, true);
        if (!z4) {
            c1363z33.K().F("auto", "_e", bundle);
        }
        this.f8927a = j4;
        AbstractC1141A abstractC1141A = this.f8929c;
        abstractC1141A.b();
        abstractC1141A.d(((Long) AbstractC1291q2.f9771q0.a(null)).longValue());
        return true;
    }
}
