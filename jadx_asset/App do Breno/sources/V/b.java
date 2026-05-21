package V;

import V.a;
import X2.g;
import X2.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void b(a.b bVar, Object obj) {
        l.e(bVar, "key");
        a().put(bVar, obj);
    }

    public b(a aVar) {
        l.e(aVar, "initialExtras");
        a().putAll(aVar.a());
    }

    public /* synthetic */ b(a aVar, int i4, g gVar) {
        this((i4 & 1) != 0 ? a.C0077a.f3617b : aVar);
    }
}
