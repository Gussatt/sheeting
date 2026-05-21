package j$.time;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements j$.time.temporal.n, j$.time.temporal.o {
    public static final c FRIDAY;
    public static final c MONDAY;
    public static final c SATURDAY;
    public static final c SUNDAY;
    public static final c THURSDAY;
    public static final c TUESDAY;
    public static final c WEDNESDAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c[] f8310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ c[] f8311b;

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f8311b.clone();
    }

    static {
        c cVar = new c("MONDAY", 0);
        MONDAY = cVar;
        c cVar2 = new c("TUESDAY", 1);
        TUESDAY = cVar2;
        c cVar3 = new c("WEDNESDAY", 2);
        WEDNESDAY = cVar3;
        c cVar4 = new c("THURSDAY", 3);
        THURSDAY = cVar4;
        c cVar5 = new c("FRIDAY", 4);
        FRIDAY = cVar5;
        c cVar6 = new c("SATURDAY", 5);
        SATURDAY = cVar6;
        c cVar7 = new c("SUNDAY", 6);
        SUNDAY = cVar7;
        f8311b = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f8310a = values();
    }

    public static c p(int i4) {
        if (i4 < 1 || i4 > 7) {
            throw new a("Invalid value for DayOfWeek: " + i4);
        }
        return f8310a[i4 - 1];
    }

    public final int o() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.DAY_OF_WEEK : qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return qVar.x();
        }
        return super.k(qVar);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return o();
        }
        return super.g(qVar);
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return o();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.DAYS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(o(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
