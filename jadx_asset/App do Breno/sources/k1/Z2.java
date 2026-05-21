package k1;

import O0.a;
import V0.AbstractC0549h;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class Z2 extends AbstractC1177c4 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Pair f9309B = new Pair("", 0L);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final U2 f9310A;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences f9311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public SharedPreferences f9313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public W2 f9314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V2 f9315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V2 f9316h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final X2 f9317i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f9318j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f9320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final V2 f9321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final T2 f9322n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final X2 f9323o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final U2 f9324p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final T2 f9325q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final V2 f9326r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final V2 f9327s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f9328t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final T2 f9329u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final T2 f9330v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final V2 f9331w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final X2 f9332x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final X2 f9333y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final V2 f9334z;

    public Z2(C1363z3 c1363z3) {
        super(c1363z3);
        this.f9312d = new Object();
        this.f9321m = new V2(this, "session_timeout", 1800000L);
        this.f9322n = new T2(this, "start_new_session", true);
        this.f9326r = new V2(this, "last_pause_time", 0L);
        this.f9327s = new V2(this, "session_id", 0L);
        this.f9323o = new X2(this, "non_personalized_ads", null);
        this.f9324p = new U2(this, "last_received_uri_timestamps_by_source", null);
        this.f9325q = new T2(this, "allow_remote_dynamite", false);
        this.f9315g = new V2(this, "first_open_time", 0L);
        this.f9316h = new V2(this, "app_install_time", 0L);
        this.f9317i = new X2(this, "app_instance_id", null);
        this.f9329u = new T2(this, "app_backgrounded", false);
        this.f9330v = new T2(this, "deep_link_retrieval_complete", false);
        this.f9331w = new V2(this, "deep_link_retrieval_attempts", 0L);
        this.f9332x = new X2(this, "firebase_feature_rollouts", null);
        this.f9333y = new X2(this, "deferred_attribution_cache", null);
        this.f9334z = new V2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f9310A = new U2(this, "default_event_parameters", null);
    }

    public final boolean A(long j4) {
        return j4 - this.f9321m.a() > this.f9326r.a();
    }

    public final boolean B(int i4) {
        return C1229i4.s(i4, p().getInt("consent_source", 100));
    }

    public final boolean C(F6 f6) {
        h();
        String string = p().getString("stored_tcf_param", "");
        String strE = f6.e();
        if (strE.equals(string)) {
            return false;
        }
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putString("stored_tcf_param", strE);
        editorEdit.apply();
        return true;
    }

    @Override // k1.AbstractC1177c4
    public final void i() {
        C1363z3 c1363z3 = this.f9366a;
        SharedPreferences sharedPreferences = c1363z3.d().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f9311c = sharedPreferences;
        boolean z3 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f9328t = z3;
        if (!z3) {
            SharedPreferences.Editor editorEdit = this.f9311c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        c1363z3.B();
        this.f9314f = new W2(this, "health_monitor", Math.max(0L, ((Long) AbstractC1291q2.f9731d.a(null)).longValue()), null);
    }

    @Override // k1.AbstractC1177c4
    public final boolean j() {
        return true;
    }

    public final SharedPreferences o() {
        h();
        k();
        if (this.f9313e == null) {
            synchronized (this.f9312d) {
                try {
                    if (this.f9313e == null) {
                        C1363z3 c1363z3 = this.f9366a;
                        String str = c1363z3.d().getPackageName() + "_preferences";
                        c1363z3.c().v().b("Default prefs file", str);
                        this.f9313e = c1363z3.d().getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.f9313e;
    }

    public final SharedPreferences p() {
        h();
        k();
        AbstractC0549h.j(this.f9311c);
        return this.f9311c;
    }

    public final Pair q(String str) {
        h();
        if (!t().r(EnumC1221h4.AD_STORAGE)) {
            return new Pair("", Boolean.FALSE);
        }
        C1363z3 c1363z3 = this.f9366a;
        long jB = c1363z3.f().b();
        String str2 = this.f9318j;
        if (str2 != null && jB < this.f9320l) {
            return new Pair(str2, Boolean.valueOf(this.f9319k));
        }
        this.f9320l = jB + c1363z3.B().C(str, AbstractC1291q2.f9725b);
        O0.a.b(true);
        try {
            a.C0064a c0064aA = O0.a.a(c1363z3.d());
            this.f9318j = "";
            String strA = c0064aA.a();
            if (strA != null) {
                this.f9318j = strA;
            }
            this.f9319k = c0064aA.b();
        } catch (Exception e4) {
            this.f9366a.c().q().b("Unable to get advertising id", e4);
            this.f9318j = "";
        }
        O0.a.b(false);
        return new Pair(this.f9318j, Boolean.valueOf(this.f9319k));
    }

    public final SparseArray r() {
        Bundle bundleA = this.f9324p.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f9366a.c().r().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i4 = 0; i4 < intArray.length; i4++) {
            sparseArray.put(intArray[i4], Long.valueOf(longArray[i4]));
        }
        return sparseArray;
    }

    public final C1143C s() {
        h();
        return C1143C.e(p().getString("dma_consent_settings", null));
    }

    public final C1229i4 t() {
        h();
        return C1229i4.k(p().getString("consent_settings", "G1"), p().getInt("consent_source", 100));
    }

    public final Boolean u() {
        h();
        if (p().contains("measurement_enabled")) {
            return Boolean.valueOf(p().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    public final String v() {
        h();
        return p().getString("gmp_app_id", null);
    }

    public final void w(String str) {
        h();
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putString("admob_app_id", str);
        editorEdit.apply();
    }

    public final void x(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = p().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    public final void y(boolean z3) {
        h();
        this.f9366a.c().v().b("App measurement setting deferred collection", Boolean.valueOf(z3));
        SharedPreferences.Editor editorEdit = p().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z3);
        editorEdit.apply();
    }

    public final boolean z() {
        SharedPreferences sharedPreferences = this.f9311c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }
}
