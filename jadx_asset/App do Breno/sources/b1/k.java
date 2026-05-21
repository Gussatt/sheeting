package b1;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static boolean a() {
        return true;
    }

    public static boolean b() {
        return true;
    }

    public static boolean c() {
        return true;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 31;
    }
}
