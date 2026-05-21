package L;

import h3.AbstractC1032w;
import h3.InterfaceC1030u;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q3.a f2700a = q3.c.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1030u f2701b = AbstractC1032w.b(null, 1, null);

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f2702p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f2703q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f2704r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2706t;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f2704r = obj;
            this.f2706t |= Integer.MIN_VALUE;
            return s.this.c(this);
        }
    }

    public final Object a(N2.e eVar) {
        Object objG = this.f2701b.g(eVar);
        return objG == O2.c.c() ? objG : K2.p.f2516a;
    }

    public abstract Object b(N2.e eVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(N2.e r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof L.s.a
            if (r0 == 0) goto L13
            r0 = r7
            L.s$a r0 = (L.s.a) r0
            int r1 = r0.f2706t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2706t = r1
            goto L18
        L13:
            L.s$a r0 = new L.s$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f2704r
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f2706t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f2703q
            q3.a r1 = (q3.a) r1
            java.lang.Object r0 = r0.f2702p
            L.s r0 = (L.s) r0
            K2.k.b(r7)     // Catch: java.lang.Throwable -> L35
            goto L8b
        L35:
            r7 = move-exception
            goto L96
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L3f:
            java.lang.Object r2 = r0.f2703q
            q3.a r2 = (q3.a) r2
            java.lang.Object r4 = r0.f2702p
            L.s r4 = (L.s) r4
            K2.k.b(r7)
            r7 = r2
            goto L6a
        L4c:
            K2.k.b(r7)
            h3.u r7 = r6.f2701b
            boolean r7 = r7.G()
            if (r7 == 0) goto L5a
            K2.p r7 = K2.p.f2516a
            return r7
        L5a:
            q3.a r7 = r6.f2700a
            r0.f2702p = r6
            r0.f2703q = r7
            r0.f2706t = r4
            java.lang.Object r2 = r7.c(r5, r0)
            if (r2 != r1) goto L69
            goto L88
        L69:
            r4 = r6
        L6a:
            h3.u r2 = r4.f2701b     // Catch: java.lang.Throwable -> L78
            boolean r2 = r2.G()     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L7c
            K2.p r0 = K2.p.f2516a     // Catch: java.lang.Throwable -> L78
            r7.a(r5)
            return r0
        L78:
            r0 = move-exception
            r1 = r7
            r7 = r0
            goto L96
        L7c:
            r0.f2702p = r4     // Catch: java.lang.Throwable -> L78
            r0.f2703q = r7     // Catch: java.lang.Throwable -> L78
            r0.f2706t = r3     // Catch: java.lang.Throwable -> L78
            java.lang.Object r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 != r1) goto L89
        L88:
            return r1
        L89:
            r1 = r7
            r0 = r4
        L8b:
            h3.u r7 = r0.f2701b     // Catch: java.lang.Throwable -> L35
            K2.p r0 = K2.p.f2516a     // Catch: java.lang.Throwable -> L35
            r7.u(r0)     // Catch: java.lang.Throwable -> L35
            r1.a(r5)
            return r0
        L96:
            r1.a(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L.s.c(N2.e):java.lang.Object");
    }
}
