package B0;

import B0.s;

/* JADX INFO: loaded from: classes.dex */
public final class i extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f133a;

    public static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public r f134a;

        @Override // B0.s.a
        public s a() {
            return new i(this.f134a);
        }

        @Override // B0.s.a
        public s.a b(r rVar) {
            this.f134a = rVar;
            return this;
        }
    }

    @Override // B0.s
    public r b() {
        return this.f133a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        r rVar = this.f133a;
        r rVarB = ((s) obj).b();
        return rVar == null ? rVarB == null : rVar.equals(rVarB);
    }

    public int hashCode() {
        r rVar = this.f133a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f133a + "}";
    }

    public i(r rVar) {
        this.f133a = rVar;
    }
}
