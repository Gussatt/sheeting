package F1;

import F1.G;

/* JADX INFO: loaded from: classes.dex */
public final class B extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G.a f1054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G.c f1055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G.b f1056c;

    public B(G.a aVar, G.c cVar, G.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f1054a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f1055b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f1056c = bVar;
    }

    @Override // F1.G
    public G.a a() {
        return this.f1054a;
    }

    @Override // F1.G
    public G.b c() {
        return this.f1056c;
    }

    @Override // F1.G
    public G.c d() {
        return this.f1055b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            G g4 = (G) obj;
            if (this.f1054a.equals(g4.a()) && this.f1055b.equals(g4.d()) && this.f1056c.equals(g4.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f1054a.hashCode() ^ 1000003) * 1000003) ^ this.f1055b.hashCode()) * 1000003) ^ this.f1056c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f1054a + ", osData=" + this.f1055b + ", deviceData=" + this.f1056c + "}";
    }
}
