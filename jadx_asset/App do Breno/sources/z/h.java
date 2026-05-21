package z;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f12072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12073b;

        /* JADX INFO: renamed from: z.h$a$a, reason: collision with other inner class name */
        public static class C0192a extends Thread {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final int f12074m;

            public C0192a(Runnable runnable, String str, int i4) {
                super(runnable, str);
                this.f12074m = i4;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f12074m);
                super.run();
            }
        }

        public a(String str, int i4) {
            this.f12072a = str;
            this.f12073b = i4;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0192a(runnable, this.f12072a, this.f12073b);
        }
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Callable f12075m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public B.a f12076n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Handler f12077o;

        public class a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ B.a f12078m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Object f12079n;

            public a(B.a aVar, Object obj) {
                this.f12078m = aVar;
                this.f12079n = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f12078m.accept(this.f12079n);
            }
        }

        public b(Handler handler, Callable callable, B.a aVar) {
            this.f12075m = callable;
            this.f12076n = aVar;
            this.f12077o = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object objCall;
            try {
                objCall = this.f12075m.call();
            } catch (Exception unused) {
                objCall = null;
            }
            this.f12077o.post(new a(this.f12076n, objCall));
        }
    }

    public static ThreadPoolExecutor a(String str, int i4, int i5) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i5, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i4));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, B.a aVar) {
        executor.execute(new b(AbstractC1659b.a(), callable, aVar));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i4) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i4, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            throw e4;
        } catch (ExecutionException e5) {
            throw new RuntimeException(e5);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
