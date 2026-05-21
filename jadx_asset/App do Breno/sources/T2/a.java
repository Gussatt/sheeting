package T2;

import a3.c;

/* JADX INFO: loaded from: classes.dex */
public class a extends S2.a {

    /* JADX INFO: renamed from: T2.a$a, reason: collision with other inner class name */
    public static final class C0075a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0075a f3495a = new C0075a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f3496b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f3496b = num;
        }
    }

    @Override // R2.a
    public c b() {
        return c(34) ? new b3.a() : super.b();
    }

    public final boolean c(int i4) {
        Integer num = C0075a.f3496b;
        return num == null || num.intValue() >= i4;
    }
}
