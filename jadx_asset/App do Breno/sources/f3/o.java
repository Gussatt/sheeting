package f3;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends n {
    public static Long j(String str) {
        X2.l.e(str, "<this>");
        return k(str, 10);
    }

    public static final Long k(String str, int i4) {
        boolean z3;
        X2.l.e(str, "<this>");
        a.a(i4);
        int length = str.length();
        Long l4 = null;
        if (length == 0) {
            return null;
        }
        int i5 = 0;
        char cCharAt = str.charAt(0);
        long j4 = -9223372036854775807L;
        if (X2.l.f(cCharAt, 48) < 0) {
            z3 = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z3 = false;
                i5 = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j4 = Long.MIN_VALUE;
                i5 = 1;
            }
        } else {
            z3 = false;
        }
        long j5 = 0;
        long j6 = -256204778801521550L;
        while (i5 < length) {
            int iB = a.b(str.charAt(i5), i4);
            if (iB < 0) {
                return l4;
            }
            if (j5 < j6) {
                if (j6 != -256204778801521550L) {
                    return l4;
                }
                j6 = j4 / ((long) i4);
                if (j5 < j6) {
                    return l4;
                }
            }
            Long l5 = l4;
            int i6 = i5;
            long j7 = j5 * ((long) i4);
            long j8 = iB;
            if (j7 < j4 + j8) {
                return l5;
            }
            j5 = j7 - j8;
            i5 = i6 + 1;
            l4 = l5;
        }
        return z3 ? Long.valueOf(j5) : Long.valueOf(-j5);
    }
}
