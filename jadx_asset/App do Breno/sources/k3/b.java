package k3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W2.p f10052q;

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f10053p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f10054q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f10056s;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f10054q = obj;
            this.f10056s |= Integer.MIN_VALUE;
            return b.this.f(null, this);
        }
    }

    public /* synthetic */ b(W2.p pVar, N2.i iVar, int i4, j3.a aVar, int i5, X2.g gVar) {
        this(pVar, (i5 & 2) != 0 ? N2.j.f2823m : iVar, (i5 & 4) != 0 ? -2 : i4, (i5 & 8) != 0 ? j3.a.SUSPEND : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k3.c, l3.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(j3.r r5, N2.e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof k3.b.a
            if (r0 == 0) goto L13
            r0 = r6
            k3.b$a r0 = (k3.b.a) r0
            int r1 = r0.f10056s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10056s = r1
            goto L18
        L13:
            k3.b$a r0 = new k3.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f10054q
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f10056s
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f10053p
            j3.r r5 = (j3.r) r5
            K2.k.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            K2.k.b(r6)
            r0.f10053p = r5
            r0.f10056s = r3
            java.lang.Object r6 = super.f(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.E()
            if (r5 == 0) goto L4c
            K2.p r5 = K2.p.f2516a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.b.f(j3.r, N2.e):java.lang.Object");
    }

    @Override // l3.e
    public l3.e g(N2.i iVar, int i4, j3.a aVar) {
        return new b(this.f10052q, iVar, i4, aVar);
    }

    public b(W2.p pVar, N2.i iVar, int i4, j3.a aVar) {
        super(pVar, iVar, i4, aVar);
        this.f10052q = pVar;
    }
}
