package b1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import c1.C0663e;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static boolean a(Context context, int i4) {
        if (!b(context, i4, "com.google.android.gms")) {
            return false;
        }
        try {
            return S0.o.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    public static boolean b(Context context, int i4, String str) {
        return C0663e.a(context).f(i4, str);
    }
}
