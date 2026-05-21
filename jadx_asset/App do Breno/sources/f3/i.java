package f3;

import L2.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends f {
    public static final W2.l d(final String str) {
        return str.length() == 0 ? new W2.l() { // from class: f3.g
            @Override // W2.l
            public final Object k(Object obj) {
                return i.e((String) obj);
            }
        } : new W2.l() { // from class: f3.h
            @Override // W2.l
            public final Object k(Object obj) {
                return i.f(str, (String) obj);
            }
        };
    }

    public static final String e(String str) {
        X2.l.e(str, "line");
        return str;
    }

    public static final String f(String str, String str2) {
        X2.l.e(str2, "line");
        return str + str2;
    }

    public static final int g(String str) {
        int length = str.length();
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                i4 = -1;
                break;
            }
            if (!a.c(str.charAt(i4))) {
                break;
            }
            i4++;
        }
        return i4 == -1 ? str.length() : i4;
    }

    public static final String h(String str, String str2) {
        String str3;
        X2.l.e(str, "<this>");
        X2.l.e(str2, "newIndent");
        List listN = q.N(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listN) {
            if (!q.G((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(L2.n.m(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(g((String) it.next())));
        }
        Integer num = (Integer) u.B(arrayList2);
        int i4 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (str2.length() * listN.size());
        W2.l lVarD = d(str2);
        int iH = L2.m.h(listN);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listN) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                L2.m.l();
            }
            String str4 = (String) obj2;
            if ((i4 == 0 || i4 == iH) && q.G(str4)) {
                str4 = null;
            } else {
                String strX = s.X(str4, iIntValue);
                if (strX != null && (str3 = (String) lVarD.k(strX)) != null) {
                    str4 = str3;
                }
            }
            if (str4 != null) {
                arrayList3.add(str4);
            }
            i4 = i5;
        }
        return ((StringBuilder) u.w(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static String i(String str) {
        X2.l.e(str, "<this>");
        return h(str, "");
    }
}
