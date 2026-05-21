package S0;

import V0.AbstractC0549h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import c1.C0663e;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: S0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0516n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3440a = 12451000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f3442c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f3443d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f3441b = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicBoolean f3444e = new AtomicBoolean();

    public static int a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    public static String b(int i4) {
        return C0504b.k(i4);
    }

    public static Resources c(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean d(Context context) {
        try {
            if (!f3443d) {
                try {
                    PackageInfo packageInfoD = C0663e.a(context).d("com.google.android.gms", 64);
                    o.a(context);
                    if (packageInfoD == null || o.e(packageInfoD, false) || !o.e(packageInfoD, true)) {
                        f3442c = false;
                    } else {
                        f3442c = true;
                    }
                    f3443d = true;
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e4);
                    f3443d = true;
                }
            }
            return f3442c || !b1.h.b();
        } catch (Throwable th) {
            f3443d = true;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int e(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.AbstractC0516n.e(android.content.Context, int):int");
    }

    public static boolean f(Context context, int i4) {
        if (i4 == 18) {
            return true;
        }
        if (i4 == 1) {
            return j(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean g(Context context) {
        Object systemService = context.getSystemService("user");
        AbstractC0549h.j(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean h(int i4) {
        return i4 == 1 || i4 == 2 || i4 == 3 || i4 == 9;
    }

    public static boolean i(Context context, int i4, String str) {
        return b1.p.b(context, i4, str);
    }

    public static boolean j(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !g(context);
    }
}
