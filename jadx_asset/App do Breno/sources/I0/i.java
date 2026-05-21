package I0;

import J0.x;
import K0.InterfaceC0456d;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class i implements E0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2.a f2254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2.a f2255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J2.a f2256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J2.a f2257d;

    public i(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4) {
        this.f2254a = aVar;
        this.f2255b = aVar2;
        this.f2256c = aVar3;
        this.f2257d = aVar4;
    }

    public static i a(J2.a aVar, J2.a aVar2, J2.a aVar3, J2.a aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, InterfaceC0456d interfaceC0456d, J0.f fVar, M0.a aVar) {
        return (x) E0.d.d(h.a(context, interfaceC0456d, fVar, aVar));
    }

    @Override // J2.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c((Context) this.f2254a.get(), (InterfaceC0456d) this.f2255b.get(), (J0.f) this.f2256c.get(), (M0.a) this.f2257d.get());
    }
}
