package k1;

import V0.AbstractC0549h;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class S4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Bundle f9228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1238j5 f9229n;

    public S4(C1238j5 c1238j5, Bundle bundle) {
        this.f9228m = bundle;
        this.f9229n = c1238j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1238j5 c1238j5 = this.f9229n;
        c1238j5.h();
        c1238j5.i();
        Bundle bundle = this.f9228m;
        AbstractC0549h.j(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        AbstractC0549h.d(string);
        AbstractC0549h.d(string2);
        AbstractC0549h.j(bundle.get("value"));
        if (!c1238j5.f9366a.o()) {
            c1238j5.f9366a.c().v().a("Conditional property not set since app measurement is disabled");
            return;
        }
        s7 s7Var = new s7(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            C1363z3 c1363z3 = c1238j5.f9366a;
            C1150J c1150jQ = c1363z3.Q().q(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            c1238j5.f9366a.O().D(new C1232j(bundle.getString("app_id"), string2, s7Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), c1363z3.Q().q(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), c1150jQ, bundle.getLong("time_to_live"), c1363z3.Q().q(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
