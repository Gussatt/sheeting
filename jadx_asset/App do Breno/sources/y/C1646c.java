package y;

import K2.j;
import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: y.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1646c extends AtomicBoolean implements OutcomeReceiver {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N2.e f11987m;

    public C1646c(N2.e eVar) {
        super(false);
        this.f11987m = eVar;
    }

    public void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            N2.e eVar = this.f11987m;
            j.a aVar = K2.j.f2509n;
            eVar.p(K2.j.b(K2.k.a(th)));
        }
    }

    public void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f11987m.p(K2.j.b(obj));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
