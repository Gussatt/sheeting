package B0;

import B0.t;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f138d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f139e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f140f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f141g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final w f142h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final q f143i;

    public static final class b extends t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f145b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public p f146c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f147d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f149f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Long f150g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public w f151h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public q f152i;

        @Override // B0.t.a
        public t a() {
            String str = "";
            if (this.f144a == null) {
                str = " eventTimeMs";
            }
            if (this.f147d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f150g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new j(this.f144a.longValue(), this.f145b, this.f146c, this.f147d.longValue(), this.f148e, this.f149f, this.f150g.longValue(), this.f151h, this.f152i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // B0.t.a
        public t.a b(p pVar) {
            this.f146c = pVar;
            return this;
        }

        @Override // B0.t.a
        public t.a c(Integer num) {
            this.f145b = num;
            return this;
        }

        @Override // B0.t.a
        public t.a d(long j4) {
            this.f144a = Long.valueOf(j4);
            return this;
        }

        @Override // B0.t.a
        public t.a e(long j4) {
            this.f147d = Long.valueOf(j4);
            return this;
        }

        @Override // B0.t.a
        public t.a f(q qVar) {
            this.f152i = qVar;
            return this;
        }

        @Override // B0.t.a
        public t.a g(w wVar) {
            this.f151h = wVar;
            return this;
        }

        @Override // B0.t.a
        public t.a h(byte[] bArr) {
            this.f148e = bArr;
            return this;
        }

        @Override // B0.t.a
        public t.a i(String str) {
            this.f149f = str;
            return this;
        }

        @Override // B0.t.a
        public t.a j(long j4) {
            this.f150g = Long.valueOf(j4);
            return this;
        }
    }

    @Override // B0.t
    public p b() {
        return this.f137c;
    }

    @Override // B0.t
    public Integer c() {
        return this.f136b;
    }

    @Override // B0.t
    public long d() {
        return this.f135a;
    }

    @Override // B0.t
    public long e() {
        return this.f138d;
    }

    public boolean equals(Object obj) {
        Integer num;
        p pVar;
        String str;
        w wVar;
        q qVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof t) {
            t tVar = (t) obj;
            if (this.f135a == tVar.d() && ((num = this.f136b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f137c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f138d == tVar.e()) {
                if (Arrays.equals(this.f139e, tVar instanceof j ? ((j) tVar).f139e : tVar.h()) && ((str = this.f140f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f141g == tVar.j() && ((wVar = this.f142h) != null ? wVar.equals(tVar.g()) : tVar.g() == null) && ((qVar = this.f143i) != null ? qVar.equals(tVar.f()) : tVar.f() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // B0.t
    public q f() {
        return this.f143i;
    }

    @Override // B0.t
    public w g() {
        return this.f142h;
    }

    @Override // B0.t
    public byte[] h() {
        return this.f139e;
    }

    public int hashCode() {
        long j4 = this.f135a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f136b;
        int iHashCode = (i4 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        p pVar = this.f137c;
        int iHashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j5 = this.f138d;
        int iHashCode3 = (((((iHashCode ^ iHashCode2) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f139e)) * 1000003;
        String str = this.f140f;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        long j6 = this.f141g;
        int i5 = (((iHashCode3 ^ iHashCode4) * 1000003) ^ ((int) ((j6 >>> 32) ^ j6))) * 1000003;
        w wVar = this.f142h;
        int iHashCode5 = (i5 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        q qVar = this.f143i;
        return iHashCode5 ^ (qVar != null ? qVar.hashCode() : 0);
    }

    @Override // B0.t
    public String i() {
        return this.f140f;
    }

    @Override // B0.t
    public long j() {
        return this.f141g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f135a + ", eventCode=" + this.f136b + ", complianceData=" + this.f137c + ", eventUptimeMs=" + this.f138d + ", sourceExtension=" + Arrays.toString(this.f139e) + ", sourceExtensionJsonProto3=" + this.f140f + ", timezoneOffsetSeconds=" + this.f141g + ", networkConnectionInfo=" + this.f142h + ", experimentIds=" + this.f143i + "}";
    }

    public j(long j4, Integer num, p pVar, long j5, byte[] bArr, String str, long j6, w wVar, q qVar) {
        this.f135a = j4;
        this.f136b = num;
        this.f137c = pVar;
        this.f138d = j5;
        this.f139e = bArr;
        this.f140f = str;
        this.f141g = j6;
        this.f142h = wVar;
        this.f143i = qVar;
    }
}
