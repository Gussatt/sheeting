package b1;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f5545a = new g();

    public static d d() {
        return f5545a;
    }

    @Override // b1.d
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // b1.d
    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // b1.d
    public final long c() {
        return System.nanoTime();
    }
}
