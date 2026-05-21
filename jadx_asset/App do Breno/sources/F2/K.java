package F2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f1612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final K f1613o = new K("PLATFORM_ENCODED", 0, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final K f1614p = new K("JSON_ENCODED", 1, 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final K f1615q = new K("UNEXPECTED_STRING", 2, 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ K[] f1616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ Q2.a f1617s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f1618m;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final K a(int i4) {
            for (K k4 : K.values()) {
                if (k4.f() == i4) {
                    return k4;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        K[] kArrD = d();
        f1616r = kArrD;
        f1617s = Q2.b.a(kArrD);
        f1612n = new a(null);
    }

    public K(String str, int i4, int i5) {
        this.f1618m = i5;
    }

    public static final /* synthetic */ K[] d() {
        return new K[]{f1613o, f1614p, f1615q};
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f1616r.clone();
    }

    public final int f() {
        return this.f1618m;
    }
}
