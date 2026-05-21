package h3;

/* JADX INFO: loaded from: classes.dex */
public class t0 extends x0 implements InterfaceC1033x {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7562o;

    public t0(InterfaceC1027q0 interfaceC1027q0) {
        super(true);
        q0(interfaceC1027q0);
        this.f7562o = R0();
    }

    public final boolean R0() {
        x0 x0VarA;
        r rVarM0 = m0();
        C1028s c1028s = rVarM0 instanceof C1028s ? (C1028s) rVarM0 : null;
        if (c1028s != null && (x0VarA = c1028s.A()) != null) {
            while (!x0VarA.j0()) {
                r rVarM02 = x0VarA.m0();
                C1028s c1028s2 = rVarM02 instanceof C1028s ? (C1028s) rVarM02 : null;
                if (c1028s2 == null || (x0VarA = c1028s2.A()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // h3.x0
    public boolean j0() {
        return this.f7562o;
    }

    @Override // h3.x0
    public boolean k0() {
        return true;
    }
}
