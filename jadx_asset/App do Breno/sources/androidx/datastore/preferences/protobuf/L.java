package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f4640a;

    static {
        char[] cArr = new char[80];
        f4640a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i4, StringBuilder sb) {
        while (i4 > 0) {
            char[] cArr = f4640a;
            int length = i4 > cArr.length ? cArr.length : i4;
            sb.append(cArr, 0, length);
            i4 -= length;
        }
    }

    public static boolean b(Object obj) {
        return obj instanceof Boolean ? !((Boolean) obj).booleanValue() : obj instanceof Integer ? ((Integer) obj).intValue() == 0 : obj instanceof Float ? Float.floatToRawIntBits(((Float) obj).floatValue()) == 0 : obj instanceof Double ? Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0 : obj instanceof String ? obj.equals("") : obj instanceof AbstractC0584f ? obj.equals(AbstractC0584f.f4709n) : obj instanceof J ? obj == ((J) obj).b() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    public static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i4 = 1; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static void d(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i4, sb);
        sb.append(c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(d0.c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0584f) {
            sb.append(": \"");
            sb.append(d0.a((AbstractC0584f) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof AbstractC0597t) {
            sb.append(" {");
            e((AbstractC0597t) obj, sb, i4 + 2);
            sb.append("\n");
            a(i4, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i4 + 2;
        d(sb, i5, "key", entry.getKey());
        d(sb, i5, "value", entry.getValue());
        sb.append("\n");
        a(i4, sb);
        sb.append("}");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(androidx.datastore.preferences.protobuf.J r17, java.lang.StringBuilder r18, int r19) {
        /*
            Method dump skipped, instruction units count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.L.e(androidx.datastore.preferences.protobuf.J, java.lang.StringBuilder, int):void");
    }

    public static String f(J j4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(j4, sb, 0);
        return sb.toString();
    }
}
