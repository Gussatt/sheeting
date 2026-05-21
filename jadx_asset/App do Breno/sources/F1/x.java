package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class x extends F.e.d.AbstractC0031e.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1458b;

    public static final class b extends F.e.d.AbstractC0031e.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1460b;

        @Override // F1.F.e.d.AbstractC0031e.b.a
        public F.e.d.AbstractC0031e.b a() {
            String str;
            String str2 = this.f1459a;
            if (str2 != null && (str = this.f1460b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1459a == null) {
                sb.append(" rolloutId");
            }
            if (this.f1460b == null) {
                sb.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.AbstractC0031e.b.a
        public F.e.d.AbstractC0031e.b.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null rolloutId");
            }
            this.f1459a = str;
            return this;
        }

        @Override // F1.F.e.d.AbstractC0031e.b.a
        public F.e.d.AbstractC0031e.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            this.f1460b = str;
            return this;
        }
    }

    @Override // F1.F.e.d.AbstractC0031e.b
    public String b() {
        return this.f1457a;
    }

    @Override // F1.F.e.d.AbstractC0031e.b
    public String c() {
        return this.f1458b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0031e.b) {
            F.e.d.AbstractC0031e.b bVar = (F.e.d.AbstractC0031e.b) obj;
            if (this.f1457a.equals(bVar.b()) && this.f1458b.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1457a.hashCode() ^ 1000003) * 1000003) ^ this.f1458b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f1457a + ", variantId=" + this.f1458b + "}";
    }

    public x(String str, String str2) {
        this.f1457a = str;
        this.f1458b = str2;
    }
}
