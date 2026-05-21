package F1;

import F1.F;
import java.util.List;

/* JADX INFO: renamed from: F1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0270c extends F.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f1253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f1254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f1256i;

    /* JADX INFO: renamed from: F1.c$b */
    public static final class b extends F.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f1261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f1262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f1263g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f1264h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List f1265i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte f1266j;

        @Override // F1.F.a.b
        public F.a a() {
            String str;
            if (this.f1266j == 63 && (str = this.f1258b) != null) {
                return new C0270c(this.f1257a, str, this.f1259c, this.f1260d, this.f1261e, this.f1262f, this.f1263g, this.f1264h, this.f1265i);
            }
            StringBuilder sb = new StringBuilder();
            if ((this.f1266j & 1) == 0) {
                sb.append(" pid");
            }
            if (this.f1258b == null) {
                sb.append(" processName");
            }
            if ((this.f1266j & 2) == 0) {
                sb.append(" reasonCode");
            }
            if ((this.f1266j & 4) == 0) {
                sb.append(" importance");
            }
            if ((this.f1266j & 8) == 0) {
                sb.append(" pss");
            }
            if ((this.f1266j & 16) == 0) {
                sb.append(" rss");
            }
            if ((this.f1266j & 32) == 0) {
                sb.append(" timestamp");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.a.b
        public F.a.b b(List list) {
            this.f1265i = list;
            return this;
        }

        @Override // F1.F.a.b
        public F.a.b c(int i4) {
            this.f1260d = i4;
            this.f1266j = (byte) (this.f1266j | 4);
            return this;
        }

        @Override // F1.F.a.b
        public F.a.b d(int i4) {
            this.f1257a = i4;
            this.f1266j = (byte) (this.f1266j | 1);
            return this;
        }

        @Override // F1.F.a.b
        public F.a.b e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f1258b = str;
            return this;
        }

        @Override // F1.F.a.b
        public F.a.b f(long j4) {
            this.f1261e = j4;
            this.f1266j = (byte) (this.f1266j | 8);
            return this;
        }

        @Override // F1.F.a.b
        public F.a.b g(int i4) {
            this.f1259c = i4;
            this.f1266j = (byte) (this.f1266j | 2);
            return this;
        }

        @Override // F1.F.a.b
        public F.a.b h(long j4) {
            this.f1262f = j4;
            this.f1266j = (byte) (this.f1266j | 16);
            return this;
        }

        @Override // F1.F.a.b
        public F.a.b i(long j4) {
            this.f1263g = j4;
            this.f1266j = (byte) (this.f1266j | 32);
            return this;
        }

        @Override // F1.F.a.b
        public F.a.b j(String str) {
            this.f1264h = str;
            return this;
        }
    }

    @Override // F1.F.a
    public List b() {
        return this.f1256i;
    }

    @Override // F1.F.a
    public int c() {
        return this.f1251d;
    }

    @Override // F1.F.a
    public int d() {
        return this.f1248a;
    }

    @Override // F1.F.a
    public String e() {
        return this.f1249b;
    }

    public boolean equals(Object obj) {
        String str;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.a) {
            F.a aVar = (F.a) obj;
            if (this.f1248a == aVar.d() && this.f1249b.equals(aVar.e()) && this.f1250c == aVar.g() && this.f1251d == aVar.c() && this.f1252e == aVar.f() && this.f1253f == aVar.h() && this.f1254g == aVar.i() && ((str = this.f1255h) != null ? str.equals(aVar.j()) : aVar.j() == null) && ((list = this.f1256i) != null ? list.equals(aVar.b()) : aVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.F.a
    public long f() {
        return this.f1252e;
    }

    @Override // F1.F.a
    public int g() {
        return this.f1250c;
    }

    @Override // F1.F.a
    public long h() {
        return this.f1253f;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f1248a ^ 1000003) * 1000003) ^ this.f1249b.hashCode()) * 1000003) ^ this.f1250c) * 1000003) ^ this.f1251d) * 1000003;
        long j4 = this.f1252e;
        int i4 = (iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f1253f;
        int i5 = (i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.f1254g;
        int i6 = (i5 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str = this.f1255h;
        int iHashCode2 = (i6 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List list = this.f1256i;
        return iHashCode2 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // F1.F.a
    public long i() {
        return this.f1254g;
    }

    @Override // F1.F.a
    public String j() {
        return this.f1255h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f1248a + ", processName=" + this.f1249b + ", reasonCode=" + this.f1250c + ", importance=" + this.f1251d + ", pss=" + this.f1252e + ", rss=" + this.f1253f + ", timestamp=" + this.f1254g + ", traceFile=" + this.f1255h + ", buildIdMappingForArch=" + this.f1256i + "}";
    }

    public C0270c(int i4, String str, int i5, int i6, long j4, long j5, long j6, String str2, List list) {
        this.f1248a = i4;
        this.f1249b = str;
        this.f1250c = i5;
        this.f1251d = i6;
        this.f1252e = j4;
        this.f1253f = j5;
        this.f1254g = j6;
        this.f1255h = str2;
        this.f1256i = list;
    }
}
