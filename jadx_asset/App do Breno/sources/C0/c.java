package C0;

import C0.o;
import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public final class c extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0.c f455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0.g f456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1661b f457e;

    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f458a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z0.c f460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z0.g f461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C1661b f462e;

        @Override // C0.o.a
        public o a() {
            String str = "";
            if (this.f458a == null) {
                str = " transportContext";
            }
            if (this.f459b == null) {
                str = str + " transportName";
            }
            if (this.f460c == null) {
                str = str + " event";
            }
            if (this.f461d == null) {
                str = str + " transformer";
            }
            if (this.f462e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f458a, this.f459b, this.f460c, this.f461d, this.f462e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C0.o.a
        public o.a b(C1661b c1661b) {
            if (c1661b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f462e = c1661b;
            return this;
        }

        @Override // C0.o.a
        public o.a c(z0.c cVar) {
            if (cVar == null) {
                throw new NullPointerException("Null event");
            }
            this.f460c = cVar;
            return this;
        }

        @Override // C0.o.a
        public o.a d(z0.g gVar) {
            if (gVar == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f461d = gVar;
            return this;
        }

        @Override // C0.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f458a = pVar;
            return this;
        }

        @Override // C0.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f459b = str;
            return this;
        }
    }

    @Override // C0.o
    public C1661b b() {
        return this.f457e;
    }

    @Override // C0.o
    public z0.c c() {
        return this.f455c;
    }

    @Override // C0.o
    public z0.g e() {
        return this.f456d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f453a.equals(oVar.f()) && this.f454b.equals(oVar.g()) && this.f455c.equals(oVar.c()) && this.f456d.equals(oVar.e()) && this.f457e.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // C0.o
    public p f() {
        return this.f453a;
    }

    @Override // C0.o
    public String g() {
        return this.f454b;
    }

    public int hashCode() {
        return ((((((((this.f453a.hashCode() ^ 1000003) * 1000003) ^ this.f454b.hashCode()) * 1000003) ^ this.f455c.hashCode()) * 1000003) ^ this.f456d.hashCode()) * 1000003) ^ this.f457e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f453a + ", transportName=" + this.f454b + ", event=" + this.f455c + ", transformer=" + this.f456d + ", encoding=" + this.f457e + "}";
    }

    public c(p pVar, String str, z0.c cVar, z0.g gVar, C1661b c1661b) {
        this.f453a = pVar;
        this.f454b = str;
        this.f455c = cVar;
        this.f456d = gVar;
        this.f457e = c1661b;
    }
}
