package k1;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: k1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1143C {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1143C f8904f = new C1143C((Boolean) null, 100, (Boolean) null, (String) null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f8907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumMap f8909e;

    public C1143C(Boolean bool, int i4, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        this.f8909e = enumMap;
        enumMap.put(EnumC1221h4.AD_USER_DATA, C1229i4.h(bool));
        this.f8905a = i4;
        this.f8906b = l();
        this.f8907c = bool2;
        this.f8908d = str;
    }

    public static C1143C c(Bundle bundle, int i4) {
        if (bundle == null) {
            return new C1143C((Boolean) null, i4, (Boolean) null, (String) null);
        }
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        for (EnumC1221h4 enumC1221h4 : EnumC1213g4.DMA.f()) {
            enumMap.put(enumC1221h4, C1229i4.d(bundle.getString(enumC1221h4.f9461m)));
        }
        return new C1143C(enumMap, i4, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public static C1143C d(EnumC1204f4 enumC1204f4, int i4) {
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        enumMap.put(EnumC1221h4.AD_USER_DATA, enumC1204f4);
        return new C1143C(enumMap, -10, (Boolean) null, (String) null);
    }

    public static C1143C e(String str) {
        if (str == null || str.length() <= 0) {
            return f8904f;
        }
        String[] strArrSplit = str.split(":");
        int i4 = Integer.parseInt(strArrSplit[0]);
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        EnumC1221h4[] enumC1221h4ArrF = EnumC1213g4.DMA.f();
        int length = enumC1221h4ArrF.length;
        int i5 = 1;
        int i6 = 0;
        while (i6 < length) {
            enumMap.put(enumC1221h4ArrF[i6], C1229i4.g(strArrSplit[i5].charAt(0)));
            i6++;
            i5++;
        }
        return new C1143C(enumMap, i4, (Boolean) null, (String) null);
    }

    public static Boolean g(Bundle bundle) {
        EnumC1204f4 enumC1204f4D;
        if (bundle == null || (enumC1204f4D = C1229i4.d(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int iOrdinal = enumC1204f4D.ordinal();
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return Boolean.TRUE;
    }

    public final int a() {
        return this.f8905a;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f8909e.entrySet()) {
            String strO = C1229i4.o((EnumC1204f4) entry.getValue());
            if (strO != null) {
                bundle.putString(((EnumC1221h4) entry.getKey()).f9461m, strO);
            }
        }
        Boolean bool = this.f8907c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f8908d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1143C)) {
            return false;
        }
        C1143C c1143c = (C1143C) obj;
        if (this.f8906b.equalsIgnoreCase(c1143c.f8906b) && Objects.equals(this.f8907c, c1143c.f8907c)) {
            return Objects.equals(this.f8908d, c1143c.f8908d);
        }
        return false;
    }

    public final EnumC1204f4 f() {
        EnumC1204f4 enumC1204f4 = (EnumC1204f4) this.f8909e.get(EnumC1221h4.AD_USER_DATA);
        return enumC1204f4 == null ? EnumC1204f4.UNINITIALIZED : enumC1204f4;
    }

    public final Boolean h() {
        return this.f8907c;
    }

    public final int hashCode() {
        Boolean bool = this.f8907c;
        int i4 = bool == null ? 3 : true != bool.booleanValue() ? 13 : 7;
        String str = this.f8908d;
        return this.f8906b.hashCode() + (i4 * 29) + ((str == null ? 17 : str.hashCode()) * 137);
    }

    public final String i() {
        return this.f8908d;
    }

    public final String j() {
        return this.f8906b;
    }

    public final boolean k() {
        Iterator it = this.f8909e.values().iterator();
        while (it.hasNext()) {
            if (((EnumC1204f4) it.next()) != EnumC1204f4.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8905a);
        for (EnumC1221h4 enumC1221h4 : EnumC1213g4.DMA.f()) {
            sb.append(":");
            sb.append(C1229i4.a((EnumC1204f4) this.f8909e.get(enumC1221h4)));
        }
        return sb.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C1229i4.n(this.f8905a));
        for (EnumC1221h4 enumC1221h4 : EnumC1213g4.DMA.f()) {
            sb.append(",");
            sb.append(enumC1221h4.f9461m);
            sb.append("=");
            EnumC1204f4 enumC1204f4 = (EnumC1204f4) this.f8909e.get(enumC1221h4);
            if (enumC1204f4 == null) {
                sb.append("uninitialized");
            } else {
                int iOrdinal = enumC1204f4.ordinal();
                if (iOrdinal == 0) {
                    sb.append("uninitialized");
                } else if (iOrdinal == 1) {
                    sb.append("eu_consent_policy");
                } else if (iOrdinal == 2) {
                    sb.append("denied");
                } else if (iOrdinal == 3) {
                    sb.append("granted");
                }
            }
        }
        Boolean bool = this.f8907c;
        if (bool != null) {
            sb.append(",isDmaRegion=");
            sb.append(bool);
        }
        String str = this.f8908d;
        if (str != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(str);
        }
        return sb.toString();
    }

    public C1143C(EnumMap enumMap, int i4, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(EnumC1221h4.class);
        this.f8909e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f8905a = i4;
        this.f8906b = l();
        this.f8907c = bool;
        this.f8908d = str;
    }
}
