package c2;

/* JADX INFO: renamed from: c2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0679e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC0678d f6063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC0678d f6064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6065c;

    public C0679e(EnumC0678d enumC0678d, EnumC0678d enumC0678d2, double d4) {
        X2.l.e(enumC0678d, "performance");
        X2.l.e(enumC0678d2, "crashlytics");
        this.f6063a = enumC0678d;
        this.f6064b = enumC0678d2;
        this.f6065c = d4;
    }

    public final EnumC0678d a() {
        return this.f6064b;
    }

    public final EnumC0678d b() {
        return this.f6063a;
    }

    public final double c() {
        return this.f6065c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0679e)) {
            return false;
        }
        C0679e c0679e = (C0679e) obj;
        return this.f6063a == c0679e.f6063a && this.f6064b == c0679e.f6064b && Double.compare(this.f6065c, c0679e.f6065c) == 0;
    }

    public int hashCode() {
        return (((this.f6063a.hashCode() * 31) + this.f6064b.hashCode()) * 31) + Double.hashCode(this.f6065c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f6063a + ", crashlytics=" + this.f6064b + ", sessionSamplingRate=" + this.f6065c + ')';
    }
}
