package N;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f2767a;

    public a(boolean z3) {
        this.f2767a = new AtomicBoolean(z3);
    }

    public final boolean a() {
        return this.f2767a.get();
    }

    public final void b(boolean z3) {
        this.f2767a.set(z3);
    }
}
