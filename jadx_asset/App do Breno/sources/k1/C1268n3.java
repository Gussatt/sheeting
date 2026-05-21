package k1;

import V0.AbstractC0549h;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0712c0;
import com.google.android.gms.internal.measurement.C0714c2;
import com.google.android.gms.internal.measurement.C0723d2;
import com.google.android.gms.internal.measurement.C0735e5;
import com.google.android.gms.internal.measurement.C0741f2;
import com.google.android.gms.internal.measurement.C0750g2;
import com.google.android.gms.internal.measurement.C0768i2;
import com.google.android.gms.internal.measurement.C0777j2;
import com.google.android.gms.internal.measurement.C0805m5;
import com.google.android.gms.internal.measurement.C0835q3;
import com.google.android.gms.internal.measurement.C0841r2;
import com.google.android.gms.internal.measurement.C0850s3;
import com.google.android.gms.internal.measurement.C0903z0;
import com.google.android.gms.internal.measurement.InterfaceC0755g7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import p.C1475a;
import p.C1479e;

/* JADX INFO: renamed from: k1.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1268n3 extends W6 implements InterfaceC1256m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f9598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f9599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f9600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f9601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f9602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f9603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1479e f9604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0755g7 f9605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f9606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f9607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map f9608n;

    public C1268n3(l7 l7Var) {
        super(l7Var);
        this.f9598d = new C1475a();
        this.f9599e = new C1475a();
        this.f9600f = new C1475a();
        this.f9601g = new C1475a();
        this.f9602h = new C1475a();
        this.f9606l = new C1475a();
        this.f9607m = new C1475a();
        this.f9608n = new C1475a();
        this.f9603i = new C1475a();
        this.f9604j = new C1244k3(this, 20);
        this.f9605k = new C1252l3(this);
    }

    public static /* bridge */ /* synthetic */ C0712c0 A(C1268n3 c1268n3, String str) throws Throwable {
        c1268n3.i();
        AbstractC0549h.d(str);
        C1303s c1303sC0 = c1268n3.f9189b.E0().C0(str);
        if (c1303sC0 == null) {
            return null;
        }
        c1268n3.f9366a.c().v().b("Populate EES config from database on cache miss. appId", str);
        c1268n3.v(str, c1268n3.s(str, c1303sC0.f9820a));
        return (C0712c0) c1268n3.f9604j.h().get(str);
    }

    private final void u(String str) throws Throwable {
        i();
        h();
        AbstractC0549h.d(str);
        Map map = this.f9602h;
        if (map.get(str) == null) {
            C1303s c1303sC0 = this.f9189b.E0().C0(str);
            if (c1303sC0 != null) {
                C0768i2 c0768i2 = (C0768i2) s(str, c1303sC0.f9820a).o();
                t(str, c0768i2);
                this.f9598d.put(str, w((C0777j2) c0768i2.q()));
                map.put(str, (C0777j2) c0768i2.q());
                v(str, (C0777j2) c0768i2.q());
                this.f9606l.put(str, c0768i2.z());
                this.f9607m.put(str, c1303sC0.f9821b);
                this.f9608n.put(str, c1303sC0.f9822c);
                return;
            }
            this.f9598d.put(str, null);
            this.f9600f.put(str, null);
            this.f9599e.put(str, null);
            this.f9601g.put(str, null);
            map.put(str, null);
            this.f9606l.put(str, null);
            this.f9607m.put(str, null);
            this.f9608n.put(str, null);
            this.f9603i.put(str, null);
        }
    }

    public static final Map w(C0777j2 c0777j2) {
        C1475a c1475a = new C1475a();
        if (c0777j2 != null) {
            for (C0841r2 c0841r2 : c0777j2.T()) {
                c1475a.put(c0841r2.G(), c0841r2.H());
            }
        }
        return c1475a;
    }

    public static final EnumC1221h4 x(int i4) {
        int i5 = i4 - 1;
        if (i5 == 1) {
            return EnumC1221h4.AD_STORAGE;
        }
        if (i5 == 2) {
            return EnumC1221h4.ANALYTICS_STORAGE;
        }
        if (i5 == 3) {
            return EnumC1221h4.AD_USER_DATA;
        }
        if (i5 != 4) {
            return null;
        }
        return EnumC1221h4.AD_PERSONALIZATION;
    }

    public static /* bridge */ /* synthetic */ C0712c0 z(C1268n3 c1268n3, String str) throws Throwable {
        c1268n3.i();
        AbstractC0549h.d(str);
        if (!c1268n3.N(str)) {
            return null;
        }
        Map map = c1268n3.f9602h;
        if (!map.containsKey(str) || map.get(str) == null) {
            c1268n3.u(str);
        } else {
            c1268n3.v(str, (C0777j2) map.get(str));
        }
        return (C0712c0) c1268n3.f9604j.h().get(str);
    }

    public final EnumC1204f4 B(String str, EnumC1221h4 enumC1221h4) {
        h();
        u(str);
        C0723d2 c0723d2D = D(str);
        if (c0723d2D == null) {
            return EnumC1204f4.UNINITIALIZED;
        }
        for (com.google.android.gms.internal.measurement.T1 t12 : c0723d2D.K()) {
            if (x(t12.H()) == enumC1221h4) {
                int iG = t12.G() - 1;
                return iG != 1 ? iG != 2 ? EnumC1204f4.UNINITIALIZED : EnumC1204f4.DENIED : EnumC1204f4.GRANTED;
            }
        }
        return EnumC1204f4.UNINITIALIZED;
    }

    public final EnumC1221h4 C(String str, EnumC1221h4 enumC1221h4) {
        h();
        u(str);
        C0723d2 c0723d2D = D(str);
        if (c0723d2D == null) {
            return null;
        }
        for (com.google.android.gms.internal.measurement.W1 w12 : c0723d2D.J()) {
            if (enumC1221h4 == x(w12.H())) {
                return x(w12.G());
            }
        }
        return null;
    }

    public final C0723d2 D(String str) throws Throwable {
        h();
        u(str);
        C0777j2 c0777j2E = E(str);
        if (c0777j2E == null || !c0777j2E.X()) {
            return null;
        }
        return c0777j2E.I();
    }

    public final C0777j2 E(String str) {
        i();
        h();
        AbstractC0549h.d(str);
        u(str);
        return (C0777j2) this.f9602h.get(str);
    }

    public final String F(String str) {
        h();
        return (String) this.f9608n.get(str);
    }

    public final String G(String str) {
        h();
        return (String) this.f9607m.get(str);
    }

    public final String H(String str) {
        h();
        u(str);
        return (String) this.f9606l.get(str);
    }

    public final Set J(String str) {
        h();
        u(str);
        return (Set) this.f9599e.get(str);
    }

    public final SortedSet K(String str) {
        h();
        u(str);
        TreeSet treeSet = new TreeSet();
        C0723d2 c0723d2D = D(str);
        if (c0723d2D != null) {
            Iterator it = c0723d2D.H().iterator();
            while (it.hasNext()) {
                treeSet.add(((C0714c2) it.next()).G());
            }
        }
        return treeSet;
    }

    public final void L(String str) {
        h();
        this.f9607m.put(str, null);
    }

    public final void M(String str) {
        h();
        this.f9602h.remove(str);
    }

    public final boolean N(String str) {
        C0777j2 c0777j2;
        return (TextUtils.isEmpty(str) || (c0777j2 = (C0777j2) this.f9602h.get(str)) == null || c0777j2.F() == 0) ? false : true;
    }

    public final boolean O(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean P(String str, EnumC1221h4 enumC1221h4) throws Throwable {
        h();
        u(str);
        C0723d2 c0723d2D = D(str);
        if (c0723d2D == null) {
            return false;
        }
        Iterator it = c0723d2D.I().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.google.android.gms.internal.measurement.T1 t12 = (com.google.android.gms.internal.measurement.T1) it.next();
            if (enumC1221h4 == x(t12.H())) {
                if (t12.G() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean Q(String str) {
        h();
        u(str);
        C0723d2 c0723d2D = D(str);
        return c0723d2D == null || !c0723d2D.M() || c0723d2D.L();
    }

    public final boolean R(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        u(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map map = (Map) this.f9601g.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean S(String str, String str2) throws Throwable {
        Boolean bool;
        h();
        u(str);
        if (O(str) && w7.h0(str2)) {
            return true;
        }
        if (T(str) && w7.i0(str2)) {
            return true;
        }
        Map map = (Map) this.f9600f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final boolean T(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    public final boolean U(String str, byte[] bArr, String str2, String str3) throws Throwable {
        i();
        h();
        AbstractC0549h.d(str);
        C0768i2 c0768i2 = (C0768i2) s(str, bArr).o();
        t(str, c0768i2);
        v(str, (C0777j2) c0768i2.q());
        this.f9602h.put(str, (C0777j2) c0768i2.q());
        this.f9606l.put(str, c0768i2.z());
        this.f9607m.put(str, str2);
        this.f9608n.put(str, str3);
        this.f9598d.put(str, w((C0777j2) c0768i2.q()));
        this.f9189b.E0().D(str, new ArrayList(c0768i2.A()));
        try {
            c0768i2.w();
            bArr = ((C0777j2) c0768i2.q()).i();
        } catch (RuntimeException e4) {
            this.f9366a.c().w().c("Unable to serialize reduced-size config. Storing full config instead. appId", K2.z(str), e4);
        }
        C1343x c1343xE0 = this.f9189b.E0();
        AbstractC0549h.d(str);
        c1343xE0.h();
        c1343xE0.i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c1343xE0.y0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                c1343xE0.f9366a.c().r().b("Failed to update remote config (got 0). appId", K2.z(str));
            }
        } catch (SQLiteException e5) {
            c1343xE0.f9366a.c().r().c("Error storing remote config. appId", K2.z(str), e5);
        }
        if (this.f9366a.B().P(null, AbstractC1291q2.f9766o1)) {
            c0768i2.x();
        }
        this.f9602h.put(str, (C0777j2) c0768i2.q());
        return true;
    }

    @Override // k1.InterfaceC1256m
    public final String a(String str, String str2) throws Throwable {
        h();
        u(str);
        Map map = (Map) this.f9598d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    @Override // k1.W6
    public final boolean l() {
        return false;
    }

    public final boolean m(String str) throws Throwable {
        h();
        u(str);
        Map map = this.f9599e;
        return map.get(str) != null && ((Set) map.get(str)).contains("app_instance_id");
    }

    public final boolean n(String str) throws Throwable {
        h();
        u(str);
        Map map = this.f9599e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("device_model") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean o(String str) throws Throwable {
        h();
        u(str);
        Map map = this.f9599e;
        return map.get(str) != null && ((Set) map.get(str)).contains("enhanced_user_id");
    }

    public final boolean p(String str) throws Throwable {
        h();
        u(str);
        Map map = this.f9599e;
        return map.get(str) != null && ((Set) map.get(str)).contains("google_signals");
    }

    public final boolean q(String str) throws Throwable {
        h();
        u(str);
        Map map = this.f9599e;
        if (map.get(str) != null) {
            return ((Set) map.get(str)).contains("os_version") || ((Set) map.get(str)).contains("device_info");
        }
        return false;
    }

    public final boolean r(String str) throws Throwable {
        h();
        u(str);
        Map map = this.f9599e;
        return map.get(str) != null && ((Set) map.get(str)).contains("user_id");
    }

    public final C0777j2 s(String str, byte[] bArr) {
        if (bArr == null) {
            return C0777j2.M();
        }
        try {
            C0777j2 c0777j2 = (C0777j2) ((C0768i2) r7.M(C0777j2.K(), bArr)).q();
            this.f9366a.c().v().c("Parsed config. version, gmp_app_id", c0777j2.a0() ? Long.valueOf(c0777j2.H()) : null, c0777j2.Y() ? c0777j2.O() : null);
            return c0777j2;
        } catch (C0735e5 e4) {
            this.f9366a.c().w().c("Unable to merge remote config. appId", K2.z(str), e4);
            return C0777j2.M();
        } catch (RuntimeException e5) {
            this.f9366a.c().w().c("Unable to merge remote config. appId", K2.z(str), e5);
            return C0777j2.M();
        }
    }

    public final void t(String str, C0768i2 c0768i2) {
        HashSet hashSet = new HashSet();
        C1475a c1475a = new C1475a();
        C1475a c1475a2 = new C1475a();
        C1475a c1475a3 = new C1475a();
        Iterator it = c0768i2.B().iterator();
        while (it.hasNext()) {
            hashSet.add(((C0741f2) it.next()).G());
        }
        for (int i4 = 0; i4 < c0768i2.u(); i4++) {
            C0750g2 c0750g2 = (C0750g2) c0768i2.v(i4).o();
            if (c0750g2.w().isEmpty()) {
                this.f9366a.c().w().a("EventConfig contained null event name");
            } else {
                String strW = c0750g2.w();
                String strB = AbstractC1237j4.b(c0750g2.w());
                if (!TextUtils.isEmpty(strB)) {
                    c0750g2.v(strB);
                    c0768i2.y(i4, c0750g2);
                }
                if (c0750g2.z() && c0750g2.x()) {
                    c1475a.put(strW, Boolean.TRUE);
                }
                if (c0750g2.A() && c0750g2.y()) {
                    c1475a2.put(c0750g2.w(), Boolean.TRUE);
                }
                if (c0750g2.B()) {
                    if (c0750g2.u() < 2 || c0750g2.u() > 65535) {
                        this.f9366a.c().w().c("Invalid sampling rate. Event name, sample rate", c0750g2.w(), Integer.valueOf(c0750g2.u()));
                    } else {
                        c1475a3.put(c0750g2.w(), Integer.valueOf(c0750g2.u()));
                    }
                }
            }
        }
        this.f9599e.put(str, hashSet);
        this.f9600f.put(str, c1475a);
        this.f9601g.put(str, c1475a2);
        this.f9603i.put(str, c1475a3);
    }

    public final void v(final String str, C0777j2 c0777j2) {
        if (c0777j2.F() == 0) {
            this.f9604j.e(str);
            return;
        }
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.c().v().b("EES programs found", Integer.valueOf(c0777j2.F()));
        C0850s3 c0850s3 = (C0850s3) c0777j2.S().get(0);
        try {
            C0712c0 c0712c0 = new C0712c0();
            c0712c0.d("internal.remoteConfig", new Callable() { // from class: k1.f3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new C0805m5("internal.remoteConfig", new C1260m3(this.f9423a, str));
                }
            });
            c0712c0.d("internal.appMetadata", new Callable() { // from class: k1.g3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C1268n3 c1268n3 = this.f9441a;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.E7("internal.appMetadata", new Callable() { // from class: k1.j3
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C1268n3 c1268n32 = c1268n3;
                            C1343x c1343xE0 = c1268n32.f9189b.E0();
                            String str3 = str2;
                            F2 f2A0 = c1343xE0.A0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            c1268n32.f9366a.B().B();
                            map.put("gmp_version", 119002L);
                            if (f2A0 != null) {
                                String strF = f2A0.f();
                                if (strF != null) {
                                    map.put("app_version", strF);
                                }
                                map.put("app_version_int", Long.valueOf(f2A0.s0()));
                                map.put("dynamite_version", Long.valueOf(f2A0.C0()));
                            }
                            return map;
                        }
                    });
                }
            });
            c0712c0.d("internal.logger", new Callable() { // from class: k1.i3
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.D7(this.f9473a.f9605k);
                }
            });
            c0712c0.c(c0850s3);
            this.f9604j.d(str, c0712c0);
            c1363z3.c().v().c("EES program loaded for appId, activities", str, Integer.valueOf(c0850s3.F().F()));
            Iterator it = c0850s3.F().I().iterator();
            while (it.hasNext()) {
                c1363z3.c().v().b("EES program activity", ((C0835q3) it.next()).G());
            }
        } catch (C0903z0 unused) {
            this.f9366a.c().r().b("Failed to load EES program. appId", str);
        }
    }

    public final int y(String str, String str2) throws Throwable {
        Integer num;
        h();
        u(str);
        Map map = (Map) this.f9603i.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }
}
