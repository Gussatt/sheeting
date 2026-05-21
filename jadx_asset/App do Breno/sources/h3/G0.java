package h3;

import K2.j;

/* JADX INFO: loaded from: classes.dex */
public final class G0 extends w0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final C1018m f7502q;

    public G0(C1018m c1018m) {
        this.f7502q = c1018m;
    }

    @Override // W2.l
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        z((Throwable) obj);
        return K2.p.f2516a;
    }

    @Override // h3.B
    public void z(Throwable th) {
        Object objN0 = A().n0();
        if (objN0 instanceof C1035z) {
            C1018m c1018m = this.f7502q;
            j.a aVar = K2.j.f2509n;
            c1018m.p(K2.j.b(K2.k.a(((C1035z) objN0).f7590a)));
        } else {
            C1018m c1018m2 = this.f7502q;
            j.a aVar2 = K2.j.f2509n;
            c1018m2.p(K2.j.b(y0.h(objN0)));
        }
    }
}
