package N2;

import N2.i;
import X2.l;

/* JADX INFO: loaded from: classes.dex */
public interface f extends i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2821a = b.f2822m;

    public static final class a {
        public static i.b a(f fVar, i.c cVar) {
            i.b bVarB;
            l.e(cVar, "key");
            if (!(cVar instanceof N2.b)) {
                if (f.f2821a != cVar) {
                    return null;
                }
                l.c(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            N2.b bVar = (N2.b) cVar;
            if (!bVar.a(fVar.getKey()) || (bVarB = bVar.b(fVar)) == null) {
                return null;
            }
            return bVarB;
        }

        public static i b(f fVar, i.c cVar) {
            l.e(cVar, "key");
            if (!(cVar instanceof N2.b)) {
                return f.f2821a == cVar ? j.f2823m : fVar;
            }
            N2.b bVar = (N2.b) cVar;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : j.f2823m;
        }
    }

    public static final class b implements i.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ b f2822m = new b();
    }

    void H(e eVar);

    e r(e eVar);
}
