package H2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f1880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final U f1881o = new U("DEBUG", 0, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final U f1882p = new U("ERROR", 1, 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final U f1883q = new U("LOG", 2, 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final U f1884r = new U("TIP", 3, 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final U f1885s = new U("WARNING", 4, 4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final U f1886t = new U("UNKNOWN", 5, 5);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ U[] f1887u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Q2.a f1888v;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1889m;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final U a(int i4) {
            for (U u4 : U.values()) {
                if (u4.f() == i4) {
                    return u4;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        U[] uArrD = d();
        f1887u = uArrD;
        f1888v = Q2.b.a(uArrD);
        f1880n = new a(null);
    }

    public U(String str, int i4, int i5) {
        this.f1889m = i5;
    }

    public static final /* synthetic */ U[] d() {
        return new U[]{f1881o, f1882p, f1883q, f1884r, f1885s, f1886t};
    }

    public static U valueOf(String str) {
        return (U) Enum.valueOf(U.class, str);
    }

    public static U[] values() {
        return (U[]) f1887u.clone();
    }

    public final int f() {
        return this.f1889m;
    }
}
