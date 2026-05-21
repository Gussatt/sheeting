package D0;

import D0.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterable f838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f839b;

    public static final class b extends f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Iterable f840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f841b;

        @Override // D0.f.a
        public f a() {
            String str = "";
            if (this.f840a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new a(this.f840a, this.f841b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // D0.f.a
        public f.a b(Iterable iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f840a = iterable;
            return this;
        }

        @Override // D0.f.a
        public f.a c(byte[] bArr) {
            this.f841b = bArr;
            return this;
        }
    }

    @Override // D0.f
    public Iterable b() {
        return this.f838a;
    }

    @Override // D0.f
    public byte[] c() {
        return this.f839b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f838a.equals(fVar.b())) {
                if (Arrays.equals(this.f839b, fVar instanceof a ? ((a) fVar).f839b : fVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f838a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f839b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f838a + ", extras=" + Arrays.toString(this.f839b) + "}";
    }

    public a(Iterable iterable, byte[] bArr) {
        this.f838a = iterable;
        this.f839b = bArr;
    }
}
