package c2;

import e2.InterfaceC0934b;
import f2.C0955f;
import r1.C1509f;

/* JADX INFO: renamed from: c2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0690p implements InterfaceC0934b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f6082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f6083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f6084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.a f6085d;

    public C0690p(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4) {
        this.f6082a = aVar;
        this.f6083b = aVar2;
        this.f6084c = aVar3;
        this.f6085d = aVar4;
    }

    public static C0690p a(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4) {
        return new C0690p(aVar, aVar2, aVar3, aVar4);
    }

    public static C0686l c(C1509f c1509f, C0955f c0955f, N2.i iVar, InterfaceC0669F interfaceC0669F) {
        return new C0686l(c1509f, c0955f, iVar, interfaceC0669F);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0686l get() {
        return c((C1509f) this.f6082a.get(), (C0955f) this.f6083b.get(), (N2.i) this.f6084c.get(), (InterfaceC0669F) this.f6085d.get());
    }
}
