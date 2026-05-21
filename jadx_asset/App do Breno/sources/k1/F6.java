package k1;

import V0.AbstractC0549h;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class F6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9035a;

    public F6(Map map) {
        HashMap map2 = new HashMap();
        this.f9035a = map2;
        map2.putAll(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle a() {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.F6.a():android.os.Bundle");
    }

    public final String b() {
        String str = (String) this.f9035a.get("PurposeDiagnostics");
        return TextUtils.isEmpty(str) ? "200000" : str;
    }

    public final String c(F6 f6) {
        Map map = f6.f9035a;
        String str = (map.isEmpty() || ((String) map.get("Version")) != null) ? "0" : "1";
        Bundle bundleA = a();
        Bundle bundleA2 = f6.a();
        return str.concat((bundleA.size() == bundleA2.size() && Objects.equals(bundleA.getString("ad_storage"), bundleA2.getString("ad_storage")) && Objects.equals(bundleA.getString("ad_personalization"), bundleA2.getString("ad_personalization")) && Objects.equals(bundleA.getString("ad_user_data"), bundleA2.getString("ad_user_data"))) ? "0" : "1");
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("1");
        int i4 = -1;
        try {
            String str = (String) this.f9035a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                i4 = Integer.parseInt(str);
            }
        } catch (NumberFormatException unused) {
        }
        if (i4 < 0 || i4 > 4095) {
            sb.append("00");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i4 >> 6));
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i4 & 63));
        }
        int iF = f();
        if (iF < 0 || iF > 63) {
            sb.append("0");
        } else {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iF));
        }
        AbstractC0549h.a(true);
        Map map = this.f9035a;
        int i5 = true != "1".equals(map.get("gdprApplies")) ? 0 : 2;
        boolean zEquals = "1".equals(map.get("EnableAdvertiserConsentMode"));
        int i6 = i5 | 4;
        if (zEquals) {
            i6 = i5 | 12;
        }
        sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i6));
        return sb.toString();
    }

    public final String e() {
        StringBuilder sb = new StringBuilder();
        p1.i iVar = I6.f9087a;
        int size = iVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            String str = (String) iVar.get(i4);
            Map map = this.f9035a;
            if (map.containsKey(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(str);
                sb.append("=");
                sb.append((String) map.get(str));
            }
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F6) {
            return e().equalsIgnoreCase(((F6) obj).e());
        }
        return false;
    }

    public final int f() {
        try {
            String str = (String) this.f9035a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle g() {
        int iF;
        Map map = this.f9035a;
        if ("1".equals(map.get("GoogleConsent")) && (iF = f()) >= 0) {
            String str = (String) map.get("PurposeConsents");
            if (!TextUtils.isEmpty(str)) {
                Bundle bundle = new Bundle();
                String str2 = "denied";
                if (str.length() > 0) {
                    bundle.putString(EnumC1221h4.AD_STORAGE.f9461m, str.charAt(0) == '1' ? "granted" : "denied");
                }
                if (str.length() > 3) {
                    bundle.putString(EnumC1221h4.AD_PERSONALIZATION.f9461m, (str.charAt(2) == '1' && str.charAt(3) == '1') ? "granted" : "denied");
                }
                if (str.length() > 6 && iF >= 4) {
                    String str3 = EnumC1221h4.AD_USER_DATA.f9461m;
                    if (str.charAt(0) == '1' && str.charAt(6) == '1') {
                        str2 = "granted";
                    }
                    bundle.putString(str3, str2);
                }
                return bundle;
            }
        }
        return Bundle.EMPTY;
    }

    public final int hashCode() {
        return e().hashCode();
    }

    public final String toString() {
        return e();
    }
}
