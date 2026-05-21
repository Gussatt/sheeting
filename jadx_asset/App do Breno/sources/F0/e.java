package F0;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f1042c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1044b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1045a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f1046b = 0;

        public e a() {
            return new e(this.f1045a, this.f1046b);
        }

        public a b(long j4) {
            this.f1045a = j4;
            return this;
        }

        public a c(long j4) {
            this.f1046b = j4;
            return this;
        }
    }

    public e(long j4, long j5) {
        this.f1043a = j4;
        this.f1044b = j5;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f1043a;
    }

    public long b() {
        return this.f1044b;
    }
}
