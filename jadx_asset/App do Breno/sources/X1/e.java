package X1;

import V1.p;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f3955d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f3956e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f3957a = p.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3959c;

    public static boolean c(int i4) {
        if (i4 != 429) {
            return i4 >= 500 && i4 < 600;
        }
        return true;
    }

    public static boolean d(int i4) {
        return (i4 >= 200 && i4 < 300) || i4 == 401 || i4 == 404;
    }

    public final synchronized long a(int i4) {
        if (c(i4)) {
            return (long) Math.min(Math.pow(2.0d, this.f3959c) + this.f3957a.e(), f3956e);
        }
        return f3955d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean b() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f3959c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            V1.p r0 = r4.f3957a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.a()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f3958b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.e.b():boolean");
    }

    public final synchronized void e() {
        this.f3959c = 0;
    }

    public synchronized void f(int i4) {
        if (d(i4)) {
            e();
            return;
        }
        this.f3959c++;
        this.f3958b = this.f3957a.a() + a(i4);
    }
}
