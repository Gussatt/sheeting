package C0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class n implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Executor f488m;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Runnable f489m;

        public a(Runnable runnable) {
            this.f489m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f489m.run();
            } catch (Exception e4) {
                G0.a.d("Executor", "Background execution failure.", e4);
            }
        }
    }

    public n(Executor executor) {
        this.f488m = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f488m.execute(new a(runnable));
    }
}
