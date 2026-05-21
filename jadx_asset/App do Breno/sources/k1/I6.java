package k1;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.EnumC0779j4;
import com.google.android.gms.internal.measurement.EnumC0788k4;
import java.util.Map;
import p1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1.i f9087a = p1.i.x("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static String b(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final Map c(p1.j jVar, p1.j jVar2, p1.k kVar, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z3, boolean z4) {
        EnumC0779j4 enumC0779j4;
        Object obj;
        EnumC0779j4 enumC0779j42;
        Object obj2;
        EnumC0779j4 enumC0779j43 = EnumC0779j4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        EnumC0788k4 enumC0788k4 = (EnumC0788k4) jVar2.get(enumC0779j43);
        EnumC0779j4 enumC0779j44 = EnumC0779j4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        EnumC0788k4 enumC0788k42 = (EnumC0788k4) jVar2.get(enumC0779j44);
        EnumC0779j4 enumC0779j45 = EnumC0779j4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        EnumC0788k4 enumC0788k43 = (EnumC0788k4) jVar2.get(enumC0779j45);
        EnumC0779j4 enumC0779j46 = EnumC0779j4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        EnumC0788k4 enumC0788k44 = (EnumC0788k4) jVar2.get(enumC0779j46);
        j.a aVarI = p1.j.a().f("Version", "2").f("VendorConsent", true != z3 ? "0" : "1").f("VendorLegitimateInterest", true != z4 ? "0" : "1").f("gdprApplies", i6 != 1 ? "0" : "1").f("EnableAdvertiserConsentMode", i5 != 1 ? "0" : "1").f("PolicyVersion", String.valueOf(i7)).f("CmpSdkID", String.valueOf(i4)).f("PurposeOneTreatment", i8 != 1 ? "0" : "1").f("PublisherCC", str).f("PublisherRestrictions1", String.valueOf(enumC0788k4 != null ? enumC0788k4.d() : EnumC0788k4.PURPOSE_RESTRICTION_UNDEFINED.d())).f("PublisherRestrictions3", String.valueOf(enumC0788k42 != null ? enumC0788k42.d() : EnumC0788k4.PURPOSE_RESTRICTION_UNDEFINED.d())).f("PublisherRestrictions4", String.valueOf(enumC0788k43 != null ? enumC0788k43.d() : EnumC0788k4.PURPOSE_RESTRICTION_UNDEFINED.d())).f("PublisherRestrictions7", String.valueOf(enumC0788k44 != null ? enumC0788k44.d() : EnumC0788k4.PURPOSE_RESTRICTION_UNDEFINED.d())).i(p1.j.h("Purpose1", g(enumC0779j43, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4), "Purpose3", g(enumC0779j44, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4), "Purpose4", g(enumC0779j45, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4), "Purpose7", g(enumC0779j46, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4)));
        if (true != d(enumC0779j43, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4)) {
            enumC0779j4 = enumC0779j44;
            obj = "0";
        } else {
            enumC0779j4 = enumC0779j44;
            obj = "1";
        }
        if (true != d(enumC0779j4, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4)) {
            enumC0779j42 = enumC0779j45;
            obj2 = "0";
        } else {
            enumC0779j42 = enumC0779j45;
            obj2 = "1";
        }
        return aVarI.i(p1.j.i("AuthorizePurpose1", obj, "AuthorizePurpose3", obj2, "AuthorizePurpose4", true != d(enumC0779j42, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4) ? "0" : "1", "AuthorizePurpose7", true != d(enumC0779j46, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4) ? "0" : "1", "PurposeDiagnostics", new String(cArr))).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean d(com.google.android.gms.internal.measurement.EnumC0779j4 r17, p1.j r18, p1.j r19, p1.k r20, char[] r21, int r22, int r23, int r24, int r25, int r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.I6.d(com.google.android.gms.internal.measurement.j4, p1.j, p1.j, p1.k, char[], int, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):boolean");
    }

    public static final int e(EnumC0779j4 enumC0779j4, p1.j jVar, p1.j jVar2, p1.k kVar, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z3, boolean z4) {
        if (enumC0779j4 == EnumC0779j4.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC0779j4 == EnumC0779j4.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC0779j4 == EnumC0779j4.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC0779j4 == EnumC0779j4.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final EnumC0788k4 f(EnumC0779j4 enumC0779j4, p1.j jVar, p1.j jVar2, p1.k kVar, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z3, boolean z4) {
        return (EnumC0788k4) jVar2.getOrDefault(enumC0779j4, EnumC0788k4.PURPOSE_RESTRICTION_UNDEFINED);
    }

    public static final String g(EnumC0779j4 enumC0779j4, p1.j jVar, p1.j jVar2, p1.k kVar, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z3, boolean z4) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str2) || str2.length() < enumC0779j4.d()) ? "0" : String.valueOf(str2.charAt(enumC0779j4.d() - 1));
        if (!TextUtils.isEmpty(str3) && str3.length() >= enumC0779j4.d()) {
            strValueOf = String.valueOf(str3.charAt(enumC0779j4.d() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean h(EnumC0779j4 enumC0779j4, p1.j jVar, p1.j jVar2, p1.k kVar, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z3, boolean z4) {
        char c4;
        int iE = e(enumC0779j4, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4);
        if (!z3) {
            c4 = '4';
        } else {
            if (str2.length() >= enumC0779j4.d()) {
                char cCharAt = str2.charAt(enumC0779j4.d() - 1);
                boolean z5 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '6' : '1';
                }
                return z5;
            }
            c4 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c4;
        }
        return false;
    }

    public static final boolean i(EnumC0779j4 enumC0779j4, p1.j jVar, p1.j jVar2, p1.k kVar, char[] cArr, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, boolean z3, boolean z4) {
        char c4;
        int iE = e(enumC0779j4, jVar, jVar2, kVar, cArr, i4, i5, i6, i7, i8, str, str2, str3, z3, z4);
        if (!z4) {
            c4 = '5';
        } else {
            if (str3.length() >= enumC0779j4.d()) {
                char cCharAt = str3.charAt(enumC0779j4.d() - 1);
                boolean z5 = cCharAt == '1';
                if (iE > 0 && cArr[iE] != '2') {
                    cArr[iE] = cCharAt != '1' ? '7' : '1';
                }
                return z5;
            }
            c4 = '0';
        }
        if (iE > 0 && cArr[iE] != '2') {
            cArr[iE] = c4;
        }
        return false;
    }
}
