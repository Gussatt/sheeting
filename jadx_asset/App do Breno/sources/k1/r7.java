package k1;

import V0.AbstractC0549h;
import W0.b;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0702b;
import com.google.android.gms.internal.measurement.C0706b3;
import com.google.android.gms.internal.measurement.C0778j3;
import com.google.android.gms.internal.measurement.C0787k3;
import com.google.android.gms.internal.measurement.C0795l3;
import com.google.android.gms.internal.measurement.C0897y2;
import com.google.android.gms.internal.measurement.InterfaceC0852s5;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class r7 extends W6 {
    public r7(l7 l7Var) {
        super(l7Var);
    }

    public static final void A(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] strArrSplit = str.split(",");
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[strArrSplit.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                y(builder, str3, string, set);
            }
        }
    }

    public static final void B(StringBuilder sb, int i4, String str, com.google.android.gms.internal.measurement.Z2 z22) {
        if (z22 == null) {
            return;
        }
        x(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (z22.G() != 0) {
            x(sb, 4);
            sb.append("results: ");
            int i5 = 0;
            for (Long l4 : z22.N()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(l4);
                i5 = i6;
            }
            sb.append('\n');
        }
        if (z22.I() != 0) {
            x(sb, 4);
            sb.append("status: ");
            int i7 = 0;
            for (Long l5 : z22.P()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(l5);
                i7 = i8;
            }
            sb.append('\n');
        }
        if (z22.F() != 0) {
            x(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i9 = 0;
            for (com.google.android.gms.internal.measurement.G2 g22 : z22.M()) {
                int i10 = i9 + 1;
                if (i9 != 0) {
                    sb.append(", ");
                }
                sb.append(g22.M() ? Integer.valueOf(g22.F()) : null);
                sb.append(":");
                sb.append(g22.L() ? Long.valueOf(g22.G()) : null);
                i9 = i10;
            }
            sb.append("}\n");
        }
        if (z22.H() != 0) {
            x(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i11 = 0;
            for (C0706b3 c0706b3 : z22.O()) {
                int i12 = i11 + 1;
                if (i11 != 0) {
                    sb.append(", ");
                }
                sb.append(c0706b3.N() ? Integer.valueOf(c0706b3.G()) : null);
                sb.append(": [");
                Iterator it = c0706b3.K().iterator();
                int i13 = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i14 = i13 + 1;
                    if (i13 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jLongValue);
                    i13 = i14;
                }
                sb.append("]");
                i11 = i12;
            }
            sb.append("}\n");
        }
        x(sb, 3);
        sb.append("}\n");
    }

    public static final void C(StringBuilder sb, int i4, String str, Object obj) {
        if (obj == null) {
            return;
        }
        x(sb, i4 + 1);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void D(StringBuilder sb, int i4, String str, com.google.android.gms.internal.measurement.J1 j12) {
        if (j12 == null) {
            return;
        }
        x(sb, i4);
        sb.append(str);
        sb.append(" {\n");
        if (j12.L()) {
            int iQ = j12.Q();
            C(sb, i4, "comparison_type", iQ != 1 ? iQ != 2 ? iQ != 3 ? iQ != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (j12.N()) {
            C(sb, i4, "match_as_float", Boolean.valueOf(j12.K()));
        }
        if (j12.M()) {
            C(sb, i4, "comparison_value", j12.H());
        }
        if (j12.P()) {
            C(sb, i4, "min_comparison_value", j12.J());
        }
        if (j12.O()) {
            C(sb, i4, "max_comparison_value", j12.I());
        }
        x(sb, i4);
        sb.append("}\n");
    }

    public static int E(com.google.android.gms.internal.measurement.S2 s22, String str) {
        for (int i4 = 0; i4 < s22.O0(); i4++) {
            if (str.equals(s22.Z(i4).L())) {
                return i4;
            }
        }
        return -1;
    }

    public static InterfaceC0852s5 M(InterfaceC0852s5 interfaceC0852s5, byte[] bArr) {
        com.google.android.gms.internal.measurement.L4 l4A = com.google.android.gms.internal.measurement.L4.a();
        return l4A != null ? interfaceC0852s5.f(bArr, l4A) : interfaceC0852s5.j(bArr);
    }

    public static List R(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i4 = 0; i4 < length; i4++) {
            long j4 = 0;
            for (int i5 = 0; i5 < 64; i5++) {
                int i6 = (i4 * 64) + i5;
                if (i6 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i6)) {
                    j4 |= 1 << i5;
                }
            }
            arrayList.add(Long.valueOf(j4));
        }
        return arrayList;
    }

    public static boolean V(List list, int i4) {
        if (i4 < list.size() * 64) {
            return ((1 << (i4 % 64)) & ((Long) list.get(i4 / 64)).longValue()) != 0;
        }
        return false;
    }

    public static boolean m(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static Bundle[] o(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.M2 m22 = (com.google.android.gms.internal.measurement.M2) it.next();
            if (m22 != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.M2 m23 : m22.N()) {
                    if (m23.c0()) {
                        bundle.putString(m23.L(), m23.M());
                    } else if (m23.a0()) {
                        bundle.putLong(m23.L(), m23.I());
                    } else if (m23.Y()) {
                        bundle.putDouble(m23.L(), m23.F());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static final void p(com.google.android.gms.internal.measurement.H2 h22, String str, Object obj) {
        List listJ = h22.J();
        int i4 = 0;
        while (true) {
            if (i4 >= listJ.size()) {
                i4 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.M2) listJ.get(i4)).L())) {
                break;
            } else {
                i4++;
            }
        }
        com.google.android.gms.internal.measurement.L2 l2J = com.google.android.gms.internal.measurement.M2.J();
        l2J.D(str);
        l2J.C(((Long) obj).longValue());
        if (i4 >= 0) {
            h22.D(i4, l2J);
        } else {
            h22.y(l2J);
        }
    }

    public static final boolean q(C1150J c1150j, x7 x7Var) {
        AbstractC0549h.j(c1150j);
        AbstractC0549h.j(x7Var);
        return (TextUtils.isEmpty(x7Var.f9968n) && TextUtils.isEmpty(x7Var.f9949B)) ? false : true;
    }

    public static final Bundle r(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.M2 m22 = (com.google.android.gms.internal.measurement.M2) it.next();
            String strL = m22.L();
            if (m22.Y()) {
                bundle.putDouble(strL, m22.F());
            } else if (m22.Z()) {
                bundle.putFloat(strL, m22.G());
            } else if (m22.c0()) {
                bundle.putString(strL, m22.M());
            } else if (m22.a0()) {
                bundle.putLong(strL, m22.I());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.M2 s(com.google.android.gms.internal.measurement.I2 i22, String str) {
        for (com.google.android.gms.internal.measurement.M2 m22 : i22.N()) {
            if (m22.L().equals(str)) {
                return m22;
            }
        }
        return null;
    }

    public static final Object t(com.google.android.gms.internal.measurement.I2 i22, String str) {
        com.google.android.gms.internal.measurement.M2 m2S = s(i22, str);
        if (m2S == null) {
            return null;
        }
        if (m2S.c0()) {
            return m2S.M();
        }
        if (m2S.a0()) {
            return Long.valueOf(m2S.I());
        }
        if (m2S.Y()) {
            return Double.valueOf(m2S.F());
        }
        if (m2S.H() > 0) {
            return o(m2S.N());
        }
        return null;
    }

    public static final Object u(com.google.android.gms.internal.measurement.I2 i22, String str, Object obj) {
        Object objT = t(i22, str);
        return objT == null ? obj : objT;
    }

    public static final void x(StringBuilder sb, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append("  ");
        }
    }

    public static final void y(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String z(boolean z3, boolean z4, boolean z5) {
        StringBuilder sb = new StringBuilder();
        if (z3) {
            sb.append("Dynamic ");
        }
        if (z4) {
            sb.append("Sequence ");
        }
        if (z5) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public final long F(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return G(str.getBytes(Charset.forName("UTF-8")));
    }

    public final long G(byte[] bArr) {
        AbstractC0549h.j(bArr);
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.Q().h();
        MessageDigest messageDigestW = w7.w();
        if (messageDigestW != null) {
            return w7.B0(messageDigestW.digest(bArr));
        }
        c1363z3.c().r().a("Failed to get MD5");
        return 0L;
    }

    public final Bundle H(Map map, boolean z3) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z3) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add(H((Map) arrayList.get(i4), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public final Parcelable I(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                parcelObtain.unmarshall(bArr, 0, bArr.length);
                parcelObtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(parcelObtain);
            } catch (b.a unused) {
                this.f9366a.c().r().a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final C1150J J(C0702b c0702b) {
        Object obj;
        Bundle bundleH = H(c0702b.f(), true);
        String string = (!bundleH.containsKey("_o") || (obj = bundleH.get("_o")) == null) ? "app" : obj.toString();
        String strB = AbstractC1237j4.b(c0702b.e());
        if (strB == null) {
            strB = c0702b.e();
        }
        return new C1150J(strB, new C1148H(bundleH), string, c0702b.a());
    }

    public final K6 K(String str, com.google.android.gms.internal.measurement.S2 s22, com.google.android.gms.internal.measurement.H2 h22, String str2) {
        int iIndexOf;
        com.google.android.gms.internal.measurement.X6.b();
        C1363z3 c1363z3 = this.f9366a;
        if (!c1363z3.B().P(str, AbstractC1291q2.f9715W0)) {
            return null;
        }
        long jA = c1363z3.f().a();
        String[] strArrSplit = c1363z3.B().J(str, AbstractC1291q2.f9782u0).split(",");
        HashSet hashSet = new HashSet(strArrSplit.length);
        for (String str3 : strArrSplit) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: ".concat(str3));
            }
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        l7 l7Var = this.f9189b;
        Y6 y6R0 = l7Var.R0();
        String strH = y6R0.f9189b.K0().H(str);
        Uri.Builder builder = new Uri.Builder();
        C1363z3 c1363z32 = y6R0.f9366a;
        builder.scheme(c1363z32.B().J(str, AbstractC1291q2.f9762n0));
        if (TextUtils.isEmpty(strH)) {
            builder.authority(c1363z32.B().J(str, AbstractC1291q2.f9765o0));
        } else {
            builder.authority(strH + "." + c1363z32.B().J(str, AbstractC1291q2.f9765o0));
        }
        builder.path(c1363z32.B().J(str, AbstractC1291q2.f9768p0));
        y(builder, "gmp_app_id", s22.e0(), setUnmodifiableSet);
        c1363z3.B().B();
        y(builder, "gmp_version", String.valueOf(119002L), setUnmodifiableSet);
        String strB0 = s22.b0();
        C1264n c1264nB = c1363z3.B();
        C1275o2 c1275o2 = AbstractC1291q2.f9721Z0;
        if (c1264nB.P(str, c1275o2) && l7Var.K0().m(str)) {
            strB0 = "";
        }
        y(builder, "app_instance_id", strB0, setUnmodifiableSet);
        y(builder, "rdid", s22.g0(), setUnmodifiableSet);
        y(builder, "bundle_id", s22.a0(), setUnmodifiableSet);
        String strI = h22.I();
        String strA = AbstractC1237j4.a(strI);
        if (true != TextUtils.isEmpty(strA)) {
            strI = strA;
        }
        y(builder, "app_event_name", strI, setUnmodifiableSet);
        y(builder, "app_version", String.valueOf(s22.M0()), setUnmodifiableSet);
        String strF0 = s22.f0();
        if (c1363z3.B().P(str, c1275o2) && l7Var.K0().q(str) && !TextUtils.isEmpty(strF0) && (iIndexOf = strF0.indexOf(".")) != -1) {
            strF0 = strF0.substring(0, iIndexOf);
        }
        y(builder, "os_version", strF0, setUnmodifiableSet);
        y(builder, "timestamp", String.valueOf(h22.w()), setUnmodifiableSet);
        if (s22.k0()) {
            y(builder, "lat", "1", setUnmodifiableSet);
        }
        y(builder, "privacy_sandbox_version", String.valueOf(s22.U()), setUnmodifiableSet);
        y(builder, "trigger_uri_source", "1", setUnmodifiableSet);
        y(builder, "trigger_uri_timestamp", String.valueOf(jA), setUnmodifiableSet);
        y(builder, "request_uuid", str2, setUnmodifiableSet);
        List<com.google.android.gms.internal.measurement.M2> listJ = h22.J();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.M2 m22 : listJ) {
            String strL = m22.L();
            if (m22.Y()) {
                bundle.putString(strL, String.valueOf(m22.F()));
            } else if (m22.Z()) {
                bundle.putString(strL, String.valueOf(m22.G()));
            } else if (m22.c0()) {
                bundle.putString(strL, m22.M());
            } else if (m22.a0()) {
                bundle.putString(strL, String.valueOf(m22.I()));
            }
        }
        A(builder, c1363z3.B().J(str, AbstractC1291q2.f9780t0).split("\\|"), bundle, setUnmodifiableSet);
        List<C0795l3> listI0 = s22.i0();
        Bundle bundle2 = new Bundle();
        for (C0795l3 c0795l3 : listI0) {
            String strL2 = c0795l3.L();
            if (c0795l3.V()) {
                bundle2.putString(strL2, String.valueOf(c0795l3.F()));
            } else if (c0795l3.W()) {
                bundle2.putString(strL2, String.valueOf(c0795l3.G()));
            } else if (c0795l3.Z()) {
                bundle2.putString(strL2, c0795l3.M());
            } else if (c0795l3.X()) {
                bundle2.putString(strL2, String.valueOf(c0795l3.H()));
            }
        }
        A(builder, c1363z3.B().J(str, AbstractC1291q2.f9777s0).split("\\|"), bundle2, setUnmodifiableSet);
        y(builder, "dma", true != s22.j0() ? "0" : "1", setUnmodifiableSet);
        if (!s22.d0().isEmpty()) {
            y(builder, "dma_cps", s22.d0(), setUnmodifiableSet);
        }
        if (s22.l0()) {
            C0897y2 c0897y2R0 = s22.R0();
            if (!c0897y2R0.U().isEmpty()) {
                y(builder, "dl_gclid", c0897y2R0.U(), setUnmodifiableSet);
            }
            if (!c0897y2R0.T().isEmpty()) {
                y(builder, "dl_gbraid", c0897y2R0.T(), setUnmodifiableSet);
            }
            if (!c0897y2R0.S().isEmpty()) {
                y(builder, "dl_gs", c0897y2R0.S(), setUnmodifiableSet);
            }
            if (c0897y2R0.N() > 0) {
                y(builder, "dl_ss_ts", String.valueOf(c0897y2R0.N()), setUnmodifiableSet);
            }
            if (!c0897y2R0.X().isEmpty()) {
                y(builder, "mr_gclid", c0897y2R0.X(), setUnmodifiableSet);
            }
            if (!c0897y2R0.W().isEmpty()) {
                y(builder, "mr_gbraid", c0897y2R0.W(), setUnmodifiableSet);
            }
            if (!c0897y2R0.V().isEmpty()) {
                y(builder, "mr_gs", c0897y2R0.V(), setUnmodifiableSet);
            }
            if (c0897y2R0.O() > 0) {
                y(builder, "mr_click_ts", String.valueOf(c0897y2R0.O()), setUnmodifiableSet);
            }
        }
        return new K6(builder.build().toString(), jA, 1);
    }

    public final com.google.android.gms.internal.measurement.I2 L(C1145E c1145e) {
        com.google.android.gms.internal.measurement.H2 h2J = com.google.android.gms.internal.measurement.I2.J();
        h2J.F(c1145e.f8946e);
        C1148H c1148h = c1145e.f8947f;
        C1147G c1147g = new C1147G(c1148h);
        while (c1147g.hasNext()) {
            String next = c1147g.next();
            com.google.android.gms.internal.measurement.L2 l2J = com.google.android.gms.internal.measurement.M2.J();
            l2J.D(next);
            Object objK = c1148h.k(next);
            AbstractC0549h.j(objK);
            T(l2J, objK);
            h2J.y(l2J);
        }
        String str = c1145e.f8944c;
        if (!TextUtils.isEmpty(str) && c1148h.k("_o") == null) {
            com.google.android.gms.internal.measurement.L2 l2J2 = com.google.android.gms.internal.measurement.M2.J();
            l2J2.D("_o");
            l2J2.E(str);
            h2J.z((com.google.android.gms.internal.measurement.M2) l2J2.q());
        }
        return (com.google.android.gms.internal.measurement.I2) h2J.q();
    }

    public final String N(com.google.android.gms.internal.measurement.R2 r22) {
        com.google.android.gms.internal.measurement.C2 c2D2;
        if (r22 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        if (r22.U()) {
            C(sb, 0, "upload_subdomain", r22.L());
        }
        if (r22.T()) {
            C(sb, 0, "sgtm_join_id", r22.K());
        }
        for (com.google.android.gms.internal.measurement.T2 t22 : r22.M()) {
            if (t22 != null) {
                x(sb, 1);
                sb.append("bundle {\n");
                if (t22.x1()) {
                    C(sb, 1, "protocol_version", Integer.valueOf(t22.m2()));
                }
                com.google.android.gms.internal.measurement.k7.b();
                C1363z3 c1363z3 = this.f9366a;
                if (c1363z3.B().P(t22.K(), AbstractC1291q2.f9695M0) && t22.A1()) {
                    C(sb, 1, "session_stitching_token", t22.Z());
                }
                C(sb, 1, "platform", t22.X());
                if (t22.s1()) {
                    C(sb, 1, "gmp_version", Long.valueOf(t22.v2()));
                }
                if (t22.G1()) {
                    C(sb, 1, "uploading_gmp_version", Long.valueOf(t22.B2()));
                }
                if (t22.q1()) {
                    C(sb, 1, "dynamite_version", Long.valueOf(t22.t2()));
                }
                if (t22.j1()) {
                    C(sb, 1, "config_version", Long.valueOf(t22.r2()));
                }
                C(sb, 1, "gmp_app_id", t22.U());
                C(sb, 1, "admob_app_id", t22.J());
                C(sb, 1, "app_id", t22.K());
                C(sb, 1, "app_version", t22.N());
                if (t22.f2()) {
                    C(sb, 1, "app_version_major", Integer.valueOf(t22.g1()));
                }
                C(sb, 1, "firebase_instance_id", t22.T());
                if (t22.o1()) {
                    C(sb, 1, "dev_cert_hash", Long.valueOf(t22.s2()));
                }
                C(sb, 1, "app_store", t22.M());
                if (t22.F1()) {
                    C(sb, 1, "upload_timestamp_millis", Long.valueOf(t22.A2()));
                }
                if (t22.C1()) {
                    C(sb, 1, "start_timestamp_millis", Long.valueOf(t22.y2()));
                }
                if (t22.r1()) {
                    C(sb, 1, "end_timestamp_millis", Long.valueOf(t22.u2()));
                }
                if (t22.w1()) {
                    C(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(t22.x2()));
                }
                if (t22.v1()) {
                    C(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(t22.w2()));
                }
                C(sb, 1, "app_instance_id", t22.L());
                C(sb, 1, "resettable_device_id", t22.Y());
                C(sb, 1, "ds_id", t22.S());
                if (t22.u1()) {
                    C(sb, 1, "limited_ad_tracking", Boolean.valueOf(t22.c2()));
                }
                C(sb, 1, "os_version", t22.W());
                C(sb, 1, "device_model", t22.R());
                C(sb, 1, "user_default_language", t22.a0());
                if (t22.E1()) {
                    C(sb, 1, "time_zone_offset_minutes", Integer.valueOf(t22.o2()));
                }
                if (t22.i1()) {
                    C(sb, 1, "bundle_sequential_index", Integer.valueOf(t22.h2()));
                }
                if (t22.n1()) {
                    C(sb, 1, "delivery_index", Integer.valueOf(t22.k2()));
                }
                if (t22.z1()) {
                    C(sb, 1, "service_upload", Boolean.valueOf(t22.d2()));
                }
                C(sb, 1, "health_monitor", t22.V());
                if (t22.y1()) {
                    C(sb, 1, "retry_counter", Integer.valueOf(t22.n2()));
                }
                if (t22.l1()) {
                    C(sb, 1, "consent_signals", t22.P());
                }
                if (t22.t1()) {
                    C(sb, 1, "is_dma_region", Boolean.valueOf(t22.b2()));
                }
                if (t22.m1()) {
                    C(sb, 1, "core_platform_services", t22.Q());
                }
                if (t22.k1()) {
                    C(sb, 1, "consent_diagnostics", t22.O());
                }
                if (t22.D1()) {
                    C(sb, 1, "target_os_version", Long.valueOf(t22.z2()));
                }
                com.google.android.gms.internal.measurement.X6.b();
                if (c1363z3.B().P(t22.K(), AbstractC1291q2.f9715W0)) {
                    C(sb, 1, "ad_services_version", Integer.valueOf(t22.f0()));
                    if (t22.g2() && (c2D2 = t22.D2()) != null) {
                        x(sb, 2);
                        sb.append("attribution_eligibility_status {\n");
                        C(sb, 2, "eligible", Boolean.valueOf(c2D2.R()));
                        C(sb, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(c2D2.T()));
                        C(sb, 2, "pre_r", Boolean.valueOf(c2D2.U()));
                        C(sb, 2, "r_extensions_too_old", Boolean.valueOf(c2D2.V()));
                        C(sb, 2, "adservices_extension_too_old", Boolean.valueOf(c2D2.Q()));
                        C(sb, 2, "ad_storage_not_allowed", Boolean.valueOf(c2D2.P()));
                        C(sb, 2, "measurement_manager_disabled", Boolean.valueOf(c2D2.S()));
                        x(sb, 2);
                        sb.append("}\n");
                    }
                }
                if (t22.e2()) {
                    C0897y2 c0897y2C2 = t22.C2();
                    x(sb, 2);
                    sb.append("ad_campaign_info {\n");
                    if (c0897y2C2.H()) {
                        C(sb, 2, "deep_link_gclid", c0897y2C2.U());
                    }
                    if (c0897y2C2.G()) {
                        C(sb, 2, "deep_link_gbraid", c0897y2C2.T());
                    }
                    if (c0897y2C2.F()) {
                        C(sb, 2, "deep_link_gad_source", c0897y2C2.S());
                    }
                    if (c0897y2C2.I()) {
                        C(sb, 2, "deep_link_session_millis", Long.valueOf(c0897y2C2.N()));
                    }
                    if (c0897y2C2.M()) {
                        C(sb, 2, "market_referrer_gclid", c0897y2C2.X());
                    }
                    if (c0897y2C2.L()) {
                        C(sb, 2, "market_referrer_gbraid", c0897y2C2.W());
                    }
                    if (c0897y2C2.K()) {
                        C(sb, 2, "market_referrer_gad_source", c0897y2C2.V());
                    }
                    if (c0897y2C2.J()) {
                        C(sb, 2, "market_referrer_click_millis", Long.valueOf(c0897y2C2.O()));
                    }
                    x(sb, 2);
                    sb.append("}\n");
                }
                if (t22.h1()) {
                    C(sb, 1, "batching_timestamp_millis", Long.valueOf(t22.q2()));
                }
                if (t22.B1()) {
                    C0778j3 c0778j3H = t22.H();
                    x(sb, 2);
                    sb.append("sgtm_diagnostics {\n");
                    int iL = c0778j3H.L();
                    C(sb, 2, "upload_type", iL != 1 ? iL != 2 ? iL != 3 ? iL != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    C(sb, 2, "client_upload_eligibility", c0778j3H.G().name());
                    int iK = c0778j3H.K();
                    C(sb, 2, "service_upload_eligibility", iK != 1 ? iK != 2 ? iK != 3 ? iK != 4 ? iK != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    x(sb, 2);
                    sb.append("}\n");
                }
                List<C0795l3> listD0 = t22.d0();
                if (listD0 != null) {
                    for (C0795l3 c0795l3 : listD0) {
                        if (c0795l3 != null) {
                            x(sb, 2);
                            sb.append("user_property {\n");
                            C(sb, 2, "set_timestamp_millis", c0795l3.Y() ? Long.valueOf(c0795l3.I()) : null);
                            C(sb, 2, "name", c1363z3.F().f(c0795l3.L()));
                            C(sb, 2, "string_value", c0795l3.M());
                            C(sb, 2, "int_value", c0795l3.X() ? Long.valueOf(c0795l3.H()) : null);
                            C(sb, 2, "double_value", c0795l3.V() ? Double.valueOf(c0795l3.F()) : null);
                            x(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.E2> listB0 = t22.b0();
                if (listB0 != null) {
                    for (com.google.android.gms.internal.measurement.E2 e22 : listB0) {
                        if (e22 != null) {
                            x(sb, 2);
                            sb.append("audience_membership {\n");
                            if (e22.P()) {
                                C(sb, 2, "audience_id", Integer.valueOf(e22.F()));
                            }
                            if (e22.Q()) {
                                C(sb, 2, "new_audience", Boolean.valueOf(e22.O()));
                            }
                            B(sb, 2, "current_data", e22.I());
                            if (e22.R()) {
                                B(sb, 2, "previous_data", e22.J());
                            }
                            x(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.I2> listC0 = t22.c0();
                if (listC0 != null) {
                    for (com.google.android.gms.internal.measurement.I2 i22 : listC0) {
                        if (i22 != null) {
                            x(sb, 2);
                            sb.append("event {\n");
                            C(sb, 2, "name", c1363z3.F().d(i22.M()));
                            if (i22.Y()) {
                                C(sb, 2, "timestamp_millis", Long.valueOf(i22.I()));
                            }
                            if (i22.X()) {
                                C(sb, 2, "previous_timestamp_millis", Long.valueOf(i22.H()));
                            }
                            if (i22.W()) {
                                C(sb, 2, "count", Integer.valueOf(i22.F()));
                            }
                            if (i22.G() != 0) {
                                v(sb, 2, i22.N());
                            }
                            x(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                x(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("} // End-of-batch\n");
        return sb.toString();
    }

    public final String O(com.google.android.gms.internal.measurement.D1 d12) {
        if (d12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (d12.T()) {
            C(sb, 0, "filter_id", Integer.valueOf(d12.G()));
        }
        C(sb, 0, "event_name", this.f9366a.F().d(d12.L()));
        String strZ = z(d12.P(), d12.Q(), d12.R());
        if (!strZ.isEmpty()) {
            C(sb, 0, "filter_type", strZ);
        }
        if (d12.S()) {
            D(sb, 1, "event_count_filter", d12.K());
        }
        if (d12.F() > 0) {
            sb.append("  filters {\n");
            Iterator it = d12.M().iterator();
            while (it.hasNext()) {
                w(sb, 2, (com.google.android.gms.internal.measurement.F1) it.next());
            }
        }
        x(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    public final String P(com.google.android.gms.internal.measurement.L1 l12) {
        if (l12 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (l12.O()) {
            C(sb, 0, "filter_id", Integer.valueOf(l12.F()));
        }
        C(sb, 0, "property_name", this.f9366a.F().f(l12.J()));
        String strZ = z(l12.L(), l12.M(), l12.N());
        if (!strZ.isEmpty()) {
            C(sb, 0, "filter_type", strZ);
        }
        w(sb, 1, l12.G());
        sb.append("}\n");
        return sb.toString();
    }

    public final List Q(List list, List list2) {
        int i4;
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                this.f9366a.c().w().b("Ignoring negative bit index to be cleared", num);
            } else {
                int iIntValue = num.intValue() / 64;
                if (iIntValue >= arrayList.size()) {
                    this.f9366a.c().w().c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(iIntValue, Long.valueOf(((Long) arrayList.get(iIntValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i5 = size2;
            i4 = size;
            size = i5;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i4);
    }

    public final Map S(Bundle bundle, boolean z3) {
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            boolean z4 = obj instanceof Parcelable[];
            if (z4 || (obj instanceof ArrayList) || (obj instanceof Bundle)) {
                if (z3) {
                    ArrayList arrayList = new ArrayList();
                    if (z4) {
                        for (Parcelable parcelable : (Parcelable[]) obj) {
                            if (parcelable instanceof Bundle) {
                                arrayList.add(S((Bundle) parcelable, false));
                            }
                        }
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList2 = (ArrayList) obj;
                        int size = arrayList2.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            Object obj2 = arrayList2.get(i4);
                            if (obj2 instanceof Bundle) {
                                arrayList.add(S((Bundle) obj2, false));
                            }
                        }
                    } else if (obj instanceof Bundle) {
                        arrayList.add(S((Bundle) obj, false));
                    }
                    map.put(str, arrayList);
                }
            } else if (obj != null) {
                map.put(str, obj);
            }
        }
        return map;
    }

    public final void T(com.google.android.gms.internal.measurement.L2 l22, Object obj) {
        AbstractC0549h.j(obj);
        l22.A();
        l22.y();
        l22.x();
        l22.z();
        if (obj instanceof String) {
            l22.E((String) obj);
            return;
        }
        if (obj instanceof Long) {
            l22.C(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            l22.B(((Double) obj).doubleValue());
            return;
        }
        if (!(obj instanceof Bundle[])) {
            this.f9366a.c().r().b("Ignoring invalid (type) event param value", obj);
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.L2 l2J = com.google.android.gms.internal.measurement.M2.J();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.L2 l2J2 = com.google.android.gms.internal.measurement.M2.J();
                    l2J2.D(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        l2J2.C(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        l2J2.E((String) obj2);
                    } else if (obj2 instanceof Double) {
                        l2J2.B(((Double) obj2).doubleValue());
                    }
                    l2J.w(l2J2);
                }
                if (l2J.u() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.M2) l2J.q());
                }
            }
        }
        l22.v(arrayList);
    }

    public final void U(C0787k3 c0787k3, Object obj) {
        AbstractC0549h.j(obj);
        c0787k3.w();
        c0787k3.v();
        c0787k3.u();
        if (obj instanceof String) {
            c0787k3.B((String) obj);
            return;
        }
        if (obj instanceof Long) {
            c0787k3.y(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            c0787k3.x(((Double) obj).doubleValue());
        } else {
            this.f9366a.c().r().b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final boolean W(long j4, long j5) {
        return j4 == 0 || j5 <= 0 || Math.abs(this.f9366a.f().a() - j4) > j5;
    }

    @Override // k1.W6
    public final boolean l() {
        return false;
    }

    public final byte[] n(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            this.f9366a.c().r().b("Failed to gzip content", e4);
            throw e4;
        }
    }

    public final void v(StringBuilder sb, int i4, List list) {
        if (list == null) {
            return;
        }
        int i5 = i4 + 1;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.M2 m22 = (com.google.android.gms.internal.measurement.M2) it.next();
            if (m22 != null) {
                x(sb, i5);
                sb.append("param {\n");
                C(sb, i5, "name", m22.b0() ? this.f9366a.F().e(m22.L()) : null);
                C(sb, i5, "string_value", m22.c0() ? m22.M() : null);
                C(sb, i5, "int_value", m22.a0() ? Long.valueOf(m22.I()) : null);
                C(sb, i5, "double_value", m22.Y() ? Double.valueOf(m22.F()) : null);
                if (m22.H() > 0) {
                    v(sb, i5, m22.N());
                }
                x(sb, i5);
                sb.append("}\n");
            }
        }
    }

    public final void w(StringBuilder sb, int i4, com.google.android.gms.internal.measurement.F1 f12) {
        String str;
        if (f12 == null) {
            return;
        }
        x(sb, i4);
        sb.append("filter {\n");
        if (f12.M()) {
            C(sb, i4, "complement", Boolean.valueOf(f12.L()));
        }
        if (f12.O()) {
            C(sb, i4, "param_name", this.f9366a.F().e(f12.J()));
        }
        if (f12.P()) {
            int i5 = i4 + 1;
            com.google.android.gms.internal.measurement.P1 p1I = f12.I();
            if (p1I != null) {
                x(sb, i5);
                sb.append("string_filter {\n");
                if (p1I.N()) {
                    switch (p1I.O()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case O.h.LONG_FIELD_NUMBER /* 4 */:
                            str = "ENDS_WITH";
                            break;
                        case O.h.STRING_FIELD_NUMBER /* 5 */:
                            str = "PARTIAL";
                            break;
                        case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    C(sb, i5, "match_type", str);
                }
                if (p1I.M()) {
                    C(sb, i5, "expression", p1I.I());
                }
                if (p1I.L()) {
                    C(sb, i5, "case_sensitive", Boolean.valueOf(p1I.K()));
                }
                if (p1I.F() > 0) {
                    x(sb, i4 + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : p1I.J()) {
                        x(sb, i4 + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                x(sb, i5);
                sb.append("}\n");
            }
        }
        if (f12.N()) {
            D(sb, i4 + 1, "number_filter", f12.H());
        }
        x(sb, i4);
        sb.append("}\n");
    }
}
