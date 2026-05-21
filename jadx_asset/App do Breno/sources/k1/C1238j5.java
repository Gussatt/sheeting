package k1;

import V0.AbstractC0549h;
import a0.AbstractC0573a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.internal.measurement.EnumC0779j4;
import com.google.android.gms.internal.measurement.EnumC0788k4;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import p.C1475a;
import p1.j;
import q1.AbstractC1493b;
import q1.InterfaceFutureC1495d;

/* JADX INFO: renamed from: k1.j5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1238j5 extends AbstractC1219h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1230i5 f9498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1269n4 f9499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f9500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f9502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f9503h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9504i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9505j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public AbstractC1141A f9506k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AbstractC1141A f9507l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PriorityQueue f9508m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9509n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C1229i4 f9510o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AtomicLong f9511p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f9512q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final D7 f9513r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f9514s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC1141A f9515t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SharedPreferences.OnSharedPreferenceChangeListener f9516u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractC1141A f9517v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v7 f9518w;

    public C1238j5(C1363z3 c1363z3) {
        super(c1363z3);
        this.f9500e = new CopyOnWriteArraySet();
        this.f9503h = new Object();
        this.f9504i = false;
        this.f9505j = 1;
        this.f9514s = true;
        this.f9518w = new X4(this);
        this.f9502g = new AtomicReference();
        this.f9510o = C1229i4.f9474c;
        this.f9512q = -1L;
        this.f9511p = new AtomicLong(0L);
        this.f9513r = new D7(c1363z3);
    }

    public static /* bridge */ /* synthetic */ int e0(C1238j5 c1238j5, Throwable th) {
        String message = th.getMessage();
        c1238j5.f9509n = false;
        if (message == null) {
            return 2;
        }
        if (!(th instanceof IllegalStateException) && !message.contains("garbage collected") && !th.getClass().getSimpleName().equals("ServiceUnavailableException")) {
            return (!(th instanceof SecurityException) || message.endsWith("READ_DEVICE_CONFIG")) ? 2 : 3;
        }
        if (!message.contains("Background")) {
            return 1;
        }
        c1238j5.f9509n = true;
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        C1238j5 c1238j5;
        h();
        C1363z3 c1363z3 = this.f9366a;
        String strA = c1363z3.H().f9323o.a();
        if (strA == null) {
            c1238j5 = this;
        } else if ("unset".equals(strA)) {
            c1238j5 = this;
            c1238j5.b0("app", "_npa", null, c1363z3.f().a());
        } else {
            b0("app", "_npa", Long.valueOf(true != "true".equals(strA) ? 0L : 1L), c1363z3.f().a());
            c1238j5 = this;
        }
        if (!c1238j5.f9366a.o() || !c1238j5.f9514s) {
            c1363z3.c().q().a("Updating Scion state (FE)");
            c1238j5.f9366a.O().I();
        } else {
            c1363z3.c().q().a("Recording app launch after enabling measurement for the first time (FE)");
            v();
            c1238j5.f9366a.P().f8959e.a();
            c1363z3.e().A(new J4(this));
        }
    }

    public static /* synthetic */ void o(C1238j5 c1238j5, SharedPreferences sharedPreferences, String str) {
        C1363z3 c1363z3 = c1238j5.f9366a;
        if (!c1363z3.B().P(null, AbstractC1291q2.f9754k1)) {
            if (Objects.equals(str, "IABTCF_TCString")) {
                c1363z3.c().v().a("IABTCF_TCString change picked up in listener.");
                ((AbstractC1141A) AbstractC0549h.j(c1238j5.f9517v)).d(500L);
                return;
            }
            return;
        }
        if (Objects.equals(str, "IABTCF_TCString") || Objects.equals(str, "IABTCF_gdprApplies") || Objects.equals(str, "IABTCF_EnableAdvertiserConsentMode")) {
            c1363z3.c().v().a("IABTCF_TCString change picked up in listener.");
            ((AbstractC1141A) AbstractC0549h.j(c1238j5.f9517v)).d(500L);
        }
    }

    public static /* synthetic */ void r(C1238j5 c1238j5, C1229i4 c1229i4, long j4, boolean z3, boolean z4) {
        c1238j5.h();
        c1238j5.i();
        C1363z3 c1363z3 = c1238j5.f9366a;
        C1229i4 c1229i4T = c1363z3.H().t();
        if (j4 <= c1238j5.f9512q && C1229i4.s(c1229i4T.b(), c1229i4.b())) {
            c1363z3.c().u().b("Dropped out-of-date consent setting, proposed settings", c1229i4);
            return;
        }
        Z2 z2H = c1363z3.H();
        C1363z3 c1363z32 = z2H.f9366a;
        z2H.h();
        int iB = c1229i4.b();
        if (!z2H.B(iB)) {
            c1363z3.c().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(c1229i4.b()));
            return;
        }
        C1363z3 c1363z33 = c1238j5.f9366a;
        SharedPreferences.Editor editorEdit = z2H.p().edit();
        editorEdit.putString("consent_settings", c1229i4.q());
        editorEdit.putInt("consent_source", iB);
        editorEdit.apply();
        c1363z3.c().v().b("Setting storage consent(FE)", c1229i4);
        c1238j5.f9512q = j4;
        if (c1363z33.O().P()) {
            c1363z33.O().K(z3);
        } else {
            c1363z33.O().E(z3);
        }
        if (z4) {
            c1363z33.O().s(new AtomicReference());
        }
    }

    public static /* bridge */ /* synthetic */ void t(C1238j5 c1238j5, int i4) {
        if (c1238j5.f9506k == null) {
            c1238j5.f9506k = new H4(c1238j5, c1238j5.f9366a);
        }
        c1238j5.f9506k.d(((long) i4) * 1000);
    }

    public static /* synthetic */ void w0(C1238j5 c1238j5, Bundle bundle) {
        Bundle bundle2;
        int i4;
        if (bundle.isEmpty()) {
            bundle2 = bundle;
        } else {
            C1363z3 c1363z3 = c1238j5.f9366a;
            bundle2 = new Bundle(c1363z3.H().f9310A.a());
            Iterator<String> it = bundle.keySet().iterator();
            while (true) {
                i4 = 0;
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = bundle.get(next);
                if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                    if (c1363z3.Q().d0(obj)) {
                        c1363z3.Q().F(c1238j5.f9518w, null, 27, null, null, 0);
                    }
                    c1363z3.c().x().c("Invalid default event parameter type. Name, value", next, obj);
                } else if (w7.h0(next)) {
                    c1363z3.c().x().b("Invalid default event parameter name. Name", next);
                } else if (obj == null) {
                    bundle2.remove(next);
                } else if (c1363z3.Q().X("param", next, c1363z3.B().v(null, false), obj)) {
                    c1363z3.Q().G(bundle2, next, obj);
                }
            }
            c1363z3.Q();
            int iX = c1363z3.B().x();
            if (bundle2.size() > iX) {
                for (String str : new TreeSet(bundle2.keySet())) {
                    i4++;
                    if (i4 > iX) {
                        bundle2.remove(str);
                    }
                }
                c1363z3.Q().F(c1238j5.f9518w, null, 26, null, null, 0);
                c1363z3.c().x().a("Too many default event parameters set. Discarding beyond event parameter limit");
            }
        }
        C1363z3 c1363z32 = c1238j5.f9366a;
        c1363z32.H().f9310A.b(bundle2);
        if (!bundle.isEmpty() || c1363z32.B().P(null, AbstractC1291q2.f9736e1)) {
            c1238j5.f9366a.O().G(bundle2);
        }
    }

    public final void A() {
        h();
        C1363z3 c1363z3 = this.f9366a;
        if (c1363z3.H().f9330v.b()) {
            c1363z3.c().q().a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long jA = c1363z3.H().f9331w.a();
        c1363z3.H().f9331w.b(1 + jA);
        c1363z3.B();
        if (jA >= 5) {
            c1363z3.c().w().a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            c1363z3.H().f9330v.a(true);
        } else {
            if (this.f9515t == null) {
                this.f9515t = new Q4(this, this.f9366a);
            }
            this.f9515t.d(0L);
        }
    }

    public final void B() {
        F6 f6;
        F6 f62;
        EnumC0788k4 enumC0788k4;
        h();
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.c().q().a("Handle tcf update.");
        SharedPreferences sharedPreferencesO = c1363z3.H().o();
        HashMap map = new HashMap();
        C1275o2 c1275o2 = AbstractC1291q2.f9754k1;
        int i4 = 2;
        if (((Boolean) c1275o2.a(null)).booleanValue()) {
            p1.i iVar = I6.f9087a;
            EnumC0779j4 enumC0779j4 = EnumC0779j4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
            H6 h6 = H6.CONSENT;
            Map.Entry entryA = G6.a(enumC0779j4, h6);
            int i5 = 1;
            EnumC0779j4 enumC0779j42 = EnumC0779j4.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
            H6 h62 = H6.FLEXIBLE_LEGITIMATE_INTEREST;
            p1.j jVarJ = p1.j.j(entryA, G6.a(enumC0779j42, h62), G6.a(EnumC0779j4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE, h6), G6.a(EnumC0779j4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS, h6), G6.a(EnumC0779j4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE, h62), G6.a(EnumC0779j4.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, h62), G6.a(EnumC0779j4.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, h62));
            p1.k kVarU = p1.k.u("CH");
            char[] cArr = new char[5];
            int iA = I6.a(sharedPreferencesO, "IABTCF_CmpSdkID");
            int iA2 = I6.a(sharedPreferencesO, "IABTCF_PolicyVersion");
            int iA3 = I6.a(sharedPreferencesO, "IABTCF_gdprApplies");
            int iA4 = I6.a(sharedPreferencesO, "IABTCF_PurposeOneTreatment");
            int iA5 = I6.a(sharedPreferencesO, "IABTCF_EnableAdvertiserConsentMode");
            String strB = I6.b(sharedPreferencesO, "IABTCF_PublisherCC");
            j.a aVarA = p1.j.a();
            p1.z zVarS = jVarJ.keySet().iterator();
            while (zVarS.hasNext()) {
                EnumC0779j4 enumC0779j43 = (EnumC0779j4) zVarS.next();
                String strB2 = I6.b(sharedPreferencesO, "IABTCF_PublisherRestrictions" + enumC0779j43.d());
                if (TextUtils.isEmpty(strB2) || strB2.length() < 755) {
                    enumC0788k4 = EnumC0788k4.PURPOSE_RESTRICTION_UNDEFINED;
                } else {
                    int iDigit = Character.digit(strB2.charAt(754), 10);
                    enumC0788k4 = (iDigit < 0 || iDigit > EnumC0788k4.values().length || iDigit == 0) ? EnumC0788k4.PURPOSE_RESTRICTION_NOT_ALLOWED : iDigit != i5 ? iDigit != i4 ? EnumC0788k4.PURPOSE_RESTRICTION_UNDEFINED : EnumC0788k4.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST : EnumC0788k4.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                }
                aVarA.f(enumC0779j43, enumC0788k4);
                i4 = 2;
                i5 = 1;
            }
            p1.j jVarC = aVarA.c();
            String strB3 = I6.b(sharedPreferencesO, "IABTCF_PurposeConsents");
            String strB4 = I6.b(sharedPreferencesO, "IABTCF_VendorConsents");
            boolean z3 = !TextUtils.isEmpty(strB4) && strB4.length() >= 755 && strB4.charAt(754) == '1';
            String strB5 = I6.b(sharedPreferencesO, "IABTCF_PurposeLegitimateInterests");
            String strB6 = I6.b(sharedPreferencesO, "IABTCF_VendorLegitimateInterests");
            boolean z4 = !TextUtils.isEmpty(strB6) && strB6.length() >= 755 && strB6.charAt(754) == '1';
            cArr[0] = '2';
            f6 = new F6(I6.c(jVarJ, jVarC, kVarU, cArr, iA, iA5, iA3, iA2, iA4, strB, strB3, strB5, z3, z4));
        } else {
            String strB7 = I6.b(sharedPreferencesO, "IABTCF_VendorConsents");
            if (!"".equals(strB7) && strB7.length() > 754) {
                map.put("GoogleConsent", String.valueOf(strB7.charAt(754)));
            }
            int iA6 = I6.a(sharedPreferencesO, "IABTCF_gdprApplies");
            if (iA6 != -1) {
                map.put("gdprApplies", String.valueOf(iA6));
            }
            int iA7 = I6.a(sharedPreferencesO, "IABTCF_EnableAdvertiserConsentMode");
            if (iA7 != -1) {
                map.put("EnableAdvertiserConsentMode", String.valueOf(iA7));
            }
            int iA8 = I6.a(sharedPreferencesO, "IABTCF_PolicyVersion");
            if (iA8 != -1) {
                map.put("PolicyVersion", String.valueOf(iA8));
            }
            String strB8 = I6.b(sharedPreferencesO, "IABTCF_PurposeConsents");
            if (!"".equals(strB8)) {
                map.put("PurposeConsents", strB8);
            }
            int iA9 = I6.a(sharedPreferencesO, "IABTCF_CmpSdkID");
            if (iA9 != -1) {
                map.put("CmpSdkID", String.valueOf(iA9));
            }
            f6 = new F6(map);
        }
        c1363z3.c().v().b("Tcf preferences read", f6);
        if (!c1363z3.B().P(null, c1275o2)) {
            if (c1363z3.H().C(f6)) {
                Bundle bundleA = f6.a();
                c1363z3.c().v().b("Consent generated from Tcf", bundleA);
                if (bundleA != Bundle.EMPTY) {
                    T(bundleA, -30, c1363z3.f().a());
                }
                Bundle bundle = new Bundle();
                bundle.putString("_tcfd", f6.d());
                F("auto", "_tcf", bundle);
                return;
            }
            return;
        }
        Z2 z2H = c1363z3.H();
        z2H.h();
        String string = z2H.p().getString("stored_tcf_param", "");
        HashMap map2 = new HashMap();
        if (TextUtils.isEmpty(string)) {
            f62 = new F6(map2);
        } else {
            for (String str : string.split(";")) {
                String[] strArrSplit = str.split("=");
                if (strArrSplit.length >= 2 && I6.f9087a.contains(strArrSplit[0])) {
                    map2.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            f62 = new F6(map2);
        }
        if (c1363z3.H().C(f6)) {
            Bundle bundleA2 = f6.a();
            c1363z3.c().v().b("Consent generated from Tcf", bundleA2);
            if (bundleA2 != Bundle.EMPTY) {
                T(bundleA2, -30, c1363z3.f().a());
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_tcfm", f6.c(f62));
            bundle2.putString("_tcfd2", f6.b());
            bundle2.putString("_tcfd", f6.d());
            F("auto", "_tcf", bundle2);
        }
    }

    public final void C(String str, String str2, Bundle bundle) {
        D(str, str2, bundle, true, true, this.f9366a.f().a());
    }

    public final void D(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j4) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        Bundle bundle2 = bundle;
        if (Objects.equals(str2, "screen_view")) {
            this.f9366a.N().F(bundle2, j4);
            return;
        }
        boolean z5 = true;
        if (z4 && this.f9499d != null && !w7.h0(str2)) {
            z5 = false;
        }
        boolean z6 = z5;
        if (str == null) {
            str = "app";
        }
        N(str, str2, j4, bundle2, z4, z6, z3, null);
    }

    public final void E(String str, String str2, Bundle bundle, String str3) {
        C1363z3.u();
        N("auto", str2, this.f9366a.f().a(), bundle, false, true, true, str3);
    }

    public final void F(String str, String str2, Bundle bundle) {
        h();
        G(str, str2, this.f9366a.f().a(), bundle);
    }

    public final void G(String str, String str2, long j4, Bundle bundle) {
        h();
        boolean z3 = true;
        if (this.f9499d != null && !w7.h0(str2)) {
            z3 = false;
        }
        H(str, str2, j4, bundle, true, z3, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(String str, String str2, long j4, Bundle bundle, boolean z3, boolean z4, boolean z5, String str3) {
        boolean z6;
        int i4;
        C1363z3 c1363z3;
        long j5;
        long j6;
        String str4;
        C1363z3 c1363z32;
        long j7;
        Bundle[] bundleArr;
        String str5 = str;
        AbstractC0549h.d(str5);
        AbstractC0549h.j(bundle);
        h();
        i();
        C1363z3 c1363z33 = this.f9366a;
        if (!c1363z33.o()) {
            this.f9366a.c().q().a("Event not sent since app measurement is disabled");
            return;
        }
        List listW = this.f9366a.D().w();
        if (listW != null && !listW.contains(str2)) {
            this.f9366a.c().q().c("Dropping non-safelisted event. event name, origin", str2, str5);
            return;
        }
        if (!this.f9501f) {
            this.f9501f = true;
            try {
                try {
                    (!c1363z33.s() ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, this.f9366a.d().getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, this.f9366a.d());
                } catch (Exception e4) {
                    this.f9366a.c().w().b("Failed to invoke Tag Manager's initialize() method", e4);
                }
            } catch (ClassNotFoundException unused) {
                this.f9366a.c().u().a("Tag Manager is not found and thus will not be used");
            }
        }
        if ("_cmp".equals(str2) && bundle.containsKey("gclid")) {
            C1363z3 c1363z34 = this.f9366a;
            c1363z34.b();
            b0("auto", "_lgclid", bundle.getString("gclid"), c1363z34.f().a());
        }
        C1238j5 c1238j5 = this;
        C1363z3 c1363z35 = c1238j5.f9366a;
        c1363z35.b();
        if (z3 && w7.m0(str2)) {
            c1363z35.Q().C(bundle, c1363z35.H().f9310A.a());
        }
        if (!z5) {
            c1363z35.b();
            if (!"_iap".equals(str2)) {
                C1363z3 c1363z36 = c1238j5.f9366a;
                w7 w7VarQ = c1363z36.Q();
                int i5 = 2;
                if (w7VarQ.Z("event", str2)) {
                    if (w7VarQ.W("event", AbstractC1237j4.f9494a, AbstractC1237j4.f9495b, str2)) {
                        w7VarQ.f9366a.B();
                        if (w7VarQ.V("event", 40, str2)) {
                            i5 = 0;
                        }
                    } else {
                        i5 = 13;
                    }
                }
                if (i5 != 0) {
                    c1363z35.c().s().b("Invalid public event name. Event will not be logged (FE)", c1363z35.F().d(str2));
                    w7 w7VarQ2 = c1363z36.Q();
                    c1363z36.B();
                    c1363z36.Q().F(c1238j5.f9518w, null, i5, "_ev", w7VarQ2.u(str2, 40, true), str2 != null ? str2.length() : 0);
                    return;
                }
            }
        }
        c1363z35.b();
        C1363z3 c1363z37 = c1238j5.f9366a;
        C1333v5 c1333v5T = c1363z37.N().t(false);
        if (c1333v5T != null && !bundle.containsKey("_sc")) {
            c1333v5T.f9888d = true;
        }
        w7.B(c1333v5T, bundle, z3 && !z5);
        boolean zEquals = "am".equals(str5);
        boolean zH0 = w7.h0(str2);
        if (!z3 || c1238j5.f9499d == null || zH0) {
            z6 = zEquals;
        } else {
            if (!zEquals) {
                c1363z35.c().q().c("Passing event to registered event handler (FE)", c1363z35.F().d(str2), c1363z35.F().b(bundle));
                AbstractC0549h.j(c1238j5.f9499d);
                c1238j5.f9499d.a(str5, str2, bundle, j4);
                return;
            }
            z6 = true;
        }
        C1363z3 c1363z38 = c1238j5.f9366a;
        if (c1363z38.r()) {
            int iT0 = c1363z35.Q().t0(str2);
            if (iT0 != 0) {
                c1363z35.c().s().b("Invalid event name. Event will not be logged (FE)", c1363z35.F().d(str2));
                w7 w7VarQ3 = c1363z35.Q();
                c1363z35.B();
                c1363z38.Q().F(c1238j5.f9518w, str3, iT0, "_ev", w7VarQ3.u(str2, 40, true), str2 != null ? str2.length() : 0);
                return;
            }
            Bundle bundleO = c1363z35.Q().o(str3, str2, bundle, b1.e.b("_o", "_sn", "_sc", "_si"), z5);
            AbstractC0549h.j(bundleO);
            c1363z35.b();
            if (c1363z37.N().t(false) == null || !"_ae".equals(str2)) {
                i4 = 0;
                c1363z3 = c1363z37;
                j5 = 0;
            } else {
                C6 c6 = c1363z37.P().f8960f;
                j5 = 0;
                long jB = c6.f8930d.f9366a.f().b();
                i4 = 0;
                c1363z3 = c1363z37;
                long j8 = jB - c6.f8928b;
                c6.f8928b = jB;
                if (j8 > 0) {
                    c1363z35.Q().z(bundleO, j8);
                }
            }
            if (!"auto".equals(str5) && "_ssr".equals(str2)) {
                w7 w7VarQ4 = c1363z35.Q();
                String string = bundleO.getString("_ffr");
                if (b1.o.a(string)) {
                    string = null;
                } else if (string != null) {
                    string = string.trim();
                }
                C1363z3 c1363z39 = w7VarQ4.f9366a;
                if (Objects.equals(string, c1363z39.H().f9332x.a())) {
                    c1363z39.c().q().a("Not logging duplicate session_start_with_rollout event");
                    return;
                }
                c1363z39.H().f9332x.b(string);
            } else if ("_ae".equals(str2)) {
                String strA = c1363z35.Q().f9366a.H().f9332x.a();
                if (!TextUtils.isEmpty(strA)) {
                    bundleO.putString("_ffr", strA);
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(bundleO);
            boolean zT = c1363z35.B().P(null, AbstractC1291q2.f9727b1) ? c1363z3.P().t() : c1363z35.H().f9329u.b();
            if (c1363z35.H().f9326r.a() > j5) {
                c1363z32 = c1363z35;
                if (c1363z35.H().A(j4) && zT) {
                    c1363z32.c().v().a("Current session is expired, remove the session number, ID, and engagement time");
                    j6 = j5;
                    str4 = "_ae";
                    b0("auto", "_sid", null, c1363z32.f().a());
                    b0("auto", "_sno", null, c1363z32.f().a());
                    b0("auto", "_se", null, c1363z32.f().a());
                    c1238j5 = this;
                    c1363z32.H().f9327s.b(j6);
                } else {
                    j6 = j5;
                    str4 = "_ae";
                }
            } else {
                j6 = j5;
                str4 = "_ae";
                c1363z32 = c1363z35;
            }
            if (bundleO.getLong("extend_session", j6) == 1) {
                c1363z32.c().v().a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                j7 = j4;
                c1363z38.P().f8959e.b(j7, true);
            } else {
                j7 = j4;
            }
            ArrayList arrayList2 = new ArrayList(bundleO.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            for (int i6 = i4; i6 < size; i6++) {
                String str6 = (String) arrayList2.get(i6);
                if (str6 != null) {
                    c1363z32.Q();
                    Object obj = bundleO.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[1];
                        bundleArr[i4] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList3 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList3.toArray(new Bundle[arrayList3.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleO.putParcelableArray(str6, bundleArr);
                    }
                }
            }
            int i7 = i4;
            while (i7 < arrayList.size()) {
                Bundle bundleF0 = (Bundle) arrayList.get(i7);
                String str7 = i7 != 0 ? "_ep" : str2;
                bundleF0.putString("_o", str5);
                if (z4) {
                    bundleF0 = c1363z32.Q().F0(bundleF0, null);
                }
                Bundle bundle2 = bundleF0;
                c1363z3.O().z(new C1150J(str7, new C1148H(bundle2), str5, j7), str3);
                if (!z6) {
                    Iterator it = c1238j5.f9500e.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1277o4) it.next()).a(str, str2, new Bundle(bundle2), j4);
                    }
                }
                i7++;
                str5 = str;
                j7 = j4;
            }
            c1363z32.b();
            if (c1363z3.N().t(i4) == null || !str4.equals(str2)) {
                return;
            }
            c1363z3.P().f8960f.d(true, true, c1363z32.f().b());
        }
    }

    public final void I() {
        K6 k6;
        h();
        this.f9509n = false;
        if (v0().isEmpty() || this.f9504i || (k6 = (K6) v0().poll()) == null) {
            return;
        }
        C1363z3 c1363z3 = this.f9366a;
        AbstractC0573a abstractC0573aP = c1363z3.Q().p();
        if (abstractC0573aP != null) {
            this.f9504i = true;
            I2 i2V = c1363z3.c().v();
            String str = k6.f9121m;
            i2V.b("Registering trigger URI", str);
            InterfaceFutureC1495d interfaceFutureC1495dC = abstractC0573aP.c(Uri.parse(str));
            if (interfaceFutureC1495dC != null) {
                AbstractC1493b.a(interfaceFutureC1495dC, new G4(this, k6), new F4(this));
            } else {
                this.f9504i = false;
                v0().add(k6);
            }
        }
    }

    public final void J(InterfaceC1277o4 interfaceC1277o4) {
        i();
        AbstractC0549h.j(interfaceC1277o4);
        if (this.f9500e.add(interfaceC1277o4)) {
            return;
        }
        this.f9366a.c().w().a("OnEventListener already registered");
    }

    public final void K() {
        h();
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.c().q().a("Register tcfPrefChangeListener.");
        if (this.f9516u == null) {
            this.f9517v = new L4(this, this.f9366a);
            this.f9516u = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: k1.C4
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    C1238j5.o(this.f8916a, sharedPreferences, str);
                }
            };
        }
        c1363z3.H().o().registerOnSharedPreferenceChangeListener(this.f9516u);
    }

    public final void L(long j4) {
        this.f9502g.set(null);
        this.f9366a.e().A(new R4(this, j4));
    }

    public final void M(Runnable runnable) {
        C1363z3 c1363z3 = this.f9366a;
        if (c1363z3.B().P(null, AbstractC1291q2.f9707S0)) {
            i();
            if (c1363z3.e().E()) {
                c1363z3.c().r().a("Cannot retrieve and upload batches from analytics worker thread");
                return;
            }
            if (c1363z3.e().D()) {
                c1363z3.c().r().a("Cannot retrieve and upload batches from analytics network thread");
                return;
            }
            c1363z3.b();
            if (C1208g.a()) {
                c1363z3.c().r().a("Cannot retrieve and upload batches from main thread");
                return;
            }
            c1363z3.c().v().a("[sgtm] Started client-side batch upload work.");
            boolean z3 = false;
            int size = 0;
            int i4 = 0;
            while (!z3) {
                c1363z3.c().v().a("[sgtm] Getting upload batches from service (FE)");
                final AtomicReference atomicReference = new AtomicReference();
                c1363z3.e().r(atomicReference, 10000L, "[sgtm] Getting upload batches", new Runnable() { // from class: k1.y4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9982m.f9366a.O().w(atomicReference, S6.d(EnumC1317t5.SGTM_CLIENT));
                    }
                });
                U6 u6 = (U6) atomicReference.get();
                if (u6 == null) {
                    break;
                }
                List list = u6.f9258m;
                if (!list.isEmpty()) {
                    c1363z3.c().v().b("[sgtm] Retrieved upload batches. count", Integer.valueOf(list.size()));
                    size += list.size();
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z3 = false;
                            break;
                        }
                        EnumC1309s5 enumC1309s5F0 = f0((Q6) it.next());
                        if (enumC1309s5F0 == EnumC1309s5.SUCCESS) {
                            i4++;
                        } else if (enumC1309s5F0 == EnumC1309s5.BACKOFF) {
                            z3 = true;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            c1363z3.c().v().c("[sgtm] Completed client-side batch upload work. total, success", Integer.valueOf(size), Integer.valueOf(i4));
            runnable.run();
        }
    }

    public final void N(String str, String str2, long j4, Bundle bundle, boolean z3, boolean z4, boolean z5, String str3) {
        String[] strArr = w7.f9902i;
        Bundle bundle2 = new Bundle(bundle);
        for (String str4 : bundle2.keySet()) {
            Object obj = bundle2.get(str4);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str4, new Bundle((Bundle) obj));
            } else {
                int i4 = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i4 < parcelableArr.length) {
                        Parcelable parcelable = parcelableArr[i4];
                        if (parcelable instanceof Bundle) {
                            parcelableArr[i4] = new Bundle((Bundle) parcelable);
                        }
                        i4++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i4 < list.size()) {
                        Object obj2 = list.get(i4);
                        if (obj2 instanceof Bundle) {
                            list.set(i4, new Bundle((Bundle) obj2));
                        }
                        i4++;
                    }
                }
            }
        }
        this.f9366a.e().A(new M4(this, str, str2, j4, bundle2, z3, z4, z5, str3));
    }

    public final void O(String str, String str2, long j4, Object obj) {
        this.f9366a.e().A(new O4(this, str, str2, obj, j4));
    }

    public final void P(long j4) {
        h();
        if (this.f9507l == null) {
            this.f9507l = new E4(this, this.f9366a);
        }
        this.f9507l.d(j4);
    }

    public final void Q(String str) {
        this.f9502g.set(str);
    }

    public final void R(Bundle bundle) {
        S(bundle, this.f9366a.f().a());
    }

    public final void S(Bundle bundle, long j4) {
        AbstractC0549h.j(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            this.f9366a.c().w().a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC0549h.j(bundle2);
        AbstractC1195e4.a(bundle2, "app_id", String.class, null);
        AbstractC1195e4.a(bundle2, "origin", String.class, null);
        AbstractC1195e4.a(bundle2, "name", String.class, null);
        AbstractC1195e4.a(bundle2, "value", Object.class, null);
        AbstractC1195e4.a(bundle2, "trigger_event_name", String.class, null);
        AbstractC1195e4.a(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC1195e4.a(bundle2, "timed_out_event_name", String.class, null);
        AbstractC1195e4.a(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC1195e4.a(bundle2, "triggered_event_name", String.class, null);
        AbstractC1195e4.a(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC1195e4.a(bundle2, "time_to_live", Long.class, 0L);
        AbstractC1195e4.a(bundle2, "expired_event_name", String.class, null);
        AbstractC1195e4.a(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC0549h.d(bundle2.getString("name"));
        AbstractC0549h.d(bundle2.getString("origin"));
        AbstractC0549h.j(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j4);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        C1363z3 c1363z3 = this.f9366a;
        if (c1363z3.Q().w0(string) != 0) {
            c1363z3.c().r().b("Invalid conditional user property name", c1363z3.F().f(string));
            return;
        }
        if (c1363z3.Q().s0(string, obj) != 0) {
            c1363z3.c().r().c("Invalid conditional user property value", c1363z3.F().f(string), obj);
            return;
        }
        Object objS = c1363z3.Q().s(string, obj);
        if (objS == null) {
            c1363z3.c().r().c("Unable to normalize conditional user property value", c1363z3.F().f(string), obj);
            return;
        }
        AbstractC1195e4.b(bundle2, objS);
        long j5 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name"))) {
            c1363z3.B();
            if (j5 > 15552000000L || j5 < 1) {
                c1363z3.c().r().c("Invalid conditional user property timeout", c1363z3.F().f(string), Long.valueOf(j5));
                return;
            }
        }
        long j6 = bundle2.getLong("time_to_live");
        c1363z3.B();
        if (j6 > 15552000000L || j6 < 1) {
            c1363z3.c().r().c("Invalid conditional user property time to live", c1363z3.F().f(string), Long.valueOf(j6));
        } else {
            c1363z3.e().A(new S4(this, bundle2));
        }
    }

    public final void T(Bundle bundle, int i4, long j4) {
        Object obj;
        String string;
        i();
        C1229i4 c1229i4 = C1229i4.f9474c;
        EnumC1221h4[] enumC1221h4Arr = EnumC1213g4.STORAGE.f9446m;
        int length = enumC1221h4Arr.length;
        int i5 = 0;
        while (true) {
            obj = null;
            if (i5 >= length) {
                break;
            }
            String str = enumC1221h4Arr[i5].f9461m;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    obj = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    obj = Boolean.FALSE;
                }
                if (obj == null) {
                    obj = string;
                    break;
                }
            }
            i5++;
        }
        if (obj != null) {
            C1363z3 c1363z3 = this.f9366a;
            c1363z3.c().x().b("Ignoring invalid consent setting", obj);
            c1363z3.c().x().a("Valid consent values are 'granted', 'denied'");
        }
        boolean zE = this.f9366a.e().E();
        C1229i4 c1229i4I = C1229i4.i(bundle, i4);
        if (c1229i4I.t()) {
            Y(c1229i4I, zE);
        }
        C1143C c1143cC = C1143C.c(bundle, i4);
        if (c1143cC.k()) {
            U(c1143cC, zE);
        }
        Boolean boolG = C1143C.g(bundle);
        if (boolG != null) {
            String str2 = i4 == -30 ? "tcf" : "app";
            if (zE) {
                b0(str2, "allow_personalized_ads", boolG.toString(), j4);
            } else {
                a0(str2, "allow_personalized_ads", boolG.toString(), false, j4);
            }
        }
    }

    public final void U(C1143C c1143c, boolean z3) {
        RunnableC1187d5 runnableC1187d5 = new RunnableC1187d5(this, c1143c);
        if (!z3) {
            this.f9366a.e().A(runnableC1187d5);
        } else {
            h();
            runnableC1187d5.run();
        }
    }

    public final void V(InterfaceC1269n4 interfaceC1269n4) {
        InterfaceC1269n4 interfaceC1269n42;
        h();
        i();
        if (interfaceC1269n4 != null && interfaceC1269n4 != (interfaceC1269n42 = this.f9499d)) {
            AbstractC0549h.o(interfaceC1269n42 == null, "EventInterceptor already set.");
        }
        this.f9499d = interfaceC1269n4;
    }

    public final void W(Boolean bool) {
        i();
        this.f9366a.e().A(new RunnableC1178c5(this, bool));
    }

    public final void X(C1229i4 c1229i4) {
        h();
        boolean z3 = (c1229i4.r(EnumC1221h4.ANALYTICS_STORAGE) && c1229i4.r(EnumC1221h4.AD_STORAGE)) || this.f9366a.O().O();
        C1363z3 c1363z3 = this.f9366a;
        if (z3 != c1363z3.p()) {
            c1363z3.l(z3);
            Z2 z2H = this.f9366a.H();
            C1363z3 c1363z32 = z2H.f9366a;
            z2H.h();
            Boolean boolValueOf = z2H.p().contains("measurement_enabled_from_api") ? Boolean.valueOf(z2H.p().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z3 || boolValueOf == null || boolValueOf.booleanValue()) {
                g0(Boolean.valueOf(z3), false);
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:56:0x00d0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public final void Y(k1.C1229i4 r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1238j5.Y(k1.i4, boolean):void");
    }

    public final void Z(String str, String str2, Object obj, boolean z3) {
        a0(str, str2, obj, z3, this.f9366a.f().a());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(java.lang.String r17, java.lang.String r18, java.lang.Object r19, boolean r20, long r21) {
        /*
            r16 = this;
            r0 = r16
            r2 = r18
            r1 = r19
            r3 = 0
            r4 = 24
            if (r20 == 0) goto L17
            k1.z3 r5 = r0.f9366a
            k1.w7 r5 = r5.Q()
            int r5 = r5.w0(r2)
        L15:
            r12 = r5
            goto L41
        L17:
            k1.z3 r5 = r0.f9366a
            k1.w7 r5 = r5.Q()
            java.lang.String r6 = "user property"
            boolean r7 = r5.Z(r6, r2)
            r8 = 6
            if (r7 != 0) goto L28
        L26:
            r12 = r8
            goto L41
        L28:
            java.lang.String[] r7 = k1.AbstractC1261m4.f9577a
            r9 = 0
            boolean r7 = r5.W(r6, r7, r9, r2)
            if (r7 != 0) goto L34
            r5 = 15
            goto L15
        L34:
            k1.z3 r7 = r5.f9366a
            r7.B()
            boolean r5 = r5.V(r6, r4, r2)
            if (r5 != 0) goto L40
            goto L26
        L40:
            r12 = r3
        L41:
            r5 = 1
            if (r12 == 0) goto L67
            k1.z3 r1 = r0.f9366a
            k1.w7 r6 = r1.Q()
            r1.B()
            java.lang.String r14 = r6.u(r2, r4, r5)
            if (r2 == 0) goto L57
            int r3 = r2.length()
        L57:
            r15 = r3
            k1.z3 r1 = r0.f9366a
            k1.v7 r10 = r0.f9518w
            k1.w7 r9 = r1.Q()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.F(r10, r11, r12, r13, r14, r15)
            return
        L67:
            if (r17 != 0) goto L6c
            java.lang.String r6 = "app"
            goto L6e
        L6c:
            r6 = r17
        L6e:
            if (r1 == 0) goto Lbb
            k1.z3 r7 = r0.f9366a
            k1.w7 r8 = r7.Q()
            int r12 = r8.s0(r2, r1)
            if (r12 == 0) goto Laa
            k1.w7 r6 = r7.Q()
            r7.B()
            java.lang.String r14 = r6.u(r2, r4, r5)
            boolean r2 = r1 instanceof java.lang.String
            if (r2 != 0) goto L92
            boolean r2 = r1 instanceof java.lang.CharSequence
            if (r2 == 0) goto L90
            goto L92
        L90:
            r15 = r3
            goto L9b
        L92:
            java.lang.String r1 = r1.toString()
            int r3 = r1.length()
            goto L90
        L9b:
            k1.z3 r1 = r0.f9366a
            k1.v7 r10 = r0.f9518w
            k1.w7 r9 = r1.Q()
            r11 = 0
            java.lang.String r13 = "_ev"
            r9.F(r10, r11, r12, r13, r14, r15)
            return
        Laa:
            k1.w7 r3 = r7.Q()
            java.lang.Object r5 = r3.s(r2, r1)
            if (r5 == 0) goto Lba
            r3 = r21
            r1 = r6
            r0.O(r1, r2, r3, r5)
        Lba:
            return
        Lbb:
            r1 = r6
            r5 = 0
            r0 = r16
            r2 = r18
            r3 = r21
            r0.O(r1, r2, r3, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1238j5.a0(java.lang.String, java.lang.String, java.lang.Object, boolean, long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b0(java.lang.String r10, java.lang.String r11, java.lang.Object r12, long r13) {
        /*
            r9 = this;
            V0.AbstractC0549h.d(r10)
            V0.AbstractC0549h.d(r11)
            r9.h()
            r9.i()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L74
            boolean r0 = r12 instanceof java.lang.String
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L53
            r0 = r12
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L53
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.String r11 = r0.toLowerCase(r11)
            r12 = 1
            java.lang.String r0 = "false"
            boolean r11 = r0.equals(r11)
            r2 = 1
            if (r12 == r11) goto L37
            r11 = 0
            goto L38
        L37:
            r11 = r2
        L38:
            k1.z3 r4 = r9.f9366a
            java.lang.Long r12 = java.lang.Long.valueOf(r11)
            k1.Z2 r11 = r4.H()
            k1.X2 r11 = r11.f9323o
            long r4 = r12.longValue()
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L4e
            java.lang.String r0 = "true"
        L4e:
            r11.b(r0)
        L51:
            r11 = r1
            goto L63
        L53:
            if (r12 != 0) goto L63
            k1.z3 r11 = r9.f9366a
            k1.Z2 r11 = r11.H()
            k1.X2 r11 = r11.f9323o
            java.lang.String r0 = "unset"
            r11.b(r0)
            goto L51
        L63:
            k1.z3 r0 = r9.f9366a
            k1.K2 r0 = r0.c()
            k1.I2 r0 = r0.v()
            java.lang.String r1 = "Setting user property(FE)"
            java.lang.String r2 = "non_personalized_ads(_npa)"
            r0.c(r1, r2, r12)
        L74:
            r4 = r11
            r7 = r12
            k1.z3 r11 = r9.f9366a
            boolean r12 = r11.o()
            if (r12 != 0) goto L8e
            k1.z3 r10 = r9.f9366a
            k1.K2 r10 = r10.c()
            k1.I2 r10 = r10.v()
            java.lang.String r11 = "User property not set since app measurement is disabled"
            r10.a(r11)
            return
        L8e:
            boolean r11 = r11.r()
            if (r11 != 0) goto L95
            return
        L95:
            k1.z3 r11 = r9.f9366a
            k1.s7 r3 = new k1.s7
            r8 = r10
            r5 = r13
            r3.<init>(r4, r5, r7, r8)
            k1.m6 r10 = r11.O()
            r10.L(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1238j5.b0(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void c0(InterfaceC1277o4 interfaceC1277o4) {
        i();
        AbstractC0549h.j(interfaceC1277o4);
        if (this.f9500e.remove(interfaceC1277o4)) {
            return;
        }
        this.f9366a.c().w().a("OnEventListener had not been registered");
    }

    public final boolean d0() {
        return this.f9509n;
    }

    public final EnumC1309s5 f0(final Q6 q6) {
        try {
            URL url = new URI(q6.f9210o).toURL();
            final AtomicReference atomicReference = new AtomicReference();
            String strU = this.f9366a.D().u();
            C1363z3 c1363z3 = this.f9366a;
            I2 i2V = c1363z3.c().v();
            Long lValueOf = Long.valueOf(q6.f9208m);
            i2V.d("[sgtm] Uploading data from app. row_id, url, uncompressed size", lValueOf, q6.f9210o, Integer.valueOf(q6.f9209n.length));
            if (!TextUtils.isEmpty(q6.f9214s)) {
                c1363z3.c().v().c("[sgtm] Uploading data from app. row_id", lValueOf, q6.f9214s);
            }
            HashMap map = new HashMap();
            Bundle bundle = q6.f9211p;
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (!TextUtils.isEmpty(string)) {
                    map.put(str, string);
                }
            }
            C1286p5 c1286p5L = c1363z3.L();
            byte[] bArr = q6.f9209n;
            InterfaceC1254l5 interfaceC1254l5 = new InterfaceC1254l5() { // from class: k1.A4
                /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
                @Override // k1.InterfaceC1254l5
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map r11) {
                    /*
                        r6 = this;
                        k1.j5 r7 = r6.f8883a
                        r7.h()
                        k1.Q6 r10 = r3
                        r11 = 200(0xc8, float:2.8E-43)
                        if (r8 == r11) goto L14
                        r11 = 204(0xcc, float:2.86E-43)
                        if (r8 == r11) goto L14
                        r11 = 304(0x130, float:4.26E-43)
                        if (r8 != r11) goto L2e
                        r8 = r11
                    L14:
                        if (r9 != 0) goto L2e
                        k1.z3 r8 = r7.f9366a
                        k1.K2 r8 = r8.c()
                        k1.I2 r8 = r8.v()
                        long r0 = r10.f9208m
                        java.lang.Long r9 = java.lang.Long.valueOf(r0)
                        java.lang.String r11 = "[sgtm] Upload succeeded for row_id"
                        r8.b(r11, r9)
                        k1.s5 r8 = k1.EnumC1309s5.SUCCESS
                        goto L69
                    L2e:
                        k1.z3 r11 = r7.f9366a
                        k1.K2 r11 = r11.c()
                        k1.I2 r11 = r11.w()
                        long r0 = r10.f9208m
                        java.lang.Long r0 = java.lang.Long.valueOf(r0)
                        java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                        java.lang.String r2 = "[sgtm] Upload failed for row_id. response, exception"
                        r11.d(r2, r0, r1, r9)
                        k1.o2 r9 = k1.AbstractC1291q2.f9781u
                        r11 = 0
                        java.lang.Object r9 = r9.a(r11)
                        java.lang.String r9 = (java.lang.String) r9
                        java.lang.String r11 = ","
                        java.lang.String[] r9 = r9.split(r11)
                        java.util.List r9 = java.util.Arrays.asList(r9)
                        java.lang.String r8 = java.lang.String.valueOf(r8)
                        boolean r8 = r9.contains(r8)
                        if (r8 == 0) goto L67
                        k1.s5 r8 = k1.EnumC1309s5.BACKOFF
                        goto L69
                    L67:
                        k1.s5 r8 = k1.EnumC1309s5.FAILURE
                    L69:
                        java.util.concurrent.atomic.AtomicReference r9 = r2
                        k1.z3 r11 = r7.f9366a
                        k1.m6 r11 = r11.O()
                        k1.h r0 = new k1.h
                        long r1 = r10.f9208m
                        int r3 = r8.d()
                        long r4 = r10.f9213r
                        r0.<init>(r1, r3, r4)
                        r11.M(r0)
                        k1.z3 r7 = r7.f9366a
                        k1.K2 r7 = r7.c()
                        k1.I2 r7 = r7.v()
                        java.lang.Long r10 = java.lang.Long.valueOf(r1)
                        java.lang.String r11 = "[sgtm] Updated status for row_id"
                        r7.c(r11, r10, r8)
                        monitor-enter(r9)
                        r9.set(r8)     // Catch: java.lang.Throwable -> L9d
                        r9.notifyAll()     // Catch: java.lang.Throwable -> L9d
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        return
                    L9d:
                        r0 = move-exception
                        r7 = r0
                        monitor-exit(r9)     // Catch: java.lang.Throwable -> L9d
                        throw r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: k1.A4.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
                }
            };
            c1286p5L.k();
            AbstractC0549h.j(url);
            AbstractC0549h.j(bArr);
            AbstractC0549h.j(interfaceC1254l5);
            c1286p5L.f9366a.e().z(new RunnableC1278o5(c1286p5L, strU, url, bArr, map, interfaceC1254l5));
            try {
                C1363z3 c1363z32 = c1363z3.Q().f9366a;
                long jA = c1363z32.f().a() + 60000;
                synchronized (atomicReference) {
                    for (long jA2 = 60000; atomicReference.get() == null && jA2 > 0; jA2 = jA - c1363z32.f().a()) {
                        try {
                            atomicReference.wait(jA2);
                        } finally {
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f9366a.c().w().a("[sgtm] Interrupted waiting for uploading batch");
            }
            return atomicReference.get() == null ? EnumC1309s5.UNKNOWN : (EnumC1309s5) atomicReference.get();
        } catch (MalformedURLException | URISyntaxException e4) {
            this.f9366a.c().r().d("[sgtm] Bad upload url for row_id", q6.f9210o, Long.valueOf(q6.f9208m), e4);
            return EnumC1309s5.FAILURE;
        }
    }

    public final void g0(Boolean bool, boolean z3) {
        h();
        i();
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.c().q().b("Setting app measurement enabled (FE)", bool);
        c1363z3.H().x(bool);
        if (z3) {
            Z2 z2H = c1363z3.H();
            C1363z3 c1363z32 = z2H.f9366a;
            z2H.h();
            SharedPreferences.Editor editorEdit = z2H.p().edit();
            if (bool != null) {
                editorEdit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit.remove("measurement_enabled_from_api");
            }
            editorEdit.apply();
        }
        if (this.f9366a.p() || !(bool == null || bool.booleanValue())) {
            h0();
        }
    }

    public final int j0(String str) {
        AbstractC0549h.d(str);
        this.f9366a.B();
        return 25;
    }

    public final Boolean l0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) this.f9366a.e().r(atomicReference, 15000L, "boolean test flag value", new P4(this, atomicReference));
    }

    public final Double m0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) this.f9366a.e().r(atomicReference, 15000L, "double test flag value", new RunnableC1169b5(this, atomicReference));
    }

    @Override // k1.AbstractC1219h2
    public final boolean n() {
        return false;
    }

    public final Integer n0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) this.f9366a.e().r(atomicReference, 15000L, "int test flag value", new RunnableC1160a5(this, atomicReference));
    }

    public final Long o0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) this.f9366a.e().r(atomicReference, 15000L, "long test flag value", new Z4(this, atomicReference));
    }

    public final String p0() {
        return (String) this.f9502g.get();
    }

    public final String q0() {
        C1333v5 c1333v5S = this.f9366a.N().s();
        if (c1333v5S != null) {
            return c1333v5S.f9886b;
        }
        return null;
    }

    public final String r0() {
        C1333v5 c1333v5S = this.f9366a.N().s();
        if (c1333v5S != null) {
            return c1333v5S.f9885a;
        }
        return null;
    }

    public final String s0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) this.f9366a.e().r(atomicReference, 15000L, "String test flag value", new Y4(this, atomicReference));
    }

    public final ArrayList t0(String str, String str2) {
        C1363z3 c1363z3 = this.f9366a;
        if (c1363z3.e().E()) {
            c1363z3.c().r().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        c1363z3.b();
        if (C1208g.a()) {
            c1363z3.c().r().a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f9366a.e().r(atomicReference, 5000L, "get conditional user properties", new U4(this, atomicReference, null, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return w7.y(list);
        }
        c1363z3.c().r().b("Timed out waiting for get conditional user properties", null);
        return new ArrayList();
    }

    public final Map u0(String str, String str2, boolean z3) {
        C1363z3 c1363z3 = this.f9366a;
        if (c1363z3.e().E()) {
            c1363z3.c().r().a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        c1363z3.b();
        if (C1208g.a()) {
            c1363z3.c().r().a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.f9366a.e().r(atomicReference, 5000L, "get user properties", new V4(this, atomicReference, null, str, str2, z3));
        List<s7> list = (List) atomicReference.get();
        if (list == null) {
            c1363z3.c().r().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z3));
            return Collections.EMPTY_MAP;
        }
        C1475a c1475a = new C1475a(list.size());
        for (s7 s7Var : list) {
            Object objD = s7Var.d();
            if (objD != null) {
                c1475a.put(s7Var.f9845n, objD);
            }
        }
        return c1475a;
    }

    public final void v() {
        h();
        i();
        if (this.f9366a.r()) {
            C1363z3 c1363z3 = this.f9366a;
            C1264n c1264nB = c1363z3.B();
            c1264nB.f9366a.b();
            Boolean boolF = c1264nB.F("google_analytics_deferred_deep_link_enabled");
            if (boolF != null && boolF.booleanValue()) {
                c1363z3.c().q().a("Deferred Deep Link feature enabled.");
                c1363z3.e().A(new Runnable() { // from class: k1.B4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f8900m.A();
                    }
                });
            }
            this.f9366a.O().o();
            this.f9514s = false;
            Z2 z2H = c1363z3.H();
            z2H.h();
            String string = z2H.p().getString("previous_os_version", null);
            z2H.f9366a.C().k();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = z2H.p().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c1363z3.C().k();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            F("auto", "_ou", bundle);
        }
    }

    public final PriorityQueue v0() {
        if (this.f9508m == null) {
            this.f9508m = new PriorityQueue(Comparator.comparing(new Function() { // from class: k1.r4
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(((K6) obj).f9122n);
                }
            }, new Comparator() { // from class: k1.t4
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
                }
            }));
        }
        return this.f9508m;
    }

    public final void w() {
        h();
        AbstractC1141A abstractC1141A = this.f9507l;
        if (abstractC1141A != null) {
            abstractC1141A.b();
        }
    }

    public final void x(String str, String str2, Bundle bundle) {
        C1363z3 c1363z3 = this.f9366a;
        long jA = c1363z3.f().a();
        AbstractC0549h.d(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jA);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        c1363z3.e().A(new T4(this, bundle2));
    }

    public final void y() {
        C1363z3 c1363z3 = this.f9366a;
        if (!(c1363z3.d().getApplicationContext() instanceof Application) || this.f9498c == null) {
            return;
        }
        ((Application) c1363z3.d().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f9498c);
    }

    public final void z() {
        com.google.android.gms.internal.measurement.X6.b();
        C1363z3 c1363z3 = this.f9366a;
        if (c1363z3.B().P(null, AbstractC1291q2.f9717X0)) {
            if (c1363z3.e().E()) {
                c1363z3.c().r().a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            c1363z3.b();
            if (C1208g.a()) {
                c1363z3.c().r().a("Cannot get trigger URIs from main thread");
                return;
            }
            i();
            c1363z3.c().v().a("Getting trigger URIs (FE)");
            final AtomicReference atomicReference = new AtomicReference();
            c1363z3.e().r(atomicReference, 10000L, "get trigger URIs", new Runnable() { // from class: k1.u4
                @Override // java.lang.Runnable
                public final void run() {
                    C1238j5 c1238j5 = this.f9875m;
                    c1238j5.f9366a.O().v(atomicReference, c1238j5.f9366a.H().f9324p.a());
                }
            });
            final List list = (List) atomicReference.get();
            if (list == null) {
                c1363z3.c().r().a("Timed out waiting for get trigger URIs");
            } else {
                c1363z3.e().A(new Runnable() { // from class: k1.w4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C1238j5 c1238j5 = this.f9893m;
                        c1238j5.h();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        List<K6> list2 = list;
                        SparseArray sparseArrayR = c1238j5.f9366a.H().r();
                        for (K6 k6 : list2) {
                            int i4 = k6.f9123o;
                            if (!sparseArrayR.contains(i4) || ((Long) sparseArrayR.get(i4)).longValue() < k6.f9122n) {
                                c1238j5.v0().add(k6);
                            }
                        }
                        c1238j5.I();
                    }
                });
            }
        }
    }
}
