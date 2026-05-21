package f3;

/* JADX INFO: loaded from: classes.dex */
public abstract class p extends o {
    public static String l(char[] cArr) {
        X2.l.e(cArr, "<this>");
        return new String(cArr);
    }

    public static byte[] m(String str) {
        X2.l.e(str, "<this>");
        byte[] bytes = str.getBytes(c.f7276b);
        X2.l.d(bytes, "getBytes(...)");
        return bytes;
    }

    public static boolean n(String str, String str2, boolean z3) {
        X2.l.e(str, "<this>");
        X2.l.e(str2, "suffix");
        return !z3 ? str.endsWith(str2) : p(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean o(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return n(str, str2, z3);
    }

    public static final boolean p(String str, int i4, String str2, int i5, int i6, boolean z3) {
        X2.l.e(str, "<this>");
        X2.l.e(str2, "other");
        return !z3 ? str.regionMatches(i4, str2, i5, i6) : str.regionMatches(z3, i4, str2, i5, i6);
    }

    public static final String q(String str, String str2, String str3, boolean z3) {
        X2.l.e(str, "<this>");
        X2.l.e(str2, "oldValue");
        X2.l.e(str3, "newValue");
        int i4 = 0;
        int iA = q.A(str, str2, 0, z3);
        if (iA < 0) {
            return str;
        }
        int length = str2.length();
        int iA2 = c3.e.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i4, iA);
            sb.append(str3);
            i4 = iA + length;
            if (iA >= str.length()) {
                break;
            }
            iA = q.A(str, str2, iA + iA2, z3);
        } while (iA > 0);
        sb.append((CharSequence) str, i4, str.length());
        String string = sb.toString();
        X2.l.d(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String r(String str, String str2, String str3, boolean z3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return q(str, str2, str3, z3);
    }

    public static final boolean s(String str, String str2, boolean z3) {
        X2.l.e(str, "<this>");
        X2.l.e(str2, "prefix");
        return !z3 ? str.startsWith(str2) : p(str, 0, str2, 0, str2.length(), z3);
    }

    public static /* synthetic */ boolean t(String str, String str2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return s(str, str2, z3);
    }
}
