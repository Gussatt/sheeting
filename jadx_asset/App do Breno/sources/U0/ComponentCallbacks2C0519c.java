package U0;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: U0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C0519c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ComponentCallbacks2C0519c f3554f = new ComponentCallbacks2C0519c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f3555b = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f3556c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f3557d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3558e = false;

    /* JADX INFO: renamed from: U0.c$a */
    public interface a {
        void a(boolean z3);
    }

    public static ComponentCallbacks2C0519c b() {
        return f3554f;
    }

    public static void c(Application application) {
        ComponentCallbacks2C0519c componentCallbacks2C0519c = f3554f;
        synchronized (componentCallbacks2C0519c) {
            try {
                if (!componentCallbacks2C0519c.f3558e) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C0519c);
                    application.registerComponentCallbacks(componentCallbacks2C0519c);
                    componentCallbacks2C0519c.f3558e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (f3554f) {
            this.f3557d.add(aVar);
        }
    }

    public boolean d() {
        return this.f3555b.get();
    }

    public boolean e(boolean z3) {
        if (!this.f3556c.get()) {
            if (b1.n.b()) {
                return z3;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f3556c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f3555b.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z3) {
        synchronized (f3554f) {
            try {
                Iterator it = this.f3557d.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f3556c;
        boolean zCompareAndSet = this.f3555b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.f3556c;
        boolean zCompareAndSet = this.f3555b.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i4) {
        if (i4 == 20 && this.f3555b.compareAndSet(false, true)) {
            this.f3556c.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
