package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class v extends F.e.d.AbstractC0030d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1446a;

    public static final class b extends F.e.d.AbstractC0030d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1447a;

        @Override // F1.F.e.d.AbstractC0030d.a
        public F.e.d.AbstractC0030d a() {
            String str = this.f1447a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties: content");
        }

        @Override // F1.F.e.d.AbstractC0030d.a
        public F.e.d.AbstractC0030d.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null content");
            }
            this.f1447a = str;
            return this;
        }
    }

    @Override // F1.F.e.d.AbstractC0030d
    public String b() {
        return this.f1446a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.AbstractC0030d) {
            return this.f1446a.equals(((F.e.d.AbstractC0030d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f1446a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f1446a + "}";
    }

    public v(String str) {
        this.f1446a = str;
    }
}
