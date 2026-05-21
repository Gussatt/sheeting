package k1;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class F4 implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9031m;

    public F4(C1238j5 c1238j5) {
        this.f9031m = c1238j5;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9031m.f9366a.e().A(runnable);
    }
}
