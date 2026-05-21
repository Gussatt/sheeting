package L;

import h3.AbstractC1010i;
import h3.I;
import h3.InterfaceC1027q0;
import j3.h;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I f2707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W2.p f2708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j3.d f2709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0476a f2710d;

    public static final class a extends X2.m implements W2.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ W2.l f2711n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ t f2712o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ W2.p f2713p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W2.l lVar, t tVar, W2.p pVar) {
            super(1);
            this.f2711n = lVar;
            this.f2712o = tVar;
            this.f2713p = pVar;
        }

        public final void a(Throwable th) {
            K2.p pVar;
            this.f2711n.k(th);
            this.f2712o.f2709c.n(th);
            do {
                Object objD = j3.h.d(this.f2712o.f2709c.A());
                if (objD != null) {
                    this.f2713p.j(objD, th);
                    pVar = K2.p.f2516a;
                } else {
                    pVar = null;
                }
            } while (pVar != null);
        }

        @Override // W2.l
        public /* bridge */ /* synthetic */ Object k(Object obj) {
            a((Throwable) obj);
            return K2.p.f2516a;
        }
    }

    public static final class b extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f2714q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f2715r;

        public b(N2.e eVar) {
            super(2, eVar);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return t.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.j(r6, r5) != r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 W2.p) = (r1v2 W2.p), (r1v4 W2.p) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // P2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object q(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = O2.c.c()
                int r1 = r5.f2715r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                K2.k.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f2714q
                W2.p r1 = (W2.p) r1
                K2.k.b(r6)
                goto L51
            L22:
                K2.k.b(r6)
                L.t r6 = L.t.this
                L.a r6 = L.t.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                L.t r6 = L.t.this
                h3.I r6 = L.t.d(r6)
                h3.J.c(r6)
                L.t r6 = L.t.this
                W2.p r1 = L.t.a(r6)
                L.t r6 = L.t.this
                j3.d r6 = L.t.b(r6)
                r5.f2714q = r1
                r5.f2715r = r3
                java.lang.Object r6 = r6.y(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f2714q = r4
                r5.f2715r = r2
                java.lang.Object r6 = r1.j(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                L.t r6 = L.t.this
                L.a r6 = L.t.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                K2.p r6 = K2.p.f2516a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: L.t.b.q(java.lang.Object):java.lang.Object");
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(I i4, N2.e eVar) {
            return ((b) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public t(I i4, W2.l lVar, W2.p pVar, W2.p pVar2) {
        X2.l.e(i4, "scope");
        X2.l.e(lVar, "onComplete");
        X2.l.e(pVar, "onUndeliveredElement");
        X2.l.e(pVar2, "consumeMessage");
        this.f2707a = i4;
        this.f2708b = pVar2;
        this.f2709c = j3.g.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f2710d = new C0476a(0);
        InterfaceC1027q0 interfaceC1027q0 = (InterfaceC1027q0) i4.o().d(InterfaceC1027q0.f7558k);
        if (interfaceC1027q0 != null) {
            interfaceC1027q0.M(new a(lVar, this, pVar));
        }
    }

    public final void e(Object obj) throws Throwable {
        Object objB = this.f2709c.B(obj);
        if (objB instanceof h.a) {
            Throwable thC = j3.h.c(objB);
            if (thC != null) {
                throw thC;
            }
            throw new j3.n("Channel was closed normally");
        }
        if (!j3.h.f(objB)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f2710d.c() == 0) {
            AbstractC1010i.d(this.f2707a, null, null, new b(null), 3, null);
        }
    }
}
