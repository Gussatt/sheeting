package F1;

import F1.F;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m extends F.e.d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.e.d.a.b f1354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f1355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f1356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f1357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F.e.d.a.c f1358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f1359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1360g;

    public static final class b extends F.e.d.a.AbstractC0018a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public F.e.d.a.b f1361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f1362b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f1363c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Boolean f1364d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public F.e.d.a.c f1365e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f1366f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1367g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte f1368h;

        @Override // F1.F.e.d.a.AbstractC0018a
        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.f1368h == 1 && (bVar = this.f1361a) != null) {
                return new m(bVar, this.f1362b, this.f1363c, this.f1364d, this.f1365e, this.f1366f, this.f1367g);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1361a == null) {
                sb.append(" execution");
            }
            if ((1 & this.f1368h) == 0) {
                sb.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.a.AbstractC0018a
        public F.e.d.a.AbstractC0018a b(List list) {
            this.f1366f = list;
            return this;
        }

        @Override // F1.F.e.d.a.AbstractC0018a
        public F.e.d.a.AbstractC0018a c(Boolean bool) {
            this.f1364d = bool;
            return this;
        }

        @Override // F1.F.e.d.a.AbstractC0018a
        public F.e.d.a.AbstractC0018a d(F.e.d.a.c cVar) {
            this.f1365e = cVar;
            return this;
        }

        @Override // F1.F.e.d.a.AbstractC0018a
        public F.e.d.a.AbstractC0018a e(List list) {
            this.f1362b = list;
            return this;
        }

        @Override // F1.F.e.d.a.AbstractC0018a
        public F.e.d.a.AbstractC0018a f(F.e.d.a.b bVar) {
            if (bVar == null) {
                throw new NullPointerException("Null execution");
            }
            this.f1361a = bVar;
            return this;
        }

        @Override // F1.F.e.d.a.AbstractC0018a
        public F.e.d.a.AbstractC0018a g(List list) {
            this.f1363c = list;
            return this;
        }

        @Override // F1.F.e.d.a.AbstractC0018a
        public F.e.d.a.AbstractC0018a h(int i4) {
            this.f1367g = i4;
            this.f1368h = (byte) (this.f1368h | 1);
            return this;
        }

        public b() {
        }

        public b(F.e.d.a aVar) {
            this.f1361a = aVar.f();
            this.f1362b = aVar.e();
            this.f1363c = aVar.g();
            this.f1364d = aVar.c();
            this.f1365e = aVar.d();
            this.f1366f = aVar.b();
            this.f1367g = aVar.h();
            this.f1368h = (byte) 1;
        }
    }

    @Override // F1.F.e.d.a
    public List b() {
        return this.f1359f;
    }

    @Override // F1.F.e.d.a
    public Boolean c() {
        return this.f1357d;
    }

    @Override // F1.F.e.d.a
    public F.e.d.a.c d() {
        return this.f1358e;
    }

    @Override // F1.F.e.d.a
    public List e() {
        return this.f1355b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        Boolean bool;
        F.e.d.a.c cVar;
        List list3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a) {
            F.e.d.a aVar = (F.e.d.a) obj;
            if (this.f1354a.equals(aVar.f()) && ((list = this.f1355b) != null ? list.equals(aVar.e()) : aVar.e() == null) && ((list2 = this.f1356c) != null ? list2.equals(aVar.g()) : aVar.g() == null) && ((bool = this.f1357d) != null ? bool.equals(aVar.c()) : aVar.c() == null) && ((cVar = this.f1358e) != null ? cVar.equals(aVar.d()) : aVar.d() == null) && ((list3 = this.f1359f) != null ? list3.equals(aVar.b()) : aVar.b() == null) && this.f1360g == aVar.h()) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.F.e.d.a
    public F.e.d.a.b f() {
        return this.f1354a;
    }

    @Override // F1.F.e.d.a
    public List g() {
        return this.f1356c;
    }

    @Override // F1.F.e.d.a
    public int h() {
        return this.f1360g;
    }

    public int hashCode() {
        int iHashCode = (this.f1354a.hashCode() ^ 1000003) * 1000003;
        List list = this.f1355b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f1356c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f1357d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        F.e.d.a.c cVar = this.f1358e;
        int iHashCode5 = (iHashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List list3 = this.f1359f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f1360g;
    }

    @Override // F1.F.e.d.a
    public F.e.d.a.AbstractC0018a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f1354a + ", customAttributes=" + this.f1355b + ", internalKeys=" + this.f1356c + ", background=" + this.f1357d + ", currentProcessDetails=" + this.f1358e + ", appProcessDetails=" + this.f1359f + ", uiOrientation=" + this.f1360g + "}";
    }

    public m(F.e.d.a.b bVar, List list, List list2, Boolean bool, F.e.d.a.c cVar, List list3, int i4) {
        this.f1354a = bVar;
        this.f1355b = list;
        this.f1356c = list2;
        this.f1357d = bool;
        this.f1358e = cVar;
        this.f1359f = list3;
        this.f1360g = i4;
    }
}
