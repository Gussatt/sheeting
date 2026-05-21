package N2;

import N2.i;
import W2.p;
import X2.l;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements i, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f2819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i.b f2820n;

    public d(i iVar, i.b bVar) {
        l.e(iVar, "left");
        l.e(bVar, "element");
        this.f2819m = iVar;
        this.f2820n = bVar;
    }

    public static final String n(String str, i.b bVar) {
        l.e(str, "acc");
        l.e(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    @Override // N2.i
    public i D(i iVar) {
        return i.a.b(this, iVar);
    }

    @Override // N2.i
    public i F(i.c cVar) {
        l.e(cVar, "key");
        if (this.f2820n.d(cVar) != null) {
            return this.f2819m;
        }
        i iVarF = this.f2819m.F(cVar);
        return iVarF == this.f2819m ? this : iVarF == j.f2823m ? this.f2820n : new d(iVarF, this.f2820n);
    }

    @Override // N2.i
    public Object O(Object obj, p pVar) {
        l.e(pVar, "operation");
        return pVar.j(this.f2819m.O(obj, pVar), this.f2820n);
    }

    @Override // N2.i
    public i.b d(i.c cVar) {
        l.e(cVar, "key");
        d dVar = this;
        while (true) {
            i.b bVarD = dVar.f2820n.d(cVar);
            if (bVarD != null) {
                return bVarD;
            }
            i iVar = dVar.f2819m;
            if (!(iVar instanceof d)) {
                return iVar.d(cVar);
            }
            dVar = (d) iVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.m() == m() && dVar.i(this);
    }

    public final boolean h(i.b bVar) {
        return l.a(d(bVar.getKey()), bVar);
    }

    public int hashCode() {
        return this.f2819m.hashCode() + this.f2820n.hashCode();
    }

    public final boolean i(d dVar) {
        while (h(dVar.f2820n)) {
            i iVar = dVar.f2819m;
            if (!(iVar instanceof d)) {
                l.c(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return h((i.b) iVar);
            }
            dVar = (d) iVar;
        }
        return false;
    }

    public final int m() {
        int i4 = 2;
        d dVar = this;
        while (true) {
            i iVar = dVar.f2819m;
            dVar = iVar instanceof d ? (d) iVar : null;
            if (dVar == null) {
                return i4;
            }
            i4++;
        }
    }

    public String toString() {
        return '[' + ((String) O("", new p() { // from class: N2.c
            @Override // W2.p
            public final Object j(Object obj, Object obj2) {
                return d.n((String) obj, (i.b) obj2);
            }
        })) + ']';
    }
}
