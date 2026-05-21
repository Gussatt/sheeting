package j$.time.temporal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
abstract class h implements q {
    public static final h DAY_OF_QUARTER;
    public static final h QUARTER_OF_YEAR;
    public static final h WEEK_BASED_YEAR;
    public static final h WEEK_OF_WEEK_BASED_YEAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f8466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ h[] f8467b;

    @Override // j$.time.temporal.q
    public final boolean J() {
        return true;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f8467b.clone();
    }

    static {
        h hVar = new h() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.q
            public final w x() {
                return w.k(90L, 92L);
            }

            @Override // j$.time.temporal.q
            public final boolean L(n nVar) {
                if (!nVar.d(a.DAY_OF_YEAR) || !nVar.d(a.MONTH_OF_YEAR) || !nVar.d(a.YEAR)) {
                    return false;
                }
                q qVar = j.f8470a;
                return j$.time.chrono.m.z(nVar).equals(j$.time.chrono.t.f8358d);
            }

            @Override // j$.time.temporal.q
            public final w B(n nVar) {
                if (!L(nVar)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                long jE = nVar.e(h.QUARTER_OF_YEAR);
                if (jE == 1) {
                    long jE2 = nVar.e(a.YEAR);
                    j$.time.chrono.t.f8358d.getClass();
                    return j$.time.chrono.t.x(jE2) ? w.j(1L, 91L) : w.j(1L, 90L);
                }
                if (jE == 2) {
                    return w.j(1L, 91L);
                }
                if (jE == 3 || jE == 4) {
                    return w.j(1L, 92L);
                }
                return x();
            }

            @Override // j$.time.temporal.q
            public final long p(n nVar) {
                if (!L(nVar)) {
                    throw new v("Unsupported field: DayOfQuarter");
                }
                int iG = nVar.g(a.DAY_OF_YEAR);
                int iG2 = nVar.g(a.MONTH_OF_YEAR);
                long jE = nVar.e(a.YEAR);
                int[] iArr = h.f8466a;
                int i4 = (iG2 - 1) / 3;
                j$.time.chrono.t.f8358d.getClass();
                return iG - iArr[i4 + (j$.time.chrono.t.x(jE) ? 4 : 0)];
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j4) {
                long jP = p(mVar);
                x().b(j4, this);
                a aVar = a.DAY_OF_YEAR;
                return mVar.h((j4 - jP) + mVar.e(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = hVar;
        h hVar2 = new h() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.q
            public final w x() {
                return w.j(1L, 4L);
            }

            @Override // j$.time.temporal.q
            public final boolean L(n nVar) {
                if (!nVar.d(a.MONTH_OF_YEAR)) {
                    return false;
                }
                q qVar = j.f8470a;
                return j$.time.chrono.m.z(nVar).equals(j$.time.chrono.t.f8358d);
            }

            @Override // j$.time.temporal.q
            public final long p(n nVar) {
                if (!L(nVar)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return (nVar.e(a.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.q
            public final w B(n nVar) {
                if (!L(nVar)) {
                    throw new v("Unsupported field: QuarterOfYear");
                }
                return x();
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j4) {
                long jP = p(mVar);
                x().b(j4, this);
                a aVar = a.MONTH_OF_YEAR;
                return mVar.h(((j4 - jP) * 3) + mVar.e(aVar), aVar);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = hVar2;
        h hVar3 = new h() { // from class: j$.time.temporal.f
            @Override // j$.time.temporal.q
            public final w x() {
                return w.k(52L, 53L);
            }

            @Override // j$.time.temporal.q
            public final boolean L(n nVar) {
                if (!nVar.d(a.EPOCH_DAY)) {
                    return false;
                }
                q qVar = j.f8470a;
                return j$.time.chrono.m.z(nVar).equals(j$.time.chrono.t.f8358d);
            }

            @Override // j$.time.temporal.q
            public final w B(n nVar) {
                if (!L(nVar)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.S(j$.time.g.B(nVar));
            }

            @Override // j$.time.temporal.q
            public final long p(n nVar) {
                if (!L(nVar)) {
                    throw new v("Unsupported field: WeekOfWeekBasedYear");
                }
                return h.P(j$.time.g.B(nVar));
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j4) {
                x().b(j4, this);
                return mVar.l(Math.subtractExact(j4, p(mVar)), b.WEEKS);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = hVar3;
        h hVar4 = new h() { // from class: j$.time.temporal.g
            @Override // j$.time.temporal.q
            public final w x() {
                return a.YEAR.x();
            }

            @Override // j$.time.temporal.q
            public final boolean L(n nVar) {
                if (!nVar.d(a.EPOCH_DAY)) {
                    return false;
                }
                q qVar = j.f8470a;
                return j$.time.chrono.m.z(nVar).equals(j$.time.chrono.t.f8358d);
            }

            @Override // j$.time.temporal.q
            public final long p(n nVar) {
                if (!L(nVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                return h.T(j$.time.g.B(nVar));
            }

            @Override // j$.time.temporal.q
            public final w B(n nVar) {
                if (!L(nVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                return x();
            }

            @Override // j$.time.temporal.q
            public final m o(m mVar, long j4) {
                if (!L(mVar)) {
                    throw new v("Unsupported field: WeekBasedYear");
                }
                int iA = a.YEAR.x().a(j4, h.WEEK_BASED_YEAR);
                j$.time.g gVarB = j$.time.g.B(mVar);
                int iG = gVarB.g(a.DAY_OF_WEEK);
                int iP = h.P(gVarB);
                if (iP == 53 && h.U(iA) == 52) {
                    iP = 52;
                }
                return mVar.i(j$.time.g.U(iA, 1, 4).Y(((iP - 1) * 7) + (iG - r6.g(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = hVar4;
        f8467b = new h[]{hVar, hVar2, hVar3, hVar4};
        f8466a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    static w S(j$.time.g gVar) {
        return w.j(1L, U(T(gVar)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int U(int i4) {
        j$.time.g gVarU = j$.time.g.U(i4, 1, 1);
        if (gVarU.L() != j$.time.c.THURSDAY) {
            return (gVarU.L() == j$.time.c.WEDNESDAY && gVarU.S()) ? 53 : 52;
        }
        return 53;
    }

    static int P(j$.time.g gVar) {
        int iOrdinal = gVar.L().ordinal();
        int iO = gVar.O() - 1;
        int i4 = (3 - iOrdinal) + iO;
        int i5 = i4 - ((i4 / 7) * 7);
        int i6 = i5 - 3;
        if (i6 < -3) {
            i6 = i5 + 4;
        }
        if (iO < i6) {
            return (int) w.j(1L, U(T(gVar.e0(180).a0(-1L)))).d();
        }
        int i7 = ((iO - i6) / 7) + 1;
        if (i7 != 53 || i6 == -3 || (i6 == -2 && gVar.S())) {
            return i7;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int T(j$.time.g gVar) {
        int iQ = gVar.Q();
        int iO = gVar.O();
        if (iO <= 3) {
            return iO - gVar.L().ordinal() < -2 ? iQ - 1 : iQ;
        }
        if (iO >= 363) {
            return ((iO - 363) - (gVar.S() ? 1 : 0)) - gVar.L().ordinal() >= 0 ? iQ + 1 : iQ;
        }
        return iQ;
    }
}
