package k1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k1.a5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1160a5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9355n;

    public RunnableC1160a5(C1238j5 c1238j5, AtomicReference atomicReference) {
        this.f9354m = atomicReference;
        this.f9355n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f9354m;
        synchronized (atomicReference) {
            try {
                try {
                    C1238j5 c1238j5 = this.f9355n;
                    atomicReference.set(Integer.valueOf(c1238j5.f9366a.B().z(c1238j5.f9366a.D().t(), AbstractC1291q2.f9732d0)));
                } finally {
                    this.f9354m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
