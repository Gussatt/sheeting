package F1;

import F1.F;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r extends F.e.d.a.b.AbstractC0025e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1408c;

    public static final class b extends F.e.d.a.b.AbstractC0025e.AbstractC0026a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f1411c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte f1412d;

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0026a
        public F.e.d.a.b.AbstractC0025e a() {
            String str;
            List list;
            if (this.f1412d == 1 && (str = this.f1409a) != null && (list = this.f1411c) != null) {
                return new r(str, this.f1410b, list);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1409a == null) {
                sb.append(" name");
            }
            if ((1 & this.f1412d) == 0) {
                sb.append(" importance");
            }
            if (this.f1411c == null) {
                sb.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0026a
        public F.e.d.a.b.AbstractC0025e.AbstractC0026a b(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f1411c = list;
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0026a
        public F.e.d.a.b.AbstractC0025e.AbstractC0026a c(int i4) {
            this.f1410b = i4;
            this.f1412d = (byte) (this.f1412d | 1);
            return this;
        }

        @Override // F1.F.e.d.a.b.AbstractC0025e.AbstractC0026a
        public F.e.d.a.b.AbstractC0025e.AbstractC0026a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null name");
            }
            this.f1409a = str;
            return this;
        }
    }

    @Override // F1.F.e.d.a.b.AbstractC0025e
    public List b() {
        return this.f1408c;
    }

    @Override // F1.F.e.d.a.b.AbstractC0025e
    public int c() {
        return this.f1407b;
    }

    @Override // F1.F.e.d.a.b.AbstractC0025e
    public String d() {
        return this.f1406a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.AbstractC0025e) {
            F.e.d.a.b.AbstractC0025e abstractC0025e = (F.e.d.a.b.AbstractC0025e) obj;
            if (this.f1406a.equals(abstractC0025e.d()) && this.f1407b == abstractC0025e.c() && this.f1408c.equals(abstractC0025e.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f1406a.hashCode() ^ 1000003) * 1000003) ^ this.f1407b) * 1000003) ^ this.f1408c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f1406a + ", importance=" + this.f1407b + ", frames=" + this.f1408c + "}";
    }

    public r(String str, int i4, List list) {
        this.f1406a = str;
        this.f1407b = i4;
        this.f1408c = list;
    }
}
