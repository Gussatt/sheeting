package f3;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends r {
    public static final String X(String str, int i4) {
        X2.l.e(str, "<this>");
        if (i4 >= 0) {
            String strSubstring = str.substring(c3.e.b(i4, str.length()));
            X2.l.d(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i4 + " is less than zero.").toString());
    }

    public static char Y(CharSequence charSequence) {
        X2.l.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(q.y(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
