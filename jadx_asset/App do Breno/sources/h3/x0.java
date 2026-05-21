package h3;

import N2.i;
import h3.InterfaceC1027q0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m3.q;
import q.AbstractC1489b;

/* JADX INFO: loaded from: classes.dex */
public class x0 implements InterfaceC1027q0, InterfaceC1029t, F0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7564m = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_state");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f7565n = AtomicReferenceFieldUpdater.newUpdater(x0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public static final class a extends C1018m {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final x0 f7566u;

        public a(N2.e eVar, x0 x0Var) {
            super(eVar, 1);
            this.f7566u = x0Var;
        }

        @Override // h3.C1018m
        public String H() {
            return "AwaitContinuation";
        }

        @Override // h3.C1018m
        public Throwable u(InterfaceC1027q0 interfaceC1027q0) {
            Throwable thE;
            Object objN0 = this.f7566u.n0();
            return (!(objN0 instanceof c) || (thE = ((c) objN0).e()) == null) ? objN0 instanceof C1035z ? ((C1035z) objN0).f7590a : interfaceC1027q0.C() : thE;
        }
    }

    public static final class b extends w0 {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final x0 f7567q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final c f7568r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final C1028s f7569s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final Object f7570t;

        public b(x0 x0Var, c cVar, C1028s c1028s, Object obj) {
            this.f7567q = x0Var;
            this.f7568r = cVar;
            this.f7569s = c1028s;
            this.f7570t = obj;
        }

        @Override // W2.l
        public /* bridge */ /* synthetic */ Object k(Object obj) {
            z((Throwable) obj);
            return K2.p.f2516a;
        }

        @Override // h3.B
        public void z(Throwable th) {
            this.f7567q.c0(this.f7568r, this.f7569s, this.f7570t);
        }
    }

    public static final class c implements InterfaceC1017l0 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f7571n = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f7572o = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f7573p = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final C0 f7574m;

        public c(C0 c02, boolean z3, Throwable th) {
            this.f7574m = c02;
            this._isCompleting = z3 ? 1 : 0;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable thE = e();
            if (thE == null) {
                m(th);
                return;
            }
            if (th == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                l(th);
                return;
            }
            if (objD instanceof Throwable) {
                if (th == objD) {
                    return;
                }
                ArrayList arrayListB = b();
                arrayListB.add(objD);
                arrayListB.add(th);
                l(arrayListB);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        public final ArrayList b() {
            return new ArrayList(4);
        }

        @Override // h3.InterfaceC1017l0
        public boolean c() {
            return e() == null;
        }

        public final Object d() {
            return f7573p.get(this);
        }

        public final Throwable e() {
            return (Throwable) f7572o.get(this);
        }

        public final boolean f() {
            return e() != null;
        }

        public final boolean g() {
            return f7571n.get(this) != 0;
        }

        @Override // h3.InterfaceC1017l0
        public C0 h() {
            return this.f7574m;
        }

        public final boolean i() {
            return d() == y0.f7586e;
        }

        public final List j(Throwable th) {
            ArrayList arrayListB;
            Object objD = d();
            if (objD == null) {
                arrayListB = b();
            } else if (objD instanceof Throwable) {
                ArrayList arrayListB2 = b();
                arrayListB2.add(objD);
                arrayListB = arrayListB2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListB = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListB.add(0, thE);
            }
            if (th != null && !X2.l.a(th, thE)) {
                arrayListB.add(th);
            }
            l(y0.f7586e);
            return arrayListB;
        }

        public final void k(boolean z3) {
            f7571n.set(this, z3 ? 1 : 0);
        }

        public final void l(Object obj) {
            f7573p.set(this, obj);
        }

        public final void m(Throwable th) {
            f7572o.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + f() + ", completing=" + g() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + h() + ']';
        }
    }

    public static final class d extends q.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x0 f7575d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f7576e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(m3.q qVar, x0 x0Var, Object obj) {
            super(qVar);
            this.f7575d = x0Var;
            this.f7576e = obj;
        }

        @Override // m3.AbstractC1417b
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(m3.q qVar) {
            if (this.f7575d.n0() == this.f7576e) {
                return null;
            }
            return m3.p.a();
        }
    }

    public x0(boolean z3) {
        this._state = z3 ? y0.f7588g : y0.f7587f;
    }

    public static /* synthetic */ CancellationException K0(x0 x0Var, Throwable th, String str, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i4 & 1) != 0) {
            str = null;
        }
        return x0Var.J0(th, str);
    }

    @Override // h3.InterfaceC1027q0
    public final CancellationException C() {
        Object objN0 = n0();
        if (!(objN0 instanceof c)) {
            if (objN0 instanceof InterfaceC1017l0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objN0 instanceof C1035z) {
                return K0(this, ((C1035z) objN0).f7590a, null, 1, null);
            }
            return new r0(M.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objN0).e();
        if (thE != null) {
            CancellationException cancellationExceptionJ0 = J0(thE, M.a(this) + " is cancelling");
            if (cancellationExceptionJ0 != null) {
                return cancellationExceptionJ0;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // N2.i
    public N2.i D(N2.i iVar) {
        return InterfaceC1027q0.a.f(this, iVar);
    }

    public final void D0(Z z3) {
        C0 c02 = new C0();
        Object c1015k0 = c02;
        if (!z3.c()) {
            c1015k0 = new C1015k0(c02);
        }
        AbstractC1489b.a(f7564m, this, z3, c1015k0);
    }

    public final void E0(w0 w0Var) {
        w0Var.n(new C0());
        AbstractC1489b.a(f7564m, this, w0Var, w0Var.s());
    }

    @Override // N2.i
    public N2.i F(i.c cVar) {
        return InterfaceC1027q0.a.e(this, cVar);
    }

    public final void F0(w0 w0Var) {
        Object objN0;
        do {
            objN0 = n0();
            if (!(objN0 instanceof w0)) {
                if (!(objN0 instanceof InterfaceC1017l0) || ((InterfaceC1017l0) objN0).h() == null) {
                    return;
                }
                w0Var.v();
                return;
            }
            if (objN0 != w0Var) {
                return;
            }
        } while (!AbstractC1489b.a(f7564m, this, objN0, y0.f7588g));
    }

    @Override // h3.InterfaceC1027q0
    public final boolean G() {
        return !(n0() instanceof InterfaceC1017l0);
    }

    public final void G0(r rVar) {
        f7565n.set(this, rVar);
    }

    public final int H0(Object obj) {
        if (obj instanceof Z) {
            if (((Z) obj).c()) {
                return 0;
            }
            if (!AbstractC1489b.a(f7564m, this, obj, y0.f7588g)) {
                return -1;
            }
            C0();
            return 1;
        }
        if (!(obj instanceof C1015k0)) {
            return 0;
        }
        if (!AbstractC1489b.a(f7564m, this, obj, ((C1015k0) obj).h())) {
            return -1;
        }
        C0();
        return 1;
    }

    public final String I0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC1017l0 ? ((InterfaceC1017l0) obj).c() ? "Active" : "New" : obj instanceof C1035z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.f() ? "Cancelling" : cVar.g() ? "Completing" : "Active";
    }

    public final CancellationException J0(Throwable th, String str) {
        CancellationException r0Var = th instanceof CancellationException ? (CancellationException) th : null;
        if (r0Var == null) {
            if (str == null) {
                str = Z();
            }
            r0Var = new r0(str, th, this);
        }
        return r0Var;
    }

    public final String L0() {
        return w0() + '{' + I0(n0()) + '}';
    }

    @Override // h3.InterfaceC1027q0
    public final X M(W2.l lVar) {
        return x(false, true, lVar);
    }

    public final boolean M0(InterfaceC1017l0 interfaceC1017l0, Object obj) throws Throwable {
        if (!AbstractC1489b.a(f7564m, this, interfaceC1017l0, y0.g(obj))) {
            return false;
        }
        A0(null);
        B0(obj);
        b0(interfaceC1017l0, obj);
        return true;
    }

    public final boolean N0(InterfaceC1017l0 interfaceC1017l0, Throwable th) throws Throwable {
        C0 c0L0 = l0(interfaceC1017l0);
        if (c0L0 == null) {
            return false;
        }
        if (!AbstractC1489b.a(f7564m, this, interfaceC1017l0, new c(c0L0, false, th))) {
            return false;
        }
        y0(c0L0, th);
        return true;
    }

    @Override // N2.i
    public Object O(Object obj, W2.p pVar) {
        return InterfaceC1027q0.a.b(this, obj, pVar);
    }

    public final Object O0(Object obj, Object obj2) {
        return !(obj instanceof InterfaceC1017l0) ? y0.f7582a : ((!(obj instanceof Z) && !(obj instanceof w0)) || (obj instanceof C1028s) || (obj2 instanceof C1035z)) ? P0((InterfaceC1017l0) obj, obj2) : M0((InterfaceC1017l0) obj, obj2) ? obj2 : y0.f7584c;
    }

    public final boolean P(Object obj, C0 c02, w0 w0Var) {
        int iY;
        d dVar = new d(w0Var, this, obj);
        do {
            iY = c02.t().y(w0Var, c02, dVar);
            if (iY == 1) {
                return true;
            }
        } while (iY != 2);
        return false;
    }

    public final Object P0(InterfaceC1017l0 interfaceC1017l0, Object obj) throws Throwable {
        C0 c0L0 = l0(interfaceC1017l0);
        if (c0L0 == null) {
            return y0.f7584c;
        }
        c cVar = interfaceC1017l0 instanceof c ? (c) interfaceC1017l0 : null;
        if (cVar == null) {
            cVar = new c(c0L0, false, null);
        }
        X2.y yVar = new X2.y();
        synchronized (cVar) {
            if (cVar.g()) {
                return y0.f7582a;
            }
            cVar.k(true);
            if (cVar != interfaceC1017l0 && !AbstractC1489b.a(f7564m, this, interfaceC1017l0, cVar)) {
                return y0.f7584c;
            }
            boolean zF = cVar.f();
            C1035z c1035z = obj instanceof C1035z ? (C1035z) obj : null;
            if (c1035z != null) {
                cVar.a(c1035z.f7590a);
            }
            Throwable thE = zF ? null : cVar.e();
            yVar.f3992m = thE;
            K2.p pVar = K2.p.f2516a;
            if (thE != null) {
                y0(c0L0, thE);
            }
            C1028s c1028sF0 = f0(interfaceC1017l0);
            return (c1028sF0 == null || !Q0(cVar, c1028sF0, obj)) ? e0(cVar, obj) : y0.f7583b;
        }
    }

    public final void Q(Throwable th, List list) throws IllegalAccessException, InvocationTargetException {
        if (list.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                K2.a.a(th, th2);
            }
        }
    }

    public final boolean Q0(c cVar, C1028s c1028s, Object obj) {
        while (InterfaceC1027q0.a.d(c1028s.f7561q, false, false, new b(this, cVar, c1028s, obj), 1, null) == D0.f7493m) {
            c1028s = x0(c1028s);
            if (c1028s == null) {
                return false;
            }
        }
        return true;
    }

    public final Object S(N2.e eVar) throws Throwable {
        Object objN0;
        do {
            objN0 = n0();
            if (!(objN0 instanceof InterfaceC1017l0)) {
                if (objN0 instanceof C1035z) {
                    throw ((C1035z) objN0).f7590a;
                }
                return y0.h(objN0);
            }
        } while (H0(objN0) < 0);
        return T(eVar);
    }

    public final Object T(N2.e eVar) {
        a aVar = new a(O2.b.b(eVar), this);
        aVar.A();
        AbstractC1022o.a(aVar, M(new G0(aVar)));
        Object objX = aVar.x();
        if (objX == O2.c.c()) {
            P2.h.c(eVar);
        }
        return objX;
    }

    public final boolean U(Throwable th) {
        return V(th);
    }

    public final boolean V(Object obj) throws Throwable {
        Object objS0 = y0.f7582a;
        if (k0() && (objS0 = X(obj)) == y0.f7583b) {
            return true;
        }
        if (objS0 == y0.f7582a) {
            objS0 = s0(obj);
        }
        if (objS0 == y0.f7582a || objS0 == y0.f7583b) {
            return true;
        }
        if (objS0 == y0.f7585d) {
            return false;
        }
        R(objS0);
        return true;
    }

    public void W(Throwable th) throws Throwable {
        V(th);
    }

    public final Object X(Object obj) {
        Object objO0;
        do {
            Object objN0 = n0();
            if (!(objN0 instanceof InterfaceC1017l0) || ((objN0 instanceof c) && ((c) objN0).g())) {
                return y0.f7582a;
            }
            objO0 = O0(objN0, new C1035z(d0(obj), false, 2, null));
        } while (objO0 == y0.f7584c);
        return objO0;
    }

    public final boolean Y(Throwable th) {
        if (r0()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        r rVarM0 = m0();
        return (rVarM0 == null || rVarM0 == D0.f7493m) ? z3 : rVarM0.b(th) || z3;
    }

    public String Z() {
        return "Job was cancelled";
    }

    @Override // h3.InterfaceC1027q0
    public final boolean a() {
        int iH0;
        do {
            iH0 = H0(n0());
            if (iH0 == 0) {
                return false;
            }
        } while (iH0 != 1);
        return true;
    }

    public boolean a0(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return V(th) && j0();
    }

    public final void b0(InterfaceC1017l0 interfaceC1017l0, Object obj) throws Throwable {
        r rVarM0 = m0();
        if (rVarM0 != null) {
            rVarM0.a();
            G0(D0.f7493m);
        }
        C1035z c1035z = obj instanceof C1035z ? (C1035z) obj : null;
        Throwable th = c1035z != null ? c1035z.f7590a : null;
        if (!(interfaceC1017l0 instanceof w0)) {
            C0 c0H = interfaceC1017l0.h();
            if (c0H != null) {
                z0(c0H, th);
                return;
            }
            return;
        }
        try {
            ((w0) interfaceC1017l0).z(th);
        } catch (Throwable th2) {
            p0(new C("Exception in completion handler " + interfaceC1017l0 + " for " + this, th2));
        }
    }

    @Override // h3.InterfaceC1027q0
    public boolean c() {
        Object objN0 = n0();
        return (objN0 instanceof InterfaceC1017l0) && ((InterfaceC1017l0) objN0).c();
    }

    public final void c0(c cVar, C1028s c1028s, Object obj) {
        C1028s c1028sX0 = x0(c1028s);
        if (c1028sX0 == null || !Q0(cVar, c1028sX0, obj)) {
            R(e0(cVar, obj));
        }
    }

    @Override // N2.i.b, N2.i
    public i.b d(i.c cVar) {
        return InterfaceC1027q0.a.c(this, cVar);
    }

    public final Throwable d0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new r0(Z(), null, this) : th;
        }
        X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((F0) obj).z();
    }

    @Override // h3.InterfaceC1027q0
    public void e(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new r0(Z(), null, this);
        }
        W(cancellationException);
    }

    public final Object e0(c cVar, Object obj) throws Throwable {
        boolean zF;
        Throwable thI0;
        C1035z c1035z = obj instanceof C1035z ? (C1035z) obj : null;
        Throwable th = c1035z != null ? c1035z.f7590a : null;
        synchronized (cVar) {
            zF = cVar.f();
            List listJ = cVar.j(th);
            thI0 = i0(cVar, listJ);
            if (thI0 != null) {
                Q(thI0, listJ);
            }
        }
        if (thI0 != null && thI0 != th) {
            obj = new C1035z(thI0, false, 2, null);
        }
        if (thI0 != null && (Y(thI0) || o0(thI0))) {
            X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C1035z) obj).b();
        }
        if (!zF) {
            A0(thI0);
        }
        B0(obj);
        AbstractC1489b.a(f7564m, this, cVar, y0.g(obj));
        b0(cVar, obj);
        return obj;
    }

    @Override // h3.InterfaceC1027q0
    public final r f(InterfaceC1029t interfaceC1029t) {
        X xD = InterfaceC1027q0.a.d(this, true, false, new C1028s(interfaceC1029t), 2, null);
        X2.l.c(xD, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r) xD;
    }

    public final C1028s f0(InterfaceC1017l0 interfaceC1017l0) {
        C1028s c1028s = interfaceC1017l0 instanceof C1028s ? (C1028s) interfaceC1017l0 : null;
        if (c1028s != null) {
            return c1028s;
        }
        C0 c0H = interfaceC1017l0.h();
        if (c0H != null) {
            return x0(c0H);
        }
        return null;
    }

    public final Object g0() throws Throwable {
        Object objN0 = n0();
        if (objN0 instanceof InterfaceC1017l0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objN0 instanceof C1035z) {
            throw ((C1035z) objN0).f7590a;
        }
        return y0.h(objN0);
    }

    @Override // N2.i.b
    public final i.c getKey() {
        return InterfaceC1027q0.f7558k;
    }

    @Override // h3.InterfaceC1027q0
    public InterfaceC1027q0 getParent() {
        r rVarM0 = m0();
        if (rVarM0 != null) {
            return rVarM0.getParent();
        }
        return null;
    }

    public final Throwable h0(Object obj) {
        C1035z c1035z = obj instanceof C1035z ? (C1035z) obj : null;
        if (c1035z != null) {
            return c1035z.f7590a;
        }
        return null;
    }

    public final Throwable i0(c cVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.f()) {
                return new r0(Z(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : (Throwable) list.get(0);
    }

    @Override // h3.InterfaceC1027q0
    public final boolean isCancelled() {
        Object objN0 = n0();
        if (objN0 instanceof C1035z) {
            return true;
        }
        return (objN0 instanceof c) && ((c) objN0).f();
    }

    public boolean j0() {
        return true;
    }

    public boolean k0() {
        return false;
    }

    public final C0 l0(InterfaceC1017l0 interfaceC1017l0) {
        C0 c0H = interfaceC1017l0.h();
        if (c0H != null) {
            return c0H;
        }
        if (interfaceC1017l0 instanceof Z) {
            return new C0();
        }
        if (interfaceC1017l0 instanceof w0) {
            E0((w0) interfaceC1017l0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1017l0).toString());
    }

    public final r m0() {
        return (r) f7565n.get(this);
    }

    public final Object n0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7564m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof m3.y)) {
                return obj;
            }
            ((m3.y) obj).a(this);
        }
    }

    public boolean o0(Throwable th) {
        return false;
    }

    public final void q0(InterfaceC1027q0 interfaceC1027q0) {
        if (interfaceC1027q0 == null) {
            G0(D0.f7493m);
            return;
        }
        interfaceC1027q0.a();
        r rVarF = interfaceC1027q0.f(this);
        G0(rVarF);
        if (G()) {
            rVarF.a();
            G0(D0.f7493m);
        }
    }

    public boolean r0() {
        return false;
    }

    public final Object s0(Object obj) throws Throwable {
        Throwable thD0 = null;
        while (true) {
            Object objN0 = n0();
            if (objN0 instanceof c) {
                synchronized (objN0) {
                    if (((c) objN0).i()) {
                        return y0.f7585d;
                    }
                    boolean zF = ((c) objN0).f();
                    if (obj != null || !zF) {
                        if (thD0 == null) {
                            thD0 = d0(obj);
                        }
                        ((c) objN0).a(thD0);
                    }
                    Throwable thE = zF ? null : ((c) objN0).e();
                    if (thE != null) {
                        y0(((c) objN0).h(), thE);
                    }
                    return y0.f7582a;
                }
            }
            if (!(objN0 instanceof InterfaceC1017l0)) {
                return y0.f7585d;
            }
            if (thD0 == null) {
                thD0 = d0(obj);
            }
            InterfaceC1017l0 interfaceC1017l0 = (InterfaceC1017l0) objN0;
            if (!interfaceC1017l0.c()) {
                Object objO0 = O0(objN0, new C1035z(thD0, false, 2, null));
                if (objO0 == y0.f7582a) {
                    throw new IllegalStateException(("Cannot happen in " + objN0).toString());
                }
                if (objO0 != y0.f7584c) {
                    return objO0;
                }
            } else if (N0(interfaceC1017l0, thD0)) {
                return y0.f7582a;
            }
        }
    }

    public final boolean t0(Object obj) {
        Object objO0;
        do {
            objO0 = O0(n0(), obj);
            if (objO0 == y0.f7582a) {
                return false;
            }
            if (objO0 == y0.f7583b) {
                return true;
            }
        } while (objO0 == y0.f7584c);
        R(objO0);
        return true;
    }

    public String toString() {
        return L0() + '@' + M.b(this);
    }

    public final Object u0(Object obj) {
        Object objO0;
        do {
            objO0 = O0(n0(), obj);
            if (objO0 == y0.f7582a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, h0(obj));
            }
        } while (objO0 == y0.f7584c);
        return objO0;
    }

    public final w0 v0(W2.l lVar, boolean z3) {
        w0 c1025p0;
        if (z3) {
            c1025p0 = lVar instanceof s0 ? (s0) lVar : null;
            if (c1025p0 == null) {
                c1025p0 = new C1023o0(lVar);
            }
        } else {
            c1025p0 = lVar instanceof w0 ? (w0) lVar : null;
            if (c1025p0 == null) {
                c1025p0 = new C1025p0(lVar);
            }
        }
        c1025p0.B(this);
        return c1025p0;
    }

    @Override // h3.InterfaceC1029t
    public final void w(F0 f02) throws Throwable {
        V(f02);
    }

    public String w0() {
        return M.a(this);
    }

    @Override // h3.InterfaceC1027q0
    public final X x(boolean z3, boolean z4, W2.l lVar) {
        w0 w0VarV0 = v0(lVar, z3);
        while (true) {
            Object objN0 = n0();
            if (objN0 instanceof Z) {
                Z z5 = (Z) objN0;
                if (!z5.c()) {
                    D0(z5);
                } else if (AbstractC1489b.a(f7564m, this, objN0, w0VarV0)) {
                    break;
                }
            } else {
                if (!(objN0 instanceof InterfaceC1017l0)) {
                    if (z4) {
                        C1035z c1035z = objN0 instanceof C1035z ? (C1035z) objN0 : null;
                        lVar.k(c1035z != null ? c1035z.f7590a : null);
                    }
                    return D0.f7493m;
                }
                C0 c0H = ((InterfaceC1017l0) objN0).h();
                if (c0H == null) {
                    X2.l.c(objN0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    E0((w0) objN0);
                } else {
                    X x3 = D0.f7493m;
                    if (z3 && (objN0 instanceof c)) {
                        synchronized (objN0) {
                            try {
                                thE = ((c) objN0).e();
                                if (thE == null || ((lVar instanceof C1028s) && !((c) objN0).g())) {
                                    if (P(objN0, c0H, w0VarV0)) {
                                        if (thE == null) {
                                            return w0VarV0;
                                        }
                                        x3 = w0VarV0;
                                    }
                                }
                                K2.p pVar = K2.p.f2516a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (thE != null) {
                        if (z4) {
                            lVar.k(thE);
                        }
                        return x3;
                    }
                    if (P(objN0, c0H, w0VarV0)) {
                        break;
                    }
                }
            }
        }
        return w0VarV0;
    }

    public final C1028s x0(m3.q qVar) {
        while (qVar.u()) {
            qVar = qVar.t();
        }
        while (true) {
            qVar = qVar.s();
            if (!qVar.u()) {
                if (qVar instanceof C1028s) {
                    return (C1028s) qVar;
                }
                if (qVar instanceof C0) {
                    return null;
                }
            }
        }
    }

    public final void y0(C0 c02, Throwable th) throws Throwable {
        A0(th);
        Object objR = c02.r();
        X2.l.c(objR, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c4 = null;
        for (m3.q qVarS = (m3.q) objR; !X2.l.a(qVarS, c02); qVarS = qVarS.s()) {
            if (qVarS instanceof s0) {
                w0 w0Var = (w0) qVarS;
                try {
                    w0Var.z(th);
                } catch (Throwable th2) {
                    if (c4 != null) {
                        K2.a.a(c4, th2);
                    } else {
                        c4 = new C("Exception in completion handler " + w0Var + " for " + this, th2);
                        K2.p pVar = K2.p.f2516a;
                    }
                }
            }
        }
        if (c4 != null) {
            p0(c4);
        }
        Y(th);
    }

    @Override // h3.F0
    public CancellationException z() {
        Throwable thE;
        Object objN0 = n0();
        if (objN0 instanceof c) {
            thE = ((c) objN0).e();
        } else if (objN0 instanceof C1035z) {
            thE = ((C1035z) objN0).f7590a;
        } else {
            if (objN0 instanceof InterfaceC1017l0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objN0).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new r0("Parent job is " + I0(objN0), thE, this);
    }

    public final void z0(C0 c02, Throwable th) throws Throwable {
        Object objR = c02.r();
        X2.l.c(objR, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c4 = null;
        for (m3.q qVarS = (m3.q) objR; !X2.l.a(qVarS, c02); qVarS = qVarS.s()) {
            if (qVarS instanceof w0) {
                w0 w0Var = (w0) qVarS;
                try {
                    w0Var.z(th);
                } catch (Throwable th2) {
                    if (c4 != null) {
                        K2.a.a(c4, th2);
                    } else {
                        c4 = new C("Exception in completion handler " + w0Var + " for " + this, th2);
                        K2.p pVar = K2.p.f2516a;
                    }
                }
            }
        }
        if (c4 != null) {
            p0(c4);
        }
    }

    public void C0() {
    }

    public void A0(Throwable th) {
    }

    public void B0(Object obj) {
    }

    public void R(Object obj) {
    }

    public void p0(Throwable th) throws Throwable {
        throw th;
    }
}
