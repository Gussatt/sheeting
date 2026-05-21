package N;

import L.n;
import L.x;
import X2.l;
import t3.AbstractC1552h;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public final class e implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1552h f2788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f2789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f2790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f2791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final W2.a f2792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N.a f2793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q3.a f2794g;

    public static final class a extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f2795p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f2796q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f2797r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f2798s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f2800u;

        public a(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f2798s = obj;
            this.f2800u |= Integer.MIN_VALUE;
            return e.this.d(null, this);
        }
    }

    public static final class b extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f2801p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f2802q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f2803r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f2804s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f2805t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f2807v;

        public b(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f2805t = obj;
            this.f2807v |= Integer.MIN_VALUE;
            return e.this.e(null, this);
        }
    }

    public e(AbstractC1552h abstractC1552h, J j4, c cVar, n nVar, W2.a aVar) {
        l.e(abstractC1552h, "fileSystem");
        l.e(j4, "path");
        l.e(cVar, "serializer");
        l.e(nVar, "coordinator");
        l.e(aVar, "onClose");
        this.f2788a = abstractC1552h;
        this.f2789b = j4;
        this.f2790c = cVar;
        this.f2791d = nVar;
        this.f2792e = aVar;
        this.f2793f = new N.a(false);
        this.f2794g = q3.c.b(false, 1, null);
    }

    @Override // L.x
    public n a() {
        return this.f2791d;
    }

    @Override // L.InterfaceC0477b
    public void close() {
        this.f2793f.b(true);
        this.f2792e.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[Catch: all -> 0x007e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x007e, blocks: (B:31:0x007d, B:40:0x008e, B:39:0x008b, B:36:0x0086), top: B:54:0x0022, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [N.e] */
    /* JADX WARN: Type inference failed for: r0v14, types: [N.e] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [N.e$a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [N.e] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [W2.q] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v14, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // L.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(W2.q r9, N2.e r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof N.e.a
            if (r0 == 0) goto L13
            r0 = r10
            N.e$a r0 = (N.e.a) r0
            int r1 = r0.f2800u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2800u = r1
            goto L18
        L13:
            N.e$a r0 = new N.e$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f2798s
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f2800u
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.f2797r
            java.lang.Object r1 = r0.f2796q
            L.b r1 = (L.InterfaceC0477b) r1
            java.lang.Object r0 = r0.f2795p
            N.e r0 = (N.e) r0
            K2.k.b(r10)     // Catch: java.lang.Throwable -> L34
            goto L6d
        L34:
            r10 = move-exception
            goto L86
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            K2.k.b(r10)
            r8.f()
            q3.a r10 = r8.f2794g
            boolean r10 = q3.a.C0162a.a(r10, r4, r3, r4)
            N.b r2 = new N.b     // Catch: java.lang.Throwable -> L8f
            t3.h r5 = r8.f2788a     // Catch: java.lang.Throwable -> L8f
            t3.J r6 = r8.f2789b     // Catch: java.lang.Throwable -> L8f
            N.c r7 = r8.f2790c     // Catch: java.lang.Throwable -> L8f
            r2.<init>(r5, r6, r7)     // Catch: java.lang.Throwable -> L8f
            java.lang.Boolean r5 = P2.b.a(r10)     // Catch: java.lang.Throwable -> L80
            r0.f2795p = r8     // Catch: java.lang.Throwable -> L80
            r0.f2796q = r2     // Catch: java.lang.Throwable -> L80
            r0.f2797r = r10     // Catch: java.lang.Throwable -> L80
            r0.f2800u = r3     // Catch: java.lang.Throwable -> L80
            java.lang.Object r9 = r9.g(r2, r5, r0)     // Catch: java.lang.Throwable -> L80
            if (r9 != r1) goto L68
            return r1
        L68:
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L6d:
            r1.close()     // Catch: java.lang.Throwable -> L72
            r1 = r4
            goto L73
        L72:
            r1 = move-exception
        L73:
            if (r1 != 0) goto L7d
            if (r9 == 0) goto L7c
            q3.a r9 = r0.f2794g
            q3.a.C0162a.b(r9, r4, r3, r4)
        L7c:
            return r10
        L7d:
            throw r1     // Catch: java.lang.Throwable -> L7e
        L7e:
            r10 = move-exception
            goto L94
        L80:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
            r1 = r2
        L86:
            r1.close()     // Catch: java.lang.Throwable -> L8a
            goto L8e
        L8a:
            r1 = move-exception
            K2.a.a(r10, r1)     // Catch: java.lang.Throwable -> L7e
        L8e:
            throw r10     // Catch: java.lang.Throwable -> L7e
        L8f:
            r9 = move-exception
            r0 = r10
            r10 = r9
            r9 = r0
            r0 = r8
        L94:
            if (r9 == 0) goto L9b
            q3.a r9 = r0.f2794g
            q3.a.C0162a.b(r9, r4, r3, r4)
        L9b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: N.e.d(W2.q, N2.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef A[Catch: all -> 0x00df, IOException -> 0x00e2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00e2, blocks: (B:37:0x00cf, B:39:0x00d7, B:48:0x00ef, B:55:0x00fe, B:54:0x00fb), top: B:72:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3, types: [t3.h] */
    /* JADX WARN: Type inference failed for: r0v5, types: [t3.h] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [N.e] */
    /* JADX WARN: Type inference failed for: r10v19, types: [t3.h] */
    /* JADX WARN: Type inference failed for: r10v23, types: [t3.h] */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [q3.a] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [t3.J] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v2, types: [t3.J] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, t3.J] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [q3.a] */
    /* JADX WARN: Type inference failed for: r5v4, types: [t3.h] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [N.e] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [N.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // L.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(W2.p r10, N2.e r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: N.e.e(W2.p, N2.e):java.lang.Object");
    }

    public final void f() {
        if (this.f2793f.a()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }
}
