package m3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC1489b;

/* JADX INFO: renamed from: m3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1420e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10535m = AtomicReferenceFieldUpdater.newUpdater(AbstractC1420e.class, Object.class, "_next");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10536n = AtomicReferenceFieldUpdater.newUpdater(AbstractC1420e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC1420e(AbstractC1420e abstractC1420e) {
        this._prev = abstractC1420e;
    }

    public final void b() {
        f10536n.lazySet(this, null);
    }

    public final AbstractC1420e c() {
        AbstractC1420e abstractC1420eG = g();
        while (abstractC1420eG != null && abstractC1420eG.h()) {
            abstractC1420eG = (AbstractC1420e) f10536n.get(abstractC1420eG);
        }
        return abstractC1420eG;
    }

    public final AbstractC1420e d() {
        AbstractC1420e abstractC1420eE;
        AbstractC1420e abstractC1420eE2 = e();
        X2.l.b(abstractC1420eE2);
        while (abstractC1420eE2.h() && (abstractC1420eE = abstractC1420eE2.e()) != null) {
            abstractC1420eE2 = abstractC1420eE;
        }
        return abstractC1420eE2;
    }

    public final AbstractC1420e e() {
        Object objF = f();
        if (objF == AbstractC1419d.f10534a) {
            return null;
        }
        return (AbstractC1420e) objF;
    }

    public final Object f() {
        return f10535m.get(this);
    }

    public final AbstractC1420e g() {
        return (AbstractC1420e) f10536n.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return AbstractC1489b.a(f10535m, this, null, AbstractC1419d.f10534a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            AbstractC1420e abstractC1420eC = c();
            AbstractC1420e abstractC1420eD = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10536n;
            do {
                obj = atomicReferenceFieldUpdater.get(abstractC1420eD);
            } while (!AbstractC1489b.a(atomicReferenceFieldUpdater, abstractC1420eD, obj, ((AbstractC1420e) obj) == null ? null : abstractC1420eC));
            if (abstractC1420eC != null) {
                f10535m.set(abstractC1420eC, abstractC1420eD);
            }
            if (!abstractC1420eD.h() || abstractC1420eD.i()) {
                if (abstractC1420eC == null || !abstractC1420eC.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(AbstractC1420e abstractC1420e) {
        return AbstractC1489b.a(f10535m, this, null, abstractC1420e);
    }
}
