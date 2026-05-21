package j3;

import h3.H;
import j3.t;

/* JADX INFO: loaded from: classes.dex */
public final class q extends e implements r {
    public q(N2.i iVar, d dVar) {
        super(iVar, dVar, true, true);
    }

    @Override // h3.AbstractC0994a
    public void S0(Throwable th, boolean z3) {
        if (V0().n(th) || z3) {
            return;
        }
        H.a(b(), th);
    }

    @Override // h3.AbstractC0994a
    /* JADX INFO: renamed from: W0, reason: merged with bridge method [inline-methods] */
    public void T0(K2.p pVar) {
        t.a.a(V0(), null, 1, null);
    }

    @Override // h3.AbstractC0994a, h3.x0, h3.InterfaceC1027q0
    public boolean c() {
        return super.c();
    }
}
