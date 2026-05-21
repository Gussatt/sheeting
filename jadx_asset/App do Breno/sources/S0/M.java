package S0;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class M {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final M f3414e = new M(true, 3, 1, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f3417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3418d;

    public M(boolean z3, int i4, int i5, String str, Throwable th) {
        this.f3415a = z3;
        this.f3418d = i4;
        this.f3416b = str;
        this.f3417c = th;
    }

    public static M b() {
        return f3414e;
    }

    public static M c(String str) {
        return new M(false, 1, 5, str, null);
    }

    public static M d(String str, Throwable th) {
        return new M(false, 1, 5, str, th);
    }

    public static M f(int i4) {
        return new M(true, i4, 1, null, null);
    }

    public static M g(int i4, int i5, String str, Throwable th) {
        return new M(false, i4, i5, str, th);
    }

    public String a() {
        return this.f3416b;
    }

    public final void e() {
        if (this.f3415a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f3417c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f3417c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
