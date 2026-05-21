package H2;

import android.util.Log;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f1841a = new Q();

    public final C0288a a(String str) {
        X2.l.e(str, "channelName");
        return new C0288a("channel-error", "Unable to establish connection on channel: '" + str + "'.", "");
    }

    public final List b(Throwable th) {
        X2.l.e(th, "exception");
        if (th instanceof C0288a) {
            C0288a c0288a = (C0288a) th;
            return L2.m.i(c0288a.a(), c0288a.getMessage(), c0288a.b());
        }
        return L2.m.i(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public final List c(Object obj) {
        return L2.l.b(obj);
    }
}
