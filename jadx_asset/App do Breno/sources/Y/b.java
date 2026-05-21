package Y;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3995a = new b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3996a = new a();

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: renamed from: Y.b$b, reason: collision with other inner class name */
    public static final class C0083b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0083b f3997a = new C0083b();

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C0083b.f3997a.a();
        }
        return 0;
    }

    public final int b() {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 31 || i4 == 32) {
            return a.f3996a.a();
        }
        return 0;
    }
}
