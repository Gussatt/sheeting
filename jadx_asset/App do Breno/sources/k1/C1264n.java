package k1;

import V0.AbstractC0549h;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import c1.C0663e;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: k1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1264n extends AbstractC1168b4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f9593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1256m f9595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Boolean f9596e;

    public C1264n(C1363z3 c1363z3) {
        super(c1363z3);
        this.f9595d = new InterfaceC1256m() { // from class: k1.l
            @Override // k1.InterfaceC1256m
            public final String a(String str, String str2) {
                return null;
            }
        };
    }

    public static final long n() {
        return ((Long) AbstractC1291q2.f9734e.a(null)).longValue();
    }

    public static final int o() {
        return Math.max(0, ((Integer) AbstractC1291q2.f9749j.a(null)).intValue());
    }

    public static final long p() {
        return ((Integer) AbstractC1291q2.f9755l.a(null)).intValue();
    }

    public static final long q() {
        return ((Long) AbstractC1291q2.f9704R.a(null)).longValue();
    }

    public static final long r() {
        return ((Long) AbstractC1291q2.f9694M.a(null)).longValue();
    }

    public final int A(String str, C1275o2 c1275o2, int i4, int i5) {
        return Math.max(Math.min(z(str, c1275o2), i5), i4);
    }

    public final long B() {
        this.f9366a.b();
        return 119002L;
    }

    public final long C(String str, C1275o2 c1275o2) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c1275o2.a(null)).longValue();
        }
        String strA = this.f9595d.a(str, c1275o2.b());
        if (TextUtils.isEmpty(strA)) {
            return ((Long) c1275o2.a(null)).longValue();
        }
        try {
            return ((Long) c1275o2.a(Long.valueOf(Long.parseLong(strA)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c1275o2.a(null)).longValue();
        }
    }

    public final Bundle D() {
        try {
            C1363z3 c1363z3 = this.f9366a;
            if (c1363z3.d().getPackageManager() == null) {
                c1363z3.c().r().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoB = C0663e.a(c1363z3.d()).b(c1363z3.d().getPackageName(), 128);
            if (applicationInfoB != null) {
                return applicationInfoB.metaData;
            }
            c1363z3.c().r().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e4) {
            this.f9366a.c().r().b("Failed to load metadata: Package name not found", e4);
            return null;
        }
    }

    public final EnumC1204f4 E(String str, boolean z3) {
        Object obj;
        AbstractC0549h.d(str);
        C1363z3 c1363z3 = this.f9366a;
        Bundle bundleD = D();
        if (bundleD == null) {
            c1363z3.c().r().a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleD.get(str);
        }
        if (obj == null) {
            return EnumC1204f4.UNINITIALIZED;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC1204f4.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC1204f4.DENIED;
        }
        if (z3 && "eu_consent_policy".equals(obj)) {
            return EnumC1204f4.POLICY;
        }
        c1363z3.c().w().b("Invalid manifest metadata for", str);
        return EnumC1204f4.UNINITIALIZED;
    }

    public final Boolean F(String str) {
        AbstractC0549h.d(str);
        Bundle bundleD = D();
        if (bundleD == null) {
            this.f9366a.c().r().a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (bundleD.containsKey(str)) {
            return Boolean.valueOf(bundleD.getBoolean(str));
        }
        return null;
    }

    public final String G() {
        return s("debug.firebase.analytics.app", "");
    }

    public final String H() {
        return s("debug.deferred.deeplink", "");
    }

    public final String I() {
        this.f9366a.b();
        return "FA";
    }

    public final String J(String str, C1275o2 c1275o2) {
        return TextUtils.isEmpty(str) ? (String) c1275o2.a(null) : (String) c1275o2.a(this.f9595d.a(str, c1275o2.b()));
    }

    public final String K() {
        return this.f9594c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List L(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r4 = "analytics.safelisted_events"
            V0.AbstractC0549h.d(r4)
            android.os.Bundle r0 = r3.D()
            r1 = 0
            if (r0 != 0) goto L1d
            k1.z3 r4 = r3.f9366a
            k1.K2 r4 = r4.c()
            k1.I2 r4 = r4.r()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
        L1b:
            r4 = r1
            goto L2c
        L1d:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L24
            goto L1b
        L24:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L2c:
            if (r4 == 0) goto L58
            k1.z3 r0 = r3.f9366a     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.Context r0 = r0.d()     // Catch: android.content.res.Resources.NotFoundException -> L48
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L48
            int r4 = r4.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L48
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            if (r4 != 0) goto L43
            return r1
        L43:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch: android.content.res.Resources.NotFoundException -> L48
            return r4
        L48:
            r4 = move-exception
            k1.z3 r0 = r3.f9366a
            k1.K2 r0 = r0.c()
            k1.I2 r0 = r0.r()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1264n.L(java.lang.String):java.util.List");
    }

    public final void M(InterfaceC1256m interfaceC1256m) {
        this.f9595d = interfaceC1256m;
    }

    public final void N(String str) {
        this.f9594c = str;
    }

    public final boolean O() {
        Boolean boolF = F("google_analytics_adid_collection_enabled");
        return boolF == null || boolF.booleanValue();
    }

    public final boolean P(String str, C1275o2 c1275o2) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c1275o2.a(null)).booleanValue();
        }
        String strA = this.f9595d.a(str, c1275o2.b());
        return TextUtils.isEmpty(strA) ? ((Boolean) c1275o2.a(null)).booleanValue() : ((Boolean) c1275o2.a(Boolean.valueOf("1".equals(strA)))).booleanValue();
    }

    public final boolean Q(String str) {
        return "1".equals(this.f9595d.a(str, "gaia_collection_enabled"));
    }

    public final boolean R() {
        Boolean boolF = F("google_analytics_automatic_screen_reporting_enabled");
        return boolF == null || boolF.booleanValue();
    }

    public final boolean i() {
        this.f9366a.b();
        Boolean boolF = F("firebase_analytics_collection_deactivated");
        return boolF != null && boolF.booleanValue();
    }

    public final boolean j(String str) {
        return "1".equals(this.f9595d.a(str, "measurement.event_sampling_enabled"));
    }

    public final boolean k() {
        if (this.f9593b == null) {
            Boolean boolF = F("app_measurement_lite");
            this.f9593b = boolF;
            if (boolF == null) {
                this.f9593b = Boolean.FALSE;
            }
        }
        return this.f9593b.booleanValue() || !this.f9366a.s();
    }

    public final boolean l() {
        if (this.f9596e == null) {
            synchronized (this) {
                try {
                    if (this.f9596e == null) {
                        C1363z3 c1363z3 = this.f9366a;
                        ApplicationInfo applicationInfo = c1363z3.d().getApplicationInfo();
                        String strA = b1.n.a();
                        if (applicationInfo != null) {
                            String str = applicationInfo.processName;
                            boolean z3 = false;
                            if (str != null && str.equals(strA)) {
                                z3 = true;
                            }
                            this.f9596e = Boolean.valueOf(z3);
                        }
                        if (this.f9596e == null) {
                            this.f9596e = Boolean.TRUE;
                            c1363z3.c().r().a("My process not in the list of running processes");
                        }
                    }
                } finally {
                }
            }
        }
        return this.f9596e.booleanValue();
    }

    public final boolean m() {
        Boolean boolF = F("google_analytics_sgtm_upload_enabled");
        if (boolF == null) {
            return false;
        }
        return boolF.booleanValue();
    }

    public final String s(String str, String str2) {
        try {
            String str3 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC0549h.j(str3);
            return str3;
        } catch (ClassNotFoundException e4) {
            this.f9366a.c().r().b("Could not find SystemProperties class", e4);
            return "";
        } catch (IllegalAccessException e5) {
            this.f9366a.c().r().b("Could not access SystemProperties.get()", e5);
            return "";
        } catch (NoSuchMethodException e6) {
            this.f9366a.c().r().b("Could not find SystemProperties.get() method", e6);
            return "";
        } catch (InvocationTargetException e7) {
            this.f9366a.c().r().b("SystemProperties.get() threw an exception", e7);
            return "";
        }
    }

    public final double t(String str, C1275o2 c1275o2) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c1275o2.a(null)).doubleValue();
        }
        String strA = this.f9595d.a(str, c1275o2.b());
        if (TextUtils.isEmpty(strA)) {
            return ((Double) c1275o2.a(null)).doubleValue();
        }
        try {
            return ((Double) c1275o2.a(Double.valueOf(Double.parseDouble(strA)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c1275o2.a(null)).doubleValue();
        }
    }

    public final int u(String str) {
        return A(str, AbstractC1291q2.f9714W, 500, 2000);
    }

    public final int v(String str, boolean z3) {
        if (z3) {
            return A(str, AbstractC1291q2.f9744h0, 100, 500);
        }
        return 500;
    }

    public final int w(String str, boolean z3) {
        return Math.max(v(str, z3), 256);
    }

    public final int x() {
        return this.f9366a.Q().g0(201500000, true) ? 100 : 25;
    }

    public final int y(String str) {
        return A(str, AbstractC1291q2.f9716X, 25, 100);
    }

    public final int z(String str, C1275o2 c1275o2) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c1275o2.a(null)).intValue();
        }
        String strA = this.f9595d.a(str, c1275o2.b());
        if (TextUtils.isEmpty(strA)) {
            return ((Integer) c1275o2.a(null)).intValue();
        }
        try {
            return ((Integer) c1275o2.a(Integer.valueOf(Integer.parseInt(strA)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c1275o2.a(null)).intValue();
        }
    }
}
