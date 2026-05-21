package C0;

import C0.p;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class d extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0.e f465c;

    public static final class b extends p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public z0.e f468c;

        @Override // C0.p.a
        public p a() {
            String str = "";
            if (this.f466a == null) {
                str = " backendName";
            }
            if (this.f468c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new d(this.f466a, this.f467b, this.f468c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C0.p.a
        public p.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f466a = str;
            return this;
        }

        @Override // C0.p.a
        public p.a c(byte[] bArr) {
            this.f467b = bArr;
            return this;
        }

        @Override // C0.p.a
        public p.a d(z0.e eVar) {
            if (eVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f468c = eVar;
            return this;
        }
    }

    @Override // C0.p
    public String b() {
        return this.f463a;
    }

    @Override // C0.p
    public byte[] c() {
        return this.f464b;
    }

    @Override // C0.p
    public z0.e d() {
        return this.f465c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f463a.equals(pVar.b())) {
                if (Arrays.equals(this.f464b, pVar instanceof d ? ((d) pVar).f464b : pVar.c()) && this.f465c.equals(pVar.d())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f463a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f464b)) * 1000003) ^ this.f465c.hashCode();
    }

    public d(String str, byte[] bArr, z0.e eVar) {
        this.f463a = str;
        this.f464b = bArr;
        this.f465c = eVar;
    }
}
