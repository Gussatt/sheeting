package k1;

import V0.AbstractC0549h;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class T4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f9239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9240n;

    public T4(C1238j5 c1238j5, Bundle bundle) {
        this.f9239m = bundle;
        this.f9240n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1238j5 c1238j5 = this.f9240n;
        c1238j5.h();
        c1238j5.i();
        Bundle bundle = this.f9239m;
        AbstractC0549h.j(bundle);
        String strD = AbstractC0549h.d(bundle.getString("name"));
        if (!c1238j5.f9366a.o()) {
            c1238j5.f9366a.c().v().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            c1238j5.f9366a.O().D(new C1232j(bundle.getString("app_id"), "", new s7(strD, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), c1238j5.f9366a.Q().q(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
