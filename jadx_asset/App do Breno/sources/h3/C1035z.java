package h3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: h3.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1035z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f7589b = AtomicIntegerFieldUpdater.newUpdater(C1035z.class, "_handled");
    private volatile int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f7590a;

    public C1035z(Throwable th, boolean z3) {
        this.f7590a = th;
        this._handled = z3 ? 1 : 0;
    }

    public final boolean a() {
        return f7589b.get(this) != 0;
    }

    public final boolean b() {
        return f7589b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return M.a(this) + '[' + this.f7590a + ']';
    }

    public /* synthetic */ C1035z(Throwable th, boolean z3, int i4, X2.g gVar) {
        this(th, (i4 & 2) != 0 ? false : z3);
    }
}
