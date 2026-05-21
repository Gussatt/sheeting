package F1;

import F1.F;
import java.util.Arrays;

/* JADX INFO: renamed from: F1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0274g extends F.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f1282b;

    /* JADX INFO: renamed from: F1.g$b */
    public static final class b extends F.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f1283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f1284b;

        @Override // F1.F.d.b.a
        public F.d.b a() {
            byte[] bArr;
            String str = this.f1283a;
            if (str != null && (bArr = this.f1284b) != null) {
                return new C0274g(str, bArr);
            }
            StringBuilder sb = new StringBuilder();
            if (this.f1283a == null) {
                sb.append(" filename");
            }
            if (this.f1284b == null) {
                sb.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb));
        }

        @Override // F1.F.d.b.a
        public F.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f1284b = bArr;
            return this;
        }

        @Override // F1.F.d.b.a
        public F.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f1283a = str;
            return this;
        }
    }

    @Override // F1.F.d.b
    public byte[] b() {
        return this.f1282b;
    }

    @Override // F1.F.d.b
    public String c() {
        return this.f1281a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.d.b) {
            F.d.b bVar = (F.d.b) obj;
            if (this.f1281a.equals(bVar.c())) {
                if (Arrays.equals(this.f1282b, bVar instanceof C0274g ? ((C0274g) bVar).f1282b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f1281a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f1282b);
    }

    public String toString() {
        return "File{filename=" + this.f1281a + ", contents=" + Arrays.toString(this.f1282b) + "}";
    }

    public C0274g(String str, byte[] bArr) {
        this.f1281a = str;
        this.f1282b = bArr;
    }
}
