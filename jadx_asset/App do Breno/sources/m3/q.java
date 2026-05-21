package m3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC1489b;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10556m = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10557n = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10558o = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends AbstractC1417b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final q f10559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q f10560c;

        public a(q qVar) {
            this.f10559b = qVar;
        }

        @Override // m3.AbstractC1417b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(q qVar, Object obj) {
            boolean z3 = obj == null;
            q qVar2 = z3 ? this.f10559b : this.f10560c;
            if (qVar2 != null && AbstractC1489b.a(q.f10556m, qVar, this, qVar2) && z3) {
                q qVar3 = this.f10559b;
                q qVar4 = this.f10560c;
                X2.l.b(qVar4);
                qVar3.q(qVar4);
            }
        }
    }

    public final boolean n(q qVar) {
        f10557n.lazySet(qVar, this);
        f10556m.lazySet(qVar, this);
        while (r() == this) {
            if (AbstractC1489b.a(f10556m, this, this, qVar)) {
                qVar.q(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if (q.AbstractC1489b.a(r4, r3, r2, ((m3.z) r5).f10576a) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final m3.q o(m3.y r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = m3.q.f10557n
            java.lang.Object r0 = r0.get(r8)
            m3.q r0 = (m3.q) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m3.q.f10556m
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L1f
            if (r0 != r2) goto L16
            goto L28
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = m3.q.f10557n
            boolean r0 = q.AbstractC1489b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L28
            goto L0
        L1f:
            boolean r6 = r8.u()
            if (r6 == 0) goto L26
            return r1
        L26:
            if (r5 != r9) goto L29
        L28:
            return r2
        L29:
            boolean r6 = r5 instanceof m3.y
            if (r6 == 0) goto L33
            m3.y r5 = (m3.y) r5
            r5.a(r2)
            goto L0
        L33:
            boolean r6 = r5 instanceof m3.z
            if (r6 == 0) goto L4f
            if (r3 == 0) goto L46
            m3.z r5 = (m3.z) r5
            m3.q r5 = r5.f10576a
            boolean r2 = q.AbstractC1489b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L44
            goto L0
        L44:
            r2 = r3
            goto La
        L46:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = m3.q.f10557n
            java.lang.Object r2 = r4.get(r2)
            m3.q r2 = (m3.q) r2
            goto Lb
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            X2.l.c(r5, r3)
            r3 = r5
            m3.q r3 = (m3.q) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: m3.q.o(m3.y):m3.q");
    }

    public final q p(q qVar) {
        while (qVar.u()) {
            qVar = (q) f10557n.get(qVar);
        }
        return qVar;
    }

    public final void q(q qVar) {
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10557n;
        do {
            qVar2 = (q) atomicReferenceFieldUpdater.get(qVar);
            if (r() != qVar) {
                return;
            }
        } while (!AbstractC1489b.a(f10557n, qVar, qVar2, this));
        if (u()) {
            qVar.o(null);
        }
    }

    public final Object r() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10556m;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final q s() {
        return p.b(r());
    }

    public final q t() {
        q qVarO = o(null);
        return qVarO == null ? p((q) f10557n.get(this)) : qVarO;
    }

    public String toString() {
        return new X2.p(this) { // from class: m3.q.b
            @Override // d3.f
            public Object get() {
                return h3.M.a(this.f3969n);
            }
        } + '@' + h3.M.b(this);
    }

    public boolean u() {
        return r() instanceof z;
    }

    public boolean v() {
        return w() == null;
    }

    public final q w() {
        Object objR;
        q qVar;
        do {
            objR = r();
            if (objR instanceof z) {
                return ((z) objR).f10576a;
            }
            if (objR == this) {
                return (q) objR;
            }
            X2.l.c(objR, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            qVar = (q) objR;
        } while (!AbstractC1489b.a(f10556m, this, objR, qVar.x()));
        qVar.o(null);
        return null;
    }

    public final z x() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10558o;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this);
        atomicReferenceFieldUpdater.lazySet(this, zVar2);
        return zVar2;
    }

    public final int y(q qVar, q qVar2, a aVar) {
        f10557n.lazySet(qVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10556m;
        atomicReferenceFieldUpdater.lazySet(qVar, qVar2);
        aVar.f10560c = qVar2;
        if (AbstractC1489b.a(atomicReferenceFieldUpdater, this, qVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
