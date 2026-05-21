package J0;

import K0.InterfaceC0455c;
import K0.InterfaceC0456d;
import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class s implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f2331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f2332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f2333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.a f2334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J2.a f2335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final J2.a f2336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final J2.a f2337g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J2.a f2338h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final J2.a f2339i;

    public s(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5, J2.a aVar6, J2.a aVar7, J2.a aVar8, J2.a aVar9) {
        this.f2331a = aVar;
        this.f2332b = aVar2;
        this.f2333c = aVar3;
        this.f2334d = aVar4;
        this.f2335e = aVar5;
        this.f2336f = aVar6;
        this.f2337g = aVar7;
        this.f2338h = aVar8;
        this.f2339i = aVar9;
    }

    public static s a(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4, J2.a aVar5, J2.a aVar6, J2.a aVar7, J2.a aVar8, J2.a aVar9) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static r c(Context context, D0.e eVar, InterfaceC0456d interfaceC0456d, x xVar, Executor executor, L0.b bVar, M0.a aVar, M0.a aVar2, InterfaceC0455c interfaceC0455c) {
        return new r(context, eVar, interfaceC0456d, xVar, executor, bVar, aVar, aVar2, interfaceC0455c);
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c((Context) this.f2331a.get(), (D0.e) this.f2332b.get(), (InterfaceC0456d) this.f2333c.get(), (x) this.f2334d.get(), (Executor) this.f2335e.get(), (L0.b) this.f2336f.get(), (M0.a) this.f2337g.get(), (M0.a) this.f2338h.get(), (InterfaceC0455c) this.f2339i.get());
    }
}
