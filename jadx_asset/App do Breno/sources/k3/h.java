package k3;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h {

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f10058p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f10059q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f10060r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public boolean f10061s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f10062t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f10063u;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f10062t = obj;
            this.f10063u |= Integer.MIN_VALUE;
            return h.c(null, null, false, this);
        }
    }

    public static final Object b(e eVar, j3.s sVar, N2.e eVar2) throws Throwable {
        Object objC = c(eVar, sVar, true, eVar2);
        return objC == O2.c.c() ? objC : K2.p.f2516a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.a(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(k3.e r6, j3.s r7, boolean r8, N2.e r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof k3.h.a
            if (r0 == 0) goto L13
            r0 = r9
            k3.h$a r0 = (k3.h.a) r0
            int r1 = r0.f10063u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10063u = r1
            goto L18
        L13:
            k3.h$a r0 = new k3.h$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f10062t
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f10063u
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f10061s
            java.lang.Object r6 = r0.f10060r
            j3.f r6 = (j3.f) r6
            java.lang.Object r7 = r0.f10059q
            j3.s r7 = (j3.s) r7
            java.lang.Object r2 = r0.f10058p
            k3.e r2 = (k3.e) r2
            K2.k.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f10061s
            java.lang.Object r6 = r0.f10060r
            j3.f r6 = (j3.f) r6
            java.lang.Object r7 = r0.f10059q
            j3.s r7 = (j3.s) r7
            java.lang.Object r2 = r0.f10058p
            k3.e r2 = (k3.e) r2
            K2.k.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            K2.k.b(r9)
            k3.f.j(r6)
            j3.f r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f10058p = r6     // Catch: java.lang.Throwable -> L3c
            r0.f10059q = r7     // Catch: java.lang.Throwable -> L3c
            r0.f10060r = r9     // Catch: java.lang.Throwable -> L3c
            r0.f10061s = r8     // Catch: java.lang.Throwable -> L3c
            r0.f10063u = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f10058p = r2     // Catch: java.lang.Throwable -> L3c
            r0.f10059q = r7     // Catch: java.lang.Throwable -> L3c
            r0.f10060r = r6     // Catch: java.lang.Throwable -> L3c
            r0.f10061s = r8     // Catch: java.lang.Throwable -> L3c
            r0.f10063u = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.a(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            j3.k.a(r7, r6)
        L9a:
            K2.p r6 = K2.p.f2516a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            j3.k.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.h.c(k3.e, j3.s, boolean, N2.e):java.lang.Object");
    }
}
