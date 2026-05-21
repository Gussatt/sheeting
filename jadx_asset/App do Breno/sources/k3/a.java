package k3;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements d {

    /* JADX INFO: renamed from: k3.a$a, reason: collision with other inner class name */
    public static final class C0134a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f10048p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f10049q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f10051s;

        public C0134a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f10049q = obj;
            this.f10051s |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    public abstract Object a(e eVar, N2.e eVar2);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(k3.e r6, N2.e r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof k3.a.C0134a
            if (r0 == 0) goto L13
            r0 = r7
            k3.a$a r0 = (k3.a.C0134a) r0
            int r1 = r0.f10051s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10051s = r1
            goto L18
        L13:
            k3.a$a r0 = new k3.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f10049q
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f10051s
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f10048p
            l3.n r6 = (l3.n) r6
            K2.k.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            K2.k.b(r7)
            l3.n r7 = new l3.n
            N2.i r2 = r0.b()
            r7.<init>(r6, r2)
            r0.f10048p = r7     // Catch: java.lang.Throwable -> L55
            r0.f10051s = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.a(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.r()
            K2.p r6 = K2.p.f2516a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.r()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.a.b(k3.e, N2.e):java.lang.Object");
    }
}
