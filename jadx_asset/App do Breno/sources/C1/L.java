package C1;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f561b;

        /* JADX INFO: renamed from: C1.L$a$a, reason: collision with other inner class name */
        public class C0007a extends AbstractRunnableC0247e {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Runnable f562m;

            public C0007a(Runnable runnable) {
                this.f562m = runnable;
            }

            @Override // C1.AbstractRunnableC0247e
            public void a() {
                this.f562m.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.f560a = str;
            this.f561b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0007a(runnable));
            threadNewThread.setName(this.f560a + this.f561b.getAndIncrement());
            return threadNewThread;
        }
    }

    public class b extends AbstractRunnableC0247e {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f564m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ExecutorService f565n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f566o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f567p;

        public b(String str, ExecutorService executorService, long j4, TimeUnit timeUnit) {
            this.f564m = str;
            this.f565n = executorService;
            this.f566o = j4;
            this.f567p = timeUnit;
        }

        @Override // C1.AbstractRunnableC0247e
        public void a() {
            try {
                z1.g.f().b("Executing shutdown hook for " + this.f564m);
                this.f565n.shutdown();
                if (this.f565n.awaitTermination(this.f566o, this.f567p)) {
                    return;
                }
                z1.g.f().b(this.f564m + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f565n.shutdownNow();
            } catch (InterruptedException unused) {
                z1.g.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f564m));
                this.f565n.shutdownNow();
            }
        }
    }

    public static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static void b(String str, ExecutorService executorService, long j4, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j4, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    public static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
