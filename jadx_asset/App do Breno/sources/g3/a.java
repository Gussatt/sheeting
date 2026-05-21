package g3;

import X2.g;
import X2.l;
import f3.q;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0121a f7303n = new C0121a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final long f7304o = i(0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f7305p = c.e(4611686018427387903L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final long f7306q = c.e(-4611686018427387903L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f7307m;

    /* JADX INFO: renamed from: g3.a$a, reason: collision with other inner class name */
    public static final class C0121a {
        public /* synthetic */ C0121a(g gVar) {
            this();
        }

        public C0121a() {
        }
    }

    public /* synthetic */ a(long j4) {
        this.f7307m = j4;
    }

    public static final boolean A(long j4) {
        return j4 == f7305p || j4 == f7306q;
    }

    public static final boolean B(long j4) {
        return j4 < 0;
    }

    public static final boolean C(long j4) {
        return j4 > 0;
    }

    public static final long D(long j4, d dVar) {
        l.e(dVar, "unit");
        if (j4 == f7305p) {
            return Long.MAX_VALUE;
        }
        if (j4 == f7306q) {
            return Long.MIN_VALUE;
        }
        return e.a(v(j4), u(j4), dVar);
    }

    public static String E(long j4) {
        if (j4 == 0) {
            return "0s";
        }
        if (j4 == f7305p) {
            return "Infinity";
        }
        if (j4 == f7306q) {
            return "-Infinity";
        }
        boolean zB = B(j4);
        StringBuilder sb = new StringBuilder();
        if (zB) {
            sb.append('-');
        }
        long jK = k(j4);
        long jM = m(jK);
        int iL = l(jK);
        int iR = r(jK);
        int iT = t(jK);
        int iS = s(jK);
        int i4 = 0;
        boolean z3 = jM != 0;
        boolean z4 = iL != 0;
        boolean z5 = iR != 0;
        boolean z6 = (iT == 0 && iS == 0) ? false : true;
        if (z3) {
            sb.append(jM);
            sb.append('d');
            i4 = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i5 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(iL);
            sb.append('h');
            i4 = i5;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i6 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(iR);
            sb.append('m');
            i4 = i6;
        }
        if (z6) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            if (iT != 0 || z3 || z4 || z5) {
                d(j4, sb, iT, iS, 9, "s", false);
            } else if (iS >= 1000000) {
                d(j4, sb, iS / 1000000, iS % 1000000, 6, "ms", false);
            } else if (iS >= 1000) {
                d(j4, sb, iS / 1000, iS % 1000, 3, "us", false);
            } else {
                sb.append(iS);
                sb.append("ns");
            }
            i4 = i7;
        }
        if (zB && i4 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long F(long j4) {
        return c.d(-v(j4), ((int) j4) & 1);
    }

    public static final void d(long j4, StringBuilder sb, int i4, int i5, int i6, String str, boolean z3) {
        sb.append(i4);
        if (i5 != 0) {
            sb.append('.');
            String strP = q.P(String.valueOf(i5), i6, '0');
            int i7 = -1;
            int length = strP.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i8 = length - 1;
                    if (strP.charAt(length) != '0') {
                        i7 = length;
                        break;
                    } else if (i8 < 0) {
                        break;
                    } else {
                        length = i8;
                    }
                }
            }
            int i9 = i7 + 1;
            if (z3 || i9 >= 3) {
                sb.append((CharSequence) strP, 0, ((i7 + 3) / 3) * 3);
                l.d(sb, "append(...)");
            } else {
                sb.append((CharSequence) strP, 0, i9);
                l.d(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    public static final /* synthetic */ a f(long j4) {
        return new a(j4);
    }

    public static int h(long j4, long j5) {
        long j6 = j4 ^ j5;
        if (j6 < 0 || (((int) j6) & 1) == 0) {
            return l.g(j4, j5);
        }
        int i4 = (((int) j4) & 1) - (((int) j5) & 1);
        return B(j4) ? -i4 : i4;
    }

    public static long i(long j4) {
        if (!b.a()) {
            return j4;
        }
        if (z(j4)) {
            long jV = v(j4);
            if (-4611686018426999999L <= jV && jV < 4611686018427000000L) {
                return j4;
            }
            throw new AssertionError(v(j4) + " ns is out of nanoseconds range");
        }
        long jV2 = v(j4);
        if (-4611686018427387903L > jV2 || jV2 >= 4611686018427387904L) {
            throw new AssertionError(v(j4) + " ms is out of milliseconds range");
        }
        long jV3 = v(j4);
        if (-4611686018426L > jV3 || jV3 >= 4611686018427L) {
            return j4;
        }
        throw new AssertionError(v(j4) + " ms is denormalized");
    }

    public static boolean j(long j4, Object obj) {
        return (obj instanceof a) && j4 == ((a) obj).G();
    }

    public static final long k(long j4) {
        return B(j4) ? F(j4) : j4;
    }

    public static final int l(long j4) {
        if (A(j4)) {
            return 0;
        }
        return (int) (n(j4) % ((long) 24));
    }

    public static final long m(long j4) {
        return D(j4, d.f7316t);
    }

    public static final long n(long j4) {
        return D(j4, d.f7315s);
    }

    public static final long o(long j4) {
        return (y(j4) && x(j4)) ? v(j4) : D(j4, d.f7312p);
    }

    public static final long p(long j4) {
        return D(j4, d.f7314r);
    }

    public static final long q(long j4) {
        return D(j4, d.f7313q);
    }

    public static final int r(long j4) {
        if (A(j4)) {
            return 0;
        }
        return (int) (p(j4) % ((long) 60));
    }

    public static final int s(long j4) {
        if (A(j4)) {
            return 0;
        }
        return (int) (y(j4) ? c.g(v(j4) % ((long) 1000)) : v(j4) % ((long) 1000000000));
    }

    public static final int t(long j4) {
        if (A(j4)) {
            return 0;
        }
        return (int) (q(j4) % ((long) 60));
    }

    public static final d u(long j4) {
        return z(j4) ? d.f7310n : d.f7312p;
    }

    public static final long v(long j4) {
        return j4 >> 1;
    }

    public static int w(long j4) {
        return Long.hashCode(j4);
    }

    public static final boolean x(long j4) {
        return !A(j4);
    }

    public static final boolean y(long j4) {
        return (((int) j4) & 1) == 1;
    }

    public static final boolean z(long j4) {
        return (((int) j4) & 1) == 0;
    }

    public final /* synthetic */ long G() {
        return this.f7307m;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return g(((a) obj).G());
    }

    public boolean equals(Object obj) {
        return j(this.f7307m, obj);
    }

    public int g(long j4) {
        return h(this.f7307m, j4);
    }

    public int hashCode() {
        return w(this.f7307m);
    }

    public String toString() {
        return E(this.f7307m);
    }
}
