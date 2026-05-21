package z1;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f12103c = new g("FirebaseCrashlytics");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12105b = 4;

    public g(String str) {
        this.f12104a = str;
    }

    public static g f() {
        return f12103c;
    }

    public final boolean a(int i4) {
        return this.f12105b <= i4 || Log.isLoggable(this.f12104a, i4);
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f12104a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f12104a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f12104a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f12104a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f12104a, str, th);
        }
    }
}
