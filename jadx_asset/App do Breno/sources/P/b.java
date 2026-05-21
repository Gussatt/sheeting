package P;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f2876a;

    public b(boolean z3) {
        this.f2876a = new AtomicBoolean(z3);
    }

    public final boolean a() {
        return this.f2876a.get();
    }

    public final void b(boolean z3) {
        this.f2876a.set(z3);
    }
}
