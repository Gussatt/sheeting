package l;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1377c extends AbstractC1379e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile C1377c f10147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Executor f10148d = new Executor() { // from class: l.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C1377c.f().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Executor f10149e = new Executor() { // from class: l.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            C1377c.f().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1379e f10150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1379e f10151b;

    public C1377c() {
        C1378d c1378d = new C1378d();
        this.f10151b = c1378d;
        this.f10150a = c1378d;
    }

    public static C1377c f() {
        if (f10147c != null) {
            return f10147c;
        }
        synchronized (C1377c.class) {
            try {
                if (f10147c == null) {
                    f10147c = new C1377c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f10147c;
    }

    @Override // l.AbstractC1379e
    public void a(Runnable runnable) {
        this.f10150a.a(runnable);
    }

    @Override // l.AbstractC1379e
    public boolean b() {
        return this.f10150a.b();
    }

    @Override // l.AbstractC1379e
    public void c(Runnable runnable) {
        this.f10150a.c(runnable);
    }
}
