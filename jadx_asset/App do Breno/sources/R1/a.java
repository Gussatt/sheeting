package R1;

import R1.d;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d.a f3331b = d.a.DEFAULT;

    /* JADX INFO: renamed from: R1.a$a, reason: collision with other inner class name */
    public static final class C0069a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f3332a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d.a f3333b;

        public C0069a(int i4, d.a aVar) {
            this.f3332a = i4;
            this.f3333b = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f3332a == dVar.tag() && this.f3333b.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f3332a) + (this.f3333b.hashCode() ^ 2041407134);
        }

        @Override // R1.d
        public d.a intEncoding() {
            return this.f3333b;
        }

        @Override // R1.d
        public int tag() {
            return this.f3332a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f3332a + "intEncoding=" + this.f3333b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0069a(this.f3330a, this.f3331b);
    }

    public a c(int i4) {
        this.f3330a = i4;
        return this;
    }
}
