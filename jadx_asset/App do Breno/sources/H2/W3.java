package H2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class W3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f1914n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final W3 f1915o = new W3("DATE_INVALID", 0, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final W3 f1916p = new W3("EXPIRED", 1, 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final W3 f1917q = new W3("ID_MISMATCH", 2, 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final W3 f1918r = new W3("INVALID", 3, 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final W3 f1919s = new W3("NOT_YET_VALID", 4, 4);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final W3 f1920t = new W3("UNTRUSTED", 5, 5);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final W3 f1921u = new W3("UNKNOWN", 6, 6);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ W3[] f1922v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ Q2.a f1923w;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1924m;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final W3 a(int i4) {
            for (W3 w32 : W3.values()) {
                if (w32.f() == i4) {
                    return w32;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        W3[] w3ArrD = d();
        f1922v = w3ArrD;
        f1923w = Q2.b.a(w3ArrD);
        f1914n = new a(null);
    }

    public W3(String str, int i4, int i5) {
        this.f1924m = i5;
    }

    public static final /* synthetic */ W3[] d() {
        return new W3[]{f1915o, f1916p, f1917q, f1918r, f1919s, f1920t, f1921u};
    }

    public static W3 valueOf(String str) {
        return (W3) Enum.valueOf(W3.class, str);
    }

    public static W3[] values() {
        return (W3[]) f1922v.clone();
    }

    public final int f() {
        return this.f1924m;
    }
}
