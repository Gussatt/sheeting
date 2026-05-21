package N2;

import N2.f;
import N2.i;
import W2.p;
import X2.l;

/* JADX INFO: loaded from: classes.dex */
public interface i {

    public static final class a {
        public static i b(i iVar, i iVar2) {
            l.e(iVar2, "context");
            return iVar2 == j.f2823m ? iVar : (i) iVar2.O(iVar, new p() { // from class: N2.h
                @Override // W2.p
                public final Object j(Object obj, Object obj2) {
                    return i.a.c((i) obj, (i.b) obj2);
                }
            });
        }

        public static i c(i iVar, b bVar) {
            l.e(iVar, "acc");
            l.e(bVar, "element");
            i iVarF = iVar.F(bVar.getKey());
            j jVar = j.f2823m;
            if (iVarF == jVar) {
                return bVar;
            }
            f.b bVar2 = f.f2821a;
            f fVar = (f) iVarF.d(bVar2);
            if (fVar == null) {
                return new d(iVarF, bVar);
            }
            i iVarF2 = iVarF.F(bVar2);
            return iVarF2 == jVar ? new d(bVar, fVar) : new d(new d(iVarF2, bVar), fVar);
        }
    }

    public interface b extends i {

        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                l.e(pVar, "operation");
                return pVar.j(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                l.e(cVar, "key");
                if (!l.a(bVar.getKey(), cVar)) {
                    return null;
                }
                l.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static i c(b bVar, c cVar) {
                l.e(cVar, "key");
                return l.a(bVar.getKey(), cVar) ? j.f2823m : bVar;
            }

            public static i d(b bVar, i iVar) {
                l.e(iVar, "context");
                return a.b(bVar, iVar);
            }
        }

        @Override // N2.i
        b d(c cVar);

        c getKey();
    }

    public interface c {
    }

    i D(i iVar);

    i F(c cVar);

    Object O(Object obj, p pVar);

    b d(c cVar);
}
