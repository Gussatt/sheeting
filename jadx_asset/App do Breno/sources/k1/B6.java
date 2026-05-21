package k1;

/* JADX INFO: loaded from: classes.dex */
public final class B6 extends AbstractC1141A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C6 f8902e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B6(C6 c6, InterfaceC1186d4 interfaceC1186d4) {
        super(interfaceC1186d4);
        this.f8902e = c6;
    }

    @Override // k1.AbstractC1141A
    public final void c() {
        C6 c6 = this.f8902e;
        E6 e6 = c6.f8930d;
        e6.h();
        C1363z3 c1363z3 = e6.f9366a;
        c6.d(false, false, c1363z3.f().b());
        e6.f9366a.A().n(c1363z3.f().b());
    }
}
