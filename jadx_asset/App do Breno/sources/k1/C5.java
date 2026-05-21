package k1;

import V0.AbstractC0549h;
import android.os.Bundle;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class C5 extends AbstractC1219h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C1333v5 f8917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile C1333v5 f8918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1333v5 f8919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f8920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public com.google.android.gms.internal.measurement.H0 f8921g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f8922h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile C1333v5 f8923i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C1333v5 f8924j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f8926l;

    public C5(C1363z3 c1363z3) {
        super(c1363z3);
        this.f8926l = new Object();
        this.f8920f = new ConcurrentHashMap();
    }

    public static /* bridge */ /* synthetic */ void x(C5 c5, Bundle bundle, C1333v5 c1333v5, C1333v5 c1333v52, long j4) {
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        c5.p(c1333v5, c1333v52, j4, true, c5.f9366a.Q().o(null, "screen_view", bundle, null, false));
    }

    public final void A(com.google.android.gms.internal.measurement.H0 h02) {
        synchronized (this.f8926l) {
            try {
                if (Objects.equals(this.f8921g, h02)) {
                    this.f8921g = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.f9366a.B().R()) {
            this.f8920f.remove(Integer.valueOf(h02.f6356m));
        }
    }

    public final void B(com.google.android.gms.internal.measurement.H0 h02) {
        synchronized (this.f8926l) {
            this.f8925k = false;
            this.f8922h = true;
        }
        C1363z3 c1363z3 = this.f9366a;
        long jB = c1363z3.f().b();
        if (!c1363z3.B().R()) {
            this.f8917c = null;
            c1363z3.e().A(new RunnableC1365z5(this, jB));
        } else {
            C1333v5 c1333v5G = G(h02);
            this.f8918d = this.f8917c;
            this.f8917c = null;
            c1363z3.e().A(new A5(this, c1333v5G, jB));
        }
    }

    public final void C(com.google.android.gms.internal.measurement.H0 h02) {
        Object obj = this.f8926l;
        synchronized (obj) {
            this.f8925k = true;
            if (!Objects.equals(h02, this.f8921g)) {
                synchronized (obj) {
                    this.f8921g = h02;
                    this.f8922h = false;
                    C1363z3 c1363z3 = this.f9366a;
                    if (c1363z3.B().R()) {
                        this.f8923i = null;
                        c1363z3.e().A(new B5(this));
                    }
                }
            }
        }
        C1363z3 c1363z32 = this.f9366a;
        if (!c1363z32.B().R()) {
            this.f8917c = this.f8923i;
            c1363z32.e().A(new RunnableC1357y5(this));
            return;
        }
        o(h02.f6357n, G(h02), false);
        E0 e0A = this.f9366a.A();
        C1363z3 c1363z33 = e0A.f9366a;
        c1363z33.e().A(new RunnableC1182d0(e0A, c1363z33.f().b()));
    }

    public final void D(com.google.android.gms.internal.measurement.H0 h02, Bundle bundle) {
        C1333v5 c1333v5;
        if (!this.f9366a.B().R() || bundle == null || (c1333v5 = (C1333v5) this.f8920f.get(Integer.valueOf(h02.f6356m))) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c1333v5.f9887c);
        bundle2.putString("name", c1333v5.f9885a);
        bundle2.putString("referrer_name", c1333v5.f9886b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    public final void E(com.google.android.gms.internal.measurement.H0 h02, String str, String str2) {
        C1363z3 c1363z3 = this.f9366a;
        if (!c1363z3.B().R()) {
            c1363z3.c().x().a("setCurrentScreen cannot be called while screen reporting is disabled.");
            return;
        }
        C1333v5 c1333v5 = this.f8917c;
        if (c1333v5 == null) {
            c1363z3.c().x().a("setCurrentScreen cannot be called while no activity active");
            return;
        }
        Map map = this.f8920f;
        Integer numValueOf = Integer.valueOf(h02.f6356m);
        if (map.get(numValueOf) == null) {
            c1363z3.c().x().a("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }
        if (str2 == null) {
            str2 = u(h02.f6357n, "Activity");
        }
        String str3 = c1333v5.f9886b;
        String str4 = c1333v5.f9885a;
        boolean zEquals = Objects.equals(str3, str2);
        boolean zEquals2 = Objects.equals(str4, str);
        if (zEquals && zEquals2) {
            c1363z3.c().x().a("setCurrentScreen cannot be called with the same class and name");
            return;
        }
        if (str != null && (str.length() <= 0 || str.length() > c1363z3.B().v(null, false))) {
            c1363z3.c().x().b("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            return;
        }
        if (str2 != null && (str2.length() <= 0 || str2.length() > c1363z3.B().v(null, false))) {
            c1363z3.c().x().b("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            return;
        }
        c1363z3.c().v().c("Setting current screen to name, class", str == null ? "null" : str, str2);
        C1333v5 c1333v52 = new C1333v5(str, str2, c1363z3.Q().C0());
        map.put(numValueOf, c1333v52);
        o(h02.f6357n, c1333v52, true);
    }

    public final void F(Bundle bundle, long j4) {
        synchronized (this.f8926l) {
            try {
                if (!this.f8925k) {
                    this.f9366a.c().x().a("Cannot log screen view event when the app is in the background.");
                    return;
                }
                String string = bundle.getString("screen_name");
                if (string != null && (string.length() <= 0 || string.length() > this.f9366a.B().v(null, false))) {
                    this.f9366a.c().x().b("Invalid screen name length for screen view. Length", Integer.valueOf(string.length()));
                    return;
                }
                String string2 = bundle.getString("screen_class");
                if (string2 != null && (string2.length() <= 0 || string2.length() > this.f9366a.B().v(null, false))) {
                    this.f9366a.c().x().b("Invalid screen class length for screen view. Length", Integer.valueOf(string2.length()));
                    return;
                }
                if (string2 == null) {
                    com.google.android.gms.internal.measurement.H0 h02 = this.f8921g;
                    string2 = h02 != null ? u(h02.f6357n, "Activity") : "Activity";
                }
                C1333v5 c1333v5 = this.f8917c;
                if (this.f8922h && c1333v5 != null) {
                    this.f8922h = false;
                    boolean zEquals = Objects.equals(c1333v5.f9886b, string2);
                    boolean zEquals2 = Objects.equals(c1333v5.f9885a, string);
                    if (zEquals && zEquals2) {
                        this.f9366a.c().x().a("Ignoring call to log screen view event with duplicate parameters.");
                        return;
                    }
                }
                C1363z3 c1363z3 = this.f9366a;
                c1363z3.c().v().c("Logging screen view with name, class", string == null ? "null" : string, string2 == null ? "null" : string2);
                C1333v5 c1333v52 = this.f8917c == null ? this.f8918d : this.f8917c;
                C1333v5 c1333v53 = new C1333v5(string, string2, c1363z3.Q().C0(), true, j4);
                this.f8917c = c1333v53;
                this.f8918d = c1333v52;
                this.f8923i = c1333v53;
                c1363z3.e().A(new RunnableC1341w5(this, bundle, c1333v53, c1333v52, c1363z3.f().b()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C1333v5 G(com.google.android.gms.internal.measurement.H0 h02) {
        AbstractC0549h.j(h02);
        Integer numValueOf = Integer.valueOf(h02.f6356m);
        Map map = this.f8920f;
        C1333v5 c1333v5 = (C1333v5) map.get(numValueOf);
        if (c1333v5 == null) {
            C1333v5 c1333v52 = new C1333v5(null, u(h02.f6357n, "Activity"), this.f9366a.Q().C0());
            map.put(numValueOf, c1333v52);
            c1333v5 = c1333v52;
        }
        return this.f8923i != null ? this.f8923i : c1333v5;
    }

    @Override // k1.AbstractC1219h2
    public final boolean n() {
        return false;
    }

    public final void o(String str, C1333v5 c1333v5, boolean z3) {
        C1333v5 c1333v52;
        C1333v5 c1333v53 = this.f8917c == null ? this.f8918d : this.f8917c;
        if (c1333v5.f9886b == null) {
            c1333v52 = new C1333v5(c1333v5.f9885a, str != null ? u(str, "Activity") : null, c1333v5.f9887c, c1333v5.f9889e, c1333v5.f9890f);
        } else {
            c1333v52 = c1333v5;
        }
        this.f8918d = this.f8917c;
        this.f8917c = c1333v52;
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.e().A(new RunnableC1349x5(this, c1333v52, c1333v53, c1363z3.f().b(), z3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(k1.C1333v5 r15, k1.C1333v5 r16, long r17, boolean r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C5.p(k1.v5, k1.v5, long, boolean, android.os.Bundle):void");
    }

    public final void q(C1333v5 c1333v5, boolean z3, long j4) {
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.A().n(c1363z3.f().b());
        if (!c1363z3.P().f8960f.d(c1333v5 != null && c1333v5.f9888d, z3, j4) || c1333v5 == null) {
            return;
        }
        c1333v5.f9888d = false;
    }

    public final C1333v5 s() {
        return this.f8917c;
    }

    public final C1333v5 t(boolean z3) {
        i();
        h();
        if (!z3) {
            return this.f8919e;
        }
        C1333v5 c1333v5 = this.f8919e;
        return c1333v5 != null ? c1333v5 : this.f8924j;
    }

    public final String u(String str, String str2) {
        if (str == null) {
            return "Activity";
        }
        String[] strArrSplit = str.split("\\.");
        int length = strArrSplit.length;
        String str3 = length > 0 ? strArrSplit[length - 1] : "";
        C1363z3 c1363z3 = this.f9366a;
        return str3.length() > c1363z3.B().v(null, false) ? str3.substring(0, c1363z3.B().v(null, false)) : str3;
    }

    public final void z(com.google.android.gms.internal.measurement.H0 h02, Bundle bundle) {
        Bundle bundle2;
        if (!this.f9366a.B().R() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f8920f.put(Integer.valueOf(h02.f6356m), new C1333v5(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }
}
