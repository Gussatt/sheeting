package m3;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class I {
    public static final int a(String str, int i4, int i5, int i6) {
        return (int) G.c(str, i4, i5, i6);
    }

    public static final long b(String str, long j4, long j5, long j6) {
        String strD = G.d(str);
        if (strD == null) {
            return j4;
        }
        Long lJ = f3.o.j(strD);
        if (lJ == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lJ.longValue();
        if (j5 <= jLongValue && jLongValue <= j6) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j5 + ".." + j6 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String c(String str, String str2) {
        String strD = G.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(String str, boolean z3) {
        String strD = G.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z3;
    }

    public static /* synthetic */ int e(String str, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        if ((i7 & 8) != 0) {
            i6 = Integer.MAX_VALUE;
        }
        return G.b(str, i4, i5, i6);
    }

    public static /* synthetic */ long f(String str, long j4, long j5, long j6, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            j5 = 1;
        }
        long j7 = j5;
        if ((i4 & 8) != 0) {
            j6 = Long.MAX_VALUE;
        }
        return G.c(str, j4, j7, j6);
    }
}
