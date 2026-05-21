package k1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class P4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9195n;

    public P4(C1238j5 c1238j5, AtomicReference atomicReference) {
        this.f9194m = atomicReference;
        this.f9195n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f9194m;
        synchronized (atomicReference) {
            try {
                try {
                    C1238j5 c1238j5 = this.f9195n;
                    atomicReference.set(Boolean.valueOf(c1238j5.f9366a.B().P(c1238j5.f9366a.D().t(), AbstractC1291q2.f9723a0)));
                } finally {
                    this.f9194m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
