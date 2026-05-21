package L;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2525a = new a(null);

    public static final class a {

        /* JADX INFO: renamed from: L.g$a$a, reason: collision with other inner class name */
        public static final class C0054a extends P2.k implements W2.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f2526q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f2527r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ List f2528s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0054a(List list, N2.e eVar) {
                super(2, eVar);
                this.f2528s = list;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                C0054a c0054a = new C0054a(this.f2528s, eVar);
                c0054a.f2527r = obj;
                return c0054a;
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                Object objC = O2.c.c();
                int i4 = this.f2526q;
                if (i4 == 0) {
                    K2.k.b(obj);
                    m mVar = (m) this.f2527r;
                    a aVar = g.f2525a;
                    List list = this.f2528s;
                    this.f2526q = 1;
                    if (aVar.c(list, mVar, this) == objC) {
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
            public final Object j(m mVar, N2.e eVar) {
                return ((C0054a) m(mVar, eVar)).q(K2.p.f2516a);
            }
        }

        public static final class b extends P2.d {

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public Object f2529p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public Object f2530q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f2531r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f2533t;

            public b(N2.e eVar) {
                super(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) {
                this.f2531r = obj;
                this.f2533t |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        public static final class c extends P2.k implements W2.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public Object f2534q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public Object f2535r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public Object f2536s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public int f2537t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public /* synthetic */ Object f2538u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ List f2539v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ List f2540w;

            /* JADX INFO: renamed from: L.g$a$c$a, reason: collision with other inner class name */
            public static final class C0055a extends P2.k implements W2.l {

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public int f2541q;

                public C0055a(f fVar, N2.e eVar) {
                    super(1, eVar);
                }

                @Override // P2.a
                public final Object q(Object obj) throws Throwable {
                    O2.c.c();
                    int i4 = this.f2541q;
                    if (i4 == 0) {
                        K2.k.b(obj);
                        this.f2541q = 1;
                        throw null;
                    }
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    K2.k.b(obj);
                    return K2.p.f2516a;
                }

                public final N2.e u(N2.e eVar) {
                    return new C0055a(null, eVar);
                }

                @Override // W2.l
                /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
                public final Object k(N2.e eVar) {
                    return ((C0055a) u(eVar)).q(K2.p.f2516a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, N2.e eVar) {
                super(2, eVar);
                this.f2539v = list;
                this.f2540w = list2;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                c cVar = new c(this.f2539v, this.f2540w, eVar);
                cVar.f2538u = obj;
                return cVar;
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                List list;
                Iterator it;
                O2.c.c();
                int i4 = this.f2537t;
                if (i4 == 0) {
                    K2.k.b(obj);
                    obj = this.f2538u;
                    List list2 = this.f2539v;
                    list = this.f2540w;
                    it = list2.iterator();
                } else if (i4 == 1) {
                    Object obj2 = this.f2536s;
                    i.d.a(this.f2535r);
                    Iterator it2 = (Iterator) this.f2534q;
                    List list3 = (List) this.f2538u;
                    K2.k.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0055a(null, null));
                        this.f2538u = list3;
                        this.f2534q = it2;
                        this.f2535r = null;
                        this.f2536s = null;
                        this.f2537t = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f2534q;
                    list = (List) this.f2538u;
                    K2.k.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                i.d.a(it.next());
                this.f2538u = list;
                this.f2534q = it;
                this.f2535r = null;
                this.f2536s = obj;
                this.f2537t = 1;
                throw null;
            }

            @Override // W2.p
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(Object obj, N2.e eVar) {
                return ((c) m(obj, eVar)).q(K2.p.f2516a);
            }
        }

        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final W2.p b(List list) {
            X2.l.e(list, "migrations");
            return new C0054a(list, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(java.util.List r7, L.m r8, N2.e r9) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r9 instanceof L.g.a.b
                if (r0 == 0) goto L13
                r0 = r9
                L.g$a$b r0 = (L.g.a.b) r0
                int r1 = r0.f2533t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2533t = r1
                goto L18
            L13:
                L.g$a$b r0 = new L.g$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f2531r
                java.lang.Object r1 = O2.c.c()
                int r2 = r0.f2533t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f2530q
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f2529p
                X2.y r8 = (X2.y) r8
                K2.k.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f2529p
                java.util.List r7 = (java.util.List) r7
                K2.k.b(r9)
                goto L60
            L46:
                K2.k.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                L.g$a$c r2 = new L.g$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f2529p = r9
                r0.f2533t = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                goto L81
            L5f:
                r7 = r9
            L60:
                X2.y r8 = new X2.y
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L92
                java.lang.Object r9 = r7.next()
                W2.l r9 = (W2.l) r9
                r0.f2529p = r8     // Catch: java.lang.Throwable -> L34
                r0.f2530q = r7     // Catch: java.lang.Throwable -> L34
                r0.f2533t = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.k(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
            L81:
                return r1
            L82:
                java.lang.Object r2 = r8.f3992m
                if (r2 != 0) goto L89
                r8.f3992m = r9
                goto L69
            L89:
                X2.l.b(r2)
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                K2.a.a(r2, r9)
                goto L69
            L92:
                java.lang.Object r7 = r8.f3992m
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9b
                K2.p r7 = K2.p.f2516a
                return r7
            L9b:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: L.g.a.c(java.util.List, L.m, N2.e):java.lang.Object");
        }

        public a() {
        }
    }
}
