package h3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: h3.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1023o0 extends s0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7553r = AtomicIntegerFieldUpdater.newUpdater(C1023o0.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final W2.l f7554q;

    public C1023o0(W2.l lVar) {
        this.f7554q = lVar;
    }

    @Override // W2.l
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        z((Throwable) obj);
        return K2.p.f2516a;
    }

    @Override // h3.B
    public void z(Throwable th) {
        if (f7553r.compareAndSet(this, 0, 1)) {
            this.f7554q.k(th);
        }
    }
}
