package e3;

import X2.l;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f7190a;

    public a(b bVar) {
        l.e(bVar, "sequence");
        this.f7190a = new AtomicReference(bVar);
    }

    @Override // e3.b
    public Iterator iterator() {
        b bVar = (b) this.f7190a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
