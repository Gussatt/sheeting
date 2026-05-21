package J0;

import J0.f;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2282c;

    public static final class b extends f.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f2283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f2284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set f2285c;

        @Override // J0.f.b.a
        public f.b a() {
            String str = "";
            if (this.f2283a == null) {
                str = " delta";
            }
            if (this.f2284b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f2285c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new c(this.f2283a.longValue(), this.f2284b.longValue(), this.f2285c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // J0.f.b.a
        public f.b.a b(long j4) {
            this.f2283a = Long.valueOf(j4);
            return this;
        }

        @Override // J0.f.b.a
        public f.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.f2285c = set;
            return this;
        }

        @Override // J0.f.b.a
        public f.b.a d(long j4) {
            this.f2284b = Long.valueOf(j4);
            return this;
        }
    }

    @Override // J0.f.b
    public long b() {
        return this.f2280a;
    }

    @Override // J0.f.b
    public Set c() {
        return this.f2282c;
    }

    @Override // J0.f.b
    public long d() {
        return this.f2281b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f.b) {
            f.b bVar = (f.b) obj;
            if (this.f2280a == bVar.b() && this.f2281b == bVar.d() && this.f2282c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j4 = this.f2280a;
        int i4 = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j5 = this.f2281b;
        return ((i4 ^ ((int) ((j5 >>> 32) ^ j5))) * 1000003) ^ this.f2282c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f2280a + ", maxAllowedDelay=" + this.f2281b + ", flags=" + this.f2282c + "}";
    }

    public c(long j4, long j5, Set set) {
        this.f2280a = j4;
        this.f2281b = j5;
        this.f2282c = set;
    }
}
