package m3;

import h3.AbstractC0994a;

/* JADX INFO: loaded from: classes.dex */
public class B extends AbstractC0994a implements P2.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final N2.e f10512p;

    public B(N2.i iVar, N2.e eVar) {
        super(iVar, true, true);
        this.f10512p = eVar;
    }

    @Override // h3.x0
    public void R(Object obj) {
        AbstractC1426k.c(O2.b.b(this.f10512p), h3.D.a(obj, this.f10512p), null, 2, null);
    }

    @Override // h3.AbstractC0994a
    public void R0(Object obj) {
        N2.e eVar = this.f10512p;
        eVar.p(h3.D.a(obj, eVar));
    }

    @Override // P2.e
    public final P2.e i() {
        N2.e eVar = this.f10512p;
        if (eVar instanceof P2.e) {
            return (P2.e) eVar;
        }
        return null;
    }

    @Override // h3.x0
    public final boolean r0() {
        return true;
    }
}
