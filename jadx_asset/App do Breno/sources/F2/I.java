package F2;

import F2.E;
import P.f;
import android.content.Context;
import android.util.Log;
import h3.AbstractC1008h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s2.InterfaceC1536a;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public final class I implements InterfaceC1536a, E {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f1485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F f1486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G f1487e = new C0276b();

    public static final class a extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1488q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f1490s;

        /* JADX INFO: renamed from: F2.I$a$a, reason: collision with other inner class name */
        public static final class C0035a extends P2.k implements W2.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f1491q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f1492r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ List f1493s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0035a(List list, N2.e eVar) {
                super(2, eVar);
                this.f1493s = list;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                C0035a c0035a = new C0035a(this.f1493s, eVar);
                c0035a.f1492r = obj;
                return c0035a;
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                O2.c.c();
                if (this.f1491q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
                P.c cVar = (P.c) this.f1492r;
                List list = this.f1493s;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        cVar.i(P.h.a((String) it.next()));
                    }
                } else {
                    cVar.f();
                }
                return K2.p.f2516a;
            }

            @Override // W2.p
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(P.c cVar, N2.e eVar) {
                return ((C0035a) m(cVar, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, N2.e eVar) {
            super(2, eVar);
            this.f1490s = list;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return I.this.new a(this.f1490s, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f1488q;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
                return obj;
            }
            K2.k.b(obj);
            Context context = I.this.f1485c;
            if (context == null) {
                X2.l.o("context");
                context = null;
            }
            L.h hVarB = J.b(context);
            C0035a c0035a = new C0035a(this.f1490s, null);
            this.f1488q = 1;
            Object objA = P.i.a(hVarB, c0035a, this);
            return objA == objC ? objC : objA;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((a) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class b extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1494q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f1495r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f.a f1496s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f1497t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f.a aVar, String str, N2.e eVar) {
            super(2, eVar);
            this.f1496s = aVar;
            this.f1497t = str;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            b bVar = new b(this.f1496s, this.f1497t, eVar);
            bVar.f1495r = obj;
            return bVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            O2.c.c();
            if (this.f1494q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            K2.k.b(obj);
            ((P.c) this.f1495r).j(this.f1496s, this.f1497t);
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(P.c cVar, N2.e eVar) {
            return ((b) m(cVar, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class c extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1498q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f1500s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, N2.e eVar) {
            super(2, eVar);
            this.f1500s = list;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return I.this.new c(this.f1500s, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f1498q;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
                return obj;
            }
            K2.k.b(obj);
            I i5 = I.this;
            List list = this.f1500s;
            this.f1498q = 1;
            Object objW = i5.w(list, this);
            return objW == objC ? objC : objW;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((c) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class d extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f1501q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1502r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f1503s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ I f1504t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ X2.y f1505u;

        public static final class a implements k3.d {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ k3.d f1506m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ f.a f1507n;

            /* JADX INFO: renamed from: F2.I$d$a$a, reason: collision with other inner class name */
            public static final class C0036a implements k3.e {

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ k3.e f1508m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ f.a f1509n;

                /* JADX INFO: renamed from: F2.I$d$a$a$a, reason: collision with other inner class name */
                public static final class C0037a extends P2.d {

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public /* synthetic */ Object f1510p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public int f1511q;

                    public C0037a(N2.e eVar) {
                        super(eVar);
                    }

                    @Override // P2.a
                    public final Object q(Object obj) {
                        this.f1510p = obj;
                        this.f1511q |= Integer.MIN_VALUE;
                        return C0036a.this.a(null, this);
                    }
                }

                public C0036a(k3.e eVar, f.a aVar) {
                    this.f1508m = eVar;
                    this.f1509n = aVar;
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
                        boolean r0 = r6 instanceof F2.I.d.a.C0036a.C0037a
                        if (r0 == 0) goto L13
                        r0 = r6
                        F2.I$d$a$a$a r0 = (F2.I.d.a.C0036a.C0037a) r0
                        int r1 = r0.f1511q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1511q = r1
                        goto L18
                    L13:
                        F2.I$d$a$a$a r0 = new F2.I$d$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f1510p
                        java.lang.Object r1 = O2.c.c()
                        int r2 = r0.f1511q
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
                        k3.e r6 = r4.f1508m
                        P.f r5 = (P.f) r5
                        P.f$a r2 = r4.f1509n
                        java.lang.Object r5 = r5.b(r2)
                        r0.f1511q = r3
                        java.lang.Object r5 = r6.a(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        K2.p r5 = K2.p.f2516a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: F2.I.d.a.C0036a.a(java.lang.Object, N2.e):java.lang.Object");
                }
            }

            public a(k3.d dVar, f.a aVar) {
                this.f1506m = dVar;
                this.f1507n = aVar;
            }

            @Override // k3.d
            public Object b(k3.e eVar, N2.e eVar2) {
                Object objB = this.f1506m.b(new C0036a(eVar, this.f1507n), eVar2);
                return objB == O2.c.c() ? objB : K2.p.f2516a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, I i4, X2.y yVar, N2.e eVar) {
            super(2, eVar);
            this.f1503s = str;
            this.f1504t = i4;
            this.f1505u = yVar;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return new d(this.f1503s, this.f1504t, this.f1505u, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            X2.y yVar;
            Object objC = O2.c.c();
            int i4 = this.f1502r;
            if (i4 == 0) {
                K2.k.b(obj);
                f.a aVarA = P.h.a(this.f1503s);
                Context context = this.f1504t.f1485c;
                if (context == null) {
                    X2.l.o("context");
                    context = null;
                }
                a aVar = new a(J.b(context).getData(), aVarA);
                X2.y yVar2 = this.f1505u;
                this.f1501q = yVar2;
                this.f1502r = 1;
                Object objL = k3.f.l(aVar, this);
                if (objL == objC) {
                    return objC;
                }
                yVar = yVar2;
                obj = objL;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (X2.y) this.f1501q;
                K2.k.b(obj);
            }
            yVar.f3992m = obj;
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((d) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class e extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f1513q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1514r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f1515s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ I f1516t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ X2.y f1517u;

        public static final class a implements k3.d {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ k3.d f1518m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ f.a f1519n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ I f1520o;

            /* JADX INFO: renamed from: F2.I$e$a$a, reason: collision with other inner class name */
            public static final class C0038a implements k3.e {

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ k3.e f1521m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ f.a f1522n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                public final /* synthetic */ I f1523o;

                /* JADX INFO: renamed from: F2.I$e$a$a$a, reason: collision with other inner class name */
                public static final class C0039a extends P2.d {

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public /* synthetic */ Object f1524p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public int f1525q;

                    public C0039a(N2.e eVar) {
                        super(eVar);
                    }

                    @Override // P2.a
                    public final Object q(Object obj) {
                        this.f1524p = obj;
                        this.f1525q |= Integer.MIN_VALUE;
                        return C0038a.this.a(null, this);
                    }
                }

                public C0038a(k3.e eVar, f.a aVar, I i4) {
                    this.f1521m = eVar;
                    this.f1522n = aVar;
                    this.f1523o = i4;
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
                        boolean r0 = r6 instanceof F2.I.e.a.C0038a.C0039a
                        if (r0 == 0) goto L13
                        r0 = r6
                        F2.I$e$a$a$a r0 = (F2.I.e.a.C0038a.C0039a) r0
                        int r1 = r0.f1525q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1525q = r1
                        goto L18
                    L13:
                        F2.I$e$a$a$a r0 = new F2.I$e$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f1524p
                        java.lang.Object r1 = O2.c.c()
                        int r2 = r0.f1525q
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        K2.k.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        K2.k.b(r6)
                        k3.e r6 = r4.f1521m
                        P.f r5 = (P.f) r5
                        P.f$a r2 = r4.f1522n
                        java.lang.Object r5 = r5.b(r2)
                        F2.I r2 = r4.f1523o
                        F2.G r2 = F2.I.t(r2)
                        java.lang.Object r5 = F2.J.d(r5, r2)
                        java.lang.Double r5 = (java.lang.Double) r5
                        r0.f1525q = r3
                        java.lang.Object r5 = r6.a(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        K2.p r5 = K2.p.f2516a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: F2.I.e.a.C0038a.a(java.lang.Object, N2.e):java.lang.Object");
                }
            }

            public a(k3.d dVar, f.a aVar, I i4) {
                this.f1518m = dVar;
                this.f1519n = aVar;
                this.f1520o = i4;
            }

            @Override // k3.d
            public Object b(k3.e eVar, N2.e eVar2) {
                Object objB = this.f1518m.b(new C0038a(eVar, this.f1519n, this.f1520o), eVar2);
                return objB == O2.c.c() ? objB : K2.p.f2516a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, I i4, X2.y yVar, N2.e eVar) {
            super(2, eVar);
            this.f1515s = str;
            this.f1516t = i4;
            this.f1517u = yVar;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return new e(this.f1515s, this.f1516t, this.f1517u, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            X2.y yVar;
            Object objC = O2.c.c();
            int i4 = this.f1514r;
            if (i4 == 0) {
                K2.k.b(obj);
                f.a aVarG = P.h.g(this.f1515s);
                Context context = this.f1516t.f1485c;
                if (context == null) {
                    X2.l.o("context");
                    context = null;
                }
                a aVar = new a(J.b(context).getData(), aVarG, this.f1516t);
                X2.y yVar2 = this.f1517u;
                this.f1513q = yVar2;
                this.f1514r = 1;
                Object objL = k3.f.l(aVar, this);
                if (objL == objC) {
                    return objC;
                }
                yVar = yVar2;
                obj = objL;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (X2.y) this.f1513q;
                K2.k.b(obj);
            }
            yVar.f3992m = obj;
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((e) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class f extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f1527q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1528r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f1529s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ I f1530t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ X2.y f1531u;

        public static final class a implements k3.d {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ k3.d f1532m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ f.a f1533n;

            /* JADX INFO: renamed from: F2.I$f$a$a, reason: collision with other inner class name */
            public static final class C0040a implements k3.e {

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ k3.e f1534m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ f.a f1535n;

                /* JADX INFO: renamed from: F2.I$f$a$a$a, reason: collision with other inner class name */
                public static final class C0041a extends P2.d {

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public /* synthetic */ Object f1536p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public int f1537q;

                    public C0041a(N2.e eVar) {
                        super(eVar);
                    }

                    @Override // P2.a
                    public final Object q(Object obj) {
                        this.f1536p = obj;
                        this.f1537q |= Integer.MIN_VALUE;
                        return C0040a.this.a(null, this);
                    }
                }

                public C0040a(k3.e eVar, f.a aVar) {
                    this.f1534m = eVar;
                    this.f1535n = aVar;
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
                        boolean r0 = r6 instanceof F2.I.f.a.C0040a.C0041a
                        if (r0 == 0) goto L13
                        r0 = r6
                        F2.I$f$a$a$a r0 = (F2.I.f.a.C0040a.C0041a) r0
                        int r1 = r0.f1537q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1537q = r1
                        goto L18
                    L13:
                        F2.I$f$a$a$a r0 = new F2.I$f$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f1536p
                        java.lang.Object r1 = O2.c.c()
                        int r2 = r0.f1537q
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
                        k3.e r6 = r4.f1534m
                        P.f r5 = (P.f) r5
                        P.f$a r2 = r4.f1535n
                        java.lang.Object r5 = r5.b(r2)
                        r0.f1537q = r3
                        java.lang.Object r5 = r6.a(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        K2.p r5 = K2.p.f2516a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: F2.I.f.a.C0040a.a(java.lang.Object, N2.e):java.lang.Object");
                }
            }

            public a(k3.d dVar, f.a aVar) {
                this.f1532m = dVar;
                this.f1533n = aVar;
            }

            @Override // k3.d
            public Object b(k3.e eVar, N2.e eVar2) {
                Object objB = this.f1532m.b(new C0040a(eVar, this.f1533n), eVar2);
                return objB == O2.c.c() ? objB : K2.p.f2516a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, I i4, X2.y yVar, N2.e eVar) {
            super(2, eVar);
            this.f1529s = str;
            this.f1530t = i4;
            this.f1531u = yVar;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return new f(this.f1529s, this.f1530t, this.f1531u, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            X2.y yVar;
            Object objC = O2.c.c();
            int i4 = this.f1528r;
            if (i4 == 0) {
                K2.k.b(obj);
                f.a aVarF = P.h.f(this.f1529s);
                Context context = this.f1530t.f1485c;
                if (context == null) {
                    X2.l.o("context");
                    context = null;
                }
                a aVar = new a(J.b(context).getData(), aVarF);
                X2.y yVar2 = this.f1531u;
                this.f1527q = yVar2;
                this.f1528r = 1;
                Object objL = k3.f.l(aVar, this);
                if (objL == objC) {
                    return objC;
                }
                yVar = yVar2;
                obj = objL;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (X2.y) this.f1527q;
                K2.k.b(obj);
            }
            yVar.f3992m = obj;
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((f) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class g extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1539q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ List f1541s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list, N2.e eVar) {
            super(2, eVar);
            this.f1541s = list;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return I.this.new g(this.f1541s, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f1539q;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
                return obj;
            }
            K2.k.b(obj);
            I i5 = I.this;
            List list = this.f1541s;
            this.f1539q = 1;
            Object objW = i5.w(list, this);
            return objW == objC ? objC : objW;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((g) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class h extends P2.d {

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Object f1542p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f1543q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f1544r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f1545s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f1546t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f1547u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f1549w;

        public h(N2.e eVar) {
            super(eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) {
            this.f1547u = obj;
            this.f1549w |= Integer.MIN_VALUE;
            return I.this.w(null, this);
        }
    }

    public static final class i extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Object f1550q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f1551r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f1552s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ I f1553t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ X2.y f1554u;

        public static final class a implements k3.d {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ k3.d f1555m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ f.a f1556n;

            /* JADX INFO: renamed from: F2.I$i$a$a, reason: collision with other inner class name */
            public static final class C0042a implements k3.e {

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                public final /* synthetic */ k3.e f1557m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                public final /* synthetic */ f.a f1558n;

                /* JADX INFO: renamed from: F2.I$i$a$a$a, reason: collision with other inner class name */
                public static final class C0043a extends P2.d {

                    /* JADX INFO: renamed from: p, reason: collision with root package name */
                    public /* synthetic */ Object f1559p;

                    /* JADX INFO: renamed from: q, reason: collision with root package name */
                    public int f1560q;

                    public C0043a(N2.e eVar) {
                        super(eVar);
                    }

                    @Override // P2.a
                    public final Object q(Object obj) {
                        this.f1559p = obj;
                        this.f1560q |= Integer.MIN_VALUE;
                        return C0042a.this.a(null, this);
                    }
                }

                public C0042a(k3.e eVar, f.a aVar) {
                    this.f1557m = eVar;
                    this.f1558n = aVar;
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
                        boolean r0 = r6 instanceof F2.I.i.a.C0042a.C0043a
                        if (r0 == 0) goto L13
                        r0 = r6
                        F2.I$i$a$a$a r0 = (F2.I.i.a.C0042a.C0043a) r0
                        int r1 = r0.f1560q
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f1560q = r1
                        goto L18
                    L13:
                        F2.I$i$a$a$a r0 = new F2.I$i$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f1559p
                        java.lang.Object r1 = O2.c.c()
                        int r2 = r0.f1560q
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
                        k3.e r6 = r4.f1557m
                        P.f r5 = (P.f) r5
                        P.f$a r2 = r4.f1558n
                        java.lang.Object r5 = r5.b(r2)
                        r0.f1560q = r3
                        java.lang.Object r5 = r6.a(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        K2.p r5 = K2.p.f2516a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: F2.I.i.a.C0042a.a(java.lang.Object, N2.e):java.lang.Object");
                }
            }

            public a(k3.d dVar, f.a aVar) {
                this.f1555m = dVar;
                this.f1556n = aVar;
            }

            @Override // k3.d
            public Object b(k3.e eVar, N2.e eVar2) {
                Object objB = this.f1555m.b(new C0042a(eVar, this.f1556n), eVar2);
                return objB == O2.c.c() ? objB : K2.p.f2516a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, I i4, X2.y yVar, N2.e eVar) {
            super(2, eVar);
            this.f1552s = str;
            this.f1553t = i4;
            this.f1554u = yVar;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return new i(this.f1552s, this.f1553t, this.f1554u, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            X2.y yVar;
            Object objC = O2.c.c();
            int i4 = this.f1551r;
            if (i4 == 0) {
                K2.k.b(obj);
                f.a aVarG = P.h.g(this.f1552s);
                Context context = this.f1553t.f1485c;
                if (context == null) {
                    X2.l.o("context");
                    context = null;
                }
                a aVar = new a(J.b(context).getData(), aVarG);
                X2.y yVar2 = this.f1554u;
                this.f1550q = yVar2;
                this.f1551r = 1;
                Object objL = k3.f.l(aVar, this);
                if (objL == objC) {
                    return objC;
                }
                yVar = yVar2;
                obj = objL;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                yVar = (X2.y) this.f1550q;
                K2.k.b(obj);
            }
            yVar.f3992m = obj;
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(h3.I i4, N2.e eVar) {
            return ((i) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class j implements k3.d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k3.d f1562m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ f.a f1563n;

        public static final class a implements k3.e {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ k3.e f1564m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ f.a f1565n;

            /* JADX INFO: renamed from: F2.I$j$a$a, reason: collision with other inner class name */
            public static final class C0044a extends P2.d {

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public /* synthetic */ Object f1566p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public int f1567q;

                public C0044a(N2.e eVar) {
                    super(eVar);
                }

                @Override // P2.a
                public final Object q(Object obj) {
                    this.f1566p = obj;
                    this.f1567q |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(k3.e eVar, f.a aVar) {
                this.f1564m = eVar;
                this.f1565n = aVar;
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
                    boolean r0 = r6 instanceof F2.I.j.a.C0044a
                    if (r0 == 0) goto L13
                    r0 = r6
                    F2.I$j$a$a r0 = (F2.I.j.a.C0044a) r0
                    int r1 = r0.f1567q
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1567q = r1
                    goto L18
                L13:
                    F2.I$j$a$a r0 = new F2.I$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f1566p
                    java.lang.Object r1 = O2.c.c()
                    int r2 = r0.f1567q
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
                    k3.e r6 = r4.f1564m
                    P.f r5 = (P.f) r5
                    P.f$a r2 = r4.f1565n
                    java.lang.Object r5 = r5.b(r2)
                    r0.f1567q = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    K2.p r5 = K2.p.f2516a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: F2.I.j.a.a(java.lang.Object, N2.e):java.lang.Object");
            }
        }

        public j(k3.d dVar, f.a aVar) {
            this.f1562m = dVar;
            this.f1563n = aVar;
        }

        @Override // k3.d
        public Object b(k3.e eVar, N2.e eVar2) {
            Object objB = this.f1562m.b(new a(eVar, this.f1563n), eVar2);
            return objB == O2.c.c() ? objB : K2.p.f2516a;
        }
    }

    public static final class k implements k3.d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ k3.d f1569m;

        public static final class a implements k3.e {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ k3.e f1570m;

            /* JADX INFO: renamed from: F2.I$k$a$a, reason: collision with other inner class name */
            public static final class C0045a extends P2.d {

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                public /* synthetic */ Object f1571p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                public int f1572q;

                public C0045a(N2.e eVar) {
                    super(eVar);
                }

                @Override // P2.a
                public final Object q(Object obj) {
                    this.f1571p = obj;
                    this.f1572q |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(k3.e eVar) {
                this.f1570m = eVar;
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
                    boolean r0 = r6 instanceof F2.I.k.a.C0045a
                    if (r0 == 0) goto L13
                    r0 = r6
                    F2.I$k$a$a r0 = (F2.I.k.a.C0045a) r0
                    int r1 = r0.f1572q
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f1572q = r1
                    goto L18
                L13:
                    F2.I$k$a$a r0 = new F2.I$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f1571p
                    java.lang.Object r1 = O2.c.c()
                    int r2 = r0.f1572q
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    K2.k.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    K2.k.b(r6)
                    k3.e r6 = r4.f1570m
                    P.f r5 = (P.f) r5
                    java.util.Map r5 = r5.a()
                    java.util.Set r5 = r5.keySet()
                    r0.f1572q = r3
                    java.lang.Object r5 = r6.a(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    K2.p r5 = K2.p.f2516a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: F2.I.k.a.a(java.lang.Object, N2.e):java.lang.Object");
            }
        }

        public k(k3.d dVar) {
            this.f1569m = dVar;
        }

        @Override // k3.d
        public Object b(k3.e eVar, N2.e eVar2) {
            Object objB = this.f1569m.b(new a(eVar), eVar2);
            return objB == O2.c.c() ? objB : K2.p.f2516a;
        }
    }

    public static final class l extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1574q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f1575r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ I f1576s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f1577t;

        public static final class a extends P2.k implements W2.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f1578q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f1579r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f.a f1580s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ boolean f1581t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, boolean z3, N2.e eVar) {
                super(2, eVar);
                this.f1580s = aVar;
                this.f1581t = z3;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                a aVar = new a(this.f1580s, this.f1581t, eVar);
                aVar.f1579r = obj;
                return aVar;
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                O2.c.c();
                if (this.f1578q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
                ((P.c) this.f1579r).j(this.f1580s, P2.b.a(this.f1581t));
                return K2.p.f2516a;
            }

            @Override // W2.p
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(P.c cVar, N2.e eVar) {
                return ((a) m(cVar, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, I i4, boolean z3, N2.e eVar) {
            super(2, eVar);
            this.f1575r = str;
            this.f1576s = i4;
            this.f1577t = z3;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return new l(this.f1575r, this.f1576s, this.f1577t, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f1574q;
            if (i4 == 0) {
                K2.k.b(obj);
                f.a aVarA = P.h.a(this.f1575r);
                Context context = this.f1576s.f1485c;
                if (context == null) {
                    X2.l.o("context");
                    context = null;
                }
                L.h hVarB = J.b(context);
                a aVar = new a(aVarA, this.f1577t, null);
                this.f1574q = 1;
                if (P.i.a(hVarB, aVar, this) == objC) {
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
            return ((l) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class m extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1582q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f1584s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f1585t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, String str2, N2.e eVar) {
            super(2, eVar);
            this.f1584s = str;
            this.f1585t = str2;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return I.this.new m(this.f1584s, this.f1585t, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f1582q;
            if (i4 == 0) {
                K2.k.b(obj);
                I i5 = I.this;
                String str = this.f1584s;
                String str2 = this.f1585t;
                this.f1582q = 1;
                if (i5.v(str, str2, this) == objC) {
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
            return ((m) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class n extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1586q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f1587r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ I f1588s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ double f1589t;

        public static final class a extends P2.k implements W2.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f1590q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f1591r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f.a f1592s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ double f1593t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, double d4, N2.e eVar) {
                super(2, eVar);
                this.f1592s = aVar;
                this.f1593t = d4;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                a aVar = new a(this.f1592s, this.f1593t, eVar);
                aVar.f1591r = obj;
                return aVar;
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                O2.c.c();
                if (this.f1590q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
                ((P.c) this.f1591r).j(this.f1592s, P2.b.b(this.f1593t));
                return K2.p.f2516a;
            }

            @Override // W2.p
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(P.c cVar, N2.e eVar) {
                return ((a) m(cVar, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, I i4, double d4, N2.e eVar) {
            super(2, eVar);
            this.f1587r = str;
            this.f1588s = i4;
            this.f1589t = d4;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return new n(this.f1587r, this.f1588s, this.f1589t, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f1586q;
            if (i4 == 0) {
                K2.k.b(obj);
                f.a aVarC = P.h.c(this.f1587r);
                Context context = this.f1588s.f1485c;
                if (context == null) {
                    X2.l.o("context");
                    context = null;
                }
                L.h hVarB = J.b(context);
                a aVar = new a(aVarC, this.f1589t, null);
                this.f1586q = 1;
                if (P.i.a(hVarB, aVar, this) == objC) {
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
            return ((n) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class o extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1594q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f1596s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f1597t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, N2.e eVar) {
            super(2, eVar);
            this.f1596s = str;
            this.f1597t = str2;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return I.this.new o(this.f1596s, this.f1597t, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f1594q;
            if (i4 == 0) {
                K2.k.b(obj);
                I i5 = I.this;
                String str = this.f1596s;
                String str2 = this.f1597t;
                this.f1594q = 1;
                if (i5.v(str, str2, this) == objC) {
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
            return ((o) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class p extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1598q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ String f1599r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ I f1600s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f1601t;

        public static final class a extends P2.k implements W2.p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f1602q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f1603r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ f.a f1604s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ long f1605t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f.a aVar, long j4, N2.e eVar) {
                super(2, eVar);
                this.f1604s = aVar;
                this.f1605t = j4;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                a aVar = new a(this.f1604s, this.f1605t, eVar);
                aVar.f1603r = obj;
                return aVar;
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                O2.c.c();
                if (this.f1602q != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
                ((P.c) this.f1603r).j(this.f1604s, P2.b.d(this.f1605t));
                return K2.p.f2516a;
            }

            @Override // W2.p
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(P.c cVar, N2.e eVar) {
                return ((a) m(cVar, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, I i4, long j4, N2.e eVar) {
            super(2, eVar);
            this.f1599r = str;
            this.f1600s = i4;
            this.f1601t = j4;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return new p(this.f1599r, this.f1600s, this.f1601t, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f1598q;
            if (i4 == 0) {
                K2.k.b(obj);
                f.a aVarF = P.h.f(this.f1599r);
                Context context = this.f1600s.f1485c;
                if (context == null) {
                    X2.l.o("context");
                    context = null;
                }
                L.h hVarB = J.b(context);
                a aVar = new a(aVarF, this.f1601t, null);
                this.f1598q = 1;
                if (P.i.a(hVarB, aVar, this) == objC) {
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
            return ((p) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class q extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1606q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f1608s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f1609t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String str, String str2, N2.e eVar) {
            super(2, eVar);
            this.f1608s = str;
            this.f1609t = str2;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return I.this.new q(this.f1608s, this.f1609t, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f1606q;
            if (i4 == 0) {
                K2.k.b(obj);
                I i5 = I.this;
                String str = this.f1608s;
                String str2 = this.f1609t;
                this.f1606q = 1;
                if (i5.v(str, str2, this) == objC) {
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
            return ((q) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    @Override // F2.E
    public void a(String str, long j4, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        AbstractC1008h.b(null, new p(str, this, j4, null), 1, null);
    }

    @Override // F2.E
    public void b(List list, H h4) {
        X2.l.e(h4, "options");
        AbstractC1008h.b(null, new a(list, null), 1, null);
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        X2.l.e(bVar, "binding");
        InterfaceC1609b interfaceC1609bB = bVar.b();
        X2.l.d(interfaceC1609bB, "getBinaryMessenger(...)");
        Context contextA = bVar.a();
        X2.l.d(contextA, "getApplicationContext(...)");
        z(interfaceC1609bB, contextA);
        new C0275a().c(bVar);
    }

    @Override // F2.E
    public M d(String str, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        String strH = h(str, h4);
        if (strH != null) {
            return f3.p.t(strH, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null) ? new M(strH, K.f1614p) : f3.p.t(strH, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null) ? new M(null, K.f1613o) : new M(null, K.f1615q);
        }
        return null;
    }

    @Override // F2.E
    public Map e(List list, H h4) {
        X2.l.e(h4, "options");
        return (Map) AbstractC1008h.b(null, new c(list, null), 1, null);
    }

    @Override // F2.E
    public void f(String str, List list, H h4) {
        X2.l.e(str, "key");
        X2.l.e(list, "value");
        X2.l.e(h4, "options");
        AbstractC1008h.b(null, new m(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f1487e.a(list), null), 1, null);
    }

    @Override // F2.E
    public List g(String str, H h4) {
        List list;
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        String strH = h(str, h4);
        ArrayList arrayList = null;
        if (strH != null && !f3.p.t(strH, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu!", false, 2, null) && f3.p.t(strH, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu", false, 2, null) && (list = (List) J.d(strH, this.f1487e)) != null) {
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof String) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    @Override // F2.E
    public String h(String str, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        X2.y yVar = new X2.y();
        AbstractC1008h.b(null, new i(str, this, yVar, null), 1, null);
        return (String) yVar.f3992m;
    }

    @Override // F2.E
    public Boolean i(String str, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        X2.y yVar = new X2.y();
        AbstractC1008h.b(null, new d(str, this, yVar, null), 1, null);
        return (Boolean) yVar.f3992m;
    }

    @Override // F2.E
    public void j(String str, String str2, H h4) {
        X2.l.e(str, "key");
        X2.l.e(str2, "value");
        X2.l.e(h4, "options");
        AbstractC1008h.b(null, new o(str, str2, null), 1, null);
    }

    @Override // F2.E
    public void k(String str, double d4, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        AbstractC1008h.b(null, new n(str, this, d4, null), 1, null);
    }

    @Override // F2.E
    public void l(String str, boolean z3, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        AbstractC1008h.b(null, new l(str, this, z3, null), 1, null);
    }

    @Override // F2.E
    public Double m(String str, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        X2.y yVar = new X2.y();
        AbstractC1008h.b(null, new e(str, this, yVar, null), 1, null);
        return (Double) yVar.f3992m;
    }

    @Override // F2.E
    public void n(String str, String str2, H h4) {
        X2.l.e(str, "key");
        X2.l.e(str2, "value");
        X2.l.e(h4, "options");
        AbstractC1008h.b(null, new q(str, str2, null), 1, null);
    }

    @Override // F2.E
    public Long o(String str, H h4) {
        X2.l.e(str, "key");
        X2.l.e(h4, "options");
        X2.y yVar = new X2.y();
        AbstractC1008h.b(null, new f(str, this, yVar, null), 1, null);
        return (Long) yVar.f3992m;
    }

    @Override // F2.E
    public List p(List list, H h4) {
        X2.l.e(h4, "options");
        return L2.u.F(((Map) AbstractC1008h.b(null, new g(list, null), 1, null)).keySet());
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        X2.l.e(bVar, "binding");
        E.a aVar = E.f1476b;
        InterfaceC1609b interfaceC1609bB = bVar.b();
        X2.l.d(interfaceC1609bB, "getBinaryMessenger(...)");
        aVar.s(interfaceC1609bB, null, "data_store");
        F f4 = this.f1486d;
        if (f4 != null) {
            f4.q();
        }
        this.f1486d = null;
    }

    public final Object v(String str, String str2, N2.e eVar) {
        f.a aVarG = P.h.g(str);
        Context context = this.f1485c;
        if (context == null) {
            X2.l.o("context");
            context = null;
        }
        Object objA = P.i.a(J.b(context), new b(aVarG, str2, null), eVar);
        return objA == O2.c.c() ? objA : K2.p.f2516a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:33:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(java.util.List r9, N2.e r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof F2.I.h
            if (r0 == 0) goto L13
            r0 = r10
            F2.I$h r0 = (F2.I.h) r0
            int r1 = r0.f1549w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1549w = r1
            goto L18
        L13:
            F2.I$h r0 = new F2.I$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f1547u
            java.lang.Object r1 = O2.c.c()
            int r2 = r0.f1549w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L59
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r9 = r0.f1546t
            P.f$a r9 = (P.f.a) r9
            java.lang.Object r2 = r0.f1545s
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f1544r
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f1543q
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.f1542p
            F2.I r6 = (F2.I) r6
            K2.k.b(r10)
            goto La6
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L49:
            java.lang.Object r9 = r0.f1544r
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.f1543q
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.f1542p
            F2.I r4 = (F2.I) r4
            K2.k.b(r10)
            goto L7b
        L59:
            K2.k.b(r10)
            if (r9 == 0) goto L64
            java.util.Set r9 = L2.u.I(r9)
        L62:
            r2 = r9
            goto L66
        L64:
            r9 = 0
            goto L62
        L66:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r0.f1542p = r8
            r0.f1543q = r2
            r0.f1544r = r9
            r0.f1549w = r4
            java.lang.Object r10 = r8.y(r0)
            if (r10 != r1) goto L7a
            goto La5
        L7a:
            r4 = r8
        L7b:
            java.util.Set r10 = (java.util.Set) r10
            if (r10 == 0) goto Lc1
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r6 = r4
            r4 = r9
            r2 = r10
        L87:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lc0
            java.lang.Object r9 = r2.next()
            P.f$a r9 = (P.f.a) r9
            r0.f1542p = r6
            r0.f1543q = r5
            r0.f1544r = r4
            r0.f1545s = r2
            r0.f1546t = r9
            r0.f1549w = r3
            java.lang.Object r10 = r6.x(r9, r0)
            if (r10 != r1) goto La6
        La5:
            return r1
        La6:
            java.lang.String r7 = r9.toString()
            boolean r7 = F2.J.c(r7, r10, r5)
            if (r7 == 0) goto L87
            F2.G r7 = r6.f1487e
            java.lang.Object r10 = F2.J.d(r10, r7)
            if (r10 == 0) goto L87
            java.lang.String r9 = r9.toString()
            r4.put(r9, r10)
            goto L87
        Lc0:
            return r4
        Lc1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: F2.I.w(java.util.List, N2.e):java.lang.Object");
    }

    public final Object x(f.a aVar, N2.e eVar) {
        Context context = this.f1485c;
        if (context == null) {
            X2.l.o("context");
            context = null;
        }
        return k3.f.l(new j(J.b(context).getData(), aVar), eVar);
    }

    public final Object y(N2.e eVar) {
        Context context = this.f1485c;
        if (context == null) {
            X2.l.o("context");
            context = null;
        }
        return k3.f.l(new k(J.b(context).getData()), eVar);
    }

    public final void z(InterfaceC1609b interfaceC1609b, Context context) {
        this.f1485c = context;
        try {
            E.f1476b.s(interfaceC1609b, this, "data_store");
            this.f1486d = new F(interfaceC1609b, context, this.f1487e);
        } catch (Exception e4) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e4);
        }
    }
}
