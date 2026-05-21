package B0;

import B0.u;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f155c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f156d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f157e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f159g;

    public static final class b extends u.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public o f162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Integer f163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public x f166g;

        @Override // B0.u.a
        public u a() {
            String str = "";
            if (this.f160a == null) {
                str = " requestTimeMs";
            }
            if (this.f161b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new k(this.f160a.longValue(), this.f161b.longValue(), this.f162c, this.f163d, this.f164e, this.f165f, this.f166g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // B0.u.a
        public u.a b(o oVar) {
            this.f162c = oVar;
            return this;
        }

        @Override // B0.u.a
        public u.a c(List list) {
            this.f165f = list;
            return this;
        }

        @Override // B0.u.a
        public u.a d(Integer num) {
            this.f163d = num;
            return this;
        }

        @Override // B0.u.a
        public u.a e(String str) {
            this.f164e = str;
            return this;
        }

        @Override // B0.u.a
        public u.a f(x xVar) {
            this.f166g = xVar;
            return this;
        }

        @Override // B0.u.a
        public u.a g(long j4) {
            this.f160a = Long.valueOf(j4);
            return this;
        }

        @Override // B0.u.a
        public u.a h(long j4) {
            this.f161b = Long.valueOf(j4);
            return this;
        }
    }

    @Override // B0.u
    public o b() {
        return this.f155c;
    }

    @Override // B0.u
    public List c() {
        return this.f158f;
    }

    @Override // B0.u
    public Integer d() {
        return this.f156d;
    }

    @Override // B0.u
    public String e() {
        return this.f157e;
    }

    public boolean equals(Object obj) {
        o oVar;
        Integer num;
        String str;
        List list;
        x xVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (this.f153a == uVar.g() && this.f154b == uVar.h() && ((oVar = this.f155c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f156d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f157e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f158f) != null ? list.equals(uVar.c()) : uVar.c() == null) && ((xVar = this.f159g) != null ? xVar.equals(uVar.f()) : uVar.f() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // B0.u
    public x f() {
        return this.f159g;
    }

    @Override // B0.u
    public long g() {
        return this.f153a;
    }

    @Override // B0.u
    public long h() {
        return this.f154b;
    }

    public int hashCode() {
        long j4 = this.f153a;
        long j5 = this.f154b;
        int i4 = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003;
        o oVar = this.f155c;
        int iHashCode = (i4 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f156d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f157e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f158f;
        int iHashCode4 = (iHashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        x xVar = this.f159g;
        return iHashCode4 ^ (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f153a + ", requestUptimeMs=" + this.f154b + ", clientInfo=" + this.f155c + ", logSource=" + this.f156d + ", logSourceName=" + this.f157e + ", logEvents=" + this.f158f + ", qosTier=" + this.f159g + "}";
    }

    public k(long j4, long j5, o oVar, Integer num, String str, List list, x xVar) {
        this.f153a = j4;
        this.f154b = j5;
        this.f155c = oVar;
        this.f156d = num;
        this.f157e = str;
        this.f158f = list;
        this.f159g = xVar;
    }
}
