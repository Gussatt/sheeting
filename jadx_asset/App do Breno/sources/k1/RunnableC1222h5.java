package k1;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: renamed from: k1.h5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1222h5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f9462m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Uri f9463n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9464o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f9465p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1230i5 f9466q;

    public RunnableC1222h5(C1230i5 c1230i5, boolean z3, Uri uri, String str, String str2) {
        this.f9462m = z3;
        this.f9463n = uri;
        this.f9464o = str;
        this.f9465p = str2;
        this.f9466q = c1230i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleE0;
        Bundle bundleE02;
        C1230i5 c1230i5 = this.f9466q;
        C1238j5 c1238j5 = c1230i5.f9477b;
        c1238j5.h();
        String str = this.f9465p;
        Uri uri = this.f9463n;
        try {
            C1363z3 c1363z3 = c1238j5.f9366a;
            w7 w7VarQ = c1363z3.Q();
            if (TextUtils.isEmpty(str)) {
                bundleE0 = null;
            } else if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                bundleE0 = w7VarQ.E0(Uri.parse("https://google.com/search?".concat(str)));
                if (bundleE0 != null) {
                    bundleE0.putString("_cis", "referrer");
                }
            } else {
                w7VarQ.f9366a.c().q().a("Activity created with data 'referrer' without required params");
                bundleE0 = null;
            }
            String str2 = this.f9464o;
            if (this.f9462m && (bundleE02 = c1363z3.Q().E0(uri)) != null) {
                bundleE02.putString("_cis", "intent");
                if (!bundleE02.containsKey("gclid") && bundleE0 != null && bundleE0.containsKey("gclid")) {
                    bundleE02.putString("_cer", String.format("gclid=%s", bundleE0.getString("gclid")));
                }
                c1238j5.F(str2, "_cmp", bundleE02);
                c1238j5.f9513r.a(str2, bundleE02);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c1363z3.c().q().b("Activity created with referrer", str);
            if (c1363z3.B().P(null, AbstractC1291q2.f9683G0)) {
                if (bundleE0 != null) {
                    c1238j5.F(str2, "_cmp", bundleE0);
                    c1238j5.f9513r.a(str2, bundleE0);
                } else {
                    c1363z3.c().q().b("Referrer does not contain valid parameters", str);
                }
                c1238j5.Z("auto", "_ldl", null, true);
                return;
            }
            if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                c1363z3.c().q().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                c1238j5.Z("auto", "_ldl", str, true);
            }
        } catch (RuntimeException e4) {
            c1230i5.f9477b.f9366a.c().r().b("Throwable caught in handleReferrerForOnActivityCreated", e4);
        }
    }
}
