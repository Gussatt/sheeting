package X;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(c(context), b());
    }

    public static int b() {
        return 0;
    }

    public static String c(Context context) {
        return context.getPackageName() + "_preferences";
    }
}
