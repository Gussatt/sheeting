package g1;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: g1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0962b {
    public static String a(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            length = objArr.length;
            if (i5 >= length) {
                break;
            }
            Object obj = objArr[i5];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e4) {
                    String str2 = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e4);
                    string = "<" + str2 + " threw " + e4.getClass().getName() + ">";
                }
            }
            objArr[i5] = string;
            i5++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i6 = 0;
        while (true) {
            length2 = objArr.length;
            if (i4 >= length2 || (iIndexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, iIndexOf);
            sb.append(objArr[i4]);
            i4++;
            i6 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i4 < length2) {
            sb.append(" [");
            sb.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
