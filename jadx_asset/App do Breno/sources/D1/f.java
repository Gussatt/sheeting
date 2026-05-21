package D1;

import X2.g;
import X2.j;
import X2.l;
import X2.m;
import android.os.Looper;
import f3.q;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f875e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f876f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f880d;

    public static final class a {

        /* JADX INFO: renamed from: D1.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0011a extends j implements W2.a {
            public C0011a(Object obj) {
                super(0, obj, a.class, "isBackgroundThread", "isBackgroundThread()Z", 0);
            }

            @Override // W2.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Boolean e() {
                return Boolean.valueOf(((a) this.f3969n).k());
            }
        }

        public static final class b extends m implements W2.a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final b f881n = new b();

            public b() {
                super(0);
            }

            @Override // W2.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String e() {
                return "Must be called on a background thread, was called on " + f.f875e.j() + '.';
            }
        }

        public /* synthetic */ class c extends j implements W2.a {
            public c(Object obj) {
                super(0, obj, a.class, "isBlockingThread", "isBlockingThread()Z", 0);
            }

            @Override // W2.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Boolean e() {
                return Boolean.valueOf(((a) this.f3969n).l());
            }
        }

        public static final class d extends m implements W2.a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final d f882n = new d();

            public d() {
                super(0);
            }

            @Override // W2.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String e() {
                return "Must be called on a blocking thread, was called on " + f.f875e.j() + '.';
            }
        }

        public /* synthetic */ class e extends j implements W2.a {
            public e(Object obj) {
                super(0, obj, a.class, "isNotMainThread", "isNotMainThread()Z", 0);
            }

            @Override // W2.a
            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public final Boolean e() {
                return Boolean.valueOf(((a) this.f3969n).m());
            }
        }

        /* JADX INFO: renamed from: D1.f$a$f, reason: collision with other inner class name */
        public static final class C0012f extends m implements W2.a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0012f f883n = new C0012f();

            public C0012f() {
                super(0);
            }

            @Override // W2.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String e() {
                return "Must not be called on a main thread, was called on " + f.f875e.j() + '.';
            }
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final void e() {
            h(new C0011a(this), b.f881n);
        }

        public final void f() {
            h(new c(this), d.f882n);
        }

        public final void g() {
            h(new e(this), C0012f.f883n);
        }

        public final void h(W2.a aVar, W2.a aVar2) {
            if (((Boolean) aVar.e()).booleanValue()) {
                return;
            }
            z1.g.f().b((String) aVar2.e());
            i();
        }

        public final boolean i() {
            return f.f876f;
        }

        public final String j() {
            return Thread.currentThread().getName();
        }

        public final boolean k() {
            String strJ = j();
            l.d(strJ, "threadName");
            return q.x(strJ, "Firebase Background Thread #", false, 2, null);
        }

        public final boolean l() {
            String strJ = j();
            l.d(strJ, "threadName");
            return q.x(strJ, "Firebase Blocking Thread #", false, 2, null);
        }

        public final boolean m() {
            return !Looper.getMainLooper().isCurrentThread();
        }

        public final void n(boolean z3) {
            f.f876f = z3;
        }

        public a() {
        }
    }

    public f(ExecutorService executorService, ExecutorService executorService2) {
        l.e(executorService, "backgroundExecutorService");
        l.e(executorService2, "blockingExecutorService");
        this.f877a = new e(executorService);
        this.f878b = new e(executorService);
        this.f879c = new e(executorService);
        this.f880d = new e(executorService2);
    }

    public static final void c() {
        f875e.e();
    }

    public static final void d() {
        f875e.f();
    }

    public static final void e() {
        f875e.g();
    }

    public static final void f(boolean z3) {
        f875e.n(z3);
    }
}
