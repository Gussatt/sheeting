package h3;

import h3.InterfaceC1027q0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m3.C1425j;
import q.AbstractC1489b;

/* JADX INFO: renamed from: h3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1018m extends U implements InterfaceC1016l, P2.e, P0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7545r = AtomicIntegerFieldUpdater.newUpdater(C1018m.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7546s = AtomicReferenceFieldUpdater.newUpdater(C1018m.class, Object.class, "_state");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7547t = AtomicReferenceFieldUpdater.newUpdater(C1018m.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final N2.e f7548p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final N2.i f7549q;

    public C1018m(N2.e eVar, int i4) {
        super(i4);
        this.f7548p = eVar;
        this.f7549q = eVar.b();
        this._decisionAndIndex = 536870911;
        this._state = C1000d.f7534m;
    }

    public static /* synthetic */ void O(C1018m c1018m, Object obj, int i4, W2.l lVar, int i5, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i5 & 4) != 0) {
            lVar = null;
        }
        c1018m.N(obj, i4, lVar);
    }

    public void A() {
        X xB = B();
        if (xB != null && D()) {
            xB.a();
            f7547t.set(this, D0.f7493m);
        }
    }

    public final X B() {
        InterfaceC1027q0 interfaceC1027q0 = (InterfaceC1027q0) b().d(InterfaceC1027q0.f7558k);
        if (interfaceC1027q0 == null) {
            return null;
        }
        X xD = InterfaceC1027q0.a.d(interfaceC1027q0, true, false, new C1026q(this), 2, null);
        AbstractC1489b.a(f7547t, this, null, xD);
        return xD;
    }

    public final void C(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7546s;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C1000d)) {
                if (obj2 instanceof AbstractC1012j ? true : obj2 instanceof m3.C) {
                    G(obj, obj2);
                } else {
                    if (obj2 instanceof C1035z) {
                        C1035z c1035z = (C1035z) obj2;
                        if (!c1035z.b()) {
                            G(obj, obj2);
                        }
                        if (obj2 instanceof C1024p) {
                            if (obj2 == null) {
                                c1035z = null;
                            }
                            Throwable th = c1035z != null ? c1035z.f7590a : null;
                            if (obj instanceof AbstractC1012j) {
                                l((AbstractC1012j) obj, th);
                                return;
                            } else {
                                X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                n((m3.C) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C1034y) {
                        C1034y c1034y = (C1034y) obj2;
                        if (c1034y.f7578b != null) {
                            G(obj, obj2);
                        }
                        if (obj instanceof m3.C) {
                            return;
                        }
                        X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC1012j abstractC1012j = (AbstractC1012j) obj;
                        if (c1034y.c()) {
                            l(abstractC1012j, c1034y.f7581e);
                            return;
                        } else {
                            if (AbstractC1489b.a(f7546s, this, obj2, C1034y.b(c1034y, null, abstractC1012j, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof m3.C) {
                            return;
                        }
                        X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (AbstractC1489b.a(f7546s, this, obj2, new C1034y(obj2, (AbstractC1012j) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (AbstractC1489b.a(f7546s, this, obj2, obj)) {
                return;
            }
        }
    }

    public boolean D() {
        return !(y() instanceof E0);
    }

    public final boolean E() {
        if (!V.c(this.f7520o)) {
            return false;
        }
        N2.e eVar = this.f7548p;
        X2.l.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1425j) eVar).n();
    }

    public final AbstractC1012j F(W2.l lVar) {
        return lVar instanceof AbstractC1012j ? (AbstractC1012j) lVar : new C1021n0(lVar);
    }

    public final void G(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public String H() {
        return "CancellableContinuation";
    }

    public final void I(Throwable th) {
        if (o(th)) {
            return;
        }
        t(th);
        r();
    }

    @Override // h3.InterfaceC1016l
    public void J(W2.l lVar) {
        C(F(lVar));
    }

    @Override // h3.InterfaceC1016l
    public void K(Object obj) {
        s(this.f7520o);
    }

    public final void L() {
        Throwable thR;
        N2.e eVar = this.f7548p;
        C1425j c1425j = eVar instanceof C1425j ? (C1425j) eVar : null;
        if (c1425j == null || (thR = c1425j.r(this)) == null) {
            return;
        }
        q();
        t(thR);
    }

    public final boolean M() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7546s;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C1034y) && ((C1034y) obj).f7580d != null) {
            q();
            return false;
        }
        f7545r.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C1000d.f7534m);
        return true;
    }

    public final void N(Object obj, int i4, W2.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7546s;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof E0)) {
                Object obj3 = obj;
                W2.l lVar2 = lVar;
                if (obj2 instanceof C1024p) {
                    C1024p c1024p = (C1024p) obj2;
                    if (c1024p.c()) {
                        if (lVar2 != null) {
                            m(lVar2, c1024p.f7590a);
                            return;
                        }
                        return;
                    }
                }
                k(obj3);
                throw new K2.c();
            }
            Object obj4 = obj;
            int i5 = i4;
            W2.l lVar3 = lVar;
            if (AbstractC1489b.a(f7546s, this, obj2, P((E0) obj2, obj4, i5, lVar3, null))) {
                r();
                s(i5);
                return;
            } else {
                obj = obj4;
                i4 = i5;
                lVar = lVar3;
            }
        }
    }

    public final Object P(E0 e02, Object obj, int i4, W2.l lVar, Object obj2) {
        if (obj instanceof C1035z) {
            return obj;
        }
        if ((V.b(i4) || obj2 != null) && !(lVar == null && !(e02 instanceof AbstractC1012j) && obj2 == null)) {
            return new C1034y(obj, e02 instanceof AbstractC1012j ? (AbstractC1012j) e02 : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final boolean Q() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7545r;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f7545r.compareAndSet(this, i4, 1073741824 + (536870911 & i4)));
        return true;
    }

    public final m3.F R(Object obj, Object obj2, W2.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7546s;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof E0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C1034y) && obj4 != null && ((C1034y) obj3).f7580d == obj4) {
                    return AbstractC1020n.f7551a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            W2.l lVar2 = lVar;
            if (AbstractC1489b.a(f7546s, this, obj3, P((E0) obj3, obj5, this.f7520o, lVar2, obj6))) {
                r();
                return AbstractC1020n.f7551a;
            }
            obj = obj5;
            lVar = lVar2;
            obj2 = obj6;
        }
    }

    public final boolean S() {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7545r;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            int i5 = i4 >> 29;
            if (i5 != 0) {
                if (i5 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f7545r.compareAndSet(this, i4, 536870912 + (536870911 & i4)));
        return true;
    }

    @Override // h3.U
    public void a(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7546s;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof E0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C1035z) {
                return;
            }
            if (obj2 instanceof C1034y) {
                C1034y c1034y = (C1034y) obj2;
                if (c1034y.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (AbstractC1489b.a(f7546s, this, obj2, C1034y.b(c1034y, null, null, null, null, th3, 15, null))) {
                    c1034y.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (AbstractC1489b.a(f7546s, this, obj2, new C1034y(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // N2.e
    public N2.i b() {
        return this.f7549q;
    }

    @Override // h3.P0
    public void c(m3.C c4, int i4) {
        int i5;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7545r;
        do {
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i4));
        C(c4);
    }

    @Override // h3.U
    public final N2.e d() {
        return this.f7548p;
    }

    @Override // h3.U
    public Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // h3.U
    public Object f(Object obj) {
        return obj instanceof C1034y ? ((C1034y) obj).f7577a : obj;
    }

    @Override // h3.InterfaceC1016l
    public Object h(Object obj, Object obj2, W2.l lVar) {
        return R(obj, obj2, lVar);
    }

    @Override // P2.e
    public P2.e i() {
        N2.e eVar = this.f7548p;
        if (eVar instanceof P2.e) {
            return (P2.e) eVar;
        }
        return null;
    }

    @Override // h3.U
    public Object j() {
        return y();
    }

    public final Void k(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void l(AbstractC1012j abstractC1012j, Throwable th) {
        try {
            abstractC1012j.a(th);
        } catch (Throwable th2) {
            H.a(b(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void m(W2.l lVar, Throwable th) {
        try {
            lVar.k(th);
        } catch (Throwable th2) {
            H.a(b(), new C("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void n(m3.C c4, Throwable th) {
        int i4 = f7545r.get(this) & 536870911;
        if (i4 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            c4.o(i4, th, b());
        } catch (Throwable th2) {
            H.a(b(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final boolean o(Throwable th) {
        if (!E()) {
            return false;
        }
        N2.e eVar = this.f7548p;
        X2.l.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C1425j) eVar).o(th);
    }

    @Override // N2.e
    public void p(Object obj) {
        O(this, D.c(obj, this), this.f7520o, null, 4, null);
    }

    public final void q() {
        X xW = w();
        if (xW == null) {
            return;
        }
        xW.a();
        f7547t.set(this, D0.f7493m);
    }

    public final void r() {
        if (E()) {
            return;
        }
        q();
    }

    public final void s(int i4) {
        if (Q()) {
            return;
        }
        V.a(this, i4);
    }

    @Override // h3.InterfaceC1016l
    public boolean t(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7546s;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof E0)) {
                return false;
            }
        } while (!AbstractC1489b.a(f7546s, this, obj, new C1024p(this, th, (obj instanceof AbstractC1012j) || (obj instanceof m3.C))));
        E0 e02 = (E0) obj;
        if (e02 instanceof AbstractC1012j) {
            l((AbstractC1012j) obj, th);
        } else if (e02 instanceof m3.C) {
            n((m3.C) obj, th);
        }
        r();
        s(this.f7520o);
        return true;
    }

    public String toString() {
        return H() + '(' + M.c(this.f7548p) + "){" + z() + "}@" + M.b(this);
    }

    public Throwable u(InterfaceC1027q0 interfaceC1027q0) {
        return interfaceC1027q0.C();
    }

    @Override // h3.InterfaceC1016l
    public void v(Object obj, W2.l lVar) {
        N(obj, this.f7520o, lVar);
    }

    public final X w() {
        return (X) f7547t.get(this);
    }

    public final Object x() {
        InterfaceC1027q0 interfaceC1027q0;
        boolean zE = E();
        if (S()) {
            if (w() == null) {
                B();
            }
            if (zE) {
                L();
            }
            return O2.c.c();
        }
        if (zE) {
            L();
        }
        Object objY = y();
        if (objY instanceof C1035z) {
            throw ((C1035z) objY).f7590a;
        }
        if (!V.b(this.f7520o) || (interfaceC1027q0 = (InterfaceC1027q0) b().d(InterfaceC1027q0.f7558k)) == null || interfaceC1027q0.c()) {
            return f(objY);
        }
        CancellationException cancellationExceptionC = interfaceC1027q0.C();
        a(objY, cancellationExceptionC);
        throw cancellationExceptionC;
    }

    public final Object y() {
        return f7546s.get(this);
    }

    public final String z() {
        Object objY = y();
        return objY instanceof E0 ? "Active" : objY instanceof C1024p ? "Cancelled" : "Completed";
    }
}
