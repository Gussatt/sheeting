package k3;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class m {

    public static final class a implements k3.d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k3.d f10098m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ W2.p f10099n;

        public a(k3.d dVar, W2.p pVar) {
            this.f10098m = dVar;
            this.f10099n = pVar;
        }

        @Override // k3.d
        public Object b(e eVar, N2.e eVar2) {
            Object objB = this.f10098m.b(new b(new X2.v(), eVar, this.f10099n), eVar2);
            return objB == O2.c.c() ? objB : K2.p.f2516a;
        }
    }

    public static final class b implements e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ X2.v f10100m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ e f10101n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ W2.p f10102o;

        public static final class a extends P2.d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Object f10103p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public Object f10104q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f10105r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f10107t;

            public a(N2.e eVar) {
                super(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) {
                this.f10105r = obj;
                this.f10107t |= Integer.MIN_VALUE;
                return b.this.a(null, this);
            }
        }

        public b(X2.v vVar, e eVar, W2.p pVar) {
            this.f10100m = vVar;
            this.f10101n = eVar;
            this.f10102o = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.a(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.a(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // k3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r7, N2.e r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof k3.m.b.a
                if (r0 == 0) goto L13
                r0 = r8
                k3.m$b$a r0 = (k3.m.b.a) r0
                int r1 = r0.f10107t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10107t = r1
                goto L18
            L13:
                k3.m$b$a r0 = new k3.m$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f10105r
                java.lang.Object r1 = O2.c.c()
                int r2 = r0.f10107t
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                K2.k.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f10104q
                java.lang.Object r2 = r0.f10103p
                k3.m$b r2 = (k3.m.b) r2
                K2.k.b(r8)
                goto L6c
            L41:
                K2.k.b(r8)
                goto L59
            L45:
                K2.k.b(r8)
                X2.v r8 = r6.f10100m
                boolean r8 = r8.f3989m
                if (r8 == 0) goto L5c
                k3.e r8 = r6.f10101n
                r0.f10107t = r5
                java.lang.Object r7 = r8.a(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                K2.p r7 = K2.p.f2516a
                return r7
            L5c:
                W2.p r8 = r6.f10102o
                r0.f10103p = r6
                r0.f10104q = r7
                r0.f10107t = r4
                java.lang.Object r8 = r8.j(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                X2.v r8 = r2.f10100m
                r8.f3989m = r5
                k3.e r8 = r2.f10101n
                r2 = 0
                r0.f10103p = r2
                r0.f10104q = r2
                r0.f10107t = r3
                java.lang.Object r7 = r8.a(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                K2.p r7 = K2.p.f2516a
                return r7
            L8b:
                K2.p r7 = K2.p.f2516a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.m.b.a(java.lang.Object, N2.e):java.lang.Object");
        }
    }

    public static final class c implements k3.d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k3.d f10108m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ W2.p f10109n;

        public static final class a extends P2.d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f10110p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f10111q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Object f10113s;

            public a(N2.e eVar) {
                super(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) {
                this.f10110p = obj;
                this.f10111q |= Integer.MIN_VALUE;
                return c.this.b(null, this);
            }
        }

        public c(k3.d dVar, W2.p pVar) {
            this.f10108m = dVar;
            this.f10109n = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // k3.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(k3.e r6, N2.e r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof k3.m.c.a
                if (r0 == 0) goto L13
                r0 = r7
                k3.m$c$a r0 = (k3.m.c.a) r0
                int r1 = r0.f10111q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10111q = r1
                goto L18
            L13:
                k3.m$c$a r0 = new k3.m$c$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f10110p
                java.lang.Object r1 = O2.c.c()
                int r2 = r0.f10111q
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f10113s
                k3.m$d r6 = (k3.m.d) r6
                K2.k.b(r7)     // Catch: l3.a -> L2d
                goto L53
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                K2.k.b(r7)
                k3.d r7 = r5.f10108m
                k3.m$d r2 = new k3.m$d
                W2.p r4 = r5.f10109n
                r2.<init>(r4, r6)
                r0.f10113s = r2     // Catch: l3.a -> L4e
                r0.f10111q = r3     // Catch: l3.a -> L4e
                java.lang.Object r6 = r7.b(r2, r0)     // Catch: l3.a -> L4e
                if (r6 != r1) goto L53
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                l3.j.a(r7, r6)
            L53:
                K2.p r6 = K2.p.f2516a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.m.c.b(k3.e, N2.e):java.lang.Object");
        }
    }

    public static final class d implements e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ W2.p f10114m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ e f10115n;

        public static final class a extends P2.d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Object f10116p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f10117q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f10118r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f10120t;

            public a(N2.e eVar) {
                super(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) {
                this.f10117q = obj;
                this.f10118r |= Integer.MIN_VALUE;
                return d.this.a(null, this);
            }
        }

        public d(W2.p pVar, e eVar) {
            this.f10114m = pVar;
            this.f10115n = eVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.a(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // k3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(java.lang.Object r8, N2.e r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof k3.m.d.a
                if (r0 == 0) goto L13
                r0 = r9
                k3.m$d$a r0 = (k3.m.d.a) r0
                int r1 = r0.f10118r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10118r = r1
                goto L18
            L13:
                k3.m$d$a r0 = new k3.m$d$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f10117q
                java.lang.Object r1 = O2.c.c()
                int r2 = r0.f10118r
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f10116p
                k3.m$d r8 = (k3.m.d) r8
                K2.k.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f10120t
                java.lang.Object r2 = r0.f10116p
                k3.m$d r2 = (k3.m.d) r2
                K2.k.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                K2.k.b(r9)
                W2.p r9 = r7.f10114m
                r0.f10116p = r7
                r0.f10120t = r8
                r0.f10118r = r4
                r2 = 6
                X2.k.a(r2)
                java.lang.Object r9 = r9.j(r8, r0)
                r2 = 7
                X2.k.a(r2)
                if (r9 != r1) goto L60
                goto L7a
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                k3.e r2 = r8.f10115n
                r0.f10116p = r8
                r5 = 0
                r0.f10120t = r5
                r0.f10118r = r3
                java.lang.Object r9 = r2.a(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                K2.p r8 = K2.p.f2516a
                return r8
            L81:
                l3.a r9 = new l3.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.m.d.a(java.lang.Object, N2.e):java.lang.Object");
        }
    }

    public static final k3.d a(k3.d dVar, W2.p pVar) {
        return new a(dVar, pVar);
    }

    public static final k3.d b(k3.d dVar, W2.p pVar) {
        return new c(dVar, pVar);
    }
}
