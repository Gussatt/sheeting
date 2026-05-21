package j3;

import K2.j;
import h3.AbstractC1022o;
import h3.C1018m;
import h3.InterfaceC1016l;
import h3.P0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m3.AbstractC1419d;
import m3.AbstractC1420e;
import m3.AbstractC1427l;
import m3.C;
import m3.D;
import m3.E;
import m3.O;
import m3.x;
import q.AbstractC1489b;

/* JADX INFO: loaded from: classes.dex */
public class b implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8578p = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8579q = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8580r = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8581s = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8582t = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8583u = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8584v = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8585w = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8586x = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f8587m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final W2.l f8588n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final W2.q f8589o;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public final class a implements f, P0 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f8590m = c.f8611p;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public C1018m f8591n;

        public a() {
        }

        @Override // j3.f
        public Object a(N2.e eVar) {
            b bVar = b.this;
            j jVar = (j) b.f8583u.get(bVar);
            while (!bVar.V()) {
                long andIncrement = b.f8579q.getAndIncrement(bVar);
                int i4 = c.f8597b;
                long j4 = andIncrement / ((long) i4);
                int i5 = (int) (andIncrement % ((long) i4));
                if (jVar.f10514o != j4) {
                    j jVarH = bVar.H(j4, jVar);
                    if (jVarH == null) {
                        continue;
                    } else {
                        jVar = jVarH;
                    }
                }
                Object objA0 = bVar.A0(jVar, i5, andIncrement, null);
                if (objA0 == c.f8608m) {
                    throw new IllegalStateException("unreachable");
                }
                if (objA0 != c.f8610o) {
                    if (objA0 == c.f8609n) {
                        return f(jVar, i5, andIncrement, eVar);
                    }
                    jVar.b();
                    this.f8590m = objA0;
                    return P2.b.a(true);
                }
                if (andIncrement < bVar.O()) {
                    jVar.b();
                }
            }
            return P2.b.a(g());
        }

        @Override // h3.P0
        public void c(C c4, int i4) {
            C1018m c1018m = this.f8591n;
            if (c1018m != null) {
                c1018m.c(c4, i4);
            }
        }

        public final Object f(j jVar, int i4, long j4, N2.e eVar) throws Throwable {
            Boolean boolA;
            j jVarH;
            b bVar = b.this;
            C1018m c1018mB = AbstractC1022o.b(O2.b.b(eVar));
            try {
                this.f8591n = c1018mB;
                try {
                    Object objA0 = bVar.A0(jVar, i4, j4, this);
                    if (objA0 == c.f8608m) {
                        bVar.l0(this, jVar, i4);
                    } else {
                        W2.l lVarA = null;
                        if (objA0 == c.f8610o) {
                            if (j4 < bVar.O()) {
                                jVar.b();
                            }
                            j jVar2 = (j) b.f8583u.get(bVar);
                            while (true) {
                                if (bVar.V()) {
                                    h();
                                    break;
                                }
                                long andIncrement = b.f8579q.getAndIncrement(bVar);
                                int i5 = c.f8597b;
                                long j5 = andIncrement / ((long) i5);
                                int i6 = (int) (andIncrement % ((long) i5));
                                if (jVar2.f10514o != j5) {
                                    jVarH = bVar.H(j5, jVar2);
                                    if (jVarH == null) {
                                    }
                                } else {
                                    jVarH = jVar2;
                                }
                                Object objA02 = bVar.A0(jVarH, i6, andIncrement, this);
                                if (objA02 == c.f8608m) {
                                    bVar.l0(this, jVarH, i6);
                                    break;
                                }
                                if (objA02 == c.f8610o) {
                                    if (andIncrement < bVar.O()) {
                                        jVarH.b();
                                    }
                                    jVar2 = jVarH;
                                } else {
                                    if (objA02 == c.f8609n) {
                                        throw new IllegalStateException("unexpected");
                                    }
                                    jVarH.b();
                                    this.f8590m = objA02;
                                    this.f8591n = null;
                                    boolA = P2.b.a(true);
                                    W2.l lVar = bVar.f8588n;
                                    if (lVar != null) {
                                        lVarA = x.a(lVar, objA02, c1018mB.b());
                                    }
                                }
                            }
                        } else {
                            jVar.b();
                            this.f8590m = objA0;
                            this.f8591n = null;
                            boolA = P2.b.a(true);
                            W2.l lVar2 = bVar.f8588n;
                            if (lVar2 != null) {
                                lVarA = x.a(lVar2, objA0, c1018mB.b());
                            }
                        }
                        c1018mB.v(boolA, lVarA);
                    }
                    Object objX = c1018mB.x();
                    if (objX == O2.c.c()) {
                        P2.h.c(eVar);
                    }
                    return objX;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    c1018mB.L();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        public final boolean g() throws Throwable {
            this.f8590m = c.z();
            Throwable thK = b.this.K();
            if (thK == null) {
                return false;
            }
            throw E.a(thK);
        }

        public final void h() {
            C1018m c1018m = this.f8591n;
            X2.l.b(c1018m);
            this.f8591n = null;
            this.f8590m = c.z();
            Throwable thK = b.this.K();
            if (thK == null) {
                j.a aVar = K2.j.f2509n;
                c1018m.p(K2.j.b(Boolean.FALSE));
            } else {
                j.a aVar2 = K2.j.f2509n;
                c1018m.p(K2.j.b(K2.k.a(thK)));
            }
        }

        public final boolean i(Object obj) {
            C1018m c1018m = this.f8591n;
            X2.l.b(c1018m);
            this.f8591n = null;
            this.f8590m = obj;
            Boolean bool = Boolean.TRUE;
            W2.l lVar = b.this.f8588n;
            return c.B(c1018m, bool, lVar != null ? x.a(lVar, obj, c1018m.b()) : null);
        }

        public final void j() {
            C1018m c1018m = this.f8591n;
            X2.l.b(c1018m);
            this.f8591n = null;
            this.f8590m = c.z();
            Throwable thK = b.this.K();
            if (thK == null) {
                j.a aVar = K2.j.f2509n;
                c1018m.p(K2.j.b(Boolean.FALSE));
            } else {
                j.a aVar2 = K2.j.f2509n;
                c1018m.p(K2.j.b(K2.k.a(thK)));
            }
        }

        @Override // j3.f
        public Object next() throws Throwable {
            Object obj = this.f8590m;
            if (obj == c.f8611p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.f8590m = c.f8611p;
            if (obj != c.z()) {
                return obj;
            }
            throw E.a(b.this.L());
        }
    }

    /* JADX INFO: renamed from: j3.b$b, reason: collision with other inner class name */
    public static final class C0131b extends X2.m implements W2.q {

        /* JADX INFO: renamed from: j3.b$b$a */
        public static final class a extends X2.m implements W2.l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Object f8594n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ b f8595o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, b bVar, p3.a aVar) {
                super(1);
                this.f8594n = obj;
                this.f8595o = bVar;
            }

            public final void a(Throwable th) {
                if (this.f8594n == c.z()) {
                    return;
                }
                W2.l lVar = this.f8595o.f8588n;
                throw null;
            }

            @Override // W2.l
            public /* bridge */ /* synthetic */ Object k(Object obj) {
                a((Throwable) obj);
                return K2.p.f2516a;
            }
        }

        public C0131b() {
            super(3);
        }

        public final W2.l a(p3.a aVar, Object obj, Object obj2) {
            return new a(obj2, b.this, aVar);
        }

        @Override // W2.q
        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) {
            i.d.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public b(int i4, W2.l lVar) {
        this.f8587m = i4;
        this.f8588n = lVar;
        if (i4 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i4 + ", should be >=0").toString());
        }
        this.bufferEnd = c.A(i4);
        this.completedExpandBuffersAndPauseFlag = J();
        j jVar = new j(0L, null, this, 3);
        this.sendSegment = jVar;
        this.receiveSegment = jVar;
        if (Z()) {
            jVar = c.f8596a;
            X2.l.c(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar;
        this.f8589o = lVar != null ? new C0131b() : null;
        this._closeCause = c.f8614s;
    }

    public static /* synthetic */ void R(b bVar, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i4 & 1) != 0) {
            j4 = 1;
        }
        bVar.Q(j4);
    }

    public static /* synthetic */ Object n0(b bVar, N2.e eVar) throws Throwable {
        j jVar;
        j jVar2 = (j) f8583u.get(bVar);
        while (!bVar.V()) {
            long andIncrement = f8579q.getAndIncrement(bVar);
            int i4 = c.f8597b;
            long j4 = andIncrement / ((long) i4);
            int i5 = (int) (andIncrement % ((long) i4));
            if (jVar2.f10514o != j4) {
                j jVarH = bVar.H(j4, jVar2);
                if (jVarH == null) {
                    continue;
                } else {
                    jVar = jVarH;
                }
            } else {
                jVar = jVar2;
            }
            b bVar2 = bVar;
            Object objA0 = bVar2.A0(jVar, i5, andIncrement, null);
            if (objA0 == c.f8608m) {
                throw new IllegalStateException("unexpected");
            }
            if (objA0 != c.f8610o) {
                if (objA0 == c.f8609n) {
                    return bVar2.o0(jVar, i5, andIncrement, eVar);
                }
                jVar.b();
                return objA0;
            }
            if (andIncrement < bVar2.O()) {
                jVar.b();
            }
            bVar = bVar2;
            jVar2 = jVar;
        }
        throw E.a(bVar.L());
    }

    public static /* synthetic */ Object t0(b bVar, Object obj, N2.e eVar) throws IllegalAccessException, InvocationTargetException {
        j jVar;
        j jVar2 = (j) f8582t.get(bVar);
        while (true) {
            long andIncrement = f8578p.getAndIncrement(bVar);
            long j4 = andIncrement & 1152921504606846975L;
            boolean zX = bVar.X(andIncrement);
            int i4 = c.f8597b;
            long j5 = j4 / ((long) i4);
            int i5 = (int) (j4 % ((long) i4));
            if (jVar2.f10514o != j5) {
                j jVarI = bVar.I(j5, jVar2);
                if (jVarI != null) {
                    jVar = jVarI;
                } else if (zX) {
                    Object objH0 = bVar.h0(obj, eVar);
                    if (objH0 == O2.c.c()) {
                        return objH0;
                    }
                }
            } else {
                jVar = jVar2;
            }
            b bVar2 = bVar;
            Object obj2 = obj;
            int iC0 = bVar2.C0(jVar, i5, obj2, j4, null, zX);
            if (iC0 == 0) {
                jVar.b();
                break;
            }
            if (iC0 == 1) {
                break;
            }
            if (iC0 != 2) {
                if (iC0 == 3) {
                    Object objU0 = bVar2.u0(jVar, i5, obj2, j4, eVar);
                    if (objU0 == O2.c.c()) {
                        return objU0;
                    }
                } else if (iC0 != 4) {
                    if (iC0 == 5) {
                        jVar.b();
                    }
                    bVar = bVar2;
                    jVar2 = jVar;
                    obj = obj2;
                } else {
                    if (j4 < bVar2.M()) {
                        jVar.b();
                    }
                    Object objH02 = bVar2.h0(obj2, eVar);
                    if (objH02 == O2.c.c()) {
                        return objH02;
                    }
                }
            } else if (zX) {
                jVar.p();
                Object objH03 = bVar2.h0(obj2, eVar);
                if (objH03 == O2.c.c()) {
                    return objH03;
                }
            }
        }
        return K2.p.f2516a;
    }

    @Override // j3.s
    public Object A() {
        j jVarH;
        long j4 = f8579q.get(this);
        long j5 = f8578p.get(this);
        if (W(j5)) {
            return h.f8620a.a(K());
        }
        if (j4 >= (j5 & 1152921504606846975L)) {
            return h.f8620a.b();
        }
        Object obj = c.f8606k;
        j jVar = (j) f8583u.get(this);
        while (!V()) {
            long andIncrement = f8579q.getAndIncrement(this);
            int i4 = c.f8597b;
            long j6 = andIncrement / ((long) i4);
            int i5 = (int) (andIncrement % ((long) i4));
            if (jVar.f10514o != j6) {
                jVarH = H(j6, jVar);
                if (jVarH == null) {
                    continue;
                }
            } else {
                jVarH = jVar;
            }
            Object objA0 = A0(jVarH, i5, andIncrement, obj);
            if (objA0 == c.f8608m) {
                P0 p02 = obj instanceof P0 ? (P0) obj : null;
                if (p02 != null) {
                    l0(p02, jVarH, i5);
                }
                G0(andIncrement);
                jVarH.p();
                return h.f8620a.b();
            }
            if (objA0 != c.f8610o) {
                if (objA0 == c.f8609n) {
                    throw new IllegalStateException("unexpected");
                }
                jVarH.b();
                return h.f8620a.c(objA0);
            }
            if (andIncrement < O()) {
                jVarH.b();
            }
            jVar = jVarH;
        }
        return h.f8620a.a(K());
    }

    public final Object A0(j jVar, int i4, long j4, Object obj) {
        Object objW = jVar.w(i4);
        if (objW == null) {
            if (j4 >= (f8578p.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return c.f8609n;
                }
                if (jVar.r(i4, objW, obj)) {
                    F();
                    return c.f8608m;
                }
            }
        } else if (objW == c.f8599d && jVar.r(i4, objW, c.f8604i)) {
            F();
            return jVar.y(i4);
        }
        return B0(jVar, i4, j4, obj);
    }

    @Override // j3.t
    public Object B(Object obj) {
        Object obj2;
        int i4;
        j jVar;
        b bVar;
        if (v0(f8578p.get(this))) {
            return h.f8620a.b();
        }
        Object obj3 = c.f8605j;
        j jVar2 = (j) f8582t.get(this);
        while (true) {
            long andIncrement = f8578p.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean zX = X(andIncrement);
            int i5 = c.f8597b;
            long j5 = j4 / ((long) i5);
            int i6 = (int) (j4 % ((long) i5));
            if (jVar2.f10514o != j5) {
                j jVarI = I(j5, jVar2);
                if (jVarI != null) {
                    i4 = i6;
                    jVar = jVarI;
                    bVar = this;
                    obj2 = obj;
                } else if (zX) {
                    return h.f8620a.a(N());
                }
            } else {
                obj2 = obj;
                i4 = i6;
                jVar = jVar2;
                bVar = this;
            }
            int iC0 = bVar.C0(jVar, i4, obj2, j4, obj3, zX);
            jVar2 = jVar;
            if (iC0 == 0) {
                jVar2.b();
                return h.f8620a.c(K2.p.f2516a);
            }
            if (iC0 == 1) {
                return h.f8620a.c(K2.p.f2516a);
            }
            if (iC0 == 2) {
                if (zX) {
                    jVar2.p();
                    return h.f8620a.a(N());
                }
                P0 p02 = obj3 instanceof P0 ? (P0) obj3 : null;
                if (p02 != null) {
                    m0(p02, jVar2, i4);
                }
                jVar2.p();
                return h.f8620a.b();
            }
            if (iC0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iC0 == 4) {
                if (j4 < M()) {
                    jVar2.b();
                }
                return h.f8620a.a(N());
            }
            if (iC0 == 5) {
                jVar2.b();
            }
            obj = obj2;
        }
    }

    public final Object B0(j jVar, int i4, long j4, Object obj) {
        while (true) {
            Object objW = jVar.w(i4);
            if (objW == null || objW == c.f8600e) {
                if (j4 < (f8578p.get(this) & 1152921504606846975L)) {
                    if (jVar.r(i4, objW, c.f8603h)) {
                        F();
                        return c.f8610o;
                    }
                } else {
                    if (obj == null) {
                        return c.f8609n;
                    }
                    if (jVar.r(i4, objW, obj)) {
                        F();
                        return c.f8608m;
                    }
                }
            } else {
                if (objW != c.f8599d) {
                    if (objW != c.f8605j && objW != c.f8603h) {
                        if (objW == c.z()) {
                            F();
                            return c.f8610o;
                        }
                        if (objW != c.f8602g && jVar.r(i4, objW, c.f8601f)) {
                            boolean z3 = objW instanceof u;
                            if (z3) {
                                objW = ((u) objW).f8632a;
                            }
                            if (x0(objW, jVar, i4)) {
                                jVar.A(i4, c.f8604i);
                                F();
                                return jVar.y(i4);
                            }
                            jVar.A(i4, c.f8605j);
                            jVar.x(i4, false);
                            if (z3) {
                                F();
                            }
                            return c.f8610o;
                        }
                    }
                    return c.f8610o;
                }
                if (jVar.r(i4, objW, c.f8604i)) {
                    F();
                    return jVar.y(i4);
                }
            }
        }
    }

    public final void C() {
        E();
    }

    public final int C0(j jVar, int i4, Object obj, long j4, Object obj2, boolean z3) {
        jVar.B(i4, obj);
        if (z3) {
            return D0(jVar, i4, obj, j4, obj2, z3);
        }
        Object objW = jVar.w(i4);
        if (objW == null) {
            if (r(j4)) {
                if (jVar.r(i4, null, c.f8599d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.r(i4, null, obj2)) {
                    return 2;
                }
            }
        } else if (objW instanceof P0) {
            jVar.s(i4);
            if (w0(objW, obj)) {
                jVar.A(i4, c.f8604i);
                j0();
                return 0;
            }
            if (jVar.t(i4, c.f8606k) == c.f8606k) {
                return 5;
            }
            jVar.x(i4, true);
            return 5;
        }
        return D0(jVar, i4, obj, j4, obj2, z3);
    }

    public final void D(long j4) {
        O oD;
        j jVar = (j) f8583u.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8579q;
            long j5 = atomicLongFieldUpdater.get(this);
            if (j4 < Math.max(((long) this.f8587m) + j5, J())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j5, 1 + j5)) {
                int i4 = c.f8597b;
                long j6 = j5 / ((long) i4);
                int i5 = (int) (j5 % ((long) i4));
                if (jVar.f10514o != j6) {
                    j jVarH = H(j6, jVar);
                    if (jVarH == null) {
                        continue;
                    } else {
                        jVar = jVarH;
                    }
                }
                j jVar2 = jVar;
                Object objA0 = A0(jVar2, i5, j5, null);
                if (objA0 != c.f8610o) {
                    jVar2.b();
                    W2.l lVar = this.f8588n;
                    if (lVar != null && (oD = x.d(lVar, objA0, null, 2, null)) != null) {
                        throw oD;
                    }
                } else if (j5 < O()) {
                    jVar2.b();
                }
                jVar = jVar2;
            }
        }
    }

    public final int D0(j jVar, int i4, Object obj, long j4, Object obj2, boolean z3) {
        while (true) {
            Object objW = jVar.w(i4);
            if (objW == null) {
                if (!r(j4) || z3) {
                    if (z3) {
                        if (jVar.r(i4, null, c.f8605j)) {
                            jVar.x(i4, false);
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.r(i4, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.r(i4, null, c.f8599d)) {
                    return 1;
                }
            } else {
                if (objW != c.f8600e) {
                    if (objW == c.f8606k) {
                        jVar.s(i4);
                        return 5;
                    }
                    if (objW == c.f8603h) {
                        jVar.s(i4);
                        return 5;
                    }
                    if (objW == c.z()) {
                        jVar.s(i4);
                        C();
                        return 4;
                    }
                    jVar.s(i4);
                    if (objW instanceof u) {
                        objW = ((u) objW).f8632a;
                    }
                    if (w0(objW, obj)) {
                        jVar.A(i4, c.f8604i);
                        j0();
                        return 0;
                    }
                    if (jVar.t(i4, c.f8606k) != c.f8606k) {
                        jVar.x(i4, true);
                    }
                    return 5;
                }
                if (jVar.r(i4, objW, c.f8599d)) {
                    return 1;
                }
            }
        }
    }

    @Override // j3.t
    public boolean E() {
        return X(f8578p.get(this));
    }

    public final void E0(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8579q;
        while (true) {
            long j5 = atomicLongFieldUpdater.get(this);
            if (j5 >= j4) {
                return;
            }
            long j6 = j4;
            if (f8579q.compareAndSet(this, j5, j6)) {
                return;
            } else {
                j4 = j6;
            }
        }
    }

    public final void F() {
        if (Z()) {
            return;
        }
        j jVar = (j) f8584v.get(this);
        while (true) {
            long andIncrement = f8580r.getAndIncrement(this);
            int i4 = c.f8597b;
            long j4 = andIncrement / ((long) i4);
            if (O() <= andIncrement) {
                if (jVar.f10514o < j4 && jVar.e() != null) {
                    e0(j4, jVar);
                }
                R(this, 0L, 1, null);
                return;
            }
            if (jVar.f10514o != j4) {
                j jVarG = G(j4, jVar, andIncrement);
                if (jVarG == null) {
                    continue;
                } else {
                    jVar = jVarG;
                }
            }
            if (y0(jVar, (int) (andIncrement % ((long) i4)), andIncrement)) {
                R(this, 0L, 1, null);
                return;
            }
            R(this, 0L, 1, null);
        }
    }

    public final void F0(long j4) {
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8578p;
        do {
            j5 = atomicLongFieldUpdater.get(this);
            j6 = 1152921504606846975L & j5;
            if (j6 >= j4) {
                return;
            }
        } while (!f8578p.compareAndSet(this, j5, c.w(j6, (int) (j5 >> 60))));
    }

    public final j G(long j4, j jVar, long j5) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8584v;
        W2.p pVar = (W2.p) c.y();
        loop0: while (true) {
            objC = AbstractC1419d.c(jVar, j4, pVar);
            if (!D.c(objC)) {
                C cB = D.b(objC);
                while (true) {
                    C c4 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c4.f10514o >= cB.f10514o) {
                        break loop0;
                    }
                    if (!cB.q()) {
                        break;
                    }
                    if (AbstractC1489b.a(atomicReferenceFieldUpdater, this, c4, cB)) {
                        if (c4.m()) {
                            c4.k();
                        }
                    } else if (cB.m()) {
                        cB.k();
                    }
                }
            } else {
                break;
            }
        }
        if (D.c(objC)) {
            C();
            e0(j4, jVar);
            R(this, 0L, 1, null);
            return null;
        }
        j jVar2 = (j) D.b(objC);
        long j6 = jVar2.f10514o;
        if (j6 <= j4) {
            return jVar2;
        }
        int i4 = c.f8597b;
        if (f8580r.compareAndSet(this, j5 + 1, j6 * ((long) i4))) {
            Q((jVar2.f10514o * ((long) i4)) - j5);
        } else {
            R(this, 0L, 1, null);
        }
        return null;
    }

    public final void G0(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b bVar = this;
        if (bVar.Z()) {
            return;
        }
        while (bVar.J() <= j4) {
            bVar = this;
        }
        int i4 = c.f8598c;
        for (int i5 = 0; i5 < i4; i5++) {
            long J3 = bVar.J();
            if (J3 == (4611686018427387903L & f8581s.get(bVar)) && J3 == bVar.J()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8581s;
        while (true) {
            long j5 = atomicLongFieldUpdater2.get(bVar);
            if (atomicLongFieldUpdater2.compareAndSet(bVar, j5, c.v(j5 & 4611686018427387903L, true))) {
                break;
            } else {
                bVar = this;
            }
        }
        while (true) {
            long J4 = bVar.J();
            atomicLongFieldUpdater = f8581s;
            long j6 = atomicLongFieldUpdater.get(bVar);
            long j7 = j6 & 4611686018427387903L;
            boolean z3 = (4611686018427387904L & j6) != 0;
            if (J4 == j7 && J4 == bVar.J()) {
                break;
            }
            if (z3) {
                bVar = this;
            } else {
                bVar = this;
                atomicLongFieldUpdater.compareAndSet(bVar, j6, c.v(j7, true));
            }
        }
        while (true) {
            long j8 = atomicLongFieldUpdater.get(bVar);
            if (atomicLongFieldUpdater.compareAndSet(bVar, j8, c.v(j8 & 4611686018427387903L, false))) {
                return;
            } else {
                bVar = this;
            }
        }
    }

    public final j H(long j4, j jVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8583u;
        W2.p pVar = (W2.p) c.y();
        loop0: while (true) {
            objC = AbstractC1419d.c(jVar, j4, pVar);
            if (!D.c(objC)) {
                C cB = D.b(objC);
                while (true) {
                    C c4 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c4.f10514o >= cB.f10514o) {
                        break loop0;
                    }
                    if (!cB.q()) {
                        break;
                    }
                    if (AbstractC1489b.a(atomicReferenceFieldUpdater, this, c4, cB)) {
                        if (c4.m()) {
                            c4.k();
                        }
                    } else if (cB.m()) {
                        cB.k();
                    }
                }
            } else {
                break;
            }
        }
        if (D.c(objC)) {
            C();
            if (jVar.f10514o * ((long) c.f8597b) < O()) {
                jVar.b();
            }
            return null;
        }
        j jVar2 = (j) D.b(objC);
        if (!Z() && j4 <= J() / ((long) c.f8597b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8584v;
            while (true) {
                C c5 = (C) atomicReferenceFieldUpdater2.get(this);
                if (c5.f10514o >= jVar2.f10514o || !jVar2.q()) {
                    break;
                }
                if (AbstractC1489b.a(atomicReferenceFieldUpdater2, this, c5, jVar2)) {
                    if (c5.m()) {
                        c5.k();
                    }
                } else if (jVar2.m()) {
                    jVar2.k();
                }
            }
        }
        long j5 = jVar2.f10514o;
        if (j5 <= j4) {
            return jVar2;
        }
        int i4 = c.f8597b;
        E0(j5 * ((long) i4));
        if (jVar2.f10514o * ((long) i4) < O()) {
            jVar2.b();
        }
        return null;
    }

    public final j I(long j4, j jVar) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8582t;
        W2.p pVar = (W2.p) c.y();
        loop0: while (true) {
            objC = AbstractC1419d.c(jVar, j4, pVar);
            if (!D.c(objC)) {
                C cB = D.b(objC);
                while (true) {
                    C c4 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c4.f10514o >= cB.f10514o) {
                        break loop0;
                    }
                    if (!cB.q()) {
                        break;
                    }
                    if (AbstractC1489b.a(atomicReferenceFieldUpdater, this, c4, cB)) {
                        if (c4.m()) {
                            c4.k();
                        }
                    } else if (cB.m()) {
                        cB.k();
                    }
                }
            } else {
                break;
            }
        }
        if (D.c(objC)) {
            C();
            if (jVar.f10514o * ((long) c.f8597b) < M()) {
                jVar.b();
            }
            return null;
        }
        j jVar2 = (j) D.b(objC);
        long j5 = jVar2.f10514o;
        if (j5 <= j4) {
            return jVar2;
        }
        int i4 = c.f8597b;
        F0(j5 * ((long) i4));
        if (jVar2.f10514o * ((long) i4) < M()) {
            jVar2.b();
        }
        return null;
    }

    public final long J() {
        return f8580r.get(this);
    }

    public final Throwable K() {
        return (Throwable) f8585w.get(this);
    }

    public final Throwable L() {
        Throwable thK = K();
        return thK == null ? new m("Channel was closed") : thK;
    }

    public final long M() {
        return f8579q.get(this);
    }

    public final Throwable N() {
        Throwable thK = K();
        return thK == null ? new n("Channel was closed") : thK;
    }

    public final long O() {
        return f8578p.get(this) & 1152921504606846975L;
    }

    public final boolean P() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8583u;
            j jVarH = (j) atomicReferenceFieldUpdater.get(this);
            long jM = M();
            if (O() <= jM) {
                return false;
            }
            int i4 = c.f8597b;
            long j4 = jM / ((long) i4);
            if (jVarH.f10514o == j4 || (jVarH = H(j4, jVarH)) != null) {
                jVarH.b();
                if (T(jVarH, (int) (jM % ((long) i4)), jM)) {
                    return true;
                }
                f8579q.compareAndSet(this, jM, jM + 1);
            } else if (((j) atomicReferenceFieldUpdater.get(this)).f10514o < j4) {
                return false;
            }
        }
    }

    public final void Q(long j4) {
        if ((f8581s.addAndGet(this, j4) & 4611686018427387904L) != 0) {
            while ((f8581s.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void S() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8586x;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC1489b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? c.f8612q : c.f8613r));
        if (obj == null) {
            return;
        }
        ((W2.l) obj).k(K());
    }

    public final boolean T(j jVar, int i4, long j4) {
        Object objW;
        do {
            objW = jVar.w(i4);
            if (objW != null && objW != c.f8600e) {
                if (objW == c.f8599d) {
                    return true;
                }
                if (objW == c.f8605j || objW == c.z() || objW == c.f8604i || objW == c.f8603h) {
                    return false;
                }
                if (objW == c.f8602g) {
                    return true;
                }
                return objW != c.f8601f && j4 == M();
            }
        } while (!jVar.r(i4, objW, c.f8603h));
        F();
        return false;
    }

    public final boolean U(long j4, boolean z3) throws IllegalAccessException, InvocationTargetException {
        int i4 = (int) (j4 >> 60);
        if (i4 == 0 || i4 == 1) {
            return false;
        }
        if (i4 == 2) {
            z(j4 & 1152921504606846975L);
            return (z3 && P()) ? false : true;
        }
        if (i4 == 3) {
            x(j4 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i4).toString());
    }

    public boolean V() {
        return W(f8578p.get(this));
    }

    public final boolean W(long j4) {
        return U(j4, true);
    }

    public final boolean X(long j4) {
        return U(j4, false);
    }

    public boolean Y() {
        return false;
    }

    public final boolean Z() {
        long J3 = J();
        return J3 == 0 || J3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r8 = (j3.j) r8.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a0(j3.j r8) {
        /*
            r7 = this;
        L0:
            int r0 = j3.c.f8597b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f10514o
            int r5 = j3.c.f8597b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.M()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.w(r0)
            if (r1 == 0) goto L2c
            m3.F r2 = j3.c.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            m3.F r2 = j3.c.f8599d
            if (r1 != r2) goto L39
            return r3
        L2c:
            m3.F r2 = j3.c.z()
            boolean r1 = r8.r(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.p()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            m3.e r8 = r8.g()
            j3.j r8 = (j3.j) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.b.a0(j3.j):long");
    }

    public final void b0() {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8578p;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            if (((int) (j4 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, c.w(1152921504606846975L & j4, 1)));
    }

    public final void c0() {
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8578p;
        do {
            j4 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, c.w(1152921504606846975L & j4, 3)));
    }

    public final void d0() {
        long j4;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8578p;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            int i4 = (int) (j4 >> 60);
            if (i4 == 0) {
                jW = c.w(1152921504606846975L & j4, 2);
            } else if (i4 != 1) {
                return;
            } else {
                jW = c.w(1152921504606846975L & j4, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, jW));
    }

    @Override // j3.s
    public final void e(CancellationException cancellationException) {
        t(cancellationException);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(long r5, j3.j r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f10514o
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            m3.e r0 = r7.e()
            j3.j r0 = (j3.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.h()
            if (r5 == 0) goto L22
            m3.e r5 = r7.e()
            j3.j r5 = (j3.j) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = j3.b.f8584v
        L24:
            java.lang.Object r6 = r5.get(r4)
            m3.C r6 = (m3.C) r6
            long r0 = r6.f10514o
            long r2 = r7.f10514o
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            return
        L33:
            boolean r0 = r7.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = q.AbstractC1489b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m()
            if (r5 == 0) goto L49
            r6.k()
        L49:
            return
        L4a:
            boolean r6 = r7.m()
            if (r6 == 0) goto L24
            r7.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.b.e0(long, j3.j):void");
    }

    public final void g0(InterfaceC1016l interfaceC1016l) {
        j.a aVar = K2.j.f2509n;
        interfaceC1016l.p(K2.j.b(K2.k.a(L())));
    }

    public final Object h0(Object obj, N2.e eVar) throws IllegalAccessException, InvocationTargetException {
        O oD;
        C1018m c1018m = new C1018m(O2.b.b(eVar), 1);
        c1018m.A();
        W2.l lVar = this.f8588n;
        if (lVar == null || (oD = x.d(lVar, obj, null, 2, null)) == null) {
            Throwable thN = N();
            j.a aVar = K2.j.f2509n;
            c1018m.p(K2.j.b(K2.k.a(thN)));
        } else {
            K2.a.a(oD, N());
            j.a aVar2 = K2.j.f2509n;
            c1018m.p(K2.j.b(K2.k.a(oD)));
        }
        Object objX = c1018m.x();
        if (objX == O2.c.c()) {
            P2.h.c(eVar);
        }
        return objX == O2.c.c() ? objX : K2.p.f2516a;
    }

    public final void i0(Object obj, InterfaceC1016l interfaceC1016l) throws IllegalAccessException, InvocationTargetException {
        W2.l lVar = this.f8588n;
        if (lVar != null) {
            x.b(lVar, obj, interfaceC1016l.b());
        }
        Throwable thN = N();
        j.a aVar = K2.j.f2509n;
        interfaceC1016l.p(K2.j.b(K2.k.a(thN)));
    }

    @Override // j3.s
    public f iterator() {
        return new a();
    }

    public final void l0(P0 p02, j jVar, int i4) {
        k0();
        p02.c(jVar, i4);
    }

    @Override // j3.t
    public Object m(Object obj, N2.e eVar) {
        return t0(this, obj, eVar);
    }

    public final void m0(P0 p02, j jVar, int i4) {
        p02.c(jVar, i4 + c.f8597b);
    }

    @Override // j3.t
    public boolean n(Throwable th) {
        return w(th, false);
    }

    public final Object o0(j jVar, int i4, long j4, N2.e eVar) {
        j jVar2;
        C1018m c1018mB = AbstractC1022o.b(O2.b.b(eVar));
        try {
            Object objA0 = A0(jVar, i4, j4, c1018mB);
            if (objA0 == c.f8608m) {
                l0(c1018mB, jVar, i4);
            } else {
                W2.l lVarA = null;
                lVarA = null;
                if (objA0 == c.f8610o) {
                    if (j4 < O()) {
                        jVar.b();
                    }
                    j jVar3 = (j) f8583u.get(this);
                    while (true) {
                        if (V()) {
                            g0(c1018mB);
                            break;
                        }
                        long andIncrement = f8579q.getAndIncrement(this);
                        int i5 = c.f8597b;
                        long j5 = andIncrement / ((long) i5);
                        int i6 = (int) (andIncrement % ((long) i5));
                        if (jVar3.f10514o != j5) {
                            j jVarH = H(j5, jVar3);
                            if (jVarH != null) {
                                jVar2 = jVarH;
                            }
                        } else {
                            jVar2 = jVar3;
                        }
                        objA0 = A0(jVar2, i6, andIncrement, c1018mB);
                        j jVar4 = jVar2;
                        if (objA0 == c.f8608m) {
                            C1018m c1018m = c1018mB != null ? c1018mB : null;
                            if (c1018m != null) {
                                l0(c1018m, jVar4, i6);
                            }
                        } else if (objA0 == c.f8610o) {
                            if (andIncrement < O()) {
                                jVar4.b();
                            }
                            jVar3 = jVar4;
                        } else {
                            if (objA0 == c.f8609n) {
                                throw new IllegalStateException("unexpected");
                            }
                            jVar4.b();
                            W2.l lVar = this.f8588n;
                            if (lVar != null) {
                                lVarA = x.a(lVar, objA0, c1018mB.b());
                            }
                        }
                    }
                } else {
                    jVar.b();
                    W2.l lVar2 = this.f8588n;
                    if (lVar2 != null) {
                        lVarA = x.a(lVar2, objA0, c1018mB.b());
                    }
                }
                c1018mB.v(objA0, lVarA);
            }
            Object objX = c1018mB.x();
            if (objX == O2.c.c()) {
                P2.h.c(eVar);
            }
            return objX;
        } catch (Throwable th) {
            c1018mB.L();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b3, code lost:
    
        r12 = (j3.j) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p0(j3.j r12) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.b.p0(j3.j):void");
    }

    public final void q0(P0 p02) {
        s0(p02, true);
    }

    public final boolean r(long j4) {
        return j4 < J() || j4 < M() + ((long) this.f8587m);
    }

    public final void r0(P0 p02) {
        s0(p02, false);
    }

    @Override // j3.t
    public void s(W2.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8586x;
        if (AbstractC1489b.a(atomicReferenceFieldUpdater, this, null, lVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != c.f8612q) {
                if (obj == c.f8613r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!AbstractC1489b.a(f8586x, this, c.f8612q, c.f8613r));
        lVar.k(K());
    }

    public final void s0(P0 p02, boolean z3) {
        if (p02 instanceof InterfaceC1016l) {
            N2.e eVar = (N2.e) p02;
            j.a aVar = K2.j.f2509n;
            eVar.p(K2.j.b(K2.k.a(z3 ? L() : N())));
        } else {
            if (p02 instanceof a) {
                ((a) p02).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + p02).toString());
        }
    }

    public boolean t(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return w(th, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x01bf, code lost:
    
        r16 = r7;
        r3 = (j3.j) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01c8, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.b.toString():java.lang.String");
    }

    public final void u(j jVar, long j4) {
        Object objB = AbstractC1427l.b(null, 1, null);
        loop0: while (jVar != null) {
            for (int i4 = c.f8597b - 1; -1 < i4; i4--) {
                if ((jVar.f10514o * ((long) c.f8597b)) + ((long) i4) < j4) {
                    break loop0;
                }
                while (true) {
                    Object objW = jVar.w(i4);
                    if (objW != null && objW != c.f8600e) {
                        if (!(objW instanceof u)) {
                            if (!(objW instanceof P0)) {
                                break;
                            }
                            if (jVar.r(i4, objW, c.z())) {
                                objB = AbstractC1427l.c(objB, objW);
                                jVar.x(i4, true);
                                break;
                            }
                        } else {
                            if (jVar.r(i4, objW, c.z())) {
                                objB = AbstractC1427l.c(objB, ((u) objW).f8632a);
                                jVar.x(i4, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar.r(i4, objW, c.z())) {
                            jVar.p();
                            break;
                        }
                    }
                }
            }
            jVar = (j) jVar.g();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                q0((P0) objB);
                return;
            }
            X2.l.c(objB, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                q0((P0) arrayList.get(size));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u0(j3.j r17, int r18, java.lang.Object r19, long r20, N2.e r22) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.b.u0(j3.j, int, java.lang.Object, long, N2.e):java.lang.Object");
    }

    public final j v() {
        Object obj = f8584v.get(this);
        j jVar = (j) f8582t.get(this);
        if (jVar.f10514o > ((j) obj).f10514o) {
            obj = jVar;
        }
        j jVar2 = (j) f8583u.get(this);
        if (jVar2.f10514o > ((j) obj).f10514o) {
            obj = jVar2;
        }
        return (j) AbstractC1419d.b((AbstractC1420e) obj);
    }

    public final boolean v0(long j4) {
        if (X(j4)) {
            return false;
        }
        return !r(j4 & 1152921504606846975L);
    }

    public boolean w(Throwable th, boolean z3) {
        if (z3) {
            b0();
        }
        boolean zA = AbstractC1489b.a(f8585w, this, c.f8614s, th);
        if (z3) {
            c0();
        } else {
            d0();
        }
        C();
        f0();
        if (zA) {
            S();
        }
        return zA;
    }

    public final boolean w0(Object obj, Object obj2) {
        if (obj instanceof a) {
            X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (obj instanceof InterfaceC1016l) {
            X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
            InterfaceC1016l interfaceC1016l = (InterfaceC1016l) obj;
            W2.l lVar = this.f8588n;
            return c.B(interfaceC1016l, obj2, lVar != null ? x.a(lVar, obj2, interfaceC1016l.b()) : null);
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    public final void x(long j4) throws IllegalAccessException, InvocationTargetException {
        p0(z(j4));
    }

    public final boolean x0(Object obj, j jVar, int i4) {
        if (obj instanceof InterfaceC1016l) {
            X2.l.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((InterfaceC1016l) obj, K2.p.f2516a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @Override // j3.s
    public Object y(N2.e eVar) {
        return n0(this, eVar);
    }

    public final boolean y0(j jVar, int i4, long j4) {
        Object objW = jVar.w(i4);
        if (!(objW instanceof P0) || j4 < f8579q.get(this) || !jVar.r(i4, objW, c.f8602g)) {
            return z0(jVar, i4, j4);
        }
        if (x0(objW, jVar, i4)) {
            jVar.A(i4, c.f8599d);
            return true;
        }
        jVar.A(i4, c.f8605j);
        jVar.x(i4, false);
        return false;
    }

    public final j z(long j4) {
        j jVarV = v();
        if (Y()) {
            long jA0 = a0(jVarV);
            if (jA0 != -1) {
                D(jA0);
            }
        }
        u(jVarV, j4);
        return jVarV;
    }

    public final boolean z0(j jVar, int i4, long j4) {
        while (true) {
            Object objW = jVar.w(i4);
            if (objW instanceof P0) {
                if (j4 < f8579q.get(this)) {
                    if (jVar.r(i4, objW, new u((P0) objW))) {
                        return true;
                    }
                } else if (jVar.r(i4, objW, c.f8602g)) {
                    if (x0(objW, jVar, i4)) {
                        jVar.A(i4, c.f8599d);
                        return true;
                    }
                    jVar.A(i4, c.f8605j);
                    jVar.x(i4, false);
                    return false;
                }
            } else {
                if (objW == c.f8605j) {
                    return false;
                }
                if (objW == null) {
                    if (jVar.r(i4, objW, c.f8600e)) {
                        return true;
                    }
                } else {
                    if (objW == c.f8599d || objW == c.f8603h || objW == c.f8604i || objW == c.f8606k || objW == c.z()) {
                        return true;
                    }
                    if (objW != c.f8601f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objW).toString());
                    }
                }
            }
        }
    }

    public void f0() {
    }

    public void j0() {
    }

    public void k0() {
    }
}
