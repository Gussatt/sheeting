package f2;

import X2.l;

/* JADX INFO: renamed from: f2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0954e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f7238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f7239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f7240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f7241e;

    public C0954e(Boolean bool, Double d4, Integer num, Integer num2, Long l4) {
        this.f7237a = bool;
        this.f7238b = d4;
        this.f7239c = num;
        this.f7240d = num2;
        this.f7241e = l4;
    }

    public final Integer a() {
        return this.f7240d;
    }

    public final Long b() {
        return this.f7241e;
    }

    public final Boolean c() {
        return this.f7237a;
    }

    public final Integer d() {
        return this.f7239c;
    }

    public final Double e() {
        return this.f7238b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0954e)) {
            return false;
        }
        C0954e c0954e = (C0954e) obj;
        return l.a(this.f7237a, c0954e.f7237a) && l.a(this.f7238b, c0954e.f7238b) && l.a(this.f7239c, c0954e.f7239c) && l.a(this.f7240d, c0954e.f7240d) && l.a(this.f7241e, c0954e.f7241e);
    }

    public int hashCode() {
        Boolean bool = this.f7237a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d4 = this.f7238b;
        int iHashCode2 = (iHashCode + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num = this.f7239c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7240d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l4 = this.f7241e;
        return iHashCode4 + (l4 != null ? l4.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f7237a + ", sessionSamplingRate=" + this.f7238b + ", sessionRestartTimeout=" + this.f7239c + ", cacheDuration=" + this.f7240d + ", cacheUpdatedTime=" + this.f7241e + ')';
    }
}
