package b1;

import V0.AbstractC0549h;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f5544a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            AbstractC0549h.j(context);
            AbstractC0549h.j(th);
            return false;
        } catch (Exception e4) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
            return false;
        }
    }
}
