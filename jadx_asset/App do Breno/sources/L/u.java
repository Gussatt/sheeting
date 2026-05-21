package L;

/* JADX INFO: loaded from: classes.dex */
public final class u implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q3.a f2718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0476a f2719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k3.d f2720d;

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f2721p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f2722q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f2723r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2725t;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f2723r = obj;
            this.f2725t |= Integer.MIN_VALUE;
            return u.this.d(null, this);
        }
    }

    public static final class b extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f2726p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f2727q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f2728r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f2730t;

        public b(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f2728r = obj;
            this.f2730t |= Integer.MIN_VALUE;
            return u.this.e(null, this);
        }
    }

    public static final class c extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f2731q;

        public c(N2.e eVar) {
            super(2, eVar);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return new c(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            O2.c.c();
            if (this.f2731q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            K2.k.b(obj);
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(k3.e eVar, N2.e eVar2) {
            return ((c) m(eVar, eVar2)).q(K2.p.f2516a);
        }
    }

    public u(String str) {
        X2.l.e(str, "filePath");
        this.f2717a = str;
        this.f2718b = q3.c.b(false, 1, null);
        this.f2719c = new C0476a(0);
        this.f2720d = k3.f.m(new c(null));
    }

    @Override // L.n
    public Object a(N2.e eVar) {
        return P2.b.c(this.f2719c.b());
    }

    @Override // L.n
    public Object b(N2.e eVar) {
        return P2.b.c(this.f2719c.d());
    }

    @Override // L.n
    public k3.d c() {
        return this.f2720d;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // L.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(W2.l r8, N2.e r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof L.u.a
            if (r0 == 0) goto L13
            r0 = r9
            L.u$a r0 = (L.u.a) r0
            int r1 = r0.f2725t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2725t = r1
            goto L18
        L13:
            L.u$a r0 = new L.u$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2723r
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f2725t
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f2721p
            q3.a r8 = (q3.a) r8
            K2.k.b(r9)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r9 = move-exception
            goto L73
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f2722q
            q3.a r8 = (q3.a) r8
            java.lang.Object r2 = r0.f2721p
            W2.l r2 = (W2.l) r2
            K2.k.b(r9)
            r9 = r8
            r8 = r2
            goto L5b
        L49:
            K2.k.b(r9)
            q3.a r9 = r7.f2718b
            r0.f2721p = r8
            r0.f2722q = r9
            r0.f2725t = r4
            java.lang.Object r2 = r9.c(r5, r0)
            if (r2 != r1) goto L5b
            goto L67
        L5b:
            r0.f2721p = r9     // Catch: java.lang.Throwable -> L6f
            r0.f2722q = r5     // Catch: java.lang.Throwable -> L6f
            r0.f2725t = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = r8.k(r0)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r1) goto L68
        L67:
            return r1
        L68:
            r6 = r9
            r9 = r8
            r8 = r6
        L6b:
            r8.a(r5)
            return r9
        L6f:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L73:
            r8.a(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: L.u.d(W2.l, N2.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // L.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(W2.p r7, N2.e r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof L.u.b
            if (r0 == 0) goto L13
            r0 = r8
            L.u$b r0 = (L.u.b) r0
            int r1 = r0.f2730t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2730t = r1
            goto L18
        L13:
            L.u$b r0 = new L.u$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2728r
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f2730t
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r7 = r0.f2727q
            java.lang.Object r0 = r0.f2726p
            q3.a r0 = (q3.a) r0
            K2.k.b(r8)     // Catch: java.lang.Throwable -> L30
            goto L57
        L30:
            r8 = move-exception
            goto L61
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            K2.k.b(r8)
            q3.a r8 = r6.f2718b
            boolean r2 = r8.b(r4)
            java.lang.Boolean r5 = P2.b.a(r2)     // Catch: java.lang.Throwable -> L5d
            r0.f2726p = r8     // Catch: java.lang.Throwable -> L5d
            r0.f2727q = r2     // Catch: java.lang.Throwable -> L5d
            r0.f2730t = r3     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r7 = r7.j(r5, r0)     // Catch: java.lang.Throwable -> L5d
            if (r7 != r1) goto L54
            return r1
        L54:
            r0 = r8
            r8 = r7
            r7 = r2
        L57:
            if (r7 == 0) goto L5c
            r0.a(r4)
        L5c:
            return r8
        L5d:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L61:
            if (r7 == 0) goto L66
            r0.a(r4)
        L66:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: L.u.e(W2.p, N2.e):java.lang.Object");
    }
}
