package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0609f;
import androidx.lifecycle.u;

/* JADX INFO: loaded from: classes.dex */
public final class s implements j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f5010j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final s f5011k = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5013c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f5016f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5014d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5015e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f5017g = new k(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f5018h = new Runnable() { // from class: androidx.lifecycle.r
        @Override // java.lang.Runnable
        public final void run() {
            s.j(this.f5009m);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final u.a f5019i = new d();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5020a = new a();

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            X2.l.e(activity, "activity");
            X2.l.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(X2.g gVar) {
            this();
        }

        public final j a() {
            return s.f5011k;
        }

        public final void b(Context context) {
            X2.l.e(context, "context");
            s.f5011k.i(context);
        }

        public b() {
        }
    }

    public static final class c extends AbstractC0606c {

        public static final class a extends AbstractC0606c {
            final /* synthetic */ s this$0;

            public a(s sVar) {
                this.this$0 = sVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                X2.l.e(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                X2.l.e(activity, "activity");
                this.this$0.f();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.AbstractC0606c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            X2.l.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                u.f5024c.b(activity).e(s.this.f5019i);
            }
        }

        @Override // androidx.lifecycle.AbstractC0606c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            X2.l.e(activity, "activity");
            s.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            X2.l.e(activity, "activity");
            a.a(activity, new a(s.this));
        }

        @Override // androidx.lifecycle.AbstractC0606c, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            X2.l.e(activity, "activity");
            s.this.g();
        }
    }

    public static final class d implements u.a {
        public d() {
        }

        @Override // androidx.lifecycle.u.a
        public void a() {
            s.this.e();
        }

        @Override // androidx.lifecycle.u.a
        public void b() {
            s.this.f();
        }

        @Override // androidx.lifecycle.u.a
        public void onCreate() {
        }
    }

    public static final void j(s sVar) {
        X2.l.e(sVar, "this$0");
        sVar.m();
        sVar.n();
    }

    public final void d() {
        int i4 = this.f5013c - 1;
        this.f5013c = i4;
        if (i4 == 0) {
            Handler handler = this.f5016f;
            X2.l.b(handler);
            handler.postDelayed(this.f5018h, 700L);
        }
    }

    public final void e() {
        int i4 = this.f5013c + 1;
        this.f5013c = i4;
        if (i4 == 1) {
            if (this.f5014d) {
                this.f5017g.h(AbstractC0609f.a.ON_RESUME);
                this.f5014d = false;
            } else {
                Handler handler = this.f5016f;
                X2.l.b(handler);
                handler.removeCallbacks(this.f5018h);
            }
        }
    }

    public final void f() {
        int i4 = this.f5012b + 1;
        this.f5012b = i4;
        if (i4 == 1 && this.f5015e) {
            this.f5017g.h(AbstractC0609f.a.ON_START);
            this.f5015e = false;
        }
    }

    public final void g() {
        this.f5012b--;
        n();
    }

    @Override // androidx.lifecycle.j
    public AbstractC0609f h() {
        return this.f5017g;
    }

    public final void i(Context context) {
        X2.l.e(context, "context");
        this.f5016f = new Handler();
        this.f5017g.h(AbstractC0609f.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        X2.l.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void m() {
        if (this.f5013c == 0) {
            this.f5014d = true;
            this.f5017g.h(AbstractC0609f.a.ON_PAUSE);
        }
    }

    public final void n() {
        if (this.f5012b == 0 && this.f5014d) {
            this.f5017g.h(AbstractC0609f.a.ON_STOP);
            this.f5015e = true;
        }
    }
}
