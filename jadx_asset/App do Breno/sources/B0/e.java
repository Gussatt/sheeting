package B0;

import B0.o;

/* JADX INFO: loaded from: classes.dex */
public final class e extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o.b f119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B0.a f120b;

    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public o.b f121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public B0.a f122b;

        @Override // B0.o.a
        public o a() {
            return new e(this.f121a, this.f122b);
        }

        @Override // B0.o.a
        public o.a b(B0.a aVar) {
            this.f122b = aVar;
            return this;
        }

        @Override // B0.o.a
        public o.a c(o.b bVar) {
            this.f121a = bVar;
            return this;
        }
    }

    @Override // B0.o
    public B0.a b() {
        return this.f120b;
    }

    @Override // B0.o
    public o.b c() {
        return this.f119a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.b bVar = this.f119a;
            if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
                B0.a aVar = this.f120b;
                if (aVar != null ? aVar.equals(oVar.b()) : oVar.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        o.b bVar = this.f119a;
        int iHashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        B0.a aVar = this.f120b;
        return iHashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f119a + ", androidClientInfo=" + this.f120b + "}";
    }

    public e(o.b bVar, B0.a aVar) {
        this.f119a = bVar;
        this.f120b = aVar;
    }
}
