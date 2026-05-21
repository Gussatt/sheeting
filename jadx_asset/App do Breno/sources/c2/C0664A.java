package c2;

import android.util.Log;
import f2.C0955f;
import h3.AbstractC1010i;
import r1.C1509f;

/* JADX INFO: renamed from: c2.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0664A implements com.google.firebase.sessions.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f5955g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f5956h = Math.random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1509f f5957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V1.h f5958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0955f f5959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC0682h f5960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final N2.i f5961f;

    /* JADX INFO: renamed from: c2.A$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c2.A$b */
    public static final class b extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f5962q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f5963r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f5964s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f5965t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f5966u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f5967v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f5968w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ x f5970y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(x xVar, N2.e eVar) {
            super(2, eVar);
            this.f5970y = xVar;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return C0664A.this.new b(this.f5970y, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        @Override // P2.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object q(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = O2.c.c()
                int r1 = r8.f5968w
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L45
                if (r1 == r4) goto L41
                if (r1 == r3) goto L3d
                if (r1 != r2) goto L35
                java.lang.Object r0 = r8.f5967v
                f2.f r0 = (f2.C0955f) r0
                java.lang.Object r1 = r8.f5966u
                c2.x r1 = (c2.x) r1
                java.lang.Object r2 = r8.f5965t
                r1.f r2 = (r1.C1509f) r2
                java.lang.Object r3 = r8.f5964s
                c2.z r3 = (c2.z) r3
                java.lang.Object r4 = r8.f5963r
                c2.A r4 = (c2.C0664A) r4
                java.lang.Object r5 = r8.f5962q
                c2.q r5 = (c2.C0691q) r5
                K2.k.b(r9)
                r7 = r3
                r3 = r0
                r0 = r7
                r7 = r2
                r2 = r1
                r1 = r7
            L32:
                r7 = r4
                goto L9d
            L35:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L3d:
                K2.k.b(r9)
                goto L6c
            L41:
                K2.k.b(r9)
                goto L53
            L45:
                K2.k.b(r9)
                c2.A r9 = c2.C0664A.this
                r8.f5968w = r4
                java.lang.Object r9 = c2.C0664A.f(r9, r8)
                if (r9 != r0) goto L53
                goto L95
            L53:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto Lb0
                c2.q$a r9 = c2.C0691q.f6086c
                c2.A r1 = c2.C0664A.this
                V1.h r1 = c2.C0664A.d(r1)
                r8.f5968w = r3
                java.lang.Object r9 = r9.a(r1, r8)
                if (r9 != r0) goto L6c
                goto L95
            L6c:
                r5 = r9
                c2.q r5 = (c2.C0691q) r5
                c2.A r4 = c2.C0664A.this
                c2.z r3 = c2.z.f6146a
                r1.f r9 = c2.C0664A.c(r4)
                c2.x r1 = r8.f5970y
                c2.A r6 = c2.C0664A.this
                f2.f r6 = c2.C0664A.e(r6)
                d2.a r7 = d2.C0919a.f7146a
                r8.f5962q = r5
                r8.f5963r = r4
                r8.f5964s = r3
                r8.f5965t = r9
                r8.f5966u = r1
                r8.f5967v = r6
                r8.f5968w = r2
                java.lang.Object r2 = r7.c(r8)
                if (r2 != r0) goto L96
            L95:
                return r0
            L96:
                r0 = r1
                r1 = r9
                r9 = r2
                r2 = r0
                r0 = r3
                r3 = r6
                goto L32
            L9d:
                r4 = r9
                java.util.Map r4 = (java.util.Map) r4
                r9 = r5
                java.lang.String r5 = r9.b()
                java.lang.String r6 = r9.a()
                c2.y r9 = r0.a(r1, r2, r3, r4, r5, r6)
                c2.C0664A.b(r7, r9)
            Lb0:
                K2.p r9 = K2.p.f2516a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: c2.C0664A.b.q(java.lang.Object):java.lang.Object");
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((b) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    /* JADX INFO: renamed from: c2.A$c */
    public static final class c extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f5971p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f5972q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f5974s;

        public c(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f5972q = obj;
            this.f5974s |= Integer.MIN_VALUE;
            return C0664A.this.i(this);
        }
    }

    public C0664A(C1509f c1509f, V1.h hVar, C0955f c0955f, InterfaceC0682h interfaceC0682h, N2.i iVar) {
        X2.l.e(c1509f, "firebaseApp");
        X2.l.e(hVar, "firebaseInstallations");
        X2.l.e(c0955f, "sessionSettings");
        X2.l.e(interfaceC0682h, "eventGDTLogger");
        X2.l.e(iVar, "backgroundDispatcher");
        this.f5957b = c1509f;
        this.f5958c = hVar;
        this.f5959d = c0955f;
        this.f5960e = interfaceC0682h;
        this.f5961f = iVar;
    }

    @Override // com.google.firebase.sessions.e
    public void a(x xVar) {
        X2.l.e(xVar, "sessionDetails");
        AbstractC1010i.d(h3.J.a(this.f5961f), null, null, new b(xVar, null), 3, null);
    }

    public final void g(y yVar) {
        try {
            this.f5960e.a(yVar);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
        } catch (RuntimeException e4) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e4);
        }
    }

    public final boolean h() {
        return f5956h <= this.f5959d.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(N2.e r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof c2.C0664A.c
            if (r0 == 0) goto L13
            r0 = r6
            c2.A$c r0 = (c2.C0664A.c) r0
            int r1 = r0.f5974s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5974s = r1
            goto L18
        L13:
            c2.A$c r0 = new c2.A$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5972q
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f5974s
            java.lang.String r3 = "SessionFirelogPublisher"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r0 = r0.f5971p
            c2.A r0 = (c2.C0664A) r0
            K2.k.b(r6)
            goto L4d
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L37:
            K2.k.b(r6)
            java.lang.String r6 = "Data Collection is enabled for at least one Subscriber"
            android.util.Log.d(r3, r6)
            f2.f r6 = r5.f5959d
            r0.f5971p = r5
            r0.f5974s = r4
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
        L4d:
            f2.f r6 = r0.f5959d
            boolean r6 = r6.d()
            r1 = 0
            if (r6 != 0) goto L60
            java.lang.String r6 = "Sessions SDK disabled. Events will not be sent."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = P2.b.a(r1)
            return r6
        L60:
            boolean r6 = r0.h()
            if (r6 != 0) goto L70
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r3, r6)
            java.lang.Boolean r6 = P2.b.a(r1)
            return r6
        L70:
            java.lang.Boolean r6 = P2.b.a(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.C0664A.i(N2.e):java.lang.Object");
    }
}
