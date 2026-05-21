package x1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: x1.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1633B implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Handler f11928n = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f11928n.post(runnable);
    }
}
