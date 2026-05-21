package V0;

import S0.C0504b;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: V0.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0545d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f3683a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f3684b = 9;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static W f3685c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static HandlerThread f3686d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Executor f3687e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f3688f = false;

    public static AbstractC0545d a(Context context) {
        synchronized (f3683a) {
            try {
                if (f3685c == null) {
                    f3685c = new W(context.getApplicationContext(), f3688f ? b().getLooper() : context.getMainLooper(), f3687e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3685c;
    }

    public static HandlerThread b() {
        synchronized (f3683a) {
            try {
                HandlerThread handlerThread = f3686d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f3684b);
                f3686d = handlerThread2;
                handlerThread2.start();
                return f3686d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract C0504b c(S s4, ServiceConnection serviceConnection, String str, Executor executor);

    public abstract void d(S s4, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i4, ServiceConnection serviceConnection, String str3, boolean z3) {
        d(new S(str, str2, 4225, z3), serviceConnection, str3);
    }
}
