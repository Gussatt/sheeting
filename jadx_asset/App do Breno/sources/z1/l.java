package z1;

import E1.o;
import U1.a;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1.a f12108a;

    public l(U1.a aVar) {
        this.f12108a = aVar;
    }

    public static /* synthetic */ void a(e eVar, U1.b bVar) {
        i.d.a(bVar.get());
        throw null;
    }

    public void b(o oVar) {
        if (oVar == null) {
            g.f().k("Didn't successfully register with UserMetadata for rollouts listener");
        } else {
            final e eVar = new e(oVar);
            this.f12108a.a(new a.InterfaceC0076a() { // from class: z1.k
                @Override // U1.a.InterfaceC0076a
                public final void a(U1.b bVar) {
                    l.a(eVar, bVar);
                }
            });
        }
    }
}
