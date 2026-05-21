package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class A extends F.e.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1052a;

    public static final class b extends F.e.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1053a;

        @Override // F1.F.e.f.a
        public F.e.f a() {
            String str = this.f1053a;
            if (str != null) {
                return new A(str);
            }
            throw new IllegalStateException("Missing required properties: identifier");
        }

        @Override // F1.F.e.f.a
        public F.e.f.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null identifier");
            }
            this.f1053a = str;
            return this;
        }
    }

    @Override // F1.F.e.f
    public String b() {
        return this.f1052a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.f) {
            return this.f1052a.equals(((F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f1052a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f1052a + "}";
    }

    public A(String str) {
        this.f1052a = str;
    }
}
