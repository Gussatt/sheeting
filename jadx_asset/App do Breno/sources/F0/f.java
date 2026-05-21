package F0;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f1047c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1049b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1050a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1051b = 0;

        public f a() {
            return new f(this.f1050a, this.f1051b);
        }

        public a b(long j4) {
            this.f1051b = j4;
            return this;
        }

        public a c(long j4) {
            this.f1050a = j4;
            return this;
        }
    }

    public f(long j4, long j5) {
        this.f1048a = j4;
        this.f1049b = j5;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f1049b;
    }

    public long b() {
        return this.f1048a;
    }
}
