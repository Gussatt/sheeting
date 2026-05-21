package U0;

import R.AbstractActivityC0498p;
import V0.AbstractC0549h;
import android.app.Activity;

/* JADX INFO: renamed from: U0.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0522f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3580a;

    public C0522f(Activity activity) {
        AbstractC0549h.k(activity, "Activity must not be null");
        this.f3580a = activity;
    }

    public final Activity a() {
        return (Activity) this.f3580a;
    }

    public final AbstractActivityC0498p b() {
        i.d.a(this.f3580a);
        return null;
    }

    public final boolean c() {
        return this.f3580a instanceof Activity;
    }

    public final boolean d() {
        return false;
    }
}
