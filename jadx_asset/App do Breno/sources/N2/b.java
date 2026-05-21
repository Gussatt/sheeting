package N2;

import N2.i;
import W2.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements i.c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l f2817m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i.c f2818n;

    public b(i.c cVar, l lVar) {
        X2.l.e(cVar, "baseKey");
        X2.l.e(lVar, "safeCast");
        this.f2817m = lVar;
        this.f2818n = cVar instanceof b ? ((b) cVar).f2818n : cVar;
    }

    public final boolean a(i.c cVar) {
        X2.l.e(cVar, "key");
        return cVar == this || this.f2818n == cVar;
    }

    public final i.b b(i.b bVar) {
        X2.l.e(bVar, "element");
        return (i.b) this.f2817m.k(bVar);
    }
}
