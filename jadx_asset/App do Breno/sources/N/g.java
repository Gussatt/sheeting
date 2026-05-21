package N;

import L.B;
import X2.l;
import t3.AbstractC1552h;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b implements B {

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f2808p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f2809q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f2810r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f2811s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f2813u;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f2811s = obj;
            this.f2813u |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractC1552h abstractC1552h, J j4, c cVar) {
        super(abstractC1552h, j4, cVar);
        l.e(abstractC1552h, "fileSystem");
        l.e(j4, "path");
        l.e(cVar, "serializer");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097 A[Catch: all -> 0x0090, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:42:0x0097, B:48:0x00a4, B:37:0x008c, B:34:0x0087), top: B:60:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[Catch: all -> 0x0090, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0090, blocks: (B:42:0x0097, B:48:0x00a4, B:37:0x008c, B:34:0x0087), top: B:60:0x0022, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [N.g$a, N2.e] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, t3.f] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [t3.f] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [N.c] */
    @Override // L.B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.Object r9, N2.e r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof N.g.a
            if (r0 == 0) goto L13
            r0 = r10
            N.g$a r0 = (N.g.a) r0
            int r1 = r0.f2813u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2813u = r1
            goto L18
        L13:
            N.g$a r0 = new N.g$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f2811s
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f2813u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r9 = r0.f2810r
            java.io.Closeable r9 = (java.io.Closeable) r9
            java.lang.Object r1 = r0.f2809q
            t3.f r1 = (t3.AbstractC1550f) r1
            java.lang.Object r0 = r0.f2808p
            java.io.Closeable r0 = (java.io.Closeable) r0
            K2.k.b(r10)     // Catch: java.lang.Throwable -> L36
            goto L72
        L36:
            r10 = move-exception
            goto L85
        L38:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L40:
            K2.k.b(r10)
            r8.f()
            t3.h r10 = r8.g()
            t3.J r2 = r8.h()
            t3.f r10 = r10.j(r2)
            r5 = 0
            t3.P r2 = t3.AbstractC1550f.x(r10, r5, r3, r4)     // Catch: java.lang.Throwable -> La5
            t3.c r2 = t3.F.a(r2)     // Catch: java.lang.Throwable -> La5
            N.c r5 = r8.i()     // Catch: java.lang.Throwable -> L81
            r0.f2808p = r10     // Catch: java.lang.Throwable -> L81
            r0.f2809q = r10     // Catch: java.lang.Throwable -> L81
            r0.f2810r = r2     // Catch: java.lang.Throwable -> L81
            r0.f2813u = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = r5.c(r9, r2, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L6f
            return r1
        L6f:
            r0 = r10
            r1 = r0
            r9 = r2
        L72:
            r1.flush()     // Catch: java.lang.Throwable -> L36
            K2.p r10 = K2.p.f2516a     // Catch: java.lang.Throwable -> L36
            if (r9 == 0) goto L7f
            r9.close()     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r9 = move-exception
            goto L95
        L7f:
            r9 = r4
            goto L95
        L81:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r2
        L85:
            if (r9 == 0) goto L93
            r9.close()     // Catch: java.lang.Throwable -> L8b
            goto L93
        L8b:
            r9 = move-exception
            K2.a.a(r10, r9)     // Catch: java.lang.Throwable -> L90
            goto L93
        L90:
            r9 = move-exception
            r10 = r0
            goto La6
        L93:
            r9 = r10
            r10 = r4
        L95:
            if (r9 != 0) goto La4
            X2.l.b(r10)     // Catch: java.lang.Throwable -> L90
            K2.p r9 = K2.p.f2516a     // Catch: java.lang.Throwable -> L90
            if (r0 == 0) goto Lb3
            r0.close()     // Catch: java.lang.Throwable -> La2
            goto Lb3
        La2:
            r4 = move-exception
            goto Lb3
        La4:
            throw r9     // Catch: java.lang.Throwable -> L90
        La5:
            r9 = move-exception
        La6:
            if (r10 == 0) goto Lb0
            r10.close()     // Catch: java.lang.Throwable -> Lac
            goto Lb0
        Lac:
            r10 = move-exception
            K2.a.a(r9, r10)
        Lb0:
            r7 = r4
            r4 = r9
            r9 = r7
        Lb3:
            if (r4 != 0) goto Lbb
            X2.l.b(r9)
            K2.p r9 = K2.p.f2516a
            return r9
        Lbb:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: N.g.b(java.lang.Object, N2.e):java.lang.Object");
    }
}
