package c2;

/* JADX INFO: renamed from: c2.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0691q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6086c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6088b;

    /* JADX INFO: renamed from: c2.q$a */
    public static final class a {

        /* JADX INFO: renamed from: c2.q$a$a, reason: collision with other inner class name */
        public static final class C0110a extends P2.d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Object f6089p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f6090q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public int f6092s;

            public C0110a(N2.e eVar) {
                super(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) {
                this.f6090q = obj;
                this.f6092s |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        
            if (r10 == r1) goto L33;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r10v17 */
        /* JADX WARN: Type inference failed for: r10v4 */
        /* JADX WARN: Type inference failed for: r10v5, types: [V1.h] */
        /* JADX WARN: Type inference failed for: r9v0, types: [V1.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v1 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v15 */
        /* JADX WARN: Type inference failed for: r9v16 */
        /* JADX WARN: Type inference failed for: r9v17 */
        /* JADX WARN: Type inference failed for: r9v18 */
        /* JADX WARN: Type inference failed for: r9v19 */
        /* JADX WARN: Type inference failed for: r9v2 */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(V1.h r9, N2.e r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof c2.C0691q.a.C0110a
                if (r0 == 0) goto L13
                r0 = r10
                c2.q$a$a r0 = (c2.C0691q.a.C0110a) r0
                int r1 = r0.f6092s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f6092s = r1
                goto L18
            L13:
                c2.q$a$a r0 = new c2.q$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f6090q
                java.lang.Object r1 = O2.c.c()
                int r2 = r0.f6092s
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L48
                if (r2 == r6) goto L3e
                if (r2 != r5) goto L36
                java.lang.Object r9 = r0.f6089p
                java.lang.String r9 = (java.lang.String) r9
                K2.k.b(r10)     // Catch: java.lang.Exception -> L34
                goto L8a
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f6089p
                V1.h r9 = (V1.h) r9
                K2.k.b(r10)     // Catch: java.lang.Exception -> L46
                goto L60
            L46:
                r10 = move-exception
                goto L6f
            L48:
                K2.k.b(r10)
                r10 = 0
                n1.l r10 = r9.b(r10)     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                X2.l.d(r10, r2)     // Catch: java.lang.Exception -> L46
                r0.f6089p = r9     // Catch: java.lang.Exception -> L46
                r0.f6092s = r6     // Catch: java.lang.Exception -> L46
                java.lang.Object r10 = r3.b.a(r10, r0)     // Catch: java.lang.Exception -> L46
                if (r10 != r1) goto L60
                goto L89
            L60:
                V1.m r10 = (V1.m) r10     // Catch: java.lang.Exception -> L46
                java.lang.String r10 = r10.b()     // Catch: java.lang.Exception -> L46
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                X2.l.d(r10, r2)     // Catch: java.lang.Exception -> L46
                r7 = r10
                r10 = r9
                r9 = r7
                goto L76
            L6f:
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r9
                r9 = r3
            L76:
                n1.l r10 = r10.a()     // Catch: java.lang.Exception -> L34
                java.lang.String r2 = "firebaseInstallations.id"
                X2.l.d(r10, r2)     // Catch: java.lang.Exception -> L34
                r0.f6089p = r9     // Catch: java.lang.Exception -> L34
                r0.f6092s = r5     // Catch: java.lang.Exception -> L34
                java.lang.Object r10 = r3.b.a(r10, r0)     // Catch: java.lang.Exception -> L34
                if (r10 != r1) goto L8a
            L89:
                return r1
            L8a:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                X2.l.d(r10, r0)     // Catch: java.lang.Exception -> L34
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L34
                r3 = r10
                goto L98
            L93:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L98:
                c2.q r10 = new c2.q
                r0 = 0
                r10.<init>(r3, r9, r0)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.C0691q.a.a(V1.h, N2.e):java.lang.Object");
        }

        public a() {
        }
    }

    public /* synthetic */ C0691q(String str, String str2, X2.g gVar) {
        this(str, str2);
    }

    public final String a() {
        return this.f6088b;
    }

    public final String b() {
        return this.f6087a;
    }

    public C0691q(String str, String str2) {
        this.f6087a = str;
        this.f6088b = str2;
    }
}
