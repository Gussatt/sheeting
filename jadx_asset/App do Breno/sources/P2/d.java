package P2;

import N2.i;
import X2.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final N2.i f2894n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient N2.e f2895o;

    public d(N2.e eVar, N2.i iVar) {
        super(eVar);
        this.f2894n = iVar;
    }

    @Override // N2.e
    public N2.i b() {
        N2.i iVar = this.f2894n;
        l.b(iVar);
        return iVar;
    }

    @Override // P2.a
    public void r() {
        N2.e eVar = this.f2895o;
        if (eVar != null && eVar != this) {
            i.b bVarD = b().d(N2.f.f2821a);
            l.b(bVarD);
            ((N2.f) bVarD).H(eVar);
        }
        this.f2895o = c.f2893m;
    }

    public final N2.e s() {
        N2.e eVarR = this.f2895o;
        if (eVarR == null) {
            N2.f fVar = (N2.f) b().d(N2.f.f2821a);
            if (fVar == null || (eVarR = fVar.r(this)) == null) {
                eVarR = this;
            }
            this.f2895o = eVarR;
        }
        return eVarR;
    }

    public d(N2.e eVar) {
        this(eVar, eVar != null ? eVar.b() : null);
    }
}
