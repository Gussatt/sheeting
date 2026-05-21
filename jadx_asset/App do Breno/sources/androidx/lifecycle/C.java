package androidx.lifecycle;

import V.a;

/* JADX INFO: loaded from: classes.dex */
public class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f4948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f4949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V.a f4950c;

    public static class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0092a f4951d = new C0092a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a.b f4952e = C0092a.C0093a.f4953a;

        /* JADX INFO: renamed from: androidx.lifecycle.C$a$a, reason: collision with other inner class name */
        public static final class C0092a {

            /* JADX INFO: renamed from: androidx.lifecycle.C$a$a$a, reason: collision with other inner class name */
            public static final class C0093a implements a.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0093a f4953a = new C0093a();
            }

            public /* synthetic */ C0092a(X2.g gVar) {
                this();
            }

            public C0092a() {
            }
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4954a = a.f4955a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f4955a = new a();
        }

        default B a(Class cls) {
            X2.l.e(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default B b(Class cls, V.a aVar) {
            X2.l.e(cls, "modelClass");
            X2.l.e(aVar, "extras");
            return a(cls);
        }
    }

    public static class c implements b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f4956b = new a(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a.b f4957c = a.C0094a.f4958a;

        public static final class a {

            /* JADX INFO: renamed from: androidx.lifecycle.C$c$a$a, reason: collision with other inner class name */
            public static final class C0094a implements a.b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C0094a f4958a = new C0094a();
            }

            public /* synthetic */ a(X2.g gVar) {
                this();
            }

            public a() {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C(E e4, b bVar) {
        this(e4, bVar, null, 4, null);
        X2.l.e(e4, "store");
        X2.l.e(bVar, "factory");
    }

    public B a(Class cls) {
        X2.l.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public B b(String str, Class cls) {
        B bA;
        X2.l.e(str, "key");
        X2.l.e(cls, "modelClass");
        B b4 = this.f4948a.b(str);
        if (cls.isInstance(b4)) {
            X2.l.c(b4, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b4;
        }
        V.b bVar = new V.b(this.f4950c);
        bVar.b(c.f4957c, str);
        try {
            bA = this.f4949b.b(cls, bVar);
        } catch (AbstractMethodError unused) {
            bA = this.f4949b.a(cls);
        }
        this.f4948a.c(str, bA);
        return bA;
    }

    public C(E e4, b bVar, V.a aVar) {
        X2.l.e(e4, "store");
        X2.l.e(bVar, "factory");
        X2.l.e(aVar, "defaultCreationExtras");
        this.f4948a = e4;
        this.f4949b = bVar;
        this.f4950c = aVar;
    }

    public /* synthetic */ C(E e4, b bVar, V.a aVar, int i4, X2.g gVar) {
        this(e4, bVar, (i4 & 4) != 0 ? a.C0077a.f3617b : aVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C(F f4, b bVar) {
        this(f4.c(), bVar, D.a(f4));
        X2.l.e(f4, "owner");
        X2.l.e(bVar, "factory");
    }
}
