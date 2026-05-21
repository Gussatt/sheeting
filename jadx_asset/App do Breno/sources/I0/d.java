package I0;

import J0.x;
import K0.InterfaceC0456d;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f2248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f2249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f2250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.a f2251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J2.a f2252e;

    public d(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5) {
        this.f2248a = aVar;
        this.f2249b = aVar2;
        this.f2250c = aVar3;
        this.f2251d = aVar4;
        this.f2252e = aVar5;
    }

    public static d a(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, D0.e eVar, x xVar, InterfaceC0456d interfaceC0456d, L0.b bVar) {
        return new c(executor, eVar, xVar, interfaceC0456d, bVar);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c((Executor) this.f2248a.get(), (D0.e) this.f2249b.get(), (x) this.f2250c.get(), (InterfaceC0456d) this.f2251d.get(), (L0.b) this.f2252e.get());
    }
}
