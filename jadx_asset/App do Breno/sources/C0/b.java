package C0;

import C0.i;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f438f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f439g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f440h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f441i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f442j;

    /* JADX INFO: renamed from: C0.b$b, reason: collision with other inner class name */
    public static final class C0006b extends i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Integer f444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h f445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Long f446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f447e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Map f448f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Integer f449g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f450h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public byte[] f451i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f452j;

        @Override // C0.i.a
        public i d() {
            String str = "";
            if (this.f443a == null) {
                str = " transportName";
            }
            if (this.f445c == null) {
                str = str + " encodedPayload";
            }
            if (this.f446d == null) {
                str = str + " eventMillis";
            }
            if (this.f447e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f448f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f443a, this.f444b, this.f445c, this.f446d.longValue(), this.f447e.longValue(), this.f448f, this.f449g, this.f450h, this.f451i, this.f452j);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C0.i.a
        public Map e() {
            Map map = this.f448f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // C0.i.a
        public i.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f448f = map;
            return this;
        }

        @Override // C0.i.a
        public i.a g(Integer num) {
            this.f444b = num;
            return this;
        }

        @Override // C0.i.a
        public i.a h(h hVar) {
            if (hVar == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.f445c = hVar;
            return this;
        }

        @Override // C0.i.a
        public i.a i(long j4) {
            this.f446d = Long.valueOf(j4);
            return this;
        }

        @Override // C0.i.a
        public i.a j(byte[] bArr) {
            this.f451i = bArr;
            return this;
        }

        @Override // C0.i.a
        public i.a k(byte[] bArr) {
            this.f452j = bArr;
            return this;
        }

        @Override // C0.i.a
        public i.a l(Integer num) {
            this.f449g = num;
            return this;
        }

        @Override // C0.i.a
        public i.a m(String str) {
            this.f450h = str;
            return this;
        }

        @Override // C0.i.a
        public i.a n(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f443a = str;
            return this;
        }

        @Override // C0.i.a
        public i.a o(long j4) {
            this.f447e = Long.valueOf(j4);
            return this;
        }
    }

    @Override // C0.i
    public Map c() {
        return this.f438f;
    }

    @Override // C0.i
    public Integer d() {
        return this.f434b;
    }

    @Override // C0.i
    public h e() {
        return this.f435c;
    }

    public boolean equals(Object obj) {
        Integer num;
        Integer num2;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f433a.equals(iVar.n()) && ((num = this.f434b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f435c.equals(iVar.e()) && this.f436d == iVar.f() && this.f437e == iVar.o() && this.f438f.equals(iVar.c()) && ((num2 = this.f439g) != null ? num2.equals(iVar.l()) : iVar.l() == null) && ((str = this.f440h) != null ? str.equals(iVar.m()) : iVar.m() == null)) {
                boolean z3 = iVar instanceof b;
                if (Arrays.equals(this.f441i, z3 ? ((b) iVar).f441i : iVar.g())) {
                    if (Arrays.equals(this.f442j, z3 ? ((b) iVar).f442j : iVar.h())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // C0.i
    public long f() {
        return this.f436d;
    }

    @Override // C0.i
    public byte[] g() {
        return this.f441i;
    }

    @Override // C0.i
    public byte[] h() {
        return this.f442j;
    }

    public int hashCode() {
        int iHashCode = (this.f433a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f434b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f435c.hashCode()) * 1000003;
        long j4 = this.f436d;
        int i4 = (iHashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f437e;
        int iHashCode3 = (((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ this.f438f.hashCode()) * 1000003;
        Integer num2 = this.f439g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.f440h;
        return ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.f441i)) * 1000003) ^ Arrays.hashCode(this.f442j);
    }

    @Override // C0.i
    public Integer l() {
        return this.f439g;
    }

    @Override // C0.i
    public String m() {
        return this.f440h;
    }

    @Override // C0.i
    public String n() {
        return this.f433a;
    }

    @Override // C0.i
    public long o() {
        return this.f437e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f433a + ", code=" + this.f434b + ", encodedPayload=" + this.f435c + ", eventMillis=" + this.f436d + ", uptimeMillis=" + this.f437e + ", autoMetadata=" + this.f438f + ", productId=" + this.f439g + ", pseudonymousId=" + this.f440h + ", experimentIdsClear=" + Arrays.toString(this.f441i) + ", experimentIdsEncrypted=" + Arrays.toString(this.f442j) + "}";
    }

    public b(String str, Integer num, h hVar, long j4, long j5, Map map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.f433a = str;
        this.f434b = num;
        this.f435c = hVar;
        this.f436d = j4;
        this.f437e = j5;
        this.f438f = map;
        this.f439g = num2;
        this.f440h = str2;
        this.f441i = bArr;
        this.f442j = bArr2;
    }
}
