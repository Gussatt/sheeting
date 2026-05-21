package k3;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k {

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f10064p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f10065q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f10066r;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f10065q = obj;
            this.f10066r |= Integer.MIN_VALUE;
            return k.c(null, null, null, this);
        }
    }

    public static final class b implements d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f10067m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ W2.q f10068n;

        public static final class a extends P2.d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f10069p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f10070q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Object f10072s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f10073t;

            public a(N2.e eVar) {
                super(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) {
                this.f10069p = obj;
                this.f10070q |= Integer.MIN_VALUE;
                return b.this.b(null, this);
            }
        }

        public b(d dVar, W2.q qVar) {
            this.f10067m = dVar;
            this.f10068n = qVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // k3.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(k3.e r9, N2.e r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof k3.k.b.a
                if (r0 == 0) goto L13
                r0 = r10
                k3.k$b$a r0 = (k3.k.b.a) r0
                int r1 = r0.f10070q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10070q = r1
                goto L18
            L13:
                k3.k$b$a r0 = new k3.k$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f10069p
                java.lang.Object r1 = O2.c.c()
                int r2 = r0.f10070q
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L55
                if (r2 == r5) goto L47
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f10072s
                l3.n r9 = (l3.n) r9
                K2.k.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L89
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f10072s
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                K2.k.b(r10)
                goto Lad
            L47:
                java.lang.Object r9 = r0.f10073t
                k3.e r9 = (k3.e) r9
                java.lang.Object r2 = r0.f10072s
                k3.k$b r2 = (k3.k.b) r2
                K2.k.b(r10)     // Catch: java.lang.Throwable -> L53
                goto L68
            L53:
                r9 = move-exception
                goto L99
            L55:
                K2.k.b(r10)
                k3.d r10 = r8.f10067m     // Catch: java.lang.Throwable -> L97
                r0.f10072s = r8     // Catch: java.lang.Throwable -> L97
                r0.f10073t = r9     // Catch: java.lang.Throwable -> L97
                r0.f10070q = r5     // Catch: java.lang.Throwable -> L97
                java.lang.Object r10 = r10.b(r9, r0)     // Catch: java.lang.Throwable -> L97
                if (r10 != r1) goto L67
                goto Lac
            L67:
                r2 = r8
            L68:
                l3.n r10 = new l3.n
                N2.i r4 = r0.b()
                r10.<init>(r9, r4)
                W2.q r9 = r2.f10068n     // Catch: java.lang.Throwable -> L8f
                r0.f10072s = r10     // Catch: java.lang.Throwable -> L8f
                r0.f10073t = r6     // Catch: java.lang.Throwable -> L8f
                r0.f10070q = r3     // Catch: java.lang.Throwable -> L8f
                r2 = 6
                X2.k.a(r2)     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r9 = r9.g(r10, r6, r0)     // Catch: java.lang.Throwable -> L8f
                r0 = 7
                X2.k.a(r0)     // Catch: java.lang.Throwable -> L8f
                if (r9 != r1) goto L88
                goto Lac
            L88:
                r9 = r10
            L89:
                r9.r()
                K2.p r9 = K2.p.f2516a
                return r9
            L8f:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L93:
                r9.r()
                throw r10
            L97:
                r9 = move-exception
                r2 = r8
            L99:
                k3.w r10 = new k3.w
                r10.<init>(r9)
                W2.q r2 = r2.f10068n
                r0.f10072s = r9
                r0.f10073t = r6
                r0.f10070q = r4
                java.lang.Object r10 = k3.k.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lad
            Lac:
                return r1
            Lad:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.k.b.b(k3.e, N2.e):java.lang.Object");
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ W2.p f10074m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ d f10075n;

        public static final class a extends P2.d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f10076p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f10077q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Object f10079s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f10080t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public Object f10081u;

            public a(N2.e eVar) {
                super(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) {
                this.f10076p = obj;
                this.f10077q |= Integer.MIN_VALUE;
                return c.this.b(null, this);
            }
        }

        public c(W2.p pVar, d dVar) {
            this.f10074m = pVar;
            this.f10075n = dVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.b(r2, r0) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // k3.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(k3.e r7, N2.e r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof k3.k.c.a
                if (r0 == 0) goto L13
                r0 = r8
                k3.k$c$a r0 = (k3.k.c.a) r0
                int r1 = r0.f10077q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10077q = r1
                goto L18
            L13:
                k3.k$c$a r0 = new k3.k$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f10076p
                java.lang.Object r1 = O2.c.c()
                int r2 = r0.f10077q
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                K2.k.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f10081u
                l3.n r7 = (l3.n) r7
                java.lang.Object r2 = r0.f10080t
                k3.e r2 = (k3.e) r2
                java.lang.Object r4 = r0.f10079s
                k3.k$c r4 = (k3.k.c) r4
                K2.k.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                K2.k.b(r8)
                l3.n r8 = new l3.n
                N2.i r2 = r0.b()
                r8.<init>(r7, r2)
                W2.p r2 = r6.f10074m     // Catch: java.lang.Throwable -> L86
                r0.f10079s = r6     // Catch: java.lang.Throwable -> L86
                r0.f10080t = r7     // Catch: java.lang.Throwable -> L86
                r0.f10081u = r8     // Catch: java.lang.Throwable -> L86
                r0.f10077q = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                X2.k.a(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.j(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                X2.k.a(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                goto L82
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.r()
                k3.d r7 = r4.f10075n
                r8 = 0
                r0.f10079s = r8
                r0.f10080t = r8
                r0.f10081u = r8
                r0.f10077q = r3
                java.lang.Object r7 = r7.b(r2, r0)
                if (r7 != r1) goto L83
            L82:
                return r1
            L83:
                K2.p r7 = K2.p.f2516a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.r()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.k.c.b(k3.e, N2.e):java.lang.Object");
        }
    }

    public static final void b(e eVar) throws Throwable {
        if (eVar instanceof w) {
            throw ((w) eVar).f10146m;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(k3.e r4, W2.q r5, java.lang.Throwable r6, N2.e r7) throws java.lang.Throwable {
        /*
            boolean r0 = r7 instanceof k3.k.a
            if (r0 == 0) goto L13
            r0 = r7
            k3.k$a r0 = (k3.k.a) r0
            int r1 = r0.f10066r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10066r = r1
            goto L18
        L13:
            k3.k$a r0 = new k3.k$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10065q
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f10066r
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f10064p
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            K2.k.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            K2.k.b(r7)
            r0.f10064p = r6     // Catch: java.lang.Throwable -> L2e
            r0.f10066r = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.g(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            K2.p r4 = K2.p.f2516a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            K2.a.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.k.c(k3.e, W2.q, java.lang.Throwable, N2.e):java.lang.Object");
    }

    public static final d d(d dVar, W2.q qVar) {
        return new b(dVar, qVar);
    }

    public static final d e(d dVar, W2.p pVar) {
        return new c(pVar, dVar);
    }
}
