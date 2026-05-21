package k3;

import X2.y;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {

    public static final class a implements e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ y f10121m;

        public a(y yVar) {
            this.f10121m = yVar;
        }

        @Override // k3.e
        public Object a(Object obj, N2.e eVar) {
            this.f10121m.f3992m = obj;
            throw new l3.a(this);
        }
    }

    public static final class b extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f10122p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f10123q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f10124r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f10125s;

        public b(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f10124r = obj;
            this.f10125s |= Integer.MIN_VALUE;
            return f.k(null, this);
        }
    }

    public static final class c implements e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ y f10126m;

        public c(y yVar) {
            this.f10126m = yVar;
        }

        @Override // k3.e
        public Object a(Object obj, N2.e eVar) {
            this.f10126m.f3992m = obj;
            throw new l3.a(this);
        }
    }

    public static final class d extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f10127p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f10128q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f10129r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f10130s;

        public d(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f10129r = obj;
            this.f10130s |= Integer.MIN_VALUE;
            return f.l(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(k3.d r4, N2.e r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof k3.n.b
            if (r0 == 0) goto L13
            r0 = r5
            k3.n$b r0 = (k3.n.b) r0
            int r1 = r0.f10125s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10125s = r1
            goto L18
        L13:
            k3.n$b r0 = new k3.n$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10124r
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f10125s
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f10123q
            k3.n$a r4 = (k3.n.a) r4
            java.lang.Object r0 = r0.f10122p
            X2.y r0 = (X2.y) r0
            K2.k.b(r5)     // Catch: l3.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            K2.k.b(r5)
            X2.y r5 = new X2.y
            r5.<init>()
            m3.F r2 = l3.m.f10286a
            r5.f3992m = r2
            k3.n$a r2 = new k3.n$a
            r2.<init>(r5)
            r0.f10122p = r5     // Catch: l3.a -> L5b
            r0.f10123q = r2     // Catch: l3.a -> L5b
            r0.f10125s = r3     // Catch: l3.a -> L5b
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: l3.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            l3.j.a(r5, r4)
        L62:
            java.lang.Object r4 = r0.f3992m
            m3.F r5 = l3.m.f10286a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.n.a(k3.d, N2.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k3.d r4, N2.e r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof k3.n.d
            if (r0 == 0) goto L13
            r0 = r5
            k3.n$d r0 = (k3.n.d) r0
            int r1 = r0.f10130s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10130s = r1
            goto L18
        L13:
            k3.n$d r0 = new k3.n$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f10129r
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f10130s
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f10128q
            k3.n$c r4 = (k3.n.c) r4
            java.lang.Object r0 = r0.f10127p
            X2.y r0 = (X2.y) r0
            K2.k.b(r5)     // Catch: l3.a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            K2.k.b(r5)
            X2.y r5 = new X2.y
            r5.<init>()
            k3.n$c r2 = new k3.n$c
            r2.<init>(r5)
            r0.f10127p = r5     // Catch: l3.a -> L57
            r0.f10128q = r2     // Catch: l3.a -> L57
            r0.f10130s = r3     // Catch: l3.a -> L57
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: l3.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            l3.j.a(r5, r4)
        L5e:
            java.lang.Object r4 = r0.f3992m
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.n.b(k3.d, N2.e):java.lang.Object");
    }
}
