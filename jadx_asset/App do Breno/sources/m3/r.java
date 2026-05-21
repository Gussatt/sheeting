package m3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q.AbstractC1489b;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10561a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    private volatile Object _cur;

    public r(boolean z3) {
        this._cur = new s(8, z3);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10561a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int iA = sVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                AbstractC1489b.a(f10561a, this, sVar, sVar.i());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10561a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.d()) {
                return;
            } else {
                AbstractC1489b.a(f10561a, this, sVar, sVar.i());
            }
        }
    }

    public final int c() {
        return ((s) f10561a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10561a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object objJ = sVar.j();
            if (objJ != s.f10565h) {
                return objJ;
            }
            AbstractC1489b.a(f10561a, this, sVar, sVar.i());
        }
    }
}
