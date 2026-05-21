package b1;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }
}
