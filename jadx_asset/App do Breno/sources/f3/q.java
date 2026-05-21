package f3;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends p {

    public static final class a implements e3.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f7291a;

        public a(CharSequence charSequence) {
            this.f7291a = charSequence;
        }

        @Override // e3.b
        public Iterator iterator() {
            return new d(this.f7291a);
        }
    }

    public static final int A(CharSequence charSequence, String str, int i4, boolean z3) {
        X2.l.e(charSequence, "<this>");
        X2.l.e(str, "string");
        return (z3 || !(charSequence instanceof String)) ? C(charSequence, str, i4, charSequence.length(), z3, false, 16, null) : ((String) charSequence).indexOf(str, i4);
    }

    public static final int B(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z3, boolean z4) {
        c3.a cVar = !z4 ? new c3.c(c3.e.a(i4, 0), c3.e.b(i5, charSequence.length())) : c3.e.e(c3.e.b(i4, y(charSequence)), c3.e.a(i5, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iD = cVar.d();
            int iF = cVar.f();
            int iG = cVar.g();
            if ((iG <= 0 || iD > iF) && (iG >= 0 || iF > iD)) {
                return -1;
            }
            int i6 = iD;
            while (true) {
                String str = (String) charSequence2;
                boolean z5 = z3;
                if (p.p(str, 0, (String) charSequence, i6, str.length(), z5)) {
                    return i6;
                }
                if (i6 == iF) {
                    return -1;
                }
                i6 += iG;
                z3 = z5;
            }
        } else {
            boolean z6 = z3;
            int iD2 = cVar.d();
            int iF2 = cVar.f();
            int iG2 = cVar.g();
            if ((iG2 <= 0 || iD2 > iF2) && (iG2 >= 0 || iF2 > iD2)) {
                return -1;
            }
            int i7 = iD2;
            while (true) {
                boolean z7 = z6;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z6 = z7;
                if (Q(charSequence4, 0, charSequence3, i7, charSequence2.length(), z7)) {
                    return i7;
                }
                if (i7 == iF2) {
                    return -1;
                }
                i7 += iG2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static /* synthetic */ int C(CharSequence charSequence, CharSequence charSequence2, int i4, int i5, boolean z3, boolean z4, int i6, Object obj) {
        if ((i6 & 16) != 0) {
            z4 = false;
        }
        return B(charSequence, charSequence2, i4, i5, z3, z4);
    }

    public static /* synthetic */ int D(CharSequence charSequence, char c4, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return z(charSequence, c4, i4, z3);
    }

    public static /* synthetic */ int E(CharSequence charSequence, String str, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return A(charSequence, str, i4, z3);
    }

    public static final int F(CharSequence charSequence, char[] cArr, int i4, boolean z3) {
        X2.l.e(charSequence, "<this>");
        X2.l.e(cArr, "chars");
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(L2.j.u(cArr), i4);
        }
        int iA = c3.e.a(i4, 0);
        int iY = y(charSequence);
        if (iA > iY) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iA);
            for (char c4 : cArr) {
                if (b.d(c4, cCharAt, z3)) {
                    return iA;
                }
            }
            if (iA == iY) {
                return -1;
            }
            iA++;
        }
    }

    public static boolean G(CharSequence charSequence) {
        X2.l.e(charSequence, "<this>");
        for (int i4 = 0; i4 < charSequence.length(); i4++) {
            if (!f3.a.c(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static final int H(CharSequence charSequence, char c4, int i4, boolean z3) {
        X2.l.e(charSequence, "<this>");
        return (z3 || !(charSequence instanceof String)) ? L(charSequence, new char[]{c4}, i4, z3) : ((String) charSequence).lastIndexOf(c4, i4);
    }

    public static final int I(CharSequence charSequence, String str, int i4, boolean z3) {
        X2.l.e(charSequence, "<this>");
        X2.l.e(str, "string");
        return (z3 || !(charSequence instanceof String)) ? B(charSequence, str, i4, 0, z3, true) : ((String) charSequence).lastIndexOf(str, i4);
    }

    public static /* synthetic */ int J(CharSequence charSequence, char c4, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = y(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return H(charSequence, c4, i4, z3);
    }

    public static /* synthetic */ int K(CharSequence charSequence, String str, int i4, boolean z3, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i4 = y(charSequence);
        }
        if ((i5 & 4) != 0) {
            z3 = false;
        }
        return I(charSequence, str, i4, z3);
    }

    public static final int L(CharSequence charSequence, char[] cArr, int i4, boolean z3) {
        X2.l.e(charSequence, "<this>");
        X2.l.e(cArr, "chars");
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(L2.j.u(cArr), i4);
        }
        for (int iB = c3.e.b(i4, y(charSequence)); -1 < iB; iB--) {
            char cCharAt = charSequence.charAt(iB);
            for (char c4 : cArr) {
                if (b.d(c4, cCharAt, z3)) {
                    return iB;
                }
            }
        }
        return -1;
    }

    public static final e3.b M(CharSequence charSequence) {
        X2.l.e(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List N(CharSequence charSequence) {
        X2.l.e(charSequence, "<this>");
        return e3.g.c(M(charSequence));
    }

    public static final CharSequence O(CharSequence charSequence, int i4, char c4) {
        X2.l.e(charSequence, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException("Desired length " + i4 + " is less than zero.");
        }
        if (i4 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb = new StringBuilder(i4);
        int length = i4 - charSequence.length();
        int i5 = 1;
        if (1 <= length) {
            while (true) {
                sb.append(c4);
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        sb.append(charSequence);
        return sb;
    }

    public static String P(String str, int i4, char c4) {
        X2.l.e(str, "<this>");
        return O(str, i4, c4).toString();
    }

    public static final boolean Q(CharSequence charSequence, int i4, CharSequence charSequence2, int i5, int i6, boolean z3) {
        X2.l.e(charSequence, "<this>");
        X2.l.e(charSequence2, "other");
        if (i5 < 0 || i4 < 0 || i4 > charSequence.length() - i6 || i5 > charSequence2.length() - i6) {
            return false;
        }
        for (int i7 = 0; i7 < i6; i7++) {
            if (!b.d(charSequence.charAt(i4 + i7), charSequence2.charAt(i5 + i7), z3)) {
                return false;
            }
        }
        return true;
    }

    public static final String R(String str, char c4, String str2) {
        X2.l.e(str, "<this>");
        X2.l.e(str2, "missingDelimiterValue");
        int iD = D(str, c4, 0, false, 6, null);
        if (iD == -1) {
            return str2;
        }
        String strSubstring = str.substring(iD + 1, str.length());
        X2.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String S(String str, String str2, String str3) {
        X2.l.e(str, "<this>");
        X2.l.e(str2, "delimiter");
        X2.l.e(str3, "missingDelimiterValue");
        int iE = E(str, str2, 0, false, 6, null);
        if (iE == -1) {
            return str3;
        }
        String strSubstring = str.substring(iE + str2.length(), str.length());
        X2.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String T(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return R(str, c4, str2);
    }

    public static /* synthetic */ String U(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = str;
        }
        return S(str, str2, str3);
    }

    public static String V(String str, char c4, String str2) {
        X2.l.e(str, "<this>");
        X2.l.e(str2, "missingDelimiterValue");
        int iJ = J(str, c4, 0, false, 6, null);
        if (iJ == -1) {
            return str2;
        }
        String strSubstring = str.substring(iJ + 1, str.length());
        X2.l.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String W(String str, char c4, String str2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str2 = str;
        }
        return V(str, c4, str2);
    }

    public static final boolean u(CharSequence charSequence, char c4, boolean z3) {
        X2.l.e(charSequence, "<this>");
        return D(charSequence, c4, 0, z3, 2, null) >= 0;
    }

    public static final boolean v(CharSequence charSequence, CharSequence charSequence2, boolean z3) {
        X2.l.e(charSequence, "<this>");
        X2.l.e(charSequence2, "other");
        return charSequence2 instanceof String ? E(charSequence, (String) charSequence2, 0, z3, 2, null) >= 0 : C(charSequence, charSequence2, 0, charSequence.length(), z3, false, 16, null) >= 0;
    }

    public static /* synthetic */ boolean w(CharSequence charSequence, char c4, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return u(charSequence, c4, z3);
    }

    public static /* synthetic */ boolean x(CharSequence charSequence, CharSequence charSequence2, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z3 = false;
        }
        return v(charSequence, charSequence2, z3);
    }

    public static final int y(CharSequence charSequence) {
        X2.l.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int z(CharSequence charSequence, char c4, int i4, boolean z3) {
        X2.l.e(charSequence, "<this>");
        return (z3 || !(charSequence instanceof String)) ? F(charSequence, new char[]{c4}, i4, z3) : ((String) charSequence).indexOf(c4, i4);
    }
}
