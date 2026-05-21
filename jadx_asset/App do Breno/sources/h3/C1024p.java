package h3;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: h3.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1024p extends C1035z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7555c = AtomicIntegerFieldUpdater.newUpdater(C1024p.class, "_resumed");
    private volatile int _resumed;

    public C1024p(N2.e eVar, Throwable th, boolean z3) {
        if (th == null) {
            th = new CancellationException("Continuation " + eVar + " was cancelled normally");
        }
        super(th, z3);
        this._resumed = 0;
    }

    public final boolean c() {
        return f7555c.compareAndSet(this, 0, 1);
    }
}
