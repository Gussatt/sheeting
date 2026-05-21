package k1;

import com.google.android.gms.measurement.internal.zzgn;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class J5 extends zzgn {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9099l;

    public J5(C1263m6 c1263m6, AtomicReference atomicReference) {
        this.f9099l = atomicReference;
    }

    @Override // k1.InterfaceC1322u2
    public final void I0(List list) {
        AtomicReference atomicReference = this.f9099l;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
