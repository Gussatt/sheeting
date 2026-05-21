package l;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: l.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1378d extends AbstractC1379e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10152a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExecutorService f10153b = Executors.newFixedThreadPool(4, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Handler f10154c;

    /* JADX INFO: renamed from: l.d$a */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicInteger f10155a = new AtomicInteger(0);

        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f10155a.getAndIncrement());
            return thread;
        }
    }

    /* JADX INFO: renamed from: l.d$b */
    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static Handler d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // l.AbstractC1379e
    public void a(Runnable runnable) {
        this.f10153b.execute(runnable);
    }

    @Override // l.AbstractC1379e
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // l.AbstractC1379e
    public void c(Runnable runnable) {
        if (this.f10154c == null) {
            synchronized (this.f10152a) {
                try {
                    if (this.f10154c == null) {
                        this.f10154c = d(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f10154c.post(runnable);
    }
}
