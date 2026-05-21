package C1;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import z1.InterfaceC1662a;

/* JADX INFO: loaded from: classes.dex */
public class H implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K1.j f542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1662a f544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f545e = new AtomicBoolean(false);

    public interface a {
        void a(K1.j jVar, Thread thread, Throwable th);
    }

    public H(a aVar, K1.j jVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, InterfaceC1662a interfaceC1662a) {
        this.f541a = aVar;
        this.f542b = jVar;
        this.f543c = uncaughtExceptionHandler;
        this.f544d = interfaceC1662a;
    }

    public boolean a() {
        return this.f545e.get();
    }

    public final boolean b(Thread thread, Throwable th) {
        if (thread == null) {
            z1.g.f().d("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            z1.g.f().d("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.f544d.b()) {
            return true;
        }
        z1.g.f().b("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f545e.set(true);
        try {
            try {
                if (b(thread, th)) {
                    this.f541a.a(this.f542b, thread, th);
                } else {
                    z1.g.f().b("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f543c != null) {
                    z1.g.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f543c.uncaughtException(thread, th);
                } else {
                    z1.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                this.f545e.set(false);
            } catch (Exception e4) {
                z1.g.f().e("An error occurred in the uncaught exception handler", e4);
                if (this.f543c != null) {
                    z1.g.f().b("Completed exception processing. Invoking default exception handler.");
                    this.f543c.uncaughtException(thread, th);
                } else {
                    z1.g.f().b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                this.f545e.set(false);
            }
        } catch (Throwable th2) {
            if (this.f543c != null) {
                z1.g.f().b("Completed exception processing. Invoking default exception handler.");
                this.f543c.uncaughtException(thread, th);
            } else {
                z1.g.f().b("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f545e.set(false);
            throw th2;
        }
    }
}
