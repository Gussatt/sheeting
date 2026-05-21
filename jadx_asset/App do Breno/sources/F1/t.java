package F1;

import F1.F;

/* JADX INFO: loaded from: classes.dex */
public final class t extends F.e.d.a.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f1427d;

    public static final class b extends F.e.d.a.c.AbstractC0029a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1428a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1429b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1430c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1431d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte f1432e;

        @Override // F1.F.e.d.a.c.AbstractC0029a
        public F.e.d.a.c a() {
            String str;
            if (this.f1432e == 7 && (str = this.f1428a) != null) {
                return new t(str, this.f1429b, this.f1430c, this.f1431d);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1428a == null) {
                sb.append(" processName");
            }
            if ((this.f1432e & 1) == 0) {
                sb.append(" pid");
            }
            if ((this.f1432e & 2) == 0) {
                sb.append(" importance");
            }
            if ((this.f1432e & 4) == 0) {
                sb.append(" defaultProcess");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.e.d.a.c.AbstractC0029a
        public F.e.d.a.c.AbstractC0029a b(boolean z3) {
            this.f1431d = z3;
            this.f1432e = (byte) (this.f1432e | 4);
            return this;
        }

        @Override // F1.F.e.d.a.c.AbstractC0029a
        public F.e.d.a.c.AbstractC0029a c(int i4) {
            this.f1430c = i4;
            this.f1432e = (byte) (this.f1432e | 2);
            return this;
        }

        @Override // F1.F.e.d.a.c.AbstractC0029a
        public F.e.d.a.c.AbstractC0029a d(int i4) {
            this.f1429b = i4;
            this.f1432e = (byte) (this.f1432e | 1);
            return this;
        }

        @Override // F1.F.e.d.a.c.AbstractC0029a
        public F.e.d.a.c.AbstractC0029a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null processName");
            }
            this.f1428a = str;
            return this;
        }
    }

    @Override // F1.F.e.d.a.c
    public int b() {
        return this.f1426c;
    }

    @Override // F1.F.e.d.a.c
    public int c() {
        return this.f1425b;
    }

    @Override // F1.F.e.d.a.c
    public String d() {
        return this.f1424a;
    }

    @Override // F1.F.e.d.a.c
    public boolean e() {
        return this.f1427d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.a.c) {
            F.e.d.a.c cVar = (F.e.d.a.c) obj;
            if (this.f1424a.equals(cVar.d()) && this.f1425b == cVar.c() && this.f1426c == cVar.b() && this.f1427d == cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f1424a.hashCode() ^ 1000003) * 1000003) ^ this.f1425b) * 1000003) ^ this.f1426c) * 1000003) ^ (this.f1427d ? 1231 : 1237);
    }

    public String toString() {
        return "ProcessDetails{processName=" + this.f1424a + ", pid=" + this.f1425b + ", importance=" + this.f1426c + ", defaultProcess=" + this.f1427d + "}";
    }

    public t(String str, int i4, int i5, boolean z3) {
        this.f1424a = str;
        this.f1425b = i4;
        this.f1426c = i5;
        this.f1427d = z3;
    }
}
