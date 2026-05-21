package c2;

import e2.InterfaceC0934b;
import f2.C0955f;
import r1.C1509f;

/* JADX INFO: renamed from: c2.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0665B implements InterfaceC0934b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f5975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f5976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f5977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.a f5978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J2.a f5979e;

    public C0665B(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5) {
        this.f5975a = aVar;
        this.f5976b = aVar2;
        this.f5977c = aVar3;
        this.f5978d = aVar4;
        this.f5979e = aVar5;
    }

    public static C0665B a(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5) {
        return new C0665B(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static C0664A c(C1509f c1509f, V1.h hVar, C0955f c0955f, InterfaceC0682h interfaceC0682h, N2.i iVar) {
        return new C0664A(c1509f, hVar, c0955f, interfaceC0682h, iVar);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0664A get() {
        return c((C1509f) this.f5975a.get(), (V1.h) this.f5976b.get(), (C0955f) this.f5977c.get(), (InterfaceC0682h) this.f5978d.get(), (N2.i) this.f5979e.get());
    }
}
