package c2;

import e2.InterfaceC0934b;

/* JADX INFO: renamed from: c2.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0683i implements InterfaceC0934b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f6069a;

    public C0683i(J2.a aVar) {
        this.f6069a = aVar;
    }

    public static C0683i a(J2.a aVar) {
        return new C0683i(aVar);
    }

    public static C0681g c(U1.b bVar) {
        return new C0681g(bVar);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0681g get() {
        return c((U1.b) this.f6069a.get());
    }
}
