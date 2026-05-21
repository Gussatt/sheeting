package L;

import h3.I;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f2542a = new i();

    public final h a(w wVar, M.b bVar, List list, I i4) {
        X2.l.e(wVar, "storage");
        X2.l.e(list, "migrations");
        X2.l.e(i4, "scope");
        d aVar = bVar;
        if (bVar == null) {
            aVar = new M.a();
        }
        return new j(wVar, L2.l.b(g.f2525a.b(list)), aVar, i4);
    }
}
