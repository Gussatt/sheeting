package c2;

import P.f;
import android.content.Context;
import android.util.Log;
import h3.AbstractC1010i;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class v implements com.google.firebase.sessions.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f6108f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Z2.a f6109g = O.a.b(u.f6104a.a(), new M.b(b.f6117n), null, null, 12, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N2.i f6111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f6112d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k3.d f6113e;

    public static final class a extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6114q;

        /* JADX INFO: renamed from: c2.v$a$a, reason: collision with other inner class name */
        public static final class C0111a implements k3.e {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ v f6116m;

            public C0111a(v vVar) {
                this.f6116m = vVar;
            }

            @Override // k3.e
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(C0687m c0687m, N2.e eVar) {
                this.f6116m.f6112d.set(c0687m);
                return K2.p.f2516a;
            }
        }

        public a(N2.e eVar) {
            super(2, eVar);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return v.this.new a(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f6114q;
            if (i4 == 0) {
                K2.k.b(obj);
                k3.d dVar = v.this.f6113e;
                C0111a c0111a = new C0111a(v.this);
                this.f6114q = 1;
                if (dVar.b(c0111a, this) == objC) {
                    return objC;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
            }
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((a) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class b extends X2.m implements W2.l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final b f6117n = new b();

        public b() {
            super(1);
        }

        @Override // W2.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P.f k(L.c cVar) {
            X2.l.e(cVar, "ex");
            Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + t.f6103a.e() + '.', cVar);
            return P.g.a();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ d3.i[] f6118a = {X2.z.f(new X2.t(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public /* synthetic */ c(X2.g gVar) {
            this();
        }

        public final L.h b(Context context) {
            return (L.h) v.f6109g.a(context, f6118a[0]);
        }

        public c() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f6119a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f.a f6120b = P.h.g("session_id");

        public final f.a a() {
            return f6120b;
        }
    }

    public static final class e extends P2.k implements W2.q {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6121q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f6122r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f6123s;

        public e(N2.e eVar) {
            super(3, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f6121q;
            if (i4 == 0) {
                K2.k.b(obj);
                k3.e eVar = (k3.e) this.f6122r;
                Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f6123s);
                P.f fVarA = P.g.a();
                this.f6122r = null;
                this.f6121q = 1;
                if (eVar.a(fVarA, this) == objC) {
                    return objC;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
            }
            return K2.p.f2516a;
        }

        @Override // W2.q
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object g(k3.e eVar, Throwable th, N2.e eVar2) {
            e eVar3 = new e(eVar2);
            eVar3.f6122r = eVar;
            eVar3.f6123s = th;
            return eVar3.q(K2.p.f2516a);
        }
    }

    public static final class f implements k3.d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k3.d f6124m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ v f6125n;

        public static final class a implements k3.e {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ k3.e f6126m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ v f6127n;

            /* JADX INFO: renamed from: c2.v$f$a$a, reason: collision with other inner class name */
            public static final class C0112a extends P2.d {

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public /* synthetic */ Object f6128p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public int f6129q;

                public C0112a(N2.e eVar) {
                    super(eVar);
                }

                @Override // P2.a
                public final Object q(Object obj) {
                    this.f6128p = obj;
                    this.f6129q |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(k3.e eVar, v vVar) {
                this.f6126m = eVar;
                this.f6127n = vVar;
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
                    boolean r0 = r6 instanceof c2.v.f.a.C0112a
                    if (r0 == 0) goto L13
                    r0 = r6
                    c2.v$f$a$a r0 = (c2.v.f.a.C0112a) r0
                    int r1 = r0.f6129q
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f6129q = r1
                    goto L18
                L13:
                    c2.v$f$a$a r0 = new c2.v$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f6128p
                    java.lang.Object r1 = O2.c.c()
                    int r2 = r0.f6129q
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    K2.k.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    K2.k.b(r6)
                    k3.e r6 = r4.f6126m
                    P.f r5 = (P.f) r5
                    c2.v r2 = r4.f6127n
                    c2.m r5 = c2.v.h(r2, r5)
                    r0.f6129q = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    K2.p r5 = K2.p.f2516a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: c2.v.f.a.a(java.lang.Object, N2.e):java.lang.Object");
            }
        }

        public f(k3.d dVar, v vVar) {
            this.f6124m = dVar;
            this.f6125n = vVar;
        }

        @Override // k3.d
        public Object b(k3.e eVar, N2.e eVar2) {
            Object objB = this.f6124m.b(new a(eVar, this.f6125n), eVar2);
            return objB == O2.c.c() ? objB : K2.p.f2516a;
        }
    }

    public static final class g extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f6131q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f6133s;

        public static final class a extends P2.k implements W2.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f6134q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f6135r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f6136s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, N2.e eVar) {
                super(2, eVar);
                this.f6136s = str;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                a aVar = new a(this.f6136s, eVar);
                aVar.f6135r = obj;
                return aVar;
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                O2.c.c();
                if (this.f6134q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
                ((P.c) this.f6135r).j(d.f6119a.a(), this.f6136s);
                return K2.p.f2516a;
            }

            @Override // W2.p
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(P.c cVar, N2.e eVar) {
                return ((a) m(cVar, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, N2.e eVar) {
            super(2, eVar);
            this.f6133s = str;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return v.this.new g(this.f6133s, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f6131q;
            try {
                if (i4 == 0) {
                    K2.k.b(obj);
                    L.h hVarB = v.f6108f.b(v.this.f6110b);
                    a aVar = new a(this.f6133s, null);
                    this.f6131q = 1;
                    if (P.i.a(hVarB, aVar, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    K2.k.b(obj);
                }
            } catch (IOException e4) {
                Log.w("FirebaseSessionsRepo", "Failed to update session Id: " + e4);
            }
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((g) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public v(Context context, N2.i iVar) {
        X2.l.e(context, "appContext");
        X2.l.e(iVar, "backgroundDispatcher");
        this.f6110b = context;
        this.f6111c = iVar;
        this.f6112d = new AtomicReference();
        this.f6113e = new f(k3.f.d(f6108f.b(context).getData(), new e(null)), this);
        AbstractC1010i.d(h3.J.a(iVar), null, null, new a(null), 3, null);
    }

    @Override // com.google.firebase.sessions.d
    public String a() {
        C0687m c0687m = (C0687m) this.f6112d.get();
        if (c0687m != null) {
            return c0687m.a();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.d
    public void b(String str) {
        X2.l.e(str, "sessionId");
        AbstractC1010i.d(h3.J.a(this.f6111c), null, null, new g(str, null), 3, null);
    }

    public final C0687m i(P.f fVar) {
        return new C0687m((String) fVar.b(d.f6119a.a()));
    }
}
