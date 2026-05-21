package m3;

import java.util.Collection;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: m3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1422g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection f10538a = e3.g.c(e3.e.a(ServiceLoader.load(h3.G.class, h3.G.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f10538a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
