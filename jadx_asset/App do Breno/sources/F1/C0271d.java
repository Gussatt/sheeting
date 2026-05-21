package F1;

import F1.F;

/* JADX INFO: renamed from: F1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0271d extends F.a.AbstractC0015a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1269c;

    /* JADX INFO: renamed from: F1.d$b */
    public static final class b extends F.a.AbstractC0015a.AbstractC0016a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f1272c;

        @Override // F1.F.a.AbstractC0015a.AbstractC0016a
        public F.a.AbstractC0015a a() {
            String str;
            String str2;
            String str3 = this.f1270a;
            if (str3 != null && (str = this.f1271b) != null && (str2 = this.f1272c) != null) {
                return new C0271d(str3, str, str2);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1270a == null) {
                sb.append(" arch");
            }
            if (this.f1271b == null) {
                sb.append(" libraryName");
            }
            if (this.f1272c == null) {
                sb.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.a.AbstractC0015a.AbstractC0016a
        public F.a.AbstractC0015a.AbstractC0016a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null arch");
            }
            this.f1270a = str;
            return this;
        }

        @Override // F1.F.a.AbstractC0015a.AbstractC0016a
        public F.a.AbstractC0015a.AbstractC0016a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null buildId");
            }
            this.f1272c = str;
            return this;
        }

        @Override // F1.F.a.AbstractC0015a.AbstractC0016a
        public F.a.AbstractC0015a.AbstractC0016a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null libraryName");
            }
            this.f1271b = str;
            return this;
        }
    }

    @Override // F1.F.a.AbstractC0015a
    public String b() {
        return this.f1267a;
    }

    @Override // F1.F.a.AbstractC0015a
    public String c() {
        return this.f1269c;
    }

    @Override // F1.F.a.AbstractC0015a
    public String d() {
        return this.f1268b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.a.AbstractC0015a) {
            F.a.AbstractC0015a abstractC0015a = (F.a.AbstractC0015a) obj;
            if (this.f1267a.equals(abstractC0015a.b()) && this.f1268b.equals(abstractC0015a.d()) && this.f1269c.equals(abstractC0015a.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f1267a.hashCode() ^ 1000003) * 1000003) ^ this.f1268b.hashCode()) * 1000003) ^ this.f1269c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f1267a + ", libraryName=" + this.f1268b + ", buildId=" + this.f1269c + "}";
    }

    public C0271d(String str, String str2, String str3) {
        this.f1267a = str;
        this.f1268b = str2;
        this.f1269c = str3;
    }
}
