package k3;

import X2.y;
import h3.InterfaceC1027q0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {

    public static final class a implements d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ d f10082m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ W2.q f10083n;

        /* JADX INFO: renamed from: k3.l$a$a, reason: collision with other inner class name */
        public static final class C0135a extends P2.d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f10084p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f10085q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Object f10087s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public Object f10088t;

            public C0135a(N2.e eVar) {
                super(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) {
                this.f10084p = obj;
                this.f10085q |= Integer.MIN_VALUE;
                return a.this.b(null, this);
            }
        }

        public a(d dVar, W2.q qVar) {
            this.f10082m = dVar;
            this.f10083n = qVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // k3.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(k3.e r6, N2.e r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof k3.l.a.C0135a
                if (r0 == 0) goto L13
                r0 = r7
                k3.l$a$a r0 = (k3.l.a.C0135a) r0
                int r1 = r0.f10085q
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10085q = r1
                goto L18
            L13:
                k3.l$a$a r0 = new k3.l$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f10084p
                java.lang.Object r1 = O2.c.c()
                int r2 = r0.f10085q
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                K2.k.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f10088t
                k3.e r6 = (k3.e) r6
                java.lang.Object r2 = r0.f10087s
                k3.l$a r2 = (k3.l.a) r2
                K2.k.b(r7)
                goto L53
            L40:
                K2.k.b(r7)
                k3.d r7 = r5.f10082m
                r0.f10087s = r5
                r0.f10088t = r6
                r0.f10085q = r4
                java.lang.Object r7 = k3.f.e(r7, r6, r0)
                if (r7 != r1) goto L52
                goto L6e
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                W2.q r2 = r2.f10083n
                r4 = 0
                r0.f10087s = r4
                r0.f10088t = r4
                r0.f10085q = r3
                r3 = 6
                X2.k.a(r3)
                java.lang.Object r6 = r2.g(r6, r7, r0)
                r7 = 7
                X2.k.a(r7)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                K2.p r6 = K2.p.f2516a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.l.a.b(k3.e, N2.e):java.lang.Object");
        }
    }

    public static final class b extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f10089p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f10090q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f10091r;

        public b(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f10090q = obj;
            this.f10091r |= Integer.MIN_VALUE;
            return f.e(null, null, this);
        }
    }

    public static final class c implements e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ e f10092m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ y f10093n;

        public static final class a extends P2.d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Object f10094p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f10095q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public int f10097s;

            public a(N2.e eVar) {
                super(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) {
                this.f10095q = obj;
                this.f10097s |= Integer.MIN_VALUE;
                return c.this.a(null, this);
            }
        }

        public c(e eVar, y yVar) {
            this.f10092m = eVar;
            this.f10093n = yVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // k3.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r5, N2.e r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof k3.l.c.a
                if (r0 == 0) goto L13
                r0 = r6
                k3.l$c$a r0 = (k3.l.c.a) r0
                int r1 = r0.f10097s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f10097s = r1
                goto L18
            L13:
                k3.l$c$a r0 = new k3.l$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f10095q
                java.lang.Object r1 = O2.c.c()
                int r2 = r0.f10097s
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f10094p
                k3.l$c r5 = (k3.l.c) r5
                K2.k.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                K2.k.b(r6)
                k3.e r6 = r4.f10092m     // Catch: java.lang.Throwable -> L4a
                r0.f10094p = r4     // Catch: java.lang.Throwable -> L4a
                r0.f10097s = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                K2.p r5 = K2.p.f2516a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                X2.y r5 = r5.f10093n
                r5.f3992m = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: k3.l.c.a(java.lang.Object, N2.e):java.lang.Object");
        }
    }

    public static final d a(d dVar, W2.q qVar) {
        return new a(dVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k3.d r4, k3.e r5, N2.e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof k3.l.b
            if (r0 == 0) goto L13
            r0 = r6
            k3.l$b r0 = (k3.l.b) r0
            int r1 = r0.f10091r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10091r = r1
            goto L18
        L13:
            k3.l$b r0 = new k3.l$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10090q
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f10091r
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f10089p
            X2.y r4 = (X2.y) r4
            K2.k.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            K2.k.b(r6)
            X2.y r6 = new X2.y
            r6.<init>()
            k3.l$c r2 = new k3.l$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f10089p = r6     // Catch: java.lang.Throwable -> L51
            r0.f10091r = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f3992m
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            N2.i r6 = r0.b()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            K2.a.a(r4, r5)
            throw r4
        L72:
            K2.a.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.l.b(k3.d, k3.e, N2.e):java.lang.Object");
    }

    public static final boolean c(Throwable th, N2.i iVar) {
        InterfaceC1027q0 interfaceC1027q0 = (InterfaceC1027q0) iVar.d(InterfaceC1027q0.f7558k);
        if (interfaceC1027q0 == null || !interfaceC1027q0.isCancelled()) {
            return false;
        }
        return d(th, interfaceC1027q0.C());
    }

    public static final boolean d(Throwable th, Throwable th2) {
        return th2 != null && X2.l.a(th2, th);
    }
}
