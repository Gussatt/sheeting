package k1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k1.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1169b5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9367m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9368n;

    public RunnableC1169b5(C1238j5 c1238j5, AtomicReference atomicReference) {
        this.f9367m = atomicReference;
        this.f9368n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f9367m;
        synchronized (atomicReference) {
            try {
                try {
                    C1238j5 c1238j5 = this.f9368n;
                    atomicReference.set(Double.valueOf(c1238j5.f9366a.B().t(c1238j5.f9366a.D().t(), AbstractC1291q2.f9735e0)));
                } finally {
                    this.f9367m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
