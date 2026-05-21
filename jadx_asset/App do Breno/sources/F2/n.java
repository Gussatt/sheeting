package F2;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final List b(Throwable th) {
        return L2.m.i(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }
}
