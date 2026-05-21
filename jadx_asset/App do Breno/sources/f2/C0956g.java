package f2;

import e2.InterfaceC0934b;
import r1.C1509f;

/* JADX INFO: renamed from: f2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0956g implements InterfaceC0934b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f7252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f7253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f7254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.a f7255d;

    public C0956g(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4) {
        this.f7252a = aVar;
        this.f7253b = aVar2;
        this.f7254c = aVar3;
        this.f7255d = aVar4;
    }

    public static C0956g a(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4) {
        return new C0956g(aVar, aVar2, aVar3, aVar4);
    }

    public static C0955f c(C1509f c1509f, N2.i iVar, N2.i iVar2, V1.h hVar) {
        return new C0955f(c1509f, iVar, iVar2, hVar);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0955f get() {
        return c((C1509f) this.f7252a.get(), (N2.i) this.f7253b.get(), (N2.i) this.f7254c.get(), (V1.h) this.f7255d.get());
    }
}
