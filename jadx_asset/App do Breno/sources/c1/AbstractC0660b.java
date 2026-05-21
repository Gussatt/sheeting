package c1;

import android.content.Context;
import b1.k;

/* JADX INFO: renamed from: c1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0660b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f5950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f5951b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f5950a;
        if (context2 != null && (bool = f5951b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f5951b = null;
        if (k.d()) {
            f5951b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f5951b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f5951b = Boolean.FALSE;
            }
        }
        f5950a = applicationContext;
        return f5951b.booleanValue();
    }
}
