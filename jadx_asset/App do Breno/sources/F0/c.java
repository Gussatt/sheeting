package F0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f1023c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1025b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f1026a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public b f1027b = b.REASON_UNKNOWN;

        public c a() {
            return new c(this.f1026a, this.f1027b);
        }

        public a b(long j4) {
            this.f1026a = j4;
            return this;
        }

        public a c(b bVar) {
            this.f1027b = bVar;
            return this;
        }
    }

    public enum b implements R1.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f1036m;

        b(int i4) {
            this.f1036m = i4;
        }

        @Override // R1.c
        public int a() {
            return this.f1036m;
        }
    }

    public c(long j4, b bVar) {
        this.f1024a = j4;
        this.f1025b = bVar;
    }

    public static a c() {
        return new a();
    }

    public long a() {
        return this.f1024a;
    }

    public b b() {
        return this.f1025b;
    }
}
