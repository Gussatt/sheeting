package I2;

import g0.AbstractC0960a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements AutoCloseable {
    public e(String str) {
        a(str);
    }

    public static void a(String str) {
        AbstractC0960a.c(d(str));
    }

    public static void c(String str, int i4) {
        AbstractC0960a.a(d(str), i4);
    }

    public static String d(String str) {
        if (str.length() < 124) {
            return str;
        }
        return str.substring(0, 124) + "...";
    }

    public static void e() {
        AbstractC0960a.f();
    }

    public static void f(String str, int i4) {
        AbstractC0960a.d(d(str), i4);
    }

    public static e g(String str) {
        return new e(str);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        e();
    }
}
