package F1;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    public static abstract class a {
        public static a b(String str, String str2, String str3, String str4, int i4, z1.f fVar) {
            return new C(str, str2, str3, str4, i4, fVar);
        }

        public abstract String a();

        public abstract int c();

        public abstract z1.f d();

        public abstract String e();

        public abstract String f();

        public abstract String g();
    }

    public static abstract class b {
        public static b c(int i4, String str, int i5, long j4, long j5, boolean z3, int i6, String str2, String str3) {
            return new D(i4, str, i5, j4, j5, z3, i6, str2, str3);
        }

        public abstract int a();

        public abstract int b();

        public abstract long d();

        public abstract boolean e();

        public abstract String f();

        public abstract String g();

        public abstract String h();

        public abstract int i();

        public abstract long j();
    }

    public static abstract class c {
        public static c a(String str, String str2, boolean z3) {
            return new E(str, str2, z3);
        }

        public abstract boolean b();

        public abstract String c();

        public abstract String d();
    }

    public static G b(a aVar, c cVar, b bVar) {
        return new B(aVar, cVar, bVar);
    }

    public abstract a a();

    public abstract b c();

    public abstract c d();
}
