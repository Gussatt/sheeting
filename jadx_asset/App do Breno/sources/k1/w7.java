package k1;

import S0.C0513k;
import V0.AbstractC0549h;
import a0.AbstractC0573a;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import c1.C0663e;
import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public final class w7 extends AbstractC1177c4 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String[] f9902i = {"firebase_", "google_", "ga_"};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f9903j = {"_err"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SecureRandom f9904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicLong f9905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC0573a f9907f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f9908g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f9909h;

    public w7(C1363z3 c1363z3) {
        super(c1363z3);
        this.f9909h = null;
        this.f9905d = new AtomicLong(0L);
    }

    public static void B(C1333v5 c1333v5, Bundle bundle, boolean z3) {
        if (bundle != null && c1333v5 != null) {
            if (!bundle.containsKey("_sc") || z3) {
                String str = c1333v5.f9885a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = c1333v5.f9886b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", c1333v5.f9887c);
                return;
            }
            z3 = false;
        }
        if (bundle != null && c1333v5 == null && z3) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static long B0(byte[] bArr) {
        AbstractC0549h.j(bArr);
        int length = bArr.length;
        int i4 = 0;
        AbstractC0549h.n(length > 0);
        long j4 = 0;
        for (int i5 = length - 1; i5 >= 0 && i5 >= bArr.length - 8; i5--) {
            j4 += (((long) bArr[i5]) & 255) << i4;
            i4 += 8;
        }
        return j4;
    }

    public static boolean R(String str, String[] strArr) {
        AbstractC0549h.j(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean h0(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    public static boolean i0(String str) {
        AbstractC0549h.d(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    public static boolean j0(Context context) {
        ActivityInfo receiverInfo;
        AbstractC0549h.j(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean k0(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean l0(Context context, boolean z3) {
        AbstractC0549h.j(context);
        return k0(context, "com.google.android.gms.measurement.AppMeasurementJobService");
    }

    public static boolean m0(String str) {
        return !f9903j[0].equals(str);
    }

    public static final boolean r0(Bundle bundle, int i4) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", i4);
        return true;
    }

    public static MessageDigest w() {
        MessageDigest messageDigest;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static ArrayList y(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1232j c1232j = (C1232j) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", c1232j.f9481m);
            bundle.putString("origin", c1232j.f9482n);
            bundle.putLong("creation_timestamp", c1232j.f9484p);
            bundle.putString("name", c1232j.f9483o.f9845n);
            AbstractC1195e4.b(bundle, AbstractC0549h.j(c1232j.f9483o.d()));
            bundle.putBoolean("active", c1232j.f9485q);
            String str = c1232j.f9486r;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C1150J c1150j = c1232j.f9487s;
            if (c1150j != null) {
                bundle.putString("timed_out_event_name", c1150j.f9088m);
                C1148H c1148h = c1150j.f9089n;
                if (c1148h != null) {
                    bundle.putBundle("timed_out_event_params", c1148h.g());
                }
            }
            bundle.putLong("trigger_timeout", c1232j.f9488t);
            C1150J c1150j2 = c1232j.f9489u;
            if (c1150j2 != null) {
                bundle.putString("triggered_event_name", c1150j2.f9088m);
                C1148H c1148h2 = c1150j2.f9089n;
                if (c1148h2 != null) {
                    bundle.putBundle("triggered_event_params", c1148h2.g());
                }
            }
            bundle.putLong("triggered_timestamp", c1232j.f9483o.f9846o);
            bundle.putLong("time_to_live", c1232j.f9490v);
            C1150J c1150j3 = c1232j.f9491w;
            if (c1150j3 != null) {
                bundle.putString("expired_event_name", c1150j3.f9088m);
                C1148H c1148h3 = c1150j3.f9089n;
                if (c1148h3 != null) {
                    bundle.putBundle("expired_event_params", c1148h3.g());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public final void A(Bundle bundle, int i4, String str, Object obj) {
        if (r0(bundle, i4)) {
            this.f9366a.B();
            bundle.putString("_ev", u(str, 40, true));
            if (obj != null) {
                AbstractC0549h.j(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final long A0() {
        long j4;
        h();
        if (!T(this.f9366a.D().t())) {
            return 0L;
        }
        if (Build.VERSION.SDK_INT < 30) {
            j4 = 4;
        } else if (SdkExtensions.getExtensionVersion(30) < 4) {
            j4 = 8;
        } else {
            C1363z3 c1363z3 = this.f9366a;
            int iX0 = x0();
            c1363z3.B();
            j4 = iX0 < ((Integer) AbstractC1291q2.f9756l0.a(null)).intValue() ? 16L : 0L;
        }
        if (!b0("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")) {
            j4 |= 2;
        }
        if (j4 == 0 && !a0()) {
            j4 = 64;
        }
        if (j4 == 0) {
            return 1L;
        }
        return j4;
    }

    public final void C(Bundle bundle, Bundle bundle2) {
        if (bundle2 == null) {
            return;
        }
        for (String str : bundle2.keySet()) {
            if (!bundle.containsKey(str)) {
                this.f9366a.Q().G(bundle, str, bundle2.get(str));
            }
        }
    }

    public final long C0() {
        long andIncrement;
        long j4;
        AtomicLong atomicLong = this.f9905d;
        if (atomicLong.get() != 0) {
            AtomicLong atomicLong2 = this.f9905d;
            synchronized (atomicLong2) {
                atomicLong2.compareAndSet(-1L, 1L);
                andIncrement = atomicLong2.getAndIncrement();
            }
            return andIncrement;
        }
        synchronized (atomicLong) {
            long jNextLong = new Random(System.nanoTime() ^ this.f9366a.f().a()).nextLong();
            int i4 = this.f9906e + 1;
            this.f9906e = i4;
            j4 = jNextLong + ((long) i4);
        }
        return j4;
    }

    public final void D(Parcelable[] parcelableArr, int i4) {
        AbstractC0549h.j(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            int i5 = 0;
            boolean z3 = false;
            for (String str : new TreeSet(bundle.keySet())) {
                if (i0(str) && !R(str, AbstractC1245k4.f9527d) && (i5 = i5 + 1) > i4) {
                    C1363z3 c1363z3 = this.f9366a;
                    if (!c1363z3.B().P(null, AbstractC1291q2.f9778s1) || !z3) {
                        c1363z3.c().s().c("Param can't contain more than " + i4 + " item-scoped custom parameters", c1363z3.F().e(str), c1363z3.F().b(bundle));
                    }
                    r0(bundle, 28);
                    bundle.remove(str);
                    z3 = true;
                }
            }
        }
    }

    public final long D0(long j4, long j5) {
        return (j4 + (j5 * 60000)) / 86400000;
    }

    public final void E(L2 l22, int i4) {
        Bundle bundle = l22.f9127d;
        int i5 = 0;
        boolean z3 = false;
        for (String str : new TreeSet(bundle.keySet())) {
            if (i0(str) && (i5 = i5 + 1) > i4) {
                C1363z3 c1363z3 = this.f9366a;
                if (!c1363z3.B().P(null, AbstractC1291q2.f9778s1) || !z3) {
                    c1363z3.c().s().c("Event can't contain more than " + i4 + " params", c1363z3.F().d(l22.f9124a), c1363z3.F().b(bundle));
                    r0(bundle, 5);
                }
                bundle.remove(str);
                z3 = true;
            }
        }
    }

    public final Bundle E0(Uri uri) {
        String queryParameter;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        String queryParameter5;
        String queryParameter6;
        String queryParameter7;
        String queryParameter8;
        String queryParameter9;
        String str;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
                queryParameter5 = uri.getQueryParameter("gbraid");
                queryParameter6 = uri.getQueryParameter("utm_id");
                queryParameter7 = uri.getQueryParameter("dclid");
                queryParameter8 = uri.getQueryParameter("srsltid");
                queryParameter9 = uri.getQueryParameter("sfmc_id");
            } else {
                queryParameter = null;
                queryParameter2 = null;
                queryParameter3 = null;
                queryParameter4 = null;
                queryParameter5 = null;
                queryParameter6 = null;
                queryParameter7 = null;
                queryParameter8 = null;
                queryParameter9 = null;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3) && TextUtils.isEmpty(queryParameter4) && TextUtils.isEmpty(queryParameter5) && TextUtils.isEmpty(queryParameter6) && TextUtils.isEmpty(queryParameter7) && TextUtils.isEmpty(queryParameter8) && TextUtils.isEmpty(queryParameter9)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(queryParameter)) {
                str = "sfmc_id";
            } else {
                str = "sfmc_id";
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("gbraid", queryParameter5);
            }
            String queryParameter10 = uri.getQueryParameter("gad_source");
            if (!TextUtils.isEmpty(queryParameter10)) {
                bundle.putString("gad_source", queryParameter10);
            }
            String queryParameter11 = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter11)) {
                bundle.putString("term", queryParameter11);
            }
            String queryParameter12 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter12)) {
                bundle.putString("content", queryParameter12);
            }
            String queryParameter13 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter13)) {
                bundle.putString("aclid", queryParameter13);
            }
            String queryParameter14 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter14)) {
                bundle.putString("cp1", queryParameter14);
            }
            String queryParameter15 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter15)) {
                bundle.putString("anid", queryParameter15);
            }
            if (!TextUtils.isEmpty(queryParameter6)) {
                bundle.putString("campaign_id", queryParameter6);
            }
            if (!TextUtils.isEmpty(queryParameter7)) {
                bundle.putString("dclid", queryParameter7);
            }
            String queryParameter16 = uri.getQueryParameter("utm_source_platform");
            if (!TextUtils.isEmpty(queryParameter16)) {
                bundle.putString("source_platform", queryParameter16);
            }
            String queryParameter17 = uri.getQueryParameter("utm_creative_format");
            if (!TextUtils.isEmpty(queryParameter17)) {
                bundle.putString("creative_format", queryParameter17);
            }
            String queryParameter18 = uri.getQueryParameter("utm_marketing_tactic");
            if (!TextUtils.isEmpty(queryParameter18)) {
                bundle.putString("marketing_tactic", queryParameter18);
            }
            if (!TextUtils.isEmpty(queryParameter8)) {
                bundle.putString("srsltid", queryParameter8);
            }
            if (!TextUtils.isEmpty(queryParameter9)) {
                bundle.putString(str, queryParameter9);
            }
            return bundle;
        } catch (UnsupportedOperationException e4) {
            this.f9366a.c().w().b("Install referrer url isn't a hierarchical URI", e4);
            return null;
        }
    }

    public final void F(v7 v7Var, String str, int i4, String str2, String str3, int i5) {
        Bundle bundle = new Bundle();
        r0(bundle, i4);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i4 == 6 || i4 == 7 || i4 == 2) {
            bundle.putLong("_el", i5);
        }
        v7Var.a(str, "_err", bundle);
    }

    public final Bundle F0(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                Object objR = r(str2, bundle.get(str2));
                if (objR == null) {
                    C1363z3 c1363z3 = this.f9366a;
                    c1363z3.c().x().b("Param value can't be null", c1363z3.F().e(str2));
                } else {
                    G(bundle2, str2, objR);
                }
            }
        }
        return bundle2;
    }

    public final void G(Bundle bundle, String str, Object obj) {
        if (bundle == null) {
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            bundle.putString(str, String.valueOf(obj));
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Bundle[]) {
            bundle.putParcelableArray(str, (Bundle[]) obj);
        } else if (str != null) {
            String simpleName = obj != null ? obj.getClass().getSimpleName() : null;
            C1363z3 c1363z3 = this.f9366a;
            c1363z3.c().x().c("Not putting event parameter. Invalid value type. name, type", c1363z3.F().e(str), simpleName);
        }
    }

    public final void H(InterfaceC0887x0 interfaceC0887x0, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z3);
        try {
            interfaceC0887x0.k(bundle);
        } catch (RemoteException e4) {
            this.f9366a.c().w().b("Error returning boolean value to wrapper", e4);
        }
    }

    public final void I(InterfaceC0887x0 interfaceC0887x0, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            interfaceC0887x0.k(bundle);
        } catch (RemoteException e4) {
            this.f9366a.c().w().b("Error returning bundle list to wrapper", e4);
        }
    }

    public final void J(InterfaceC0887x0 interfaceC0887x0, Bundle bundle) {
        try {
            interfaceC0887x0.k(bundle);
        } catch (RemoteException e4) {
            this.f9366a.c().w().b("Error returning bundle value to wrapper", e4);
        }
    }

    public final void K(InterfaceC0887x0 interfaceC0887x0, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            interfaceC0887x0.k(bundle);
        } catch (RemoteException e4) {
            this.f9366a.c().w().b("Error returning byte array to wrapper", e4);
        }
    }

    public final void L(InterfaceC0887x0 interfaceC0887x0, int i4) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i4);
        try {
            interfaceC0887x0.k(bundle);
        } catch (RemoteException e4) {
            this.f9366a.c().w().b("Error returning int value to wrapper", e4);
        }
    }

    public final void M(InterfaceC0887x0 interfaceC0887x0, long j4) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j4);
        try {
            interfaceC0887x0.k(bundle);
        } catch (RemoteException e4) {
            this.f9366a.c().w().b("Error returning long value to wrapper", e4);
        }
    }

    public final void N(InterfaceC0887x0 interfaceC0887x0, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            interfaceC0887x0.k(bundle);
        } catch (RemoteException e4) {
            this.f9366a.c().w().b("Error returning string value to wrapper", e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int O(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.Object r16, android.os.Bundle r17, java.util.List r18, boolean r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.w7.O(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int P(String str) {
        if ("_ldl".equals(str)) {
            this.f9366a.B();
            return 2048;
        }
        if ("_id".equals(str)) {
            this.f9366a.B();
            return 256;
        }
        if ("_lgclid".equals(str)) {
            this.f9366a.B();
            return 100;
        }
        this.f9366a.B();
        return 36;
    }

    public final Object Q(int i4, Object obj, boolean z3, boolean z4, String str) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf(((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf(((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(true != ((Boolean) obj).booleanValue() ? 0L : 1L);
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
            return u(obj.toString(), i4, z3);
        }
        if (!z4 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Parcelable parcelable : (Parcelable[]) obj) {
            if (parcelable instanceof Bundle) {
                Bundle bundleF0 = F0((Bundle) parcelable, null);
                if (!bundleF0.isEmpty()) {
                    arrayList.add(bundleF0);
                }
            }
        }
        return arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public final void S(String str, String str2, String str3, Bundle bundle, List list, boolean z3) {
        int iV0;
        String str4;
        int iO;
        List list2 = list;
        if (bundle == null) {
            return;
        }
        C1363z3 c1363z3 = this.f9366a;
        int i4 = true != c1363z3.B().f9366a.Q().g0(231100000, true) ? 0 : 35;
        int i5 = 0;
        boolean z4 = false;
        for (String str5 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str5)) {
                iV0 = !z3 ? v0(str5) : 0;
                if (iV0 == 0) {
                    iV0 = u0(str5);
                }
            } else {
                iV0 = 0;
            }
            if (iV0 != 0) {
                A(bundle, iV0, str5, iV0 == 3 ? str5 : null);
                bundle.remove(str5);
            } else {
                if (d0(bundle.get(str5))) {
                    c1363z3.c().x().d("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str2, str3, str5);
                    iO = 22;
                    str4 = null;
                } else {
                    str4 = null;
                    iO = O(str, str2, str5, bundle.get(str5), bundle, list2, z3, false);
                }
                if (iO != 0 && !"_ev".equals(str5)) {
                    A(bundle, iO, str5, bundle.get(str5));
                    bundle.remove(str5);
                } else if (i0(str5) && !R(str5, AbstractC1245k4.f9527d)) {
                    i5++;
                    if (!g0(231100000, true)) {
                        c1363z3.c().s().c("Item array not supported on client's version of Google Play Services (Android Only)", c1363z3.F().d(str2), c1363z3.F().b(bundle));
                        r0(bundle, 23);
                        bundle.remove(str5);
                    } else if (i5 > i4) {
                        if (!c1363z3.B().P(str4, AbstractC1291q2.f9778s1) || !z4) {
                            c1363z3.c().s().c("Item can't contain more than " + i4 + " item-scoped custom params", c1363z3.F().d(str2), c1363z3.F().b(bundle));
                        }
                        r0(bundle, 28);
                        bundle.remove(str5);
                        list2 = list;
                        z4 = true;
                    }
                }
            }
            list2 = list;
        }
    }

    public final boolean T(String str) {
        String str2 = (String) AbstractC1291q2.f9774r0.a(null);
        return str2.equals("*") || Arrays.asList(str2.split(",")).contains(str);
    }

    public final boolean U(String str, String str2) {
        C1363z3 c1363z3 = this.f9366a;
        if (c1363z3.B().P(null, AbstractC1291q2.f9772q1)) {
            if (TextUtils.isEmpty(str)) {
                if (!this.f9366a.q()) {
                    return false;
                }
                c1363z3.c().s().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                return false;
            }
            if (p0(str)) {
                return true;
            }
            if (!this.f9366a.q()) {
                return false;
            }
            c1363z3.c().s().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", K2.z(str));
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2)) {
                if (this.f9366a.q()) {
                    c1363z3.c().s().a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            }
            if (!p0(str2)) {
                c1363z3.c().s().b("Invalid admob_app_id. Analytics disabled.", K2.z(str2));
                return false;
            }
        } else if (!p0(str)) {
            if (this.f9366a.q()) {
                c1363z3.c().s().b("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", K2.z(str));
            }
            return false;
        }
        return true;
    }

    public final boolean V(String str, int i4, String str2) {
        if (str2 == null) {
            this.f9366a.c().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.codePointCount(0, str2.length()) <= i4) {
            return true;
        }
        this.f9366a.c().s().d("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i4), str2);
        return false;
    }

    public final boolean W(String str, String[] strArr, String[] strArr2, String str2) {
        if (str2 == null) {
            this.f9366a.c().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        AbstractC0549h.j(str2);
        String[] strArr3 = f9902i;
        for (int i4 = 0; i4 < 3; i4++) {
            if (str2.startsWith(strArr3[i4])) {
                this.f9366a.c().s().c("Name starts with reserved prefix. Type, name", str, str2);
                return false;
            }
        }
        if (strArr == null || !R(str2, strArr)) {
            return true;
        }
        if (strArr2 != null && R(str2, strArr2)) {
            return true;
        }
        this.f9366a.c().s().c("Name is reserved. Type, name", str, str2);
        return false;
    }

    public final boolean X(String str, String str2, int i4, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String string = obj.toString();
            if (string.codePointCount(0, string.length()) > i4) {
                this.f9366a.c().x().d("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(string.length()));
                return false;
            }
        }
        return true;
    }

    public final boolean Y(String str, String str2) {
        if (str2 == null) {
            this.f9366a.c().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f9366a.c().s().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            if (iCodePointAt != 95) {
                this.f9366a.c().s().c("Name must start with a letter or _ (underscore). Type, name", str, str2);
                return false;
            }
            iCodePointAt = 95;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f9366a.c().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean Z(String str, String str2) {
        if (str2 == null) {
            this.f9366a.c().s().b("Name is required and can't be null. Type", str);
            return false;
        }
        if (str2.length() == 0) {
            this.f9366a.c().s().b("Name is required and can't be empty. Type", str);
            return false;
        }
        int iCodePointAt = str2.codePointAt(0);
        if (!Character.isLetter(iCodePointAt)) {
            this.f9366a.c().s().c("Name must start with a letter. Type, name", str, str2);
            return false;
        }
        int length = str2.length();
        int iCharCount = Character.charCount(iCodePointAt);
        while (iCharCount < length) {
            int iCodePointAt2 = str2.codePointAt(iCharCount);
            if (iCodePointAt2 != 95 && !Character.isLetterOrDigit(iCodePointAt2)) {
                this.f9366a.c().s().c("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                return false;
            }
            iCharCount += Character.charCount(iCodePointAt2);
        }
        return true;
    }

    public final boolean a0() {
        Object e4;
        Integer num;
        if (this.f9908g == null) {
            AbstractC0573a abstractC0573aP = p();
            boolean z3 = false;
            if (abstractC0573aP == null) {
                return false;
            }
            try {
                num = (Integer) abstractC0573aP.b().get(10000L, TimeUnit.MILLISECONDS);
                if (num != null) {
                    try {
                        if (num.intValue() == 1) {
                            z3 = true;
                        }
                    } catch (InterruptedException e5) {
                        e4 = e5;
                        this.f9366a.c().w().b("Measurement manager api exception", e4);
                        this.f9908g = Boolean.FALSE;
                    } catch (CancellationException e6) {
                        e4 = e6;
                        this.f9366a.c().w().b("Measurement manager api exception", e4);
                        this.f9908g = Boolean.FALSE;
                    } catch (ExecutionException e7) {
                        e4 = e7;
                        this.f9366a.c().w().b("Measurement manager api exception", e4);
                        this.f9908g = Boolean.FALSE;
                    } catch (TimeoutException e8) {
                        e4 = e8;
                        this.f9366a.c().w().b("Measurement manager api exception", e4);
                        this.f9908g = Boolean.FALSE;
                    }
                }
                this.f9908g = Boolean.valueOf(z3);
            } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e9) {
                e4 = e9;
                num = null;
            }
            this.f9366a.c().v().b("Measurement manager api status result", num);
        }
        return this.f9908g.booleanValue();
    }

    public final boolean b0(String str) {
        h();
        C1363z3 c1363z3 = this.f9366a;
        if (C0663e.a(c1363z3.d()).a(str) == 0) {
            return true;
        }
        c1363z3.c().q().b("Permission not granted", str);
        return false;
    }

    public final boolean c0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C1363z3 c1363z3 = this.f9366a;
        String strG = c1363z3.B().G();
        c1363z3.b();
        return strG.equals(str);
    }

    public final boolean d0(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean e0(Context context, String str) {
        Signature[] signatureArr;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfoD = C0663e.a(context).d(str, 64);
            if (packageInfoD == null || (signatureArr = packageInfoD.signatures) == null || signatureArr.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (PackageManager.NameNotFoundException e4) {
            this.f9366a.c().r().b("Package name not found", e4);
            return true;
        } catch (CertificateException e5) {
            this.f9366a.c().r().b("Error obtaining certificate", e5);
            return true;
        }
    }

    public final boolean f0() {
        h();
        return A0() == 1;
    }

    public final boolean g0(int i4, boolean z3) {
        Boolean boolZ = this.f9366a.O().Z();
        if (y0() < i4 / 1000) {
            return (boolZ == null || boolZ.booleanValue()) ? false : true;
        }
        return true;
    }

    @Override // k1.AbstractC1177c4
    public final void i() {
        h();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                this.f9366a.c().w().a("Utils falling back to Random for random id");
            }
        }
        this.f9905d.set(jNextLong);
    }

    @Override // k1.AbstractC1177c4
    public final boolean j() {
        return true;
    }

    public final boolean n0(String str, String str2) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            AbstractC0549h.j(str);
            if (!str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o(String str, String str2, Bundle bundle, List list, boolean z3) {
        int iV0;
        List list2 = list;
        boolean zR = R(str2, AbstractC1237j4.f9497d);
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = new Bundle(bundle);
        C1363z3 c1363z3 = this.f9366a;
        int iX = c1363z3.B().x();
        int i4 = 0;
        boolean z4 = false;
        for (String str3 : new TreeSet(bundle.keySet())) {
            if (list2 == null || !list2.contains(str3)) {
                iV0 = !z3 ? v0(str3) : 0;
                if (iV0 == 0) {
                    iV0 = u0(str3);
                }
            } else {
                iV0 = 0;
            }
            if (iV0 != 0) {
                A(bundle2, iV0, str3, iV0 == 3 ? str3 : null);
                bundle2.remove(str3);
            } else {
                int iO = O(str, str2, str3, bundle.get(str3), bundle2, list2, z3, zR);
                if (iO == 17) {
                    A(bundle2, 17, str3, Boolean.FALSE);
                } else if (iO != 0 && !"_ev".equals(str3)) {
                    A(bundle2, iO, iO == 21 ? str2 : str3, bundle.get(str3));
                    bundle2.remove(str3);
                }
                if (i0(str3) && (i4 = i4 + 1) > iX) {
                    if (!c1363z3.B().P(null, AbstractC1291q2.f9778s1) || !z4) {
                        c1363z3.c().s().c("Event can't contain more than " + iX + " params", c1363z3.F().d(str2), c1363z3.F().b(bundle));
                    }
                    r0(bundle2, 5);
                    bundle2.remove(str3);
                    z4 = true;
                }
            }
            list2 = list;
        }
        return bundle2;
    }

    public final boolean o0(String str, String str2, String str3, String str4) {
        if (this.f9366a.B().P(null, AbstractC1291q2.f9772q1)) {
            return n0(str, str2);
        }
        boolean zIsEmpty = TextUtils.isEmpty(str);
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty && !zIsEmpty2) {
            AbstractC0549h.j(str);
            return !str.equals(str2);
        }
        if (zIsEmpty && zIsEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (zIsEmpty) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public final AbstractC0573a p() {
        if (this.f9907f == null) {
            this.f9907f = AbstractC0573a.a(this.f9366a.d());
        }
        return this.f9907f;
    }

    public final boolean p0(String str) {
        AbstractC0549h.j(str);
        return str.matches(true != this.f9366a.B().P(null, AbstractC1291q2.f9772q1) ? "^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$" : "^1:\\d+:android:[a-f0-9]+$");
    }

    public final C1150J q(String str, String str2, Bundle bundle, String str3, long j4, boolean z3, boolean z4) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (t0(str2) != 0) {
            C1363z3 c1363z3 = this.f9366a;
            c1363z3.c().r().b("Invalid conditional property event name", c1363z3.F().f(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        Bundle bundleO = o(str, str2, bundle2, b1.e.a("_o"), true);
        if (z3) {
            bundleO = F0(bundleO, str);
        }
        AbstractC0549h.j(bundleO);
        return new C1150J(str2, new C1148H(bundleO), str3, j4);
    }

    public final byte[] q0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        } finally {
            parcelObtain.recycle();
        }
    }

    public final Object r(String str, Object obj) {
        if ("_ev".equals(str)) {
            return Q(this.f9366a.B().w(null, false), obj, true, true, null);
        }
        return Q(h0(str) ? this.f9366a.B().w(null, false) : this.f9366a.B().v(null, false), obj, false, true, null);
    }

    public final Object s(String str, Object obj) {
        return "_ldl".equals(str) ? Q(P(str), obj, true, false, null) : Q(P(str), obj, false, false, null);
    }

    public final int s0(String str, Object obj) {
        return "_ldl".equals(str) ? X("user property referrer", str, P(str), obj) : X("user property", str, P(str), obj) ? 0 : 7;
    }

    public final String t() {
        byte[] bArr = new byte[16];
        x().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final int t0(String str) {
        if (!Y("event", str)) {
            return 2;
        }
        if (!W("event", AbstractC1237j4.f9494a, AbstractC1237j4.f9495b, str)) {
            return 13;
        }
        this.f9366a.B();
        return !V("event", 40, str) ? 2 : 0;
    }

    public final String u(String str, int i4, boolean z3) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i4) {
            return str;
        }
        if (z3) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i4))).concat("...");
        }
        return null;
    }

    public final int u0(String str) {
        if (!Y("event param", str)) {
            return 3;
        }
        if (!W("event param", null, null, str)) {
            return 14;
        }
        this.f9366a.B();
        return !V("event param", 40, str) ? 3 : 0;
    }

    public final URL v(long j4, String str, String str2, long j5, String str3) {
        try {
            AbstractC0549h.d(str2);
            AbstractC0549h.d(str);
            String strConcat = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", String.format("v%s.%s", 119002L, Integer.valueOf(y0())), str2, str, Long.valueOf(j5));
            if (str.equals(this.f9366a.B().H())) {
                strConcat = strConcat.concat("&ddl_test=1");
            }
            if (!str3.isEmpty()) {
                if (str3.charAt(0) != '&') {
                    strConcat = strConcat.concat("&");
                }
                strConcat = strConcat.concat(str3);
            }
            return new URL(strConcat);
        } catch (IllegalArgumentException e4) {
            e = e4;
            this.f9366a.c().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        } catch (MalformedURLException e5) {
            e = e5;
            this.f9366a.c().r().b("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    public final int v0(String str) {
        if (!Z("event param", str)) {
            return 3;
        }
        if (!W("event param", null, null, str)) {
            return 14;
        }
        this.f9366a.B();
        return !V("event param", 40, str) ? 3 : 0;
    }

    public final int w0(String str) {
        if (!Y("user property", str)) {
            return 6;
        }
        if (!W("user property", AbstractC1261m4.f9577a, null, str)) {
            return 15;
        }
        this.f9366a.B();
        return !V("user property", 24, str) ? 6 : 0;
    }

    public final SecureRandom x() {
        h();
        if (this.f9904c == null) {
            this.f9904c = new SecureRandom();
        }
        return this.f9904c;
    }

    public final int x0() {
        if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
            return 0;
        }
        return SdkExtensions.getExtensionVersion(1000000);
    }

    public final int y0() {
        if (this.f9909h == null) {
            this.f9909h = Integer.valueOf(C0513k.f().a(this.f9366a.d()) / 1000);
        }
        return this.f9909h.intValue();
    }

    public final void z(Bundle bundle, long j4) {
        long j5 = bundle.getLong("_et");
        if (j5 != 0) {
            this.f9366a.c().w().b("Params already contained engagement", Long.valueOf(j5));
        } else {
            j5 = 0;
        }
        bundle.putLong("_et", j4 + j5);
    }

    public final int z0(int i4) {
        return C0513k.f().h(this.f9366a.d(), 12451000);
    }
}
