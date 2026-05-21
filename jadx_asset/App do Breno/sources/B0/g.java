package B0;

import B0.q;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f128b;

    public static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f130b;

        @Override // B0.q.a
        public q a() {
            return new g(this.f129a, this.f130b);
        }

        @Override // B0.q.a
        public q.a b(byte[] bArr) {
            this.f129a = bArr;
            return this;
        }

        @Override // B0.q.a
        public q.a c(byte[] bArr) {
            this.f130b = bArr;
            return this;
        }
    }

    @Override // B0.q
    public byte[] b() {
        return this.f127a;
    }

    @Override // B0.q
    public byte[] c() {
        return this.f128b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            boolean z3 = qVar instanceof g;
            if (Arrays.equals(this.f127a, z3 ? ((g) qVar).f127a : qVar.b())) {
                if (Arrays.equals(this.f128b, z3 ? ((g) qVar).f128b : qVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f127a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f128b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f127a) + ", encryptedBlob=" + Arrays.toString(this.f128b) + "}";
    }

    public g(byte[] bArr, byte[] bArr2) {
        this.f127a = bArr;
        this.f128b = bArr2;
    }
}
