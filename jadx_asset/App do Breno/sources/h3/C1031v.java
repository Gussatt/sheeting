package h3;

/* JADX INFO: renamed from: h3.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1031v extends x0 implements InterfaceC1030u {
    public C1031v(InterfaceC1027q0 interfaceC1027q0) {
        super(true);
        q0(interfaceC1027q0);
    }

    @Override // h3.P
    public Object g(N2.e eVar) throws Throwable {
        Object objS = S(eVar);
        O2.c.c();
        return objS;
    }

    @Override // h3.P
    public Object k() {
        return g0();
    }

    @Override // h3.x0
    public boolean k0() {
        return true;
    }

    @Override // h3.InterfaceC1030u
    public boolean q(Throwable th) {
        return t0(new C1035z(th, false, 2, null));
    }

    @Override // h3.InterfaceC1030u
    public boolean u(Object obj) {
        return t0(obj);
    }
}
