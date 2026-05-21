package c2;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: renamed from: c2.I, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0672I implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0672I f6003b = new C0672I();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f6004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C0667D f6005d;

    public final void a(C0667D c0667d) {
        f6005d = c0667d;
        if (c0667d == null || !f6004c) {
            return;
        }
        f6004c = false;
        c0667d.k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        X2.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        X2.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        X2.l.e(activity, "activity");
        C0667D c0667d = f6005d;
        if (c0667d != null) {
            c0667d.h();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        K2.p pVar;
        X2.l.e(activity, "activity");
        C0667D c0667d = f6005d;
        if (c0667d != null) {
            c0667d.k();
            pVar = K2.p.f2516a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            f6004c = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        X2.l.e(activity, "activity");
        X2.l.e(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        X2.l.e(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        X2.l.e(activity, "activity");
    }
}
