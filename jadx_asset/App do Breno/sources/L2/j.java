package L2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class j extends i {
    public static final Set A(Object[] objArr) {
        X2.l.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? (Set) x(objArr, new LinkedHashSet(B.a(objArr.length))) : D.a(objArr[0]) : E.b();
    }

    public static final boolean l(Object[] objArr, Object obj) {
        X2.l.e(objArr, "<this>");
        return q(objArr, obj) >= 0;
    }

    public static List m(Object[] objArr, int i4) {
        X2.l.e(objArr, "<this>");
        if (i4 >= 0) {
            return w(objArr, c3.e.a(objArr.length - i4, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
    }

    public static c3.c n(Object[] objArr) {
        X2.l.e(objArr, "<this>");
        return new c3.c(0, o(objArr));
    }

    public static final int o(Object[] objArr) {
        X2.l.e(objArr, "<this>");
        return objArr.length - 1;
    }

    public static Object p(Object[] objArr, int i4) {
        X2.l.e(objArr, "<this>");
        if (i4 < 0 || i4 >= objArr.length) {
            return null;
        }
        return objArr[i4];
    }

    public static final int q(Object[] objArr, Object obj) {
        X2.l.e(objArr, "<this>");
        int i4 = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i4 < length) {
                if (objArr[i4] == null) {
                    return i4;
                }
                i4++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i4 < length2) {
            if (X2.l.a(obj, objArr[i4])) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public static final Appendable r(byte[] bArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, W2.l lVar) throws IOException {
        X2.l.e(bArr, "<this>");
        X2.l.e(appendable, "buffer");
        X2.l.e(charSequence, "separator");
        X2.l.e(charSequence2, "prefix");
        X2.l.e(charSequence3, "postfix");
        X2.l.e(charSequence4, "truncated");
        appendable.append(charSequence2);
        int i5 = 0;
        for (byte b4 : bArr) {
            i5++;
            if (i5 > 1) {
                appendable.append(charSequence);
            }
            if (i4 >= 0 && i5 > i4) {
                break;
            }
            if (lVar != null) {
                appendable.append((CharSequence) lVar.k(Byte.valueOf(b4)));
            } else {
                appendable.append(String.valueOf((int) b4));
            }
        }
        if (i4 >= 0 && i5 > i4) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
        return appendable;
    }

    public static final String s(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, W2.l lVar) {
        X2.l.e(bArr, "<this>");
        X2.l.e(charSequence, "separator");
        X2.l.e(charSequence2, "prefix");
        X2.l.e(charSequence3, "postfix");
        X2.l.e(charSequence4, "truncated");
        return ((StringBuilder) r(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i4, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String t(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i4, CharSequence charSequence4, W2.l lVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i5 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i5 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i5 & 8) != 0) {
            i4 = -1;
        }
        if ((i5 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i5 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        W2.l lVar2 = lVar;
        return s(bArr, charSequence, charSequence2, charSequence3, i4, charSequence5, lVar2);
    }

    public static char u(char[] cArr) {
        X2.l.e(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static Object v(Object[] objArr) {
        X2.l.e(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final List w(Object[] objArr, int i4) {
        X2.l.e(objArr, "<this>");
        if (i4 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i4 + " is less than zero.").toString());
        }
        if (i4 == 0) {
            return m.f();
        }
        int length = objArr.length;
        if (i4 >= length) {
            return y(objArr);
        }
        if (i4 == 1) {
            return l.b(objArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i4);
        for (int i5 = length - i4; i5 < length; i5++) {
            arrayList.add(objArr[i5]);
        }
        return arrayList;
    }

    public static final Collection x(Object[] objArr, Collection collection) {
        X2.l.e(objArr, "<this>");
        X2.l.e(collection, "destination");
        for (Object obj : objArr) {
            collection.add(obj);
        }
        return collection;
    }

    public static final List y(Object[] objArr) {
        X2.l.e(objArr, "<this>");
        int length = objArr.length;
        return length != 0 ? length != 1 ? z(objArr) : l.b(objArr[0]) : m.f();
    }

    public static final List z(Object[] objArr) {
        X2.l.e(objArr, "<this>");
        return new ArrayList(m.e(objArr));
    }
}
