package P2;

import K2.j;
import X2.l;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements N2.e, e, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N2.e f2892m;

    public a(N2.e eVar) {
        this.f2892m = eVar;
    }

    @Override // P2.e
    public e i() {
        N2.e eVar = this.f2892m;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public N2.e m(Object obj, N2.e eVar) {
        l.e(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final N2.e n() {
        return this.f2892m;
    }

    public StackTraceElement o() {
        return g.d(this);
    }

    @Override // N2.e
    public final void p(Object obj) {
        Object objQ;
        N2.e eVar = this;
        while (true) {
            h.b(eVar);
            a aVar = (a) eVar;
            N2.e eVar2 = aVar.f2892m;
            l.b(eVar2);
            try {
                objQ = aVar.q(obj);
            } catch (Throwable th) {
                j.a aVar2 = K2.j.f2509n;
                obj = K2.j.b(K2.k.a(th));
            }
            if (objQ == O2.c.c()) {
                return;
            }
            obj = K2.j.b(objQ);
            aVar.r();
            if (!(eVar2 instanceof a)) {
                eVar2.p(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public abstract Object q(Object obj);

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object objO = o();
        if (objO == null) {
            objO = getClass().getName();
        }
        sb.append(objO);
        return sb.toString();
    }

    public void r() {
    }
}
