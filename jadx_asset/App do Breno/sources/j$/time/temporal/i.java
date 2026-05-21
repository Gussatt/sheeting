package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8469a;

    static {
        Duration duration = Duration.f8292c;
    }

    i(String str) {
        this.f8469a = str;
    }

    @Override // j$.time.temporal.u
    public final m o(m mVar, long j4) {
        int i4 = c.f8465a[ordinal()];
        if (i4 == 1) {
            return mVar.h(Math.addExact(mVar.g(r0), j4), j.f8472c);
        }
        if (i4 == 2) {
            return mVar.l(j4 / 4, b.YEARS).l((j4 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8469a;
    }
}
