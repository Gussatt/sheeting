package l2;

import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p2.InterfaceC1487a;
import q2.d;

/* JADX INFO: renamed from: l2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1387a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C1387a f10253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f10254e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f10255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FlutterJNI.c f10256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ExecutorService f10257c;

    /* JADX INFO: renamed from: l2.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f10258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public FlutterJNI.c f10259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ExecutorService f10260c;

        /* JADX INFO: renamed from: l2.a$b$a, reason: collision with other inner class name */
        public class ThreadFactoryC0138a implements ThreadFactory {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f10261a;

            public ThreadFactoryC0138a() {
                this.f10261a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i4 = this.f10261a;
                this.f10261a = i4 + 1;
                sb.append(i4);
                thread.setName(sb.toString());
                return thread;
            }
        }

        public C1387a a() {
            b();
            return new C1387a(this.f10258a, null, this.f10259b, this.f10260c);
        }

        public final void b() {
            if (this.f10259b == null) {
                this.f10259b = new FlutterJNI.c();
            }
            if (this.f10260c == null) {
                this.f10260c = Executors.newCachedThreadPool(new ThreadFactoryC0138a());
            }
            if (this.f10258a == null) {
                this.f10258a = new d(this.f10259b.a(), this.f10260c);
            }
        }
    }

    public static C1387a e() {
        f10254e = true;
        if (f10253d == null) {
            f10253d = new b().a();
        }
        return f10253d;
    }

    public InterfaceC1487a a() {
        return null;
    }

    public ExecutorService b() {
        return this.f10257c;
    }

    public d c() {
        return this.f10255a;
    }

    public FlutterJNI.c d() {
        return this.f10256b;
    }

    public C1387a(d dVar, InterfaceC1487a interfaceC1487a, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f10255a = dVar;
        this.f10256b = cVar;
        this.f10257c = executorService;
    }
}
