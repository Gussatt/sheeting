package F1;

import F1.F;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p extends F.e.d.a.b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1390c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final F.e.d.a.b.c f1391d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1392e;

    public static final class b extends F.e.d.a.b.c.AbstractC0022a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f1394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f1395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public F.e.d.a.b.c f1396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public byte f1398f;

        @Override // F1.F.e.d.a.b.c.AbstractC0022a
        public F.e.d.a.b.c a() {
            String str;
            List list;
            if (this.f1398f == 1 && (str = this.f1393a) != null && (list = this.f1395c) != null) {
                return new p(str, this.f1394b, list, this.f1396d, this.f1397e);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1393a == null) {
                sb.append(" type");
            }
            if (this.f1395c == null) {
                sb.append(" frames");
            }
            if ((1 & this.f1398f) == 0) {
                sb.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.a.b.c.AbstractC0022a
        public F.e.d.a.b.c.AbstractC0022a b(F.e.d.a.b.c cVar) {
            this.f1396d = cVar;
            return this;
        }

        @Override // F1.F.e.d.a.b.c.AbstractC0022a
        public F.e.d.a.b.c.AbstractC0022a c(List list) {
            if (list == null) {
                throw new NullPointerException("Null frames");
            }
            this.f1395c = list;
            return this;
        }

        @Override // F1.F.e.d.a.b.c.AbstractC0022a
        public F.e.d.a.b.c.AbstractC0022a d(int i4) {
            this.f1397e = i4;
            this.f1398f = (byte) (this.f1398f | 1);
            return this;
        }

        @Override // F1.F.e.d.a.b.c.AbstractC0022a
        public F.e.d.a.b.c.AbstractC0022a e(String str) {
            this.f1394b = str;
            return this;
        }

        @Override // F1.F.e.d.a.b.c.AbstractC0022a
        public F.e.d.a.b.c.AbstractC0022a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null type");
            }
            this.f1393a = str;
            return this;
        }
    }

    @Override // F1.F.e.d.a.b.c
    public F.e.d.a.b.c b() {
        return this.f1391d;
    }

    @Override // F1.F.e.d.a.b.c
    public List c() {
        return this.f1390c;
    }

    @Override // F1.F.e.d.a.b.c
    public int d() {
        return this.f1392e;
    }

    @Override // F1.F.e.d.a.b.c
    public String e() {
        return this.f1389b;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.b.c) {
            F.e.d.a.b.c cVar2 = (F.e.d.a.b.c) obj;
            if (this.f1388a.equals(cVar2.f()) && ((str = this.f1389b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f1390c.equals(cVar2.c()) && ((cVar = this.f1391d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f1392e == cVar2.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.F.e.d.a.b.c
    public String f() {
        return this.f1388a;
    }

    public int hashCode() {
        int iHashCode = (this.f1388a.hashCode() ^ 1000003) * 1000003;
        String str = this.f1389b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f1390c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.f1391d;
        return ((iHashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f1392e;
    }

    public String toString() {
        return "Exception{type=" + this.f1388a + ", reason=" + this.f1389b + ", frames=" + this.f1390c + ", causedBy=" + this.f1391d + ", overflowCount=" + this.f1392e + "}";
    }

    public p(String str, String str2, List list, F.e.d.a.b.c cVar, int i4) {
        this.f1388a = str;
        this.f1389b = str2;
        this.f1390c = list;
        this.f1391d = cVar;
        this.f1392e = i4;
    }
}
