package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient String f8474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient w f8475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient long f8476c;

    @Override // j$.time.temporal.q
    public final boolean J() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j4) {
        this.f8474a = str;
        this.f8475b = w.j((-365243219162L) + j4, 365241780471L + j4);
        this.f8476c = j4;
    }

    @Override // j$.time.temporal.q
    public final w x() {
        return this.f8475b;
    }

    @Override // j$.time.temporal.q
    public final w B(n nVar) {
        if (nVar.d(a.EPOCH_DAY)) {
            return this.f8475b;
        }
        throw new j$.time.a("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final boolean L(n nVar) {
        return nVar.d(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final long p(n nVar) {
        return nVar.e(a.EPOCH_DAY) + this.f8476c;
    }

    @Override // j$.time.temporal.q
    public final m o(m mVar, long j4) {
        if (!this.f8475b.i(j4)) {
            throw new j$.time.a("Invalid value: " + this.f8474a + " " + j4);
        }
        return mVar.h(Math.subtractExact(j4, this.f8476c), a.EPOCH_DAY);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f8474a;
    }
}
