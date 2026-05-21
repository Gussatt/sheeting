package S2;

import X2.l;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends R2.a {

    /* JADX INFO: renamed from: S2.a$a, reason: collision with other inner class name */
    public static final class C0072a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0072a f3457a = new C0072a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f3458b;

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
            f3458b = num;
        }
    }

    private final boolean c(int i4) {
        Integer num = C0072a.f3458b;
        return num == null || num.intValue() >= i4;
    }

    @Override // R2.a
    public void a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        l.e(th, "cause");
        l.e(th2, "exception");
        if (c(19)) {
            th.addSuppressed(th2);
        } else {
            super.a(th, th2);
        }
    }
}
