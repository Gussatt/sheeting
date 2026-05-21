package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0876v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f6982a;

    static {
        char[] cArr = new char[80];
        f6982a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String a(InterfaceC0860t5 interfaceC0860t5, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(interfaceC0860t5, sb, 0);
        return sb.toString();
    }

    public static void b(StringBuilder sb, int i4, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i4, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i4, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i4, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i5 = 1; i5 < str.length(); i5++) {
                char cCharAt = str.charAt(i5);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            A4 a4 = A4.f6292n;
            sb.append(I5.a(new C0899y4(((String) obj).getBytes(AbstractC0717c5.f6667a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof A4) {
            sb.append(": \"");
            sb.append(I5.a((A4) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof V4) {
            sb.append(" {");
            d((V4) obj, sb, i4 + 2);
            sb.append("\n");
            c(i4, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i6 = i4 + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        b(sb, i6, "key", entry.getKey());
        b(sb, i6, "value", entry.getValue());
        sb.append("\n");
        c(i4, sb);
        sb.append("}");
    }

    public static void c(int i4, StringBuilder sb) {
        while (i4 > 0) {
            int i5 = 80;
            if (i4 <= 80) {
                i5 = i4;
            }
            sb.append(f6982a, 0, i5);
            i4 -= i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(com.google.android.gms.internal.measurement.InterfaceC0860t5 r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instruction units count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC0876v5.d(com.google.android.gms.internal.measurement.t5, java.lang.StringBuilder, int):void");
    }
}
