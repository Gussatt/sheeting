package F1;

import F1.F;

/* JADX INFO: renamed from: F1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0272e extends F.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1274b;

    /* JADX INFO: renamed from: F1.e$b */
    public static final class b extends F.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1276b;

        @Override // F1.F.c.a
        public F.c a() {
            String str;
            String str2 = this.f1275a;
            if (str2 != null && (str = this.f1276b) != null) {
                return new C0272e(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1275a == null) {
                sb.append(" key");
            }
            if (this.f1276b == null) {
                sb.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.c.a
        public F.c.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            this.f1275a = str;
            return this;
        }

        @Override // F1.F.c.a
        public F.c.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null value");
            }
            this.f1276b = str;
            return this;
        }
    }

    @Override // F1.F.c
    public String b() {
        return this.f1273a;
    }

    @Override // F1.F.c
    public String c() {
        return this.f1274b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.c) {
            F.c cVar = (F.c) obj;
            if (this.f1273a.equals(cVar.b()) && this.f1274b.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1273a.hashCode() ^ 1000003) * 1000003) ^ this.f1274b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f1273a + ", value=" + this.f1274b + "}";
    }

    public C0272e(String str, String str2) {
        this.f1273a = str;
        this.f1274b = str2;
    }
}
