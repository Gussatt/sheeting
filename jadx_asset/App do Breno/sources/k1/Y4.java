package k1;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class Y4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9306n;

    public Y4(C1238j5 c1238j5, AtomicReference atomicReference) {
        this.f9305m = atomicReference;
        this.f9306n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f9305m;
        synchronized (atomicReference) {
            try {
                try {
                    C1238j5 c1238j5 = this.f9306n;
                    atomicReference.set(c1238j5.f9366a.B().J(c1238j5.f9366a.D().t(), AbstractC1291q2.f9726b0));
                } finally {
                    this.f9305m.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
