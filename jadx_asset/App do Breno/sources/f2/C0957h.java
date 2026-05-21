package f2;

import P.f;
import P2.k;
import W2.p;
import X2.l;
import h3.AbstractC1008h;
import h3.I;

/* JADX INFO: renamed from: f2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0957h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f7256c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f.a f7257d = P.h.a("firebase_sessions_enabled");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f.a f7258e = P.h.c("firebase_sessions_sampling_rate");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f.a f7259f = P.h.e("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f.a f7260g = P.h.e("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f.a f7261h = P.h.f("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final L.h f7262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0954e f7263b;

    /* JADX INFO: renamed from: f2.h$a */
    public static final class a extends k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f7264q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f7265r;

        public a(N2.e eVar) {
            super(2, eVar);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return C0957h.this.new a(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            C0957h c0957h;
            Object objC = O2.c.c();
            int i4 = this.f7265r;
            if (i4 == 0) {
                K2.k.b(obj);
                C0957h c0957h2 = C0957h.this;
                k3.d data = c0957h2.f7262a.getData();
                this.f7264q = c0957h2;
                this.f7265r = 1;
                Object objK = k3.f.k(data, this);
                if (objK == objC) {
                    return objC;
                }
                c0957h = c0957h2;
                obj = objK;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0957h = (C0957h) this.f7264q;
                K2.k.b(obj);
            }
            c0957h.l(((P.f) obj).d());
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(I i4, N2.e eVar) {
            return ((a) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    /* JADX INFO: renamed from: f2.h$b */
    public static final class b {
        public /* synthetic */ b(X2.g gVar) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: f2.h$c */
    public static final class c extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f7267p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f7269r;

        public c(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f7267p = obj;
            this.f7269r |= Integer.MIN_VALUE;
            return C0957h.this.h(null, null, this);
        }
    }

    /* JADX INFO: renamed from: f2.h$d */
    public static final class d extends k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7270q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f7271r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Object f7272s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ f.a f7273t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C0957h f7274u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, f.a aVar, C0957h c0957h, N2.e eVar) {
            super(2, eVar);
            this.f7272s = obj;
            this.f7273t = aVar;
            this.f7274u = c0957h;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            d dVar = new d(this.f7272s, this.f7273t, this.f7274u, eVar);
            dVar.f7271r = obj;
            return dVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            O2.c.c();
            if (this.f7270q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            K2.k.b(obj);
            P.c cVar = (P.c) this.f7271r;
            Object obj2 = this.f7272s;
            if (obj2 != null) {
                cVar.j(this.f7273t, obj2);
            } else {
                cVar.i(this.f7273t);
            }
            this.f7274u.l(cVar);
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(P.c cVar, N2.e eVar) {
            return ((d) m(cVar, eVar)).q(K2.p.f2516a);
        }
    }

    public C0957h(L.h hVar) {
        l.e(hVar, "dataStore");
        this.f7262a = hVar;
        AbstractC1008h.b(null, new a(null), 1, null);
    }

    public final boolean d() {
        C0954e c0954e = this.f7263b;
        C0954e c0954e2 = null;
        if (c0954e == null) {
            l.o("sessionConfigs");
            c0954e = null;
        }
        Long lB = c0954e.b();
        C0954e c0954e3 = this.f7263b;
        if (c0954e3 == null) {
            l.o("sessionConfigs");
        } else {
            c0954e2 = c0954e3;
        }
        Integer numA = c0954e2.a();
        return lB == null || numA == null || (System.currentTimeMillis() - lB.longValue()) / ((long) 1000) >= ((long) numA.intValue());
    }

    public final Integer e() {
        C0954e c0954e = this.f7263b;
        if (c0954e == null) {
            l.o("sessionConfigs");
            c0954e = null;
        }
        return c0954e.d();
    }

    public final Double f() {
        C0954e c0954e = this.f7263b;
        if (c0954e == null) {
            l.o("sessionConfigs");
            c0954e = null;
        }
        return c0954e.e();
    }

    public final Boolean g() {
        C0954e c0954e = this.f7263b;
        if (c0954e == null) {
            l.o("sessionConfigs");
            c0954e = null;
        }
        return c0954e.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(P.f.a r6, java.lang.Object r7, N2.e r8) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r8 instanceof f2.C0957h.c
            if (r0 == 0) goto L13
            r0 = r8
            f2.h$c r0 = (f2.C0957h.c) r0
            int r1 = r0.f7269r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7269r = r1
            goto L18
        L13:
            f2.h$c r0 = new f2.h$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f7267p
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f7269r
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            K2.k.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            K2.k.b(r8)
            L.h r8 = r5.f7262a     // Catch: java.io.IOException -> L29
            f2.h$d r2 = new f2.h$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f7269r = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = P.i.a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            K2.p r6 = K2.p.f2516a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.C0957h.h(P.f$a, java.lang.Object, N2.e):java.lang.Object");
    }

    public final Object i(Double d4, N2.e eVar) throws Throwable {
        Object objH = h(f7258e, d4, eVar);
        return objH == O2.c.c() ? objH : K2.p.f2516a;
    }

    public final Object j(Integer num, N2.e eVar) throws Throwable {
        Object objH = h(f7260g, num, eVar);
        return objH == O2.c.c() ? objH : K2.p.f2516a;
    }

    public final Object k(Long l4, N2.e eVar) throws Throwable {
        Object objH = h(f7261h, l4, eVar);
        return objH == O2.c.c() ? objH : K2.p.f2516a;
    }

    public final void l(P.f fVar) {
        this.f7263b = new C0954e((Boolean) fVar.b(f7257d), (Double) fVar.b(f7258e), (Integer) fVar.b(f7259f), (Integer) fVar.b(f7260g), (Long) fVar.b(f7261h));
    }

    public final Object m(Integer num, N2.e eVar) throws Throwable {
        Object objH = h(f7259f, num, eVar);
        return objH == O2.c.c() ? objH : K2.p.f2516a;
    }

    public final Object n(Boolean bool, N2.e eVar) throws Throwable {
        Object objH = h(f7257d, bool, eVar);
        return objH == O2.c.c() ? objH : K2.p.f2516a;
    }
}
