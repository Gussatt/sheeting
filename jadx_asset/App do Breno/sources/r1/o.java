package r1;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static o a(long j4, long j5, long j6) {
        return new C1504a(j4, j5, j6);
    }

    public static o e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
