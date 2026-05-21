package b1;

import S0.AbstractC0516n;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Boolean f5546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f5547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Boolean f5548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f5549d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f5549d == null) {
            boolean z3 = false;
            if (k.d() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z3 = true;
            }
            f5549d = Boolean.valueOf(z3);
        }
        return f5549d.booleanValue();
    }

    public static boolean b() {
        int i4 = AbstractC0516n.f3440a;
        return "user".equals(Build.TYPE);
    }

    public static boolean c(Context context) {
        return g(context.getPackageManager());
    }

    public static boolean d(Context context) {
        if (c(context) && !k.c()) {
            return true;
        }
        if (e(context)) {
            return !k.d() || k.g();
        }
        return false;
    }

    public static boolean e(Context context) {
        if (f5547b == null) {
            f5547b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f5547b.booleanValue();
    }

    public static boolean f(Context context) {
        if (f5548c == null) {
            boolean z3 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z3 = false;
            }
            f5548c = Boolean.valueOf(z3);
        }
        return f5548c.booleanValue();
    }

    public static boolean g(PackageManager packageManager) {
        if (f5546a == null) {
            f5546a = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        return f5546a.booleanValue();
    }
}
