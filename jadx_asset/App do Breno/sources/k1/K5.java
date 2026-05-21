package k1;

import com.google.android.gms.measurement.internal.zzgq;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class K5 extends zzgq {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9119l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9120m;

    public K5(C1263m6 c1263m6, AtomicReference atomicReference) {
        this.f9119l = atomicReference;
        this.f9120m = c1263m6;
    }

    @Override // k1.InterfaceC1338w2
    public final void b0(U6 u6) {
        AtomicReference atomicReference = this.f9119l;
        synchronized (atomicReference) {
            this.f9120m.f9366a.c().v().b("[sgtm] Got upload batches from service. count", Integer.valueOf(u6.f9258m.size()));
            atomicReference.set(u6);
            atomicReference.notifyAll();
        }
    }
}
