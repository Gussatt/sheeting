package k1;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: k1.i4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1229i4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1229i4 f9474c = new C1229i4(null, null, 100);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumMap f9475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9476b;

    public C1229i4(Boolean bool, Boolean bool2, int i4) {
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        this.f9475a = enumMap;
        enumMap.put(EnumC1221h4.AD_STORAGE, h(null));
        enumMap.put(EnumC1221h4.ANALYTICS_STORAGE, h(null));
        this.f9476b = i4;
    }

    public static char a(EnumC1204f4 enumC1204f4) {
        if (enumC1204f4 == null) {
            return '-';
        }
        int iOrdinal = enumC1204f4.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static EnumC1204f4 d(String str) {
        return str == null ? EnumC1204f4.UNINITIALIZED : str.equals("granted") ? EnumC1204f4.GRANTED : str.equals("denied") ? EnumC1204f4.DENIED : EnumC1204f4.UNINITIALIZED;
    }

    public static EnumC1204f4 g(char c4) {
        return c4 != '+' ? c4 != '0' ? c4 != '1' ? EnumC1204f4.UNINITIALIZED : EnumC1204f4.GRANTED : EnumC1204f4.DENIED : EnumC1204f4.POLICY;
    }

    public static EnumC1204f4 h(Boolean bool) {
        return bool == null ? EnumC1204f4.UNINITIALIZED : bool.booleanValue() ? EnumC1204f4.GRANTED : EnumC1204f4.DENIED;
    }

    public static C1229i4 i(Bundle bundle, int i4) {
        if (bundle == null) {
            return new C1229i4(null, null, i4);
        }
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        for (EnumC1221h4 enumC1221h4 : EnumC1213g4.STORAGE.f9446m) {
            enumMap.put(enumC1221h4, d(bundle.getString(enumC1221h4.f9461m)));
        }
        return new C1229i4(enumMap, i4);
    }

    public static C1229i4 j(EnumC1204f4 enumC1204f4, EnumC1204f4 enumC1204f42, int i4) {
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        enumMap.put(EnumC1221h4.AD_STORAGE, enumC1204f4);
        enumMap.put(EnumC1221h4.ANALYTICS_STORAGE, enumC1204f42);
        return new C1229i4(enumMap, -10);
    }

    public static C1229i4 k(String str, int i4) {
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        EnumC1221h4[] enumC1221h4ArrF = EnumC1213g4.STORAGE.f();
        for (int i5 = 0; i5 < enumC1221h4ArrF.length; i5++) {
            String str2 = str == null ? "" : str;
            EnumC1221h4 enumC1221h4 = enumC1221h4ArrF[i5];
            int i6 = i5 + 2;
            if (i6 < str2.length()) {
                enumMap.put(enumC1221h4, g(str2.charAt(i6)));
            } else {
                enumMap.put(enumC1221h4, EnumC1204f4.UNINITIALIZED);
            }
        }
        return new C1229i4(enumMap, i4);
    }

    public static String n(int i4) {
        return i4 != -30 ? i4 != -20 ? i4 != -10 ? i4 != 0 ? i4 != 30 ? i4 != 90 ? i4 != 100 ? "OTHER" : "UNKNOWN" : "REMOTE_CONFIG" : "1P_INIT" : "1P_API" : "MANIFEST" : "API" : "TCF";
    }

    public static String o(EnumC1204f4 enumC1204f4) {
        int iOrdinal = enumC1204f4.ordinal();
        if (iOrdinal == 2) {
            return "denied";
        }
        if (iOrdinal != 3) {
            return null;
        }
        return "granted";
    }

    public static boolean s(int i4, int i5) {
        int i6 = -30;
        if (i4 == -20) {
            if (i5 == -30) {
                return true;
            }
            i4 = -20;
        }
        if (i4 != -30) {
            i6 = i4;
        } else if (i5 == -20) {
            return true;
        }
        return i6 == i5 || i4 < i5;
    }

    public final int b() {
        return this.f9476b;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f9475a.entrySet()) {
            String strO = o((EnumC1204f4) entry.getValue());
            if (strO != null) {
                bundle.putString(((EnumC1221h4) entry.getKey()).f9461m, strO);
            }
        }
        return bundle;
    }

    public final EnumC1204f4 e() {
        EnumC1204f4 enumC1204f4 = (EnumC1204f4) this.f9475a.get(EnumC1221h4.AD_STORAGE);
        return enumC1204f4 == null ? EnumC1204f4.UNINITIALIZED : enumC1204f4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1229i4)) {
            return false;
        }
        C1229i4 c1229i4 = (C1229i4) obj;
        for (EnumC1221h4 enumC1221h4 : EnumC1213g4.STORAGE.f9446m) {
            if (this.f9475a.get(enumC1221h4) != c1229i4.f9475a.get(enumC1221h4)) {
                return false;
            }
        }
        return this.f9476b == c1229i4.f9476b;
    }

    public final EnumC1204f4 f() {
        EnumC1204f4 enumC1204f4 = (EnumC1204f4) this.f9475a.get(EnumC1221h4.ANALYTICS_STORAGE);
        return enumC1204f4 == null ? EnumC1204f4.UNINITIALIZED : enumC1204f4;
    }

    public final int hashCode() {
        Iterator it = this.f9475a.values().iterator();
        int iHashCode = this.f9476b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((EnumC1204f4) it.next()).hashCode();
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k1.C1229i4 l(k1.C1229i4 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<k1.h4> r1 = k1.EnumC1221h4.class
            r0.<init>(r1)
            k1.g4 r1 = k1.EnumC1213g4.STORAGE
            k1.h4[] r1 = k1.EnumC1213g4.d(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4a
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f9475a
            java.lang.Object r5 = r5.get(r4)
            k1.f4 r5 = (k1.EnumC1204f4) r5
            java.util.EnumMap r6 = r9.f9475a
            java.lang.Object r6 = r6.get(r4)
            k1.f4 r6 = (k1.EnumC1204f4) r6
            if (r5 != 0) goto L26
            goto L33
        L26:
            if (r6 == 0) goto L42
            k1.f4 r7 = k1.EnumC1204f4.UNINITIALIZED
            if (r5 != r7) goto L2d
            goto L33
        L2d:
            if (r6 == r7) goto L42
            k1.f4 r7 = k1.EnumC1204f4.POLICY
            if (r5 != r7) goto L35
        L33:
            r5 = r6
            goto L42
        L35:
            if (r6 == r7) goto L42
            k1.f4 r7 = k1.EnumC1204f4.DENIED
            if (r5 == r7) goto L41
            if (r6 != r7) goto L3e
            goto L41
        L3e:
            k1.f4 r5 = k1.EnumC1204f4.GRANTED
            goto L42
        L41:
            r5 = r7
        L42:
            if (r5 == 0) goto L47
            r0.put(r4, r5)
        L47:
            int r3 = r3 + 1
            goto Lf
        L4a:
            k1.i4 r9 = new k1.i4
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1229i4.l(k1.i4):k1.i4");
    }

    public final C1229i4 m(C1229i4 c1229i4) {
        EnumMap enumMap = new EnumMap(EnumC1221h4.class);
        for (EnumC1221h4 enumC1221h4 : EnumC1213g4.STORAGE.f9446m) {
            EnumC1204f4 enumC1204f4 = (EnumC1204f4) this.f9475a.get(enumC1221h4);
            if (enumC1204f4 == EnumC1204f4.UNINITIALIZED) {
                enumC1204f4 = (EnumC1204f4) c1229i4.f9475a.get(enumC1221h4);
            }
            if (enumC1204f4 != null) {
                enumMap.put(enumC1221h4, enumC1204f4);
            }
        }
        return new C1229i4(enumMap, this.f9476b);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String p() {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "G1"
            r0.<init>(r1)
            k1.g4 r1 = k1.EnumC1213g4.STORAGE
            k1.h4[] r1 = r1.f()
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L3a
            r4 = r1[r3]
            java.util.EnumMap r5 = r7.f9475a
            java.lang.Object r4 = r5.get(r4)
            k1.f4 r4 = (k1.EnumC1204f4) r4
            r5 = 45
            if (r4 == 0) goto L34
            int r4 = r4.ordinal()
            if (r4 == 0) goto L34
            r6 = 1
            if (r4 == r6) goto L32
            r6 = 2
            if (r4 == r6) goto L2f
            r6 = 3
            if (r4 == r6) goto L32
            goto L34
        L2f:
            r5 = 48
            goto L34
        L32:
            r5 = 49
        L34:
            r0.append(r5)
            int r3 = r3 + 1
            goto Lf
        L3a:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1229i4.p():java.lang.String");
    }

    public final String q() {
        StringBuilder sb = new StringBuilder("G1");
        for (EnumC1221h4 enumC1221h4 : EnumC1213g4.STORAGE.f()) {
            sb.append(a((EnumC1204f4) this.f9475a.get(enumC1221h4)));
        }
        return sb.toString();
    }

    public final boolean r(EnumC1221h4 enumC1221h4) {
        return ((EnumC1204f4) this.f9475a.get(enumC1221h4)) != EnumC1204f4.DENIED;
    }

    public final boolean t() {
        Iterator it = this.f9475a.values().iterator();
        while (it.hasNext()) {
            if (((EnumC1204f4) it.next()) != EnumC1204f4.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(n(this.f9476b));
        for (EnumC1221h4 enumC1221h4 : EnumC1213g4.STORAGE.f9446m) {
            sb.append(",");
            sb.append(enumC1221h4.f9461m);
            sb.append("=");
            EnumC1204f4 enumC1204f4 = (EnumC1204f4) this.f9475a.get(enumC1221h4);
            if (enumC1204f4 == null) {
                enumC1204f4 = EnumC1204f4.UNINITIALIZED;
            }
            sb.append(enumC1204f4);
        }
        return sb.toString();
    }

    public final boolean u(C1229i4 c1229i4) {
        EnumMap enumMap = this.f9475a;
        for (EnumC1221h4 enumC1221h4 : (EnumC1221h4[]) enumMap.keySet().toArray(new EnumC1221h4[0])) {
            EnumC1204f4 enumC1204f4 = (EnumC1204f4) enumMap.get(enumC1221h4);
            EnumC1204f4 enumC1204f42 = (EnumC1204f4) c1229i4.f9475a.get(enumC1221h4);
            EnumC1204f4 enumC1204f43 = EnumC1204f4.DENIED;
            if (enumC1204f4 == enumC1204f43 && enumC1204f42 != enumC1204f43) {
                return true;
            }
        }
        return false;
    }

    public C1229i4(EnumMap enumMap, int i4) {
        EnumMap enumMap2 = new EnumMap(EnumC1221h4.class);
        this.f9475a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f9476b = i4;
    }
}
