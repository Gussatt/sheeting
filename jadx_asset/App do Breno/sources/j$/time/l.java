package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements j$.time.temporal.n, j$.time.temporal.o {
    public static final l APRIL;
    public static final l AUGUST;
    public static final l DECEMBER;
    public static final l FEBRUARY;
    public static final l JANUARY;
    public static final l JULY;
    public static final l JUNE;
    public static final l MARCH;
    public static final l MAY;
    public static final l NOVEMBER;
    public static final l OCTOBER;
    public static final l SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l[] f8442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ l[] f8443b;

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f8443b.clone();
    }

    static {
        l lVar = new l("JANUARY", 0);
        JANUARY = lVar;
        l lVar2 = new l("FEBRUARY", 1);
        FEBRUARY = lVar2;
        l lVar3 = new l("MARCH", 2);
        MARCH = lVar3;
        l lVar4 = new l("APRIL", 3);
        APRIL = lVar4;
        l lVar5 = new l("MAY", 4);
        MAY = lVar5;
        l lVar6 = new l("JUNE", 5);
        JUNE = lVar6;
        l lVar7 = new l("JULY", 6);
        JULY = lVar7;
        l lVar8 = new l("AUGUST", 7);
        AUGUST = lVar8;
        l lVar9 = new l("SEPTEMBER", 8);
        SEPTEMBER = lVar9;
        l lVar10 = new l("OCTOBER", 9);
        OCTOBER = lVar10;
        l lVar11 = new l("NOVEMBER", 10);
        NOVEMBER = lVar11;
        l lVar12 = new l("DECEMBER", 11);
        DECEMBER = lVar12;
        f8443b = new l[]{lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, lVar8, lVar9, lVar10, lVar11, lVar12};
        f8442a = values();
    }

    public static l J(int i4) {
        if (i4 < 1 || i4 > 12) {
            throw new a("Invalid value for MonthOfYear: " + i4);
        }
        return f8442a[i4 - 1];
    }

    public final int o() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.MONTH_OF_YEAR : qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return qVar.x();
        }
        return super.k(qVar);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return o();
        }
        return super.g(qVar);
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return o();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
        }
        return qVar.p(this);
    }

    public final l L() {
        return f8442a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final int x(boolean z3) {
        int i4 = k.f8441a[ordinal()];
        return i4 != 1 ? (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? 30 : 31 : z3 ? 29 : 28;
    }

    public final int B() {
        int i4 = k.f8441a[ordinal()];
        if (i4 != 1) {
            return (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int p(boolean z3) {
        switch (k.f8441a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z3 ? 1 : 0) + 91;
            case 3:
                return (z3 ? 1 : 0) + 152;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return (z3 ? 1 : 0) + 244;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return (z3 ? 1 : 0) + 305;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return 1;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return (z3 ? 1 : 0) + 60;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return (z3 ? 1 : 0) + 121;
            case 9:
                return (z3 ? 1 : 0) + 182;
            case 10:
                return (z3 ? 1 : 0) + 213;
            case 11:
                return (z3 ? 1 : 0) + 274;
            default:
                return (z3 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return j$.time.chrono.t.f8358d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.z(mVar).equals(j$.time.chrono.t.f8358d)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.h(o(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
