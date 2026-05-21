package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import f0.InterfaceC0939b;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0939b {

    public static class a {
        public static void b(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: c0.i
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j4) {
                    runnable.run();
                }
            });
        }
    }

    public static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    public static void i(final Context context) {
        new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new Runnable() { // from class: c0.h
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.c.h(context);
            }
        });
    }

    @Override // f0.InterfaceC0939b
    public List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // f0.InterfaceC0939b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public c b(Context context) {
        g(context.getApplicationContext());
        return new c();
    }

    public void g(final Context context) {
        a.b(new Runnable() { // from class: c0.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f5932m.h(context);
            }
        });
    }

    public void h(final Context context) {
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new Runnable() { // from class: c0.g
            @Override // java.lang.Runnable
            public final void run() {
                ProfileInstallerInitializer.i(context);
            }
        }, new Random().nextInt(Math.max(1000, 1)) + 5000);
    }
}
