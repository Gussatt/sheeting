package k1;

import a1.C0575b;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: k1.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1158a3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.measurement.T f9348m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f9349n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1167b3 f9350o;

    public RunnableC1158a3(ServiceConnectionC1167b3 serviceConnectionC1167b3, com.google.android.gms.internal.measurement.T t4, ServiceConnection serviceConnection) {
        this.f9348m = t4;
        this.f9349n = serviceConnection;
        this.f9350o = serviceConnectionC1167b3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC1167b3 serviceConnectionC1167b3 = this.f9350o;
        String str = serviceConnectionC1167b3.f9364a;
        C1176c3 c1176c3 = serviceConnectionC1167b3.f9365b;
        C1363z3 c1363z3 = c1176c3.f9383a;
        c1363z3.e().h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        Bundle bundle2 = null;
        try {
            Bundle bundleK = this.f9348m.k(bundle);
            if (bundleK == null) {
                c1363z3.c().r().a("Install Referrer Service returned a null response");
            } else {
                bundle2 = bundleK;
            }
        } catch (Exception e4) {
            c1176c3.f9383a.c().r().b("Exception occurred while retrieving the Install Referrer", e4.getMessage());
        }
        C1363z3 c1363z32 = c1176c3.f9383a;
        c1363z32.e().h();
        C1363z3.u();
        if (bundle2 != null) {
            long j4 = bundle2.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j4 == 0) {
                c1363z32.c().w().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundle2.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c1363z32.c().r().a("No referrer defined in Install Referrer response");
                } else {
                    c1363z32.c().v().b("InstallReferrer API result", string);
                    Bundle bundleE0 = c1363z32.Q().E0(Uri.parse("?".concat(string)));
                    if (bundleE0 == null) {
                        c1363z32.c().r().a("No campaign params defined in Install Referrer result");
                    } else {
                        if (bundleE0.containsKey("gclid") || bundleE0.containsKey("gbraid")) {
                            long j5 = bundle2.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                            if (j5 > 0) {
                                bundleE0.putLong("click_timestamp", j5);
                            }
                        }
                        if (j4 == c1363z32.H().f9316h.a()) {
                            c1363z32.c().v().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (c1363z32.o()) {
                            c1363z32.H().f9316h.b(j4);
                            c1363z32.c().v().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleE0.putString("_cis", "referrer API v2");
                            c1363z32.K().E("auto", "_cmp", bundleE0, str);
                        }
                    }
                }
            }
        }
        C0575b.b().c(c1363z32.d(), this.f9349n);
    }
}
