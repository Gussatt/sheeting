package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0610g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0610g f4977a = new C0610g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f4978b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.lifecycle.g$a */
    public static final class a extends AbstractC0606c {
        @Override // androidx.lifecycle.AbstractC0606c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            X2.l.e(activity, "activity");
            u.f5024c.c(activity);
        }
    }

    public static final void a(Context context) {
        X2.l.e(context, "context");
        if (f4978b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        X2.l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
