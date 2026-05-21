package t;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.io.File;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1537a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f11343a = new Object();

    /* JADX INFO: renamed from: t.a$a, reason: collision with other inner class name */
    public static class C0173a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i4) {
            return context.getDrawable(i4);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: t.a$b */
    public static class b {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: t.a$c */
    public static class c {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
            return ((i4 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i4 & 1) : context.registerReceiver(broadcastReceiver, intentFilter, AbstractC1537a.d(context), handler);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    /* JADX INFO: renamed from: t.a$d */
    public static class d {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    /* JADX INFO: renamed from: t.a$e */
    public static class e {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
            return context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i4);
        }
    }

    public static Context a(Context context) {
        return b.a(context);
    }

    public static Drawable b(Context context, int i4) {
        return C0173a.b(context, i4);
    }

    public static Executor c(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? d.a(context) : y.d.a(new Handler(context.getMainLooper()));
    }

    public static String d(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (t.b.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static Intent e(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i4) {
        return f(context, broadcastReceiver, intentFilter, null, null, i4);
    }

    public static Intent f(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i4) {
        int i5 = i4 & 1;
        if (i5 != 0 && (i4 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i5 != 0) {
            i4 |= 2;
        }
        int i6 = i4;
        int i7 = i6 & 2;
        if (i7 == 0 && (i6 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i7 != 0 && (i6 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        int i8 = Build.VERSION.SDK_INT;
        return i8 >= 33 ? e.a(context, broadcastReceiver, intentFilter, str, handler, i6) : i8 >= 26 ? c.a(context, broadcastReceiver, intentFilter, str, handler, i6) : ((i6 & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler) : context.registerReceiver(broadcastReceiver, intentFilter, d(context), handler);
    }

    public static void g(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
