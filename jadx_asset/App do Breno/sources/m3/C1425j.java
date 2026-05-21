package m3;

import h3.AbstractC0995a0;
import h3.C1018m;
import h3.InterfaceC1016l;
import h3.L0;
import h3.U;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC1489b;

/* JADX INFO: renamed from: m3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1425j extends U implements P2.e, N2.e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10540t = AtomicReferenceFieldUpdater.newUpdater(C1425j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h3.F f10541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final N2.e f10542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f10543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f10544s;

    public C1425j(h3.F f4, N2.e eVar) {
        super(-1);
        this.f10541p = f4;
        this.f10542q = eVar;
        this.f10543r = AbstractC1426k.f10545a;
        this.f10544s = J.b(b());
    }

    @Override // h3.U
    public void a(Object obj, Throwable th) {
        if (obj instanceof h3.A) {
            ((h3.A) obj).f7491b.k(th);
        }
    }

    @Override // N2.e
    public N2.i b() {
        return this.f10542q.b();
    }

    @Override // P2.e
    public P2.e i() {
        N2.e eVar = this.f10542q;
        if (eVar instanceof P2.e) {
            return (P2.e) eVar;
        }
        return null;
    }

    @Override // h3.U
    public Object j() {
        Object obj = this.f10543r;
        this.f10543r = AbstractC1426k.f10545a;
        return obj;
    }

    public final void k() {
        while (f10540t.get(this) == AbstractC1426k.f10546b) {
        }
    }

    public final C1018m l() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10540t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f10540t.set(this, AbstractC1426k.f10546b);
                return null;
            }
            if (obj instanceof C1018m) {
                if (AbstractC1489b.a(f10540t, this, obj, AbstractC1426k.f10546b)) {
                    return (C1018m) obj;
                }
            } else if (obj != AbstractC1426k.f10546b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final C1018m m() {
        Object obj = f10540t.get(this);
        if (obj instanceof C1018m) {
            return (C1018m) obj;
        }
        return null;
    }

    public final boolean n() {
        return f10540t.get(this) != null;
    }

    public final boolean o(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10540t;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            F f4 = AbstractC1426k.f10546b;
            if (X2.l.a(obj, f4)) {
                if (AbstractC1489b.a(f10540t, this, f4, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC1489b.a(f10540t, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // N2.e
    public void p(Object obj) {
        N2.i iVarB = this.f10542q.b();
        Object objD = h3.D.d(obj, null, 1, null);
        if (this.f10541p.S(iVarB)) {
            this.f10543r = objD;
            this.f7520o = 0;
            this.f10541p.R(iVarB, this);
            return;
        }
        AbstractC0995a0 abstractC0995a0B = L0.f7509a.b();
        if (abstractC0995a0B.b0()) {
            this.f10543r = objD;
            this.f7520o = 0;
            abstractC0995a0B.X(this);
            return;
        }
        abstractC0995a0B.Z(true);
        try {
            N2.i iVarB2 = b();
            Object objC = J.c(iVarB2, this.f10544s);
            try {
                this.f10542q.p(obj);
                K2.p pVar = K2.p.f2516a;
                while (abstractC0995a0B.e0()) {
                }
            } finally {
                J.a(iVarB2, objC);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final void q() {
        k();
        C1018m c1018mM = m();
        if (c1018mM != null) {
            c1018mM.q();
        }
    }

    public final Throwable r(InterfaceC1016l interfaceC1016l) {
        F f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10540t;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            f4 = AbstractC1426k.f10546b;
            if (obj != f4) {
                if (obj instanceof Throwable) {
                    if (AbstractC1489b.a(f10540t, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC1489b.a(f10540t, this, f4, interfaceC1016l));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f10541p + ", " + h3.M.c(this.f10542q) + ']';
    }

    @Override // h3.U
    public N2.e d() {
        return this;
    }
}
