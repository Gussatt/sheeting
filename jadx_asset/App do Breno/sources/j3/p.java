package j3;

import K2.j;
import h3.E;
import h3.I;
import h3.InterfaceC1016l;
import h3.K;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f8627p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f8628q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f8629r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f8630s;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f8629r = obj;
            this.f8630s |= Integer.MIN_VALUE;
            return p.a(null, null, this);
        }
    }

    public static final class b extends X2.m implements W2.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1016l f8631n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1016l interfaceC1016l) {
            super(1);
            this.f8631n = interfaceC1016l;
        }

        public final void a(Throwable th) {
            InterfaceC1016l interfaceC1016l = this.f8631n;
            j.a aVar = K2.j.f2509n;
            interfaceC1016l.p(K2.j.b(K2.p.f2516a));
        }

        @Override // W2.l
        public /* bridge */ /* synthetic */ Object k(Object obj) {
            a((Throwable) obj);
            return K2.p.f2516a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(j3.r r4, W2.a r5, N2.e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof j3.p.a
            if (r0 == 0) goto L13
            r0 = r6
            j3.p$a r0 = (j3.p.a) r0
            int r1 = r0.f8630s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8630s = r1
            goto L18
        L13:
            j3.p$a r0 = new j3.p$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f8629r
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f8630s
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f8628q
            r5 = r4
            W2.a r5 = (W2.a) r5
            java.lang.Object r4 = r0.f8627p
            j3.r r4 = (j3.r) r4
            K2.k.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            K2.k.b(r6)
            N2.i r6 = r0.b()
            h3.q0$b r2 = h3.InterfaceC1027q0.f7558k
            N2.i$b r6 = r6.d(r2)
            if (r6 != r4) goto L7f
            r0.f8627p = r4     // Catch: java.lang.Throwable -> L32
            r0.f8628q = r5     // Catch: java.lang.Throwable -> L32
            r0.f8630s = r3     // Catch: java.lang.Throwable -> L32
            h3.m r6 = new h3.m     // Catch: java.lang.Throwable -> L32
            N2.e r2 = O2.b.b(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.A()     // Catch: java.lang.Throwable -> L32
            j3.p$b r2 = new j3.p$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.s(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.x()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = O2.c.c()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            P2.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.e()
            K2.p r4 = K2.p.f2516a
            return r4
        L7b:
            r5.e()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.p.a(j3.r, W2.a, N2.e):java.lang.Object");
    }

    public static final s b(I i4, N2.i iVar, int i5, j3.a aVar, K k4, W2.l lVar, W2.p pVar) {
        q qVar = new q(E.e(i4, iVar), g.b(i5, aVar, null, 4, null));
        if (lVar != null) {
            qVar.M(lVar);
        }
        qVar.U0(k4, qVar, pVar);
        return qVar;
    }

    public static /* synthetic */ s c(I i4, N2.i iVar, int i5, j3.a aVar, K k4, W2.l lVar, W2.p pVar, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            iVar = N2.j.f2823m;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        if ((i6 & 4) != 0) {
            aVar = j3.a.SUSPEND;
        }
        if ((i6 & 8) != 0) {
            k4 = K.DEFAULT;
        }
        if ((i6 & 16) != 0) {
            lVar = null;
        }
        W2.l lVar2 = lVar;
        return b(i4, iVar, i5, aVar, k4, lVar2, pVar);
    }
}
