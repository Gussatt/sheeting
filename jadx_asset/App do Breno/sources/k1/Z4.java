package k1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class Z4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9339n;

    public Z4(C1238j5 c1238j5, AtomicReference atomicReference) {
        this.f9338m = atomicReference;
        this.f9339n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f9338m;
        synchronized (atomicReference) {
            try {
                try {
                    C1238j5 c1238j5 = this.f9339n;
                    atomicReference.set(Long.valueOf(c1238j5.f9366a.B().C(c1238j5.f9366a.D().t(), AbstractC1291q2.f9729c0)));
                } finally {
                    this.f9338m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
