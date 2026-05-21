package h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class w0 extends B implements X, InterfaceC1017l0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public x0 f7563p;

    public final x0 A() {
        x0 x0Var = this.f7563p;
        if (x0Var != null) {
            return x0Var;
        }
        X2.l.o("job");
        return null;
    }

    public final void B(x0 x0Var) {
        this.f7563p = x0Var;
    }

    @Override // h3.X
    public void a() {
        A().F0(this);
    }

    @Override // h3.InterfaceC1017l0
    public boolean c() {
        return true;
    }

    @Override // h3.InterfaceC1017l0
    public C0 h() {
        return null;
    }

    @Override // m3.q
    public String toString() {
        return M.a(this) + '@' + M.b(this) + "[job@" + M.b(A()) + ']';
    }
}
