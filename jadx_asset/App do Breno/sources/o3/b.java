package o3;

import h3.AbstractC1007g0;
import h3.F;
import java.util.concurrent.Executor;
import m3.G;
import m3.I;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC1007g0 implements Executor {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final b f10827p = new b();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final F f10828q = m.f10848o.T(I.e("kotlinx.coroutines.io.parallelism", c3.e.a(64, G.a()), 0, 0, 12, null));

    @Override // h3.F
    public void R(N2.i iVar, Runnable runnable) {
        f10828q.R(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        R(N2.j.f2823m, runnable);
    }

    @Override // h3.F
    public String toString() {
        return "Dispatchers.IO";
    }
}
