package o2;

import android.os.Handler;
import android.os.Looper;
import o2.C1474c;

/* JADX INFO: loaded from: classes.dex */
public class g implements C1474c.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f10798a = I2.a.a(Looper.getMainLooper());

    @Override // o2.C1474c.d
    public void a(Runnable runnable) {
        this.f10798a.post(runnable);
    }
}
