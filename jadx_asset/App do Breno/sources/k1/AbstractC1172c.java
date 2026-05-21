package k1;

import V0.AbstractC0549h;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: renamed from: k1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1172c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f9379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Boolean f9380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f9381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f9382f;

    public AbstractC1172c(String str, int i4) {
        this.f9377a = str;
        this.f9378b = i4;
    }

    public static Boolean d(String str, int i4, boolean z3, String str2, List list, String str3, K2 k22) {
        if (i4 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z3 && i4 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i4 - 1) {
            case 1:
                if (str3 != null) {
                    try {
                    } catch (PatternSyntaxException unused) {
                        if (k22 != null) {
                            k22.w().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                        }
                        return null;
                    }
                    break;
                }
                break;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                if (list != null) {
                    break;
                }
                break;
        }
        return null;
    }

    public static Boolean e(BigDecimal bigDecimal, com.google.android.gms.internal.measurement.J1 j12, double d4) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC0549h.j(j12);
        if (j12.L()) {
            if (j12.Q() != 1) {
                if (j12.Q() == 5) {
                    if (!j12.P() || !j12.O()) {
                        return null;
                    }
                } else if (!j12.M()) {
                    return null;
                }
                int iQ = j12.Q();
                if (j12.Q() == 5) {
                    if (r7.m(j12.J()) && r7.m(j12.I())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(j12.J());
                            bigDecimal4 = new BigDecimal(j12.I());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!r7.m(j12.H())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(j12.H());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (iQ == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i4 = iQ - 1;
                if (i4 == 1) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                }
                if (i4 == 2) {
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                }
                if (i4 != 3) {
                    if (i4 == 4 && bigDecimal3 != null) {
                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                    }
                    return null;
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (d4 != 0.0d) {
                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d4).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d4).multiply(new BigDecimal(2)))) < 0);
                }
                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
            }
        }
        return null;
    }

    public static Boolean f(String str, com.google.android.gms.internal.measurement.P1 p12, K2 k22) {
        List list;
        AbstractC0549h.j(p12);
        if (str == null || !p12.N() || p12.O() == 1 || (p12.O() != 7 ? !p12.M() : p12.F() == 0)) {
            return null;
        }
        int iO = p12.O();
        boolean zK = p12.K();
        String strI = (zK || iO == 2 || iO == 7) ? p12.I() : p12.I().toUpperCase(Locale.ENGLISH);
        if (p12.F() == 0) {
            list = null;
        } else {
            List listJ = p12.J();
            if (!zK) {
                ArrayList arrayList = new ArrayList(listJ.size());
                Iterator it = listJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                listJ = Collections.unmodifiableList(arrayList);
            }
            list = listJ;
        }
        return d(str, iO, zK, strI, list, iO == 2 ? strI : null, k22);
    }

    public static Boolean g(double d4, com.google.android.gms.internal.measurement.J1 j12) {
        try {
            return e(new BigDecimal(d4), j12, Math.ulp(d4));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean h(long j4, com.google.android.gms.internal.measurement.J1 j12) {
        try {
            return e(new BigDecimal(j4), j12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean i(String str, com.google.android.gms.internal.measurement.J1 j12) {
        if (!r7.m(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), j12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean j(Boolean bool, boolean z3) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z3);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();
}
