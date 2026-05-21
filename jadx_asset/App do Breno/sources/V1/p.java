package V1;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f3769b = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f3770c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static p f3771d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y1.a f3772a;

    public p(Y1.a aVar) {
        this.f3772a = aVar;
    }

    public static p c() {
        return d(Y1.b.b());
    }

    public static p d(Y1.a aVar) {
        if (f3771d == null) {
            f3771d = new p(aVar);
        }
        return f3771d;
    }

    public static boolean g(String str) {
        return f3770c.matcher(str).matches();
    }

    public static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f3772a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(W1.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f3769b;
    }
}
