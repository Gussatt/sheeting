package n1;

import android.os.Handler;
import android.os.Looper;
import h1.HandlerC0991a;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class N implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f10648m = new HandlerC0991a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f10648m.post(runnable);
    }
}
