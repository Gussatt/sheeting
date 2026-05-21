package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0609f;

/* JADX INFO: loaded from: classes.dex */
public class u extends Fragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f5024c = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f5025b;

    public interface a {
        void a();

        void b();

        void onCreate();
    }

    public static final class b {
        public /* synthetic */ b(X2.g gVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Activity activity, AbstractC0609f.a aVar) {
            X2.l.e(activity, "activity");
            X2.l.e(aVar, "event");
            if (activity instanceof j) {
                AbstractC0609f abstractC0609fH = ((j) activity).h();
                if (abstractC0609fH instanceof k) {
                    ((k) abstractC0609fH).h(aVar);
                }
            }
        }

        public final u b(Activity activity) {
            X2.l.e(activity, "<this>");
            Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            X2.l.c(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            return (u) fragmentFindFragmentByTag;
        }

        public final void c(Activity activity) {
            X2.l.e(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.a(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new u(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        public b() {
        }
    }

    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a(null);

        public static final class a {
            public /* synthetic */ a(X2.g gVar) {
                this();
            }

            public final void a(Activity activity) {
                X2.l.e(activity, "activity");
                activity.registerActivityLifecycleCallbacks(new c());
            }

            public a() {
            }
        }

        public static final void registerIn(Activity activity) {
            Companion.a(activity);
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
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            X2.l.e(activity, "activity");
            u.f5024c.a(activity, AbstractC0609f.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            X2.l.e(activity, "activity");
            u.f5024c.a(activity, AbstractC0609f.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            X2.l.e(activity, "activity");
            u.f5024c.a(activity, AbstractC0609f.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            X2.l.e(activity, "activity");
            u.f5024c.a(activity, AbstractC0609f.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            X2.l.e(activity, "activity");
            u.f5024c.a(activity, AbstractC0609f.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            X2.l.e(activity, "activity");
            u.f5024c.a(activity, AbstractC0609f.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            X2.l.e(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            X2.l.e(activity, "activity");
            X2.l.e(bundle, "bundle");
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

    public final void a(AbstractC0609f.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            b bVar = f5024c;
            Activity activity = getActivity();
            X2.l.d(activity, "activity");
            bVar.a(activity, aVar);
        }
    }

    public final void b(a aVar) {
        if (aVar != null) {
            aVar.onCreate();
        }
    }

    public final void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void d(a aVar) {
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void e(a aVar) {
        this.f5025b = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(this.f5025b);
        a(AbstractC0609f.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        a(AbstractC0609f.a.ON_DESTROY);
        this.f5025b = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        a(AbstractC0609f.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        c(this.f5025b);
        a(AbstractC0609f.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        d(this.f5025b);
        a(AbstractC0609f.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        a(AbstractC0609f.a.ON_STOP);
    }
}
