package r3;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Executor {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f11237m = new a();

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
