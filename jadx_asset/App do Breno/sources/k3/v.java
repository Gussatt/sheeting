package k3;

import K2.j;
import h3.C1018m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC1489b;

/* JADX INFO: loaded from: classes.dex */
public final class v extends l3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10145a = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_state");
    private volatile Object _state;

    @Override // l3.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(t tVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10145a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, u.f10143a);
        return true;
    }

    public final Object e(N2.e eVar) {
        C1018m c1018m = new C1018m(O2.b.b(eVar), 1);
        c1018m.A();
        if (!AbstractC1489b.a(f10145a, this, u.f10143a, c1018m)) {
            j.a aVar = K2.j.f2509n;
            c1018m.p(K2.j.b(K2.p.f2516a));
        }
        Object objX = c1018m.x();
        if (objX == O2.c.c()) {
            P2.h.c(eVar);
        }
        return objX == O2.c.c() ? objX : K2.p.f2516a;
    }

    @Override // l3.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public N2.e[] b(t tVar) {
        f10145a.set(this, null);
        return l3.c.f10267a;
    }

    public final void g() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10145a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null || obj == u.f10144b) {
                return;
            }
            if (obj == u.f10143a) {
                if (AbstractC1489b.a(f10145a, this, obj, u.f10144b)) {
                    return;
                }
            } else if (AbstractC1489b.a(f10145a, this, obj, u.f10143a)) {
                j.a aVar = K2.j.f2509n;
                ((C1018m) obj).p(K2.j.b(K2.p.f2516a));
                return;
            }
        }
    }

    public final boolean h() {
        Object andSet = f10145a.getAndSet(this, u.f10143a);
        X2.l.b(andSet);
        return andSet == u.f10144b;
    }
}
