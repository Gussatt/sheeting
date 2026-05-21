package h3;

/* JADX INFO: renamed from: h3.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1028s extends s0 implements r {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final InterfaceC1029t f7561q;

    public C1028s(InterfaceC1029t interfaceC1029t) {
        this.f7561q = interfaceC1029t;
    }

    @Override // h3.r
    public boolean b(Throwable th) {
        return A().a0(th);
    }

    @Override // h3.r
    public InterfaceC1027q0 getParent() {
        return A();
    }

    @Override // W2.l
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        z((Throwable) obj);
        return K2.p.f2516a;
    }

    @Override // h3.B
    public void z(Throwable th) {
        this.f7561q.w(A());
    }
}
