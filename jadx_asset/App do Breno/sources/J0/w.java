package J0;

import K0.InterfaceC0456d;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class w implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f2346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f2347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f2348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.a f2349d;

    public w(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4) {
        this.f2346a = aVar;
        this.f2347b = aVar2;
        this.f2348c = aVar3;
        this.f2349d = aVar4;
    }

    public static w a(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4) {
        return new w(aVar, aVar2, aVar3, aVar4);
    }

    public static v c(Executor executor, InterfaceC0456d interfaceC0456d, x xVar, L0.b bVar) {
        return new v(executor, interfaceC0456d, xVar, bVar);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public v get() {
        return c((Executor) this.f2346a.get(), (InterfaceC0456d) this.f2347b.get(), (x) this.f2348c.get(), (L0.b) this.f2349d.get());
    }
}
