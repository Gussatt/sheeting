package B0;

import B0.r;

/* JADX INFO: loaded from: classes.dex */
public final class h extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f131a;

    public static final class b extends r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Integer f132a;

        @Override // B0.r.a
        public r a() {
            return new h(this.f132a);
        }

        @Override // B0.r.a
        public r.a b(Integer num) {
            this.f132a = num;
            return this;
        }
    }

    @Override // B0.r
    public Integer b() {
        return this.f131a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        Integer num = this.f131a;
        Integer numB = ((r) obj).b();
        return num == null ? numB == null : num.equals(numB);
    }

    public int hashCode() {
        Integer num = this.f131a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f131a + "}";
    }

    public h(Integer num) {
        this.f131a = num;
    }
}
