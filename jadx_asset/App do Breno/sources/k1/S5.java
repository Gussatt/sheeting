package k1;

/* JADX INFO: loaded from: classes.dex */
public final class S5 extends AbstractC1141A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9230e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S5(C1263m6 c1263m6, InterfaceC1186d4 interfaceC1186d4) {
        super(interfaceC1186d4);
        this.f9230e = c1263m6;
    }

    @Override // k1.AbstractC1141A
    public final void c() {
        C1263m6 c1263m6 = this.f9230e;
        c1263m6.h();
        if (c1263m6.N()) {
            c1263m6.f9366a.c().v().a("Inactivity, disconnecting from the service");
            c1263m6.q();
        }
    }
}
