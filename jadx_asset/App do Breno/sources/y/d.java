package y;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static class a implements Executor {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Handler f11988m;

        public a(Handler handler) {
            this.f11988m = (Handler) B.f.b(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f11988m.post((Runnable) B.f.b(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f11988m + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
