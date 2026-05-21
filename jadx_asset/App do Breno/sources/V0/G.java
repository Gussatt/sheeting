package V0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import c1.C0663e;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3622a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f3623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f3624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f3625d;

    public static int a(Context context) {
        b(context);
        return f3625d;
    }

    public static void b(Context context) {
        synchronized (f3622a) {
            try {
                if (f3623b) {
                    return;
                }
                f3623b = true;
                try {
                    Bundle bundle = C0663e.a(context).b(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f3624c = bundle.getString("com.google.app.id");
                    f3625d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
