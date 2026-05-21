package a0;

import P2.k;
import W2.p;
import X2.g;
import X2.l;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import b0.AbstractC0618a;
import b0.AbstractC0619b;
import b0.AbstractC0630m;
import b0.AbstractC0631n;
import b0.AbstractC0632o;
import h3.AbstractC1010i;
import h3.I;
import h3.J;
import h3.W;
import q1.InterfaceFutureC1495d;

/* JADX INFO: renamed from: a0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0573a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4022a = new b(null);

    /* JADX INFO: renamed from: a0.a$a, reason: collision with other inner class name */
    public static final class C0084a extends AbstractC0573a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AbstractC0619b f4023b;

        /* JADX INFO: renamed from: a0.a$a$a, reason: collision with other inner class name */
        public static final class C0085a extends k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f4024q;

            public C0085a(AbstractC0618a abstractC0618a, N2.e eVar) {
                super(2, eVar);
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                return C0084a.this.new C0085a(null, eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                Object objC = O2.c.c();
                int i4 = this.f4024q;
                if (i4 == 0) {
                    K2.k.b(obj);
                    AbstractC0619b abstractC0619b = C0084a.this.f4023b;
                    this.f4024q = 1;
                    if (abstractC0619b.a(null, this) == objC) {
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
            public final Object j(I i4, N2.e eVar) {
                return ((C0085a) m(i4, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX INFO: renamed from: a0.a$a$b */
        public static final class b extends k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f4026q;

            public b(N2.e eVar) {
                super(2, eVar);
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                return C0084a.this.new b(eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                Object objC = O2.c.c();
                int i4 = this.f4026q;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    K2.k.b(obj);
                    return obj;
                }
                K2.k.b(obj);
                AbstractC0619b abstractC0619b = C0084a.this.f4023b;
                this.f4026q = 1;
                Object objB = abstractC0619b.b(this);
                return objB == objC ? objC : objB;
            }

            @Override // W2.p
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object j(I i4, N2.e eVar) {
                return ((b) m(i4, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX INFO: renamed from: a0.a$a$c */
        public static final class c extends k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f4028q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Uri f4030s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ InputEvent f4031t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Uri uri, InputEvent inputEvent, N2.e eVar) {
                super(2, eVar);
                this.f4030s = uri;
                this.f4031t = inputEvent;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                return C0084a.this.new c(this.f4030s, this.f4031t, eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                Object objC = O2.c.c();
                int i4 = this.f4028q;
                if (i4 == 0) {
                    K2.k.b(obj);
                    AbstractC0619b abstractC0619b = C0084a.this.f4023b;
                    Uri uri = this.f4030s;
                    InputEvent inputEvent = this.f4031t;
                    this.f4028q = 1;
                    if (abstractC0619b.c(uri, inputEvent, this) == objC) {
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
            public final Object j(I i4, N2.e eVar) {
                return ((c) m(i4, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX INFO: renamed from: a0.a$a$d */
        public static final class d extends k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f4032q;

            public d(AbstractC0630m abstractC0630m, N2.e eVar) {
                super(2, eVar);
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                return C0084a.this.new d(null, eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                Object objC = O2.c.c();
                int i4 = this.f4032q;
                if (i4 == 0) {
                    K2.k.b(obj);
                    AbstractC0619b abstractC0619b = C0084a.this.f4023b;
                    this.f4032q = 1;
                    if (abstractC0619b.d(null, this) == objC) {
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
            public final Object j(I i4, N2.e eVar) {
                return ((d) m(i4, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX INFO: renamed from: a0.a$a$e */
        public static final class e extends k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f4034q;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ Uri f4036s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Uri uri, N2.e eVar) {
                super(2, eVar);
                this.f4036s = uri;
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                return C0084a.this.new e(this.f4036s, eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                Object objC = O2.c.c();
                int i4 = this.f4034q;
                if (i4 == 0) {
                    K2.k.b(obj);
                    AbstractC0619b abstractC0619b = C0084a.this.f4023b;
                    Uri uri = this.f4036s;
                    this.f4034q = 1;
                    if (abstractC0619b.e(uri, this) == objC) {
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
            public final Object j(I i4, N2.e eVar) {
                return ((e) m(i4, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX INFO: renamed from: a0.a$a$f */
        public static final class f extends k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f4037q;

            public f(AbstractC0631n abstractC0631n, N2.e eVar) {
                super(2, eVar);
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                return C0084a.this.new f(null, eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                Object objC = O2.c.c();
                int i4 = this.f4037q;
                if (i4 == 0) {
                    K2.k.b(obj);
                    AbstractC0619b abstractC0619b = C0084a.this.f4023b;
                    this.f4037q = 1;
                    if (abstractC0619b.f(null, this) == objC) {
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
            public final Object j(I i4, N2.e eVar) {
                return ((f) m(i4, eVar)).q(K2.p.f2516a);
            }
        }

        /* JADX INFO: renamed from: a0.a$a$g */
        public static final class g extends k implements p {

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public int f4039q;

            public g(AbstractC0632o abstractC0632o, N2.e eVar) {
                super(2, eVar);
            }

            @Override // P2.a
            public final N2.e m(Object obj, N2.e eVar) {
                return C0084a.this.new g(null, eVar);
            }

            @Override // P2.a
            public final Object q(Object obj) throws Throwable {
                Object objC = O2.c.c();
                int i4 = this.f4039q;
                if (i4 == 0) {
                    K2.k.b(obj);
                    AbstractC0619b abstractC0619b = C0084a.this.f4023b;
                    this.f4039q = 1;
                    if (abstractC0619b.g(null, this) == objC) {
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
            public final Object j(I i4, N2.e eVar) {
                return ((g) m(i4, eVar)).q(K2.p.f2516a);
            }
        }

        public C0084a(AbstractC0619b abstractC0619b) {
            l.e(abstractC0619b, "mMeasurementManager");
            this.f4023b = abstractC0619b;
        }

        @Override // a0.AbstractC0573a
        public InterfaceFutureC1495d b() {
            return Z.b.c(AbstractC1010i.b(J.a(W.a()), null, null, new b(null), 3, null), null, 1, null);
        }

        @Override // a0.AbstractC0573a
        public InterfaceFutureC1495d c(Uri uri) {
            l.e(uri, "trigger");
            return Z.b.c(AbstractC1010i.b(J.a(W.a()), null, null, new e(uri, null), 3, null), null, 1, null);
        }

        public InterfaceFutureC1495d e(AbstractC0618a abstractC0618a) {
            l.e(abstractC0618a, "deletionRequest");
            return Z.b.c(AbstractC1010i.b(J.a(W.a()), null, null, new C0085a(abstractC0618a, null), 3, null), null, 1, null);
        }

        public InterfaceFutureC1495d f(Uri uri, InputEvent inputEvent) {
            l.e(uri, "attributionSource");
            return Z.b.c(AbstractC1010i.b(J.a(W.a()), null, null, new c(uri, inputEvent, null), 3, null), null, 1, null);
        }

        public InterfaceFutureC1495d g(AbstractC0630m abstractC0630m) {
            l.e(abstractC0630m, "request");
            return Z.b.c(AbstractC1010i.b(J.a(W.a()), null, null, new d(abstractC0630m, null), 3, null), null, 1, null);
        }

        public InterfaceFutureC1495d h(AbstractC0631n abstractC0631n) {
            l.e(abstractC0631n, "request");
            return Z.b.c(AbstractC1010i.b(J.a(W.a()), null, null, new f(abstractC0631n, null), 3, null), null, 1, null);
        }

        public InterfaceFutureC1495d i(AbstractC0632o abstractC0632o) {
            l.e(abstractC0632o, "request");
            return Z.b.c(AbstractC1010i.b(J.a(W.a()), null, null, new g(abstractC0632o, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: a0.a$b */
    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final AbstractC0573a a(Context context) {
            l.e(context, "context");
            AbstractC0619b abstractC0619bA = AbstractC0619b.f5538a.a(context);
            if (abstractC0619bA != null) {
                return new C0084a(abstractC0619bA);
            }
            return null;
        }

        public b() {
        }
    }

    public static final AbstractC0573a a(Context context) {
        return f4022a.a(context);
    }

    public abstract InterfaceFutureC1495d b();

    public abstract InterfaceFutureC1495d c(Uri uri);
}
