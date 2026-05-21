package k1;

import com.google.android.gms.internal.measurement.C0795l3;
import com.google.android.gms.internal.measurement.C0877v6;

/* JADX INFO: renamed from: k1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1181d extends AbstractC1172c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.L1 f9395g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1199f f9396h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1181d(C1199f c1199f, String str, int i4, com.google.android.gms.internal.measurement.L1 l12) {
        super(str, i4);
        this.f9396h = c1199f;
        this.f9395g = l12;
    }

    @Override // k1.AbstractC1172c
    public final int a() {
        return this.f9395g.F();
    }

    @Override // k1.AbstractC1172c
    public final boolean b() {
        return false;
    }

    @Override // k1.AbstractC1172c
    public final boolean c() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean k(Long l4, Long l5, C0795l3 c0795l3, boolean z3) {
        C0877v6.b();
        C1363z3 c1363z3 = this.f9396h.f9366a;
        boolean zP = c1363z3.B().P(this.f9377a, AbstractC1291q2.f9677D0);
        com.google.android.gms.internal.measurement.L1 l12 = this.f9395g;
        boolean zL = l12.L();
        boolean zM = l12.M();
        boolean zN = l12.N();
        Object[] objArr = zL || zM || zN;
        Boolean boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        boolJ = null;
        if (z3 && objArr != true) {
            c1363z3.c().v().c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f9378b), l12.O() ? Integer.valueOf(l12.F()) : null);
            return true;
        }
        com.google.android.gms.internal.measurement.F1 f1G = l12.G();
        boolean zL2 = f1G.L();
        if (c0795l3.X()) {
            if (f1G.N()) {
                boolJ = AbstractC1172c.j(AbstractC1172c.h(c0795l3.H(), f1G.H()), zL2);
            } else {
                c1363z3.c().w().b("No number filter for long property. property", c1363z3.F().f(c0795l3.L()));
            }
        } else if (c0795l3.V()) {
            if (f1G.N()) {
                boolJ = AbstractC1172c.j(AbstractC1172c.g(c0795l3.F(), f1G.H()), zL2);
            } else {
                c1363z3.c().w().b("No number filter for double property. property", c1363z3.F().f(c0795l3.L()));
            }
        } else if (!c0795l3.Z()) {
            c1363z3.c().w().b("User property has no value, property", c1363z3.F().f(c0795l3.L()));
        } else if (f1G.P()) {
            boolJ = AbstractC1172c.j(AbstractC1172c.f(c0795l3.M(), f1G.I(), c1363z3.c()), zL2);
        } else if (!f1G.N()) {
            c1363z3.c().w().b("No string or number filter defined. property", c1363z3.F().f(c0795l3.L()));
        } else if (r7.m(c0795l3.M())) {
            boolJ = AbstractC1172c.j(AbstractC1172c.i(c0795l3.M(), f1G.H()), zL2);
        } else {
            c1363z3.c().w().c("Invalid user property value for Numeric number filter. property, value", c1363z3.F().f(c0795l3.L()), c0795l3.M());
        }
        c1363z3.c().v().b("Property filter result", boolJ == null ? "null" : boolJ);
        if (boolJ == null) {
            return false;
        }
        this.f9379c = Boolean.TRUE;
        if (zN && !boolJ.booleanValue()) {
            return true;
        }
        if (!z3 || l12.L()) {
            this.f9380d = boolJ;
        }
        if (boolJ.booleanValue() && objArr != false && c0795l3.Y()) {
            long jI = c0795l3.I();
            if (l4 != null) {
                jI = l4.longValue();
            }
            if (zP && l12.L() && !l12.M() && l5 != null) {
                jI = l5.longValue();
            }
            if (l12.M()) {
                this.f9382f = Long.valueOf(jI);
            } else {
                this.f9381e = Long.valueOf(jI);
            }
        }
        return true;
    }
}
