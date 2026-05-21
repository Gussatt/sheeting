package x1;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: x1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ThreadFactoryC1635b implements ThreadFactory {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f11932e = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f11933a = new AtomicLong();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f11936d;

    public ThreadFactoryC1635b(String str, int i4, StrictMode.ThreadPolicy threadPolicy) {
        this.f11934b = str;
        this.f11935c = i4;
        this.f11936d = threadPolicy;
    }

    public static /* synthetic */ void a(ThreadFactoryC1635b threadFactoryC1635b, Runnable runnable) {
        Process.setThreadPriority(threadFactoryC1635b.f11935c);
        StrictMode.ThreadPolicy threadPolicy = threadFactoryC1635b.f11936d;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f11932e.newThread(new Runnable() { // from class: x1.a
            @Override // java.lang.Runnable
            public final void run() {
                ThreadFactoryC1635b.a(this.f11930m, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f11934b, Long.valueOf(this.f11933a.getAndIncrement())));
        return threadNewThread;
    }
}
